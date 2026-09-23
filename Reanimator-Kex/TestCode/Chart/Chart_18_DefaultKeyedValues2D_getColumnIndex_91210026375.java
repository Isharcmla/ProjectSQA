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

public class DefaultKeyedValues2D_getColumnIndex_91210026375 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10746;
     Object term10868;
     Object term10885;
     Object term10888;

    public DefaultKeyedValues2D_getColumnIndex_91210026375() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term10798 = new ArrayList();
        term10746 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues2D"));
        setField(term10746, term10746.getClass(), "columnKeys", term10798);
        term10868 = newInstance(Class.forName("java.nio.ByteBufferAsIntBufferRL"));
        ArrayList term10886 = new ArrayList();
        term10885 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues2D"));
        setField(term10885, term10885.getClass(), "rowKeys", null);
        setField(term10885, term10885.getClass(), "columnKeys", term10886);
        setField(term10885, term10885.getClass(), "rows", null);
        setBooleanField(term10885, term10885.getClass(), "sortRowKeys", false);
        term10888 = newInstance(Class.forName("java.nio.ByteBufferAsIntBufferRL"));
        setField(term10888, term10888.getClass(), "bb", null);
        setField(term10888, term10888.getClass(), "hb", null);
        setIntField(term10888, term10888.getClass(), "offset", 0);
        setBooleanField(term10888, term10888.getClass(), "isReadOnly", false);
        setIntField(term10888, term10888.getClass(), "mark", 0);
        setIntField(term10888, term10888.getClass(), "position", 0);
        setIntField(term10888, term10888.getClass(), "limit", 0);
        setIntField(term10888, term10888.getClass(), "capacity", 0);
        setLongField(term10888, term10888.getClass(), "address", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.DefaultKeyedValues2D");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[1];
        args[0] = term10868;
        Object retValue = callMethod(klass, "getColumnIndex", argTypes, term10746, args);
        assertTrue(recursiveEquals(term10746, term10885));
        assertTrue(recursiveEquals(term10868, term10888));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


