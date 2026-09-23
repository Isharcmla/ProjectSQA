package org.apache.commons.lang.time;

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
import static org.apache.commons.lang.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class FastDateFormat_getTimeInstance_90247397612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1175;
     Object term1177;
     Object term1190;

    public FastDateFormat_getTimeInstance_90247397612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1175 = new Integer(-2038273078);
        term1177 = newInstance(Class.forName("sun.util.calendar.ZoneInfo"));
        setIntField(term1177, term1177.getClass(), "rawOffset", 0);
        setIntField(term1177, term1177.getClass(), "rawOffsetDiff", 0);
        setIntField(term1177, term1177.getClass(), "checksum", 0);
        setIntField(term1177, term1177.getClass(), "dstSavings", 0);
        setField(term1177, term1177.getClass(), "transitions", null);
        setField(term1177, term1177.getClass(), "offsets", null);
        setField(term1177, term1177.getClass(), "simpleTimeZoneParams", null);
        setBooleanField(term1177, term1177.getClass(), "willGMTOffsetChange", false);
        setBooleanField(term1177, term1177.getClass(), "dirty", false);
        setField(term1177, term1177.getClass(), "lastRule", null);
        setField(term1177, term1177.getClass(), "ID", "Zulu");
        setField(term1177, term1177.getClass(), "zoneId", null);
        term1190 = newInstance(Class.forName("java.util.Locale"));
        Object term1191 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term1191, term1191.getClass(), "language", "en");
        setField(term1191, term1191.getClass(), "script", "");
        setField(term1191, term1191.getClass(), "region", "GU");
        setField(term1191, term1191.getClass(), "variant", "");
        setIntField(term1191, term1191.getClass(), "hash", 96623497);
        setField(term1190, term1190.getClass(), "baseLocale", term1191);
        setField(term1190, term1190.getClass(), "localeExtensions", null);
        setIntField(term1190, term1190.getClass(), "hashCodeValue", 96623497);
        setField(term1190, term1190.getClass(), "languageTag", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.util.TimeZone");
        argTypes[2] = Class.forName("java.util.Locale");
        Object[] args = new Object[3];
        args[0] = term1175;
        args[1] = term1177;
        args[2] = term1190;
        callMethod(klass, "getTimeInstance", argTypes, null, args);
    }

};


