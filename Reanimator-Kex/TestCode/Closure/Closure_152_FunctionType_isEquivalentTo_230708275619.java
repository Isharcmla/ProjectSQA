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

public class FunctionType_isEquivalentTo_230708275619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term612255;
     Object term612917;
     Object term613786;
     Object term613794;

    public FunctionType_isEquivalentTo_230708275619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term613801 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term613800 = ((Class) term613801).getDeclaredField((String) "INTERFACE");
        ((Field) term613800).setAccessible(true);
        Object enum946 = ((Field) term613800).get((Object) null);
        Class<? extends Object> term614095 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term614094 = ((Class) term614095).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term614094).setAccessible(true);
        Object enum947 = ((Field) term614094).get((Object) null);
        term612255 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term612807 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term612255, term612255.getClass(), "kind", enum946);
        setField(term612807, term612807.getClass(), "kind", enum947);
        setField(term612255, term612255.getClass(), "typeOfThis", term612807);
        term612917 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term613099 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term612917, term612917.getClass(), "kind", enum947);
        setField(term612917, term612917.getClass(), "typeOfThis", term613099);
        Class<? extends Object> term614395 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term614394 = ((Class) term614395).getDeclaredField((String) "INTERFACE");
        ((Field) term614394).setAccessible(true);
        Object enum948 = ((Field) term614394).get((Object) null);
        Class<? extends Object> term614689 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term614688 = ((Class) term614689).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term614688).setAccessible(true);
        Object enum949 = ((Field) term614688).get((Object) null);
        term613786 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term613790 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term613786, term613786.getClass(), "call", null);
        setField(term613786, term613786.getClass(), "prototype", null);
        setField(term613786, term613786.getClass(), "kind", enum948);
        setField(term613790, term613790.getClass(), "this$0", null);
        setField(term613790, term613790.getClass(), "call", null);
        setField(term613790, term613790.getClass(), "prototype", null);
        setField(term613790, term613790.getClass(), "kind", enum949);
        setField(term613790, term613790.getClass(), "typeOfThis", null);
        setField(term613790, term613790.getClass(), "source", null);
        setField(term613790, term613790.getClass(), "implementedInterfaces", null);
        setField(term613790, term613790.getClass(), "subTypes", null);
        setField(term613790, term613790.getClass(), "templateTypeName", null);
        setField(term613790, term613790.getClass(), "className", null);
        setField(term613790, term613790.getClass(), "properties", null);
        setBooleanField(term613790, term613790.getClass(), "nativeType", false);
        setField(term613790, term613790.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term613790, term613790.getClass(), "prettyPrint", false);
        setBooleanField(term613790, term613790.getClass(), "visited", false);
        setField(term613790, term613790.getClass(), "docInfo", null);
        setBooleanField(term613790, term613790.getClass(), "unknown", false);
        setBooleanField(term613790, term613790.getClass(), "resolved", false);
        setField(term613790, term613790.getClass(), "resolveResult", null);
        setField(term613790, term613790.getClass(), "registry", null);
        setField(term613786, term613786.getClass(), "typeOfThis", term613790);
        setField(term613786, term613786.getClass(), "source", null);
        setField(term613786, term613786.getClass(), "implementedInterfaces", null);
        setField(term613786, term613786.getClass(), "subTypes", null);
        setField(term613786, term613786.getClass(), "templateTypeName", null);
        setField(term613786, term613786.getClass(), "className", null);
        setField(term613786, term613786.getClass(), "properties", null);
        setBooleanField(term613786, term613786.getClass(), "nativeType", false);
        setField(term613786, term613786.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term613786, term613786.getClass(), "prettyPrint", false);
        setBooleanField(term613786, term613786.getClass(), "visited", false);
        setField(term613786, term613786.getClass(), "docInfo", null);
        setBooleanField(term613786, term613786.getClass(), "unknown", false);
        setBooleanField(term613786, term613786.getClass(), "resolved", false);
        setField(term613786, term613786.getClass(), "resolveResult", null);
        setField(term613786, term613786.getClass(), "registry", null);
        Class<? extends Object> term614989 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term614988 = ((Class) term614989).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term614988).setAccessible(true);
        Object enum950 = ((Field) term614988).get((Object) null);
        term613794 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term613798 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term613794, term613794.getClass(), "call", null);
        setField(term613794, term613794.getClass(), "prototype", null);
        setField(term613794, term613794.getClass(), "kind", enum950);
        setField(term613798, term613798.getClass(), "this$0", null);
        setField(term613798, term613798.getClass(), "call", null);
        setField(term613798, term613798.getClass(), "prototype", null);
        setField(term613798, term613798.getClass(), "kind", null);
        setField(term613798, term613798.getClass(), "typeOfThis", null);
        setField(term613798, term613798.getClass(), "source", null);
        setField(term613798, term613798.getClass(), "implementedInterfaces", null);
        setField(term613798, term613798.getClass(), "subTypes", null);
        setField(term613798, term613798.getClass(), "templateTypeName", null);
        setField(term613798, term613798.getClass(), "className", null);
        setField(term613798, term613798.getClass(), "properties", null);
        setBooleanField(term613798, term613798.getClass(), "nativeType", false);
        setField(term613798, term613798.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term613798, term613798.getClass(), "prettyPrint", false);
        setBooleanField(term613798, term613798.getClass(), "visited", false);
        setField(term613798, term613798.getClass(), "docInfo", null);
        setBooleanField(term613798, term613798.getClass(), "unknown", false);
        setBooleanField(term613798, term613798.getClass(), "resolved", false);
        setField(term613798, term613798.getClass(), "resolveResult", null);
        setField(term613798, term613798.getClass(), "registry", null);
        setField(term613794, term613794.getClass(), "typeOfThis", term613798);
        setField(term613794, term613794.getClass(), "source", null);
        setField(term613794, term613794.getClass(), "implementedInterfaces", null);
        setField(term613794, term613794.getClass(), "subTypes", null);
        setField(term613794, term613794.getClass(), "templateTypeName", null);
        setField(term613794, term613794.getClass(), "className", null);
        setField(term613794, term613794.getClass(), "properties", null);
        setBooleanField(term613794, term613794.getClass(), "nativeType", false);
        setField(term613794, term613794.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term613794, term613794.getClass(), "prettyPrint", false);
        setBooleanField(term613794, term613794.getClass(), "visited", false);
        setField(term613794, term613794.getClass(), "docInfo", null);
        setBooleanField(term613794, term613794.getClass(), "unknown", false);
        setBooleanField(term613794, term613794.getClass(), "resolved", false);
        setField(term613794, term613794.getClass(), "resolveResult", null);
        setField(term613794, term613794.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term612917;
        Object retValue = callMethod(klass, "isEquivalentTo", argTypes, term612255, args);
        assertTrue(recursiveEquals(term612255, term613786));
        assertTrue(recursiveEquals(term612917, term613794));
        assertTrue(recursiveEquals(retValue, false));
    }

};


