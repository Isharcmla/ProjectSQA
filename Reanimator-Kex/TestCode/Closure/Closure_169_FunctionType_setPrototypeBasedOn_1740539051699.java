package com.google.javascript.rhino.jstype;

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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class FunctionType_setPrototypeBasedOn_1740539051699 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term698786;
     Object term699494;

    public FunctionType_setPrototypeBasedOn_1740539051699() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term699496 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term699495 = ((Class) term699496).getDeclaredField((String) "INTERFACE");
        ((Field) term699495).setAccessible(true);
        Object enum1137 = ((Field) term699495).get((Object) null);
        Class<? extends Object> term699790 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term699789 = ((Class) term699790).getDeclaredField((String) "ORDINARY");
        ((Field) term699789).setAccessible(true);
        Object enum1138 =  ((Field) term699789).get((Object) null);
        Object term699390 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term699056 = new ArrayList();
        ((ArrayList) term699056).add(enum1138);
        ((ArrayList) term699056).add(term699390);
        term698786 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term699004 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setBooleanField(term698786, term698786.getClass(), "nativeType", false);
        setField(term698786, term698786.getClass(), "kind", enum1137);
        setField(term698786, term698786.getClass(), "prototypeSlot", null);
        setField(term698786, term698786.getClass(), "source", term699004);
        setField(term698786, term698786.getClass(), "extendedInterfaces", term699056);
        term699494 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term699494, term699494.getClass(), "className", null);
        setField(term699494, term699494.getClass(), "ownerFunction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term699494;
        args[1] = null;
        callMethod(klass, "setPrototypeBasedOn", argTypes, term698786, args);
    }

};


