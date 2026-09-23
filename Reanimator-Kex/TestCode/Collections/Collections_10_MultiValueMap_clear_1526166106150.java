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

public class MultiValueMap_clear_1526166106150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29636;

    public MultiValueMap_clear_1526166106150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29636 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term29738 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term29840 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        setField(term29840, term29840.getClass(), "map", term29840);
        setField(term29738, term29738.getClass(), "map", term29840);
        setField(term29636, term29636.getClass(), "map", term29738);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "clear", argTypes, term29636, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


