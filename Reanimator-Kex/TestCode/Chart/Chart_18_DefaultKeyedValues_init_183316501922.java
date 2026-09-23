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
import java.util.ArrayList;
import java.util.HashMap;

public class DefaultKeyedValues_init_183316501922 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term372;

    public DefaultKeyedValues_init_183316501922() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term373 = new ArrayList();
        ArrayList term375 = new ArrayList();
        HashMap term377 = new HashMap();
        term372 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues"));
        setField(term372, term372.getClass(), "keys", term373);
        setField(term372, term372.getClass(), "values", term375);
        setField(term372, term372.getClass(), "indexMap", term377);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.DefaultKeyedValues");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term372));
    }

};


