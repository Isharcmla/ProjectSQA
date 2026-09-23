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
import java.lang.Double;

public class DefaultKeyedValues_insertValue_90305159433 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149;
     Object term163;
     Object term165;

    public DefaultKeyedValues_insertValue_90305159433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term150 = new ArrayList();
        ArrayList term154 = new ArrayList();
        HashMap term158 = new HashMap();
        term149 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues"));
        setField(term149, term149.getClass(), "keys", term150);
        setField(term149, term149.getClass(), "values", term154);
        setField(term149, term149.getClass(), "indexMap", term158);
        term163 = new Integer(1484323161);
        term165 = new Double(0.5523635872663106);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.DefaultKeyedValues");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.Comparable");
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = term163;
        args[1] = null;
        args[2] = term165;
        try {
            callMethod(klass, "insertValue", argTypes, term149, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


