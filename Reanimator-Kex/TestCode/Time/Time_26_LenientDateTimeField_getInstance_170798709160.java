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

public class LenientDateTimeField_getInstance_170798709160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10798;
     Object term11421;
     Object term11417;

    public LenientDateTimeField_getInstance_170798709160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10798 = newInstance(Class.forName("org.joda.time.field.StrictDateTimeField"));
        Object term10888 = newInstance(Class.forName("org.joda.time.field.ZeroIsMaxDateTimeField"));
        Object term10972 = newInstance(Class.forName("org.joda.time.field.StrictDateTimeField"));
        setField(term10888, term10888.getClass(), "iField", term10972);
        setField(term10798, term10798.getClass(), "iField", term10888);
        term11421 = newInstance(Class.forName("org.joda.time.field.StrictDateTimeField"));
        Object term11422 = newInstance(Class.forName("org.joda.time.field.ZeroIsMaxDateTimeField"));
        Object term11423 = newInstance(Class.forName("org.joda.time.field.StrictDateTimeField"));
        setField(term11423, term11423.getClass(), "iField", null);
        setField(term11423, term11423.getClass(), "iType", null);
        setField(term11422, term11422.getClass(), "iField", term11423);
        setField(term11422, term11422.getClass(), "iType", null);
        setField(term11421, term11421.getClass(), "iField", term11422);
        setField(term11421, term11421.getClass(), "iType", null);
        term11417 = newInstance(Class.forName("org.joda.time.field.LenientDateTimeField"));
        Object term11418 = newInstance(Class.forName("org.joda.time.field.ZeroIsMaxDateTimeField"));
        Object term11419 = newInstance(Class.forName("org.joda.time.field.StrictDateTimeField"));
        setField(term11417, term11417.getClass(), "iBase", null);
        setField(term11419, term11419.getClass(), "iField", null);
        setField(term11419, term11419.getClass(), "iType", null);
        setField(term11418, term11418.getClass(), "iField", term11419);
        setField(term11418, term11418.getClass(), "iType", null);
        setField(term11417, term11417.getClass(), "iField", term11418);
        setField(term11417, term11417.getClass(), "iType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.field.LenientDateTimeField");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.DateTimeField");
        argTypes[1] = Class.forName("org.joda.time.Chronology");
        Object[] args = new Object[2];
        args[0] = term10798;
        args[1] = null;
        Object retValue = callMethod(klass, "getInstance", argTypes, null, args);
        assertTrue(recursiveEquals(term10798, null));
        assertTrue(recursiveEquals(retValue, term11417));
    }

};


