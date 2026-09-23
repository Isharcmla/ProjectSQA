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

public class FunctionType_setPrototypeNoCheck_1402626902526 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term491248;
     Object term491722;

    public FunctionType_setPrototypeNoCheck_1402626902526() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term493038 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term493037 = ((Class) term493038).getDeclaredField((String) "ORDINARY");
        ((Field) term493037).setAccessible(true);
        Object enum801 = ((Field) term493037).get((Object) null);
        term491248 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term491362 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term491470 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term491470, term491470.getClass(), "ownerFunction", null);
        setField(term491362, term491362.getClass(), "type", term491470);
        setField(term491248, term491248.getClass(), "prototypeSlot", term491362);
        setField(term491248, term491248.getClass(), "source", null);
        setField(term491248, term491248.getClass(), "kind", enum801);
        setBooleanField(term491248, term491248.getClass(), "unknown", false);
        setField(term491248, term491248.getClass(), "subTypes", null);
        setBooleanField(term491248, term491248.getClass(), "nativeType", false);
        Class<? extends Object> term493329 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term493328 = ((Class) term493329).getDeclaredField((String) "INTERFACE");
        ((Field) term493328).setAccessible(true);
        Object enum802 = ((Field) term493328).get((Object) null);
        term491722 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term491722, term491722.getClass(), "ownerFunction", null);
        setBooleanField(term491722, term491722.getClass(), "unknown", false);
        setField(term491722, term491722.getClass(), "subTypes", null);
        setBooleanField(term491722, term491722.getClass(), "nativeType", false);
        setField(term491722, term491722.getClass(), "kind", enum802);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term491722;
        args[1] = null;
        try {
            callMethod(klass, "setPrototypeNoCheck", argTypes, term491248, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


