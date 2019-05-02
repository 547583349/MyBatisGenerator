package com.wangyi;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;

/**
 * Created by huangboying on 2019/5/1.
 */
public class MyElasticJob implements SimpleJob {

    @Override
    public void execute(ShardingContext context) {
        switch (context.getShardingItem()) {
            case 0:
                // do something by sharding item 0
                System.out.println("我要跟罗舒瑜在一起一辈子9");
                break;
            case 1:
                System.out.println("我要跟罗舒瑜在一起一辈子99");
                break;
            case 2:
                System.out.println("我要跟罗舒瑜在一起一辈子999");
                break;
        }
    }
}
