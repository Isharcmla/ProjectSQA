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

public class FunctionType_isSubtype_21010021581165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1396598;
     Object term1397250;
     Object term1399796;
     Object term1399804;

    public FunctionType_isSubtype_21010021581165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1399811 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1399810 = ((Class) term1399811).getDeclaredField((String) "ORDINARY");
        ((Field) term1399810).setAccessible(true);
        Object enum2613 = ((Field) term1399810).get((Object) null);
        Class<? extends Object> term1400102 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1400101 = ((Class) term1400102).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1400101).setAccessible(true);
        Object enum2614 = ((Field) term1400101).get((Object) null);
        term1396598 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1397142 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1396598, term1396598.getClass(), "kind", enum2613);
        setField(term1397142, term1397142.getClass(), "kind", enum2614);
        setField(term1396598, term1396598.getClass(), "typeOfThis", term1397142);
        term1397250 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1397432 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1397250, term1397250.getClass(), "kind", enum2614);
        setField(term1397250, term1397250.getClass(), "typeOfThis", term1397432);
        Class<? extends Object> term1400402 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1400401 = ((Class) term1400402).getDeclaredField((String) "INTERFACE");
        ((Field) term1400401).setAccessible(true);
        Object enum2615 = ((Field) term1400401).get((Object) null);
        Class<? extends Object> term1400696 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1400695 = ((Class) term1400696).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1400695).setAccessible(true);
        Object enum2616 = ((Field) term1400695).get((Object) null);
        term1399796 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1399800 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1399796, term1399796.getClass(), "this$0", null);
        setField(term1399796, term1399796.getClass(), "call", null);
        setField(term1399796, term1399796.getClass(), "prototype", null);
        setField(term1399796, term1399796.getClass(), "kind", enum2615);
        setField(term1399800, term1399800.getClass(), "call", null);
        setField(term1399800, term1399800.getClass(), "prototype", null);
        setField(term1399800, term1399800.getClass(), "kind", enum2616);
        setField(term1399800, term1399800.getClass(), "typeOfThis", null);
        setField(term1399800, term1399800.getClass(), "source", null);
        setField(term1399800, term1399800.getClass(), "implementedInterfaces", null);
        setField(term1399800, term1399800.getClass(), "subTypes", null);
        setField(term1399800, term1399800.getClass(), "templateTypeName", null);
        setField(term1399800, term1399800.getClass(), "className", null);
        setField(term1399800, term1399800.getClass(), "properties", null);
        setField(term1399800, term1399800.getClass(), "implicitPrototype", null);
        setBooleanField(term1399800, term1399800.getClass(), "nativeType", false);
        setBooleanField(term1399800, term1399800.getClass(), "visited", false);
        setField(term1399800, term1399800.getClass(), "docInfo", null);
        setBooleanField(term1399800, term1399800.getClass(), "unknown", false);
        setBooleanField(term1399800, term1399800.getClass(), "resolved", false);
        setField(term1399800, term1399800.getClass(), "resolveResult", null);
        setField(term1399800, term1399800.getClass(), "registry", null);
        setField(term1399796, term1399796.getClass(), "typeOfThis", term1399800);
        setField(term1399796, term1399796.getClass(), "source", null);
        setField(term1399796, term1399796.getClass(), "implementedInterfaces", null);
        setField(term1399796, term1399796.getClass(), "subTypes", null);
        setField(term1399796, term1399796.getClass(), "templateTypeName", null);
        setField(term1399796, term1399796.getClass(), "className", null);
        setField(term1399796, term1399796.getClass(), "properties", null);
        setField(term1399796, term1399796.getClass(), "implicitPrototype", null);
        setBooleanField(term1399796, term1399796.getClass(), "nativeType", false);
        setBooleanField(term1399796, term1399796.getClass(), "visited", false);
        setField(term1399796, term1399796.getClass(), "docInfo", null);
        setBooleanField(term1399796, term1399796.getClass(), "unknown", false);
        setBooleanField(term1399796, term1399796.getClass(), "resolved", false);
        setField(term1399796, term1399796.getClass(), "resolveResult", null);
        setField(term1399796, term1399796.getClass(), "registry", null);
        Class<? extends Object> term1400996 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1400995 = ((Class) term1400996).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1400995).setAccessible(true);
        Object enum2617 = ((Field) term1400995).get((Object) null);
        term1399804 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1399808 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1399804, term1399804.getClass(), "this$0", null);
        setField(term1399804, term1399804.getClass(), "call", null);
        setField(term1399804, term1399804.getClass(), "prototype", null);
        setField(term1399804, term1399804.getClass(), "kind", enum2617);
        setField(term1399808, term1399808.getClass(), "this$0", null);
        setField(term1399808, term1399808.getClass(), "call", null);
        setField(term1399808, term1399808.getClass(), "prototype", null);
        setField(term1399808, term1399808.getClass(), "kind", null);
        setField(term1399808, term1399808.getClass(), "typeOfThis", null);
        setField(term1399808, term1399808.getClass(), "source", null);
        setField(term1399808, term1399808.getClass(), "implementedInterfaces", null);
        setField(term1399808, term1399808.getClass(), "subTypes", null);
        setField(term1399808, term1399808.getClass(), "templateTypeName", null);
        setField(term1399808, term1399808.getClass(), "className", null);
        setField(term1399808, term1399808.getClass(), "properties", null);
        setField(term1399808, term1399808.getClass(), "implicitPrototype", null);
        setBooleanField(term1399808, term1399808.getClass(), "nativeType", false);
        setBooleanField(term1399808, term1399808.getClass(), "visited", false);
        setField(term1399808, term1399808.getClass(), "docInfo", null);
        setBooleanField(term1399808, term1399808.getClass(), "unknown", false);
        setBooleanField(term1399808, term1399808.getClass(), "resolved", false);
        setField(term1399808, term1399808.getClass(), "resolveResult", null);
        setField(term1399808, term1399808.getClass(), "registry", null);
        setField(term1399804, term1399804.getClass(), "typeOfThis", term1399808);
        setField(term1399804, term1399804.getClass(), "source", null);
        setField(term1399804, term1399804.getClass(), "implementedInterfaces", null);
        setField(term1399804, term1399804.getClass(), "subTypes", null);
        setField(term1399804, term1399804.getClass(), "templateTypeName", null);
        setField(term1399804, term1399804.getClass(), "className", null);
        setField(term1399804, term1399804.getClass(), "properties", null);
        setField(term1399804, term1399804.getClass(), "implicitPrototype", null);
        setBooleanField(term1399804, term1399804.getClass(), "nativeType", false);
        setBooleanField(term1399804, term1399804.getClass(), "visited", false);
        setField(term1399804, term1399804.getClass(), "docInfo", null);
        setBooleanField(term1399804, term1399804.getClass(), "unknown", false);
        setBooleanField(term1399804, term1399804.getClass(), "resolved", false);
        setField(term1399804, term1399804.getClass(), "resolveResult", null);
        setField(term1399804, term1399804.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1397250;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1396598, args);
        assertTrue(recursiveEquals(term1396598, term1399796));
        assertTrue(recursiveEquals(term1397250, term1399804));
        assertTrue(recursiveEquals(retValue, false));
    }

};


