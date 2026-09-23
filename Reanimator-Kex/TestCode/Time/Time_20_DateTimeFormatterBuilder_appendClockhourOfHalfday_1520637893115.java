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

public class DateTimeFormatterBuilder_appendClockhourOfHalfday_1520637893115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term336;
     Object term342;
     Object term8665;
     Object term8644;

    public DateTimeFormatterBuilder_appendClockhourOfHalfday_1520637893115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term337 = new ArrayList();
        term336 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term341 = newInstance(Class.forName("java.lang.Object"));
        setField(term336, term336.getClass(), "iElementPairs", term337);
        setField(term336, term336.getClass(), "iFormatter", term341);
        term342 = new Integer(590364439);
        Object term8668 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber"));
        Object term8669 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setIntField(term8668, term8668.getClass(), "iMinPrintedDigits", 590364439);
        setByteField(term8669, term8669.getClass(), "iOrdinal", (byte) 15);
        setField(term8669, term8669.getClass(), "iUnitType", null);
        setField(term8669, term8669.getClass(), "iRangeType", null);
        setField(term8669, term8669.getClass(), "iName", null);
        setField(term8668, term8668.getClass(), "iFieldType", term8669);
        setIntField(term8668, term8668.getClass(), "iMaxParsedDigits", 590364439);
        setBooleanField(term8668, term8668.getClass(), "iSigned", false);
        ArrayList term8666 = new ArrayList();
        ((ArrayList) term8666).add(term8668);
        ((ArrayList) term8666).add(term8668);
        term8665 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term8665, term8665.getClass(), "iElementPairs", term8666);
        setField(term8665, term8665.getClass(), "iFormatter", null);
        Object term8647 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber"));
        Object term8649 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setIntField(term8647, term8647.getClass(), "iMinPrintedDigits", 590364439);
        setByteField(term8649, term8649.getClass(), "iOrdinal", (byte) 15);
        setField(term8649, term8649.getClass(), "iUnitType", null);
        setField(term8649, term8649.getClass(), "iRangeType", null);
        setField(term8649, term8649.getClass(), "iName", null);
        setField(term8647, term8647.getClass(), "iFieldType", term8649);
        setIntField(term8647, term8647.getClass(), "iMaxParsedDigits", 590364439);
        setBooleanField(term8647, term8647.getClass(), "iSigned", false);
        ArrayList term8645 = new ArrayList();
        ((ArrayList) term8645).add(term8647);
        ((ArrayList) term8645).add(term8647);
        term8644 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term8644, term8644.getClass(), "iElementPairs", term8645);
        setField(term8644, term8644.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term342;
        Object retValue = callMethod(klass, "appendClockhourOfHalfday", argTypes, term336, args);
        assertTrue(recursiveEquals(term336, term8665));
        assertTrue(recursiveEquals(term342, 590364439));
        assertTrue(recursiveEquals(retValue, term8644));
    }

};


