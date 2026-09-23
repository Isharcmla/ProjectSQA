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

public class DefaultKeyedValues2D_setValue_6251054936 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term165;

    public DefaultKeyedValues2D_setValue_6251054936() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term166 = new ArrayList();
        ArrayList term170 = new ArrayList();
        ArrayList term174 = new ArrayList();
        term165 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues2D"));
        setField(term165, term165.getClass(), "rowKeys", term166);
        setField(term165, term165.getClass(), "columnKeys", term170);
        setField(term165, term165.getClass(), "rows", term174);
        setBooleanField(term165, term165.getClass(), "sortRowKeys", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.DefaultKeyedValues2D");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Number");
        argTypes[1] = Class.forName("java.lang.Comparable");
        argTypes[2] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "setValue", argTypes, term165, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


