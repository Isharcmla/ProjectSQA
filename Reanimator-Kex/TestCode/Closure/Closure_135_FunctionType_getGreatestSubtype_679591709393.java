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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.jstype.EqualityUtils.*;
import java.lang.String;
import java.lang.Object;

public class FunctionType_getGreatestSubtype_679591709393 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term244928;
     Object term245184;
     Object term245640;
     Object term245644;
     Object term245554;

    public FunctionType_getGreatestSubtype_679591709393() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term245649 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term245648 = ((Class) term245649).getDeclaredField((String) "INTERFACE");
        ((Field) term245648).setAccessible(true);
        Object enum443 = ((Field) term245648).get((Object) null);
        term244928 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term244928, term244928.getClass(), "kind", enum443);
        term245184 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term245184, term245184.getClass(), "kind", enum443);
        Class<? extends Object> term245943 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term245942 = ((Class) term245943).getDeclaredField((String) "INTERFACE");
        ((Field) term245942).setAccessible(true);
        Object enum444 = ((Field) term245942).get((Object) null);
        term245640 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term245640, term245640.getClass(), "call", null);
        setField(term245640, term245640.getClass(), "prototype", null);
        setField(term245640, term245640.getClass(), "kind", enum444);
        setField(term245640, term245640.getClass(), "typeOfThis", null);
        setField(term245640, term245640.getClass(), "source", null);
        setField(term245640, term245640.getClass(), "implementedInterfaces", null);
        setField(term245640, term245640.getClass(), "subTypes", null);
        setField(term245640, term245640.getClass(), "templateTypeName", null);
        setField(term245640, term245640.getClass(), "className", null);
        setField(term245640, term245640.getClass(), "properties", null);
        setField(term245640, term245640.getClass(), "implicitPrototype", null);
        setBooleanField(term245640, term245640.getClass(), "nativeType", false);
        setBooleanField(term245640, term245640.getClass(), "visited", false);
        setField(term245640, term245640.getClass(), "docInfo", null);
        setBooleanField(term245640, term245640.getClass(), "unknown", false);
        setBooleanField(term245640, term245640.getClass(), "resolved", false);
        setField(term245640, term245640.getClass(), "resolveResult", null);
        setField(term245640, term245640.getClass(), "registry", null);
        Class<? extends Object> term246237 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term246236 = ((Class) term246237).getDeclaredField((String) "INTERFACE");
        ((Field) term246236).setAccessible(true);
        Object enum445 = ((Field) term246236).get((Object) null);
        term245644 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term245644, term245644.getClass(), "this$0", null);
        setField(term245644, term245644.getClass(), "call", null);
        setField(term245644, term245644.getClass(), "prototype", null);
        setField(term245644, term245644.getClass(), "kind", enum445);
        setField(term245644, term245644.getClass(), "typeOfThis", null);
        setField(term245644, term245644.getClass(), "source", null);
        setField(term245644, term245644.getClass(), "implementedInterfaces", null);
        setField(term245644, term245644.getClass(), "subTypes", null);
        setField(term245644, term245644.getClass(), "templateTypeName", null);
        setField(term245644, term245644.getClass(), "className", null);
        setField(term245644, term245644.getClass(), "properties", null);
        setField(term245644, term245644.getClass(), "implicitPrototype", null);
        setBooleanField(term245644, term245644.getClass(), "nativeType", false);
        setBooleanField(term245644, term245644.getClass(), "visited", false);
        setField(term245644, term245644.getClass(), "docInfo", null);
        setBooleanField(term245644, term245644.getClass(), "unknown", false);
        setBooleanField(term245644, term245644.getClass(), "resolved", false);
        setField(term245644, term245644.getClass(), "resolveResult", null);
        setField(term245644, term245644.getClass(), "registry", null);
        Class<? extends Object> term246531 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term246530 = ((Class) term246531).getDeclaredField((String) "INTERFACE");
        ((Field) term246530).setAccessible(true);
        Object enum446 = ((Field) term246530).get((Object) null);
        term245554 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term245554, term245554.getClass(), "call", null);
        setField(term245554, term245554.getClass(), "prototype", null);
        setField(term245554, term245554.getClass(), "kind", enum446);
        setField(term245554, term245554.getClass(), "typeOfThis", null);
        setField(term245554, term245554.getClass(), "source", null);
        setField(term245554, term245554.getClass(), "implementedInterfaces", null);
        setField(term245554, term245554.getClass(), "subTypes", null);
        setField(term245554, term245554.getClass(), "templateTypeName", null);
        setField(term245554, term245554.getClass(), "className", null);
        setField(term245554, term245554.getClass(), "properties", null);
        setField(term245554, term245554.getClass(), "implicitPrototype", null);
        setBooleanField(term245554, term245554.getClass(), "nativeType", false);
        setBooleanField(term245554, term245554.getClass(), "visited", false);
        setField(term245554, term245554.getClass(), "docInfo", null);
        setBooleanField(term245554, term245554.getClass(), "unknown", false);
        setBooleanField(term245554, term245554.getClass(), "resolved", false);
        setField(term245554, term245554.getClass(), "resolveResult", null);
        setField(term245554, term245554.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term245184;
        Object retValue = callMethod(klass, "getGreatestSubtype", argTypes, term244928, args);
        assertTrue(recursiveEquals(term244928, term245640));
        assertTrue(recursiveEquals(term245184, term245644));
        assertTrue(recursiveEquals(retValue, term245554));
    }

};


