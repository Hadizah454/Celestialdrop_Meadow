//super class
public class Occupation{
    String job;

    public Occupation(String job){
        this.job = job;

    }

    public String getJob(){
        return job;
    }

    public boolean canBuild(String building){
        if(job.equals("author")){
            if(building.equals("house")){
                return true;
            }else{
                return false;
            }
        }else if(job.equals("baker")){
            if(building.equals("bakery")){
                return true;
            }else{
                return false;
            }
        }else if(job.equals("farmer")){
            if(building.equals("barn")){
                return true;
            }else{
                return false;
            }
        }else if(job.equals("blacksmith")){
            if(building.equals("workshop")){
                return true;
            }else{
                return false;
            }
        }else{
            if(building.equals("house")){
                return true;
            }else{
                return false;
            }
        }
    }

    //what else should this class have in it?




}