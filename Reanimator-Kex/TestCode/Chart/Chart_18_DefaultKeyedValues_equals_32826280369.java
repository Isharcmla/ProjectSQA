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

public class DefaultKeyedValues_equals_32826280369 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8690;
     Object term9591;
     Object term9592;

    public DefaultKeyedValues_equals_32826280369() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8690 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues"));
        term9591 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues"));
        setField(term9591, term9591.getClass(), "keys", null);
        setField(term9591, term9591.getClass(), "values", null);
        setField(term9591, term9591.getClass(), "indexMap", null);
        term9592 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues"));
        setField(term9592, term9592.getClass(), "keys", null);
        setField(term9592, term9592.getClass(), "values", null);
        setField(term9592, term9592.getClass(), "indexMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.DefaultKeyedValues");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term8690;
        Object retValue = callMethod(klass, "equals", argTypes, term8690, args);
        assertTrue(recursiveEquals(term8690, term9591));
        assertTrue(recursiveEquals(term8690, term9592));
        assertTrue(recursiveEquals(retValue, true));
    }

};


