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

public class FunctionType_tryMergeFunctionPiecewise_2003411845611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term602651;
     Object term603231;

    public FunctionType_tryMergeFunctionPiecewise_2003411845611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term604712 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term604711 = ((Class) term604712).getDeclaredField((String) "ORDINARY");
        ((Field) term604711).setAccessible(true);
        Object enum931 = ((Field) term604711).get((Object) null);
        term602651 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term602745 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term602815 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term602885 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term602995 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term602885, term602885.getClass(), "jsType", null);
        setField(term602885, term602885.getClass(), "next", null);
        setField(term602815, term602815.getClass(), "first", term602885);
        setField(term602745, term602745.getClass(), "parameters", term602815);
        setField(term602995, term602995.getClass(), "kind", enum931);
        setField(term602745, term602745.getClass(), "returnType", term602995);
        setField(term602651, term602651.getClass(), "call", term602745);
        Class<? extends Object> term605003 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term605002 = ((Class) term605003).getDeclaredField((String) "INTERFACE");
        ((Field) term605002).setAccessible(true);
        Object enum932 = ((Field) term605002).get((Object) null);
        term603231 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term603325 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term603395 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term603465 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term603565 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term603465, term603465.getClass(), "jsType", null);
        setField(term603465, term603465.getClass(), "next", null);
        setField(term603395, term603395.getClass(), "first", term603465);
        setField(term603325, term603325.getClass(), "parameters", term603395);
        setField(term603565, term603565.getClass(), "kind", enum932);
        setField(term603325, term603325.getClass(), "returnType", term603565);
        setField(term603231, term603231.getClass(), "call", term603325);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term603231;
        args[1] = true;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term602651, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


