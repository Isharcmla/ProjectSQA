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

public class MultiValueMap_removeMapping_1478808130112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24693;

    public MultiValueMap_removeMapping_1478808130112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24693 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term24795 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term24897 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        setField(term24795, term24795.getClass(), "map", term24897);
        setField(term24693, term24693.getClass(), "map", term24795);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "removeMapping", argTypes, term24693, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


