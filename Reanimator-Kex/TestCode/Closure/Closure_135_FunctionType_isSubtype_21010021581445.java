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

public class FunctionType_isSubtype_21010021581445 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1876106;
     Object term1876876;
     Object term1877937;
     Object term1877943;

    public FunctionType_isSubtype_21010021581445() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1877953 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1877952 = ((Class) term1877953).getDeclaredField((String) "ORDINARY");
        ((Field) term1877952).setAccessible(true);
        Object enum3498 = ((Field) term1877952).get((Object) null);
        term1876106 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1876650 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1876768 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term1876106, term1876106.getClass(), "kind", enum3498);
        setField(term1876650, term1876650.getClass(), "kind", enum3498);
        setField(term1876650, term1876650.getClass(), "typeOfThis", term1876768);
        setField(term1876106, term1876106.getClass(), "typeOfThis", term1876650);
        Class<? extends Object> term1878244 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1878243 = ((Class) term1878244).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1878243).setAccessible(true);
        Object enum3499 = ((Field) term1878243).get((Object) null);
        term1876876 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1877206 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1876876, term1876876.getClass(), "kind", enum3498);
        setField(term1877206, term1877206.getClass(), "kind", enum3499);
        setField(term1877206, term1877206.getClass(), "typeOfThis", null);
        setField(term1876876, term1876876.getClass(), "typeOfThis", term1877206);
        Class<? extends Object> term1878544 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1878543 = ((Class) term1878544).getDeclaredField((String) "INTERFACE");
        ((Field) term1878543).setAccessible(true);
        Object enum3500 = ((Field) term1878543).get((Object) null);
        term1877937 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1877941 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1877942 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term1877937, term1877937.getClass(), "this$0", null);
        setField(term1877937, term1877937.getClass(), "call", null);
        setField(term1877937, term1877937.getClass(), "prototype", null);
        setField(term1877937, term1877937.getClass(), "kind", enum3500);
        setField(term1877941, term1877941.getClass(), "call", null);
        setField(term1877941, term1877941.getClass(), "prototype", null);
        setField(term1877941, term1877941.getClass(), "kind", enum3500);
        setField(term1877942, term1877942.getClass(), "ownerFunction", null);
        setField(term1877942, term1877942.getClass(), "className", null);
        setField(term1877942, term1877942.getClass(), "properties", null);
        setField(term1877942, term1877942.getClass(), "implicitPrototype", null);
        setBooleanField(term1877942, term1877942.getClass(), "nativeType", false);
        setBooleanField(term1877942, term1877942.getClass(), "visited", false);
        setField(term1877942, term1877942.getClass(), "docInfo", null);
        setBooleanField(term1877942, term1877942.getClass(), "unknown", false);
        setBooleanField(term1877942, term1877942.getClass(), "resolved", false);
        setField(term1877942, term1877942.getClass(), "resolveResult", null);
        setField(term1877942, term1877942.getClass(), "registry", null);
        setField(term1877941, term1877941.getClass(), "typeOfThis", term1877942);
        setField(term1877941, term1877941.getClass(), "source", null);
        setField(term1877941, term1877941.getClass(), "implementedInterfaces", null);
        setField(term1877941, term1877941.getClass(), "subTypes", null);
        setField(term1877941, term1877941.getClass(), "templateTypeName", null);
        setField(term1877941, term1877941.getClass(), "className", null);
        setField(term1877941, term1877941.getClass(), "properties", null);
        setField(term1877941, term1877941.getClass(), "implicitPrototype", null);
        setBooleanField(term1877941, term1877941.getClass(), "nativeType", false);
        setBooleanField(term1877941, term1877941.getClass(), "visited", false);
        setField(term1877941, term1877941.getClass(), "docInfo", null);
        setBooleanField(term1877941, term1877941.getClass(), "unknown", false);
        setBooleanField(term1877941, term1877941.getClass(), "resolved", false);
        setField(term1877941, term1877941.getClass(), "resolveResult", null);
        setField(term1877941, term1877941.getClass(), "registry", null);
        setField(term1877937, term1877937.getClass(), "typeOfThis", term1877941);
        setField(term1877937, term1877937.getClass(), "source", null);
        setField(term1877937, term1877937.getClass(), "implementedInterfaces", null);
        setField(term1877937, term1877937.getClass(), "subTypes", null);
        setField(term1877937, term1877937.getClass(), "templateTypeName", null);
        setField(term1877937, term1877937.getClass(), "className", null);
        setField(term1877937, term1877937.getClass(), "properties", null);
        setField(term1877937, term1877937.getClass(), "implicitPrototype", null);
        setBooleanField(term1877937, term1877937.getClass(), "nativeType", false);
        setBooleanField(term1877937, term1877937.getClass(), "visited", false);
        setField(term1877937, term1877937.getClass(), "docInfo", null);
        setBooleanField(term1877937, term1877937.getClass(), "unknown", false);
        setBooleanField(term1877937, term1877937.getClass(), "resolved", false);
        setField(term1877937, term1877937.getClass(), "resolveResult", null);
        setField(term1877937, term1877937.getClass(), "registry", null);
        Class<? extends Object> term1878838 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1878837 = ((Class) term1878838).getDeclaredField((String) "INTERFACE");
        ((Field) term1878837).setAccessible(true);
        Object enum3501 = ((Field) term1878837).get((Object) null);
        Class<? extends Object> term1879132 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1879131 = ((Class) term1879132).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1879131).setAccessible(true);
        Object enum3502 = ((Field) term1879131).get((Object) null);
        term1877943 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1877947 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1877943, term1877943.getClass(), "this$0", null);
        setField(term1877943, term1877943.getClass(), "call", null);
        setField(term1877943, term1877943.getClass(), "prototype", null);
        setField(term1877943, term1877943.getClass(), "kind", enum3501);
        setField(term1877947, term1877947.getClass(), "this$0", null);
        setField(term1877947, term1877947.getClass(), "call", null);
        setField(term1877947, term1877947.getClass(), "prototype", null);
        setField(term1877947, term1877947.getClass(), "kind", enum3502);
        setField(term1877947, term1877947.getClass(), "typeOfThis", null);
        setField(term1877947, term1877947.getClass(), "source", null);
        setField(term1877947, term1877947.getClass(), "implementedInterfaces", null);
        setField(term1877947, term1877947.getClass(), "subTypes", null);
        setField(term1877947, term1877947.getClass(), "templateTypeName", null);
        setField(term1877947, term1877947.getClass(), "className", null);
        setField(term1877947, term1877947.getClass(), "properties", null);
        setField(term1877947, term1877947.getClass(), "implicitPrototype", null);
        setBooleanField(term1877947, term1877947.getClass(), "nativeType", false);
        setBooleanField(term1877947, term1877947.getClass(), "visited", false);
        setField(term1877947, term1877947.getClass(), "docInfo", null);
        setBooleanField(term1877947, term1877947.getClass(), "unknown", false);
        setBooleanField(term1877947, term1877947.getClass(), "resolved", false);
        setField(term1877947, term1877947.getClass(), "resolveResult", null);
        setField(term1877947, term1877947.getClass(), "registry", null);
        setField(term1877943, term1877943.getClass(), "typeOfThis", term1877947);
        setField(term1877943, term1877943.getClass(), "source", null);
        setField(term1877943, term1877943.getClass(), "implementedInterfaces", null);
        setField(term1877943, term1877943.getClass(), "subTypes", null);
        setField(term1877943, term1877943.getClass(), "templateTypeName", null);
        setField(term1877943, term1877943.getClass(), "className", null);
        setField(term1877943, term1877943.getClass(), "properties", null);
        setField(term1877943, term1877943.getClass(), "implicitPrototype", null);
        setBooleanField(term1877943, term1877943.getClass(), "nativeType", false);
        setBooleanField(term1877943, term1877943.getClass(), "visited", false);
        setField(term1877943, term1877943.getClass(), "docInfo", null);
        setBooleanField(term1877943, term1877943.getClass(), "unknown", false);
        setBooleanField(term1877943, term1877943.getClass(), "resolved", false);
        setField(term1877943, term1877943.getClass(), "resolveResult", null);
        setField(term1877943, term1877943.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1876876;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1876106, args);
        assertTrue(recursiveEquals(term1876106, term1877937));
        assertTrue(recursiveEquals(term1876876, term1877943));
        assertTrue(recursiveEquals(retValue, true));
    }

};


