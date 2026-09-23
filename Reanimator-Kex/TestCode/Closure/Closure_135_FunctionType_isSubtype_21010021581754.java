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

public class FunctionType_isSubtype_21010021581754 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2397087;
     Object term2397739;
     Object term2398932;
     Object term2398937;

    public FunctionType_isSubtype_21010021581754() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2398944 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2398943 = ((Class) term2398944).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2398943).setAccessible(true);
        Object enum4480 = ((Field) term2398943).get((Object) null);
        Class<? extends Object> term2399244 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2399243 = ((Class) term2399244).getDeclaredField((String) "INTERFACE");
        ((Field) term2399243).setAccessible(true);
        Object enum4481 = ((Field) term2399243).get((Object) null);
        term2397087 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2397631 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2397087, term2397087.getClass(), "kind", enum4480);
        setField(term2397631, term2397631.getClass(), "kind", enum4481);
        setField(term2397087, term2397087.getClass(), "typeOfThis", term2397631);
        Class<? extends Object> term2399538 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2399537 = ((Class) term2399538).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2399537).setAccessible(true);
        Object enum4482 = ((Field) term2399537).get((Object) null);
        term2397739 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2397923 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2397739, term2397739.getClass(), "kind", enum4482);
        setField(term2397739, term2397739.getClass(), "typeOfThis", term2397923);
        Class<? extends Object> term2399838 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2399837 = ((Class) term2399838).getDeclaredField((String) "INTERFACE");
        ((Field) term2399837).setAccessible(true);
        Object enum4483 = ((Field) term2399837).get((Object) null);
        term2398932 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2398936 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2398932, term2398932.getClass(), "this$0", null);
        setField(term2398932, term2398932.getClass(), "call", null);
        setField(term2398932, term2398932.getClass(), "prototype", null);
        setField(term2398932, term2398932.getClass(), "kind", enum4483);
        setField(term2398936, term2398936.getClass(), "call", null);
        setField(term2398936, term2398936.getClass(), "prototype", null);
        setField(term2398936, term2398936.getClass(), "kind", enum4483);
        setField(term2398936, term2398936.getClass(), "typeOfThis", null);
        setField(term2398936, term2398936.getClass(), "source", null);
        setField(term2398936, term2398936.getClass(), "implementedInterfaces", null);
        setField(term2398936, term2398936.getClass(), "subTypes", null);
        setField(term2398936, term2398936.getClass(), "templateTypeName", null);
        setField(term2398936, term2398936.getClass(), "className", null);
        setField(term2398936, term2398936.getClass(), "properties", null);
        setField(term2398936, term2398936.getClass(), "implicitPrototype", null);
        setBooleanField(term2398936, term2398936.getClass(), "nativeType", false);
        setBooleanField(term2398936, term2398936.getClass(), "visited", false);
        setField(term2398936, term2398936.getClass(), "docInfo", null);
        setBooleanField(term2398936, term2398936.getClass(), "unknown", false);
        setBooleanField(term2398936, term2398936.getClass(), "resolved", false);
        setField(term2398936, term2398936.getClass(), "resolveResult", null);
        setField(term2398936, term2398936.getClass(), "registry", null);
        setField(term2398932, term2398932.getClass(), "typeOfThis", term2398936);
        setField(term2398932, term2398932.getClass(), "source", null);
        setField(term2398932, term2398932.getClass(), "implementedInterfaces", null);
        setField(term2398932, term2398932.getClass(), "subTypes", null);
        setField(term2398932, term2398932.getClass(), "templateTypeName", null);
        setField(term2398932, term2398932.getClass(), "className", null);
        setField(term2398932, term2398932.getClass(), "properties", null);
        setField(term2398932, term2398932.getClass(), "implicitPrototype", null);
        setBooleanField(term2398932, term2398932.getClass(), "nativeType", false);
        setBooleanField(term2398932, term2398932.getClass(), "visited", false);
        setField(term2398932, term2398932.getClass(), "docInfo", null);
        setBooleanField(term2398932, term2398932.getClass(), "unknown", false);
        setBooleanField(term2398932, term2398932.getClass(), "resolved", false);
        setField(term2398932, term2398932.getClass(), "resolveResult", null);
        setField(term2398932, term2398932.getClass(), "registry", null);
        Class<? extends Object> term2400132 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2400131 = ((Class) term2400132).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2400131).setAccessible(true);
        Object enum4484 = ((Field) term2400131).get((Object) null);
        term2398937 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2398941 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2398937, term2398937.getClass(), "this$0", null);
        setField(term2398937, term2398937.getClass(), "call", null);
        setField(term2398937, term2398937.getClass(), "prototype", null);
        setField(term2398937, term2398937.getClass(), "kind", enum4484);
        setField(term2398941, term2398941.getClass(), "call", null);
        setField(term2398941, term2398941.getClass(), "prototype", null);
        setField(term2398941, term2398941.getClass(), "kind", null);
        setField(term2398941, term2398941.getClass(), "typeOfThis", null);
        setField(term2398941, term2398941.getClass(), "source", null);
        setField(term2398941, term2398941.getClass(), "implementedInterfaces", null);
        setField(term2398941, term2398941.getClass(), "subTypes", null);
        setField(term2398941, term2398941.getClass(), "templateTypeName", null);
        setField(term2398941, term2398941.getClass(), "className", null);
        setField(term2398941, term2398941.getClass(), "properties", null);
        setField(term2398941, term2398941.getClass(), "implicitPrototype", null);
        setBooleanField(term2398941, term2398941.getClass(), "nativeType", false);
        setBooleanField(term2398941, term2398941.getClass(), "visited", false);
        setField(term2398941, term2398941.getClass(), "docInfo", null);
        setBooleanField(term2398941, term2398941.getClass(), "unknown", false);
        setBooleanField(term2398941, term2398941.getClass(), "resolved", false);
        setField(term2398941, term2398941.getClass(), "resolveResult", null);
        setField(term2398941, term2398941.getClass(), "registry", null);
        setField(term2398937, term2398937.getClass(), "typeOfThis", term2398941);
        setField(term2398937, term2398937.getClass(), "source", null);
        setField(term2398937, term2398937.getClass(), "implementedInterfaces", null);
        setField(term2398937, term2398937.getClass(), "subTypes", null);
        setField(term2398937, term2398937.getClass(), "templateTypeName", null);
        setField(term2398937, term2398937.getClass(), "className", null);
        setField(term2398937, term2398937.getClass(), "properties", null);
        setField(term2398937, term2398937.getClass(), "implicitPrototype", null);
        setBooleanField(term2398937, term2398937.getClass(), "nativeType", false);
        setBooleanField(term2398937, term2398937.getClass(), "visited", false);
        setField(term2398937, term2398937.getClass(), "docInfo", null);
        setBooleanField(term2398937, term2398937.getClass(), "unknown", false);
        setBooleanField(term2398937, term2398937.getClass(), "resolved", false);
        setField(term2398937, term2398937.getClass(), "resolveResult", null);
        setField(term2398937, term2398937.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2397739;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term2397087, args);
        assertTrue(recursiveEquals(term2397087, term2398932));
        assertTrue(recursiveEquals(term2397739, term2398937));
        assertTrue(recursiveEquals(retValue, false));
    }

};


