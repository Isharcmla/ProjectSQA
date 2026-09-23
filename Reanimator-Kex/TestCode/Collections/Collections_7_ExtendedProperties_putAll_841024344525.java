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

public class ExtendedProperties_putAll_841024344525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137230;
     Object term137290;

    public ExtendedProperties_putAll_841024344525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term137230 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term137380 = newInstance(Class.forName("java.lang.Object"));
        term137290 = new LinkedHashMap();
        ((LinkedHashMap) term137290).put(term137380, term137380);
        ((LinkedHashMap) term137290).put(term137380, term137380);
        ((LinkedHashMap) term137290).put(term137380, term137380);
        ((LinkedHashMap) term137290).put(term137380, term137380);
        ((LinkedHashMap) term137290).put(term137380, term137380);
        ((LinkedHashMap) term137290).put(term137380, term137380);
        ((LinkedHashMap) term137290).put(term137380, term137380);
        ((LinkedHashMap) term137290).put(term137380, term137380);
        ((LinkedHashMap) term137290).put(term137380, term137380);
        ((LinkedHashMap) term137290).put(term137380, term137380);
        ((LinkedHashMap) term137290).put(term137380, term137380);
        ((LinkedHashMap) term137290).put(term137380, term137380);
        ((LinkedHashMap) term137290).put(term137380, term137380);
        ((LinkedHashMap) term137290).put(term137380, term137380);
        ((LinkedHashMap) term137290).put(term137380, term137380);
        ((LinkedHashMap) term137290).put(term137380, term137380);
        ((LinkedHashMap) term137290).put(term137380, term137380);
        ((LinkedHashMap) term137290).put(term137380, term137380);
        ((LinkedHashMap) term137290).put(term137380, term137380);
        ((LinkedHashMap) term137290).put(term137380, term137380);
        ((LinkedHashMap) term137290).put(term137380, term137380);
        ((LinkedHashMap) term137290).put(term137380, term137380);
        ((LinkedHashMap) term137290).put(term137380, term137380);
        ((LinkedHashMap) term137290).put(term137380, term137380);
        ((LinkedHashMap) term137290).put(term137380, term137380);
        ((LinkedHashMap) term137290).put(term137380, term137380);
        ((LinkedHashMap) term137290).put(term137380, term137380);
        ((LinkedHashMap) term137290).put(term137380, term137380);
        ((LinkedHashMap) term137290).put(term137380, term137380);
        ((LinkedHashMap) term137290).put(term137380, term137380);
        ((LinkedHashMap) term137290).put(term137380, term137380);
        ((LinkedHashMap) term137290).put(term137380, term137380);
        ((LinkedHashMap) term137290).put(term137380, term137380);
        ((LinkedHashMap) term137290).put(term137380, term137380);
        ((LinkedHashMap) term137290).put(term137380, term137380);
        ((LinkedHashMap) term137290).put(term137380, term137380);
        ((LinkedHashMap) term137290).put(term137380, term137380);
        ((LinkedHashMap) term137290).put(term137380, term137380);
        ((LinkedHashMap) term137290).put(term137380, term137380);
        ((LinkedHashMap) term137290).put(term137380, term137380);
        ((LinkedHashMap) term137290).put(term137380, term137380);
        ((LinkedHashMap) term137290).put(term137380, term137380);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term137290;
        try {
            callMethod(klass, "putAll", argTypes, term137230, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


