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
import static org.apache.commons.lang3.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;

public class FastDateFormat_getTimeZoneDisplay_117257549417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1689;
     Object term1710;
     Object term1712;
     Object term1714;

    public FastDateFormat_getTimeZoneDisplay_117257549417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1689 = newInstance(Class.forName("sun.util.calendar.ZoneInfo"));
        setIntField(term1689, term1689.getClass(), "rawOffset", -25200000);
        setIntField(term1689, term1689.getClass(), "rawOffsetDiff", 0);
        setIntField(term1689, term1689.getClass(), "checksum", 0);
        setIntField(term1689, term1689.getClass(), "dstSavings", 0);
        setField(term1689, term1689.getClass(), "transitions", null);
        setField(term1689, term1689.getClass(), "offsets", null);
        setField(term1689, term1689.getClass(), "simpleTimeZoneParams", null);
        setBooleanField(term1689, term1689.getClass(), "willGMTOffsetChange", false);
        setBooleanField(term1689, term1689.getClass(), "dirty", false);
        setField(term1689, term1689.getClass(), "lastRule", null);
        setField(term1689, term1689.getClass(), "ID", "SystemV/MST7");
        setField(term1689, term1689.getClass(), "zoneId", null);
        term1710 = new Boolean(false);
        term1712 = new Integer(-1685132342);
        term1714 = newInstance(Class.forName("java.util.Locale"));
        Object term1715 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term1715, term1715.getClass(), "language", "pa");
        setField(term1715, term1715.getClass(), "script", "Arab");
        setField(term1715, term1715.getClass(), "region", "PK");
        setField(term1715, term1715.getClass(), "variant", "");
        setIntField(term1715, term1715.getClass(), "hash", 2075563398);
        setField(term1714, term1714.getClass(), "baseLocale", term1715);
        setField(term1714, term1714.getClass(), "localeExtensions", null);
        setIntField(term1714, term1714.getClass(), "hashCodeValue", 2075563398);
        setField(term1714, term1714.getClass(), "languageTag", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.FastDateFormat");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.util.TimeZone");
        argTypes[1] = boolean.class;
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("java.util.Locale");
        Object[] args = new Object[4];
        args[0] = term1689;
        args[1] = term1710;
        args[2] = term1712;
        args[3] = term1714;
        callMethod(klass, "getTimeZoneDisplay", argTypes, null, args);
    }

};


