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

public class DateTimeFormatterBuilder_appendDayOfWeek_1586697202395 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61784;
     Object term62472;
     Object term62452;

    public DateTimeFormatterBuilder_appendDayOfWeek_1586697202395() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term61874 = new ArrayList();
        term61784 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term61822 = newInstance(Class.forName("java.lang.Object"));
        setField(term61784, term61784.getClass(), "iFormatter", term61822);
        setField(term61784, term61784.getClass(), "iElementPairs", term61874);
        Object term62475 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$UnpaddedNumber"));
        Object term62476 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setByteField(term62476, term62476.getClass(), "iOrdinal", (byte) 12);
        setField(term62476, term62476.getClass(), "iUnitType", null);
        setField(term62476, term62476.getClass(), "iRangeType", null);
        setField(term62476, term62476.getClass(), "iName", null);
        setField(term62475, term62475.getClass(), "iFieldType", term62476);
        setIntField(term62475, term62475.getClass(), "iMaxParsedDigits", 1);
        setBooleanField(term62475, term62475.getClass(), "iSigned", false);
        ArrayList term62473 = new ArrayList();
        ((ArrayList) term62473).add(term62475);
        ((ArrayList) term62473).add(term62475);
        term62472 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term62472, term62472.getClass(), "iElementPairs", term62473);
        setField(term62472, term62472.getClass(), "iFormatter", null);
        Object term62455 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$UnpaddedNumber"));
        Object term62456 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setByteField(term62456, term62456.getClass(), "iOrdinal", (byte) 12);
        setField(term62456, term62456.getClass(), "iUnitType", null);
        setField(term62456, term62456.getClass(), "iRangeType", null);
        setField(term62456, term62456.getClass(), "iName", null);
        setField(term62455, term62455.getClass(), "iFieldType", term62456);
        setIntField(term62455, term62455.getClass(), "iMaxParsedDigits", 1);
        setBooleanField(term62455, term62455.getClass(), "iSigned", false);
        ArrayList term62453 = new ArrayList();
        ((ArrayList) term62453).add(term62455);
        ((ArrayList) term62453).add(term62455);
        term62452 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term62452, term62452.getClass(), "iElementPairs", term62453);
        setField(term62452, term62452.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "appendDayOfWeek", argTypes, term61784, args);
        assertTrue(recursiveEquals(term61784, term62472));
        assertTrue(recursiveEquals(retValue, term62452));
    }

};


