package org.apache.commons.lang3.builder;

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
import static org.apache.commons.lang3.builder.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.builder.EqualityUtils.*;
import java.lang.Object;

public class HashCodeBuilder_register_189492281647 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term309;
     Object term4856;
     Object term4858;

    public HashCodeBuilder_register_189492281647() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term309 = newInstance(Class.forName("java.lang.Object"));
        term4856 = newInstance(Class.forName("org.apache.commons.lang3.builder.IDKey"));
        Object term4857 = newInstance(Class.forName("java.lang.Object"));
        setField(term4856, term4856.getClass(), "value", term4857);
        setIntField(term4856, term4856.getClass(), "id", 1829217484);
        term4858 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term309;
        callMethod(klass, "register", argTypes, null, args);
        assertTrue(recursiveEquals(null, term4856));
        assertTrue(recursiveEquals(term309, term4858));
    }

};


