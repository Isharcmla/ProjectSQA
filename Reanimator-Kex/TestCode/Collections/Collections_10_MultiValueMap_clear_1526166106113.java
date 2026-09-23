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

public class MultiValueMap_clear_1526166106113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23434;

    public MultiValueMap_clear_1526166106113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23434 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term23536 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term23638 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term23740 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        setField(term23638, term23638.getClass(), "map", term23740);
        setField(term23536, term23536.getClass(), "map", term23638);
        setField(term23434, term23434.getClass(), "map", term23536);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "clear", argTypes, term23434, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


