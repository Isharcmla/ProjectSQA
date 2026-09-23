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

public class LenientDateTimeField_init_115318833727 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3946;
     Object term3979;
     Object term3981;

    public LenientDateTimeField_init_115318833727() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term3750 = newInstance(Class.forName("org.joda.time.field.LenientDateTimeField"));
        Object term3862 = newInstance(Class.forName("org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField"));
        setField(term3750, term3750.getClass(), "iField", term3862);
        term3946 = newInstance(Class.forName("org.joda.time.field.StrictDateTimeField"));
        term3979 = newInstance(Class.forName("org.joda.time.field.LenientDateTimeField"));
        Object term3980 = newInstance(Class.forName("org.joda.time.field.StrictDateTimeField"));
        setField(term3979, term3979.getClass(), "iBase", null);
        setField(term3980, term3980.getClass(), "iField", null);
        setField(term3980, term3980.getClass(), "iType", null);
        setField(term3979, term3979.getClass(), "iField", term3980);
        setField(term3979, term3979.getClass(), "iType", null);
        term3981 = newInstance(Class.forName("org.joda.time.field.StrictDateTimeField"));
        setField(term3981, term3981.getClass(), "iField", null);
        setField(term3981, term3981.getClass(), "iType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.field.LenientDateTimeField");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.DateTimeField");
        argTypes[1] = Class.forName("org.joda.time.Chronology");
        Object[] args = new Object[2];
        args[0] = term3946;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term3979));
        assertTrue(recursiveEquals(term3946, term3981));
    }

};


