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

public class LenientDateTimeField_getInstance_170798709167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12444;
     Object term12895;
     Object term12891;

    public LenientDateTimeField_getInstance_170798709167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12444 = newInstance(Class.forName("org.joda.time.field.StrictDateTimeField"));
        Object term12534 = newInstance(Class.forName("org.joda.time.field.ZeroIsMaxDateTimeField"));
        Object term12618 = newInstance(Class.forName("org.joda.time.field.StrictDateTimeField"));
        setField(term12534, term12534.getClass(), "iField", term12618);
        setField(term12444, term12444.getClass(), "iField", term12534);
        term12895 = newInstance(Class.forName("org.joda.time.field.StrictDateTimeField"));
        Object term12896 = newInstance(Class.forName("org.joda.time.field.ZeroIsMaxDateTimeField"));
        Object term12897 = newInstance(Class.forName("org.joda.time.field.StrictDateTimeField"));
        setField(term12897, term12897.getClass(), "iField", null);
        setField(term12897, term12897.getClass(), "iType", null);
        setField(term12896, term12896.getClass(), "iField", term12897);
        setField(term12896, term12896.getClass(), "iType", null);
        setField(term12895, term12895.getClass(), "iField", term12896);
        setField(term12895, term12895.getClass(), "iType", null);
        term12891 = newInstance(Class.forName("org.joda.time.field.LenientDateTimeField"));
        Object term12892 = newInstance(Class.forName("org.joda.time.field.ZeroIsMaxDateTimeField"));
        Object term12893 = newInstance(Class.forName("org.joda.time.field.StrictDateTimeField"));
        setField(term12891, term12891.getClass(), "iBase", null);
        setField(term12893, term12893.getClass(), "iField", null);
        setField(term12893, term12893.getClass(), "iType", null);
        setField(term12892, term12892.getClass(), "iField", term12893);
        setField(term12892, term12892.getClass(), "iType", null);
        setField(term12891, term12891.getClass(), "iField", term12892);
        setField(term12891, term12891.getClass(), "iType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.field.LenientDateTimeField");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.DateTimeField");
        argTypes[1] = Class.forName("org.joda.time.Chronology");
        Object[] args = new Object[2];
        args[0] = term12444;
        args[1] = null;
        Object retValue = callMethod(klass, "getInstance", argTypes, null, args);
        assertTrue(recursiveEquals(term12444, null));
        assertTrue(recursiveEquals(retValue, term12891));
    }

};


