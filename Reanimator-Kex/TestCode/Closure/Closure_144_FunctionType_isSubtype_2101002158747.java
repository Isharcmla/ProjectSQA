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

public class FunctionType_isSubtype_2101002158747 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term816695;
     Object term817293;
     Object term818897;
     Object term818906;

    public FunctionType_isSubtype_2101002158747() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term818916 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term818915 = ((Class) term818916).getDeclaredField((String) "ORDINARY");
        ((Field) term818915).setAccessible(true);
        Object enum1474 = ((Field) term818915).get((Object) null);
        Class<? extends Object> term819207 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term819206 = ((Class) term819207).getDeclaredField((String) "INTERFACE");
        ((Field) term819206).setAccessible(true);
        Object enum1475 = ((Field) term819206).get((Object) null);
        term816695 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term816943 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term817185 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term816695, term816695.getClass(), "kind", enum1474);
        setField(term816943, term816943.getClass(), "kind", enum1475);
        setField(term816695, term816695.getClass(), "typeOfThis", term816943);
        setField(term816695, term816695.getClass(), "call", term817185);
        Class<? extends Object> term819501 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term819500 = ((Class) term819501).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term819500).setAccessible(true);
        Object enum1476 = ((Field) term819500).get((Object) null);
        term817293 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term817477 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term817293, term817293.getClass(), "kind", enum1474);
        setField(term817477, term817477.getClass(), "kind", enum1476);
        setField(term817293, term817293.getClass(), "typeOfThis", term817477);
        setField(term817293, term817293.getClass(), "call", null);
        Class<? extends Object> term819801 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term819800 = ((Class) term819801).getDeclaredField((String) "ORDINARY");
        ((Field) term819800).setAccessible(true);
        Object enum1477 = ((Field) term819800).get((Object) null);
        Class<? extends Object> term820092 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term820091 = ((Class) term820092).getDeclaredField((String) "INTERFACE");
        ((Field) term820091).setAccessible(true);
        Object enum1478 = ((Field) term820091).get((Object) null);
        term818897 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term818898 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term818902 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term818897, term818897.getClass(), "this$0", null);
        setField(term818898, term818898.getClass(), "parameters", null);
        setField(term818898, term818898.getClass(), "returnType", null);
        setBooleanField(term818898, term818898.getClass(), "returnTypeInferred", false);
        setBooleanField(term818898, term818898.getClass(), "resolved", false);
        setField(term818898, term818898.getClass(), "resolveResult", null);
        setField(term818898, term818898.getClass(), "registry", null);
        setField(term818897, term818897.getClass(), "call", term818898);
        setField(term818897, term818897.getClass(), "prototype", null);
        setField(term818897, term818897.getClass(), "kind", enum1477);
        setField(term818902, term818902.getClass(), "call", null);
        setField(term818902, term818902.getClass(), "prototype", null);
        setField(term818902, term818902.getClass(), "kind", enum1478);
        setField(term818902, term818902.getClass(), "typeOfThis", null);
        setField(term818902, term818902.getClass(), "source", null);
        setField(term818902, term818902.getClass(), "implementedInterfaces", null);
        setField(term818902, term818902.getClass(), "subTypes", null);
        setField(term818902, term818902.getClass(), "templateTypeName", null);
        setField(term818902, term818902.getClass(), "className", null);
        setField(term818902, term818902.getClass(), "properties", null);
        setField(term818902, term818902.getClass(), "implicitPrototype", null);
        setBooleanField(term818902, term818902.getClass(), "nativeType", false);
        setBooleanField(term818902, term818902.getClass(), "prettyPrint", false);
        setBooleanField(term818902, term818902.getClass(), "visited", false);
        setField(term818902, term818902.getClass(), "docInfo", null);
        setBooleanField(term818902, term818902.getClass(), "unknown", false);
        setBooleanField(term818902, term818902.getClass(), "resolved", false);
        setField(term818902, term818902.getClass(), "resolveResult", null);
        setField(term818902, term818902.getClass(), "registry", null);
        setField(term818897, term818897.getClass(), "typeOfThis", term818902);
        setField(term818897, term818897.getClass(), "source", null);
        setField(term818897, term818897.getClass(), "implementedInterfaces", null);
        setField(term818897, term818897.getClass(), "subTypes", null);
        setField(term818897, term818897.getClass(), "templateTypeName", null);
        setField(term818897, term818897.getClass(), "className", null);
        setField(term818897, term818897.getClass(), "properties", null);
        setField(term818897, term818897.getClass(), "implicitPrototype", null);
        setBooleanField(term818897, term818897.getClass(), "nativeType", false);
        setBooleanField(term818897, term818897.getClass(), "prettyPrint", false);
        setBooleanField(term818897, term818897.getClass(), "visited", false);
        setField(term818897, term818897.getClass(), "docInfo", null);
        setBooleanField(term818897, term818897.getClass(), "unknown", false);
        setBooleanField(term818897, term818897.getClass(), "resolved", false);
        setField(term818897, term818897.getClass(), "resolveResult", null);
        setField(term818897, term818897.getClass(), "registry", null);
        Class<? extends Object> term820386 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term820385 = ((Class) term820386).getDeclaredField((String) "ORDINARY");
        ((Field) term820385).setAccessible(true);
        Object enum1479 = ((Field) term820385).get((Object) null);
        Class<? extends Object> term820677 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term820676 = ((Class) term820677).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term820676).setAccessible(true);
        Object enum1480 = ((Field) term820676).get((Object) null);
        term818906 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term818910 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term818906, term818906.getClass(), "this$0", null);
        setField(term818906, term818906.getClass(), "call", null);
        setField(term818906, term818906.getClass(), "prototype", null);
        setField(term818906, term818906.getClass(), "kind", enum1479);
        setField(term818910, term818910.getClass(), "call", null);
        setField(term818910, term818910.getClass(), "prototype", null);
        setField(term818910, term818910.getClass(), "kind", enum1480);
        setField(term818910, term818910.getClass(), "typeOfThis", null);
        setField(term818910, term818910.getClass(), "source", null);
        setField(term818910, term818910.getClass(), "implementedInterfaces", null);
        setField(term818910, term818910.getClass(), "subTypes", null);
        setField(term818910, term818910.getClass(), "templateTypeName", null);
        setField(term818910, term818910.getClass(), "className", null);
        setField(term818910, term818910.getClass(), "properties", null);
        setField(term818910, term818910.getClass(), "implicitPrototype", null);
        setBooleanField(term818910, term818910.getClass(), "nativeType", false);
        setBooleanField(term818910, term818910.getClass(), "prettyPrint", false);
        setBooleanField(term818910, term818910.getClass(), "visited", false);
        setField(term818910, term818910.getClass(), "docInfo", null);
        setBooleanField(term818910, term818910.getClass(), "unknown", false);
        setBooleanField(term818910, term818910.getClass(), "resolved", false);
        setField(term818910, term818910.getClass(), "resolveResult", null);
        setField(term818910, term818910.getClass(), "registry", null);
        setField(term818906, term818906.getClass(), "typeOfThis", term818910);
        setField(term818906, term818906.getClass(), "source", null);
        setField(term818906, term818906.getClass(), "implementedInterfaces", null);
        setField(term818906, term818906.getClass(), "subTypes", null);
        setField(term818906, term818906.getClass(), "templateTypeName", null);
        setField(term818906, term818906.getClass(), "className", null);
        setField(term818906, term818906.getClass(), "properties", null);
        setField(term818906, term818906.getClass(), "implicitPrototype", null);
        setBooleanField(term818906, term818906.getClass(), "nativeType", false);
        setBooleanField(term818906, term818906.getClass(), "prettyPrint", false);
        setBooleanField(term818906, term818906.getClass(), "visited", false);
        setField(term818906, term818906.getClass(), "docInfo", null);
        setBooleanField(term818906, term818906.getClass(), "unknown", false);
        setBooleanField(term818906, term818906.getClass(), "resolved", false);
        setField(term818906, term818906.getClass(), "resolveResult", null);
        setField(term818906, term818906.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term817293;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term816695, args);
        assertTrue(recursiveEquals(term816695, term818897));
        assertTrue(recursiveEquals(term817293, term818906));
        assertTrue(recursiveEquals(retValue, false));
    }

};


