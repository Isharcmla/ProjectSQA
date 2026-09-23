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

public class MultiValueMap_put_203636029597 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20017;

    public MultiValueMap_put_203636029597() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20017 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term20119 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term20221 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term20323 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        setField(term20221, term20221.getClass(), "map", term20323);
        setField(term20119, term20119.getClass(), "map", term20221);
        setField(term20017, term20017.getClass(), "map", term20119);
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
            callMethod(klass, "put", argTypes, term20017, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


