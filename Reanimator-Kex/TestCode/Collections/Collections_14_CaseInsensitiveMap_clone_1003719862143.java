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
import java.lang.OutOfMemoryError;
import static org.apache.commons.collections.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CaseInsensitiveMap_clone_1003719862143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26166;

    public CaseInsensitiveMap_clone_1003719862143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26166 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        Object[] term26003 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 0);
        setField(term26166, term26166.getClass(), "data", term26003);
        setIntField(term26166, term26166.getClass(), "size", 2162688);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "clone", argTypes, term26166, args);
            assertTrue(false);
        }
        catch (OutOfMemoryError e) {
        }

    }

};


