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
import java.lang.Integer;

public class DefaultKeyedValues_insertValue_121292790634 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term167;
     Object term181;

    public DefaultKeyedValues_insertValue_121292790634() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term168 = new ArrayList();
        ArrayList term172 = new ArrayList();
        HashMap term176 = new HashMap();
        term167 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues"));
        setField(term167, term167.getClass(), "keys", term168);
        setField(term167, term167.getClass(), "values", term172);
        setField(term167, term167.getClass(), "indexMap", term176);
        term181 = new Integer(391863371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.DefaultKeyedValues");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.Comparable");
        argTypes[2] = Class.forName("java.lang.Number");
        Object[] args = new Object[3];
        args[0] = term181;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "insertValue", argTypes, term167, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


