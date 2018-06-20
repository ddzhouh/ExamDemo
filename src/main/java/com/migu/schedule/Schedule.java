package com.migu.schedule;



import java.util.Arrays;
import java.util.List;

import com.migu.schedule.constants.ReturnCodeKeys;
import com.migu.schedule.info.TaskInfo;

/*
*类名和方法不能修改
 */
public class Schedule {

    TaskInfo taskinfo = new TaskInfo();
    int nodelist[] = null;
    int tasklist[] = null;
    int consumptionlist[] = null;
    public int init() {
    	try{
    		taskinfo.setNodeId(0);
    		taskinfo.setTaskId(0);
    		return ReturnCodeKeys.E001;
    	}
    	catch(Exception e){
    		return -1;
    	}
    }

int returns = 0;
    public int registerNode(int nodeId) {
        // TODO 方法未实现
    	try{
    		if (nodeId<0||nodeId==0)
    		{
    			return ReturnCodeKeys.E004;
    		}
    		else{
    			for(int i=0;i<nodelist.length;i++){
    				if(nodeId==nodelist[i]){
    					return ReturnCodeKeys.E005;
    				}else{
    					if (i==nodelist.length-1&&nodeId!=nodelist[i]){
    						nodelist[i+1]=nodeId;
    						return ReturnCodeKeys.E003;
    					}
    				}
    			}
    		}
    	}
    	catch(Exception e){
    		return -1;
    	}
    	finally{
    		if (nodeId<0||nodeId==0)
    		{
    			return ReturnCodeKeys.E004;
    		}else{
    			int i= nodelist.length-1;
    			if (nodelist[i]==nodeId&&nodelist[i-1]!=nodeId){
    				return ReturnCodeKeys.E003;
    			}else {
    				return ReturnCodeKeys.E005;
    			}
    		}
    	}
    	 
    }

    public int unregisterNode(int nodeId) {
        // TODO 方法未实现
    	try{
    		if (nodeId<0||nodeId==0)
    		{
    			return ReturnCodeKeys.E004;
    		}
    		else{
    			for(int i = 0;i<nodelist.length;i++){
    				if (nodelist[i]==nodeId){
    					nodelist[i]=-1;
    					Arrays.sort(nodelist);
    					int temp = 0;
    					for(int j=0;j<nodelist.length-1;j++){
    						nodelist[i]=nodelist[i+1];
    					}
    					nodelist= Arrays.copyOf(nodelist, nodelist.length-1);
    					return ReturnCodeKeys.E006;
    				}else{
    					if (i==nodelist.length-1&&nodelist[i-1]!=nodeId){
    						return ReturnCodeKeys.E007;
    					}
    				}
    			}
    		}
		}catch(Exception e){
    		return -1;

		}finally{
			if (nodeId<0||nodeId==0)
    		{
    			return ReturnCodeKeys.E004;
    		}
    		else{
    			int j=0;
    			if ( j==nodelist.length-1&&nodelist[j-1]!=nodeId){
					return ReturnCodeKeys.E007;
				}else{
					return ReturnCodeKeys.E006;

				}
    		}
		}
    	
    }


    public int addTask(int taskId, int consumption) {
        // TODO 方法未实现
    	try{
    		if (taskId<0||taskId==0){
    			return ReturnCodeKeys.E009;
    		}else{
    			for(int i=0;i<tasklist.length;i++){
    				if(taskId==tasklist[i]){
    					return ReturnCodeKeys.E010;
    				}else{
    					if (i==tasklist.length-1&&taskId!=tasklist[i]){
    						tasklist[i+1]=taskId;
    						consumptionlist[i+1]=consumption;
    						return ReturnCodeKeys.E008;
    					}
    				}
    			}
    		}
    	}catch(Exception e){
    		return -1;
    	}
    	finally{
    		if (taskId<0||taskId==0)
    		{
    			return ReturnCodeKeys.E009;
    		}else{
    			int i= tasklist.length-1;
    			if (tasklist[i]==taskId&&tasklist[i-1]!=taskId){
    				return ReturnCodeKeys.E008;
    			}else {
    				return ReturnCodeKeys.E010;
    			}
    		}
    	}
    }


    public int deleteTask(int taskId) {
        // TODO 方法未实现
    	try{
    		if (taskId<0||taskId==0)
    		{
    			return ReturnCodeKeys.E009;
    		}else{
    			for(int i = 0;i<tasklist.length;i++){
    				if (tasklist[i]==taskId){
    					tasklist[i]=-1;
    					Arrays.sort(tasklist);
    					int temp = 0;
    					for(int j=0;j<tasklist.length-1;j++){
    						tasklist[i]=tasklist[i+1];
    					}
    					tasklist= Arrays.copyOf(tasklist, tasklist.length-1);
    					return ReturnCodeKeys.E011;
    				}else{
    					if (i==tasklist.length-1&&tasklist[i-1]!=taskId){
    						return ReturnCodeKeys.E012;
    					}
    				}
    			}
    		}
    	}catch(Exception e){
    		return -1;
    	}finally{
    		if (taskId<0||taskId==0)
    		{
    			return ReturnCodeKeys.E009;
    		}
    		else{
    			int j=0;
    			if ( j==tasklist.length-1&&tasklist[j-1]!=taskId){
					return ReturnCodeKeys.E012;
				}else{
					return ReturnCodeKeys.E011;

				}
    		}
    	}
    }


    public int scheduleTask(int threshold) {
        // TODO 方法未实现
        return ReturnCodeKeys.E000;
    }


    public int queryTaskStatus(List<TaskInfo> tasks) {
        // TODO 方法未实现
        return ReturnCodeKeys.E000;
    }

}
