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

public class FunctionType_isSubtype_21010021581333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1864958;
     Object term1865708;
     Object term1868380;
     Object term1868386;

    public FunctionType_isSubtype_21010021581333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1868394 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1868393 = ((Class) term1868394).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1868393).setAccessible(true);
        Object enum3316 = ((Field) term1868393).get((Object) null);
        term1864958 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1865502 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1865598 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term1864958, term1864958.getClass(), "kind", enum3316);
        setField(term1865502, term1865502.getClass(), "kind", enum3316);
        setField(term1865502, term1865502.getClass(), "typeOfThis", term1865598);
        setField(term1864958, term1864958.getClass(), "typeOfThis", term1865502);
        Class<? extends Object> term1868694 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1868693 = ((Class) term1868694).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1868693).setAccessible(true);
        Object enum3317 = ((Field) term1868693).get((Object) null);
        term1865708 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1865890 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1865990 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1865708, term1865708.getClass(), "kind", enum3317);
        setField(term1865890, term1865890.getClass(), "kind", enum3317);
        setField(term1865890, term1865890.getClass(), "typeOfThis", term1865990);
        setField(term1865708, term1865708.getClass(), "typeOfThis", term1865890);
        Class<? extends Object> term1868994 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1868993 = ((Class) term1868994).getDeclaredField((String) "INTERFACE");
        ((Field) term1868993).setAccessible(true);
        Object enum3318 = ((Field) term1868993).get((Object) null);
        term1868380 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1868384 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1868385 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term1868380, term1868380.getClass(), "call", null);
        setField(term1868380, term1868380.getClass(), "prototype", null);
        setField(term1868380, term1868380.getClass(), "kind", enum3318);
        setField(term1868384, term1868384.getClass(), "call", null);
        setField(term1868384, term1868384.getClass(), "prototype", null);
        setField(term1868384, term1868384.getClass(), "kind", enum3318);
        setField(term1868385, term1868385.getClass(), "properties", null);
        setBooleanField(term1868385, term1868385.getClass(), "isFrozen", false);
        setField(term1868385, term1868385.getClass(), "className", null);
        setField(term1868385, term1868385.getClass(), "implicitPrototype", null);
        setBooleanField(term1868385, term1868385.getClass(), "nativeType", false);
        setBooleanField(term1868385, term1868385.getClass(), "prettyPrint", false);
        setBooleanField(term1868385, term1868385.getClass(), "visited", false);
        setField(term1868385, term1868385.getClass(), "docInfo", null);
        setBooleanField(term1868385, term1868385.getClass(), "unknown", false);
        setBooleanField(term1868385, term1868385.getClass(), "resolved", false);
        setField(term1868385, term1868385.getClass(), "resolveResult", null);
        setField(term1868385, term1868385.getClass(), "registry", null);
        setField(term1868384, term1868384.getClass(), "typeOfThis", term1868385);
        setField(term1868384, term1868384.getClass(), "source", null);
        setField(term1868384, term1868384.getClass(), "implementedInterfaces", null);
        setField(term1868384, term1868384.getClass(), "subTypes", null);
        setField(term1868384, term1868384.getClass(), "templateTypeName", null);
        setField(term1868384, term1868384.getClass(), "className", null);
        setField(term1868384, term1868384.getClass(), "properties", null);
        setField(term1868384, term1868384.getClass(), "implicitPrototype", null);
        setBooleanField(term1868384, term1868384.getClass(), "nativeType", false);
        setBooleanField(term1868384, term1868384.getClass(), "prettyPrint", false);
        setBooleanField(term1868384, term1868384.getClass(), "visited", false);
        setField(term1868384, term1868384.getClass(), "docInfo", null);
        setBooleanField(term1868384, term1868384.getClass(), "unknown", false);
        setBooleanField(term1868384, term1868384.getClass(), "resolved", false);
        setField(term1868384, term1868384.getClass(), "resolveResult", null);
        setField(term1868384, term1868384.getClass(), "registry", null);
        setField(term1868380, term1868380.getClass(), "typeOfThis", term1868384);
        setField(term1868380, term1868380.getClass(), "source", null);
        setField(term1868380, term1868380.getClass(), "implementedInterfaces", null);
        setField(term1868380, term1868380.getClass(), "subTypes", null);
        setField(term1868380, term1868380.getClass(), "templateTypeName", null);
        setField(term1868380, term1868380.getClass(), "className", null);
        setField(term1868380, term1868380.getClass(), "properties", null);
        setField(term1868380, term1868380.getClass(), "implicitPrototype", null);
        setBooleanField(term1868380, term1868380.getClass(), "nativeType", false);
        setBooleanField(term1868380, term1868380.getClass(), "prettyPrint", false);
        setBooleanField(term1868380, term1868380.getClass(), "visited", false);
        setField(term1868380, term1868380.getClass(), "docInfo", null);
        setBooleanField(term1868380, term1868380.getClass(), "unknown", false);
        setBooleanField(term1868380, term1868380.getClass(), "resolved", false);
        setField(term1868380, term1868380.getClass(), "resolveResult", null);
        setField(term1868380, term1868380.getClass(), "registry", null);
        Class<? extends Object> term1869288 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1869287 = ((Class) term1869288).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1869287).setAccessible(true);
        Object enum3319 = ((Field) term1869287).get((Object) null);
        term1868386 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1868390 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1868391 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1868386, term1868386.getClass(), "call", null);
        setField(term1868386, term1868386.getClass(), "prototype", null);
        setField(term1868386, term1868386.getClass(), "kind", enum3319);
        setField(term1868390, term1868390.getClass(), "this$0", null);
        setField(term1868390, term1868390.getClass(), "call", null);
        setField(term1868390, term1868390.getClass(), "prototype", null);
        setField(term1868390, term1868390.getClass(), "kind", enum3319);
        setField(term1868391, term1868391.getClass(), "call", null);
        setField(term1868391, term1868391.getClass(), "prototype", null);
        setField(term1868391, term1868391.getClass(), "kind", null);
        setField(term1868391, term1868391.getClass(), "typeOfThis", null);
        setField(term1868391, term1868391.getClass(), "source", null);
        setField(term1868391, term1868391.getClass(), "implementedInterfaces", null);
        setField(term1868391, term1868391.getClass(), "subTypes", null);
        setField(term1868391, term1868391.getClass(), "templateTypeName", null);
        setField(term1868391, term1868391.getClass(), "className", null);
        setField(term1868391, term1868391.getClass(), "properties", null);
        setField(term1868391, term1868391.getClass(), "implicitPrototype", null);
        setBooleanField(term1868391, term1868391.getClass(), "nativeType", false);
        setBooleanField(term1868391, term1868391.getClass(), "prettyPrint", false);
        setBooleanField(term1868391, term1868391.getClass(), "visited", false);
        setField(term1868391, term1868391.getClass(), "docInfo", null);
        setBooleanField(term1868391, term1868391.getClass(), "unknown", false);
        setBooleanField(term1868391, term1868391.getClass(), "resolved", false);
        setField(term1868391, term1868391.getClass(), "resolveResult", null);
        setField(term1868391, term1868391.getClass(), "registry", null);
        setField(term1868390, term1868390.getClass(), "typeOfThis", term1868391);
        setField(term1868390, term1868390.getClass(), "source", null);
        setField(term1868390, term1868390.getClass(), "implementedInterfaces", null);
        setField(term1868390, term1868390.getClass(), "subTypes", null);
        setField(term1868390, term1868390.getClass(), "templateTypeName", null);
        setField(term1868390, term1868390.getClass(), "className", null);
        setField(term1868390, term1868390.getClass(), "properties", null);
        setField(term1868390, term1868390.getClass(), "implicitPrototype", null);
        setBooleanField(term1868390, term1868390.getClass(), "nativeType", false);
        setBooleanField(term1868390, term1868390.getClass(), "prettyPrint", false);
        setBooleanField(term1868390, term1868390.getClass(), "visited", false);
        setField(term1868390, term1868390.getClass(), "docInfo", null);
        setBooleanField(term1868390, term1868390.getClass(), "unknown", false);
        setBooleanField(term1868390, term1868390.getClass(), "resolved", false);
        setField(term1868390, term1868390.getClass(), "resolveResult", null);
        setField(term1868390, term1868390.getClass(), "registry", null);
        setField(term1868386, term1868386.getClass(), "typeOfThis", term1868390);
        setField(term1868386, term1868386.getClass(), "source", null);
        setField(term1868386, term1868386.getClass(), "implementedInterfaces", null);
        setField(term1868386, term1868386.getClass(), "subTypes", null);
        setField(term1868386, term1868386.getClass(), "templateTypeName", null);
        setField(term1868386, term1868386.getClass(), "className", null);
        setField(term1868386, term1868386.getClass(), "properties", null);
        setField(term1868386, term1868386.getClass(), "implicitPrototype", null);
        setBooleanField(term1868386, term1868386.getClass(), "nativeType", false);
        setBooleanField(term1868386, term1868386.getClass(), "prettyPrint", false);
        setBooleanField(term1868386, term1868386.getClass(), "visited", false);
        setField(term1868386, term1868386.getClass(), "docInfo", null);
        setBooleanField(term1868386, term1868386.getClass(), "unknown", false);
        setBooleanField(term1868386, term1868386.getClass(), "resolved", false);
        setField(term1868386, term1868386.getClass(), "resolveResult", null);
        setField(term1868386, term1868386.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1865708;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1864958, args);
        assertTrue(recursiveEquals(term1864958, term1868380));
        assertTrue(recursiveEquals(term1865708, term1868386));
        assertTrue(recursiveEquals(retValue, false));
    }

};


