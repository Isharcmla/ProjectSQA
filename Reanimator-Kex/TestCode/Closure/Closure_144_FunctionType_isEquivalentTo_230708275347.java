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

public class FunctionType_isEquivalentTo_230708275347 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term242661;
     Object term242919;
     Object term243263;
     Object term243267;

    public FunctionType_isEquivalentTo_230708275347() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term243270 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term243269 = ((Class) term243270).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term243269).setAccessible(true);
        Object enum452 = ((Field) term243269).get((Object) null);
        term242661 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term242661, term242661.getClass(), "kind", enum452);
        term242919 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Class<? extends Object> term243570 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term243569 = ((Class) term243570).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term243569).setAccessible(true);
        Object enum453 = ((Field) term243569).get((Object) null);
        term243263 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term243263, term243263.getClass(), "call", null);
        setField(term243263, term243263.getClass(), "prototype", null);
        setField(term243263, term243263.getClass(), "kind", enum453);
        setField(term243263, term243263.getClass(), "typeOfThis", null);
        setField(term243263, term243263.getClass(), "source", null);
        setField(term243263, term243263.getClass(), "implementedInterfaces", null);
        setField(term243263, term243263.getClass(), "subTypes", null);
        setField(term243263, term243263.getClass(), "templateTypeName", null);
        setField(term243263, term243263.getClass(), "className", null);
        setField(term243263, term243263.getClass(), "properties", null);
        setField(term243263, term243263.getClass(), "implicitPrototype", null);
        setBooleanField(term243263, term243263.getClass(), "nativeType", false);
        setBooleanField(term243263, term243263.getClass(), "prettyPrint", false);
        setBooleanField(term243263, term243263.getClass(), "visited", false);
        setField(term243263, term243263.getClass(), "docInfo", null);
        setBooleanField(term243263, term243263.getClass(), "unknown", false);
        setBooleanField(term243263, term243263.getClass(), "resolved", false);
        setField(term243263, term243263.getClass(), "resolveResult", null);
        setField(term243263, term243263.getClass(), "registry", null);
        term243267 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term243267, term243267.getClass(), "call", null);
        setField(term243267, term243267.getClass(), "prototype", null);
        setField(term243267, term243267.getClass(), "kind", null);
        setField(term243267, term243267.getClass(), "typeOfThis", null);
        setField(term243267, term243267.getClass(), "source", null);
        setField(term243267, term243267.getClass(), "implementedInterfaces", null);
        setField(term243267, term243267.getClass(), "subTypes", null);
        setField(term243267, term243267.getClass(), "templateTypeName", null);
        setField(term243267, term243267.getClass(), "className", null);
        setField(term243267, term243267.getClass(), "properties", null);
        setField(term243267, term243267.getClass(), "implicitPrototype", null);
        setBooleanField(term243267, term243267.getClass(), "nativeType", false);
        setBooleanField(term243267, term243267.getClass(), "prettyPrint", false);
        setBooleanField(term243267, term243267.getClass(), "visited", false);
        setField(term243267, term243267.getClass(), "docInfo", null);
        setBooleanField(term243267, term243267.getClass(), "unknown", false);
        setBooleanField(term243267, term243267.getClass(), "resolved", false);
        setField(term243267, term243267.getClass(), "resolveResult", null);
        setField(term243267, term243267.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term242919;
        Object retValue = callMethod(klass, "isEquivalentTo", argTypes, term242661, args);
        assertTrue(recursiveEquals(term242661, term243263));
        assertTrue(recursiveEquals(term242919, term243267));
        assertTrue(recursiveEquals(retValue, false));
    }

};


