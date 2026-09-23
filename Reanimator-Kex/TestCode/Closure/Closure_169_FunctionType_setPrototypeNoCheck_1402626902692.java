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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class FunctionType_setPrototypeNoCheck_1402626902692 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term691559;
     Object term692135;

    public FunctionType_setPrototypeNoCheck_1402626902692() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term692245 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term692244 = ((Class) term692245).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term692244).setAccessible(true);
        Object enum1131 = ((Field) term692244).get((Object) null);
        term691559 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term691673 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term691777 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term691877 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term691777, term691777.getClass(), "ownerFunction", term691877);
        setField(term691673, term691673.getClass(), "type", term691777);
        setField(term691559, term691559.getClass(), "prototypeSlot", term691673);
        setField(term691559, term691559.getClass(), "source", null);
        setField(term691559, term691559.getClass(), "kind", enum1131);
        term692135 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term692243 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term692135, term692135.getClass(), "ownerFunction", null);
        setField(term692135, term692135.getClass(), "implicitPrototypeFallback", term692243);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term692135;
        args[1] = null;
        callMethod(klass, "setPrototypeNoCheck", argTypes, term691559, args);
    }

};


