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

public class DefaultKeyedValues_setValue_9141055931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119;
     Object term133;

    public DefaultKeyedValues_setValue_9141055931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term120 = new ArrayList();
        ArrayList term124 = new ArrayList();
        HashMap term128 = new HashMap();
        term119 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues"));
        setField(term119, term119.getClass(), "keys", term120);
        setField(term119, term119.getClass(), "values", term124);
        setField(term119, term119.getClass(), "indexMap", term128);
        term133 = new Double(0.3455959125047594);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.DefaultKeyedValues");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Comparable");
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term133;
        try {
            callMethod(klass, "setValue", argTypes, term119, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


