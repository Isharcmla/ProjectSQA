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

public class FunctionType_setPrototypeNoCheck_1402626902613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term586600;
     Object term587170;

    public FunctionType_setPrototypeNoCheck_1402626902613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term589969 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term589968 = ((Class) term589969).getDeclaredField((String) "INTERFACE");
        ((Field) term589968).setAccessible(true);
        Object enum958 = ((Field) term589968).get((Object) null);
        term586600 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term586714 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term586818 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term586918 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term586818, term586818.getClass(), "ownerFunction", term586918);
        setField(term586714, term586714.getClass(), "type", term586818);
        setField(term586600, term586600.getClass(), "prototypeSlot", term586714);
        setField(term586600, term586600.getClass(), "source", null);
        setField(term586600, term586600.getClass(), "kind", enum958);
        term587170 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term587170, term587170.getClass(), "ownerFunction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term587170;
        args[1] = null;
        try {
            callMethod(klass, "setPrototypeNoCheck", argTypes, term586600, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


