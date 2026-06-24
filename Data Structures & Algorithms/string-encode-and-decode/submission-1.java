class Solution {

    public String encode(List<String> strs) {
        if(strs.isEmpty()) return "";
//create a stringbuilder to store the encoded string
        StringBuilder encoded = new StringBuilder();
        for(String s:strs){
//e.g ["cat", "dog"] => 3#cat3#dog=>length of string cat +#+the word cat.
            encoded.append(s.length()).append('#').append(s);
        }
//convert thr encoded word back to string
        return encoded.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded=new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int j=i;
            while(str.charAt(j) != '#'){
//if char at index i is not '#' move to the next index till we get a '#'
                j++;
            }
//store the length of the string from the starting postion till the '#' 
//e.g. 3#cat=>i=0;j[1]=# => str.substring(0,1) : 3 (since the length is specified at the start)
            int length= Integer.parseInt(str.substring(i,j));
                i=j+1;
                j=i+length;
//get the word: str.substring(2,3) => cat
                decoded.add(str.substring(i,j));
//move to the next part of the string
                i=j;
            }
            return decoded;
        
    }
}
