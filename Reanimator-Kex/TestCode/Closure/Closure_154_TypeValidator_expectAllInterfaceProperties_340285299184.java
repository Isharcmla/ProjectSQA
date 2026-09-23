package com.google.javascript.jscomp;

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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class TypeValidator_expectAllInterfaceProperties_340285299184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57328;
     Object term57428;

    public TypeValidator_expectAllInterfaceProperties_340285299184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57328 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Class<? extends Object> term58486 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term58485 = ((Class) term58486).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term58485).setAccessible(true);
        Object enum23 = ((Field) term58485).get((Object) null);
        term57428 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term57428, term57428.getClass(), "kind", enum23);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term57428;
        try {
            callMethod(klass, "expectAllInterfaceProperties", argTypes, term57328, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


