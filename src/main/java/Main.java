import com.dangdang.ddframe.job.config.JobCoreConfiguration;
import com.dangdang.ddframe.job.config.JobRootConfiguration;
import com.dangdang.ddframe.job.config.dataflow.DataflowJobConfiguration;
import com.dangdang.ddframe.job.config.simple.SimpleJobConfiguration;
import com.dangdang.ddframe.job.lite.api.JobScheduler;
import com.dangdang.ddframe.job.lite.config.LiteJobConfiguration;
import com.dangdang.ddframe.job.reg.base.CoordinatorRegistryCenter;
import com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration;
import com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter;
import com.wangyi.MyElasticDataflowJob;
import com.wangyi.MyElasticJob;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by huangboying on 2019/5/1.
 */
public class Main {


    /**
     * 启动job的main方法
     * @param args
     */
    public static void main(String[] args) throws UnknownHostException {
        System.out.println("Start...");
        System.out.println(InetAddress.getLocalHost());
        new JobScheduler(createRegistryCenter(), createSimpleJobConfiguration()).init();
//        new JobScheduler(createRegistryCenter(), createDataflowJobConfiguration()).init();
    }

    private static CoordinatorRegistryCenter createRegistryCenter() {
        CoordinatorRegistryCenter regCenter = new ZookeeperRegistryCenter(
                new ZookeeperConfiguration("127.0.0.1:2181", "new-elastic-job-demo"));
        regCenter.init();
        return regCenter;
    }



    private static LiteJobConfiguration createSimpleJobConfiguration() {
        // 定义作业核心配置（“/”用来指定数值的增量 例如在子表达式（分钟）里的“0/15”表示从第零分钟开始，每十五分钟）
        //在子表达式（分钟）里的“3/20”表示从第三分钟开始，没20分钟（它和“3,23,43”）的含义一样
        JobCoreConfiguration simpleCoreConfig = JobCoreConfiguration.newBuilder("SimpleJobDemo", "0/15 * * * * ?", 10).build();
        // 定义SIMPLE类型配置
        SimpleJobConfiguration simpleJobConfig = new SimpleJobConfiguration(simpleCoreConfig, MyElasticJob.class.getCanonicalName());
        // 定义Lite作业根配置
        JobRootConfiguration simpleJobRootConfig = LiteJobConfiguration.newBuilder(simpleJobConfig).build();

        return (LiteJobConfiguration) simpleJobRootConfig;

    }

    private static LiteJobConfiguration createDataflowJobConfiguration() {
        // 定义作业核心配置
        JobCoreConfiguration dataflowCoreConfig = JobCoreConfiguration.newBuilder("DataflowJob", "0/30 * * * * ?", 10).build();
        // 定义DATAFLOW类型配置
        DataflowJobConfiguration dataflowJobConfig = new DataflowJobConfiguration(dataflowCoreConfig, MyElasticDataflowJob.class.getCanonicalName(), true);
        // 定义Lite作业根配置
        JobRootConfiguration dataflowJobRootConfig = LiteJobConfiguration.newBuilder(dataflowJobConfig).build();

        return (LiteJobConfiguration) dataflowJobRootConfig;
    }
}
