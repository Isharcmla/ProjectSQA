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

public class DefaultKeyedValues2D_getColumnKeys_7725898733 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123;
     Object term1872;
     Object term1857;

    public DefaultKeyedValues2D_getColumnKeys_7725898733() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term124 = new ArrayList();
        ArrayList term128 = new ArrayList();
        ArrayList term132 = new ArrayList();
        term123 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues2D"));
        setField(term123, term123.getClass(), "rowKeys", term124);
        setField(term123, term123.getClass(), "columnKeys", term128);
        setField(term123, term123.getClass(), "rows", term132);
        setBooleanField(term123, term123.getClass(), "sortRowKeys", true);
        ArrayList term1873 = new ArrayList();
        ArrayList term1875 = new ArrayList();
        ArrayList term1877 = new ArrayList();
        term1872 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues2D"));
        setField(term1872, term1872.getClass(), "rowKeys", term1873);
        setField(term1872, term1872.getClass(), "columnKeys", term1875);
        setField(term1872, term1872.getClass(), "rows", term1877);
        setBooleanField(term1872, term1872.getClass(), "sortRowKeys", true);
        ArrayList term1858 = new ArrayList();
        term1857 = newInstance(Class.forName("java.util.Collections$UnmodifiableRandomAccessList"));
        setField(term1857, term1857.getClass(), "list", term1858);
        setField(term1857, term1857.getClass(), "c", term1858);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.DefaultKeyedValues2D");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getColumnKeys", argTypes, term123, args);
        assertTrue(recursiveEquals(term123, term1872));
        assertTrue(recursiveEquals(retValue, term1857));
    }

};


