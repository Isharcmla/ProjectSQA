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

public class FunctionType_setPrototypeNoCheck_1402626902672 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term663466;
     Object term664006;

    public FunctionType_setPrototypeNoCheck_1402626902672() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term665347 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term665346 = ((Class) term665347).getDeclaredField((String) "ORDINARY");
        ((Field) term665346).setAccessible(true);
        Object enum1091 = ((Field) term665346).get((Object) null);
        term663466 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term663580 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term663684 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term663754 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term663684, term663684.getClass(), "ownerFunction", null);
        setField(term663580, term663580.getClass(), "type", term663684);
        setField(term663466, term663466.getClass(), "prototypeSlot", term663580);
        setField(term663466, term663466.getClass(), "source", term663754);
        setField(term663466, term663466.getClass(), "kind", enum1091);
        setBooleanField(term663466, term663466.getClass(), "unknown", false);
        setField(term663466, term663466.getClass(), "subTypes", null);
        setBooleanField(term663466, term663466.getClass(), "nativeType", false);
        Class<? extends Object> term665638 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term665637 = ((Class) term665638).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term665637).setAccessible(true);
        Object enum1092 = ((Field) term665637).get((Object) null);
        term664006 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term664006, term664006.getClass(), "ownerFunction", null);
        setBooleanField(term664006, term664006.getClass(), "unknown", false);
        setField(term664006, term664006.getClass(), "subTypes", null);
        setBooleanField(term664006, term664006.getClass(), "nativeType", false);
        setField(term664006, term664006.getClass(), "kind", enum1092);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term664006;
        args[1] = null;
        try {
            callMethod(klass, "setPrototypeNoCheck", argTypes, term663466, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


