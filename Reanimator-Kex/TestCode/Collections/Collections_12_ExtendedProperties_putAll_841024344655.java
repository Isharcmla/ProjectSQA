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

public class ExtendedProperties_putAll_841024344655 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term504515;
     Object term504575;

    public ExtendedProperties_putAll_841024344655() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term504515 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term504665 = newInstance(Class.forName("java.lang.Object"));
        term504575 = new LinkedHashMap();
        ((LinkedHashMap) term504575).put(term504665, term504665);
        ((LinkedHashMap) term504575).put(term504665, term504665);
        ((LinkedHashMap) term504575).put(term504665, term504665);
        ((LinkedHashMap) term504575).put(term504665, term504665);
        ((LinkedHashMap) term504575).put(term504665, term504665);
        ((LinkedHashMap) term504575).put(term504665, term504665);
        ((LinkedHashMap) term504575).put(term504665, term504665);
        ((LinkedHashMap) term504575).put(term504665, term504665);
        ((LinkedHashMap) term504575).put(term504665, term504665);
        ((LinkedHashMap) term504575).put(term504665, term504665);
        ((LinkedHashMap) term504575).put(term504665, term504665);
        ((LinkedHashMap) term504575).put(term504665, term504665);
        ((LinkedHashMap) term504575).put(term504665, term504665);
        ((LinkedHashMap) term504575).put(term504665, term504665);
        ((LinkedHashMap) term504575).put(term504665, term504665);
        ((LinkedHashMap) term504575).put(term504665, term504665);
        ((LinkedHashMap) term504575).put(term504665, term504665);
        ((LinkedHashMap) term504575).put(term504665, term504665);
        ((LinkedHashMap) term504575).put(term504665, term504665);
        ((LinkedHashMap) term504575).put(term504665, term504665);
        ((LinkedHashMap) term504575).put(term504665, term504665);
        ((LinkedHashMap) term504575).put(term504665, term504665);
        ((LinkedHashMap) term504575).put(term504665, term504665);
        ((LinkedHashMap) term504575).put(term504665, term504665);
        ((LinkedHashMap) term504575).put(term504665, term504665);
        ((LinkedHashMap) term504575).put(term504665, term504665);
        ((LinkedHashMap) term504575).put(term504665, term504665);
        ((LinkedHashMap) term504575).put(term504665, term504665);
        ((LinkedHashMap) term504575).put(term504665, term504665);
        ((LinkedHashMap) term504575).put(term504665, term504665);
        ((LinkedHashMap) term504575).put(term504665, term504665);
        ((LinkedHashMap) term504575).put(term504665, term504665);
        ((LinkedHashMap) term504575).put(term504665, term504665);
        ((LinkedHashMap) term504575).put(term504665, term504665);
        ((LinkedHashMap) term504575).put(term504665, term504665);
        ((LinkedHashMap) term504575).put(term504665, term504665);
        ((LinkedHashMap) term504575).put(term504665, term504665);
        ((LinkedHashMap) term504575).put(term504665, term504665);
        ((LinkedHashMap) term504575).put(term504665, term504665);
        ((LinkedHashMap) term504575).put(term504665, term504665);
        ((LinkedHashMap) term504575).put(term504665, term504665);
        ((LinkedHashMap) term504575).put(term504665, term504665);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term504575;
        try {
            callMethod(klass, "putAll", argTypes, term504515, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


