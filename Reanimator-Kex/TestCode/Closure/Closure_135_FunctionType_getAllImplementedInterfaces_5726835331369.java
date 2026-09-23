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

public class FunctionType_getAllImplementedInterfaces_5726835331369 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1752343;
     Object term1753029;
     Object term1753023;

    public FunctionType_getAllImplementedInterfaces_5726835331369() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1753037 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1753036 = ((Class) term1753037).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1753036).setAccessible(true);
        Object enum3267 = ((Field) term1753036).get((Object) null);
        ArrayList term1752661 = new ArrayList();
        term1752343 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1752609 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term1752343, term1752343.getClass(), "kind", enum3267);
        setField(term1752609, term1752609.getClass(), "implicitPrototype", null);
        setField(term1752343, term1752343.getClass(), "prototype", term1752609);
        setField(term1752343, term1752343.getClass(), "implementedInterfaces", term1752661);
        Class<? extends Object> term1753337 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1753336 = ((Class) term1753337).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1753336).setAccessible(true);
        Object enum3268 = ((Field) term1753336).get((Object) null);
        ArrayList term1753034 = new ArrayList();
        term1753029 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1753030 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term1753029, term1753029.getClass(), "this$0", null);
        setField(term1753029, term1753029.getClass(), "call", null);
        setField(term1753030, term1753030.getClass(), "ownerFunction", null);
        setField(term1753030, term1753030.getClass(), "className", null);
        setField(term1753030, term1753030.getClass(), "properties", null);
        setField(term1753030, term1753030.getClass(), "implicitPrototype", null);
        setBooleanField(term1753030, term1753030.getClass(), "nativeType", false);
        setBooleanField(term1753030, term1753030.getClass(), "visited", false);
        setField(term1753030, term1753030.getClass(), "docInfo", null);
        setBooleanField(term1753030, term1753030.getClass(), "unknown", false);
        setBooleanField(term1753030, term1753030.getClass(), "resolved", false);
        setField(term1753030, term1753030.getClass(), "resolveResult", null);
        setField(term1753030, term1753030.getClass(), "registry", null);
        setField(term1753029, term1753029.getClass(), "prototype", term1753030);
        setField(term1753029, term1753029.getClass(), "kind", enum3268);
        setField(term1753029, term1753029.getClass(), "typeOfThis", null);
        setField(term1753029, term1753029.getClass(), "source", null);
        setField(term1753029, term1753029.getClass(), "implementedInterfaces", term1753034);
        setField(term1753029, term1753029.getClass(), "subTypes", null);
        setField(term1753029, term1753029.getClass(), "templateTypeName", null);
        setField(term1753029, term1753029.getClass(), "className", null);
        setField(term1753029, term1753029.getClass(), "properties", null);
        setField(term1753029, term1753029.getClass(), "implicitPrototype", null);
        setBooleanField(term1753029, term1753029.getClass(), "nativeType", false);
        setBooleanField(term1753029, term1753029.getClass(), "visited", false);
        setField(term1753029, term1753029.getClass(), "docInfo", null);
        setBooleanField(term1753029, term1753029.getClass(), "unknown", false);
        setBooleanField(term1753029, term1753029.getClass(), "resolved", false);
        setField(term1753029, term1753029.getClass(), "resolveResult", null);
        setField(term1753029, term1753029.getClass(), "registry", null);
        HashMap term1753024 = new HashMap();
        Set<Object> term1753636 =  ((Map) term1753024).keySet();
        term1753023 = new HashSet((Collection<? extends Object>) term1753636);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getAllImplementedInterfaces", argTypes, term1752343, args);
        assertTrue(recursiveEquals(term1752343, term1753029));
        assertTrue(recursiveEquals(retValue, term1753023));
    }

};


