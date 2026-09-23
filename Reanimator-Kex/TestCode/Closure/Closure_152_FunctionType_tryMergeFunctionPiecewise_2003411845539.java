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

public class FunctionType_tryMergeFunctionPiecewise_2003411845539 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term498033;
     Object term498729;

    public FunctionType_tryMergeFunctionPiecewise_2003411845539() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term500457 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term500456 = ((Class) term500457).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term500456).setAccessible(true);
        Object enum798 = ((Field) term500456).get((Object) null);
        term498033 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term498127 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term498197 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term498267 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term498377 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term498629 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term498267, term498267.getClass(), "jsType", null);
        setField(term498267, term498267.getClass(), "next", null);
        setField(term498197, term498197.getClass(), "first", term498267);
        setField(term498127, term498127.getClass(), "parameters", term498197);
        setField(term498377, term498377.getClass(), "kind", enum798);
        setField(term498377, term498377.getClass(), "registry", term498629);
        setField(term498127, term498127.getClass(), "returnType", term498377);
        setField(term498033, term498033.getClass(), "call", term498127);
        Class<? extends Object> term500757 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term500756 = ((Class) term500757).getDeclaredField((String) "INTERFACE");
        ((Field) term500756).setAccessible(true);
        Object enum799 = ((Field) term500756).get((Object) null);
        term498729 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term498823 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term498893 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term498963 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term499073 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term498963, term498963.getClass(), "jsType", null);
        setField(term498963, term498963.getClass(), "next", null);
        setField(term498893, term498893.getClass(), "first", term498963);
        setField(term498823, term498823.getClass(), "parameters", term498893);
        setField(term499073, term499073.getClass(), "kind", enum799);
        setField(term498823, term498823.getClass(), "returnType", term499073);
        setField(term498729, term498729.getClass(), "call", term498823);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term498729;
        args[1] = false;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term498033, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


