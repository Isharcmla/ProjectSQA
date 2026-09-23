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

public class DefaultKeyedValues2D_getColumnCount_8342705626 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17;
     Object term391;

    public DefaultKeyedValues2D_getColumnCount_8342705626() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term18 = new ArrayList();
        ArrayList term22 = new ArrayList();
        ArrayList term26 = new ArrayList();
        term17 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues2D"));
        setField(term17, term17.getClass(), "rowKeys", term18);
        setField(term17, term17.getClass(), "columnKeys", term22);
        setField(term17, term17.getClass(), "rows", term26);
        setBooleanField(term17, term17.getClass(), "sortRowKeys", false);
        ArrayList term392 = new ArrayList();
        ArrayList term394 = new ArrayList();
        ArrayList term396 = new ArrayList();
        term391 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues2D"));
        setField(term391, term391.getClass(), "rowKeys", term392);
        setField(term391, term391.getClass(), "columnKeys", term394);
        setField(term391, term391.getClass(), "rows", term396);
        setBooleanField(term391, term391.getClass(), "sortRowKeys", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.DefaultKeyedValues2D");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getColumnCount", argTypes, term17, args);
        assertTrue(recursiveEquals(term17, term391));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


