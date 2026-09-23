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

public class FunctionType_setPrototypeNoCheck_1402626902648 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term628493;
     Object term629053;

    public FunctionType_setPrototypeNoCheck_1402626902648() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term630011 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term630010 = ((Class) term630011).getDeclaredField((String) "INTERFACE");
        ((Field) term630010).setAccessible(true);
        Object enum1027 = ((Field) term630010).get((Object) null);
        term628493 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term628607 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term628695 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term628795 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term628695, term628695.getClass(), "ownerFunction", term628795);
        setField(term628607, term628607.getClass(), "type", term628695);
        setField(term628493, term628493.getClass(), "prototypeSlot", term628607);
        setField(term628493, term628493.getClass(), "source", null);
        setField(term628493, term628493.getClass(), "kind", enum1027);
        term629053 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term629161 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term629053, term629053.getClass(), "ownerFunction", null);
        setField(term629053, term629053.getClass(), "implicitPrototypeFallback", term629161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term629053;
        args[1] = null;
        try {
            callMethod(klass, "setPrototypeNoCheck", argTypes, term628493, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


