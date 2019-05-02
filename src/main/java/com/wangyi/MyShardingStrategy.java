package com.wangyi;

import com.dangdang.ddframe.job.lite.api.strategy.JobInstance;
import com.dangdang.ddframe.job.lite.api.strategy.JobShardingStrategy;

import java.util.List;
import java.util.Map;

/**
 * Created by huangboying on 2019/5/1.
 */
public class MyShardingStrategy implements JobShardingStrategy {
    @Override
    public Map<JobInstance, List<Integer>> sharding(List<JobInstance> list, String s, int i) {
        return null;
    }
}
