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
import java.util.ArrayList;

public class FunctionType_setPrototypeNoCheck_1402626902662 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term648190;
     Object term649092;

    public FunctionType_setPrototypeNoCheck_1402626902662() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term650575 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term650574 = ((Class) term650575).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term650574).setAccessible(true);
        Object enum1064 = ((Field) term650574).get((Object) null);
        ArrayList term648988 = new ArrayList();
        term648190 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term648304 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term648392 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term648492 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term648392, term648392.getClass(), "ownerFunction", term648492);
        setField(term648304, term648304.getClass(), "type", term648392);
        setField(term648190, term648190.getClass(), "prototypeSlot", term648304);
        setField(term648190, term648190.getClass(), "source", null);
        setField(term648190, term648190.getClass(), "kind", enum1064);
        setBooleanField(term648190, term648190.getClass(), "unknown", false);
        setField(term648190, term648190.getClass(), "subTypes", term648988);
        setBooleanField(term648190, term648190.getClass(), "nativeType", false);
        Class<? extends Object> term650875 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term650874 = ((Class) term650875).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term650874).setAccessible(true);
        Object enum1065 = ((Field) term650874).get((Object) null);
        term649092 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term649276 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term649092, term649092.getClass(), "ownerFunction", null);
        setBooleanField(term649092, term649092.getClass(), "unknown", false);
        setField(term649092, term649092.getClass(), "subTypes", null);
        setBooleanField(term649092, term649092.getClass(), "nativeType", false);
        setField(term649092, term649092.getClass(), "kind", enum1065);
        setField(term649092, term649092.getClass(), "typeOfThis", term649276);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term649092;
        args[1] = null;
        try {
            callMethod(klass, "setPrototypeNoCheck", argTypes, term648190, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


