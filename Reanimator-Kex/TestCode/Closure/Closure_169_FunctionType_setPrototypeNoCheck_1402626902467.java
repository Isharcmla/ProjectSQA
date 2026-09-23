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

public class FunctionType_setPrototypeNoCheck_1402626902467 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term426518;
     Object term427084;

    public FunctionType_setPrototypeNoCheck_1402626902467() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term428102 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term428101 = ((Class) term428102).getDeclaredField((String) "ORDINARY");
        ((Field) term428101).setAccessible(true);
        Object enum704 = ((Field) term428101).get((Object) null);
        term426518 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term426632 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term426732 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term426832 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term426732, term426732.getClass(), "ownerFunction", term426832);
        setField(term426632, term426632.getClass(), "type", term426732);
        setField(term426518, term426518.getClass(), "prototypeSlot", term426632);
        setField(term426518, term426518.getClass(), "source", null);
        setField(term426518, term426518.getClass(), "kind", enum704);
        setBooleanField(term426518, term426518.getClass(), "unknown", false);
        setField(term426518, term426518.getClass(), "subTypes", null);
        setBooleanField(term426518, term426518.getClass(), "nativeType", false);
        term427084 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term427272 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(term427084, term427084.getClass(), "ownerFunction", null);
        setBooleanField(term427084, term427084.getClass(), "unknown", false);
        setField(term427084, term427084.getClass(), "subTypes", null);
        setBooleanField(term427084, term427084.getClass(), "nativeType", false);
        setField(term427084, term427084.getClass(), "kind", enum704);
        setField(term427084, term427084.getClass(), "prototypeSlot", term427272);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term427084;
        args[1] = null;
        try {
            callMethod(klass, "setPrototypeNoCheck", argTypes, term426518, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


