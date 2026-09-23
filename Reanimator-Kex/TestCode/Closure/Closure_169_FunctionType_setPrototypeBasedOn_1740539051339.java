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

public class FunctionType_setPrototypeBasedOn_1740539051339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term309776;
     Object term310028;

    public FunctionType_setPrototypeBasedOn_1740539051339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term310862 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term310861 = ((Class) term310862).getDeclaredField((String) "INTERFACE");
        ((Field) term310861).setAccessible(true);
        Object enum549 = ((Field) term310861).get((Object) null);
        term309776 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setBooleanField(term309776, term309776.getClass(), "nativeType", false);
        setField(term309776, term309776.getClass(), "kind", enum549);
        setField(term309776, term309776.getClass(), "prototypeSlot", null);
        setField(term309776, term309776.getClass(), "source", null);
        term310028 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term310028, term310028.getClass(), "className", null);
        setField(term310028, term310028.getClass(), "ownerFunction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term310028;
        args[1] = null;
        try {
            callMethod(klass, "setPrototypeBasedOn", argTypes, term309776, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


