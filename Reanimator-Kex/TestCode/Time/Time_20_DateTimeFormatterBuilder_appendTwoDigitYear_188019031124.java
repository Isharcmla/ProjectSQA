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
import java.lang.Boolean;

public class DateTimeFormatterBuilder_appendTwoDigitYear_188019031124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term412;
     Object term418;
     Object term420;
     Object term10334;
     Object term10324;

    public DateTimeFormatterBuilder_appendTwoDigitYear_188019031124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term413 = new ArrayList();
        term412 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term417 = newInstance(Class.forName("java.lang.Object"));
        setField(term412, term412.getClass(), "iElementPairs", term413);
        setField(term412, term412.getClass(), "iFormatter", term417);
        term418 = new Integer(-469968304);
        term420 = new Boolean(false);
        Object term10337 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$TwoDigitYear"));
        Object term10338 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setByteField(term10338, term10338.getClass(), "iOrdinal", (byte) 5);
        setField(term10338, term10338.getClass(), "iUnitType", null);
        setField(term10338, term10338.getClass(), "iRangeType", null);
        setField(term10338, term10338.getClass(), "iName", null);
        setField(term10337, term10337.getClass(), "iType", term10338);
        setIntField(term10337, term10337.getClass(), "iPivot", -469968304);
        setBooleanField(term10337, term10337.getClass(), "iLenientParse", false);
        ArrayList term10335 = new ArrayList();
        ((ArrayList) term10335).add(term10337);
        ((ArrayList) term10335).add(term10337);
        term10334 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term10334, term10334.getClass(), "iElementPairs", term10335);
        setField(term10334, term10334.getClass(), "iFormatter", null);
        Object term10327 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$TwoDigitYear"));
        Object term10328 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setByteField(term10328, term10328.getClass(), "iOrdinal", (byte) 5);
        setField(term10328, term10328.getClass(), "iUnitType", null);
        setField(term10328, term10328.getClass(), "iRangeType", null);
        setField(term10328, term10328.getClass(), "iName", null);
        setField(term10327, term10327.getClass(), "iType", term10328);
        setIntField(term10327, term10327.getClass(), "iPivot", -469968304);
        setBooleanField(term10327, term10327.getClass(), "iLenientParse", false);
        ArrayList term10325 = new ArrayList();
        ((ArrayList) term10325).add(term10327);
        ((ArrayList) term10325).add(term10327);
        term10324 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term10324, term10324.getClass(), "iElementPairs", term10325);
        setField(term10324, term10324.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term418;
        args[1] = term420;
        Object retValue = callMethod(klass, "appendTwoDigitYear", argTypes, term412, args);
        assertTrue(recursiveEquals(term412, term10334));
        assertTrue(recursiveEquals(term418, -469968304));
        assertTrue(recursiveEquals(term420, false));
        assertTrue(recursiveEquals(retValue, term10324));
    }

};


