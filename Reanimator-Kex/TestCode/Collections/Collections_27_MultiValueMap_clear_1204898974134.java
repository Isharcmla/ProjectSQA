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

public class MultiValueMap_clear_1204898974134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23519;

    public MultiValueMap_clear_1204898974134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23519 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap"));
        Object term23623 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap"));
        Object term23727 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap"));
        Object term23831 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap"));
        setField(term23727, term23727.getClass(), "map", term23831);
        setField(term23623, term23623.getClass(), "map", term23727);
        setField(term23519, term23519.getClass(), "map", term23623);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "clear", argTypes, term23519, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


