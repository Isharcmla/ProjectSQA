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

public class DefaultKeyedValues2D_getRowIndex_15676100929 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65;

    public DefaultKeyedValues2D_getRowIndex_15676100929() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term66 = new ArrayList();
        ArrayList term70 = new ArrayList();
        ArrayList term74 = new ArrayList();
        term65 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues2D"));
        setField(term65, term65.getClass(), "rowKeys", term66);
        setField(term65, term65.getClass(), "columnKeys", term70);
        setField(term65, term65.getClass(), "rows", term74);
        setBooleanField(term65, term65.getClass(), "sortRowKeys", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.DefaultKeyedValues2D");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getRowIndex", argTypes, term65, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


