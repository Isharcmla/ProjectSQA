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
import java.lang.String;
import java.lang.Object;

public class FunctionType_setPrototypeNoCheck_1402626902538 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term510652;
     Object term510904;

    public FunctionType_setPrototypeNoCheck_1402626902538() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term511725 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term511724 = ((Class) term511725).getDeclaredField((String) "INTERFACE");
        ((Field) term511724).setAccessible(true);
        Object enum837 = ((Field) term511724).get((Object) null);
        term510652 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term510652, term510652.getClass(), "prototypeSlot", null);
        setField(term510652, term510652.getClass(), "source", null);
        setField(term510652, term510652.getClass(), "kind", enum837);
        term510904 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term510904, term510904.getClass(), "ownerFunction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term510904;
        args[1] = null;
        try {
            callMethod(klass, "setPrototypeNoCheck", argTypes, term510652, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


