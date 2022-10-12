public class Add implements Operate{
    public Double getResult(Double...nums){
        Double sum = 0.0;
        for(Double i:nums){
            sum += i;
        }

        return sum;
    }

}
