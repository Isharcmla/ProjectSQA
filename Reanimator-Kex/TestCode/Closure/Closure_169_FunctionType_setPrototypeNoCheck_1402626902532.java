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

public class FunctionType_setPrototypeNoCheck_1402626902532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term499806;
     Object term500380;

    public FunctionType_setPrototypeNoCheck_1402626902532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term501704 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term501703 = ((Class) term501704).getDeclaredField((String) "ORDINARY");
        ((Field) term501703).setAccessible(true);
        Object enum818 = ((Field) term501703).get((Object) null);
        term499806 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term499920 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term500020 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term500128 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term500020, term500020.getClass(), "ownerFunction", term500128);
        setField(term499920, term499920.getClass(), "type", term500020);
        setField(term499806, term499806.getClass(), "prototypeSlot", term499920);
        setField(term499806, term499806.getClass(), "source", null);
        setField(term499806, term499806.getClass(), "kind", enum818);
        setBooleanField(term499806, term499806.getClass(), "unknown", false);
        setField(term499806, term499806.getClass(), "subTypes", null);
        setBooleanField(term499806, term499806.getClass(), "nativeType", false);
        Class<? extends Object> term501995 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term501994 = ((Class) term501995).getDeclaredField((String) "INTERFACE");
        ((Field) term501994).setAccessible(true);
        Object enum819 = ((Field) term501994).get((Object) null);
        term500380 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term500380, term500380.getClass(), "ownerFunction", null);
        setBooleanField(term500380, term500380.getClass(), "unknown", false);
        setField(term500380, term500380.getClass(), "subTypes", null);
        setBooleanField(term500380, term500380.getClass(), "nativeType", false);
        setField(term500380, term500380.getClass(), "kind", enum819);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term500380;
        args[1] = null;
        try {
            callMethod(klass, "setPrototypeNoCheck", argTypes, term499806, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


