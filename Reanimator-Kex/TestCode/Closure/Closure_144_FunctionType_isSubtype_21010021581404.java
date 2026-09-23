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

public class FunctionType_isSubtype_21010021581404 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1992952;
     Object term1993550;
     Object term1996266;
     Object term1996275;

    public FunctionType_isSubtype_21010021581404() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1996282 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1996281 = ((Class) term1996282).getDeclaredField((String) "ORDINARY");
        ((Field) term1996281).setAccessible(true);
        Object enum3541 = ((Field) term1996281).get((Object) null);
        Class<? extends Object> term1996573 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1996572 = ((Class) term1996573).getDeclaredField((String) "INTERFACE");
        ((Field) term1996572).setAccessible(true);
        Object enum3542 = ((Field) term1996572).get((Object) null);
        term1992952 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1993200 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1993442 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1992952, term1992952.getClass(), "kind", enum3541);
        setField(term1993200, term1993200.getClass(), "kind", enum3542);
        setField(term1992952, term1992952.getClass(), "typeOfThis", term1993200);
        setField(term1992952, term1992952.getClass(), "call", term1993442);
        term1993550 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1993732 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1993550, term1993550.getClass(), "kind", enum3541);
        setField(term1993732, term1993732.getClass(), "kind", enum3541);
        setField(term1993550, term1993550.getClass(), "typeOfThis", term1993732);
        setField(term1993550, term1993550.getClass(), "call", null);
        Class<? extends Object> term1996867 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1996866 = ((Class) term1996867).getDeclaredField((String) "ORDINARY");
        ((Field) term1996866).setAccessible(true);
        Object enum3543 = ((Field) term1996866).get((Object) null);
        Class<? extends Object> term1997158 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1997157 = ((Class) term1997158).getDeclaredField((String) "INTERFACE");
        ((Field) term1997157).setAccessible(true);
        Object enum3544 = ((Field) term1997157).get((Object) null);
        term1996266 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1996267 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term1996271 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1996266, term1996266.getClass(), "this$0", null);
        setField(term1996267, term1996267.getClass(), "parameters", null);
        setField(term1996267, term1996267.getClass(), "returnType", null);
        setBooleanField(term1996267, term1996267.getClass(), "returnTypeInferred", false);
        setBooleanField(term1996267, term1996267.getClass(), "resolved", false);
        setField(term1996267, term1996267.getClass(), "resolveResult", null);
        setField(term1996267, term1996267.getClass(), "registry", null);
        setField(term1996266, term1996266.getClass(), "call", term1996267);
        setField(term1996266, term1996266.getClass(), "prototype", null);
        setField(term1996266, term1996266.getClass(), "kind", enum3543);
        setField(term1996271, term1996271.getClass(), "call", null);
        setField(term1996271, term1996271.getClass(), "prototype", null);
        setField(term1996271, term1996271.getClass(), "kind", enum3544);
        setField(term1996271, term1996271.getClass(), "typeOfThis", null);
        setField(term1996271, term1996271.getClass(), "source", null);
        setField(term1996271, term1996271.getClass(), "implementedInterfaces", null);
        setField(term1996271, term1996271.getClass(), "subTypes", null);
        setField(term1996271, term1996271.getClass(), "templateTypeName", null);
        setField(term1996271, term1996271.getClass(), "className", null);
        setField(term1996271, term1996271.getClass(), "properties", null);
        setField(term1996271, term1996271.getClass(), "implicitPrototype", null);
        setBooleanField(term1996271, term1996271.getClass(), "nativeType", false);
        setBooleanField(term1996271, term1996271.getClass(), "prettyPrint", false);
        setBooleanField(term1996271, term1996271.getClass(), "visited", false);
        setField(term1996271, term1996271.getClass(), "docInfo", null);
        setBooleanField(term1996271, term1996271.getClass(), "unknown", false);
        setBooleanField(term1996271, term1996271.getClass(), "resolved", false);
        setField(term1996271, term1996271.getClass(), "resolveResult", null);
        setField(term1996271, term1996271.getClass(), "registry", null);
        setField(term1996266, term1996266.getClass(), "typeOfThis", term1996271);
        setField(term1996266, term1996266.getClass(), "source", null);
        setField(term1996266, term1996266.getClass(), "implementedInterfaces", null);
        setField(term1996266, term1996266.getClass(), "subTypes", null);
        setField(term1996266, term1996266.getClass(), "templateTypeName", null);
        setField(term1996266, term1996266.getClass(), "className", null);
        setField(term1996266, term1996266.getClass(), "properties", null);
        setField(term1996266, term1996266.getClass(), "implicitPrototype", null);
        setBooleanField(term1996266, term1996266.getClass(), "nativeType", false);
        setBooleanField(term1996266, term1996266.getClass(), "prettyPrint", false);
        setBooleanField(term1996266, term1996266.getClass(), "visited", false);
        setField(term1996266, term1996266.getClass(), "docInfo", null);
        setBooleanField(term1996266, term1996266.getClass(), "unknown", false);
        setBooleanField(term1996266, term1996266.getClass(), "resolved", false);
        setField(term1996266, term1996266.getClass(), "resolveResult", null);
        setField(term1996266, term1996266.getClass(), "registry", null);
        Class<? extends Object> term1997452 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1997451 = ((Class) term1997452).getDeclaredField((String) "ORDINARY");
        ((Field) term1997451).setAccessible(true);
        Object enum3545 = ((Field) term1997451).get((Object) null);
        term1996275 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1996279 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1996275, term1996275.getClass(), "this$0", null);
        setField(term1996275, term1996275.getClass(), "call", null);
        setField(term1996275, term1996275.getClass(), "prototype", null);
        setField(term1996275, term1996275.getClass(), "kind", enum3545);
        setField(term1996279, term1996279.getClass(), "this$0", null);
        setField(term1996279, term1996279.getClass(), "call", null);
        setField(term1996279, term1996279.getClass(), "prototype", null);
        setField(term1996279, term1996279.getClass(), "kind", enum3545);
        setField(term1996279, term1996279.getClass(), "typeOfThis", null);
        setField(term1996279, term1996279.getClass(), "source", null);
        setField(term1996279, term1996279.getClass(), "implementedInterfaces", null);
        setField(term1996279, term1996279.getClass(), "subTypes", null);
        setField(term1996279, term1996279.getClass(), "templateTypeName", null);
        setField(term1996279, term1996279.getClass(), "className", null);
        setField(term1996279, term1996279.getClass(), "properties", null);
        setField(term1996279, term1996279.getClass(), "implicitPrototype", null);
        setBooleanField(term1996279, term1996279.getClass(), "nativeType", false);
        setBooleanField(term1996279, term1996279.getClass(), "prettyPrint", false);
        setBooleanField(term1996279, term1996279.getClass(), "visited", false);
        setField(term1996279, term1996279.getClass(), "docInfo", null);
        setBooleanField(term1996279, term1996279.getClass(), "unknown", false);
        setBooleanField(term1996279, term1996279.getClass(), "resolved", false);
        setField(term1996279, term1996279.getClass(), "resolveResult", null);
        setField(term1996279, term1996279.getClass(), "registry", null);
        setField(term1996275, term1996275.getClass(), "typeOfThis", term1996279);
        setField(term1996275, term1996275.getClass(), "source", null);
        setField(term1996275, term1996275.getClass(), "implementedInterfaces", null);
        setField(term1996275, term1996275.getClass(), "subTypes", null);
        setField(term1996275, term1996275.getClass(), "templateTypeName", null);
        setField(term1996275, term1996275.getClass(), "className", null);
        setField(term1996275, term1996275.getClass(), "properties", null);
        setField(term1996275, term1996275.getClass(), "implicitPrototype", null);
        setBooleanField(term1996275, term1996275.getClass(), "nativeType", false);
        setBooleanField(term1996275, term1996275.getClass(), "prettyPrint", false);
        setBooleanField(term1996275, term1996275.getClass(), "visited", false);
        setField(term1996275, term1996275.getClass(), "docInfo", null);
        setBooleanField(term1996275, term1996275.getClass(), "unknown", false);
        setBooleanField(term1996275, term1996275.getClass(), "resolved", false);
        setField(term1996275, term1996275.getClass(), "resolveResult", null);
        setField(term1996275, term1996275.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1993550;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1992952, args);
        assertTrue(recursiveEquals(term1992952, term1996266));
        assertTrue(recursiveEquals(term1993550, term1996275));
        assertTrue(recursiveEquals(retValue, false));
    }

};


