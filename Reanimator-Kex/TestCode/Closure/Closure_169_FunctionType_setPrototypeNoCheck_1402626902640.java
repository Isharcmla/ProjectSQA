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

public class FunctionType_setPrototypeNoCheck_1402626902640 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term618287;
     Object term618757;

    public FunctionType_setPrototypeNoCheck_1402626902640() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term620081 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term620080 = ((Class) term620081).getDeclaredField((String) "ORDINARY");
        ((Field) term620080).setAccessible(true);
        Object enum1008 = ((Field) term620080).get((Object) null);
        term618287 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term618401 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term618505 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term618505, term618505.getClass(), "ownerFunction", null);
        setField(term618401, term618401.getClass(), "type", term618505);
        setField(term618287, term618287.getClass(), "prototypeSlot", term618401);
        setField(term618287, term618287.getClass(), "source", null);
        setField(term618287, term618287.getClass(), "kind", enum1008);
        setBooleanField(term618287, term618287.getClass(), "unknown", false);
        setField(term618287, term618287.getClass(), "subTypes", null);
        setBooleanField(term618287, term618287.getClass(), "nativeType", false);
        Class<? extends Object> term620372 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term620371 = ((Class) term620372).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term620371).setAccessible(true);
        Object enum1009 = ((Field) term620371).get((Object) null);
        term618757 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term618757, term618757.getClass(), "ownerFunction", null);
        setBooleanField(term618757, term618757.getClass(), "unknown", false);
        setField(term618757, term618757.getClass(), "subTypes", null);
        setBooleanField(term618757, term618757.getClass(), "nativeType", false);
        setField(term618757, term618757.getClass(), "kind", enum1009);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term618757;
        args[1] = null;
        try {
            callMethod(klass, "setPrototypeNoCheck", argTypes, term618287, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


