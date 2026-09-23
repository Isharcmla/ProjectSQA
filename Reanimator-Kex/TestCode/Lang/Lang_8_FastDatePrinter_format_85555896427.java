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

public class FastDatePrinter_format_85555896427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1230;
     Object term1274;
     Object term1275;
     Object term1307;

    public FastDatePrinter_format_85555896427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1230 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDatePrinter"));
        Object term1243 = newInstance(Class.forName("sun.util.calendar.ZoneInfo"));
        Object term1256 = newInstance(Class.forName("java.util.Locale"));
        Object term1257 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term1272 = (Object[]) newArray("org.apache.commons.lang3.time.FastDatePrinter$Rule", 6);
        setField(term1230, term1230.getClass(), "mPattern", "SzjVpOQTyS");
        setIntField(term1243, term1243.getClass(), "rawOffset", 0);
        setIntField(term1243, term1243.getClass(), "rawOffsetDiff", 0);
        setIntField(term1243, term1243.getClass(), "checksum", 0);
        setIntField(term1243, term1243.getClass(), "dstSavings", 0);
        setField(term1243, term1243.getClass(), "transitions", null);
        setField(term1243, term1243.getClass(), "offsets", null);
        setField(term1243, term1243.getClass(), "simpleTimeZoneParams", null);
        setBooleanField(term1243, term1243.getClass(), "willGMTOffsetChange", false);
        setBooleanField(term1243, term1243.getClass(), "dirty", false);
        setField(term1243, term1243.getClass(), "lastRule", null);
        setField(term1243, term1243.getClass(), "ID", "Zulu");
        setField(term1243, term1243.getClass(), "zoneId", null);
        setField(term1230, term1230.getClass(), "mTimeZone", term1243);
        setField(term1257, term1257.getClass(), "language", "en");
        setField(term1257, term1257.getClass(), "script", "");
        setField(term1257, term1257.getClass(), "region", "GU");
        setField(term1257, term1257.getClass(), "variant", "");
        setIntField(term1257, term1257.getClass(), "hash", 96623497);
        setField(term1256, term1256.getClass(), "baseLocale", term1257);
        setField(term1256, term1256.getClass(), "localeExtensions", null);
        setIntField(term1256, term1256.getClass(), "hashCodeValue", 96623497);
        setField(term1256, term1256.getClass(), "languageTag", null);
        setField(term1230, term1230.getClass(), "mLocale", term1256);
        setField(term1230, term1230.getClass(), "mRules", term1272);
        setIntField(term1230, term1230.getClass(), "mMaxLengthEstimate", 597278769);
        term1274 = newInstance(Class.forName("java.lang.Object"));
        term1275 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term1288 = (byte[]) newByteArray(16);
        setField(term1275, term1275.getClass(), "toStringCache", "MjGYSRKTNF");
        setField(term1275, term1275.getClass(), "value", term1288);
        setByteField(term1275, term1275.getClass(), "coder", (byte) 47);
        setIntField(term1275, term1275.getClass(), "count", -1685132342);
        term1307 = newInstance(Class.forName("java.text.FieldPosition"));
        Object term1311 = newInstance(Class.forName("java.text.Format$Field"));
        setIntField(term1307, term1307.getClass(), "field", -1456670397);
        setIntField(term1307, term1307.getClass(), "endIndex", 1622346318);
        setIntField(term1307, term1307.getClass(), "beginIndex", 1048535127);
        setField(term1311, term1311.getClass(), "name", "hRNSzYYIrc");
        setField(term1307, term1307.getClass(), "attribute", term1311);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.FastDatePrinter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.StringBuffer");
        argTypes[2] = Class.forName("java.text.FieldPosition");
        Object[] args = new Object[3];
        args[0] = term1274;
        args[1] = term1275;
        args[2] = term1307;
        try {
            callMethod(klass, "format", argTypes, term1230, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


