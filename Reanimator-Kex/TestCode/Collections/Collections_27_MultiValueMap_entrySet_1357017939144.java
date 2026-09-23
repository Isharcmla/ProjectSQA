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

public class MultiValueMap_entrySet_1357017939144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45136;

    public MultiValueMap_entrySet_1357017939144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45136 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap"));
        Object term45240 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap"));
        Object term45344 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap"));
        setField(term45240, term45240.getClass(), "map", term45344);
        setField(term45136, term45136.getClass(), "map", term45240);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "entrySet", argTypes, term45136, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


