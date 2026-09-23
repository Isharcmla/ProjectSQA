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

public class FunctionType_setPrototypeNoCheck_1402626902711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term713288;
     Object term713864;

    public FunctionType_setPrototypeNoCheck_1402626902711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term714102 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term714101 = ((Class) term714102).getDeclaredField((String) "ORDINARY");
        ((Field) term714101).setAccessible(true);
        Object enum1151 = ((Field) term714101).get((Object) null);
        term713288 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term713402 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term713506 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term713606 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term713506, term713506.getClass(), "ownerFunction", term713606);
        setField(term713402, term713402.getClass(), "type", term713506);
        setField(term713288, term713288.getClass(), "prototypeSlot", term713402);
        setField(term713288, term713288.getClass(), "source", null);
        setField(term713288, term713288.getClass(), "kind", enum1151);
        setBooleanField(term713288, term713288.getClass(), "unknown", false);
        setField(term713288, term713288.getClass(), "subTypes", null);
        setBooleanField(term713288, term713288.getClass(), "nativeType", false);
        Class<? extends Object> term714393 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term714392 = ((Class) term714393).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term714392).setAccessible(true);
        Object enum1152 = ((Field) term714392).get((Object) null);
        term713864 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term714100 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term713864, term713864.getClass(), "ownerFunction", null);
        setBooleanField(term713864, term713864.getClass(), "unknown", false);
        setField(term713864, term713864.getClass(), "subTypes", null);
        setBooleanField(term713864, term713864.getClass(), "nativeType", false);
        setField(term713864, term713864.getClass(), "kind", enum1152);
        setField(term713864, term713864.getClass(), "typeOfThis", term714100);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term713864;
        args[1] = null;
        callMethod(klass, "setPrototypeNoCheck", argTypes, term713288, args);
    }

};


