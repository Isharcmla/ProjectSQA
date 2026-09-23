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

public class FunctionType_isEquivalentTo_230708275631 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term626148;
     Object term626514;
     Object term627342;
     Object term627347;

    public FunctionType_isEquivalentTo_230708275631() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term627353 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term627352 = ((Class) term627353).getDeclaredField((String) "ORDINARY");
        ((Field) term627352).setAccessible(true);
        Object enum1132 = ((Field) term627352).get((Object) null);
        term626148 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term626404 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term626148, term626148.getClass(), "kind", enum1132);
        setField(term626148, term626148.getClass(), "typeOfThis", term626404);
        Class<? extends Object> term627644 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term627643 = ((Class) term627644).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term627643).setAccessible(true);
        Object enum1133 = ((Field) term627643).get((Object) null);
        term626514 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term626514, term626514.getClass(), "kind", enum1133);
        setField(term626514, term626514.getClass(), "typeOfThis", null);
        Class<? extends Object> term627944 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term627943 = ((Class) term627944).getDeclaredField((String) "ORDINARY");
        ((Field) term627943).setAccessible(true);
        Object enum1134 = ((Field) term627943).get((Object) null);
        term627342 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term627346 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term627342, term627342.getClass(), "call", null);
        setField(term627342, term627342.getClass(), "prototype", null);
        setField(term627342, term627342.getClass(), "kind", enum1134);
        setField(term627346, term627346.getClass(), "this$0", null);
        setField(term627346, term627346.getClass(), "call", null);
        setField(term627346, term627346.getClass(), "prototype", null);
        setField(term627346, term627346.getClass(), "kind", null);
        setField(term627346, term627346.getClass(), "typeOfThis", null);
        setField(term627346, term627346.getClass(), "source", null);
        setField(term627346, term627346.getClass(), "implementedInterfaces", null);
        setField(term627346, term627346.getClass(), "subTypes", null);
        setField(term627346, term627346.getClass(), "templateTypeName", null);
        setField(term627346, term627346.getClass(), "className", null);
        setField(term627346, term627346.getClass(), "properties", null);
        setField(term627346, term627346.getClass(), "implicitPrototype", null);
        setBooleanField(term627346, term627346.getClass(), "nativeType", false);
        setBooleanField(term627346, term627346.getClass(), "prettyPrint", false);
        setBooleanField(term627346, term627346.getClass(), "visited", false);
        setField(term627346, term627346.getClass(), "docInfo", null);
        setBooleanField(term627346, term627346.getClass(), "unknown", false);
        setBooleanField(term627346, term627346.getClass(), "resolved", false);
        setField(term627346, term627346.getClass(), "resolveResult", null);
        setField(term627346, term627346.getClass(), "registry", null);
        setField(term627342, term627342.getClass(), "typeOfThis", term627346);
        setField(term627342, term627342.getClass(), "source", null);
        setField(term627342, term627342.getClass(), "implementedInterfaces", null);
        setField(term627342, term627342.getClass(), "subTypes", null);
        setField(term627342, term627342.getClass(), "templateTypeName", null);
        setField(term627342, term627342.getClass(), "className", null);
        setField(term627342, term627342.getClass(), "properties", null);
        setField(term627342, term627342.getClass(), "implicitPrototype", null);
        setBooleanField(term627342, term627342.getClass(), "nativeType", false);
        setBooleanField(term627342, term627342.getClass(), "prettyPrint", false);
        setBooleanField(term627342, term627342.getClass(), "visited", false);
        setField(term627342, term627342.getClass(), "docInfo", null);
        setBooleanField(term627342, term627342.getClass(), "unknown", false);
        setBooleanField(term627342, term627342.getClass(), "resolved", false);
        setField(term627342, term627342.getClass(), "resolveResult", null);
        setField(term627342, term627342.getClass(), "registry", null);
        Class<? extends Object> term628235 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term628234 = ((Class) term628235).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term628234).setAccessible(true);
        Object enum1135 = ((Field) term628234).get((Object) null);
        term627347 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term627347, term627347.getClass(), "call", null);
        setField(term627347, term627347.getClass(), "prototype", null);
        setField(term627347, term627347.getClass(), "kind", enum1135);
        setField(term627347, term627347.getClass(), "typeOfThis", null);
        setField(term627347, term627347.getClass(), "source", null);
        setField(term627347, term627347.getClass(), "implementedInterfaces", null);
        setField(term627347, term627347.getClass(), "subTypes", null);
        setField(term627347, term627347.getClass(), "templateTypeName", null);
        setField(term627347, term627347.getClass(), "className", null);
        setField(term627347, term627347.getClass(), "properties", null);
        setField(term627347, term627347.getClass(), "implicitPrototype", null);
        setBooleanField(term627347, term627347.getClass(), "nativeType", false);
        setBooleanField(term627347, term627347.getClass(), "prettyPrint", false);
        setBooleanField(term627347, term627347.getClass(), "visited", false);
        setField(term627347, term627347.getClass(), "docInfo", null);
        setBooleanField(term627347, term627347.getClass(), "unknown", false);
        setBooleanField(term627347, term627347.getClass(), "resolved", false);
        setField(term627347, term627347.getClass(), "resolveResult", null);
        setField(term627347, term627347.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term626514;
        Object retValue = callMethod(klass, "isEquivalentTo", argTypes, term626148, args);
        assertTrue(recursiveEquals(term626148, term627342));
        assertTrue(recursiveEquals(term626514, term627347));
        assertTrue(recursiveEquals(retValue, false));
    }

};


