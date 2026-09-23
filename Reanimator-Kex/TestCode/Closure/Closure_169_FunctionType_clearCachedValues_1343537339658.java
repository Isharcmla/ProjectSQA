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
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;

public class FunctionType_clearCachedValues_1343537339658 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term642762;
     Object term644083;

    public FunctionType_clearCachedValues_1343537339658() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term642814 = new ArrayList();
        Class<? extends Object> term644095 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term644094 = ((Class) term644095).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term644094).setAccessible(true);
        Object enum1055 = ((Field) term644094).get((Object) null);
        Class<? extends Object> term644395 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term644394 = ((Class) term644395).getDeclaredField((String) "INTERFACE");
        ((Field) term644394).setAccessible(true);
        Object enum1056 = ((Field) term644394).get((Object) null);
        term642762 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term643066 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term643328 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setBooleanField(term642762, term642762.getClass(), "unknown", false);
        setField(term642762, term642762.getClass(), "subTypes", term642814);
        setBooleanField(term642762, term642762.getClass(), "nativeType", false);
        setField(term642762, term642762.getClass(), "kind", enum1055);
        setBooleanField(term643066, term643066.getClass(), "unknown", false);
        setField(term643066, term643066.getClass(), "subTypes", null);
        setBooleanField(term643066, term643066.getClass(), "nativeType", false);
        setField(term643066, term643066.getClass(), "kind", enum1056);
        setField(term643066, term643066.getClass(), "typeOfThis", term643328);
        setField(term642762, term642762.getClass(), "typeOfThis", term643066);
        Class<? extends Object> term644689 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term644688 = ((Class) term644689).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term644688).setAccessible(true);
        Object enum1057 = ((Field) term644688).get((Object) null);
        Class<? extends Object> term644989 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term644988 = ((Class) term644989).getDeclaredField((String) "INTERFACE");
        ((Field) term644988).setAccessible(true);
        Object enum1058 = ((Field) term644988).get((Object) null);
        ArrayList term644092 = new ArrayList();
        term644083 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term644087 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term644091 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term644083, term644083.getClass(), "call", null);
        setField(term644083, term644083.getClass(), "prototypeSlot", null);
        setField(term644083, term644083.getClass(), "kind", enum1057);
        setField(term644083, term644083.getClass(), "propAccess", null);
        setField(term644087, term644087.getClass(), "call", null);
        setField(term644087, term644087.getClass(), "prototypeSlot", null);
        setField(term644087, term644087.getClass(), "kind", enum1058);
        setField(term644087, term644087.getClass(), "propAccess", null);
        setField(term644091, term644091.getClass(), "className", null);
        setField(term644091, term644091.getClass(), "properties", null);
        setBooleanField(term644091, term644091.getClass(), "nativeType", false);
        setField(term644091, term644091.getClass(), "implicitPrototypeFallback", null);
        setField(term644091, term644091.getClass(), "ownerFunction", null);
        setBooleanField(term644091, term644091.getClass(), "prettyPrint", false);
        setBooleanField(term644091, term644091.getClass(), "visited", false);
        setField(term644091, term644091.getClass(), "docInfo", null);
        setBooleanField(term644091, term644091.getClass(), "unknown", true);
        setBooleanField(term644091, term644091.getClass(), "resolved", false);
        setField(term644091, term644091.getClass(), "resolveResult", null);
        setBooleanField(term644091, term644091.getClass(), "inTemplatedCheckVisit", false);
        setField(term644091, term644091.getClass(), "registry", null);
        setField(term644087, term644087.getClass(), "typeOfThis", term644091);
        setField(term644087, term644087.getClass(), "source", null);
        setField(term644087, term644087.getClass(), "implementedInterfaces", null);
        setField(term644087, term644087.getClass(), "extendedInterfaces", null);
        setField(term644087, term644087.getClass(), "subTypes", null);
        setField(term644087, term644087.getClass(), "templateTypeNames", null);
        setField(term644087, term644087.getClass(), "className", null);
        setField(term644087, term644087.getClass(), "properties", null);
        setBooleanField(term644087, term644087.getClass(), "nativeType", false);
        setField(term644087, term644087.getClass(), "implicitPrototypeFallback", null);
        setField(term644087, term644087.getClass(), "ownerFunction", null);
        setBooleanField(term644087, term644087.getClass(), "prettyPrint", false);
        setBooleanField(term644087, term644087.getClass(), "visited", false);
        setField(term644087, term644087.getClass(), "docInfo", null);
        setBooleanField(term644087, term644087.getClass(), "unknown", true);
        setBooleanField(term644087, term644087.getClass(), "resolved", false);
        setField(term644087, term644087.getClass(), "resolveResult", null);
        setBooleanField(term644087, term644087.getClass(), "inTemplatedCheckVisit", false);
        setField(term644087, term644087.getClass(), "registry", null);
        setField(term644083, term644083.getClass(), "typeOfThis", term644087);
        setField(term644083, term644083.getClass(), "source", null);
        setField(term644083, term644083.getClass(), "implementedInterfaces", null);
        setField(term644083, term644083.getClass(), "extendedInterfaces", null);
        setField(term644083, term644083.getClass(), "subTypes", term644092);
        setField(term644083, term644083.getClass(), "templateTypeNames", null);
        setField(term644083, term644083.getClass(), "className", null);
        setField(term644083, term644083.getClass(), "properties", null);
        setBooleanField(term644083, term644083.getClass(), "nativeType", false);
        setField(term644083, term644083.getClass(), "implicitPrototypeFallback", null);
        setField(term644083, term644083.getClass(), "ownerFunction", null);
        setBooleanField(term644083, term644083.getClass(), "prettyPrint", false);
        setBooleanField(term644083, term644083.getClass(), "visited", false);
        setField(term644083, term644083.getClass(), "docInfo", null);
        setBooleanField(term644083, term644083.getClass(), "unknown", true);
        setBooleanField(term644083, term644083.getClass(), "resolved", false);
        setField(term644083, term644083.getClass(), "resolveResult", null);
        setBooleanField(term644083, term644083.getClass(), "inTemplatedCheckVisit", false);
        setField(term644083, term644083.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearCachedValues", argTypes, term642762, args);
        assertTrue(recursiveEquals(term642762, term644083));
    }

};


