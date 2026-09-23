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

public class DateTimeFormatterBuilder_appendTwoDigitYear_187960441123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term404;
     Object term410;
     Object term10278;
     Object term10258;

    public DateTimeFormatterBuilder_appendTwoDigitYear_187960441123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term405 = new ArrayList();
        term404 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term409 = newInstance(Class.forName("java.lang.Object"));
        setField(term404, term404.getClass(), "iElementPairs", term405);
        setField(term404, term404.getClass(), "iFormatter", term409);
        term410 = new Integer(-1530420153);
        Object term10281 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$TwoDigitYear"));
        Object term10282 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setByteField(term10282, term10282.getClass(), "iOrdinal", (byte) 5);
        setField(term10282, term10282.getClass(), "iUnitType", null);
        setField(term10282, term10282.getClass(), "iRangeType", null);
        setField(term10282, term10282.getClass(), "iName", null);
        setField(term10281, term10281.getClass(), "iType", term10282);
        setIntField(term10281, term10281.getClass(), "iPivot", -1530420153);
        setBooleanField(term10281, term10281.getClass(), "iLenientParse", false);
        ArrayList term10279 = new ArrayList();
        ((ArrayList) term10279).add(term10281);
        ((ArrayList) term10279).add(term10281);
        term10278 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term10278, term10278.getClass(), "iElementPairs", term10279);
        setField(term10278, term10278.getClass(), "iFormatter", null);
        Object term10261 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$TwoDigitYear"));
        Object term10262 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setByteField(term10262, term10262.getClass(), "iOrdinal", (byte) 5);
        setField(term10262, term10262.getClass(), "iUnitType", null);
        setField(term10262, term10262.getClass(), "iRangeType", null);
        setField(term10262, term10262.getClass(), "iName", null);
        setField(term10261, term10261.getClass(), "iType", term10262);
        setIntField(term10261, term10261.getClass(), "iPivot", -1530420153);
        setBooleanField(term10261, term10261.getClass(), "iLenientParse", false);
        ArrayList term10259 = new ArrayList();
        ((ArrayList) term10259).add(term10261);
        ((ArrayList) term10259).add(term10261);
        term10258 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term10258, term10258.getClass(), "iElementPairs", term10259);
        setField(term10258, term10258.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term410;
        Object retValue = callMethod(klass, "appendTwoDigitYear", argTypes, term404, args);
        assertTrue(recursiveEquals(term404, term10278));
        assertTrue(recursiveEquals(term410, -1530420153));
        assertTrue(recursiveEquals(retValue, term10258));
    }

};


