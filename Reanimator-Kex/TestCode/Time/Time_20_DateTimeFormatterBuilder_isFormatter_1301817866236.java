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

public class DateTimeFormatterBuilder_isFormatter_1301817866236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30104;
     Object term30230;
     Object term30350;
     Object term30351;

    public DateTimeFormatterBuilder_isFormatter_1301817866236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30104 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        term30230 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$UnpaddedNumber"));
        term30350 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term30350, term30350.getClass(), "iElementPairs", null);
        setField(term30350, term30350.getClass(), "iFormatter", null);
        term30351 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$UnpaddedNumber"));
        setField(term30351, term30351.getClass(), "iFieldType", null);
        setIntField(term30351, term30351.getClass(), "iMaxParsedDigits", 0);
        setBooleanField(term30351, term30351.getClass(), "iSigned", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term30230;
        Object retValue = callMethod(klass, "isFormatter", argTypes, term30104, args);
        assertTrue(recursiveEquals(term30104, term30350));
        assertTrue(recursiveEquals(term30230, term30351));
        assertTrue(recursiveEquals(retValue, true));
    }

};


