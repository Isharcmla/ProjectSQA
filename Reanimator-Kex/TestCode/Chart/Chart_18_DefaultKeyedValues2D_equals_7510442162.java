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

public class DefaultKeyedValues2D_equals_7510442162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8131;
     Object term8538;

    public DefaultKeyedValues2D_equals_7510442162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8131 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues2D"));
        term8538 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues2D"));
        setField(term8538, term8538.getClass(), "rowKeys", null);
        setField(term8538, term8538.getClass(), "columnKeys", null);
        setField(term8538, term8538.getClass(), "rows", null);
        setBooleanField(term8538, term8538.getClass(), "sortRowKeys", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.DefaultKeyedValues2D");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "equals", argTypes, term8131, args);
        assertTrue(recursiveEquals(term8131, term8538));
        assertTrue(recursiveEquals(retValue, false));
    }

};


