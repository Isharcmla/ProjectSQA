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

public class FunctionType_getGreatestSubtype_6795917091728 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2355168;
     Object term2355820;
     Object term2358093;
     Object term2358098;
     Object term2357997;

    public FunctionType_getGreatestSubtype_6795917091728() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2358104 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2358103 = ((Class) term2358104).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2358103).setAccessible(true);
        Object enum4406 = ((Field) term2358103).get((Object) null);
        term2355168 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2356092 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term2355168, term2355168.getClass(), "kind", enum4406);
        setField(term2356092, term2356092.getClass(), "kind", enum4406);
        setField(term2356092, term2356092.getClass(), "typeOfThis", null);
        setField(term2355168, term2355168.getClass(), "typeOfThis", term2356092);
        term2355820 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2355820, term2355820.getClass(), "kind", enum4406);
        setField(term2355820, term2355820.getClass(), "typeOfThis", term2356092);
        Class<? extends Object> term2358404 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2358403 = ((Class) term2358404).getDeclaredField((String) "INTERFACE");
        ((Field) term2358403).setAccessible(true);
        Object enum4407 = ((Field) term2358403).get((Object) null);
        term2358093 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2358097 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term2358093, term2358093.getClass(), "this$0", null);
        setField(term2358093, term2358093.getClass(), "call", null);
        setField(term2358093, term2358093.getClass(), "prototype", null);
        setField(term2358093, term2358093.getClass(), "kind", enum4407);
        setField(term2358097, term2358097.getClass(), "leastSupertypeVisitor", null);
        setField(term2358097, term2358097.getClass(), "greatestSubtypeVisitor", null);
        setField(term2358097, term2358097.getClass(), "call", null);
        setField(term2358097, term2358097.getClass(), "prototype", null);
        setField(term2358097, term2358097.getClass(), "kind", enum4407);
        setField(term2358097, term2358097.getClass(), "typeOfThis", null);
        setField(term2358097, term2358097.getClass(), "source", null);
        setField(term2358097, term2358097.getClass(), "implementedInterfaces", null);
        setField(term2358097, term2358097.getClass(), "subTypes", null);
        setField(term2358097, term2358097.getClass(), "templateTypeName", null);
        setField(term2358097, term2358097.getClass(), "className", null);
        setField(term2358097, term2358097.getClass(), "properties", null);
        setField(term2358097, term2358097.getClass(), "implicitPrototype", null);
        setBooleanField(term2358097, term2358097.getClass(), "nativeType", false);
        setBooleanField(term2358097, term2358097.getClass(), "visited", false);
        setField(term2358097, term2358097.getClass(), "docInfo", null);
        setBooleanField(term2358097, term2358097.getClass(), "unknown", false);
        setBooleanField(term2358097, term2358097.getClass(), "resolved", false);
        setField(term2358097, term2358097.getClass(), "resolveResult", null);
        setField(term2358097, term2358097.getClass(), "registry", null);
        setField(term2358093, term2358093.getClass(), "typeOfThis", term2358097);
        setField(term2358093, term2358093.getClass(), "source", null);
        setField(term2358093, term2358093.getClass(), "implementedInterfaces", null);
        setField(term2358093, term2358093.getClass(), "subTypes", null);
        setField(term2358093, term2358093.getClass(), "templateTypeName", null);
        setField(term2358093, term2358093.getClass(), "className", null);
        setField(term2358093, term2358093.getClass(), "properties", null);
        setField(term2358093, term2358093.getClass(), "implicitPrototype", null);
        setBooleanField(term2358093, term2358093.getClass(), "nativeType", false);
        setBooleanField(term2358093, term2358093.getClass(), "visited", false);
        setField(term2358093, term2358093.getClass(), "docInfo", null);
        setBooleanField(term2358093, term2358093.getClass(), "unknown", false);
        setBooleanField(term2358093, term2358093.getClass(), "resolved", false);
        setField(term2358093, term2358093.getClass(), "resolveResult", null);
        setField(term2358093, term2358093.getClass(), "registry", null);
        Class<? extends Object> term2358698 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2358697 = ((Class) term2358698).getDeclaredField((String) "INTERFACE");
        ((Field) term2358697).setAccessible(true);
        Object enum4408 = ((Field) term2358697).get((Object) null);
        term2358098 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2358102 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term2358098, term2358098.getClass(), "this$0", null);
        setField(term2358098, term2358098.getClass(), "call", null);
        setField(term2358098, term2358098.getClass(), "prototype", null);
        setField(term2358098, term2358098.getClass(), "kind", enum4408);
        setField(term2358102, term2358102.getClass(), "leastSupertypeVisitor", null);
        setField(term2358102, term2358102.getClass(), "greatestSubtypeVisitor", null);
        setField(term2358102, term2358102.getClass(), "call", null);
        setField(term2358102, term2358102.getClass(), "prototype", null);
        setField(term2358102, term2358102.getClass(), "kind", enum4408);
        setField(term2358102, term2358102.getClass(), "typeOfThis", null);
        setField(term2358102, term2358102.getClass(), "source", null);
        setField(term2358102, term2358102.getClass(), "implementedInterfaces", null);
        setField(term2358102, term2358102.getClass(), "subTypes", null);
        setField(term2358102, term2358102.getClass(), "templateTypeName", null);
        setField(term2358102, term2358102.getClass(), "className", null);
        setField(term2358102, term2358102.getClass(), "properties", null);
        setField(term2358102, term2358102.getClass(), "implicitPrototype", null);
        setBooleanField(term2358102, term2358102.getClass(), "nativeType", false);
        setBooleanField(term2358102, term2358102.getClass(), "visited", false);
        setField(term2358102, term2358102.getClass(), "docInfo", null);
        setBooleanField(term2358102, term2358102.getClass(), "unknown", false);
        setBooleanField(term2358102, term2358102.getClass(), "resolved", false);
        setField(term2358102, term2358102.getClass(), "resolveResult", null);
        setField(term2358102, term2358102.getClass(), "registry", null);
        setField(term2358098, term2358098.getClass(), "typeOfThis", term2358102);
        setField(term2358098, term2358098.getClass(), "source", null);
        setField(term2358098, term2358098.getClass(), "implementedInterfaces", null);
        setField(term2358098, term2358098.getClass(), "subTypes", null);
        setField(term2358098, term2358098.getClass(), "templateTypeName", null);
        setField(term2358098, term2358098.getClass(), "className", null);
        setField(term2358098, term2358098.getClass(), "properties", null);
        setField(term2358098, term2358098.getClass(), "implicitPrototype", null);
        setBooleanField(term2358098, term2358098.getClass(), "nativeType", false);
        setBooleanField(term2358098, term2358098.getClass(), "visited", false);
        setField(term2358098, term2358098.getClass(), "docInfo", null);
        setBooleanField(term2358098, term2358098.getClass(), "unknown", false);
        setBooleanField(term2358098, term2358098.getClass(), "resolved", false);
        setField(term2358098, term2358098.getClass(), "resolveResult", null);
        setField(term2358098, term2358098.getClass(), "registry", null);
        Class<? extends Object> term2358992 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2358991 = ((Class) term2358992).getDeclaredField((String) "INTERFACE");
        ((Field) term2358991).setAccessible(true);
        Object enum4409 = ((Field) term2358991).get((Object) null);
        term2357997 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2358011 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term2357997, term2357997.getClass(), "this$0", null);
        setField(term2357997, term2357997.getClass(), "call", null);
        setField(term2357997, term2357997.getClass(), "prototype", null);
        setField(term2357997, term2357997.getClass(), "kind", enum4409);
        setField(term2358011, term2358011.getClass(), "leastSupertypeVisitor", null);
        setField(term2358011, term2358011.getClass(), "greatestSubtypeVisitor", null);
        setField(term2358011, term2358011.getClass(), "call", null);
        setField(term2358011, term2358011.getClass(), "prototype", null);
        setField(term2358011, term2358011.getClass(), "kind", enum4409);
        setField(term2358011, term2358011.getClass(), "typeOfThis", null);
        setField(term2358011, term2358011.getClass(), "source", null);
        setField(term2358011, term2358011.getClass(), "implementedInterfaces", null);
        setField(term2358011, term2358011.getClass(), "subTypes", null);
        setField(term2358011, term2358011.getClass(), "templateTypeName", null);
        setField(term2358011, term2358011.getClass(), "className", null);
        setField(term2358011, term2358011.getClass(), "properties", null);
        setField(term2358011, term2358011.getClass(), "implicitPrototype", null);
        setBooleanField(term2358011, term2358011.getClass(), "nativeType", false);
        setBooleanField(term2358011, term2358011.getClass(), "visited", false);
        setField(term2358011, term2358011.getClass(), "docInfo", null);
        setBooleanField(term2358011, term2358011.getClass(), "unknown", false);
        setBooleanField(term2358011, term2358011.getClass(), "resolved", false);
        setField(term2358011, term2358011.getClass(), "resolveResult", null);
        setField(term2358011, term2358011.getClass(), "registry", null);
        setField(term2357997, term2357997.getClass(), "typeOfThis", term2358011);
        setField(term2357997, term2357997.getClass(), "source", null);
        setField(term2357997, term2357997.getClass(), "implementedInterfaces", null);
        setField(term2357997, term2357997.getClass(), "subTypes", null);
        setField(term2357997, term2357997.getClass(), "templateTypeName", null);
        setField(term2357997, term2357997.getClass(), "className", null);
        setField(term2357997, term2357997.getClass(), "properties", null);
        setField(term2357997, term2357997.getClass(), "implicitPrototype", null);
        setBooleanField(term2357997, term2357997.getClass(), "nativeType", false);
        setBooleanField(term2357997, term2357997.getClass(), "visited", false);
        setField(term2357997, term2357997.getClass(), "docInfo", null);
        setBooleanField(term2357997, term2357997.getClass(), "unknown", false);
        setBooleanField(term2357997, term2357997.getClass(), "resolved", false);
        setField(term2357997, term2357997.getClass(), "resolveResult", null);
        setField(term2357997, term2357997.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2355820;
        Object retValue = callMethod(klass, "getGreatestSubtype", argTypes, term2355168, args);
        assertTrue(recursiveEquals(term2355168, term2358093));
        assertTrue(recursiveEquals(term2355820, term2358098));
        assertTrue(recursiveEquals(retValue, term2357997));
    }

};


