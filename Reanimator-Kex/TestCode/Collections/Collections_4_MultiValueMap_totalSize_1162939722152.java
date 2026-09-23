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
import java.lang.ClassCastException;
import static org.apache.commons.collections.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;

public class MultiValueMap_totalSize_1162939722152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35227;

    public MultiValueMap_totalSize_1162939722152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term35365 = newInstance(Class.forName("java.lang.Object"));
        HashMap term35275 = new HashMap();
        ((HashMap) term35275).put(term35365, term35365);
        ((HashMap) term35275).put(term35365, term35365);
        ((HashMap) term35275).put(term35365, term35365);
        ((HashMap) term35275).put(term35365, term35365);
        ((HashMap) term35275).put(term35365, term35365);
        ((HashMap) term35275).put(term35365, term35365);
        ((HashMap) term35275).put(term35365, term35365);
        ((HashMap) term35275).put(term35365, term35365);
        ((HashMap) term35275).put(term35365, term35365);
        ((HashMap) term35275).put(term35365, term35365);
        ((HashMap) term35275).put(term35365, term35365);
        ((HashMap) term35275).put(term35365, term35365);
        term35227 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        setField(term35227, term35227.getClass(), "map", term35275);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "totalSize", argTypes, term35227, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


