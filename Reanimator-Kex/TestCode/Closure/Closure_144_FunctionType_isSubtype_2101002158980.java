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

public class FunctionType_isSubtype_2101002158980 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1221943;
     Object term1222595;
     Object term1225789;
     Object term1225794;

    public FunctionType_isSubtype_2101002158980() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1225801 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1225800 = ((Class) term1225801).getDeclaredField((String) "ORDINARY");
        ((Field) term1225800).setAccessible(true);
        Object enum2197 = ((Field) term1225800).get((Object) null);
        Class<? extends Object> term1226092 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1226091 = ((Class) term1226092).getDeclaredField((String) "INTERFACE");
        ((Field) term1226091).setAccessible(true);
        Object enum2198 = ((Field) term1226091).get((Object) null);
        term1221943 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1222487 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1221943, term1221943.getClass(), "kind", enum2197);
        setField(term1222487, term1222487.getClass(), "kind", enum2198);
        setField(term1221943, term1221943.getClass(), "typeOfThis", term1222487);
        Class<? extends Object> term1226386 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1226385 = ((Class) term1226386).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1226385).setAccessible(true);
        Object enum2199 = ((Field) term1226385).get((Object) null);
        term1222595 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1222777 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1222595, term1222595.getClass(), "kind", enum2199);
        setField(term1222595, term1222595.getClass(), "typeOfThis", term1222777);
        Class<? extends Object> term1226686 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1226685 = ((Class) term1226686).getDeclaredField((String) "INTERFACE");
        ((Field) term1226685).setAccessible(true);
        Object enum2200 = ((Field) term1226685).get((Object) null);
        term1225789 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1225793 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1225789, term1225789.getClass(), "this$0", null);
        setField(term1225789, term1225789.getClass(), "call", null);
        setField(term1225789, term1225789.getClass(), "prototype", null);
        setField(term1225789, term1225789.getClass(), "kind", enum2200);
        setField(term1225793, term1225793.getClass(), "call", null);
        setField(term1225793, term1225793.getClass(), "prototype", null);
        setField(term1225793, term1225793.getClass(), "kind", enum2200);
        setField(term1225793, term1225793.getClass(), "typeOfThis", null);
        setField(term1225793, term1225793.getClass(), "source", null);
        setField(term1225793, term1225793.getClass(), "implementedInterfaces", null);
        setField(term1225793, term1225793.getClass(), "subTypes", null);
        setField(term1225793, term1225793.getClass(), "templateTypeName", null);
        setField(term1225793, term1225793.getClass(), "className", null);
        setField(term1225793, term1225793.getClass(), "properties", null);
        setField(term1225793, term1225793.getClass(), "implicitPrototype", null);
        setBooleanField(term1225793, term1225793.getClass(), "nativeType", false);
        setBooleanField(term1225793, term1225793.getClass(), "prettyPrint", false);
        setBooleanField(term1225793, term1225793.getClass(), "visited", false);
        setField(term1225793, term1225793.getClass(), "docInfo", null);
        setBooleanField(term1225793, term1225793.getClass(), "unknown", false);
        setBooleanField(term1225793, term1225793.getClass(), "resolved", false);
        setField(term1225793, term1225793.getClass(), "resolveResult", null);
        setField(term1225793, term1225793.getClass(), "registry", null);
        setField(term1225789, term1225789.getClass(), "typeOfThis", term1225793);
        setField(term1225789, term1225789.getClass(), "source", null);
        setField(term1225789, term1225789.getClass(), "implementedInterfaces", null);
        setField(term1225789, term1225789.getClass(), "subTypes", null);
        setField(term1225789, term1225789.getClass(), "templateTypeName", null);
        setField(term1225789, term1225789.getClass(), "className", null);
        setField(term1225789, term1225789.getClass(), "properties", null);
        setField(term1225789, term1225789.getClass(), "implicitPrototype", null);
        setBooleanField(term1225789, term1225789.getClass(), "nativeType", false);
        setBooleanField(term1225789, term1225789.getClass(), "prettyPrint", false);
        setBooleanField(term1225789, term1225789.getClass(), "visited", false);
        setField(term1225789, term1225789.getClass(), "docInfo", null);
        setBooleanField(term1225789, term1225789.getClass(), "unknown", false);
        setBooleanField(term1225789, term1225789.getClass(), "resolved", false);
        setField(term1225789, term1225789.getClass(), "resolveResult", null);
        setField(term1225789, term1225789.getClass(), "registry", null);
        Class<? extends Object> term1226980 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1226979 = ((Class) term1226980).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1226979).setAccessible(true);
        Object enum2201 = ((Field) term1226979).get((Object) null);
        term1225794 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1225798 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1225794, term1225794.getClass(), "this$0", null);
        setField(term1225794, term1225794.getClass(), "call", null);
        setField(term1225794, term1225794.getClass(), "prototype", null);
        setField(term1225794, term1225794.getClass(), "kind", enum2201);
        setField(term1225798, term1225798.getClass(), "this$0", null);
        setField(term1225798, term1225798.getClass(), "call", null);
        setField(term1225798, term1225798.getClass(), "prototype", null);
        setField(term1225798, term1225798.getClass(), "kind", null);
        setField(term1225798, term1225798.getClass(), "typeOfThis", null);
        setField(term1225798, term1225798.getClass(), "source", null);
        setField(term1225798, term1225798.getClass(), "implementedInterfaces", null);
        setField(term1225798, term1225798.getClass(), "subTypes", null);
        setField(term1225798, term1225798.getClass(), "templateTypeName", null);
        setField(term1225798, term1225798.getClass(), "className", null);
        setField(term1225798, term1225798.getClass(), "properties", null);
        setField(term1225798, term1225798.getClass(), "implicitPrototype", null);
        setBooleanField(term1225798, term1225798.getClass(), "nativeType", false);
        setBooleanField(term1225798, term1225798.getClass(), "prettyPrint", false);
        setBooleanField(term1225798, term1225798.getClass(), "visited", false);
        setField(term1225798, term1225798.getClass(), "docInfo", null);
        setBooleanField(term1225798, term1225798.getClass(), "unknown", false);
        setBooleanField(term1225798, term1225798.getClass(), "resolved", false);
        setField(term1225798, term1225798.getClass(), "resolveResult", null);
        setField(term1225798, term1225798.getClass(), "registry", null);
        setField(term1225794, term1225794.getClass(), "typeOfThis", term1225798);
        setField(term1225794, term1225794.getClass(), "source", null);
        setField(term1225794, term1225794.getClass(), "implementedInterfaces", null);
        setField(term1225794, term1225794.getClass(), "subTypes", null);
        setField(term1225794, term1225794.getClass(), "templateTypeName", null);
        setField(term1225794, term1225794.getClass(), "className", null);
        setField(term1225794, term1225794.getClass(), "properties", null);
        setField(term1225794, term1225794.getClass(), "implicitPrototype", null);
        setBooleanField(term1225794, term1225794.getClass(), "nativeType", false);
        setBooleanField(term1225794, term1225794.getClass(), "prettyPrint", false);
        setBooleanField(term1225794, term1225794.getClass(), "visited", false);
        setField(term1225794, term1225794.getClass(), "docInfo", null);
        setBooleanField(term1225794, term1225794.getClass(), "unknown", false);
        setBooleanField(term1225794, term1225794.getClass(), "resolved", false);
        setField(term1225794, term1225794.getClass(), "resolveResult", null);
        setField(term1225794, term1225794.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1222595;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1221943, args);
        assertTrue(recursiveEquals(term1221943, term1225789));
        assertTrue(recursiveEquals(term1222595, term1225794));
        assertTrue(recursiveEquals(retValue, false));
    }

};


