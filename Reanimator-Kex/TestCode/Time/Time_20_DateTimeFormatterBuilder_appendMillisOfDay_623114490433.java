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

public class DateTimeFormatterBuilder_appendMillisOfDay_623114490433 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71641;
     Object term71802;
     Object term71781;

    public DateTimeFormatterBuilder_appendMillisOfDay_623114490433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term71731 = new ArrayList();
        term71641 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term71679 = newInstance(Class.forName("java.lang.Object"));
        setField(term71641, term71641.getClass(), "iFormatter", term71679);
        setField(term71641, term71641.getClass(), "iElementPairs", term71731);
        Object term71805 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber"));
        Object term71806 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setIntField(term71805, term71805.getClass(), "iMinPrintedDigits", 8);
        setByteField(term71806, term71806.getClass(), "iOrdinal", (byte) 22);
        setField(term71806, term71806.getClass(), "iUnitType", null);
        setField(term71806, term71806.getClass(), "iRangeType", null);
        setField(term71806, term71806.getClass(), "iName", null);
        setField(term71805, term71805.getClass(), "iFieldType", term71806);
        setIntField(term71805, term71805.getClass(), "iMaxParsedDigits", 8);
        setBooleanField(term71805, term71805.getClass(), "iSigned", false);
        ArrayList term71803 = new ArrayList();
        ((ArrayList) term71803).add(term71805);
        ((ArrayList) term71803).add(term71805);
        term71802 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term71802, term71802.getClass(), "iElementPairs", term71803);
        setField(term71802, term71802.getClass(), "iFormatter", null);
        Object term71784 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber"));
        Object term71786 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setIntField(term71784, term71784.getClass(), "iMinPrintedDigits", 8);
        setByteField(term71786, term71786.getClass(), "iOrdinal", (byte) 22);
        setField(term71786, term71786.getClass(), "iUnitType", null);
        setField(term71786, term71786.getClass(), "iRangeType", null);
        setField(term71786, term71786.getClass(), "iName", null);
        setField(term71784, term71784.getClass(), "iFieldType", term71786);
        setIntField(term71784, term71784.getClass(), "iMaxParsedDigits", 8);
        setBooleanField(term71784, term71784.getClass(), "iSigned", false);
        ArrayList term71782 = new ArrayList();
        ((ArrayList) term71782).add(term71784);
        ((ArrayList) term71782).add(term71784);
        term71781 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term71781, term71781.getClass(), "iElementPairs", term71782);
        setField(term71781, term71781.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 8;
        Object retValue = callMethod(klass, "appendMillisOfDay", argTypes, term71641, args);
        assertTrue(recursiveEquals(term71641, term71802));
        assertTrue(recursiveEquals(retValue, term71781));
    }

};


