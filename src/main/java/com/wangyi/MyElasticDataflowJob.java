package com.wangyi;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.dataflow.DataflowJob;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by huangboying on 2019/5/1.
 */
public class MyElasticDataflowJob implements DataflowJob<String> {
    @Override
    public List<String> fetchData(ShardingContext shardingContext) {
        switch (shardingContext.getShardingItem()) {
            case 0:
                // get data from database by sharding item 0
                List<String> data1 = new ArrayList<>();
                data1.add("get data from database by sharding item 0");
                return data1;
            case 1:
                // get data from database by sharding item 1
                List<String> data2 = new ArrayList<>();
                data2.add("get data from database by sharding item 1");
                return data2;
            case 2:
                // get data from database by sharding item 2
                List<String> data3 = new ArrayList<>();
                data3.add("get data from database by sharding item 2");
                return data3;
        }
        return null;
    }

    @Override
    public void processData(ShardingContext shardingContext, List<String> list) {
        int count = 0;
        // process data
        // ...
        for (String string : list) {
            count++;
            System.out.println(string);
            if (count > 10) {
                return;
            }
        }
    }
}