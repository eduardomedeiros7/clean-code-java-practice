package chapter02;

import java.util.Date;

public class PronounceableNames {

    class DtaRcrd102{
        private Date genymdhms;
        private Date modymdhms;
        private String pszid = "102";
    }

    class Customer{
        private Date generationTimestamp;
        private Date modificationTimestamp;
        private final String recordId = "102";
    }
}
