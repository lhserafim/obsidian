package com.demo.obsidian;

import com.carfey.ops.job.Context;
import com.carfey.ops.job.SchedulableJob;
import com.carfey.ops.job.param.Configuration;
import com.carfey.ops.job.param.Description;
import com.carfey.ops.job.param.Parameter;
import com.carfey.ops.job.param.Type;
import org.springframework.stereotype.Service;

@Service
@Configuration(knownParameters={
        @Parameter(name="incrementCounter", type= Type.BOOLEAN, defaultValue="true", required=true)
})
@Description("This job is a Spring Service that makes various service calls.")
public class SpringServiceJob implements SchedulableJob {

    @Override
    public void execute(Context context) throws Exception {
        System.out.println("New Job executed!");
    }
}

