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

public class DateTimeFormatterBuilder_appendTwoDigitWeekyear_2101755923125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term422;
     Object term428;
     Object term10416;
     Object term10396;

    public DateTimeFormatterBuilder_appendTwoDigitWeekyear_2101755923125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term423 = new ArrayList();
        term422 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term427 = newInstance(Class.forName("java.lang.Object"));
        setField(term422, term422.getClass(), "iElementPairs", term423);
        setField(term422, term422.getClass(), "iFormatter", term427);
        term428 = new Integer(-1145578966);
        Object term10419 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$TwoDigitYear"));
        Object term10420 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setByteField(term10420, term10420.getClass(), "iOrdinal", (byte) 10);
        setField(term10420, term10420.getClass(), "iUnitType", null);
        setField(term10420, term10420.getClass(), "iRangeType", null);
        setField(term10420, term10420.getClass(), "iName", null);
        setField(term10419, term10419.getClass(), "iType", term10420);
        setIntField(term10419, term10419.getClass(), "iPivot", -1145578966);
        setBooleanField(term10419, term10419.getClass(), "iLenientParse", false);
        ArrayList term10417 = new ArrayList();
        ((ArrayList) term10417).add(term10419);
        ((ArrayList) term10417).add(term10419);
        term10416 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term10416, term10416.getClass(), "iElementPairs", term10417);
        setField(term10416, term10416.getClass(), "iFormatter", null);
        Object term10399 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$TwoDigitYear"));
        Object term10400 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setByteField(term10400, term10400.getClass(), "iOrdinal", (byte) 10);
        setField(term10400, term10400.getClass(), "iUnitType", null);
        setField(term10400, term10400.getClass(), "iRangeType", null);
        setField(term10400, term10400.getClass(), "iName", null);
        setField(term10399, term10399.getClass(), "iType", term10400);
        setIntField(term10399, term10399.getClass(), "iPivot", -1145578966);
        setBooleanField(term10399, term10399.getClass(), "iLenientParse", false);
        ArrayList term10397 = new ArrayList();
        ((ArrayList) term10397).add(term10399);
        ((ArrayList) term10397).add(term10399);
        term10396 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term10396, term10396.getClass(), "iElementPairs", term10397);
        setField(term10396, term10396.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term428;
        Object retValue = callMethod(klass, "appendTwoDigitWeekyear", argTypes, term422, args);
        assertTrue(recursiveEquals(term422, term10416));
        assertTrue(recursiveEquals(term428, -1145578966));
        assertTrue(recursiveEquals(retValue, term10396));
    }

};


