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
import java.lang.NullPointerException;
import static org.apache.commons.collections.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MultiValueMap_put_2036360295127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27539;

    public MultiValueMap_put_2036360295127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27539 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term27641 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term27743 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term27845 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        setField(term27743, term27743.getClass(), "map", term27845);
        setField(term27641, term27641.getClass(), "map", term27743);
        setField(term27539, term27539.getClass(), "map", term27641);
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
            callMethod(klass, "put", argTypes, term27539, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


