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
import static org.jfree.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jfree.data.EqualityUtils.*;
import java.util.HashMap;
import java.util.ArrayList;
import java.lang.Integer;
import java.lang.Double;

public class DefaultKeyedValues_addValue_974020768114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37253;
     Object term37543;
     Object term37878;
     Object term37890;

    public DefaultKeyedValues_addValue_974020768114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term37301 = new HashMap();
        ArrayList term37353 = new ArrayList();
        ArrayList term37495 = new ArrayList();
        term37253 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues"));
        setField(term37253, term37253.getClass(), "indexMap", term37301);
        setField(term37253, term37253.getClass(), "keys", term37353);
        setField(term37253, term37253.getClass(), "values", term37495);
        term37543 = new Integer(0);
        Integer term37881 = new Integer(0);
        ArrayList term37879 = new ArrayList();
        ((ArrayList) term37879).add(term37881);
        Double term37884 = new Double(0.0);
        ArrayList term37882 = new ArrayList();
        ((ArrayList) term37882).add(term37884);
        HashMap term37885 = new HashMap();
        term37878 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues"));
        setField(term37878, term37878.getClass(), "keys", term37879);
        setField(term37878, term37878.getClass(), "values", term37882);
        setField(term37878, term37878.getClass(), "indexMap", term37885);
        term37890 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.DefaultKeyedValues");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Comparable");
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term37543;
        args[1] = 0.0;
        callMethod(klass, "addValue", argTypes, term37253, args);
        assertTrue(recursiveEquals(term37253, term37878));
        assertTrue(recursiveEquals(term37543, term37890));
    }

};


