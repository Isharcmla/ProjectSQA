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

public class FunctionType_isSubtype_21010021581585 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2323700;
     Object term2324152;
     Object term2327819;
     Object term2327825;

    public FunctionType_isSubtype_21010021581585() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2327835 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2327834 = ((Class) term2327835).getDeclaredField((String) "ORDINARY");
        ((Field) term2327834).setAccessible(true);
        Object enum4153 = ((Field) term2327834).get((Object) null);
        term2323700 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2323948 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2324042 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2323700, term2323700.getClass(), "kind", enum4153);
        setField(term2323948, term2323948.getClass(), "kind", enum4153);
        setField(term2323700, term2323700.getClass(), "typeOfThis", term2323948);
        setField(term2323700, term2323700.getClass(), "call", term2324042);
        Class<? extends Object> term2328126 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2328125 = ((Class) term2328126).getDeclaredField((String) "INTERFACE");
        ((Field) term2328125).setAccessible(true);
        Object enum4154 = ((Field) term2328125).get((Object) null);
        term2324152 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2324336 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2324152, term2324152.getClass(), "kind", enum4153);
        setField(term2324336, term2324336.getClass(), "kind", enum4154);
        setField(term2324152, term2324152.getClass(), "typeOfThis", term2324336);
        setField(term2324152, term2324152.getClass(), "call", null);
        Class<? extends Object> term2328420 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2328419 = ((Class) term2328420).getDeclaredField((String) "ORDINARY");
        ((Field) term2328419).setAccessible(true);
        Object enum4155 = ((Field) term2328419).get((Object) null);
        term2327819 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2327820 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term2327824 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2327819, term2327819.getClass(), "this$0", null);
        setField(term2327820, term2327820.getClass(), "parameters", null);
        setField(term2327820, term2327820.getClass(), "returnType", null);
        setBooleanField(term2327820, term2327820.getClass(), "returnTypeInferred", false);
        setBooleanField(term2327820, term2327820.getClass(), "resolved", false);
        setField(term2327820, term2327820.getClass(), "resolveResult", null);
        setField(term2327820, term2327820.getClass(), "registry", null);
        setField(term2327819, term2327819.getClass(), "call", term2327820);
        setField(term2327819, term2327819.getClass(), "prototype", null);
        setField(term2327819, term2327819.getClass(), "kind", enum4155);
        setField(term2327824, term2327824.getClass(), "call", null);
        setField(term2327824, term2327824.getClass(), "prototype", null);
        setField(term2327824, term2327824.getClass(), "kind", enum4155);
        setField(term2327824, term2327824.getClass(), "typeOfThis", null);
        setField(term2327824, term2327824.getClass(), "source", null);
        setField(term2327824, term2327824.getClass(), "implementedInterfaces", null);
        setField(term2327824, term2327824.getClass(), "subTypes", null);
        setField(term2327824, term2327824.getClass(), "templateTypeName", null);
        setField(term2327824, term2327824.getClass(), "className", null);
        setField(term2327824, term2327824.getClass(), "properties", null);
        setField(term2327824, term2327824.getClass(), "implicitPrototype", null);
        setBooleanField(term2327824, term2327824.getClass(), "nativeType", false);
        setBooleanField(term2327824, term2327824.getClass(), "prettyPrint", false);
        setBooleanField(term2327824, term2327824.getClass(), "visited", false);
        setField(term2327824, term2327824.getClass(), "docInfo", null);
        setBooleanField(term2327824, term2327824.getClass(), "unknown", false);
        setBooleanField(term2327824, term2327824.getClass(), "resolved", false);
        setField(term2327824, term2327824.getClass(), "resolveResult", null);
        setField(term2327824, term2327824.getClass(), "registry", null);
        setField(term2327819, term2327819.getClass(), "typeOfThis", term2327824);
        setField(term2327819, term2327819.getClass(), "source", null);
        setField(term2327819, term2327819.getClass(), "implementedInterfaces", null);
        setField(term2327819, term2327819.getClass(), "subTypes", null);
        setField(term2327819, term2327819.getClass(), "templateTypeName", null);
        setField(term2327819, term2327819.getClass(), "className", null);
        setField(term2327819, term2327819.getClass(), "properties", null);
        setField(term2327819, term2327819.getClass(), "implicitPrototype", null);
        setBooleanField(term2327819, term2327819.getClass(), "nativeType", false);
        setBooleanField(term2327819, term2327819.getClass(), "prettyPrint", false);
        setBooleanField(term2327819, term2327819.getClass(), "visited", false);
        setField(term2327819, term2327819.getClass(), "docInfo", null);
        setBooleanField(term2327819, term2327819.getClass(), "unknown", false);
        setBooleanField(term2327819, term2327819.getClass(), "resolved", false);
        setField(term2327819, term2327819.getClass(), "resolveResult", null);
        setField(term2327819, term2327819.getClass(), "registry", null);
        Class<? extends Object> term2328711 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2328710 = ((Class) term2328711).getDeclaredField((String) "ORDINARY");
        ((Field) term2328710).setAccessible(true);
        Object enum4156 = ((Field) term2328710).get((Object) null);
        Class<? extends Object> term2329002 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2329001 = ((Class) term2329002).getDeclaredField((String) "INTERFACE");
        ((Field) term2329001).setAccessible(true);
        Object enum4157 = ((Field) term2329001).get((Object) null);
        term2327825 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2327829 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2327825, term2327825.getClass(), "call", null);
        setField(term2327825, term2327825.getClass(), "prototype", null);
        setField(term2327825, term2327825.getClass(), "kind", enum4156);
        setField(term2327829, term2327829.getClass(), "call", null);
        setField(term2327829, term2327829.getClass(), "prototype", null);
        setField(term2327829, term2327829.getClass(), "kind", enum4157);
        setField(term2327829, term2327829.getClass(), "typeOfThis", null);
        setField(term2327829, term2327829.getClass(), "source", null);
        setField(term2327829, term2327829.getClass(), "implementedInterfaces", null);
        setField(term2327829, term2327829.getClass(), "subTypes", null);
        setField(term2327829, term2327829.getClass(), "templateTypeName", null);
        setField(term2327829, term2327829.getClass(), "className", null);
        setField(term2327829, term2327829.getClass(), "properties", null);
        setField(term2327829, term2327829.getClass(), "implicitPrototype", null);
        setBooleanField(term2327829, term2327829.getClass(), "nativeType", false);
        setBooleanField(term2327829, term2327829.getClass(), "prettyPrint", false);
        setBooleanField(term2327829, term2327829.getClass(), "visited", false);
        setField(term2327829, term2327829.getClass(), "docInfo", null);
        setBooleanField(term2327829, term2327829.getClass(), "unknown", false);
        setBooleanField(term2327829, term2327829.getClass(), "resolved", false);
        setField(term2327829, term2327829.getClass(), "resolveResult", null);
        setField(term2327829, term2327829.getClass(), "registry", null);
        setField(term2327825, term2327825.getClass(), "typeOfThis", term2327829);
        setField(term2327825, term2327825.getClass(), "source", null);
        setField(term2327825, term2327825.getClass(), "implementedInterfaces", null);
        setField(term2327825, term2327825.getClass(), "subTypes", null);
        setField(term2327825, term2327825.getClass(), "templateTypeName", null);
        setField(term2327825, term2327825.getClass(), "className", null);
        setField(term2327825, term2327825.getClass(), "properties", null);
        setField(term2327825, term2327825.getClass(), "implicitPrototype", null);
        setBooleanField(term2327825, term2327825.getClass(), "nativeType", false);
        setBooleanField(term2327825, term2327825.getClass(), "prettyPrint", false);
        setBooleanField(term2327825, term2327825.getClass(), "visited", false);
        setField(term2327825, term2327825.getClass(), "docInfo", null);
        setBooleanField(term2327825, term2327825.getClass(), "unknown", false);
        setBooleanField(term2327825, term2327825.getClass(), "resolved", false);
        setField(term2327825, term2327825.getClass(), "resolveResult", null);
        setField(term2327825, term2327825.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2324152;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term2323700, args);
        assertTrue(recursiveEquals(term2323700, term2327819));
        assertTrue(recursiveEquals(term2324152, term2327825));
        assertTrue(recursiveEquals(retValue, false));
    }

};


