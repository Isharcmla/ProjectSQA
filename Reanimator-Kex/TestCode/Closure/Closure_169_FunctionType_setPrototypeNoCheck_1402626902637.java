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

public class FunctionType_setPrototypeNoCheck_1402626902637 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term611427;
     Object term611997;

    public FunctionType_setPrototypeNoCheck_1402626902637() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term614981 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term614980 = ((Class) term614981).getDeclaredField((String) "ORDINARY");
        ((Field) term614980).setAccessible(true);
        Object enum997 = ((Field) term614980).get((Object) null);
        term611427 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term611541 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term611645 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term611745 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term611645, term611645.getClass(), "ownerFunction", term611745);
        setField(term611541, term611541.getClass(), "type", term611645);
        setField(term611427, term611427.getClass(), "prototypeSlot", term611541);
        setField(term611427, term611427.getClass(), "source", null);
        setField(term611427, term611427.getClass(), "kind", enum997);
        setBooleanField(term611427, term611427.getClass(), "unknown", false);
        setField(term611427, term611427.getClass(), "subTypes", null);
        setBooleanField(term611427, term611427.getClass(), "nativeType", false);
        term611997 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term612185 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term612293 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term612407 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(term611997, term611997.getClass(), "ownerFunction", null);
        setBooleanField(term611997, term611997.getClass(), "unknown", false);
        setField(term611997, term611997.getClass(), "subTypes", null);
        setBooleanField(term611997, term611997.getClass(), "nativeType", false);
        setField(term611997, term611997.getClass(), "kind", enum997);
        setBooleanField(term612293, term612293.getClass(), "unknown", false);
        setField(term612293, term612293.getClass(), "subTypes", null);
        setBooleanField(term612293, term612293.getClass(), "nativeType", false);
        setField(term612293, term612293.getClass(), "kind", enum997);
        setField(term612293, term612293.getClass(), "prototypeSlot", term612407);
        setField(term612185, term612185.getClass(), "type", term612293);
        setField(term611997, term611997.getClass(), "prototypeSlot", term612185);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term611997;
        args[1] = null;
        try {
            callMethod(klass, "setPrototypeNoCheck", argTypes, term611427, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


