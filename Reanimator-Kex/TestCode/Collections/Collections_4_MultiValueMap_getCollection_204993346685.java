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

public class MultiValueMap_getCollection_204993346685 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16586;

    public MultiValueMap_getCollection_204993346685() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16586 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term16688 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term16790 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        setField(term16688, term16688.getClass(), "map", term16790);
        setField(term16586, term16586.getClass(), "map", term16688);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getCollection", argTypes, term16586, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


