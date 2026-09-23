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

public class FunctionType_setPrototypeNoCheck_1402626902602 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term574617;
     Object term575491;

    public FunctionType_setPrototypeNoCheck_1402626902602() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term576892 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term576891 = ((Class) term576892).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term576891).setAccessible(true);
        Object enum938 = ((Field) term576891).get((Object) null);
        term574617 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term574731 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term574835 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term574943 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term574835, term574835.getClass(), "ownerFunction", term574943);
        setField(term574731, term574731.getClass(), "type", term574835);
        setField(term574617, term574617.getClass(), "prototypeSlot", term574731);
        setField(term574617, term574617.getClass(), "source", null);
        setField(term574617, term574617.getClass(), "kind", enum938);
        setBooleanField(term574617, term574617.getClass(), "unknown", false);
        setField(term574617, term574617.getClass(), "subTypes", null);
        setBooleanField(term574617, term574617.getClass(), "nativeType", false);
        ArrayList term575543 = new ArrayList();
        Class<? extends Object> term577192 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term577191 = ((Class) term577192).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term577191).setAccessible(true);
        Object enum939 = ((Field) term577191).get((Object) null);
        term575491 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term575491, term575491.getClass(), "ownerFunction", null);
        setBooleanField(term575491, term575491.getClass(), "unknown", false);
        setField(term575491, term575491.getClass(), "subTypes", term575543);
        setBooleanField(term575491, term575491.getClass(), "nativeType", false);
        setField(term575491, term575491.getClass(), "kind", enum939);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term575491;
        args[1] = null;
        try {
            callMethod(klass, "setPrototypeNoCheck", argTypes, term574617, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


