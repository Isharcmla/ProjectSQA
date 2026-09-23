package org.jfree.data.statistics;

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
import static org.jfree.data.statistics.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.lang.Character;

public class DefaultBoxAndWhiskerCategoryDataset_getMaxRegularValue_344942208190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43025;
     Object enum10;
     Object term43205;

    public DefaultBoxAndWhiskerCategoryDataset_getMaxRegularValue_344942208190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43025 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        Object term43089 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        setField(term43025, term43025.getClass(), "data", term43089);
        Class<? extends Object> term43787 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term43786 = ((Class) term43787).getDeclaredField((String) "NANOSECONDS");
        ((Field) term43786).setAccessible(true);
        enum10 = ((Field) term43786).get((Object) null);
        term43205 = new Character((char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Comparable");
        argTypes[1] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[2];
        args[0] = enum10;
        args[1] = term43205;
        try {
            callMethod(klass, "getMaxRegularValue", argTypes, term43025, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


