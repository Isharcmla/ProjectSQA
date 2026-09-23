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

public class FunctionType_setPrototypeNoCheck_1402626902620 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term594761;
     Object term595695;

    public FunctionType_setPrototypeNoCheck_1402626902620() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term597811 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term597810 = ((Class) term597811).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term597810).setAccessible(true);
        Object enum970 = ((Field) term597810).get((Object) null);
        ArrayList term595585 = new ArrayList();
        term594761 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term594875 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term594979 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term595089 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term594979, term594979.getClass(), "ownerFunction", term595089);
        setField(term594875, term594875.getClass(), "type", term594979);
        setField(term594761, term594761.getClass(), "prototypeSlot", term594875);
        setField(term594761, term594761.getClass(), "source", null);
        setField(term594761, term594761.getClass(), "kind", enum970);
        setBooleanField(term594761, term594761.getClass(), "unknown", false);
        setField(term594761, term594761.getClass(), "subTypes", term595585);
        setBooleanField(term594761, term594761.getClass(), "nativeType", false);
        ArrayList term595747 = new ArrayList();
        term595695 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term595695, term595695.getClass(), "ownerFunction", null);
        setBooleanField(term595695, term595695.getClass(), "unknown", false);
        setField(term595695, term595695.getClass(), "subTypes", term595747);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term595695;
        args[1] = null;
        try {
            callMethod(klass, "setPrototypeNoCheck", argTypes, term594761, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


