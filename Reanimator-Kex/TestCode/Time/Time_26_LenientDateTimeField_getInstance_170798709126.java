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

public class LenientDateTimeField_getInstance_170798709126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3313;
     Object term3973;
     Object term3970;

    public LenientDateTimeField_getInstance_170798709126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3313 = newInstance(Class.forName("org.joda.time.field.StrictDateTimeField"));
        Object term3397 = newInstance(Class.forName("org.joda.time.field.StrictDateTimeField"));
        setField(term3313, term3313.getClass(), "iField", term3397);
        term3973 = newInstance(Class.forName("org.joda.time.field.StrictDateTimeField"));
        Object term3974 = newInstance(Class.forName("org.joda.time.field.StrictDateTimeField"));
        setField(term3974, term3974.getClass(), "iField", null);
        setField(term3974, term3974.getClass(), "iType", null);
        setField(term3973, term3973.getClass(), "iField", term3974);
        setField(term3973, term3973.getClass(), "iType", null);
        term3970 = newInstance(Class.forName("org.joda.time.field.LenientDateTimeField"));
        Object term3971 = newInstance(Class.forName("org.joda.time.field.StrictDateTimeField"));
        setField(term3970, term3970.getClass(), "iBase", null);
        setField(term3971, term3971.getClass(), "iField", null);
        setField(term3971, term3971.getClass(), "iType", null);
        setField(term3970, term3970.getClass(), "iField", term3971);
        setField(term3970, term3970.getClass(), "iType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.field.LenientDateTimeField");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.DateTimeField");
        argTypes[1] = Class.forName("org.joda.time.Chronology");
        Object[] args = new Object[2];
        args[0] = term3313;
        args[1] = null;
        Object retValue = callMethod(klass, "getInstance", argTypes, null, args);
        assertTrue(recursiveEquals(term3313, null));
        assertTrue(recursiveEquals(retValue, term3970));
    }

};


