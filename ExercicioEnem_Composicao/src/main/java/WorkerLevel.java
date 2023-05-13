public enum WorkerLevel {

     JUNIOR(1),
     MID_LEVEL(2),
     SENIOR(3);

    private int code;

    WorkerLevel (int code){
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}


