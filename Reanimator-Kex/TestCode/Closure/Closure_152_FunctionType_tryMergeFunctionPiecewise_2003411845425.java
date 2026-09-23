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

public class FunctionType_tryMergeFunctionPiecewise_2003411845425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term341842;
     Object term342422;

    public FunctionType_tryMergeFunctionPiecewise_2003411845425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term343434 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term343433 = ((Class) term343434).getDeclaredField((String) "INTERFACE");
        ((Field) term343433).setAccessible(true);
        Object enum584 = ((Field) term343433).get((Object) null);
        term341842 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term341936 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term342006 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term342076 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term342186 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term342076, term342076.getClass(), "jsType", null);
        setField(term342076, term342076.getClass(), "next", null);
        setField(term342006, term342006.getClass(), "first", term342076);
        setField(term341936, term341936.getClass(), "parameters", term342006);
        setField(term342186, term342186.getClass(), "kind", enum584);
        setField(term341936, term341936.getClass(), "returnType", term342186);
        setField(term341842, term341842.getClass(), "call", term341936);
        term342422 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term342516 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term342586 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term342656 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term342766 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term342656, term342656.getClass(), "jsType", null);
        setField(term342656, term342656.getClass(), "next", null);
        setField(term342586, term342586.getClass(), "first", term342656);
        setField(term342516, term342516.getClass(), "parameters", term342586);
        setField(term342516, term342516.getClass(), "returnType", term342766);
        setField(term342422, term342422.getClass(), "call", term342516);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term342422;
        args[1] = false;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term341842, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


