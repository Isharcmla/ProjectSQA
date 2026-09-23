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
import java.lang.NegativeArraySizeException;
import static org.apache.commons.lang3.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FastDatePrinter_format_1910652229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1490;
     Object term1704;

    public FastDatePrinter_format_1910652229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1490 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDatePrinter"));
        Object term1503 = newInstance(Class.forName("sun.util.calendar.ZoneInfo"));
        long[] term1508 = (long[]) newLongArray(142);
        int[] term1651 = (int[]) newIntArray(4);
        int[] term1656 = (int[]) newIntArray(10);
        Object term1686 = newInstance(Class.forName("java.util.Locale"));
        Object term1687 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term1702 = (Object[]) newArray("org.apache.commons.lang3.time.FastDatePrinter$Rule", 6);
        setField(term1490, term1490.getClass(), "mPattern", "NRdvgJlhkX");
        setIntField(term1503, term1503.getClass(), "rawOffset", -32400000);
        setIntField(term1503, term1503.getClass(), "rawOffsetDiff", 0);
        setIntField(term1503, term1503.getClass(), "checksum", 561347644);
        setIntField(term1503, term1503.getClass(), "dstSavings", 3600000);
        setLongElement(term1508, 0, -9048018124799999L);
        setLongElement(term1508, 1, -8965954211840000L);
        setLongElement(term1508, 2, -3605313945599950L);
        setLongElement(term1508, 3, -3135003033600000L);
        setLongElement(term1508, 4, -87957503999950L);
        setLongElement(term1508, 5, -23563468800000L);
        setLongElement(term1508, 6, 40860057600050L);
        setLongElement(term1508, 7, 105254092800000L);
        setLongElement(term1508, 8, 169677619200050L);
        setLongElement(term1508, 9, 236548915200000L);
        setLongElement(term1508, 10, 300972441600050L);
        setLongElement(term1508, 11, 365366476800000L);
        setLongElement(term1508, 12, 429790003200050L);
        setLongElement(term1508, 13, 494184038400000L);
        setLongElement(term1508, 14, 518971392000050L);
        setLongElement(term1508, 15, 623001600000000L);
        setLongElement(term1508, 16, 665129779200050L);
        setLongElement(term1508, 17, 751819161600000L);
        setLongElement(term1508, 18, 816242688000050L);
        setLongElement(term1508, 19, 883113984000000L);
        setLongElement(term1508, 20, 945060249600050L);
        setLongElement(term1508, 21, 1011931545600000L);
        setLongElement(term1508, 22, 1076355072000050L);
        setLongElement(term1508, 23, 1140749107200000L);
        setLongElement(term1508, 24, 1205172633600050L);
        setLongElement(term1508, 25, 1269566668800000L);
        setLongElement(term1508, 26, 1333990195200050L);
        setLongElement(term1508, 27, 1398384230400000L);
        setLongElement(term1508, 28, 1462807756800050L);
        setLongElement(term1508, 29, 1527201792000000L);
        setLongElement(term1508, 30, 1591625318400050L);
        setLongElement(term1508, 31, 1658496614400000L);
        setLongElement(term1508, 32, 1720442880000050L);
        setLongElement(term1508, 33, 1787314176000000L);
        setLongElement(term1508, 34, 1851737702400050L);
        setLongElement(term1508, 35, 1916131737600000L);
        setLongElement(term1508, 36, 1980555264000050L);
        setLongElement(term1508, 37, 2044949299200000L);
        setLongElement(term1508, 38, 2109372825600050L);
        setLongElement(term1508, 39, 2173766860800000L);
        setLongElement(term1508, 40, 2230758604800050L);
        setLongElement(term1508, 41, 2302584422400000L);
        setLongElement(term1508, 42, 2359576166400050L);
        setLongElement(term1508, 43, 2433879244800000L);
        setLongElement(term1508, 44, 2488393728000050L);
        setLongElement(term1508, 45, 2562696806400000L);
        setLongElement(term1508, 46, 2617211289600050L);
        setLongElement(term1508, 47, 2691514368000000L);
        setLongElement(term1508, 48, 2748506112000050L);
        setLongElement(term1508, 49, 2820331929600000L);
        setLongElement(term1508, 50, 2877323673600050L);
        setLongElement(term1508, 51, 2949149491200000L);
        setLongElement(term1508, 52, 3006141235200050L);
        setLongElement(term1508, 53, 3080444313600000L);
        setLongElement(term1508, 54, 3134958796800050L);
        setLongElement(term1508, 55, 3209261875200000L);
        setLongElement(term1508, 56, 3263776358400050L);
        setLongElement(term1508, 57, 3338079436800000L);
        setLongElement(term1508, 58, 3395071180800050L);
        setLongElement(term1508, 59, 3466896998400000L);
        setLongElement(term1508, 60, 3523888742400050L);
        setLongElement(term1508, 61, 3595714560000000L);
        setLongElement(term1508, 62, 3652706304000050L);
        setLongElement(term1508, 63, 3724532121600000L);
        setLongElement(term1508, 64, 3781523865600050L);
        setLongElement(term1508, 65, 3855826944000000L);
        setLongElement(term1508, 66, 3910341427200050L);
        setLongElement(term1508, 67, 3984644505600000L);
        setLongElement(term1508, 68, 4039158988800050L);
        setLongElement(term1508, 69, 4113462067200000L);
        setLongElement(term1508, 70, 4170453811200050L);
        setLongElement(term1508, 71, 4242279628800000L);
        setLongElement(term1508, 72, 4299271372800050L);
        setLongElement(term1508, 73, 4371097190400000L);
        setLongElement(term1508, 74, 4428088934400050L);
        setLongElement(term1508, 75, 4502392012800000L);
        setLongElement(term1508, 76, 4556906496000050L);
        setLongElement(term1508, 77, 4631209574400000L);
        setLongElement(term1508, 78, 4685724057600050L);
        setLongElement(term1508, 79, 4760027136000000L);
        setLongElement(term1508, 80, 4807109836800050L);
        setLongElement(term1508, 81, 4891321958400000L);
        setLongElement(term1508, 82, 4935927398400050L);
        setLongElement(term1508, 83, 5020139520000000L);
        setLongElement(term1508, 84, 5064744960000050L);
        setLongElement(term1508, 85, 5148957081600000L);
        setLongElement(term1508, 86, 5196039782400050L);
        setLongElement(term1508, 87, 5280251904000000L);
        setLongElement(term1508, 88, 5324857344000050L);
        setLongElement(term1508, 89, 5409069465600000L);
        setLongElement(term1508, 90, 5453674905600050L);
        setLongElement(term1508, 91, 5537887027200000L);
        setLongElement(term1508, 92, 5582492467200050L);
        setLongElement(term1508, 93, 5666704588800000L);
        setLongElement(term1508, 94, 5711310028800050L);
        setLongElement(term1508, 95, 5795522150400000L);
        setLongElement(term1508, 96, 5840127590400050L);
        setLongElement(term1508, 97, 5924339712000000L);
        setLongElement(term1508, 98, 5971422412800050L);
        setLongElement(term1508, 99, 6055634534400000L);
        setLongElement(term1508, 100, 6100239974400050L);
        setLongElement(term1508, 101, 6184452096000000L);
        setLongElement(term1508, 102, 6229057536000050L);
        setLongElement(term1508, 103, 6313269657600000L);
        setLongElement(term1508, 104, 6357875097600050L);
        setLongElement(term1508, 105, 6442087219200000L);
        setLongElement(term1508, 106, 6486692659200050L);
        setLongElement(term1508, 107, 6570904780800000L);
        setLongElement(term1508, 108, 6617987481600050L);
        setLongElement(term1508, 109, 6702199603200000L);
        setLongElement(term1508, 110, 6746805043200050L);
        setLongElement(term1508, 111, 6831017164800000L);
        setLongElement(term1508, 112, 6875622604800050L);
        setLongElement(term1508, 113, 6959834726400000L);
        setLongElement(term1508, 114, 7004440166400050L);
        setLongElement(term1508, 115, 7088652288000000L);
        setLongElement(term1508, 116, 7133257728000050L);
        setLongElement(term1508, 117, 7217469849600000L);
        setLongElement(term1508, 118, 7262075289600050L);
        setLongElement(term1508, 119, 7346287411200000L);
        setLongElement(term1508, 120, 7393370112000050L);
        setLongElement(term1508, 121, 7477582233600000L);
        setLongElement(term1508, 122, 7522187673600050L);
        setLongElement(term1508, 123, 7606399795200000L);
        setLongElement(term1508, 124, 7651005235200050L);
        setLongElement(term1508, 125, 7735217356800000L);
        setLongElement(term1508, 126, 7779822796800050L);
        setLongElement(term1508, 127, 7864034918400000L);
        setLongElement(term1508, 128, 7908640358400050L);
        setLongElement(term1508, 129, 7992852480000000L);
        setLongElement(term1508, 130, 8039935180800050L);
        setLongElement(term1508, 131, 8124147302400000L);
        setLongElement(term1508, 132, 8168752742400050L);
        setLongElement(term1508, 133, 8252964864000000L);
        setLongElement(term1508, 134, 8297570304000050L);
        setLongElement(term1508, 135, 8381782425600000L);
        setLongElement(term1508, 136, 8426387865600050L);
        setLongElement(term1508, 137, 8510599987200000L);
        setLongElement(term1508, 138, 8555205427200050L);
        setLongElement(term1508, 139, 8639417548800000L);
        setLongElement(term1508, 140, 8684022988800050L);
        setLongElement(term1508, 141, 8768235110400000L);
        setField(term1503, term1503.getClass(), "transitions", term1508);
        setIntElement(term1651, 0, -32400000);
        setIntElement(term1651, 1, -33535000);
        setIntElement(term1651, 2, -28800000);
        setIntElement(term1651, 3, 3600000);
        setField(term1503, term1503.getClass(), "offsets", term1651);
        setIntElement(term1656, 0, 2);
        setIntElement(term1656, 1, 8);
        setIntElement(term1656, 2, -1);
        setIntElement(term1656, 3, 7200000);
        setIntElement(term1656, 5, 10);
        setIntElement(term1656, 6, 1);
        setIntElement(term1656, 7, -1);
        setIntElement(term1656, 8, 7200000);
        setField(term1503, term1503.getClass(), "simpleTimeZoneParams", term1656);
        setBooleanField(term1503, term1503.getClass(), "willGMTOffsetChange", false);
        setBooleanField(term1503, term1503.getClass(), "dirty", false);
        setField(term1503, term1503.getClass(), "lastRule", null);
        setField(term1503, term1503.getClass(), "ID", "America/Yakutat");
        setField(term1503, term1503.getClass(), "zoneId", null);
        setField(term1490, term1490.getClass(), "mTimeZone", term1503);
        setField(term1687, term1687.getClass(), "language", "fr");
        setField(term1687, term1687.getClass(), "script", "");
        setField(term1687, term1687.getClass(), "region", "CI");
        setField(term1687, term1687.getClass(), "variant", "");
        setIntField(term1687, term1687.getClass(), "hash", 97661966);
        setField(term1686, term1686.getClass(), "baseLocale", term1687);
        setField(term1686, term1686.getClass(), "localeExtensions", null);
        setIntField(term1686, term1686.getClass(), "hashCodeValue", 97661966);
        setField(term1686, term1686.getClass(), "languageTag", null);
        setField(term1490, term1490.getClass(), "mLocale", term1686);
        setField(term1490, term1490.getClass(), "mRules", term1702);
        setIntField(term1490, term1490.getClass(), "mMaxLengthEstimate", -117576464);
        term1704 = newInstance(Class.forName("java.util.Date"));
        setLongField(term1704, term1704.getClass(), "fastTime", 1345889412244L);
        setField(term1704, term1704.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.FastDatePrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term1704;
        try {
            callMethod(klass, "format", argTypes, term1490, args);
            assertTrue(false);
        }
        catch (NegativeArraySizeException e) {
        }

    }

};


