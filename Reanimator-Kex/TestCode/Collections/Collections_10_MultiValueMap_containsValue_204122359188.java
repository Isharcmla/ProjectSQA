package org.apache.commons.collections.map;

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
import java.lang.StackOverflowError;
import static org.apache.commons.collections.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MultiValueMap_containsValue_204122359188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99013;

    public MultiValueMap_containsValue_204122359188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99013 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term99115 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term99217 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        setField(term99217, term99217.getClass(), "map", term99217);
        setField(term99115, term99115.getClass(), "map", term99217);
        setField(term99013, term99013.getClass(), "map", term99115);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "containsValue", argTypes, term99013, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


