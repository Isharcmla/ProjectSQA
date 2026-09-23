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

public class MultiValueMap_totalSize_1162939722156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32713;

    public MultiValueMap_totalSize_1162939722156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term32851 = newInstance(Class.forName("java.lang.Object"));
        HashMap term32761 = new HashMap();
        ((HashMap) term32761).put(term32851, term32851);
        ((HashMap) term32761).put(term32851, term32851);
        ((HashMap) term32761).put(term32851, term32851);
        ((HashMap) term32761).put(term32851, term32851);
        ((HashMap) term32761).put(term32851, term32851);
        ((HashMap) term32761).put(term32851, term32851);
        ((HashMap) term32761).put(term32851, term32851);
        ((HashMap) term32761).put(term32851, term32851);
        ((HashMap) term32761).put(term32851, term32851);
        ((HashMap) term32761).put(term32851, term32851);
        ((HashMap) term32761).put(term32851, term32851);
        ((HashMap) term32761).put(term32851, term32851);
        term32713 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        setField(term32713, term32713.getClass(), "map", term32761);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "totalSize", argTypes, term32713, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


