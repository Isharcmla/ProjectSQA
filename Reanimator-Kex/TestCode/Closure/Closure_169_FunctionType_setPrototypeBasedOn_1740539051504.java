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
import java.lang.NullPointerException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class FunctionType_setPrototypeBasedOn_1740539051504 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term467454;

    public FunctionType_setPrototypeBasedOn_1740539051504() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term469736 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term469735 = ((Class) term469736).getDeclaredField((String) "INTERFACE");
        ((Field) term469735).setAccessible(true);
        Object enum765 = ((Field) term469735).get((Object) null);
        term467454 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term467454, term467454.getClass(), "className", null);
        setField(term467454, term467454.getClass(), "ownerFunction", null);
        setBooleanField(term467454, term467454.getClass(), "nativeType", true);
        setField(term467454, term467454.getClass(), "registry", null);
        setField(term467454, term467454.getClass(), "kind", enum765);
        setField(term467454, term467454.getClass(), "prototypeSlot", null);
        setField(term467454, term467454.getClass(), "source", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term467454;
        args[1] = null;
        try {
            callMethod(klass, "setPrototypeBasedOn", argTypes, term467454, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


