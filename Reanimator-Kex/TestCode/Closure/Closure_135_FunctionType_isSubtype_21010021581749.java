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

public class FunctionType_isSubtype_21010021581749 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2387628;
     Object term2388388;
     Object term2390969;
     Object term2390975;

    public FunctionType_isSubtype_21010021581749() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2390982 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2390981 = ((Class) term2390982).getDeclaredField((String) "INTERFACE");
        ((Field) term2390981).setAccessible(true);
        Object enum4465 = ((Field) term2390981).get((Object) null);
        term2387628 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term2388172 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2388280 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term2387628, term2387628.getClass(), "kind", enum4465);
        setField(term2388172, term2388172.getClass(), "kind", enum4465);
        setField(term2388172, term2388172.getClass(), "typeOfThis", term2388280);
        setField(term2387628, term2387628.getClass(), "typeOfThis", term2388172);
        term2388388 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2388718 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2388388, term2388388.getClass(), "kind", enum4465);
        setField(term2388718, term2388718.getClass(), "kind", enum4465);
        setField(term2388718, term2388718.getClass(), "typeOfThis", null);
        setField(term2388388, term2388388.getClass(), "typeOfThis", term2388718);
        Class<? extends Object> term2391276 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2391275 = ((Class) term2391276).getDeclaredField((String) "INTERFACE");
        ((Field) term2391275).setAccessible(true);
        Object enum4466 = ((Field) term2391275).get((Object) null);
        term2390969 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term2390973 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2390974 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term2390969, term2390969.getClass(), "this$0", null);
        setField(term2390969, term2390969.getClass(), "call", null);
        setField(term2390969, term2390969.getClass(), "prototype", null);
        setField(term2390969, term2390969.getClass(), "kind", enum4466);
        setField(term2390973, term2390973.getClass(), "call", null);
        setField(term2390973, term2390973.getClass(), "prototype", null);
        setField(term2390973, term2390973.getClass(), "kind", enum4466);
        setField(term2390974, term2390974.getClass(), "this$0", null);
        setField(term2390974, term2390974.getClass(), "call", null);
        setField(term2390974, term2390974.getClass(), "prototype", null);
        setField(term2390974, term2390974.getClass(), "kind", null);
        setField(term2390974, term2390974.getClass(), "typeOfThis", null);
        setField(term2390974, term2390974.getClass(), "source", null);
        setField(term2390974, term2390974.getClass(), "implementedInterfaces", null);
        setField(term2390974, term2390974.getClass(), "subTypes", null);
        setField(term2390974, term2390974.getClass(), "templateTypeName", null);
        setField(term2390974, term2390974.getClass(), "className", null);
        setField(term2390974, term2390974.getClass(), "properties", null);
        setField(term2390974, term2390974.getClass(), "implicitPrototype", null);
        setBooleanField(term2390974, term2390974.getClass(), "nativeType", false);
        setBooleanField(term2390974, term2390974.getClass(), "visited", false);
        setField(term2390974, term2390974.getClass(), "docInfo", null);
        setBooleanField(term2390974, term2390974.getClass(), "unknown", false);
        setBooleanField(term2390974, term2390974.getClass(), "resolved", false);
        setField(term2390974, term2390974.getClass(), "resolveResult", null);
        setField(term2390974, term2390974.getClass(), "registry", null);
        setField(term2390973, term2390973.getClass(), "typeOfThis", term2390974);
        setField(term2390973, term2390973.getClass(), "source", null);
        setField(term2390973, term2390973.getClass(), "implementedInterfaces", null);
        setField(term2390973, term2390973.getClass(), "subTypes", null);
        setField(term2390973, term2390973.getClass(), "templateTypeName", null);
        setField(term2390973, term2390973.getClass(), "className", null);
        setField(term2390973, term2390973.getClass(), "properties", null);
        setField(term2390973, term2390973.getClass(), "implicitPrototype", null);
        setBooleanField(term2390973, term2390973.getClass(), "nativeType", false);
        setBooleanField(term2390973, term2390973.getClass(), "visited", false);
        setField(term2390973, term2390973.getClass(), "docInfo", null);
        setBooleanField(term2390973, term2390973.getClass(), "unknown", false);
        setBooleanField(term2390973, term2390973.getClass(), "resolved", false);
        setField(term2390973, term2390973.getClass(), "resolveResult", null);
        setField(term2390973, term2390973.getClass(), "registry", null);
        setField(term2390969, term2390969.getClass(), "typeOfThis", term2390973);
        setField(term2390969, term2390969.getClass(), "source", null);
        setField(term2390969, term2390969.getClass(), "implementedInterfaces", null);
        setField(term2390969, term2390969.getClass(), "subTypes", null);
        setField(term2390969, term2390969.getClass(), "templateTypeName", null);
        setField(term2390969, term2390969.getClass(), "className", null);
        setField(term2390969, term2390969.getClass(), "properties", null);
        setField(term2390969, term2390969.getClass(), "implicitPrototype", null);
        setBooleanField(term2390969, term2390969.getClass(), "nativeType", false);
        setBooleanField(term2390969, term2390969.getClass(), "visited", false);
        setField(term2390969, term2390969.getClass(), "docInfo", null);
        setBooleanField(term2390969, term2390969.getClass(), "unknown", false);
        setBooleanField(term2390969, term2390969.getClass(), "resolved", false);
        setField(term2390969, term2390969.getClass(), "resolveResult", null);
        setField(term2390969, term2390969.getClass(), "registry", null);
        Class<? extends Object> term2391570 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2391569 = ((Class) term2391570).getDeclaredField((String) "INTERFACE");
        ((Field) term2391569).setAccessible(true);
        Object enum4467 = ((Field) term2391569).get((Object) null);
        term2390975 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2390979 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2390975, term2390975.getClass(), "this$0", null);
        setField(term2390975, term2390975.getClass(), "call", null);
        setField(term2390975, term2390975.getClass(), "prototype", null);
        setField(term2390975, term2390975.getClass(), "kind", enum4467);
        setField(term2390979, term2390979.getClass(), "this$0", null);
        setField(term2390979, term2390979.getClass(), "call", null);
        setField(term2390979, term2390979.getClass(), "prototype", null);
        setField(term2390979, term2390979.getClass(), "kind", enum4467);
        setField(term2390979, term2390979.getClass(), "typeOfThis", null);
        setField(term2390979, term2390979.getClass(), "source", null);
        setField(term2390979, term2390979.getClass(), "implementedInterfaces", null);
        setField(term2390979, term2390979.getClass(), "subTypes", null);
        setField(term2390979, term2390979.getClass(), "templateTypeName", null);
        setField(term2390979, term2390979.getClass(), "className", null);
        setField(term2390979, term2390979.getClass(), "properties", null);
        setField(term2390979, term2390979.getClass(), "implicitPrototype", null);
        setBooleanField(term2390979, term2390979.getClass(), "nativeType", false);
        setBooleanField(term2390979, term2390979.getClass(), "visited", false);
        setField(term2390979, term2390979.getClass(), "docInfo", null);
        setBooleanField(term2390979, term2390979.getClass(), "unknown", false);
        setBooleanField(term2390979, term2390979.getClass(), "resolved", false);
        setField(term2390979, term2390979.getClass(), "resolveResult", null);
        setField(term2390979, term2390979.getClass(), "registry", null);
        setField(term2390975, term2390975.getClass(), "typeOfThis", term2390979);
        setField(term2390975, term2390975.getClass(), "source", null);
        setField(term2390975, term2390975.getClass(), "implementedInterfaces", null);
        setField(term2390975, term2390975.getClass(), "subTypes", null);
        setField(term2390975, term2390975.getClass(), "templateTypeName", null);
        setField(term2390975, term2390975.getClass(), "className", null);
        setField(term2390975, term2390975.getClass(), "properties", null);
        setField(term2390975, term2390975.getClass(), "implicitPrototype", null);
        setBooleanField(term2390975, term2390975.getClass(), "nativeType", false);
        setBooleanField(term2390975, term2390975.getClass(), "visited", false);
        setField(term2390975, term2390975.getClass(), "docInfo", null);
        setBooleanField(term2390975, term2390975.getClass(), "unknown", false);
        setBooleanField(term2390975, term2390975.getClass(), "resolved", false);
        setField(term2390975, term2390975.getClass(), "resolveResult", null);
        setField(term2390975, term2390975.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2388388;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term2387628, args);
        assertTrue(recursiveEquals(term2387628, term2390969));
        assertTrue(recursiveEquals(term2388388, term2390975));
        assertTrue(recursiveEquals(retValue, true));
    }

};


