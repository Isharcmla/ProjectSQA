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

public class DefaultKeyedValues2D_equals_7510442169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9195;
     Object term9703;
     Object term9704;

    public DefaultKeyedValues2D_equals_7510442169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9195 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues2D"));
        term9703 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues2D"));
        setField(term9703, term9703.getClass(), "rowKeys", null);
        setField(term9703, term9703.getClass(), "columnKeys", null);
        setField(term9703, term9703.getClass(), "rows", null);
        setBooleanField(term9703, term9703.getClass(), "sortRowKeys", false);
        term9704 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues2D"));
        setField(term9704, term9704.getClass(), "rowKeys", null);
        setField(term9704, term9704.getClass(), "columnKeys", null);
        setField(term9704, term9704.getClass(), "rows", null);
        setBooleanField(term9704, term9704.getClass(), "sortRowKeys", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.DefaultKeyedValues2D");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term9195;
        Object retValue = callMethod(klass, "equals", argTypes, term9195, args);
        assertTrue(recursiveEquals(term9195, term9703));
        assertTrue(recursiveEquals(term9195, term9704));
        assertTrue(recursiveEquals(retValue, true));
    }

};


