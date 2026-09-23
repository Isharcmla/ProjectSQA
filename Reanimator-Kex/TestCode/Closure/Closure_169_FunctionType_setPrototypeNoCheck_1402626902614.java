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

public class FunctionType_setPrototypeNoCheck_1402626902614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term587753;
     Object term588741;

    public FunctionType_setPrototypeNoCheck_1402626902614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term591494 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term591493 = ((Class) term591494).getDeclaredField((String) "INTERFACE");
        ((Field) term591493).setAccessible(true);
        Object enum961 = ((Field) term591493).get((Object) null);
        ArrayList term588631 = new ArrayList();
        term587753 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term587867 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term587955 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term588065 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term588135 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term587955, term587955.getClass(), "ownerFunction", term588065);
        setField(term587867, term587867.getClass(), "type", term587955);
        setField(term587753, term587753.getClass(), "prototypeSlot", term587867);
        setField(term587753, term587753.getClass(), "source", term588135);
        setField(term587753, term587753.getClass(), "kind", enum961);
        setBooleanField(term587753, term587753.getClass(), "unknown", false);
        setField(term587753, term587753.getClass(), "subTypes", term588631);
        setBooleanField(term587753, term587753.getClass(), "nativeType", false);
        Class<? extends Object> term591788 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term591787 = ((Class) term591788).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term591787).setAccessible(true);
        Object enum962 = ((Field) term591787).get((Object) null);
        term588741 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term588741, term588741.getClass(), "ownerFunction", null);
        setBooleanField(term588741, term588741.getClass(), "unknown", false);
        setField(term588741, term588741.getClass(), "subTypes", null);
        setBooleanField(term588741, term588741.getClass(), "nativeType", false);
        setField(term588741, term588741.getClass(), "kind", enum962);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term588741;
        args[1] = null;
        try {
            callMethod(klass, "setPrototypeNoCheck", argTypes, term587753, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


