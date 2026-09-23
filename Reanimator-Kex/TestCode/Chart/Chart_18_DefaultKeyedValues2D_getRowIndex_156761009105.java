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

public class DefaultKeyedValues2D_getRowIndex_156761009105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18803;
     Object term18907;
     Object term18927;
     Object term18930;

    public DefaultKeyedValues2D_getRowIndex_156761009105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term18855 = new ArrayList();
        term18803 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues2D"));
        setBooleanField(term18803, term18803.getClass(), "sortRowKeys", false);
        setField(term18803, term18803.getClass(), "rowKeys", term18855);
        term18907 = newInstance(Class.forName("java.nio.HeapByteBuffer"));
        ArrayList term18928 = new ArrayList();
        term18927 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues2D"));
        setField(term18927, term18927.getClass(), "rowKeys", term18928);
        setField(term18927, term18927.getClass(), "columnKeys", null);
        setField(term18927, term18927.getClass(), "rows", null);
        setBooleanField(term18927, term18927.getClass(), "sortRowKeys", false);
        term18930 = newInstance(Class.forName("java.nio.HeapByteBuffer"));
        setField(term18930, term18930.getClass(), "hb", null);
        setIntField(term18930, term18930.getClass(), "offset", 0);
        setBooleanField(term18930, term18930.getClass(), "isReadOnly", false);
        setBooleanField(term18930, term18930.getClass(), "bigEndian", false);
        setBooleanField(term18930, term18930.getClass(), "nativeByteOrder", false);
        setIntField(term18930, term18930.getClass(), "mark", 0);
        setIntField(term18930, term18930.getClass(), "position", 0);
        setIntField(term18930, term18930.getClass(), "limit", 0);
        setIntField(term18930, term18930.getClass(), "capacity", 0);
        setLongField(term18930, term18930.getClass(), "address", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.DefaultKeyedValues2D");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[1];
        args[0] = term18907;
        Object retValue = callMethod(klass, "getRowIndex", argTypes, term18803, args);
        assertTrue(recursiveEquals(term18803, term18927));
        assertTrue(recursiveEquals(term18907, term18930));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


