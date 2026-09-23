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

public class DefaultKeyedValues2D_removeRow_101837160539 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term209;

    public DefaultKeyedValues2D_removeRow_101837160539() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term210 = new ArrayList();
        ArrayList term214 = new ArrayList();
        ArrayList term218 = new ArrayList();
        term209 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues2D"));
        setField(term209, term209.getClass(), "rowKeys", term210);
        setField(term209, term209.getClass(), "columnKeys", term214);
        setField(term209, term209.getClass(), "rows", term218);
        setBooleanField(term209, term209.getClass(), "sortRowKeys", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.DefaultKeyedValues2D");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "removeRow", argTypes, term209, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


