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

public class FunctionType_setPrototypeNoCheck_1402626902483 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term443792;
     Object term444362;

    public FunctionType_setPrototypeNoCheck_1402626902483() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term446004 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term446003 = ((Class) term446004).getDeclaredField((String) "ORDINARY");
        ((Field) term446003).setAccessible(true);
        Object enum731 = ((Field) term446003).get((Object) null);
        term443792 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term443906 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term444006 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term444110 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term444006, term444006.getClass(), "ownerFunction", term444110);
        setField(term443906, term443906.getClass(), "type", term444006);
        setField(term443792, term443792.getClass(), "prototypeSlot", term443906);
        setField(term443792, term443792.getClass(), "source", null);
        setField(term443792, term443792.getClass(), "kind", enum731);
        setBooleanField(term443792, term443792.getClass(), "unknown", false);
        setField(term443792, term443792.getClass(), "subTypes", null);
        setBooleanField(term443792, term443792.getClass(), "nativeType", false);
        Class<? extends Object> term446295 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term446294 = ((Class) term446295).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term446294).setAccessible(true);
        Object enum732 = ((Field) term446294).get((Object) null);
        term444362 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term444362, term444362.getClass(), "ownerFunction", null);
        setBooleanField(term444362, term444362.getClass(), "unknown", false);
        setField(term444362, term444362.getClass(), "subTypes", null);
        setBooleanField(term444362, term444362.getClass(), "nativeType", false);
        setField(term444362, term444362.getClass(), "kind", enum732);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term444362;
        args[1] = null;
        try {
            callMethod(klass, "setPrototypeNoCheck", argTypes, term443792, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


