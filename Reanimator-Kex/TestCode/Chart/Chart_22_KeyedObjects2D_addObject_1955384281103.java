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
import java.util.ArrayList;

public class KeyedObjects2D_addObject_1955384281103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21118;
     Object term21230;
     Object term21282;

    public KeyedObjects2D_addObject_1955384281103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term21170 = new ArrayList();
        term21118 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        setField(term21118, term21118.getClass(), "rowKeys", term21170);
        term21230 = newInstance(Class.forName("java.util.GregorianCalendar"));
        term21282 = newInstance(Class.forName("java.nio.HeapIntBufferR"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.KeyedObjects2D");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Comparable");
        argTypes[2] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term21230;
        args[2] = term21282;
        callMethod(klass, "addObject", argTypes, term21118, args);
    }

};


