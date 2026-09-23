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

public class FunctionType_isEquivalentTo_230708275375 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term270504;
     Object term270984;
     Object term271965;
     Object term271971;

    public FunctionType_isEquivalentTo_230708275375() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term271980 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term271979 = ((Class) term271980).getDeclaredField((String) "ORDINARY");
        ((Field) term271979).setAccessible(true);
        Object enum470 = ((Field) term271979).get((Object) null);
        term270504 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term270760 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term270874 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term270504, term270504.getClass(), "kind", enum470);
        setField(term270760, term270760.getClass(), "kind", enum470);
        setField(term270760, term270760.getClass(), "typeOfThis", term270874);
        setField(term270504, term270504.getClass(), "typeOfThis", term270760);
        Class<? extends Object> term272271 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term272270 = ((Class) term272271).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term272270).setAccessible(true);
        Object enum471 = ((Field) term272270).get((Object) null);
        term270984 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term271166 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term270984, term270984.getClass(), "kind", enum470);
        setField(term271166, term271166.getClass(), "kind", enum471);
        setField(term271166, term271166.getClass(), "typeOfThis", null);
        setField(term270984, term270984.getClass(), "typeOfThis", term271166);
        Class<? extends Object> term272571 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term272570 = ((Class) term272571).getDeclaredField((String) "ORDINARY");
        ((Field) term272570).setAccessible(true);
        Object enum472 = ((Field) term272570).get((Object) null);
        term271965 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term271969 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term271970 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term271965, term271965.getClass(), "leastSupertypeVisitor", null);
        setField(term271965, term271965.getClass(), "greatestSubtypeVisitor", null);
        setField(term271965, term271965.getClass(), "call", null);
        setField(term271965, term271965.getClass(), "prototype", null);
        setField(term271965, term271965.getClass(), "kind", enum472);
        setField(term271969, term271969.getClass(), "this$0", null);
        setField(term271969, term271969.getClass(), "call", null);
        setField(term271969, term271969.getClass(), "prototype", null);
        setField(term271969, term271969.getClass(), "kind", enum472);
        setField(term271970, term271970.getClass(), "className", null);
        setField(term271970, term271970.getClass(), "properties", null);
        setBooleanField(term271970, term271970.getClass(), "nativeType", false);
        setField(term271970, term271970.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term271970, term271970.getClass(), "prettyPrint", false);
        setBooleanField(term271970, term271970.getClass(), "visited", false);
        setField(term271970, term271970.getClass(), "docInfo", null);
        setBooleanField(term271970, term271970.getClass(), "unknown", false);
        setBooleanField(term271970, term271970.getClass(), "resolved", false);
        setField(term271970, term271970.getClass(), "resolveResult", null);
        setField(term271970, term271970.getClass(), "registry", null);
        setField(term271969, term271969.getClass(), "typeOfThis", term271970);
        setField(term271969, term271969.getClass(), "source", null);
        setField(term271969, term271969.getClass(), "implementedInterfaces", null);
        setField(term271969, term271969.getClass(), "subTypes", null);
        setField(term271969, term271969.getClass(), "templateTypeName", null);
        setField(term271969, term271969.getClass(), "className", null);
        setField(term271969, term271969.getClass(), "properties", null);
        setBooleanField(term271969, term271969.getClass(), "nativeType", false);
        setField(term271969, term271969.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term271969, term271969.getClass(), "prettyPrint", false);
        setBooleanField(term271969, term271969.getClass(), "visited", false);
        setField(term271969, term271969.getClass(), "docInfo", null);
        setBooleanField(term271969, term271969.getClass(), "unknown", false);
        setBooleanField(term271969, term271969.getClass(), "resolved", false);
        setField(term271969, term271969.getClass(), "resolveResult", null);
        setField(term271969, term271969.getClass(), "registry", null);
        setField(term271965, term271965.getClass(), "typeOfThis", term271969);
        setField(term271965, term271965.getClass(), "source", null);
        setField(term271965, term271965.getClass(), "implementedInterfaces", null);
        setField(term271965, term271965.getClass(), "subTypes", null);
        setField(term271965, term271965.getClass(), "templateTypeName", null);
        setField(term271965, term271965.getClass(), "className", null);
        setField(term271965, term271965.getClass(), "properties", null);
        setBooleanField(term271965, term271965.getClass(), "nativeType", false);
        setField(term271965, term271965.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term271965, term271965.getClass(), "prettyPrint", false);
        setBooleanField(term271965, term271965.getClass(), "visited", false);
        setField(term271965, term271965.getClass(), "docInfo", null);
        setBooleanField(term271965, term271965.getClass(), "unknown", false);
        setBooleanField(term271965, term271965.getClass(), "resolved", false);
        setField(term271965, term271965.getClass(), "resolveResult", null);
        setField(term271965, term271965.getClass(), "registry", null);
        Class<? extends Object> term272862 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term272861 = ((Class) term272862).getDeclaredField((String) "ORDINARY");
        ((Field) term272861).setAccessible(true);
        Object enum473 = ((Field) term272861).get((Object) null);
        Class<? extends Object> term273153 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term273152 = ((Class) term273153).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term273152).setAccessible(true);
        Object enum474 = ((Field) term273152).get((Object) null);
        term271971 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term271975 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term271971, term271971.getClass(), "call", null);
        setField(term271971, term271971.getClass(), "prototype", null);
        setField(term271971, term271971.getClass(), "kind", enum473);
        setField(term271975, term271975.getClass(), "this$0", null);
        setField(term271975, term271975.getClass(), "call", null);
        setField(term271975, term271975.getClass(), "prototype", null);
        setField(term271975, term271975.getClass(), "kind", enum474);
        setField(term271975, term271975.getClass(), "typeOfThis", null);
        setField(term271975, term271975.getClass(), "source", null);
        setField(term271975, term271975.getClass(), "implementedInterfaces", null);
        setField(term271975, term271975.getClass(), "subTypes", null);
        setField(term271975, term271975.getClass(), "templateTypeName", null);
        setField(term271975, term271975.getClass(), "className", null);
        setField(term271975, term271975.getClass(), "properties", null);
        setBooleanField(term271975, term271975.getClass(), "nativeType", false);
        setField(term271975, term271975.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term271975, term271975.getClass(), "prettyPrint", false);
        setBooleanField(term271975, term271975.getClass(), "visited", false);
        setField(term271975, term271975.getClass(), "docInfo", null);
        setBooleanField(term271975, term271975.getClass(), "unknown", false);
        setBooleanField(term271975, term271975.getClass(), "resolved", false);
        setField(term271975, term271975.getClass(), "resolveResult", null);
        setField(term271975, term271975.getClass(), "registry", null);
        setField(term271971, term271971.getClass(), "typeOfThis", term271975);
        setField(term271971, term271971.getClass(), "source", null);
        setField(term271971, term271971.getClass(), "implementedInterfaces", null);
        setField(term271971, term271971.getClass(), "subTypes", null);
        setField(term271971, term271971.getClass(), "templateTypeName", null);
        setField(term271971, term271971.getClass(), "className", null);
        setField(term271971, term271971.getClass(), "properties", null);
        setBooleanField(term271971, term271971.getClass(), "nativeType", false);
        setField(term271971, term271971.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term271971, term271971.getClass(), "prettyPrint", false);
        setBooleanField(term271971, term271971.getClass(), "visited", false);
        setField(term271971, term271971.getClass(), "docInfo", null);
        setBooleanField(term271971, term271971.getClass(), "unknown", false);
        setBooleanField(term271971, term271971.getClass(), "resolved", false);
        setField(term271971, term271971.getClass(), "resolveResult", null);
        setField(term271971, term271971.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term270984;
        callMethod(klass, "isEquivalentTo", argTypes, term270504, args);
        assertTrue(recursiveEquals(term270504, term271965));
        assertTrue(recursiveEquals(term270984, term271971));
    }

};


