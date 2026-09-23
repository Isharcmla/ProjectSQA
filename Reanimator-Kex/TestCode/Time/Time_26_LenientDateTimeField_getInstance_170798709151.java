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

public class LenientDateTimeField_getInstance_170798709151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9205;
     Object term9573;
     Object term9570;

    public LenientDateTimeField_getInstance_170798709151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9205 = newInstance(Class.forName("org.joda.time.field.StrictDateTimeField"));
        Object term9307 = newInstance(Class.forName("org.joda.time.chrono.BasicSingleEraDateTimeField"));
        setField(term9205, term9205.getClass(), "iField", term9307);
        term9573 = newInstance(Class.forName("org.joda.time.field.StrictDateTimeField"));
        Object term9574 = newInstance(Class.forName("org.joda.time.chrono.BasicSingleEraDateTimeField"));
        setField(term9574, term9574.getClass(), "iEraText", null);
        setField(term9574, term9574.getClass(), "iType", null);
        setField(term9573, term9573.getClass(), "iField", term9574);
        setField(term9573, term9573.getClass(), "iType", null);
        term9570 = newInstance(Class.forName("org.joda.time.field.LenientDateTimeField"));
        Object term9571 = newInstance(Class.forName("org.joda.time.chrono.BasicSingleEraDateTimeField"));
        setField(term9570, term9570.getClass(), "iBase", null);
        setField(term9571, term9571.getClass(), "iEraText", null);
        setField(term9571, term9571.getClass(), "iType", null);
        setField(term9570, term9570.getClass(), "iField", term9571);
        setField(term9570, term9570.getClass(), "iType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.field.LenientDateTimeField");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.DateTimeField");
        argTypes[1] = Class.forName("org.joda.time.Chronology");
        Object[] args = new Object[2];
        args[0] = term9205;
        args[1] = null;
        Object retValue = callMethod(klass, "getInstance", argTypes, null, args);
        assertTrue(recursiveEquals(term9205, null));
        assertTrue(recursiveEquals(retValue, term9570));
    }

};


