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

public class DefaultKeyedValues_equals_32826280362 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7486;
     Object term7524;
     Object term8138;
     Object term8139;

    public DefaultKeyedValues_equals_32826280362() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7486 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues"));
        term7524 = newInstance(Class.forName("java.lang.Object"));
        term8138 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues"));
        setField(term8138, term8138.getClass(), "keys", null);
        setField(term8138, term8138.getClass(), "values", null);
        setField(term8138, term8138.getClass(), "indexMap", null);
        term8139 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.DefaultKeyedValues");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term7524;
        Object retValue = callMethod(klass, "equals", argTypes, term7486, args);
        assertTrue(recursiveEquals(term7486, term8138));
        assertTrue(recursiveEquals(term7524, term8139));
        assertTrue(recursiveEquals(retValue, false));
    }

};


