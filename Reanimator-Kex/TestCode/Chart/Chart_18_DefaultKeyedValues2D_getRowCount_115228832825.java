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

public class DefaultKeyedValues2D_getRowCount_115228832825 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3;
     Object term369;

    public DefaultKeyedValues2D_getRowCount_115228832825() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4 = new ArrayList();
        ArrayList term8 = new ArrayList();
        ArrayList term12 = new ArrayList();
        term3 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues2D"));
        setField(term3, term3.getClass(), "rowKeys", term4);
        setField(term3, term3.getClass(), "columnKeys", term8);
        setField(term3, term3.getClass(), "rows", term12);
        setBooleanField(term3, term3.getClass(), "sortRowKeys", false);
        ArrayList term370 = new ArrayList();
        ArrayList term372 = new ArrayList();
        ArrayList term374 = new ArrayList();
        term369 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues2D"));
        setField(term369, term369.getClass(), "rowKeys", term370);
        setField(term369, term369.getClass(), "columnKeys", term372);
        setField(term369, term369.getClass(), "rows", term374);
        setBooleanField(term369, term369.getClass(), "sortRowKeys", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.DefaultKeyedValues2D");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRowCount", argTypes, term3, args);
        assertTrue(recursiveEquals(term3, term369));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


