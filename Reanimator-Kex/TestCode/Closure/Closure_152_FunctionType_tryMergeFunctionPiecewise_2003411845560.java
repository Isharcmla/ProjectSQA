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
import java.lang.Object;
import java.lang.String;

public class FunctionType_tryMergeFunctionPiecewise_2003411845560 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term526524;
     Object term527220;

    public FunctionType_tryMergeFunctionPiecewise_2003411845560() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term530328 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term530327 = ((Class) term530328).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term530327).setAccessible(true);
        Object enum834 = ((Field) term530327).get((Object) null);
        term526524 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term526618 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term526688 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term526758 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term527509 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term527120 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term526758, term526758.getClass(), "jsType", null);
        setField(term526758, term526758.getClass(), "next", null);
        setField(term526688, term526688.getClass(), "first", term526758);
        setField(term526618, term526618.getClass(), "parameters", term526688);
        setField(term527509, term527509.getClass(), "kind", enum834);
        setField(term526618, term526618.getClass(), "returnType", term527509);
        setBooleanField(term526618, term526618.getClass(), "returnTypeInferred", false);
        setField(term526524, term526524.getClass(), "call", term526618);
        setField(term526524, term526524.getClass(), "typeOfThis", null);
        setField(term526524, term526524.getClass(), "registry", term527120);
        term527220 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term527314 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term527384 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term527454 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term527454, term527454.getClass(), "jsType", null);
        setField(term527454, term527454.getClass(), "next", null);
        setField(term527384, term527384.getClass(), "first", term527454);
        setField(term527314, term527314.getClass(), "parameters", term527384);
        setField(term527314, term527314.getClass(), "returnType", term527509);
        setBooleanField(term527314, term527314.getClass(), "returnTypeInferred", false);
        setField(term527220, term527220.getClass(), "call", term527314);
        setField(term527220, term527220.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term527220;
        args[1] = true;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term526524, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


