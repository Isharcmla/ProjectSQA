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

public class FunctionType_isEquivalentTo_230708275369 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term265170;
     Object term265832;
     Object term266999;
     Object term267007;

    public FunctionType_isEquivalentTo_230708275369() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term267014 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term267013 = ((Class) term267014).getDeclaredField((String) "INTERFACE");
        ((Field) term267013).setAccessible(true);
        Object enum462 = ((Field) term267013).get((Object) null);
        Class<? extends Object> term267308 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term267307 = ((Class) term267308).getDeclaredField((String) "INTERFACE");
        ((Field) term267307).setAccessible(true);
        Object enum463 = ((Field) term267307).get((Object) null);
        term265170 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term265722 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term265170, term265170.getClass(), "kind", enum462);
        setField(term265722, term265722.getClass(), "kind", enum463);
        setField(term265170, term265170.getClass(), "typeOfThis", term265722);
        Class<? extends Object> term267602 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term267601 = ((Class) term267602).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term267601).setAccessible(true);
        Object enum464 = ((Field) term267601).get((Object) null);
        term265832 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term266014 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term265832, term265832.getClass(), "kind", enum464);
        setField(term265832, term265832.getClass(), "typeOfThis", term266014);
        Class<? extends Object> term267902 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term267901 = ((Class) term267902).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term267901).setAccessible(true);
        Object enum465 = ((Field) term267901).get((Object) null);
        Class<? extends Object> term268202 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term268201 = ((Class) term268202).getDeclaredField((String) "INTERFACE");
        ((Field) term268201).setAccessible(true);
        Object enum466 = ((Field) term268201).get((Object) null);
        term266999 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term267003 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term266999, term266999.getClass(), "call", null);
        setField(term266999, term266999.getClass(), "prototype", null);
        setField(term266999, term266999.getClass(), "kind", enum465);
        setField(term267003, term267003.getClass(), "this$0", null);
        setField(term267003, term267003.getClass(), "call", null);
        setField(term267003, term267003.getClass(), "prototype", null);
        setField(term267003, term267003.getClass(), "kind", enum466);
        setField(term267003, term267003.getClass(), "typeOfThis", null);
        setField(term267003, term267003.getClass(), "source", null);
        setField(term267003, term267003.getClass(), "implementedInterfaces", null);
        setField(term267003, term267003.getClass(), "subTypes", null);
        setField(term267003, term267003.getClass(), "templateTypeName", null);
        setField(term267003, term267003.getClass(), "className", null);
        setField(term267003, term267003.getClass(), "properties", null);
        setBooleanField(term267003, term267003.getClass(), "nativeType", false);
        setField(term267003, term267003.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term267003, term267003.getClass(), "prettyPrint", false);
        setBooleanField(term267003, term267003.getClass(), "visited", false);
        setField(term267003, term267003.getClass(), "docInfo", null);
        setBooleanField(term267003, term267003.getClass(), "unknown", false);
        setBooleanField(term267003, term267003.getClass(), "resolved", false);
        setField(term267003, term267003.getClass(), "resolveResult", null);
        setField(term267003, term267003.getClass(), "registry", null);
        setField(term266999, term266999.getClass(), "typeOfThis", term267003);
        setField(term266999, term266999.getClass(), "source", null);
        setField(term266999, term266999.getClass(), "implementedInterfaces", null);
        setField(term266999, term266999.getClass(), "subTypes", null);
        setField(term266999, term266999.getClass(), "templateTypeName", null);
        setField(term266999, term266999.getClass(), "className", null);
        setField(term266999, term266999.getClass(), "properties", null);
        setBooleanField(term266999, term266999.getClass(), "nativeType", false);
        setField(term266999, term266999.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term266999, term266999.getClass(), "prettyPrint", false);
        setBooleanField(term266999, term266999.getClass(), "visited", false);
        setField(term266999, term266999.getClass(), "docInfo", null);
        setBooleanField(term266999, term266999.getClass(), "unknown", false);
        setBooleanField(term266999, term266999.getClass(), "resolved", false);
        setField(term266999, term266999.getClass(), "resolveResult", null);
        setField(term266999, term266999.getClass(), "registry", null);
        Class<? extends Object> term268496 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term268495 = ((Class) term268496).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term268495).setAccessible(true);
        Object enum467 = ((Field) term268495).get((Object) null);
        term267007 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term267011 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term267007, term267007.getClass(), "call", null);
        setField(term267007, term267007.getClass(), "prototype", null);
        setField(term267007, term267007.getClass(), "kind", enum467);
        setField(term267011, term267011.getClass(), "this$0", null);
        setField(term267011, term267011.getClass(), "call", null);
        setField(term267011, term267011.getClass(), "prototype", null);
        setField(term267011, term267011.getClass(), "kind", null);
        setField(term267011, term267011.getClass(), "typeOfThis", null);
        setField(term267011, term267011.getClass(), "source", null);
        setField(term267011, term267011.getClass(), "implementedInterfaces", null);
        setField(term267011, term267011.getClass(), "subTypes", null);
        setField(term267011, term267011.getClass(), "templateTypeName", null);
        setField(term267011, term267011.getClass(), "className", null);
        setField(term267011, term267011.getClass(), "properties", null);
        setBooleanField(term267011, term267011.getClass(), "nativeType", false);
        setField(term267011, term267011.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term267011, term267011.getClass(), "prettyPrint", false);
        setBooleanField(term267011, term267011.getClass(), "visited", false);
        setField(term267011, term267011.getClass(), "docInfo", null);
        setBooleanField(term267011, term267011.getClass(), "unknown", false);
        setBooleanField(term267011, term267011.getClass(), "resolved", false);
        setField(term267011, term267011.getClass(), "resolveResult", null);
        setField(term267011, term267011.getClass(), "registry", null);
        setField(term267007, term267007.getClass(), "typeOfThis", term267011);
        setField(term267007, term267007.getClass(), "source", null);
        setField(term267007, term267007.getClass(), "implementedInterfaces", null);
        setField(term267007, term267007.getClass(), "subTypes", null);
        setField(term267007, term267007.getClass(), "templateTypeName", null);
        setField(term267007, term267007.getClass(), "className", null);
        setField(term267007, term267007.getClass(), "properties", null);
        setBooleanField(term267007, term267007.getClass(), "nativeType", false);
        setField(term267007, term267007.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term267007, term267007.getClass(), "prettyPrint", false);
        setBooleanField(term267007, term267007.getClass(), "visited", false);
        setField(term267007, term267007.getClass(), "docInfo", null);
        setBooleanField(term267007, term267007.getClass(), "unknown", false);
        setBooleanField(term267007, term267007.getClass(), "resolved", false);
        setField(term267007, term267007.getClass(), "resolveResult", null);
        setField(term267007, term267007.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term265832;
        Object retValue = callMethod(klass, "isEquivalentTo", argTypes, term265170, args);
        assertTrue(recursiveEquals(term265170, term266999));
        assertTrue(recursiveEquals(term265832, term267007));
        assertTrue(recursiveEquals(retValue, false));
    }

};


