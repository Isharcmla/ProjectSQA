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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class FunctionType_getAllImplementedInterfaces_572683533371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term265792;
     Object term267711;
     Object term267705;

    public FunctionType_getAllImplementedInterfaces_572683533371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term267719 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term267718 = ((Class) term267719).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term267718).setAccessible(true);
        Object enum495 = ((Field) term267718).get((Object) null);
        ArrayList term266110 = new ArrayList();
        term265792 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term266058 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term265792, term265792.getClass(), "kind", enum495);
        setField(term266058, term266058.getClass(), "implicitPrototype", null);
        setField(term265792, term265792.getClass(), "prototype", term266058);
        setField(term265792, term265792.getClass(), "implementedInterfaces", term266110);
        Class<? extends Object> term268019 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term268018 = ((Class) term268019).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term268018).setAccessible(true);
        Object enum496 = ((Field) term268018).get((Object) null);
        ArrayList term267716 = new ArrayList();
        term267711 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term267712 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term267711, term267711.getClass(), "call", null);
        setField(term267712, term267712.getClass(), "ownerFunction", null);
        setField(term267712, term267712.getClass(), "className", null);
        setField(term267712, term267712.getClass(), "properties", null);
        setField(term267712, term267712.getClass(), "implicitPrototype", null);
        setBooleanField(term267712, term267712.getClass(), "nativeType", false);
        setBooleanField(term267712, term267712.getClass(), "prettyPrint", false);
        setBooleanField(term267712, term267712.getClass(), "visited", false);
        setField(term267712, term267712.getClass(), "docInfo", null);
        setBooleanField(term267712, term267712.getClass(), "unknown", false);
        setBooleanField(term267712, term267712.getClass(), "resolved", false);
        setField(term267712, term267712.getClass(), "resolveResult", null);
        setField(term267712, term267712.getClass(), "registry", null);
        setField(term267711, term267711.getClass(), "prototype", term267712);
        setField(term267711, term267711.getClass(), "kind", enum496);
        setField(term267711, term267711.getClass(), "typeOfThis", null);
        setField(term267711, term267711.getClass(), "source", null);
        setField(term267711, term267711.getClass(), "implementedInterfaces", term267716);
        setField(term267711, term267711.getClass(), "subTypes", null);
        setField(term267711, term267711.getClass(), "templateTypeName", null);
        setField(term267711, term267711.getClass(), "className", null);
        setField(term267711, term267711.getClass(), "properties", null);
        setField(term267711, term267711.getClass(), "implicitPrototype", null);
        setBooleanField(term267711, term267711.getClass(), "nativeType", false);
        setBooleanField(term267711, term267711.getClass(), "prettyPrint", false);
        setBooleanField(term267711, term267711.getClass(), "visited", false);
        setField(term267711, term267711.getClass(), "docInfo", null);
        setBooleanField(term267711, term267711.getClass(), "unknown", false);
        setBooleanField(term267711, term267711.getClass(), "resolved", false);
        setField(term267711, term267711.getClass(), "resolveResult", null);
        setField(term267711, term267711.getClass(), "registry", null);
        HashMap term267706 = new HashMap();
        Set<Object> term268318 =  ((Map) term267706).keySet();
        term267705 = new HashSet((Collection<? extends Object>) term268318);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getAllImplementedInterfaces", argTypes, term265792, args);
        assertTrue(recursiveEquals(term265792, term267711));
        assertTrue(recursiveEquals(retValue, term267705));
    }

};


