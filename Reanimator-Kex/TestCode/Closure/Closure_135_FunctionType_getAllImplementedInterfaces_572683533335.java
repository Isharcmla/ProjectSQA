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

public class FunctionType_getAllImplementedInterfaces_572683533335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term192123;
     Object term192942;
     Object term192936;

    public FunctionType_getAllImplementedInterfaces_572683533335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term192951 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term192950 = ((Class) term192951).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term192950).setAccessible(true);
        Object enum352 = ((Field) term192950).get((Object) null);
        ArrayList term192549 = new ArrayList();
        term192123 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term192389 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term192497 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term192123, term192123.getClass(), "kind", enum352);
        setField(term192389, term192389.getClass(), "implicitPrototype", term192497);
        setField(term192123, term192123.getClass(), "prototype", term192389);
        setField(term192123, term192123.getClass(), "implementedInterfaces", term192549);
        Class<? extends Object> term193251 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term193250 = ((Class) term193251).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term193250).setAccessible(true);
        Object enum353 = ((Field) term193250).get((Object) null);
        ArrayList term192948 = new ArrayList();
        term192942 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term192943 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term192944 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term192942, term192942.getClass(), "call", null);
        setField(term192943, term192943.getClass(), "ownerFunction", null);
        setField(term192943, term192943.getClass(), "className", null);
        setField(term192943, term192943.getClass(), "properties", null);
        setField(term192944, term192944.getClass(), "this$0", null);
        setField(term192944, term192944.getClass(), "call", null);
        setField(term192944, term192944.getClass(), "prototype", null);
        setField(term192944, term192944.getClass(), "kind", null);
        setField(term192944, term192944.getClass(), "typeOfThis", null);
        setField(term192944, term192944.getClass(), "source", null);
        setField(term192944, term192944.getClass(), "implementedInterfaces", null);
        setField(term192944, term192944.getClass(), "subTypes", null);
        setField(term192944, term192944.getClass(), "templateTypeName", null);
        setField(term192944, term192944.getClass(), "className", null);
        setField(term192944, term192944.getClass(), "properties", null);
        setField(term192944, term192944.getClass(), "implicitPrototype", null);
        setBooleanField(term192944, term192944.getClass(), "nativeType", false);
        setBooleanField(term192944, term192944.getClass(), "visited", false);
        setField(term192944, term192944.getClass(), "docInfo", null);
        setBooleanField(term192944, term192944.getClass(), "unknown", false);
        setBooleanField(term192944, term192944.getClass(), "resolved", false);
        setField(term192944, term192944.getClass(), "resolveResult", null);
        setField(term192944, term192944.getClass(), "registry", null);
        setField(term192943, term192943.getClass(), "implicitPrototype", term192944);
        setBooleanField(term192943, term192943.getClass(), "nativeType", false);
        setBooleanField(term192943, term192943.getClass(), "visited", false);
        setField(term192943, term192943.getClass(), "docInfo", null);
        setBooleanField(term192943, term192943.getClass(), "unknown", false);
        setBooleanField(term192943, term192943.getClass(), "resolved", false);
        setField(term192943, term192943.getClass(), "resolveResult", null);
        setField(term192943, term192943.getClass(), "registry", null);
        setField(term192942, term192942.getClass(), "prototype", term192943);
        setField(term192942, term192942.getClass(), "kind", enum353);
        setField(term192942, term192942.getClass(), "typeOfThis", null);
        setField(term192942, term192942.getClass(), "source", null);
        setField(term192942, term192942.getClass(), "implementedInterfaces", term192948);
        setField(term192942, term192942.getClass(), "subTypes", null);
        setField(term192942, term192942.getClass(), "templateTypeName", null);
        setField(term192942, term192942.getClass(), "className", null);
        setField(term192942, term192942.getClass(), "properties", null);
        setField(term192942, term192942.getClass(), "implicitPrototype", null);
        setBooleanField(term192942, term192942.getClass(), "nativeType", false);
        setBooleanField(term192942, term192942.getClass(), "visited", false);
        setField(term192942, term192942.getClass(), "docInfo", null);
        setBooleanField(term192942, term192942.getClass(), "unknown", false);
        setBooleanField(term192942, term192942.getClass(), "resolved", false);
        setField(term192942, term192942.getClass(), "resolveResult", null);
        setField(term192942, term192942.getClass(), "registry", null);
        HashMap term192937 = new HashMap();
        Set<Object> term193550 =  ((Map) term192937).keySet();
        term192936 = new HashSet((Collection<? extends Object>) term193550);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getAllImplementedInterfaces", argTypes, term192123, args);
        assertTrue(recursiveEquals(term192123, term192942));
        assertTrue(recursiveEquals(retValue, term192936));
    }

};


