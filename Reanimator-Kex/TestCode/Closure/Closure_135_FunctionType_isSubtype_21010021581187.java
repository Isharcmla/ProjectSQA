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

public class FunctionType_isSubtype_21010021581187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1439297;
     Object term1440049;
     Object term1440786;
     Object term1440792;

    public FunctionType_isSubtype_21010021581187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1440799 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1440798 = ((Class) term1440799).getDeclaredField((String) "ORDINARY");
        ((Field) term1440798).setAccessible(true);
        Object enum2688 = ((Field) term1440798).get((Object) null);
        term1439297 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1439841 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1439941 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1439297, term1439297.getClass(), "kind", enum2688);
        setField(term1439841, term1439841.getClass(), "kind", enum2688);
        setField(term1439841, term1439841.getClass(), "typeOfThis", term1439941);
        setField(term1439297, term1439297.getClass(), "typeOfThis", term1439841);
        term1440049 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1440379 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1440049, term1440049.getClass(), "kind", enum2688);
        setField(term1440379, term1440379.getClass(), "kind", enum2688);
        setField(term1440379, term1440379.getClass(), "typeOfThis", null);
        setField(term1440049, term1440049.getClass(), "typeOfThis", term1440379);
        Class<? extends Object> term1441090 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1441089 = ((Class) term1441090).getDeclaredField((String) "INTERFACE");
        ((Field) term1441089).setAccessible(true);
        Object enum2689 = ((Field) term1441089).get((Object) null);
        term1440786 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1440790 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1440791 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1440786, term1440786.getClass(), "this$0", null);
        setField(term1440786, term1440786.getClass(), "call", null);
        setField(term1440786, term1440786.getClass(), "prototype", null);
        setField(term1440786, term1440786.getClass(), "kind", enum2689);
        setField(term1440790, term1440790.getClass(), "call", null);
        setField(term1440790, term1440790.getClass(), "prototype", null);
        setField(term1440790, term1440790.getClass(), "kind", enum2689);
        setField(term1440791, term1440791.getClass(), "call", null);
        setField(term1440791, term1440791.getClass(), "prototype", null);
        setField(term1440791, term1440791.getClass(), "kind", null);
        setField(term1440791, term1440791.getClass(), "typeOfThis", null);
        setField(term1440791, term1440791.getClass(), "source", null);
        setField(term1440791, term1440791.getClass(), "implementedInterfaces", null);
        setField(term1440791, term1440791.getClass(), "subTypes", null);
        setField(term1440791, term1440791.getClass(), "templateTypeName", null);
        setField(term1440791, term1440791.getClass(), "className", null);
        setField(term1440791, term1440791.getClass(), "properties", null);
        setField(term1440791, term1440791.getClass(), "implicitPrototype", null);
        setBooleanField(term1440791, term1440791.getClass(), "nativeType", false);
        setBooleanField(term1440791, term1440791.getClass(), "visited", false);
        setField(term1440791, term1440791.getClass(), "docInfo", null);
        setBooleanField(term1440791, term1440791.getClass(), "unknown", false);
        setBooleanField(term1440791, term1440791.getClass(), "resolved", false);
        setField(term1440791, term1440791.getClass(), "resolveResult", null);
        setField(term1440791, term1440791.getClass(), "registry", null);
        setField(term1440790, term1440790.getClass(), "typeOfThis", term1440791);
        setField(term1440790, term1440790.getClass(), "source", null);
        setField(term1440790, term1440790.getClass(), "implementedInterfaces", null);
        setField(term1440790, term1440790.getClass(), "subTypes", null);
        setField(term1440790, term1440790.getClass(), "templateTypeName", null);
        setField(term1440790, term1440790.getClass(), "className", null);
        setField(term1440790, term1440790.getClass(), "properties", null);
        setField(term1440790, term1440790.getClass(), "implicitPrototype", null);
        setBooleanField(term1440790, term1440790.getClass(), "nativeType", false);
        setBooleanField(term1440790, term1440790.getClass(), "visited", false);
        setField(term1440790, term1440790.getClass(), "docInfo", null);
        setBooleanField(term1440790, term1440790.getClass(), "unknown", false);
        setBooleanField(term1440790, term1440790.getClass(), "resolved", false);
        setField(term1440790, term1440790.getClass(), "resolveResult", null);
        setField(term1440790, term1440790.getClass(), "registry", null);
        setField(term1440786, term1440786.getClass(), "typeOfThis", term1440790);
        setField(term1440786, term1440786.getClass(), "source", null);
        setField(term1440786, term1440786.getClass(), "implementedInterfaces", null);
        setField(term1440786, term1440786.getClass(), "subTypes", null);
        setField(term1440786, term1440786.getClass(), "templateTypeName", null);
        setField(term1440786, term1440786.getClass(), "className", null);
        setField(term1440786, term1440786.getClass(), "properties", null);
        setField(term1440786, term1440786.getClass(), "implicitPrototype", null);
        setBooleanField(term1440786, term1440786.getClass(), "nativeType", false);
        setBooleanField(term1440786, term1440786.getClass(), "visited", false);
        setField(term1440786, term1440786.getClass(), "docInfo", null);
        setBooleanField(term1440786, term1440786.getClass(), "unknown", false);
        setBooleanField(term1440786, term1440786.getClass(), "resolved", false);
        setField(term1440786, term1440786.getClass(), "resolveResult", null);
        setField(term1440786, term1440786.getClass(), "registry", null);
        Class<? extends Object> term1441384 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1441383 = ((Class) term1441384).getDeclaredField((String) "INTERFACE");
        ((Field) term1441383).setAccessible(true);
        Object enum2690 = ((Field) term1441383).get((Object) null);
        term1440792 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1440796 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1440792, term1440792.getClass(), "this$0", null);
        setField(term1440792, term1440792.getClass(), "call", null);
        setField(term1440792, term1440792.getClass(), "prototype", null);
        setField(term1440792, term1440792.getClass(), "kind", enum2690);
        setField(term1440796, term1440796.getClass(), "this$0", null);
        setField(term1440796, term1440796.getClass(), "call", null);
        setField(term1440796, term1440796.getClass(), "prototype", null);
        setField(term1440796, term1440796.getClass(), "kind", enum2690);
        setField(term1440796, term1440796.getClass(), "typeOfThis", null);
        setField(term1440796, term1440796.getClass(), "source", null);
        setField(term1440796, term1440796.getClass(), "implementedInterfaces", null);
        setField(term1440796, term1440796.getClass(), "subTypes", null);
        setField(term1440796, term1440796.getClass(), "templateTypeName", null);
        setField(term1440796, term1440796.getClass(), "className", null);
        setField(term1440796, term1440796.getClass(), "properties", null);
        setField(term1440796, term1440796.getClass(), "implicitPrototype", null);
        setBooleanField(term1440796, term1440796.getClass(), "nativeType", false);
        setBooleanField(term1440796, term1440796.getClass(), "visited", false);
        setField(term1440796, term1440796.getClass(), "docInfo", null);
        setBooleanField(term1440796, term1440796.getClass(), "unknown", false);
        setBooleanField(term1440796, term1440796.getClass(), "resolved", false);
        setField(term1440796, term1440796.getClass(), "resolveResult", null);
        setField(term1440796, term1440796.getClass(), "registry", null);
        setField(term1440792, term1440792.getClass(), "typeOfThis", term1440796);
        setField(term1440792, term1440792.getClass(), "source", null);
        setField(term1440792, term1440792.getClass(), "implementedInterfaces", null);
        setField(term1440792, term1440792.getClass(), "subTypes", null);
        setField(term1440792, term1440792.getClass(), "templateTypeName", null);
        setField(term1440792, term1440792.getClass(), "className", null);
        setField(term1440792, term1440792.getClass(), "properties", null);
        setField(term1440792, term1440792.getClass(), "implicitPrototype", null);
        setBooleanField(term1440792, term1440792.getClass(), "nativeType", false);
        setBooleanField(term1440792, term1440792.getClass(), "visited", false);
        setField(term1440792, term1440792.getClass(), "docInfo", null);
        setBooleanField(term1440792, term1440792.getClass(), "unknown", false);
        setBooleanField(term1440792, term1440792.getClass(), "resolved", false);
        setField(term1440792, term1440792.getClass(), "resolveResult", null);
        setField(term1440792, term1440792.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1440049;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1439297, args);
        assertTrue(recursiveEquals(term1439297, term1440786));
        assertTrue(recursiveEquals(term1440049, term1440792));
        assertTrue(recursiveEquals(retValue, true));
    }

};


