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
import java.util.HashMap;
import java.lang.Object;

public class MultiValueMap_putAll_74337732777 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14735;
     Object term14783;

    public MultiValueMap_putAll_74337732777() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14735 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term14873 = newInstance(Class.forName("java.lang.Object"));
        Object term14911 = newInstance(Class.forName("java.lang.Object"));
        term14783 = new HashMap();
        ((HashMap) term14783).put((Object)null, (Object)null);
        ((HashMap) term14783).put(term14873, term14873);
        ((HashMap) term14783).put(term14873, term14873);
        ((HashMap) term14783).put(term14873, term14873);
        ((HashMap) term14783).put(term14873, term14873);
        ((HashMap) term14783).put(term14873, term14873);
        ((HashMap) term14783).put(term14873, term14873);
        ((HashMap) term14783).put(term14873, term14873);
        ((HashMap) term14783).put(term14911, term14911);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term14783;
        try {
            callMethod(klass, "putAll", argTypes, term14735, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


