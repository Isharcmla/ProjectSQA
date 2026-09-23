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

public class DateTimeFormatterBuilder_appendDayOfYear_1529551337374 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58231;
     Object term58894;
     Object term58874;

    public DateTimeFormatterBuilder_appendDayOfYear_1529551337374() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term58321 = new ArrayList();
        term58231 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term58269 = newInstance(Class.forName("java.lang.Object"));
        setField(term58231, term58231.getClass(), "iFormatter", term58269);
        setField(term58231, term58231.getClass(), "iElementPairs", term58321);
        Object term58897 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$UnpaddedNumber"));
        Object term58898 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setByteField(term58898, term58898.getClass(), "iOrdinal", (byte) 6);
        setField(term58898, term58898.getClass(), "iUnitType", null);
        setField(term58898, term58898.getClass(), "iRangeType", null);
        setField(term58898, term58898.getClass(), "iName", null);
        setField(term58897, term58897.getClass(), "iFieldType", term58898);
        setIntField(term58897, term58897.getClass(), "iMaxParsedDigits", 3);
        setBooleanField(term58897, term58897.getClass(), "iSigned", false);
        ArrayList term58895 = new ArrayList();
        ((ArrayList) term58895).add(term58897);
        ((ArrayList) term58895).add(term58897);
        term58894 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term58894, term58894.getClass(), "iElementPairs", term58895);
        setField(term58894, term58894.getClass(), "iFormatter", null);
        Object term58877 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$UnpaddedNumber"));
        Object term58878 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setByteField(term58878, term58878.getClass(), "iOrdinal", (byte) 6);
        setField(term58878, term58878.getClass(), "iUnitType", null);
        setField(term58878, term58878.getClass(), "iRangeType", null);
        setField(term58878, term58878.getClass(), "iName", null);
        setField(term58877, term58877.getClass(), "iFieldType", term58878);
        setIntField(term58877, term58877.getClass(), "iMaxParsedDigits", 3);
        setBooleanField(term58877, term58877.getClass(), "iSigned", false);
        ArrayList term58875 = new ArrayList();
        ((ArrayList) term58875).add(term58877);
        ((ArrayList) term58875).add(term58877);
        term58874 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term58874, term58874.getClass(), "iElementPairs", term58875);
        setField(term58874, term58874.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "appendDayOfYear", argTypes, term58231, args);
        assertTrue(recursiveEquals(term58231, term58894));
        assertTrue(recursiveEquals(retValue, term58874));
    }

};


