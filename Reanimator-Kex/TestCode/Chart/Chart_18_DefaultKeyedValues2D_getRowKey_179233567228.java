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
import java.lang.IndexOutOfBoundsException;
import static org.jfree.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Integer;

public class DefaultKeyedValues2D_getRowKey_179233567228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49;
     Object term63;

    public DefaultKeyedValues2D_getRowKey_179233567228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term50 = new ArrayList();
        ArrayList term54 = new ArrayList();
        ArrayList term58 = new ArrayList();
        term49 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues2D"));
        setField(term49, term49.getClass(), "rowKeys", term50);
        setField(term49, term49.getClass(), "columnKeys", term54);
        setField(term49, term49.getClass(), "rows", term58);
        setBooleanField(term49, term49.getClass(), "sortRowKeys", true);
        term63 = new Integer(1484323161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.DefaultKeyedValues2D");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term63;
        try {
            callMethod(klass, "getRowKey", argTypes, term49, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


