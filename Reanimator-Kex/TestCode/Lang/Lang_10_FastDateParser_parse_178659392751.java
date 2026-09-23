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
import java.lang.OutOfMemoryError;
import static org.apache.commons.lang3.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.ArrayList;
import java.lang.Integer;

public class FastDateParser_parse_178659392751 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5893;

    public FastDateParser_parse_178659392751() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5984 = new HashMap();
        ArrayList term6045 = new ArrayList();
        Integer term6071 = new Integer(-6029667);
        term5893 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateParser"));
        Object term5906 = newInstance(Class.forName("sun.util.calendar.ZoneInfo"));
        long[] term5911 = (long[]) newLongArray(3);
        int[] term5915 = (int[]) newIntArray(2);
        Object term5932 = newInstance(Class.forName("java.util.Locale"));
        Object term5933 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object term5947 = newInstance(Class.forName("java.util.regex.Pattern"));
        Object term5975 = newInstance(Class.forName("java.util.regex.Pattern$Node"));
        Object term5976 = newInstance(Class.forName("java.util.regex.Pattern$Node"));
        Object term5977 = newInstance(Class.forName("java.util.regex.Pattern$Node"));
        int[] term5978 = (int[]) newIntArray(5);
        Object[] term5994 = (Object[]) newArray("java.util.regex.Pattern$GroupHead", 9);
        Object term5995 = newInstance(Class.forName("java.util.regex.Pattern$GroupHead"));
        Object term5997 = newInstance(Class.forName("java.util.regex.Pattern$GroupTail"));
        Object term6000 = newInstance(Class.forName("java.util.regex.Pattern$Node"));
        Object term6001 = newInstance(Class.forName("java.util.regex.Pattern$GroupHead"));
        Object term6003 = newInstance(Class.forName("java.util.regex.Pattern$GroupTail"));
        Object term6006 = newInstance(Class.forName("java.util.regex.Pattern$Node"));
        Object term6007 = newInstance(Class.forName("java.util.regex.Pattern$GroupHead"));
        Object term6009 = newInstance(Class.forName("java.util.regex.Pattern$GroupTail"));
        Object term6012 = newInstance(Class.forName("java.util.regex.Pattern$Node"));
        Object term6013 = newInstance(Class.forName("java.util.regex.Pattern$GroupHead"));
        Object term6015 = newInstance(Class.forName("java.util.regex.Pattern$GroupTail"));
        Object term6018 = newInstance(Class.forName("java.util.regex.Pattern$Node"));
        Object term6019 = newInstance(Class.forName("java.util.regex.Pattern$GroupHead"));
        Object term6021 = newInstance(Class.forName("java.util.regex.Pattern$GroupTail"));
        Object term6024 = newInstance(Class.forName("java.util.regex.Pattern$Node"));
        Object term6025 = newInstance(Class.forName("java.util.regex.Pattern$GroupHead"));
        Object term6027 = newInstance(Class.forName("java.util.regex.Pattern$GroupTail"));
        Object term6030 = newInstance(Class.forName("java.util.regex.Pattern$GroupHead"));
        Object term6032 = newInstance(Class.forName("java.util.regex.Pattern$GroupTail"));
        Object term6035 = newInstance(Class.forName("java.util.regex.Pattern$GroupHead"));
        Object term6037 = newInstance(Class.forName("java.util.regex.Pattern$GroupTail"));
        Object term6040 = newInstance(Class.forName("java.util.regex.Pattern$GroupHead"));
        Object term6042 = newInstance(Class.forName("java.util.regex.Pattern$GroupTail"));
        int[] term6051 = (int[]) newIntArray(8);
        Object[] term6065 = (Object[]) newArray("org.apache.commons.lang3.time.FastDateParser$Strategy", 9);
        Object term6067 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object[] term6068 = (Object[]) newArray("java.util.concurrent.ConcurrentHashMap$Node", 16);
        Object term6069 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap$Node"));
        Object[] term6073 = (Object[]) newArray("org.apache.commons.lang3.time.FastDateParser$KeyValue", 7);
        setField(term5893, term5893.getClass(), "pattern", "BKLfkLiZTH");
        setIntField(term5906, term5906.getClass(), "rawOffset", 14400000);
        setIntField(term5906, term5906.getClass(), "rawOffsetDiff", 0);
        setIntField(term5906, term5906.getClass(), "checksum", 193743799);
        setIntField(term5906, term5906.getClass(), "dstSavings", 0);
        setLongElement(term5911, 0, -9048018124799999L);
        setLongElement(term5911, 1, -6463227789312000L);
        setLongElement(term5911, 2, 8660444774400000L);
        setField(term5906, term5906.getClass(), "transitions", term5911);
        setIntElement(term5915, 0, 14400000);
        setIntElement(term5915, 1, 13272000);
        setField(term5906, term5906.getClass(), "offsets", term5915);
        setField(term5906, term5906.getClass(), "simpleTimeZoneParams", null);
        setBooleanField(term5906, term5906.getClass(), "willGMTOffsetChange", false);
        setBooleanField(term5906, term5906.getClass(), "dirty", false);
        setField(term5906, term5906.getClass(), "lastRule", null);
        setField(term5906, term5906.getClass(), "ID", "Asia/Dubai");
        setField(term5906, term5906.getClass(), "zoneId", null);
        setField(term5893, term5893.getClass(), "timeZone", term5906);
        setField(term5933, term5933.getClass(), "language", "mzn");
        setField(term5933, term5933.getClass(), "script", "");
        setField(term5933, term5933.getClass(), "region", "");
        setField(term5933, term5933.getClass(), "variant", "");
        setIntField(term5933, term5933.getClass(), "hash", -1058443265);
        setField(term5932, term5932.getClass(), "baseLocale", term5933);
        setField(term5932, term5932.getClass(), "localeExtensions", null);
        setIntField(term5932, term5932.getClass(), "hashCodeValue", -1058443265);
        setField(term5932, term5932.getClass(), "languageTag", null);
        setField(term5893, term5893.getClass(), "locale", term5932);
        setField(term5947, term5947.getClass(), "pattern", "SPpkrGcPRr");
        setIntField(term5947, term5947.getClass(), "flags", -828982065);
        setIntField(term5947, term5947.getClass(), "flags0", 1221443226);
        setBooleanField(term5947, term5947.getClass(), "compiled", false);
        setField(term5947, term5947.getClass(), "normalizedPattern", "sEccwbJKYE");
        setField(term5976, term5976.getClass(), "next", null);
        setField(term5975, term5975.getClass(), "next", term5976);
        setField(term5947, term5947.getClass(), "root", term5975);
        setField(term5977, term5977.getClass(), "next", term5976);
        setField(term5947, term5947.getClass(), "matchRoot", term5977);
        setIntElement(term5978, 0, 908108726);
        setIntElement(term5978, 1, 1023209512);
        setIntElement(term5978, 2, 1084849225);
        setIntElement(term5978, 3, -1702055571);
        setIntElement(term5978, 4, -944542900);
        setField(term5947, term5947.getClass(), "buffer", term5978);
        setField(term5947, term5947.getClass(), "predicate", null);
        setField(term5947, term5947.getClass(), "namedGroups", term5984);
        setIntField(term5995, term5995.getClass(), "localIndex", 2063762142);
        setIntField(term5997, term5997.getClass(), "localIndex", 1658391716);
        setIntField(term5997, term5997.getClass(), "groupIndex", 2143282300);
        setField(term5997, term5997.getClass(), "next", null);
        setField(term5995, term5995.getClass(), "tail", term5997);
        setField(term6000, term6000.getClass(), "next", term5976);
        setField(term5995, term5995.getClass(), "next", term6000);
        setElement(term5994, 0, term5995);
        setIntField(term6001, term6001.getClass(), "localIndex", 1137624258);
        setIntField(term6003, term6003.getClass(), "localIndex", 977862393);
        setIntField(term6003, term6003.getClass(), "groupIndex", 301401782);
        setField(term6003, term6003.getClass(), "next", null);
        setField(term6001, term6001.getClass(), "tail", term6003);
        setField(term6006, term6006.getClass(), "next", term5976);
        setField(term6001, term6001.getClass(), "next", term6006);
        setElement(term5994, 1, term6001);
        setIntField(term6007, term6007.getClass(), "localIndex", 1988605357);
        setIntField(term6009, term6009.getClass(), "localIndex", 808203320);
        setIntField(term6009, term6009.getClass(), "groupIndex", -544382127);
        setField(term6009, term6009.getClass(), "next", null);
        setField(term6007, term6007.getClass(), "tail", term6009);
        setField(term6012, term6012.getClass(), "next", term5976);
        setField(term6007, term6007.getClass(), "next", term6012);
        setElement(term5994, 2, term6007);
        setIntField(term6013, term6013.getClass(), "localIndex", -1830198043);
        setIntField(term6015, term6015.getClass(), "localIndex", -439048495);
        setIntField(term6015, term6015.getClass(), "groupIndex", -1849105286);
        setField(term6015, term6015.getClass(), "next", null);
        setField(term6013, term6013.getClass(), "tail", term6015);
        setField(term6018, term6018.getClass(), "next", term5976);
        setField(term6013, term6013.getClass(), "next", term6018);
        setElement(term5994, 3, term6013);
        setIntField(term6019, term6019.getClass(), "localIndex", 1334483645);
        setIntField(term6021, term6021.getClass(), "localIndex", 917513193);
        setIntField(term6021, term6021.getClass(), "groupIndex", 787278105);
        setField(term6021, term6021.getClass(), "next", term6012);
        setField(term6019, term6019.getClass(), "tail", term6021);
        setField(term6024, term6024.getClass(), "next", term5976);
        setField(term6019, term6019.getClass(), "next", term6024);
        setElement(term5994, 4, term6019);
        setIntField(term6025, term6025.getClass(), "localIndex", -2063843486);
        setIntField(term6027, term6027.getClass(), "localIndex", 833762980);
        setIntField(term6027, term6027.getClass(), "groupIndex", 320711637);
        setField(term6027, term6027.getClass(), "next", term5975);
        setField(term6025, term6025.getClass(), "tail", term6027);
        setField(term6025, term6025.getClass(), "next", term6006);
        setElement(term5994, 5, term6025);
        setIntField(term6030, term6030.getClass(), "localIndex", 1241164745);
        setIntField(term6032, term6032.getClass(), "localIndex", 1723148410);
        setIntField(term6032, term6032.getClass(), "groupIndex", -920797484);
        setField(term6032, term6032.getClass(), "next", term6000);
        setField(term6030, term6030.getClass(), "tail", term6032);
        setField(term6030, term6030.getClass(), "next", term5977);
        setElement(term5994, 6, term6030);
        setIntField(term6035, term6035.getClass(), "localIndex", -1631697577);
        setIntField(term6037, term6037.getClass(), "localIndex", 765731371);
        setIntField(term6037, term6037.getClass(), "groupIndex", -1703035419);
        setField(term6037, term6037.getClass(), "next", term5977);
        setField(term6035, term6035.getClass(), "tail", term6037);
        setField(term6035, term6035.getClass(), "next", term6018);
        setElement(term5994, 7, term6035);
        setIntField(term6040, term6040.getClass(), "localIndex", 765766290);
        setIntField(term6042, term6042.getClass(), "localIndex", -1284825282);
        setIntField(term6042, term6042.getClass(), "groupIndex", -1941343035);
        setField(term6042, term6042.getClass(), "next", term6012);
        setField(term6040, term6040.getClass(), "tail", term6042);
        setField(term6040, term6040.getClass(), "next", term6012);
        setElement(term5994, 8, term6040);
        setField(term5947, term5947.getClass(), "groupNodes", term5994);
        setField(term5947, term5947.getClass(), "topClosureNodes", term6045);
        setIntField(term5947, term5947.getClass(), "localTCNCount", 947897214);
        setBooleanField(term5947, term5947.getClass(), "hasGroupRef", true);
        setIntElement(term6051, 0, 1496340209);
        setIntElement(term6051, 1, -1748391876);
        setIntElement(term6051, 2, 43258317);
        setIntElement(term6051, 3, 1707220033);
        setIntElement(term6051, 4, -1792504217);
        setIntElement(term6051, 5, 1824538861);
        setIntElement(term6051, 6, 499519708);
        setIntElement(term6051, 7, 1501165033);
        setField(term5947, term5947.getClass(), "temp", term6051);
        setIntField(term5947, term5947.getClass(), "capturingGroupCount", 510162332);
        setIntField(term5947, term5947.getClass(), "localCount", 888506903);
        setIntField(term5947, term5947.getClass(), "cursor", 200252898);
        setIntField(term5947, term5947.getClass(), "patternLength", -1831826725);
        setBooleanField(term5947, term5947.getClass(), "hasSupplementary", true);
        setField(term5893, term5893.getClass(), "parsePattern", term5947);
        setField(term5893, term5893.getClass(), "strategies", term6065);
        setIntField(term5893, term5893.getClass(), "thisYear", 752152965);
        setIntField(term6069, term6069.getClass(), "hash", 2141389118);
        setField(term6069, term6069.getClass(), "key", term6071);
        setField(term6069, term6069.getClass(), "val", term6073);
        setField(term6069, term6069.getClass(), "next", null);
        setElement(term6068, 14, term6069);
        setField(term6067, term6067.getClass(), "table", term6068);
        setField(term6067, term6067.getClass(), "nextTable", null);
        setLongField(term6067, term6067.getClass(), "baseCount", 1L);
        setIntField(term6067, term6067.getClass(), "sizeCtl", 12);
        setIntField(term6067, term6067.getClass(), "transferIndex", 0);
        setIntField(term6067, term6067.getClass(), "cellsBusy", 0);
        setField(term6067, term6067.getClass(), "counterCells", null);
        setField(term6067, term6067.getClass(), "keySet", null);
        setField(term6067, term6067.getClass(), "values", null);
        setField(term6067, term6067.getClass(), "entrySet", null);
        setField(term6067, term6067.getClass(), "keySet", null);
        setField(term6067, term6067.getClass(), "values", null);
        setField(term5893, term5893.getClass(), "nameValues", term6067);
        setField(term5893, term5893.getClass(), "currentFormatField", "eVpkWxjuki");
        setField(term5893, term5893.getClass(), "nextStrategy", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.FastDateParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SJiQaLvSKv";
        try {
            callMethod(klass, "parse", argTypes, term5893, args);
            assertTrue(false);
        }
        catch (OutOfMemoryError e) {
        }

    }

};


