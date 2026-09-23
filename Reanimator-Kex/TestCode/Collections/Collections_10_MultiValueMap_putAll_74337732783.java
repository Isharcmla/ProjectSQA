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

public class MultiValueMap_putAll_74337732783 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14610;
     Object term14658;

    public MultiValueMap_putAll_74337732783() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14610 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term14748 = newInstance(Class.forName("java.lang.Object"));
        Object term14786 = newInstance(Class.forName("java.lang.Object"));
        term14658 = new HashMap();
        ((HashMap) term14658).put((Object)null, (Object)null);
        ((HashMap) term14658).put(term14748, term14748);
        ((HashMap) term14658).put(term14748, term14748);
        ((HashMap) term14658).put(term14748, term14748);
        ((HashMap) term14658).put(term14748, term14748);
        ((HashMap) term14658).put(term14748, term14748);
        ((HashMap) term14658).put(term14748, term14748);
        ((HashMap) term14658).put(term14748, term14748);
        ((HashMap) term14658).put(term14786, term14786);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term14658;
        try {
            callMethod(klass, "putAll", argTypes, term14610, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


