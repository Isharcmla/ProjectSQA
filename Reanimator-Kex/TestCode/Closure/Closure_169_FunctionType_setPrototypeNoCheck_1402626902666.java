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

public class FunctionType_setPrototypeNoCheck_1402626902666 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term654342;
     Object term654708;
     Object term654778;

    public FunctionType_setPrototypeNoCheck_1402626902666() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term655621 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term655620 = ((Class) term655621).getDeclaredField((String) "INTERFACE");
        ((Field) term655620).setAccessible(true);
        Object enum1074 = ((Field) term655620).get((Object) null);
        term654342 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term654456 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(term654456, term654456.getClass(), "type", null);
        setField(term654342, term654342.getClass(), "prototypeSlot", term654456);
        setField(term654342, term654342.getClass(), "kind", enum1074);
        term654708 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term654708, term654708.getClass(), "ownerFunction", null);
        term654778 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term654708;
        args[1] = term654778;
        try {
            callMethod(klass, "setPrototypeNoCheck", argTypes, term654342, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


