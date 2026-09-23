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

public class FunctionType_isSubtype_21010021581155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1381750;
     Object term1382402;
     Object term1383279;
     Object term1383284;

    public FunctionType_isSubtype_21010021581155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1383291 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1383290 = ((Class) term1383291).getDeclaredField((String) "ORDINARY");
        ((Field) term1383290).setAccessible(true);
        Object enum2586 = ((Field) term1383290).get((Object) null);
        term1381750 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1382294 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1381750, term1381750.getClass(), "kind", enum2586);
        setField(term1381750, term1381750.getClass(), "typeOfThis", term1382294);
        Class<? extends Object> term1383582 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1383581 = ((Class) term1383582).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1383581).setAccessible(true);
        Object enum2587 = ((Field) term1383581).get((Object) null);
        term1382402 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1382564 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term1382402, term1382402.getClass(), "kind", enum2587);
        setField(term1382402, term1382402.getClass(), "typeOfThis", term1382564);
        Class<? extends Object> term1383882 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1383881 = ((Class) term1383882).getDeclaredField((String) "INTERFACE");
        ((Field) term1383881).setAccessible(true);
        Object enum2588 = ((Field) term1383881).get((Object) null);
        term1383279 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1383283 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1383279, term1383279.getClass(), "this$0", null);
        setField(term1383279, term1383279.getClass(), "call", null);
        setField(term1383279, term1383279.getClass(), "prototype", null);
        setField(term1383279, term1383279.getClass(), "kind", enum2588);
        setField(term1383283, term1383283.getClass(), "call", null);
        setField(term1383283, term1383283.getClass(), "prototype", null);
        setField(term1383283, term1383283.getClass(), "kind", null);
        setField(term1383283, term1383283.getClass(), "typeOfThis", null);
        setField(term1383283, term1383283.getClass(), "source", null);
        setField(term1383283, term1383283.getClass(), "implementedInterfaces", null);
        setField(term1383283, term1383283.getClass(), "subTypes", null);
        setField(term1383283, term1383283.getClass(), "templateTypeName", null);
        setField(term1383283, term1383283.getClass(), "className", null);
        setField(term1383283, term1383283.getClass(), "properties", null);
        setField(term1383283, term1383283.getClass(), "implicitPrototype", null);
        setBooleanField(term1383283, term1383283.getClass(), "nativeType", false);
        setBooleanField(term1383283, term1383283.getClass(), "visited", false);
        setField(term1383283, term1383283.getClass(), "docInfo", null);
        setBooleanField(term1383283, term1383283.getClass(), "unknown", false);
        setBooleanField(term1383283, term1383283.getClass(), "resolved", false);
        setField(term1383283, term1383283.getClass(), "resolveResult", null);
        setField(term1383283, term1383283.getClass(), "registry", null);
        setField(term1383279, term1383279.getClass(), "typeOfThis", term1383283);
        setField(term1383279, term1383279.getClass(), "source", null);
        setField(term1383279, term1383279.getClass(), "implementedInterfaces", null);
        setField(term1383279, term1383279.getClass(), "subTypes", null);
        setField(term1383279, term1383279.getClass(), "templateTypeName", null);
        setField(term1383279, term1383279.getClass(), "className", null);
        setField(term1383279, term1383279.getClass(), "properties", null);
        setField(term1383279, term1383279.getClass(), "implicitPrototype", null);
        setBooleanField(term1383279, term1383279.getClass(), "nativeType", false);
        setBooleanField(term1383279, term1383279.getClass(), "visited", false);
        setField(term1383279, term1383279.getClass(), "docInfo", null);
        setBooleanField(term1383279, term1383279.getClass(), "unknown", false);
        setBooleanField(term1383279, term1383279.getClass(), "resolved", false);
        setField(term1383279, term1383279.getClass(), "resolveResult", null);
        setField(term1383279, term1383279.getClass(), "registry", null);
        Class<? extends Object> term1384176 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1384175 = ((Class) term1384176).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1384175).setAccessible(true);
        Object enum2589 = ((Field) term1384175).get((Object) null);
        term1383284 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1383288 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term1383284, term1383284.getClass(), "this$0", null);
        setField(term1383284, term1383284.getClass(), "call", null);
        setField(term1383284, term1383284.getClass(), "prototype", null);
        setField(term1383284, term1383284.getClass(), "kind", enum2589);
        setField(term1383288, term1383288.getClass(), "leastSupertypeVisitor", null);
        setField(term1383288, term1383288.getClass(), "greatestSubtypeVisitor", null);
        setField(term1383288, term1383288.getClass(), "call", null);
        setField(term1383288, term1383288.getClass(), "prototype", null);
        setField(term1383288, term1383288.getClass(), "kind", null);
        setField(term1383288, term1383288.getClass(), "typeOfThis", null);
        setField(term1383288, term1383288.getClass(), "source", null);
        setField(term1383288, term1383288.getClass(), "implementedInterfaces", null);
        setField(term1383288, term1383288.getClass(), "subTypes", null);
        setField(term1383288, term1383288.getClass(), "templateTypeName", null);
        setField(term1383288, term1383288.getClass(), "className", null);
        setField(term1383288, term1383288.getClass(), "properties", null);
        setField(term1383288, term1383288.getClass(), "implicitPrototype", null);
        setBooleanField(term1383288, term1383288.getClass(), "nativeType", false);
        setBooleanField(term1383288, term1383288.getClass(), "visited", false);
        setField(term1383288, term1383288.getClass(), "docInfo", null);
        setBooleanField(term1383288, term1383288.getClass(), "unknown", false);
        setBooleanField(term1383288, term1383288.getClass(), "resolved", false);
        setField(term1383288, term1383288.getClass(), "resolveResult", null);
        setField(term1383288, term1383288.getClass(), "registry", null);
        setField(term1383284, term1383284.getClass(), "typeOfThis", term1383288);
        setField(term1383284, term1383284.getClass(), "source", null);
        setField(term1383284, term1383284.getClass(), "implementedInterfaces", null);
        setField(term1383284, term1383284.getClass(), "subTypes", null);
        setField(term1383284, term1383284.getClass(), "templateTypeName", null);
        setField(term1383284, term1383284.getClass(), "className", null);
        setField(term1383284, term1383284.getClass(), "properties", null);
        setField(term1383284, term1383284.getClass(), "implicitPrototype", null);
        setBooleanField(term1383284, term1383284.getClass(), "nativeType", false);
        setBooleanField(term1383284, term1383284.getClass(), "visited", false);
        setField(term1383284, term1383284.getClass(), "docInfo", null);
        setBooleanField(term1383284, term1383284.getClass(), "unknown", false);
        setBooleanField(term1383284, term1383284.getClass(), "resolved", false);
        setField(term1383284, term1383284.getClass(), "resolveResult", null);
        setField(term1383284, term1383284.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1382402;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1381750, args);
        assertTrue(recursiveEquals(term1381750, term1383279));
        assertTrue(recursiveEquals(term1382402, term1383284));
        assertTrue(recursiveEquals(retValue, false));
    }

};


