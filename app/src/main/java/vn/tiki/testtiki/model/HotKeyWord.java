package vn.tiki.testtiki.model;

public class HotKeyWord {
    public HotKeyWord() {
    }

    private int type;
    private String name;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getName() {
        return modifyName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    private String modifyName(String name)
    {
        if (name!=null&&!name.isEmpty())
        {
            String[] words=name.split("\\s");
            if (words.length==1)
                return name;
            else {
                int totalLength=0;
                String wordUp=words[0];
                String wordDown="";
                for (String word : words) {
                    totalLength = totalLength + word.length();
                    if (!word.equals(words[0]))
                        wordDown=wordDown+" "+word;
                }
                int min=Math.abs(2*words[0].length()-totalLength);

                String tempUp=wordUp;
                for (int i=1;i<words.length;i++) {
                    int sum=0;
                    for (int j=0;j<=i;j++)
                    {
                        sum=sum+words[j].length();
                    }
                    tempUp=tempUp+" "+words[i];
                    String tempDown="";
                    for (int k=i+1;k<words.length;k++)
                    {
                        tempDown=tempDown+" "+words[k];
                    }

                    int abs=Math.abs(2*sum-totalLength);
                    if (min<abs)
                        return wordUp.trim()+"\r\n"+wordDown.trim();
                        else
                    {
                        min=abs;
                        wordDown=tempDown;
                        wordUp=tempUp;
                    }
                }

                return wordUp.trim()+"\r\n"+wordDown.trim();
            }
        }
       return "";
    }


}
