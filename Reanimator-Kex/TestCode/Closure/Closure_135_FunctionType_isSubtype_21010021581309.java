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

public class FunctionType_isSubtype_21010021581309 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1647982;
     Object term1648332;
     Object term1650813;
     Object term1650818;

    public FunctionType_isSubtype_21010021581309() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1650825 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1650824 = ((Class) term1650825).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1650824).setAccessible(true);
        Object enum3078 = ((Field) term1650824).get((Object) null);
        term1647982 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1648224 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1647982, term1647982.getClass(), "kind", enum3078);
        setField(term1647982, term1647982.getClass(), "call", term1648224);
        Class<? extends Object> term1651125 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1651124 = ((Class) term1651125).getDeclaredField((String) "ORDINARY");
        ((Field) term1651124).setAccessible(true);
        Object enum3079 = ((Field) term1651124).get((Object) null);
        term1648332 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1648574 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1648332, term1648332.getClass(), "kind", enum3079);
        setField(term1648332, term1648332.getClass(), "call", term1648574);
        Class<? extends Object> term1651416 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1651415 = ((Class) term1651416).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1651415).setAccessible(true);
        Object enum3080 = ((Field) term1651415).get((Object) null);
        term1650813 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1650814 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1650814, term1650814.getClass(), "parameters", null);
        setField(term1650814, term1650814.getClass(), "returnType", null);
        setBooleanField(term1650814, term1650814.getClass(), "resolved", false);
        setField(term1650814, term1650814.getClass(), "resolveResult", null);
        setField(term1650814, term1650814.getClass(), "registry", null);
        setField(term1650813, term1650813.getClass(), "call", term1650814);
        setField(term1650813, term1650813.getClass(), "prototype", null);
        setField(term1650813, term1650813.getClass(), "kind", enum3080);
        setField(term1650813, term1650813.getClass(), "typeOfThis", null);
        setField(term1650813, term1650813.getClass(), "source", null);
        setField(term1650813, term1650813.getClass(), "implementedInterfaces", null);
        setField(term1650813, term1650813.getClass(), "subTypes", null);
        setField(term1650813, term1650813.getClass(), "templateTypeName", null);
        setField(term1650813, term1650813.getClass(), "className", null);
        setField(term1650813, term1650813.getClass(), "properties", null);
        setField(term1650813, term1650813.getClass(), "implicitPrototype", null);
        setBooleanField(term1650813, term1650813.getClass(), "nativeType", false);
        setBooleanField(term1650813, term1650813.getClass(), "visited", false);
        setField(term1650813, term1650813.getClass(), "docInfo", null);
        setBooleanField(term1650813, term1650813.getClass(), "unknown", false);
        setBooleanField(term1650813, term1650813.getClass(), "resolved", false);
        setField(term1650813, term1650813.getClass(), "resolveResult", null);
        setField(term1650813, term1650813.getClass(), "registry", null);
        Class<? extends Object> term1651716 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1651715 = ((Class) term1651716).getDeclaredField((String) "ORDINARY");
        ((Field) term1651715).setAccessible(true);
        Object enum3081 = ((Field) term1651715).get((Object) null);
        term1650818 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1650819 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1650818, term1650818.getClass(), "this$0", null);
        setField(term1650819, term1650819.getClass(), "parameters", null);
        setField(term1650819, term1650819.getClass(), "returnType", null);
        setBooleanField(term1650819, term1650819.getClass(), "resolved", false);
        setField(term1650819, term1650819.getClass(), "resolveResult", null);
        setField(term1650819, term1650819.getClass(), "registry", null);
        setField(term1650818, term1650818.getClass(), "call", term1650819);
        setField(term1650818, term1650818.getClass(), "prototype", null);
        setField(term1650818, term1650818.getClass(), "kind", enum3081);
        setField(term1650818, term1650818.getClass(), "typeOfThis", null);
        setField(term1650818, term1650818.getClass(), "source", null);
        setField(term1650818, term1650818.getClass(), "implementedInterfaces", null);
        setField(term1650818, term1650818.getClass(), "subTypes", null);
        setField(term1650818, term1650818.getClass(), "templateTypeName", null);
        setField(term1650818, term1650818.getClass(), "className", null);
        setField(term1650818, term1650818.getClass(), "properties", null);
        setField(term1650818, term1650818.getClass(), "implicitPrototype", null);
        setBooleanField(term1650818, term1650818.getClass(), "nativeType", false);
        setBooleanField(term1650818, term1650818.getClass(), "visited", false);
        setField(term1650818, term1650818.getClass(), "docInfo", null);
        setBooleanField(term1650818, term1650818.getClass(), "unknown", false);
        setBooleanField(term1650818, term1650818.getClass(), "resolved", false);
        setField(term1650818, term1650818.getClass(), "resolveResult", null);
        setField(term1650818, term1650818.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1648332;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1647982, args);
        assertTrue(recursiveEquals(term1647982, term1650813));
        assertTrue(recursiveEquals(term1648332, term1650818));
        assertTrue(recursiveEquals(retValue, true));
    }

};


