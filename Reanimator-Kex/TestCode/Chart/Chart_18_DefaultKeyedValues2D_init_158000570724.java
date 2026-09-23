package org.jfree.data;

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
import static org.jfree.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jfree.data.EqualityUtils.*;
import java.lang.Boolean;
import java.util.ArrayList;

public class DefaultKeyedValues2D_init_158000570724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term347;

    public DefaultKeyedValues2D_init_158000570724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = new Boolean(false);
        ArrayList term348 = new ArrayList();
        ArrayList term350 = new ArrayList();
        ArrayList term352 = new ArrayList();
        term347 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues2D"));
        setField(term347, term347.getClass(), "rowKeys", term348);
        setField(term347, term347.getClass(), "columnKeys", term350);
        setField(term347, term347.getClass(), "rows", term352);
        setBooleanField(term347, term347.getClass(), "sortRowKeys", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.DefaultKeyedValues2D");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term347));
        assertTrue(recursiveEquals(term1, false));
    }

};


