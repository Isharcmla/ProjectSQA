package org.joda.time.field;

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
import static org.joda.time.field.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.joda.time.field.EqualityUtils.*;
import java.lang.Object;

public class LenientDateTimeField_getInstance_170798709158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10603;
     Object term10989;
     Object term10985;

    public LenientDateTimeField_getInstance_170798709158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10603 = newInstance(Class.forName("org.joda.time.field.StrictDateTimeField"));
        Object term10695 = newInstance(Class.forName("org.joda.time.chrono.BasicYearDateTimeField"));
        setField(term10603, term10603.getClass(), "iField", term10695);
        term10989 = newInstance(Class.forName("org.joda.time.field.StrictDateTimeField"));
        Object term10990 = newInstance(Class.forName("org.joda.time.chrono.BasicYearDateTimeField"));
        setField(term10990, term10990.getClass(), "iChronology", null);
        setLongField(term10990, term10990.getClass(), "iUnitMillis", 0L);
        setField(term10990, term10990.getClass(), "iDurationField", null);
        setField(term10990, term10990.getClass(), "iType", null);
        setField(term10989, term10989.getClass(), "iField", term10990);
        setField(term10989, term10989.getClass(), "iType", null);
        term10985 = newInstance(Class.forName("org.joda.time.field.LenientDateTimeField"));
        Object term10986 = newInstance(Class.forName("org.joda.time.chrono.BasicYearDateTimeField"));
        setField(term10985, term10985.getClass(), "iBase", null);
        setField(term10986, term10986.getClass(), "iChronology", null);
        setLongField(term10986, term10986.getClass(), "iUnitMillis", 0L);
        setField(term10986, term10986.getClass(), "iDurationField", null);
        setField(term10986, term10986.getClass(), "iType", null);
        setField(term10985, term10985.getClass(), "iField", term10986);
        setField(term10985, term10985.getClass(), "iType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.field.LenientDateTimeField");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.DateTimeField");
        argTypes[1] = Class.forName("org.joda.time.Chronology");
        Object[] args = new Object[2];
        args[0] = term10603;
        args[1] = null;
        Object retValue = callMethod(klass, "getInstance", argTypes, null, args);
        assertTrue(recursiveEquals(term10603, null));
        assertTrue(recursiveEquals(retValue, term10985));
    }

};


