package org.joda.time.format;

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
import static org.joda.time.format.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.joda.time.format.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;

public class DateTimeFormatterBuilder_appendSecondOfDay_1021432552309 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45709;
     Object term45950;
     Object term45929;

    public DateTimeFormatterBuilder_appendSecondOfDay_1021432552309() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term45799 = new ArrayList();
        term45709 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term45747 = newInstance(Class.forName("java.lang.Object"));
        setField(term45709, term45709.getClass(), "iFormatter", term45747);
        setField(term45709, term45709.getClass(), "iElementPairs", term45799);
        Object term45953 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber"));
        Object term45954 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setIntField(term45953, term45953.getClass(), "iMinPrintedDigits", 6);
        setByteField(term45954, term45954.getClass(), "iOrdinal", (byte) 20);
        setField(term45954, term45954.getClass(), "iUnitType", null);
        setField(term45954, term45954.getClass(), "iRangeType", null);
        setField(term45954, term45954.getClass(), "iName", null);
        setField(term45953, term45953.getClass(), "iFieldType", term45954);
        setIntField(term45953, term45953.getClass(), "iMaxParsedDigits", 6);
        setBooleanField(term45953, term45953.getClass(), "iSigned", false);
        ArrayList term45951 = new ArrayList();
        ((ArrayList) term45951).add(term45953);
        ((ArrayList) term45951).add(term45953);
        term45950 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term45950, term45950.getClass(), "iElementPairs", term45951);
        setField(term45950, term45950.getClass(), "iFormatter", null);
        Object term45932 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber"));
        Object term45934 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setIntField(term45932, term45932.getClass(), "iMinPrintedDigits", 6);
        setByteField(term45934, term45934.getClass(), "iOrdinal", (byte) 20);
        setField(term45934, term45934.getClass(), "iUnitType", null);
        setField(term45934, term45934.getClass(), "iRangeType", null);
        setField(term45934, term45934.getClass(), "iName", null);
        setField(term45932, term45932.getClass(), "iFieldType", term45934);
        setIntField(term45932, term45932.getClass(), "iMaxParsedDigits", 6);
        setBooleanField(term45932, term45932.getClass(), "iSigned", false);
        ArrayList term45930 = new ArrayList();
        ((ArrayList) term45930).add(term45932);
        ((ArrayList) term45930).add(term45932);
        term45929 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term45929, term45929.getClass(), "iElementPairs", term45930);
        setField(term45929, term45929.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 6;
        Object retValue = callMethod(klass, "appendSecondOfDay", argTypes, term45709, args);
        assertTrue(recursiveEquals(term45709, term45950));
        assertTrue(recursiveEquals(retValue, term45929));
    }

};


