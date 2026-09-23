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

public class KeyedObjects2D_addObject_195538428132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139;
     Object term152;

    public KeyedObjects2D_addObject_195538428132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term140 = new ArrayList();
        ArrayList term144 = new ArrayList();
        ArrayList term148 = new ArrayList();
        term139 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        setField(term139, term139.getClass(), "rowKeys", term140);
        setField(term139, term139.getClass(), "columnKeys", term144);
        setField(term139, term139.getClass(), "rows", term148);
        term152 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.KeyedObjects2D");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Comparable");
        argTypes[2] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[3];
        args[0] = term152;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "addObject", argTypes, term139, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


