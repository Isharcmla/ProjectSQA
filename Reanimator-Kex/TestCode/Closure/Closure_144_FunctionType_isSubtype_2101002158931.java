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

public class FunctionType_isSubtype_2101002158931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1143677;
     Object term1144339;
     Object term1145230;
     Object term1145235;

    public FunctionType_isSubtype_2101002158931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1145242 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1145241 = ((Class) term1145242).getDeclaredField((String) "INTERFACE");
        ((Field) term1145241).setAccessible(true);
        Object enum2058 = ((Field) term1145241).get((Object) null);
        term1143677 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1144229 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1143677, term1143677.getClass(), "kind", enum2058);
        setField(term1143677, term1143677.getClass(), "typeOfThis", term1144229);
        Class<? extends Object> term1145536 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1145535 = ((Class) term1145536).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1145535).setAccessible(true);
        Object enum2059 = ((Field) term1145535).get((Object) null);
        term1144339 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1144501 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term1144339, term1144339.getClass(), "kind", enum2059);
        setField(term1144339, term1144339.getClass(), "typeOfThis", term1144501);
        Class<? extends Object> term1145836 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1145835 = ((Class) term1145836).getDeclaredField((String) "INTERFACE");
        ((Field) term1145835).setAccessible(true);
        Object enum2060 = ((Field) term1145835).get((Object) null);
        term1145230 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1145234 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1145230, term1145230.getClass(), "call", null);
        setField(term1145230, term1145230.getClass(), "prototype", null);
        setField(term1145230, term1145230.getClass(), "kind", enum2060);
        setField(term1145234, term1145234.getClass(), "this$0", null);
        setField(term1145234, term1145234.getClass(), "call", null);
        setField(term1145234, term1145234.getClass(), "prototype", null);
        setField(term1145234, term1145234.getClass(), "kind", null);
        setField(term1145234, term1145234.getClass(), "typeOfThis", null);
        setField(term1145234, term1145234.getClass(), "source", null);
        setField(term1145234, term1145234.getClass(), "implementedInterfaces", null);
        setField(term1145234, term1145234.getClass(), "subTypes", null);
        setField(term1145234, term1145234.getClass(), "templateTypeName", null);
        setField(term1145234, term1145234.getClass(), "className", null);
        setField(term1145234, term1145234.getClass(), "properties", null);
        setField(term1145234, term1145234.getClass(), "implicitPrototype", null);
        setBooleanField(term1145234, term1145234.getClass(), "nativeType", false);
        setBooleanField(term1145234, term1145234.getClass(), "prettyPrint", false);
        setBooleanField(term1145234, term1145234.getClass(), "visited", false);
        setField(term1145234, term1145234.getClass(), "docInfo", null);
        setBooleanField(term1145234, term1145234.getClass(), "unknown", false);
        setBooleanField(term1145234, term1145234.getClass(), "resolved", false);
        setField(term1145234, term1145234.getClass(), "resolveResult", null);
        setField(term1145234, term1145234.getClass(), "registry", null);
        setField(term1145230, term1145230.getClass(), "typeOfThis", term1145234);
        setField(term1145230, term1145230.getClass(), "source", null);
        setField(term1145230, term1145230.getClass(), "implementedInterfaces", null);
        setField(term1145230, term1145230.getClass(), "subTypes", null);
        setField(term1145230, term1145230.getClass(), "templateTypeName", null);
        setField(term1145230, term1145230.getClass(), "className", null);
        setField(term1145230, term1145230.getClass(), "properties", null);
        setField(term1145230, term1145230.getClass(), "implicitPrototype", null);
        setBooleanField(term1145230, term1145230.getClass(), "nativeType", false);
        setBooleanField(term1145230, term1145230.getClass(), "prettyPrint", false);
        setBooleanField(term1145230, term1145230.getClass(), "visited", false);
        setField(term1145230, term1145230.getClass(), "docInfo", null);
        setBooleanField(term1145230, term1145230.getClass(), "unknown", false);
        setBooleanField(term1145230, term1145230.getClass(), "resolved", false);
        setField(term1145230, term1145230.getClass(), "resolveResult", null);
        setField(term1145230, term1145230.getClass(), "registry", null);
        Class<? extends Object> term1146130 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1146129 = ((Class) term1146130).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1146129).setAccessible(true);
        Object enum2061 = ((Field) term1146129).get((Object) null);
        term1145235 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1145239 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term1145235, term1145235.getClass(), "call", null);
        setField(term1145235, term1145235.getClass(), "prototype", null);
        setField(term1145235, term1145235.getClass(), "kind", enum2061);
        setField(term1145239, term1145239.getClass(), "leastSupertypeVisitor", null);
        setField(term1145239, term1145239.getClass(), "greatestSubtypeVisitor", null);
        setField(term1145239, term1145239.getClass(), "call", null);
        setField(term1145239, term1145239.getClass(), "prototype", null);
        setField(term1145239, term1145239.getClass(), "kind", null);
        setField(term1145239, term1145239.getClass(), "typeOfThis", null);
        setField(term1145239, term1145239.getClass(), "source", null);
        setField(term1145239, term1145239.getClass(), "implementedInterfaces", null);
        setField(term1145239, term1145239.getClass(), "subTypes", null);
        setField(term1145239, term1145239.getClass(), "templateTypeName", null);
        setField(term1145239, term1145239.getClass(), "className", null);
        setField(term1145239, term1145239.getClass(), "properties", null);
        setField(term1145239, term1145239.getClass(), "implicitPrototype", null);
        setBooleanField(term1145239, term1145239.getClass(), "nativeType", false);
        setBooleanField(term1145239, term1145239.getClass(), "prettyPrint", false);
        setBooleanField(term1145239, term1145239.getClass(), "visited", false);
        setField(term1145239, term1145239.getClass(), "docInfo", null);
        setBooleanField(term1145239, term1145239.getClass(), "unknown", false);
        setBooleanField(term1145239, term1145239.getClass(), "resolved", false);
        setField(term1145239, term1145239.getClass(), "resolveResult", null);
        setField(term1145239, term1145239.getClass(), "registry", null);
        setField(term1145235, term1145235.getClass(), "typeOfThis", term1145239);
        setField(term1145235, term1145235.getClass(), "source", null);
        setField(term1145235, term1145235.getClass(), "implementedInterfaces", null);
        setField(term1145235, term1145235.getClass(), "subTypes", null);
        setField(term1145235, term1145235.getClass(), "templateTypeName", null);
        setField(term1145235, term1145235.getClass(), "className", null);
        setField(term1145235, term1145235.getClass(), "properties", null);
        setField(term1145235, term1145235.getClass(), "implicitPrototype", null);
        setBooleanField(term1145235, term1145235.getClass(), "nativeType", false);
        setBooleanField(term1145235, term1145235.getClass(), "prettyPrint", false);
        setBooleanField(term1145235, term1145235.getClass(), "visited", false);
        setField(term1145235, term1145235.getClass(), "docInfo", null);
        setBooleanField(term1145235, term1145235.getClass(), "unknown", false);
        setBooleanField(term1145235, term1145235.getClass(), "resolved", false);
        setField(term1145235, term1145235.getClass(), "resolveResult", null);
        setField(term1145235, term1145235.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1144339;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1143677, args);
        assertTrue(recursiveEquals(term1143677, term1145230));
        assertTrue(recursiveEquals(term1144339, term1145235));
        assertTrue(recursiveEquals(retValue, false));
    }

};


