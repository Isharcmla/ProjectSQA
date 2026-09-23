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

public class DefaultKeyedValues2D_getColumnIndex_91210026332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109;

    public DefaultKeyedValues2D_getColumnIndex_91210026332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term110 = new ArrayList();
        ArrayList term114 = new ArrayList();
        ArrayList term118 = new ArrayList();
        term109 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues2D"));
        setField(term109, term109.getClass(), "rowKeys", term110);
        setField(term109, term109.getClass(), "columnKeys", term114);
        setField(term109, term109.getClass(), "rows", term118);
        setBooleanField(term109, term109.getClass(), "sortRowKeys", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.DefaultKeyedValues2D");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getColumnIndex", argTypes, term109, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


