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

public class KeyedObjects2D_equals_45641325239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term236;
     Object term249;
     Object term3896;
     Object term3903;

    public KeyedObjects2D_equals_45641325239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term237 = new ArrayList();
        ArrayList term241 = new ArrayList();
        ArrayList term245 = new ArrayList();
        term236 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        setField(term236, term236.getClass(), "rowKeys", term237);
        setField(term236, term236.getClass(), "columnKeys", term241);
        setField(term236, term236.getClass(), "rows", term245);
        term249 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term3897 = new ArrayList();
        ArrayList term3899 = new ArrayList();
        ArrayList term3901 = new ArrayList();
        term3896 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        setField(term3896, term3896.getClass(), "rowKeys", term3897);
        setField(term3896, term3896.getClass(), "columnKeys", term3899);
        setField(term3896, term3896.getClass(), "rows", term3901);
        term3903 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.KeyedObjects2D");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term249;
        Object retValue = callMethod(klass, "equals", argTypes, term236, args);
        assertTrue(recursiveEquals(term236, term3896));
        assertTrue(recursiveEquals(term249, term3903));
        assertTrue(recursiveEquals(retValue, false));
    }

};


