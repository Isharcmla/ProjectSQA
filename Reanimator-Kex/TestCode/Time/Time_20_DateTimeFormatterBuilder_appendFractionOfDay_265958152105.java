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

public class DateTimeFormatterBuilder_appendFractionOfDay_265958152105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term254;
     Object term260;
     Object term262;
     Object term6629;
     Object term6610;

    public DateTimeFormatterBuilder_appendFractionOfDay_265958152105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term255 = new ArrayList();
        term254 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term259 = newInstance(Class.forName("java.lang.Object"));
        setField(term254, term254.getClass(), "iElementPairs", term255);
        setField(term254, term254.getClass(), "iFormatter", term259);
        term260 = new Integer(597278769);
        term262 = new Integer(-1685132342);
        Object term6632 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$Fraction"));
        Object term6633 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setByteField(term6633, term6633.getClass(), "iOrdinal", (byte) 6);
        setField(term6633, term6633.getClass(), "iUnitType", null);
        setField(term6633, term6633.getClass(), "iRangeType", null);
        setField(term6633, term6633.getClass(), "iName", null);
        setField(term6632, term6632.getClass(), "iFieldType", term6633);
        setIntField(term6632, term6632.getClass(), "iMinDigits", 597278769);
        setIntField(term6632, term6632.getClass(), "iMaxDigits", 18);
        ArrayList term6630 = new ArrayList();
        ((ArrayList) term6630).add(term6632);
        ((ArrayList) term6630).add(term6632);
        term6629 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term6629, term6629.getClass(), "iElementPairs", term6630);
        setField(term6629, term6629.getClass(), "iFormatter", null);
        Object term6613 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$Fraction"));
        Object term6614 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setByteField(term6614, term6614.getClass(), "iOrdinal", (byte) 6);
        setField(term6614, term6614.getClass(), "iUnitType", null);
        setField(term6614, term6614.getClass(), "iRangeType", null);
        setField(term6614, term6614.getClass(), "iName", null);
        setField(term6613, term6613.getClass(), "iFieldType", term6614);
        setIntField(term6613, term6613.getClass(), "iMinDigits", 597278769);
        setIntField(term6613, term6613.getClass(), "iMaxDigits", 18);
        ArrayList term6611 = new ArrayList();
        ((ArrayList) term6611).add(term6613);
        ((ArrayList) term6611).add(term6613);
        term6610 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term6610, term6610.getClass(), "iElementPairs", term6611);
        setField(term6610, term6610.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term260;
        args[1] = term262;
        Object retValue = callMethod(klass, "appendFractionOfDay", argTypes, term254, args);
        assertTrue(recursiveEquals(term254, term6629));
        assertTrue(recursiveEquals(term260, 597278769));
        assertTrue(recursiveEquals(term262, -1685132342));
        assertTrue(recursiveEquals(retValue, term6610));
    }

};


