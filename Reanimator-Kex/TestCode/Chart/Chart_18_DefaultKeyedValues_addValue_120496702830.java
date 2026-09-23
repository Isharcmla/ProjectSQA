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

public class DefaultKeyedValues_addValue_120496702830 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105;

    public DefaultKeyedValues_addValue_120496702830() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term106 = new ArrayList();
        ArrayList term110 = new ArrayList();
        HashMap term114 = new HashMap();
        term105 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues"));
        setField(term105, term105.getClass(), "keys", term106);
        setField(term105, term105.getClass(), "values", term110);
        setField(term105, term105.getClass(), "indexMap", term114);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.DefaultKeyedValues");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Comparable");
        argTypes[1] = Class.forName("java.lang.Number");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "addValue", argTypes, term105, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


