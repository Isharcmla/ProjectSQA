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
import org.jfree.data.UnknownKeyException;
import static org.jfree.data.statistics.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;

public class DefaultBoxAndWhiskerCategoryDataset_getQ3Value_562318090248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61041;
     Object enum26;
     Object term61281;

    public DefaultBoxAndWhiskerCategoryDataset_getQ3Value_562318090248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term61157 = new ArrayList();
        term61041 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        Object term61105 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        setField(term61105, term61105.getClass(), "rowKeys", term61157);
        setField(term61041, term61041.getClass(), "data", term61105);
        Class<? extends Object> term62040 = Class.forName((String) "java.util.Locale$IsoCountryCode");
        Field term62039 = ((Class) term62040).getDeclaredField((String) "PART1_ALPHA2");
        ((Field) term62039).setAccessible(true);
        enum26 = ((Field) term62039).get((Object) null);
        term61281 = newInstance(Class.forName("java.nio.HeapLongBuffer"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Comparable");
        argTypes[1] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[2];
        args[0] = enum26;
        args[1] = term61281;
        try {
            callMethod(klass, "getQ3Value", argTypes, term61041, args);
            assertTrue(false);
        }
        catch (UnknownKeyException e) {
        }

    }

};


