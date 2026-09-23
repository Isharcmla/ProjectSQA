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
import java.lang.ClassCastException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class TypeCheck_hasUnknownOrEmptySupertype_59657982172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38001;

    public TypeCheck_hasUnknownOrEmptySupertype_59657982172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term39513 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term39512 = ((Class) term39513).getDeclaredField((String) "INTERFACE");
        ((Field) term39512).setAccessible(true);
        Object enum27 = ((Field) term39512).get((Object) null);
        term38001 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term38263 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term38357 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term38001, term38001.getClass(), "kind", enum27);
        setBooleanField(term38001, term38001.getClass(), "unknown", false);
        setField(term38263, term38263.getClass(), "type", term38357);
        setField(term38001, term38001.getClass(), "prototypeSlot", term38263);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term38001;
        try {
            callMethod(klass, "hasUnknownOrEmptySupertype", argTypes, null, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


