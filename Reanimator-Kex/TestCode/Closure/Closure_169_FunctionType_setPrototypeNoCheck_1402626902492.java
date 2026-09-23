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

public class FunctionType_setPrototypeNoCheck_1402626902492 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term452723;
     Object term453177;

    public FunctionType_setPrototypeNoCheck_1402626902492() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term455406 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term455405 = ((Class) term455406).getDeclaredField((String) "ORDINARY");
        ((Field) term455405).setAccessible(true);
        Object enum746 = ((Field) term455405).get((Object) null);
        term452723 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term452837 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term452925 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term452925, term452925.getClass(), "ownerFunction", null);
        setField(term452837, term452837.getClass(), "type", term452925);
        setField(term452723, term452723.getClass(), "prototypeSlot", term452837);
        setField(term452723, term452723.getClass(), "source", null);
        setField(term452723, term452723.getClass(), "kind", enum746);
        setBooleanField(term452723, term452723.getClass(), "unknown", false);
        setField(term452723, term452723.getClass(), "subTypes", null);
        setBooleanField(term452723, term452723.getClass(), "nativeType", false);
        term453177 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term453365 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(term453177, term453177.getClass(), "ownerFunction", null);
        setBooleanField(term453177, term453177.getClass(), "unknown", false);
        setField(term453177, term453177.getClass(), "subTypes", null);
        setBooleanField(term453177, term453177.getClass(), "nativeType", false);
        setField(term453177, term453177.getClass(), "kind", enum746);
        setField(term453177, term453177.getClass(), "prototypeSlot", term453365);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term453177;
        args[1] = null;
        try {
            callMethod(klass, "setPrototypeNoCheck", argTypes, term452723, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


