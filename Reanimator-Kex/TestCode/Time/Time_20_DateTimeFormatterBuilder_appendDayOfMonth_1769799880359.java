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

public class DateTimeFormatterBuilder_appendDayOfMonth_1769799880359 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55351;
     Object term55829;
     Object term55808;

    public DateTimeFormatterBuilder_appendDayOfMonth_1769799880359() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term55441 = new ArrayList();
        term55351 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term55389 = newInstance(Class.forName("java.lang.Object"));
        setField(term55351, term55351.getClass(), "iFormatter", term55389);
        setField(term55351, term55351.getClass(), "iElementPairs", term55441);
        Object term55832 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber"));
        Object term55833 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setIntField(term55832, term55832.getClass(), "iMinPrintedDigits", 3);
        setByteField(term55833, term55833.getClass(), "iOrdinal", (byte) 8);
        setField(term55833, term55833.getClass(), "iUnitType", null);
        setField(term55833, term55833.getClass(), "iRangeType", null);
        setField(term55833, term55833.getClass(), "iName", null);
        setField(term55832, term55832.getClass(), "iFieldType", term55833);
        setIntField(term55832, term55832.getClass(), "iMaxParsedDigits", 3);
        setBooleanField(term55832, term55832.getClass(), "iSigned", false);
        ArrayList term55830 = new ArrayList();
        ((ArrayList) term55830).add(term55832);
        ((ArrayList) term55830).add(term55832);
        term55829 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term55829, term55829.getClass(), "iElementPairs", term55830);
        setField(term55829, term55829.getClass(), "iFormatter", null);
        Object term55811 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber"));
        Object term55813 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setIntField(term55811, term55811.getClass(), "iMinPrintedDigits", 3);
        setByteField(term55813, term55813.getClass(), "iOrdinal", (byte) 8);
        setField(term55813, term55813.getClass(), "iUnitType", null);
        setField(term55813, term55813.getClass(), "iRangeType", null);
        setField(term55813, term55813.getClass(), "iName", null);
        setField(term55811, term55811.getClass(), "iFieldType", term55813);
        setIntField(term55811, term55811.getClass(), "iMaxParsedDigits", 3);
        setBooleanField(term55811, term55811.getClass(), "iSigned", false);
        ArrayList term55809 = new ArrayList();
        ((ArrayList) term55809).add(term55811);
        ((ArrayList) term55809).add(term55811);
        term55808 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term55808, term55808.getClass(), "iElementPairs", term55809);
        setField(term55808, term55808.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 3;
        Object retValue = callMethod(klass, "appendDayOfMonth", argTypes, term55351, args);
        assertTrue(recursiveEquals(term55351, term55829));
        assertTrue(recursiveEquals(retValue, term55808));
    }

};


