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

public class FunctionType_setPrototypeNoCheck_1402626902524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term486365;
     Object term486937;

    public FunctionType_setPrototypeNoCheck_1402626902524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term489172 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term489171 = ((Class) term489172).getDeclaredField((String) "ORDINARY");
        ((Field) term489171).setAccessible(true);
        Object enum793 = ((Field) term489171).get((Object) null);
        term486365 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term486479 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term486579 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term486679 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term486579, term486579.getClass(), "ownerFunction", term486679);
        setField(term486479, term486479.getClass(), "type", term486579);
        setField(term486365, term486365.getClass(), "prototypeSlot", term486479);
        setField(term486365, term486365.getClass(), "source", null);
        setField(term486365, term486365.getClass(), "kind", enum793);
        setBooleanField(term486365, term486365.getClass(), "unknown", false);
        setField(term486365, term486365.getClass(), "subTypes", null);
        setBooleanField(term486365, term486365.getClass(), "nativeType", false);
        Class<? extends Object> term489463 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term489462 = ((Class) term489463).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term489462).setAccessible(true);
        Object enum794 = ((Field) term489462).get((Object) null);
        term486937 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term486937, term486937.getClass(), "ownerFunction", null);
        setBooleanField(term486937, term486937.getClass(), "unknown", false);
        setField(term486937, term486937.getClass(), "subTypes", null);
        setBooleanField(term486937, term486937.getClass(), "nativeType", false);
        setField(term486937, term486937.getClass(), "kind", enum794);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term486937;
        args[1] = null;
        try {
            callMethod(klass, "setPrototypeNoCheck", argTypes, term486365, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


