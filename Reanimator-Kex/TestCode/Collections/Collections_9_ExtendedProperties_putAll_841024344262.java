package org.apache.commons.collections;

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
import static org.apache.commons.collections.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedHashMap;
import java.lang.Object;

public class ExtendedProperties_putAll_841024344262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127567;
     Object term127627;

    public ExtendedProperties_putAll_841024344262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term127567 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term127717 = newInstance(Class.forName("java.lang.Object"));
        term127627 = new LinkedHashMap();
        ((LinkedHashMap) term127627).put(term127717, term127717);
        ((LinkedHashMap) term127627).put(term127717, term127717);
        ((LinkedHashMap) term127627).put(term127717, term127717);
        ((LinkedHashMap) term127627).put(term127717, term127717);
        ((LinkedHashMap) term127627).put(term127717, term127717);
        ((LinkedHashMap) term127627).put(term127717, term127717);
        ((LinkedHashMap) term127627).put(term127717, term127717);
        ((LinkedHashMap) term127627).put(term127717, term127717);
        ((LinkedHashMap) term127627).put(term127717, term127717);
        ((LinkedHashMap) term127627).put(term127717, term127717);
        ((LinkedHashMap) term127627).put(term127717, term127717);
        ((LinkedHashMap) term127627).put(term127717, term127717);
        ((LinkedHashMap) term127627).put(term127717, term127717);
        ((LinkedHashMap) term127627).put(term127717, term127717);
        ((LinkedHashMap) term127627).put(term127717, term127717);
        ((LinkedHashMap) term127627).put(term127717, term127717);
        ((LinkedHashMap) term127627).put(term127717, term127717);
        ((LinkedHashMap) term127627).put(term127717, term127717);
        ((LinkedHashMap) term127627).put(term127717, term127717);
        ((LinkedHashMap) term127627).put(term127717, term127717);
        ((LinkedHashMap) term127627).put(term127717, term127717);
        ((LinkedHashMap) term127627).put(term127717, term127717);
        ((LinkedHashMap) term127627).put(term127717, term127717);
        ((LinkedHashMap) term127627).put(term127717, term127717);
        ((LinkedHashMap) term127627).put(term127717, term127717);
        ((LinkedHashMap) term127627).put(term127717, term127717);
        ((LinkedHashMap) term127627).put(term127717, term127717);
        ((LinkedHashMap) term127627).put(term127717, term127717);
        ((LinkedHashMap) term127627).put(term127717, term127717);
        ((LinkedHashMap) term127627).put(term127717, term127717);
        ((LinkedHashMap) term127627).put(term127717, term127717);
        ((LinkedHashMap) term127627).put(term127717, term127717);
        ((LinkedHashMap) term127627).put(term127717, term127717);
        ((LinkedHashMap) term127627).put(term127717, term127717);
        ((LinkedHashMap) term127627).put(term127717, term127717);
        ((LinkedHashMap) term127627).put(term127717, term127717);
        ((LinkedHashMap) term127627).put(term127717, term127717);
        ((LinkedHashMap) term127627).put(term127717, term127717);
        ((LinkedHashMap) term127627).put(term127717, term127717);
        ((LinkedHashMap) term127627).put(term127717, term127717);
        ((LinkedHashMap) term127627).put(term127717, term127717);
        ((LinkedHashMap) term127627).put(term127717, term127717);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term127627;
        try {
            callMethod(klass, "putAll", argTypes, term127567, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


