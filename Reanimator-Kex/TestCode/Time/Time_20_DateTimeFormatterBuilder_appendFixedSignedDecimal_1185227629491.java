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

public class DateTimeFormatterBuilder_appendFixedSignedDecimal_1185227629491 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95181;
     Object term95391;
     Object term95413;
     Object term95418;
     Object term95404;

    public DateTimeFormatterBuilder_appendFixedSignedDecimal_1185227629491() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term95271 = new ArrayList();
        term95181 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term95219 = newInstance(Class.forName("java.lang.Object"));
        setField(term95181, term95181.getClass(), "iFormatter", term95219);
        setField(term95181, term95181.getClass(), "iElementPairs", term95271);
        term95391 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term95416 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$FixedNumber"));
        Object term95417 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setIntField(term95416, term95416.getClass(), "iMinPrintedDigits", 1);
        setByteField(term95417, term95417.getClass(), "iOrdinal", (byte) 0);
        setField(term95417, term95417.getClass(), "iUnitType", null);
        setField(term95417, term95417.getClass(), "iRangeType", null);
        setField(term95417, term95417.getClass(), "iName", null);
        setField(term95416, term95416.getClass(), "iFieldType", term95417);
        setIntField(term95416, term95416.getClass(), "iMaxParsedDigits", 1);
        setBooleanField(term95416, term95416.getClass(), "iSigned", true);
        ArrayList term95414 = new ArrayList();
        ((ArrayList) term95414).add(term95416);
        ((ArrayList) term95414).add(term95416);
        term95413 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term95413, term95413.getClass(), "iElementPairs", term95414);
        setField(term95413, term95413.getClass(), "iFormatter", null);
        term95418 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setByteField(term95418, term95418.getClass(), "iOrdinal", (byte) 0);
        setField(term95418, term95418.getClass(), "iUnitType", null);
        setField(term95418, term95418.getClass(), "iRangeType", null);
        setField(term95418, term95418.getClass(), "iName", null);
        Object term95407 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$FixedNumber"));
        Object term95400 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setIntField(term95407, term95407.getClass(), "iMinPrintedDigits", 1);
        setByteField(term95400, term95400.getClass(), "iOrdinal", (byte) 0);
        setField(term95400, term95400.getClass(), "iUnitType", null);
        setField(term95400, term95400.getClass(), "iRangeType", null);
        setField(term95400, term95400.getClass(), "iName", null);
        setField(term95407, term95407.getClass(), "iFieldType", term95400);
        setIntField(term95407, term95407.getClass(), "iMaxParsedDigits", 1);
        setBooleanField(term95407, term95407.getClass(), "iSigned", true);
        ArrayList term95405 = new ArrayList();
        ((ArrayList) term95405).add(term95407);
        ((ArrayList) term95405).add(term95407);
        term95404 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term95404, term95404.getClass(), "iElementPairs", term95405);
        setField(term95404, term95404.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.DateTimeFieldType");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term95391;
        args[1] = 1;
        Object retValue = callMethod(klass, "appendFixedSignedDecimal", argTypes, term95181, args);
        assertTrue(recursiveEquals(term95181, term95413));
        assertTrue(recursiveEquals(term95391, term95418));
        assertTrue(recursiveEquals(retValue, term95404));
    }

};


