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
import java.util.ArrayList;

public class DefaultKeyedValues2D_equals_7510442143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term267;
     Object term281;
     Object term3898;
     Object term3905;

    public DefaultKeyedValues2D_equals_7510442143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term268 = new ArrayList();
        ArrayList term272 = new ArrayList();
        ArrayList term276 = new ArrayList();
        term267 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues2D"));
        setField(term267, term267.getClass(), "rowKeys", term268);
        setField(term267, term267.getClass(), "columnKeys", term272);
        setField(term267, term267.getClass(), "rows", term276);
        setBooleanField(term267, term267.getClass(), "sortRowKeys", false);
        term281 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term3899 = new ArrayList();
        ArrayList term3901 = new ArrayList();
        ArrayList term3903 = new ArrayList();
        term3898 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues2D"));
        setField(term3898, term3898.getClass(), "rowKeys", term3899);
        setField(term3898, term3898.getClass(), "columnKeys", term3901);
        setField(term3898, term3898.getClass(), "rows", term3903);
        setBooleanField(term3898, term3898.getClass(), "sortRowKeys", false);
        term3905 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.DefaultKeyedValues2D");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term281;
        Object retValue = callMethod(klass, "equals", argTypes, term267, args);
        assertTrue(recursiveEquals(term267, term3898));
        assertTrue(recursiveEquals(term281, term3905));
        assertTrue(recursiveEquals(retValue, false));
    }

};


