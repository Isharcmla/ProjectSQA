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

public class FunctionType_setPrototypeNoCheck_1402626902688 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term684767;
     Object term685353;

    public FunctionType_setPrototypeNoCheck_1402626902688() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term686201 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term686200 = ((Class) term686201).getDeclaredField((String) "INTERFACE");
        ((Field) term686200).setAccessible(true);
        Object enum1125 = ((Field) term686200).get((Object) null);
        term684767 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term684881 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term684985 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term685095 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term684985, term684985.getClass(), "ownerFunction", term685095);
        setField(term684881, term684881.getClass(), "type", term684985);
        setField(term684767, term684767.getClass(), "prototypeSlot", term684881);
        setField(term684767, term684767.getClass(), "source", null);
        setField(term684767, term684767.getClass(), "kind", enum1125);
        term685353 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term685353, term685353.getClass(), "ownerFunction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term685353;
        args[1] = null;
        try {
            callMethod(klass, "setPrototypeNoCheck", argTypes, term684767, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


