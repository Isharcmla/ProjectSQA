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

public class DefaultKeyedValues2D_getColumnKey_180431345631 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93;
     Object term107;

    public DefaultKeyedValues2D_getColumnKey_180431345631() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term94 = new ArrayList();
        ArrayList term98 = new ArrayList();
        ArrayList term102 = new ArrayList();
        term93 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues2D"));
        setField(term93, term93.getClass(), "rowKeys", term94);
        setField(term93, term93.getClass(), "columnKeys", term98);
        setField(term93, term93.getClass(), "rows", term102);
        setBooleanField(term93, term93.getClass(), "sortRowKeys", true);
        term107 = new Integer(391863371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.DefaultKeyedValues2D");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term107;
        try {
            callMethod(klass, "getColumnKey", argTypes, term93, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


