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

public class DateTimeFormatterBuilder_appendMonthOfYear_1367168891336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50907;
     Object term51184;
     Object term51163;

    public DateTimeFormatterBuilder_appendMonthOfYear_1367168891336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term50997 = new ArrayList();
        term50907 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term50945 = newInstance(Class.forName("java.lang.Object"));
        setField(term50907, term50907.getClass(), "iFormatter", term50945);
        setField(term50907, term50907.getClass(), "iElementPairs", term50997);
        Object term51187 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber"));
        Object term51188 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setIntField(term51187, term51187.getClass(), "iMinPrintedDigits", 3);
        setByteField(term51188, term51188.getClass(), "iOrdinal", (byte) 7);
        setField(term51188, term51188.getClass(), "iUnitType", null);
        setField(term51188, term51188.getClass(), "iRangeType", null);
        setField(term51188, term51188.getClass(), "iName", null);
        setField(term51187, term51187.getClass(), "iFieldType", term51188);
        setIntField(term51187, term51187.getClass(), "iMaxParsedDigits", 3);
        setBooleanField(term51187, term51187.getClass(), "iSigned", false);
        ArrayList term51185 = new ArrayList();
        ((ArrayList) term51185).add(term51187);
        ((ArrayList) term51185).add(term51187);
        term51184 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term51184, term51184.getClass(), "iElementPairs", term51185);
        setField(term51184, term51184.getClass(), "iFormatter", null);
        Object term51166 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber"));
        Object term51168 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setIntField(term51166, term51166.getClass(), "iMinPrintedDigits", 3);
        setByteField(term51168, term51168.getClass(), "iOrdinal", (byte) 7);
        setField(term51168, term51168.getClass(), "iUnitType", null);
        setField(term51168, term51168.getClass(), "iRangeType", null);
        setField(term51168, term51168.getClass(), "iName", null);
        setField(term51166, term51166.getClass(), "iFieldType", term51168);
        setIntField(term51166, term51166.getClass(), "iMaxParsedDigits", 3);
        setBooleanField(term51166, term51166.getClass(), "iSigned", false);
        ArrayList term51164 = new ArrayList();
        ((ArrayList) term51164).add(term51166);
        ((ArrayList) term51164).add(term51166);
        term51163 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term51163, term51163.getClass(), "iElementPairs", term51164);
        setField(term51163, term51163.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 3;
        Object retValue = callMethod(klass, "appendMonthOfYear", argTypes, term50907, args);
        assertTrue(recursiveEquals(term50907, term51184));
        assertTrue(recursiveEquals(retValue, term51163));
    }

};


