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

public class DateTimeFormatterBuilder_appendHourOfHalfday_189972139114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term328;
     Object term334;
     Object term8580;
     Object term8559;

    public DateTimeFormatterBuilder_appendHourOfHalfday_189972139114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term329 = new ArrayList();
        term328 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term333 = newInstance(Class.forName("java.lang.Object"));
        setField(term328, term328.getClass(), "iElementPairs", term329);
        setField(term328, term328.getClass(), "iFormatter", term333);
        term334 = new Integer(1135664017);
        Object term8583 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber"));
        Object term8584 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setIntField(term8583, term8583.getClass(), "iMinPrintedDigits", 1135664017);
        setByteField(term8584, term8584.getClass(), "iOrdinal", (byte) 14);
        setField(term8584, term8584.getClass(), "iUnitType", null);
        setField(term8584, term8584.getClass(), "iRangeType", null);
        setField(term8584, term8584.getClass(), "iName", null);
        setField(term8583, term8583.getClass(), "iFieldType", term8584);
        setIntField(term8583, term8583.getClass(), "iMaxParsedDigits", 1135664017);
        setBooleanField(term8583, term8583.getClass(), "iSigned", false);
        ArrayList term8581 = new ArrayList();
        ((ArrayList) term8581).add(term8583);
        ((ArrayList) term8581).add(term8583);
        term8580 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term8580, term8580.getClass(), "iElementPairs", term8581);
        setField(term8580, term8580.getClass(), "iFormatter", null);
        Object term8562 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber"));
        Object term8564 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setIntField(term8562, term8562.getClass(), "iMinPrintedDigits", 1135664017);
        setByteField(term8564, term8564.getClass(), "iOrdinal", (byte) 14);
        setField(term8564, term8564.getClass(), "iUnitType", null);
        setField(term8564, term8564.getClass(), "iRangeType", null);
        setField(term8564, term8564.getClass(), "iName", null);
        setField(term8562, term8562.getClass(), "iFieldType", term8564);
        setIntField(term8562, term8562.getClass(), "iMaxParsedDigits", 1135664017);
        setBooleanField(term8562, term8562.getClass(), "iSigned", false);
        ArrayList term8560 = new ArrayList();
        ((ArrayList) term8560).add(term8562);
        ((ArrayList) term8560).add(term8562);
        term8559 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term8559, term8559.getClass(), "iElementPairs", term8560);
        setField(term8559, term8559.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term334;
        Object retValue = callMethod(klass, "appendHourOfHalfday", argTypes, term328, args);
        assertTrue(recursiveEquals(term328, term8580));
        assertTrue(recursiveEquals(term334, 1135664017));
        assertTrue(recursiveEquals(retValue, term8559));
    }

};


