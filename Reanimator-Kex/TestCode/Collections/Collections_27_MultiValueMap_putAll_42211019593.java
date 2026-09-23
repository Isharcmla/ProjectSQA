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
import java.util.HashMap;
import java.lang.Object;

public class MultiValueMap_putAll_42211019593 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17421;
     Object term17469;

    public MultiValueMap_putAll_42211019593() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17421 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap"));
        Object term17559 = newInstance(Class.forName("java.lang.Object"));
        Object term17597 = newInstance(Class.forName("java.lang.Object"));
        term17469 = new HashMap();
        ((HashMap) term17469).put((Object)null, (Object)null);
        ((HashMap) term17469).put(term17559, term17559);
        ((HashMap) term17469).put(term17559, term17559);
        ((HashMap) term17469).put(term17559, term17559);
        ((HashMap) term17469).put(term17559, term17559);
        ((HashMap) term17469).put(term17559, term17559);
        ((HashMap) term17469).put(term17559, term17559);
        ((HashMap) term17469).put(term17559, term17559);
        ((HashMap) term17469).put(term17597, term17597);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term17469;
        try {
            callMethod(klass, "putAll", argTypes, term17421, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


