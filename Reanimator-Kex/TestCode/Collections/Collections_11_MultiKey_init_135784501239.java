package org.apache.commons.collections.keyvalue;

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
import static org.apache.commons.collections.keyvalue.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections.keyvalue.EqualityUtils.*;
import java.lang.Object;

public class MultiKey_init_135784501239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1832;
     Object term4285;
     Object term4287;

    public MultiKey_init_135784501239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1944 = newInstance(Class.forName("org.apache.commons.collections.keyvalue.MultiKey"));
        term1832 = (Object[]) newArray("java.lang.Object", 489);
        term4285 = newInstance(Class.forName("org.apache.commons.collections.keyvalue.MultiKey"));
        Object[] term4286 = (Object[]) newArray("java.lang.Object", 489);
        setField(term4285, term4285.getClass(), "keys", term4286);
        term4287 = (Object[]) newArray("java.lang.Object", 489);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.keyvalue.MultiKey");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term1832;
        args[1] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term4285));
        assertTrue(recursiveEquals(term1832, term4287));
    }

};


