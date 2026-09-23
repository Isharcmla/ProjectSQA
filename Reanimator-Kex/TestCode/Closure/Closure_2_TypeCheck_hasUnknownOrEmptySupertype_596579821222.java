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

public class TypeCheck_hasUnknownOrEmptySupertype_596579821222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term362741;

    public TypeCheck_hasUnknownOrEmptySupertype_596579821222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term364035 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term364034 = ((Class) term364035).getDeclaredField((String) "INTERFACE");
        ((Field) term364034).setAccessible(true);
        Object enum39 = ((Field) term364034).get((Object) null);
        term362741 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term362981 = newInstance(Class.forName("com.google.javascript.rhino.jstype.Property"));
        Object term363087 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term362741, term362741.getClass(), "kind", enum39);
        setBooleanField(term362741, term362741.getClass(), "unknown", false);
        setField(term362981, term362981.getClass(), "type", term362741);
        setField(term362741, term362741.getClass(), "prototypeSlot", term362981);
        setField(term362741, term362741.getClass(), "implicitPrototypeFallback", term363087);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term362741;
        try {
            callMethod(klass, "hasUnknownOrEmptySupertype", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


