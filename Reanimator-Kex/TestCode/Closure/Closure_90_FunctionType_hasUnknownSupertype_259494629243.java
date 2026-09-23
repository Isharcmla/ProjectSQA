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

public class FunctionType_hasUnknownSupertype_259494629243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135878;
     Object term137427;

    public FunctionType_hasUnknownSupertype_259494629243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term137434 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term137433 = ((Class) term137434).getDeclaredField((String) "INTERFACE");
        ((Field) term137433).setAccessible(true);
        Object enum261 = ((Field) term137433).get((Object) null);
        term135878 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term136144 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term135878, term135878.getClass(), "kind", enum261);
        setBooleanField(term135878, term135878.getClass(), "unknown", false);
        setField(term135878, term135878.getClass(), "prototype", term136144);
        Class<? extends Object> term137728 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term137727 = ((Class) term137728).getDeclaredField((String) "INTERFACE");
        ((Field) term137727).setAccessible(true);
        Object enum262 = ((Field) term137727).get((Object) null);
        term137427 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term137428 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term137427, term137427.getClass(), "call", null);
        setField(term137428, term137428.getClass(), "ownerFunction", null);
        setField(term137428, term137428.getClass(), "className", null);
        setField(term137428, term137428.getClass(), "properties", null);
        setBooleanField(term137428, term137428.getClass(), "nativeType", false);
        setField(term137428, term137428.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term137428, term137428.getClass(), "prettyPrint", false);
        setBooleanField(term137428, term137428.getClass(), "visited", false);
        setField(term137428, term137428.getClass(), "docInfo", null);
        setBooleanField(term137428, term137428.getClass(), "unknown", false);
        setBooleanField(term137428, term137428.getClass(), "resolved", false);
        setField(term137428, term137428.getClass(), "resolveResult", null);
        setField(term137428, term137428.getClass(), "registry", null);
        setField(term137427, term137427.getClass(), "prototype", term137428);
        setField(term137427, term137427.getClass(), "kind", enum262);
        setField(term137427, term137427.getClass(), "typeOfThis", null);
        setField(term137427, term137427.getClass(), "source", null);
        setField(term137427, term137427.getClass(), "implementedInterfaces", null);
        setField(term137427, term137427.getClass(), "subTypes", null);
        setField(term137427, term137427.getClass(), "templateTypeName", null);
        setField(term137427, term137427.getClass(), "className", null);
        setField(term137427, term137427.getClass(), "properties", null);
        setBooleanField(term137427, term137427.getClass(), "nativeType", false);
        setField(term137427, term137427.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term137427, term137427.getClass(), "prettyPrint", false);
        setBooleanField(term137427, term137427.getClass(), "visited", false);
        setField(term137427, term137427.getClass(), "docInfo", null);
        setBooleanField(term137427, term137427.getClass(), "unknown", false);
        setBooleanField(term137427, term137427.getClass(), "resolved", false);
        setField(term137427, term137427.getClass(), "resolveResult", null);
        setField(term137427, term137427.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasUnknownSupertype", argTypes, term135878, args);
        assertTrue(recursiveEquals(term135878, term137427));
        assertTrue(recursiveEquals(retValue, false));
    }

};


