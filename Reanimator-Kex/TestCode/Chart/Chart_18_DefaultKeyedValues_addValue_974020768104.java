package org.jfree.data;

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
import java.lang.ClassCastException;
import static org.jfree.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Double;
import java.lang.Object;

public class DefaultKeyedValues_addValue_974020768104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25778;
     Object term26037;

    public DefaultKeyedValues_addValue_974020768104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26037 = new Double(0.0);
        HashMap term25826 = new HashMap();
        ((HashMap) term25826).put(term26037, term26037);
        ((HashMap) term25826).put(term26037, term26037);
        ((HashMap) term25826).put(term26037, term26037);
        ((HashMap) term25826).put(term26037, term26037);
        ((HashMap) term25826).put((Object)null, (Object)null);
        ((HashMap) term25826).put(term26037, term26037);
        ((HashMap) term25826).put(term26037, term26037);
        ((HashMap) term25826).put(term26037, term26037);
        ((HashMap) term25826).put(term26037, term26037);
        ((HashMap) term25826).put(term26037, term26037);
        ((HashMap) term25826).put(term26037, term26037);
        ((HashMap) term25826).put(term26037, term26037);
        ((HashMap) term25826).put(term26037, term26037);
        ((HashMap) term25826).put(term26037, term26037);
        ((HashMap) term25826).put(term26037, term26037);
        ((HashMap) term25826).put(term26037, term26037);
        ((HashMap) term25826).put(term26037, term26037);
        ((HashMap) term25826).put(term26037, term26037);
        ((HashMap) term25826).put(term26037, term26037);
        ((HashMap) term25826).put(term26037, term26037);
        ((HashMap) term25826).put(term26037, term26037);
        ((HashMap) term25826).put(term26037, term26037);
        ((HashMap) term25826).put(term26037, term26037);
        ((HashMap) term25826).put(term26037, term26037);
        ((HashMap) term25826).put(term26037, term26037);
        ((HashMap) term25826).put(term26037, term26037);
        ((HashMap) term25826).put(term26037, term26037);
        ((HashMap) term25826).put(term26037, term26037);
        ((HashMap) term25826).put(term26037, term26037);
        ((HashMap) term25826).put(term26037, term26037);
        ((HashMap) term25826).put(term26037, term26037);
        ((HashMap) term25826).put(term26037, term26037);
        ((HashMap) term25826).put(term26037, term26037);
        ((HashMap) term25826).put(term26037, term26037);
        ((HashMap) term25826).put(term26037, term26037);
        ((HashMap) term25826).put(term26037, term26037);
        ((HashMap) term25826).put(term26037, term26037);
        ((HashMap) term25826).put(term26037, term26037);
        ((HashMap) term25826).put(term26037, term26037);
        ((HashMap) term25826).put(term26037, term26037);
        ((HashMap) term25826).put(term26037, term26037);
        ((HashMap) term25826).put(term26037, term26037);
        ((HashMap) term25826).put(term26037, term26037);
        ((HashMap) term25826).put(term26037, term26037);
        ((HashMap) term25826).put(term26037, term26037);
        ((HashMap) term25826).put(term26037, term26037);
        ((HashMap) term25826).put(term26037, term26037);
        ((HashMap) term25826).put(term26037, term26037);
        ((HashMap) term25826).put(term26037, term26037);
        ((HashMap) term25826).put(term26037, term26037);
        ((HashMap) term25826).put(term26037, term26037);
        ((HashMap) term25826).put(term26037, term26037);
        ((HashMap) term25826).put(term26037, term26037);
        ((HashMap) term25826).put(term26037, term26037);
        ((HashMap) term25826).put(term26037, term26037);
        ((HashMap) term25826).put(term26037, term26037);
        ((HashMap) term25826).put(term26037, term26037);
        ((HashMap) term25826).put(term26037, term26037);
        ((HashMap) term25826).put(term26037, term26037);
        ((HashMap) term25826).put(term26037, term26037);
        ((HashMap) term25826).put(term26037, term26037);
        ((HashMap) term25826).put(term26037, term26037);
        ((HashMap) term25826).put(term26037, term26037);
        ((HashMap) term25826).put(term26037, term26037);
        term25778 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues"));
        setField(term25778, term25778.getClass(), "indexMap", term25826);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.DefaultKeyedValues");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Comparable");
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term26037;
        args[1] = 0.0;
        try {
            callMethod(klass, "addValue", argTypes, term25778, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


