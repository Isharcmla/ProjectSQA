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

public class TypeCheck_hasUnknownOrEmptySupertype_596579821266 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term374093;

    public TypeCheck_hasUnknownOrEmptySupertype_596579821266() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term375421 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term375420 = ((Class) term375421).getDeclaredField((String) "INTERFACE");
        ((Field) term375420).setAccessible(true);
        Object enum45 = ((Field) term375420).get((Object) null);
        term374093 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term374355 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term374461 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term374093, term374093.getClass(), "kind", enum45);
        setBooleanField(term374093, term374093.getClass(), "unknown", false);
        setField(term374355, term374355.getClass(), "type", term374093);
        setField(term374093, term374093.getClass(), "prototypeSlot", term374355);
        setField(term374093, term374093.getClass(), "implicitPrototypeFallback", term374461);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term374093;
        try {
            callMethod(klass, "hasUnknownOrEmptySupertype", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


