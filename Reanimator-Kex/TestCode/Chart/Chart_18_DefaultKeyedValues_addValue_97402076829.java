package org.jfree.data;

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
import java.lang.IllegalArgumentException;
import static org.jfree.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.HashMap;
import java.lang.Double;

public class DefaultKeyedValues_addValue_97402076829 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89;
     Object term103;

    public DefaultKeyedValues_addValue_97402076829() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term90 = new ArrayList();
        ArrayList term94 = new ArrayList();
        HashMap term98 = new HashMap();
        term89 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues"));
        setField(term89, term89.getClass(), "keys", term90);
        setField(term89, term89.getClass(), "values", term94);
        setField(term89, term89.getClass(), "indexMap", term98);
        term103 = new Double(0.13238746331190498);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.DefaultKeyedValues");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Comparable");
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term103;
        try {
            callMethod(klass, "addValue", argTypes, term89, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


