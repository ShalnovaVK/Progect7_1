package com.example.progect7_1;

public class DataLauer {
        private String dataFrom1to2;
        private String dataFrom2to3;

        public DataLauer(){
            this.dataFrom1to2="Данные, передающиеся из первого фрагмента во второй";
            this.dataFrom2to3="Данные, передающиеся из второго фрагмента в третий";
        }

        public DataLauer(String dataFrom1to2,String dataFrom2to3){
            this.dataFrom1to2=dataFrom1to2;
            this.dataFrom2to3=dataFrom2to3;
        }

        public void setDataFrom1to2(String dataFrom1to2) {
            this.dataFrom1to2 = dataFrom1to2;
        }
        public void setDataFrom2to3(String dataFrom2to3) {
            this.dataFrom2to3 = dataFrom2to3;
        }

        public String getDataFrom1to2() {
            return dataFrom1to2;
        }

        public String getDataFrom2to3() {
            return dataFrom2to3;
        }
}
