package org.apache.commons.collections4.map;

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
import static org.apache.commons.collections4.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MultiValueMap_putAll_422110195166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59480;

    public MultiValueMap_putAll_422110195166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59480 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap"));
        Object term59532 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap"));
        Object term59584 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap"));
        setField(term59532, term59532.getClass(), "map", term59584);
        setField(term59480, term59480.getClass(), "map", term59532);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term59480;
        try {
            callMethod(klass, "putAll", argTypes, term59480, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


