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

public class FunctionType_setPrototypeNoCheck_1402626902732 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term744888;
     Object term745430;

    public FunctionType_setPrototypeNoCheck_1402626902732() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term745432 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term745431 = ((Class) term745432).getDeclaredField((String) "INTERFACE");
        ((Field) term745431).setAccessible(true);
        Object enum1183 = ((Field) term745431).get((Object) null);
        term744888 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term745002 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term745090 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term745178 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term745090, term745090.getClass(), "ownerFunction", term745178);
        setField(term745002, term745002.getClass(), "type", term745090);
        setField(term744888, term744888.getClass(), "prototypeSlot", term745002);
        setField(term744888, term744888.getClass(), "source", null);
        setField(term744888, term744888.getClass(), "kind", enum1183);
        term745430 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term745430, term745430.getClass(), "ownerFunction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term745430;
        args[1] = null;
        callMethod(klass, "setPrototypeNoCheck", argTypes, term744888, args);
    }

};


