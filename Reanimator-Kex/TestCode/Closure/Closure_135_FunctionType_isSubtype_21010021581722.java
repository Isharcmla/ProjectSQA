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

public class FunctionType_isSubtype_21010021581722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2345958;
     Object term2346610;
     Object term2347666;
     Object term2347671;

    public FunctionType_isSubtype_21010021581722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2347681 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2347680 = ((Class) term2347681).getDeclaredField((String) "INTERFACE");
        ((Field) term2347680).setAccessible(true);
        Object enum4386 = ((Field) term2347680).get((Object) null);
        term2345958 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2346502 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2345958, term2345958.getClass(), "kind", enum4386);
        setField(term2346502, term2346502.getClass(), "kind", enum4386);
        setField(term2345958, term2345958.getClass(), "typeOfThis", term2346502);
        Class<? extends Object> term2347975 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2347974 = ((Class) term2347975).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2347974).setAccessible(true);
        Object enum4387 = ((Field) term2347974).get((Object) null);
        term2346610 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2346940 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term2346610, term2346610.getClass(), "kind", enum4386);
        setField(term2346940, term2346940.getClass(), "kind", enum4387);
        setField(term2346610, term2346610.getClass(), "typeOfThis", term2346940);
        Class<? extends Object> term2348275 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2348274 = ((Class) term2348275).getDeclaredField((String) "INTERFACE");
        ((Field) term2348274).setAccessible(true);
        Object enum4388 = ((Field) term2348274).get((Object) null);
        term2347666 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2347670 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2347666, term2347666.getClass(), "this$0", null);
        setField(term2347666, term2347666.getClass(), "call", null);
        setField(term2347666, term2347666.getClass(), "prototype", null);
        setField(term2347666, term2347666.getClass(), "kind", enum4388);
        setField(term2347670, term2347670.getClass(), "call", null);
        setField(term2347670, term2347670.getClass(), "prototype", null);
        setField(term2347670, term2347670.getClass(), "kind", enum4388);
        setField(term2347670, term2347670.getClass(), "typeOfThis", null);
        setField(term2347670, term2347670.getClass(), "source", null);
        setField(term2347670, term2347670.getClass(), "implementedInterfaces", null);
        setField(term2347670, term2347670.getClass(), "subTypes", null);
        setField(term2347670, term2347670.getClass(), "templateTypeName", null);
        setField(term2347670, term2347670.getClass(), "className", null);
        setField(term2347670, term2347670.getClass(), "properties", null);
        setField(term2347670, term2347670.getClass(), "implicitPrototype", null);
        setBooleanField(term2347670, term2347670.getClass(), "nativeType", false);
        setBooleanField(term2347670, term2347670.getClass(), "visited", false);
        setField(term2347670, term2347670.getClass(), "docInfo", null);
        setBooleanField(term2347670, term2347670.getClass(), "unknown", false);
        setBooleanField(term2347670, term2347670.getClass(), "resolved", false);
        setField(term2347670, term2347670.getClass(), "resolveResult", null);
        setField(term2347670, term2347670.getClass(), "registry", null);
        setField(term2347666, term2347666.getClass(), "typeOfThis", term2347670);
        setField(term2347666, term2347666.getClass(), "source", null);
        setField(term2347666, term2347666.getClass(), "implementedInterfaces", null);
        setField(term2347666, term2347666.getClass(), "subTypes", null);
        setField(term2347666, term2347666.getClass(), "templateTypeName", null);
        setField(term2347666, term2347666.getClass(), "className", null);
        setField(term2347666, term2347666.getClass(), "properties", null);
        setField(term2347666, term2347666.getClass(), "implicitPrototype", null);
        setBooleanField(term2347666, term2347666.getClass(), "nativeType", false);
        setBooleanField(term2347666, term2347666.getClass(), "visited", false);
        setField(term2347666, term2347666.getClass(), "docInfo", null);
        setBooleanField(term2347666, term2347666.getClass(), "unknown", false);
        setBooleanField(term2347666, term2347666.getClass(), "resolved", false);
        setField(term2347666, term2347666.getClass(), "resolveResult", null);
        setField(term2347666, term2347666.getClass(), "registry", null);
        Class<? extends Object> term2348569 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2348568 = ((Class) term2348569).getDeclaredField((String) "INTERFACE");
        ((Field) term2348568).setAccessible(true);
        Object enum4389 = ((Field) term2348568).get((Object) null);
        Class<? extends Object> term2348863 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2348862 = ((Class) term2348863).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2348862).setAccessible(true);
        Object enum4390 = ((Field) term2348862).get((Object) null);
        term2347671 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2347675 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term2347671, term2347671.getClass(), "this$0", null);
        setField(term2347671, term2347671.getClass(), "call", null);
        setField(term2347671, term2347671.getClass(), "prototype", null);
        setField(term2347671, term2347671.getClass(), "kind", enum4389);
        setField(term2347675, term2347675.getClass(), "this$0", null);
        setField(term2347675, term2347675.getClass(), "call", null);
        setField(term2347675, term2347675.getClass(), "prototype", null);
        setField(term2347675, term2347675.getClass(), "kind", enum4390);
        setField(term2347675, term2347675.getClass(), "typeOfThis", null);
        setField(term2347675, term2347675.getClass(), "source", null);
        setField(term2347675, term2347675.getClass(), "implementedInterfaces", null);
        setField(term2347675, term2347675.getClass(), "subTypes", null);
        setField(term2347675, term2347675.getClass(), "templateTypeName", null);
        setField(term2347675, term2347675.getClass(), "className", null);
        setField(term2347675, term2347675.getClass(), "properties", null);
        setField(term2347675, term2347675.getClass(), "implicitPrototype", null);
        setBooleanField(term2347675, term2347675.getClass(), "nativeType", false);
        setBooleanField(term2347675, term2347675.getClass(), "visited", false);
        setField(term2347675, term2347675.getClass(), "docInfo", null);
        setBooleanField(term2347675, term2347675.getClass(), "unknown", false);
        setBooleanField(term2347675, term2347675.getClass(), "resolved", false);
        setField(term2347675, term2347675.getClass(), "resolveResult", null);
        setField(term2347675, term2347675.getClass(), "registry", null);
        setField(term2347671, term2347671.getClass(), "typeOfThis", term2347675);
        setField(term2347671, term2347671.getClass(), "source", null);
        setField(term2347671, term2347671.getClass(), "implementedInterfaces", null);
        setField(term2347671, term2347671.getClass(), "subTypes", null);
        setField(term2347671, term2347671.getClass(), "templateTypeName", null);
        setField(term2347671, term2347671.getClass(), "className", null);
        setField(term2347671, term2347671.getClass(), "properties", null);
        setField(term2347671, term2347671.getClass(), "implicitPrototype", null);
        setBooleanField(term2347671, term2347671.getClass(), "nativeType", false);
        setBooleanField(term2347671, term2347671.getClass(), "visited", false);
        setField(term2347671, term2347671.getClass(), "docInfo", null);
        setBooleanField(term2347671, term2347671.getClass(), "unknown", false);
        setBooleanField(term2347671, term2347671.getClass(), "resolved", false);
        setField(term2347671, term2347671.getClass(), "resolveResult", null);
        setField(term2347671, term2347671.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2346610;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term2345958, args);
        assertTrue(recursiveEquals(term2345958, term2347666));
        assertTrue(recursiveEquals(term2346610, term2347671));
        assertTrue(recursiveEquals(retValue, true));
    }

};


