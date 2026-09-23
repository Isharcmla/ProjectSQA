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

public class FunctionType_tryMergeFunctionPiecewise_2003411845665 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term680735;
     Object term681315;

    public FunctionType_tryMergeFunctionPiecewise_2003411845665() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term682806 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term682805 = ((Class) term682806).getDeclaredField((String) "ORDINARY");
        ((Field) term682805).setAccessible(true);
        Object enum1038 = ((Field) term682805).get((Object) null);
        term680735 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term680829 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term680899 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term680969 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term681079 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term680969, term680969.getClass(), "jsType", null);
        setField(term680969, term680969.getClass(), "next", null);
        setField(term680899, term680899.getClass(), "first", term680969);
        setField(term680829, term680829.getClass(), "parameters", term680899);
        setField(term681079, term681079.getClass(), "kind", enum1038);
        setField(term680829, term680829.getClass(), "returnType", term681079);
        setField(term680735, term680735.getClass(), "call", term680829);
        Class<? extends Object> term683097 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term683096 = ((Class) term683097).getDeclaredField((String) "INTERFACE");
        ((Field) term683096).setAccessible(true);
        Object enum1039 = ((Field) term683096).get((Object) null);
        term681315 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term681409 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term681479 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term681549 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term681659 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term681549, term681549.getClass(), "jsType", null);
        setField(term681549, term681549.getClass(), "next", null);
        setField(term681479, term681479.getClass(), "first", term681549);
        setField(term681409, term681409.getClass(), "parameters", term681479);
        setField(term681659, term681659.getClass(), "kind", enum1039);
        setField(term681409, term681409.getClass(), "returnType", term681659);
        setField(term681315, term681315.getClass(), "call", term681409);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term681315;
        args[1] = false;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term680735, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


