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

public class DateTimeFormatterBuilder_appendYearOfCentury_1271924827453 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76929;
     Object term77093;
     Object term77073;

    public DateTimeFormatterBuilder_appendYearOfCentury_1271924827453() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term77019 = new ArrayList();
        term76929 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term76967 = newInstance(Class.forName("java.lang.Object"));
        setField(term76929, term76929.getClass(), "iFormatter", term76967);
        setField(term76929, term76929.getClass(), "iElementPairs", term77019);
        Object term77096 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$UnpaddedNumber"));
        Object term77097 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setByteField(term77097, term77097.getClass(), "iOrdinal", (byte) 4);
        setField(term77097, term77097.getClass(), "iUnitType", null);
        setField(term77097, term77097.getClass(), "iRangeType", null);
        setField(term77097, term77097.getClass(), "iName", null);
        setField(term77096, term77096.getClass(), "iFieldType", term77097);
        setIntField(term77096, term77096.getClass(), "iMaxParsedDigits", 1073741824);
        setBooleanField(term77096, term77096.getClass(), "iSigned", false);
        ArrayList term77094 = new ArrayList();
        ((ArrayList) term77094).add(term77096);
        ((ArrayList) term77094).add(term77096);
        term77093 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term77093, term77093.getClass(), "iElementPairs", term77094);
        setField(term77093, term77093.getClass(), "iFormatter", null);
        Object term77076 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$UnpaddedNumber"));
        Object term77077 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setByteField(term77077, term77077.getClass(), "iOrdinal", (byte) 4);
        setField(term77077, term77077.getClass(), "iUnitType", null);
        setField(term77077, term77077.getClass(), "iRangeType", null);
        setField(term77077, term77077.getClass(), "iName", null);
        setField(term77076, term77076.getClass(), "iFieldType", term77077);
        setIntField(term77076, term77076.getClass(), "iMaxParsedDigits", 1073741824);
        setBooleanField(term77076, term77076.getClass(), "iSigned", false);
        ArrayList term77074 = new ArrayList();
        ((ArrayList) term77074).add(term77076);
        ((ArrayList) term77074).add(term77076);
        term77073 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term77073, term77073.getClass(), "iElementPairs", term77074);
        setField(term77073, term77073.getClass(), "iFormatter", null);
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
        Object retValue = callMethod(klass, "appendYearOfCentury", argTypes, term76929, args);
        assertTrue(recursiveEquals(term76929, term77093));
        assertTrue(recursiveEquals(retValue, term77073));
    }

};


