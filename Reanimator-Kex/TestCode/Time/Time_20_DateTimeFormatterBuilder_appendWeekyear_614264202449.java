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

public class DateTimeFormatterBuilder_appendWeekyear_614264202449 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76450;
     Object term76600;
     Object term76580;

    public DateTimeFormatterBuilder_appendWeekyear_614264202449() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term76540 = new ArrayList();
        term76450 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term76488 = newInstance(Class.forName("java.lang.Object"));
        setField(term76450, term76450.getClass(), "iFormatter", term76488);
        setField(term76450, term76450.getClass(), "iElementPairs", term76540);
        Object term76603 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$UnpaddedNumber"));
        Object term76604 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setByteField(term76604, term76604.getClass(), "iOrdinal", (byte) 10);
        setField(term76604, term76604.getClass(), "iUnitType", null);
        setField(term76604, term76604.getClass(), "iRangeType", null);
        setField(term76604, term76604.getClass(), "iName", null);
        setField(term76603, term76603.getClass(), "iFieldType", term76604);
        setIntField(term76603, term76603.getClass(), "iMaxParsedDigits", 1073741824);
        setBooleanField(term76603, term76603.getClass(), "iSigned", true);
        ArrayList term76601 = new ArrayList();
        ((ArrayList) term76601).add(term76603);
        ((ArrayList) term76601).add(term76603);
        term76600 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term76600, term76600.getClass(), "iElementPairs", term76601);
        setField(term76600, term76600.getClass(), "iFormatter", null);
        Object term76583 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$UnpaddedNumber"));
        Object term76584 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setByteField(term76584, term76584.getClass(), "iOrdinal", (byte) 10);
        setField(term76584, term76584.getClass(), "iUnitType", null);
        setField(term76584, term76584.getClass(), "iRangeType", null);
        setField(term76584, term76584.getClass(), "iName", null);
        setField(term76583, term76583.getClass(), "iFieldType", term76584);
        setIntField(term76583, term76583.getClass(), "iMaxParsedDigits", 1073741824);
        setBooleanField(term76583, term76583.getClass(), "iSigned", true);
        ArrayList term76581 = new ArrayList();
        ((ArrayList) term76581).add(term76583);
        ((ArrayList) term76581).add(term76583);
        term76580 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term76580, term76580.getClass(), "iElementPairs", term76581);
        setField(term76580, term76580.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = 0;
        args[1] = 1073741824;
        Object retValue = callMethod(klass, "appendWeekyear", argTypes, term76450, args);
        assertTrue(recursiveEquals(term76450, term76600));
        assertTrue(recursiveEquals(retValue, term76580));
    }

};


