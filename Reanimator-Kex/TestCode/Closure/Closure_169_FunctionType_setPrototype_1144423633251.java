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

public class FunctionType_setPrototype_1144423633251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term247380;
     Object term247632;

    public FunctionType_setPrototype_1144423633251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term248455 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term248454 = ((Class) term248455).getDeclaredField((String) "INTERFACE");
        ((Field) term248454).setAccessible(true);
        Object enum455 = ((Field) term248454).get((Object) null);
        term247380 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term247380, term247380.getClass(), "kind", enum455);
        setField(term247380, term247380.getClass(), "prototypeSlot", null);
        setField(term247380, term247380.getClass(), "source", null);
        term247632 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term247632, term247632.getClass(), "ownerFunction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term247632;
        args[1] = null;
        try {
            callMethod(klass, "setPrototype", argTypes, term247380, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


