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

public class FunctionType_setPrototypeNoCheck_1402626902670 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term660500;
     Object term661366;

    public FunctionType_setPrototypeNoCheck_1402626902670() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term662294 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term662293 = ((Class) term662294).getDeclaredField((String) "INTERFACE");
        ((Field) term662293).setAccessible(true);
        Object enum1086 = ((Field) term662293).get((Object) null);
        term660500 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term660614 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term660718 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term660818 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term660718, term660718.getClass(), "ownerFunction", term660818);
        setField(term660614, term660614.getClass(), "type", term660718);
        setField(term660500, term660500.getClass(), "prototypeSlot", term660614);
        setField(term660500, term660500.getClass(), "source", null);
        setField(term660500, term660500.getClass(), "kind", enum1086);
        setBooleanField(term660500, term660500.getClass(), "unknown", false);
        setField(term660500, term660500.getClass(), "subTypes", null);
        setBooleanField(term660500, term660500.getClass(), "nativeType", false);
        ArrayList term661418 = new ArrayList();
        term661366 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term661366, term661366.getClass(), "ownerFunction", null);
        setBooleanField(term661366, term661366.getClass(), "unknown", false);
        setField(term661366, term661366.getClass(), "subTypes", term661418);
        setBooleanField(term661366, term661366.getClass(), "nativeType", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term661366;
        args[1] = null;
        try {
            callMethod(klass, "setPrototypeNoCheck", argTypes, term660500, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


