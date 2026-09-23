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
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Boolean;

public class DateTimeFormatterBuilder_appendTwoDigitWeekyear_2101697333126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term430;
     Object term436;
     Object term438;
     Object term10488;
     Object term10478;

    public DateTimeFormatterBuilder_appendTwoDigitWeekyear_2101697333126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term431 = new ArrayList();
        term430 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term435 = newInstance(Class.forName("java.lang.Object"));
        setField(term430, term430.getClass(), "iElementPairs", term431);
        setField(term430, term430.getClass(), "iFormatter", term435);
        term436 = new Integer(679763016);
        term438 = new Boolean(false);
        Object term10491 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$TwoDigitYear"));
        Object term10492 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setByteField(term10492, term10492.getClass(), "iOrdinal", (byte) 10);
        setField(term10492, term10492.getClass(), "iUnitType", null);
        setField(term10492, term10492.getClass(), "iRangeType", null);
        setField(term10492, term10492.getClass(), "iName", null);
        setField(term10491, term10491.getClass(), "iType", term10492);
        setIntField(term10491, term10491.getClass(), "iPivot", 679763016);
        setBooleanField(term10491, term10491.getClass(), "iLenientParse", false);
        ArrayList term10489 = new ArrayList();
        ((ArrayList) term10489).add(term10491);
        ((ArrayList) term10489).add(term10491);
        term10488 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term10488, term10488.getClass(), "iElementPairs", term10489);
        setField(term10488, term10488.getClass(), "iFormatter", null);
        Object term10481 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$TwoDigitYear"));
        Object term10482 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setByteField(term10482, term10482.getClass(), "iOrdinal", (byte) 10);
        setField(term10482, term10482.getClass(), "iUnitType", null);
        setField(term10482, term10482.getClass(), "iRangeType", null);
        setField(term10482, term10482.getClass(), "iName", null);
        setField(term10481, term10481.getClass(), "iType", term10482);
        setIntField(term10481, term10481.getClass(), "iPivot", 679763016);
        setBooleanField(term10481, term10481.getClass(), "iLenientParse", false);
        ArrayList term10479 = new ArrayList();
        ((ArrayList) term10479).add(term10481);
        ((ArrayList) term10479).add(term10481);
        term10478 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term10478, term10478.getClass(), "iElementPairs", term10479);
        setField(term10478, term10478.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term436;
        args[1] = term438;
        Object retValue = callMethod(klass, "appendTwoDigitWeekyear", argTypes, term430, args);
        assertTrue(recursiveEquals(term430, term10488));
        assertTrue(recursiveEquals(term436, 679763016));
        assertTrue(recursiveEquals(term438, false));
        assertTrue(recursiveEquals(retValue, term10478));
    }

};


