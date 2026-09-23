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

public class FunctionType_isSubtype_21010021581261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1567633;
     Object term1568393;
     Object term1569295;
     Object term1569301;

    public FunctionType_isSubtype_21010021581261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1569308 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1569307 = ((Class) term1569308).getDeclaredField((String) "ORDINARY");
        ((Field) term1569307).setAccessible(true);
        Object enum2928 = ((Field) term1569307).get((Object) null);
        term1567633 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1568177 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1568285 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1567633, term1567633.getClass(), "kind", enum2928);
        setField(term1568177, term1568177.getClass(), "kind", enum2928);
        setField(term1568177, term1568177.getClass(), "typeOfThis", term1568285);
        setField(term1567633, term1567633.getClass(), "typeOfThis", term1568177);
        Class<? extends Object> term1569599 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1569598 = ((Class) term1569599).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1569598).setAccessible(true);
        Object enum2929 = ((Field) term1569598).get((Object) null);
        term1568393 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1568575 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1568393, term1568393.getClass(), "kind", enum2929);
        setField(term1568575, term1568575.getClass(), "kind", enum2929);
        setField(term1568575, term1568575.getClass(), "typeOfThis", null);
        setField(term1568393, term1568393.getClass(), "typeOfThis", term1568575);
        Class<? extends Object> term1569899 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1569898 = ((Class) term1569899).getDeclaredField((String) "INTERFACE");
        ((Field) term1569898).setAccessible(true);
        Object enum2930 = ((Field) term1569898).get((Object) null);
        term1569295 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1569299 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1569300 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1569295, term1569295.getClass(), "this$0", null);
        setField(term1569295, term1569295.getClass(), "call", null);
        setField(term1569295, term1569295.getClass(), "prototype", null);
        setField(term1569295, term1569295.getClass(), "kind", enum2930);
        setField(term1569299, term1569299.getClass(), "call", null);
        setField(term1569299, term1569299.getClass(), "prototype", null);
        setField(term1569299, term1569299.getClass(), "kind", enum2930);
        setField(term1569300, term1569300.getClass(), "this$0", null);
        setField(term1569300, term1569300.getClass(), "call", null);
        setField(term1569300, term1569300.getClass(), "prototype", null);
        setField(term1569300, term1569300.getClass(), "kind", null);
        setField(term1569300, term1569300.getClass(), "typeOfThis", null);
        setField(term1569300, term1569300.getClass(), "source", null);
        setField(term1569300, term1569300.getClass(), "implementedInterfaces", null);
        setField(term1569300, term1569300.getClass(), "subTypes", null);
        setField(term1569300, term1569300.getClass(), "templateTypeName", null);
        setField(term1569300, term1569300.getClass(), "className", null);
        setField(term1569300, term1569300.getClass(), "properties", null);
        setField(term1569300, term1569300.getClass(), "implicitPrototype", null);
        setBooleanField(term1569300, term1569300.getClass(), "nativeType", false);
        setBooleanField(term1569300, term1569300.getClass(), "visited", false);
        setField(term1569300, term1569300.getClass(), "docInfo", null);
        setBooleanField(term1569300, term1569300.getClass(), "unknown", false);
        setBooleanField(term1569300, term1569300.getClass(), "resolved", false);
        setField(term1569300, term1569300.getClass(), "resolveResult", null);
        setField(term1569300, term1569300.getClass(), "registry", null);
        setField(term1569299, term1569299.getClass(), "typeOfThis", term1569300);
        setField(term1569299, term1569299.getClass(), "source", null);
        setField(term1569299, term1569299.getClass(), "implementedInterfaces", null);
        setField(term1569299, term1569299.getClass(), "subTypes", null);
        setField(term1569299, term1569299.getClass(), "templateTypeName", null);
        setField(term1569299, term1569299.getClass(), "className", null);
        setField(term1569299, term1569299.getClass(), "properties", null);
        setField(term1569299, term1569299.getClass(), "implicitPrototype", null);
        setBooleanField(term1569299, term1569299.getClass(), "nativeType", false);
        setBooleanField(term1569299, term1569299.getClass(), "visited", false);
        setField(term1569299, term1569299.getClass(), "docInfo", null);
        setBooleanField(term1569299, term1569299.getClass(), "unknown", false);
        setBooleanField(term1569299, term1569299.getClass(), "resolved", false);
        setField(term1569299, term1569299.getClass(), "resolveResult", null);
        setField(term1569299, term1569299.getClass(), "registry", null);
        setField(term1569295, term1569295.getClass(), "typeOfThis", term1569299);
        setField(term1569295, term1569295.getClass(), "source", null);
        setField(term1569295, term1569295.getClass(), "implementedInterfaces", null);
        setField(term1569295, term1569295.getClass(), "subTypes", null);
        setField(term1569295, term1569295.getClass(), "templateTypeName", null);
        setField(term1569295, term1569295.getClass(), "className", null);
        setField(term1569295, term1569295.getClass(), "properties", null);
        setField(term1569295, term1569295.getClass(), "implicitPrototype", null);
        setBooleanField(term1569295, term1569295.getClass(), "nativeType", false);
        setBooleanField(term1569295, term1569295.getClass(), "visited", false);
        setField(term1569295, term1569295.getClass(), "docInfo", null);
        setBooleanField(term1569295, term1569295.getClass(), "unknown", false);
        setBooleanField(term1569295, term1569295.getClass(), "resolved", false);
        setField(term1569295, term1569295.getClass(), "resolveResult", null);
        setField(term1569295, term1569295.getClass(), "registry", null);
        Class<? extends Object> term1570193 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1570192 = ((Class) term1570193).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1570192).setAccessible(true);
        Object enum2931 = ((Field) term1570192).get((Object) null);
        term1569301 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1569305 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1569301, term1569301.getClass(), "this$0", null);
        setField(term1569301, term1569301.getClass(), "call", null);
        setField(term1569301, term1569301.getClass(), "prototype", null);
        setField(term1569301, term1569301.getClass(), "kind", enum2931);
        setField(term1569305, term1569305.getClass(), "this$0", null);
        setField(term1569305, term1569305.getClass(), "call", null);
        setField(term1569305, term1569305.getClass(), "prototype", null);
        setField(term1569305, term1569305.getClass(), "kind", enum2931);
        setField(term1569305, term1569305.getClass(), "typeOfThis", null);
        setField(term1569305, term1569305.getClass(), "source", null);
        setField(term1569305, term1569305.getClass(), "implementedInterfaces", null);
        setField(term1569305, term1569305.getClass(), "subTypes", null);
        setField(term1569305, term1569305.getClass(), "templateTypeName", null);
        setField(term1569305, term1569305.getClass(), "className", null);
        setField(term1569305, term1569305.getClass(), "properties", null);
        setField(term1569305, term1569305.getClass(), "implicitPrototype", null);
        setBooleanField(term1569305, term1569305.getClass(), "nativeType", false);
        setBooleanField(term1569305, term1569305.getClass(), "visited", false);
        setField(term1569305, term1569305.getClass(), "docInfo", null);
        setBooleanField(term1569305, term1569305.getClass(), "unknown", false);
        setBooleanField(term1569305, term1569305.getClass(), "resolved", false);
        setField(term1569305, term1569305.getClass(), "resolveResult", null);
        setField(term1569305, term1569305.getClass(), "registry", null);
        setField(term1569301, term1569301.getClass(), "typeOfThis", term1569305);
        setField(term1569301, term1569301.getClass(), "source", null);
        setField(term1569301, term1569301.getClass(), "implementedInterfaces", null);
        setField(term1569301, term1569301.getClass(), "subTypes", null);
        setField(term1569301, term1569301.getClass(), "templateTypeName", null);
        setField(term1569301, term1569301.getClass(), "className", null);
        setField(term1569301, term1569301.getClass(), "properties", null);
        setField(term1569301, term1569301.getClass(), "implicitPrototype", null);
        setBooleanField(term1569301, term1569301.getClass(), "nativeType", false);
        setBooleanField(term1569301, term1569301.getClass(), "visited", false);
        setField(term1569301, term1569301.getClass(), "docInfo", null);
        setBooleanField(term1569301, term1569301.getClass(), "unknown", false);
        setBooleanField(term1569301, term1569301.getClass(), "resolved", false);
        setField(term1569301, term1569301.getClass(), "resolveResult", null);
        setField(term1569301, term1569301.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1568393;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1567633, args);
        assertTrue(recursiveEquals(term1567633, term1569295));
        assertTrue(recursiveEquals(term1568393, term1569301));
        assertTrue(recursiveEquals(retValue, false));
    }

};


