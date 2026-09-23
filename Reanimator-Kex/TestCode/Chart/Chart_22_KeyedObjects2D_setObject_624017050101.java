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
import java.lang.String;
import java.lang.Object;

public class KeyedObjects2D_setObject_624017050101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19807;
     Object enum6;
     Object enum7;

    public KeyedObjects2D_setObject_624017050101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term19859 = new ArrayList();
        term19807 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        setField(term19807, term19807.getClass(), "rowKeys", term19859);
        Class<? extends Object> term20164 = Class.forName((String) "java.nio.file.attribute.PosixFilePermission");
        Field term20163 = ((Class) term20164).getDeclaredField((String) "OWNER_READ");
        ((Field) term20163).setAccessible(true);
        enum6 = ((Field) term20163).get((Object) null);
        Class<? extends Object> term20559 = Class.forName((String) "java.lang.annotation.ElementType");
        Field term20558 = ((Class) term20559).getDeclaredField((String) "TYPE");
        ((Field) term20558).setAccessible(true);
        enum7 = ((Field) term20558).get((Object) null);
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
        args[1] = enum6;
        args[2] = enum7;
        callMethod(klass, "setObject", argTypes, term19807, args);
    }

};


