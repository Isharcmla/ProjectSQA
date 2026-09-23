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

public class DateTimeFormatterBuilder_appendSecondOfDay_1021432552383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59889;
     Object term60380;
     Object term60360;

    public DateTimeFormatterBuilder_appendSecondOfDay_1021432552383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term59979 = new ArrayList();
        term59889 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term59927 = newInstance(Class.forName("java.lang.Object"));
        setField(term59889, term59889.getClass(), "iFormatter", term59927);
        setField(term59889, term59889.getClass(), "iElementPairs", term59979);
        Object term60383 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$UnpaddedNumber"));
        Object term60384 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setByteField(term60384, term60384.getClass(), "iOrdinal", (byte) 20);
        setField(term60384, term60384.getClass(), "iUnitType", null);
        setField(term60384, term60384.getClass(), "iRangeType", null);
        setField(term60384, term60384.getClass(), "iName", null);
        setField(term60383, term60383.getClass(), "iFieldType", term60384);
        setIntField(term60383, term60383.getClass(), "iMaxParsedDigits", 5);
        setBooleanField(term60383, term60383.getClass(), "iSigned", false);
        ArrayList term60381 = new ArrayList();
        ((ArrayList) term60381).add(term60383);
        ((ArrayList) term60381).add(term60383);
        term60380 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term60380, term60380.getClass(), "iElementPairs", term60381);
        setField(term60380, term60380.getClass(), "iFormatter", null);
        Object term60363 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$UnpaddedNumber"));
        Object term60364 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setByteField(term60364, term60364.getClass(), "iOrdinal", (byte) 20);
        setField(term60364, term60364.getClass(), "iUnitType", null);
        setField(term60364, term60364.getClass(), "iRangeType", null);
        setField(term60364, term60364.getClass(), "iName", null);
        setField(term60363, term60363.getClass(), "iFieldType", term60364);
        setIntField(term60363, term60363.getClass(), "iMaxParsedDigits", 5);
        setBooleanField(term60363, term60363.getClass(), "iSigned", false);
        ArrayList term60361 = new ArrayList();
        ((ArrayList) term60361).add(term60363);
        ((ArrayList) term60361).add(term60363);
        term60360 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term60360, term60360.getClass(), "iElementPairs", term60361);
        setField(term60360, term60360.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "appendSecondOfDay", argTypes, term59889, args);
        assertTrue(recursiveEquals(term59889, term60380));
        assertTrue(recursiveEquals(retValue, term60360));
    }

};


