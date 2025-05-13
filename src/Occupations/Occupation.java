public class Occupation{
    private String job;

    /**
     * Creates a new Occupation with the specified job
     * @param job - the name of the job
     */
    public Occupation(String job){
        this.job = job;

    }

    /**
     * returns the name of the job
     * @return
     */
    public String getJob(){
        return job;
    }

}