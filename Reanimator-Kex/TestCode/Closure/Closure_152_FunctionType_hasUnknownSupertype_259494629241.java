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

public class FunctionType_hasUnknownSupertype_259494629241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125488;
     Object term127031;

    public FunctionType_hasUnknownSupertype_259494629241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term127038 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term127037 = ((Class) term127038).getDeclaredField((String) "INTERFACE");
        ((Field) term127037).setAccessible(true);
        Object enum234 = ((Field) term127037).get((Object) null);
        term125488 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term125754 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term125488, term125488.getClass(), "kind", enum234);
        setBooleanField(term125488, term125488.getClass(), "unknown", false);
        setField(term125488, term125488.getClass(), "prototype", term125754);
        Class<? extends Object> term127332 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term127331 = ((Class) term127332).getDeclaredField((String) "INTERFACE");
        ((Field) term127331).setAccessible(true);
        Object enum235 = ((Field) term127331).get((Object) null);
        term127031 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term127032 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term127031, term127031.getClass(), "call", null);
        setField(term127032, term127032.getClass(), "ownerFunction", null);
        setField(term127032, term127032.getClass(), "className", null);
        setField(term127032, term127032.getClass(), "properties", null);
        setBooleanField(term127032, term127032.getClass(), "nativeType", false);
        setField(term127032, term127032.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term127032, term127032.getClass(), "prettyPrint", false);
        setBooleanField(term127032, term127032.getClass(), "visited", false);
        setField(term127032, term127032.getClass(), "docInfo", null);
        setBooleanField(term127032, term127032.getClass(), "unknown", false);
        setBooleanField(term127032, term127032.getClass(), "resolved", false);
        setField(term127032, term127032.getClass(), "resolveResult", null);
        setField(term127032, term127032.getClass(), "registry", null);
        setField(term127031, term127031.getClass(), "prototype", term127032);
        setField(term127031, term127031.getClass(), "kind", enum235);
        setField(term127031, term127031.getClass(), "typeOfThis", null);
        setField(term127031, term127031.getClass(), "source", null);
        setField(term127031, term127031.getClass(), "implementedInterfaces", null);
        setField(term127031, term127031.getClass(), "subTypes", null);
        setField(term127031, term127031.getClass(), "templateTypeName", null);
        setField(term127031, term127031.getClass(), "className", null);
        setField(term127031, term127031.getClass(), "properties", null);
        setBooleanField(term127031, term127031.getClass(), "nativeType", false);
        setField(term127031, term127031.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term127031, term127031.getClass(), "prettyPrint", false);
        setBooleanField(term127031, term127031.getClass(), "visited", false);
        setField(term127031, term127031.getClass(), "docInfo", null);
        setBooleanField(term127031, term127031.getClass(), "unknown", false);
        setBooleanField(term127031, term127031.getClass(), "resolved", false);
        setField(term127031, term127031.getClass(), "resolveResult", null);
        setField(term127031, term127031.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasUnknownSupertype", argTypes, term125488, args);
        assertTrue(recursiveEquals(term125488, term127031));
        assertTrue(recursiveEquals(retValue, false));
    }

};


