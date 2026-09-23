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

public class MultiValueMap_clear_1526166106121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27193;

    public MultiValueMap_clear_1526166106121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27193 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term27295 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term27397 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term27499 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        setField(term27397, term27397.getClass(), "map", term27499);
        setField(term27295, term27295.getClass(), "map", term27397);
        setField(term27193, term27193.getClass(), "map", term27295);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "clear", argTypes, term27193, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


