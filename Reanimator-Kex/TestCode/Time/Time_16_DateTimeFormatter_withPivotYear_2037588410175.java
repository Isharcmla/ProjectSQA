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
import java.lang.Integer;

public class DateTimeFormatter_withPivotYear_2037588410175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33853;
     Object term34588;
     Object term34580;

    public DateTimeFormatter_withPivotYear_2037588410175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term33901 = new Integer(0);
        term33853 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        setField(term33853, term33853.getClass(), "iPivotYear", term33901);
        Integer term34589 = new Integer(0);
        term34588 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        setField(term34588, term34588.getClass(), "iPrinter", null);
        setField(term34588, term34588.getClass(), "iParser", null);
        setField(term34588, term34588.getClass(), "iLocale", null);
        setBooleanField(term34588, term34588.getClass(), "iOffsetParsed", false);
        setField(term34588, term34588.getClass(), "iChrono", null);
        setField(term34588, term34588.getClass(), "iZone", null);
        setField(term34588, term34588.getClass(), "iPivotYear", term34589);
        setIntField(term34588, term34588.getClass(), "iDefaultYear", 0);
        Integer term34582 = new Integer(0);
        term34580 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        setField(term34580, term34580.getClass(), "iPrinter", null);
        setField(term34580, term34580.getClass(), "iParser", null);
        setField(term34580, term34580.getClass(), "iLocale", null);
        setBooleanField(term34580, term34580.getClass(), "iOffsetParsed", false);
        setField(term34580, term34580.getClass(), "iChrono", null);
        setField(term34580, term34580.getClass(), "iZone", null);
        setField(term34580, term34580.getClass(), "iPivotYear", term34582);
        setIntField(term34580, term34580.getClass(), "iDefaultYear", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "withPivotYear", argTypes, term33853, args);
        assertTrue(recursiveEquals(term33853, term34588));
        assertTrue(recursiveEquals(retValue, term34580));
    }

};


