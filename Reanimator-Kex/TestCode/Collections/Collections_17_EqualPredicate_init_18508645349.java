package org.apache.commons.collections.functors;

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
import static org.apache.commons.collections.functors.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections.functors.EqualityUtils.*;
import java.lang.Object;

public class EqualPredicate_init_18508645349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4;
     Object term33;
     Object term35;

    public EqualPredicate_init_18508645349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4 = newInstance(Class.forName("java.lang.Object"));
        term33 = newInstance(Class.forName("org.apache.commons.collections.functors.EqualPredicate"));
        Object term34 = newInstance(Class.forName("java.lang.Object"));
        setField(term33, term33.getClass(), "iValue", term34);
        setField(term33, term33.getClass(), "equator", null);
        term35 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.functors.EqualPredicate");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("org.apache.commons.collections.functors.Equator");
        Object[] args = new Object[2];
        args[0] = term4;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term33));
        assertTrue(recursiveEquals(term4, term35));
    }

};


