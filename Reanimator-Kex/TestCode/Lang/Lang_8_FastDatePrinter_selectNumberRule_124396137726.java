package org.apache.commons.lang3.time;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.lang.IllegalArgumentException;
import static org.apache.commons.lang3.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class FastDatePrinter_selectNumberRule_124396137726 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term819;
     Object term1037;
     Object term1039;

    public FastDatePrinter_selectNumberRule_124396137726() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term819 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDatePrinter"));
        Object term832 = newInstance(Class.forName("sun.util.calendar.ZoneInfo"));
        long[] term837 = (long[]) newLongArray(143);
        int[] term981 = (int[]) newIntArray(4);
        int[] term986 = (int[]) newIntArray(10);
        Object term1018 = newInstance(Class.forName("java.util.Locale"));
        Object term1019 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term1035 = (Object[]) newArray("org.apache.commons.lang3.time.FastDatePrinter$Rule", 1);
        setField(term819, term819.getClass(), "mPattern", "EGtDIRbSSb");
        setIntField(term832, term832.getClass(), "rawOffset", 3600000);
        setIntField(term832, term832.getClass(), "rawOffsetDiff", 0);
        setIntField(term832, term832.getClass(), "checksum", -1181059505);
        setIntField(term832, term832.getClass(), "dstSavings", 3600000);
        setLongElement(term837, 0, -9048018124800000L);
        setLongElement(term837, 1, -6937421414399967L);
        setLongElement(term837, 2, -6883260825600000L);
        setLongElement(term837, 3, -6813514137599967L);
        setLongElement(term837, 4, -6759014400000000L);
        setLongElement(term837, 5, -6684696575999967L);
        setLongElement(term837, 6, -6630196838400000L);
        setLongElement(term837, 7, -3845755699199967L);
        setLongElement(term837, 8, -3511325491200000L);
        setLongElement(term837, 9, -3459303014399967L);
        setLongElement(term837, 10, -3392416972800000L);
        setLongElement(term837, 11, -3328008191999967L);
        setLongElement(term837, 12, -3263599411200000L);
        setLongElement(term837, 13, -3199190630399967L);
        setLongElement(term837, 14, -3134781849600000L);
        setLongElement(term837, 15, -3057986764799967L);
        setLongElement(term837, 16, -3003840921600000L);
        setLongElement(term837, 17, -2984008089599997L);
        setLongElement(term837, 18, -2954280960000000L);
        setLongElement(term837, 19, -2934477619199967L);
        setLongElement(term837, 20, -2875023360000000L);
        setLongElement(term837, 21, -2805660057599967L);
        setLongElement(term837, 22, -2746205798400000L);
        setLongElement(term837, 23, -2679673651199967L);
        setLongElement(term837, 24, -2617388236800000L);
        setLongElement(term837, 25, 1195116134400033L);
        setLongElement(term837, 26, 1259524915200000L);
        setLongElement(term837, 27, 1326410956800033L);
        setLongElement(term837, 28, 1388342476800000L);
        setLongElement(term837, 29, 1452751257600033L);
        setLongElement(term837, 30, 1517160038400000L);
        setLongElement(term837, 31, 1581568819200033L);
        setLongElement(term837, 32, 1645977600000000L);
        setLongElement(term837, 33, 1710386380800033L);
        setLongElement(term837, 34, 1774795161600000L);
        setLongElement(term837, 35, 1839203942400033L);
        setLongElement(term837, 36, 1906089984000000L);
        setLongElement(term837, 37, 1970498764800033L);
        setLongElement(term837, 38, 2034907545600000L);
        setLongElement(term837, 39, 2099316326400033L);
        setLongElement(term837, 40, 2163725107200000L);
        setLongElement(term837, 41, 2228133888000033L);
        setLongElement(term837, 42, 2292542668800000L);
        setLongElement(term837, 43, 2356951449600033L);
        setLongElement(term837, 44, 2421360230400000L);
        setLongElement(term837, 45, 2485769011200033L);
        setLongElement(term837, 46, 2550177792000000L);
        setLongElement(term837, 47, 2614586572800033L);
        setLongElement(term837, 48, 2681472614400000L);
        setLongElement(term837, 49, 2745881395200033L);
        setLongElement(term837, 50, 2810290176000000L);
        setLongElement(term837, 51, 2874698956800033L);
        setLongElement(term837, 52, 2939107737600000L);
        setLongElement(term837, 53, 3003516518400033L);
        setLongElement(term837, 54, 3067925299200000L);
        setLongElement(term837, 55, 3132334080000033L);
        setLongElement(term837, 56, 3196742860800000L);
        setLongElement(term837, 57, 3261151641600033L);
        setLongElement(term837, 58, 3325560422400000L);
        setLongElement(term837, 59, 3392446464000033L);
        setLongElement(term837, 60, 3466764288000000L);
        setLongElement(term837, 61, 3521264025600033L);
        setLongElement(term837, 62, 3595581849600000L);
        setLongElement(term837, 63, 3650081587200033L);
        setLongElement(term837, 64, 3724399411200000L);
        setLongElement(term837, 65, 3778899148800033L);
        setLongElement(term837, 66, 3855694233600000L);
        setLongElement(term837, 67, 3907716710400033L);
        setLongElement(term837, 68, 3984511795200000L);
        setLongElement(term837, 69, 4036534272000033L);
        setLongElement(term837, 70, 4113329356800000L);
        setLongElement(term837, 71, 4167829094400033L);
        setLongElement(term837, 72, 4242146918400000L);
        setLongElement(term837, 73, 4296646656000033L);
        setLongElement(term837, 74, 4370964480000000L);
        setLongElement(term837, 75, 4425464217600033L);
        setLongElement(term837, 76, 4502259302400000L);
        setLongElement(term837, 77, 4554281779200033L);
        setLongElement(term837, 78, 4631076864000000L);
        setLongElement(term837, 79, 4683099340800033L);
        setLongElement(term837, 80, 4759894425600000L);
        setLongElement(term837, 81, 4811916902400033L);
        setLongElement(term837, 82, 4888711987200000L);
        setLongElement(term837, 83, 4943211724800033L);
        setLongElement(term837, 84, 5017529548800000L);
        setLongElement(term837, 85, 5072029286400033L);
        setLongElement(term837, 86, 5146347110400000L);
        setLongElement(term837, 87, 5200846848000033L);
        setLongElement(term837, 88, 5277641932800000L);
        setLongElement(term837, 89, 5329664409600033L);
        setLongElement(term837, 90, 5406459494400000L);
        setLongElement(term837, 91, 5458481971200033L);
        setLongElement(term837, 92, 5535277056000000L);
        setLongElement(term837, 93, 5589776793600033L);
        setLongElement(term837, 94, 5664094617600000L);
        setLongElement(term837, 95, 5718594355200033L);
        setLongElement(term837, 96, 5792912179200000L);
        setLongElement(term837, 97, 5847411916800033L);
        setLongElement(term837, 98, 5921729740800000L);
        setLongElement(term837, 99, 5976229478400033L);
        setLongElement(term837, 100, 6053024563200000L);
        setLongElement(term837, 101, 6105047040000033L);
        setLongElement(term837, 102, 6181842124800000L);
        setLongElement(term837, 103, 6233864601600033L);
        setLongElement(term837, 104, 6310659686400000L);
        setLongElement(term837, 105, 6365159424000033L);
        setLongElement(term837, 106, 6439477248000000L);
        setLongElement(term837, 107, 6493976985600033L);
        setLongElement(term837, 108, 6568294809600000L);
        setLongElement(term837, 109, 6622794547200033L);
        setLongElement(term837, 110, 6699589632000000L);
        setLongElement(term837, 111, 6751612108800033L);
        setLongElement(term837, 112, 6828407193600000L);
        setLongElement(term837, 113, 6880429670400033L);
        setLongElement(term837, 114, 6957224755200000L);
        setLongElement(term837, 115, 7011724492800033L);
        setLongElement(term837, 116, 7086042316800000L);
        setLongElement(term837, 117, 7140542054400033L);
        setLongElement(term837, 118, 7214859878400000L);
        setLongElement(term837, 119, 7269359616000033L);
        setLongElement(term837, 120, 7343677440000000L);
        setLongElement(term837, 121, 7398177177600033L);
        setLongElement(term837, 122, 7474972262400000L);
        setLongElement(term837, 123, 7526994739200033L);
        setLongElement(term837, 124, 7603789824000000L);
        setLongElement(term837, 125, 7655812300800033L);
        setLongElement(term837, 126, 7732607385600000L);
        setLongElement(term837, 127, 7787107123200033L);
        setLongElement(term837, 128, 7861424947200000L);
        setLongElement(term837, 129, 7915924684800033L);
        setLongElement(term837, 130, 7990242508800000L);
        setLongElement(term837, 131, 8044742246400033L);
        setLongElement(term837, 132, 8121537331200000L);
        setLongElement(term837, 133, 8173559808000033L);
        setLongElement(term837, 134, 8250354892800000L);
        setLongElement(term837, 135, 8302377369600033L);
        setLongElement(term837, 136, 8379172454400000L);
        setLongElement(term837, 137, 8431194931200033L);
        setLongElement(term837, 138, 8507990016000000L);
        setLongElement(term837, 139, 8562489753600033L);
        setLongElement(term837, 140, 8636807577600000L);
        setLongElement(term837, 141, 8691307315200033L);
        setLongElement(term837, 142, 8765625139200000L);
        setField(term832, term832.getClass(), "transitions", term837);
        setIntElement(term981, 0, 3600000);
        setIntElement(term981, 1, 7200000);
        setIntElement(term981, 2, 3600000);
        setField(term832, term832.getClass(), "offsets", term981);
        setIntElement(term986, 0, 2);
        setIntElement(term986, 1, -1);
        setIntElement(term986, 2, 1);
        setIntElement(term986, 3, 3600000);
        setIntElement(term986, 4, 2);
        setIntElement(term986, 5, 9);
        setIntElement(term986, 6, -1);
        setIntElement(term986, 7, 1);
        setIntElement(term986, 8, 3600000);
        setIntElement(term986, 9, 2);
        setField(term832, term832.getClass(), "simpleTimeZoneParams", term986);
        setBooleanField(term832, term832.getClass(), "willGMTOffsetChange", false);
        setBooleanField(term832, term832.getClass(), "dirty", false);
        setField(term832, term832.getClass(), "lastRule", null);
        setField(term832, term832.getClass(), "ID", "Europe/Bratislava");
        setField(term832, term832.getClass(), "zoneId", null);
        setField(term819, term819.getClass(), "mTimeZone", term832);
        setField(term1019, term1019.getClass(), "language", "chr");
        setField(term1019, term1019.getClass(), "script", "");
        setField(term1019, term1019.getClass(), "region", "US");
        setField(term1019, term1019.getClass(), "variant", "");
        setIntField(term1019, term1019.getClass(), "hash", -1361154731);
        setField(term1018, term1018.getClass(), "baseLocale", term1019);
        setField(term1018, term1018.getClass(), "localeExtensions", null);
        setIntField(term1018, term1018.getClass(), "hashCodeValue", -1361154731);
        setField(term1018, term1018.getClass(), "languageTag", null);
        setField(term819, term819.getClass(), "mLocale", term1018);
        setField(term819, term819.getClass(), "mRules", term1035);
        setIntField(term819, term819.getClass(), "mMaxLengthEstimate", -522618178);
        term1037 = new Integer(1134449235);
        term1039 = new Integer(-883034806);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.FastDatePrinter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term1037;
        args[1] = term1039;
        try {
            callMethod(klass, "selectNumberRule", argTypes, term819, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


