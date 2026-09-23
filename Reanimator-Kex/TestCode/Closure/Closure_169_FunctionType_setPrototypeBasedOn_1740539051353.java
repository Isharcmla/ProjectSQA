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

public class FunctionType_setPrototypeBasedOn_1740539051353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term320371;
     Object term320607;

    public FunctionType_setPrototypeBasedOn_1740539051353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term321441 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term321440 = ((Class) term321441).getDeclaredField((String) "INTERFACE");
        ((Field) term321440).setAccessible(true);
        Object enum558 = ((Field) term321440).get((Object) null);
        term320371 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setBooleanField(term320371, term320371.getClass(), "nativeType", false);
        setField(term320371, term320371.getClass(), "kind", enum558);
        setField(term320371, term320371.getClass(), "prototypeSlot", null);
        setField(term320371, term320371.getClass(), "source", null);
        term320607 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term320607, term320607.getClass(), "className", null);
        setField(term320607, term320607.getClass(), "ownerFunction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term320607;
        args[1] = null;
        try {
            callMethod(klass, "setPrototypeBasedOn", argTypes, term320371, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


