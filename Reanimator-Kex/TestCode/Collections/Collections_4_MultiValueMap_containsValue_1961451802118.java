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

public class MultiValueMap_containsValue_1961451802118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26511;

    public MultiValueMap_containsValue_1961451802118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26511 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term26613 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term26715 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term26817 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        setField(term26715, term26715.getClass(), "map", term26817);
        setField(term26613, term26613.getClass(), "map", term26715);
        setField(term26511, term26511.getClass(), "map", term26613);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "containsValue", argTypes, term26511, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


