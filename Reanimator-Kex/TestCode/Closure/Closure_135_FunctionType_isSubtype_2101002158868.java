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

public class FunctionType_isSubtype_2101002158868 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term906134;
     Object term906740;
     Object term909156;
     Object term909165;

    public FunctionType_isSubtype_2101002158868() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term909175 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term909174 = ((Class) term909175).getDeclaredField((String) "ORDINARY");
        ((Field) term909174).setAccessible(true);
        Object enum1692 = ((Field) term909174).get((Object) null);
        Class<? extends Object> term909466 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term909465 = ((Class) term909466).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term909465).setAccessible(true);
        Object enum1693 = ((Field) term909465).get((Object) null);
        term906134 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term906390 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term906632 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term906134, term906134.getClass(), "kind", enum1692);
        setField(term906390, term906390.getClass(), "kind", enum1693);
        setField(term906134, term906134.getClass(), "typeOfThis", term906390);
        setField(term906134, term906134.getClass(), "call", term906632);
        Class<? extends Object> term909766 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term909765 = ((Class) term909766).getDeclaredField((String) "INTERFACE");
        ((Field) term909765).setAccessible(true);
        Object enum1694 = ((Field) term909765).get((Object) null);
        term906740 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term906922 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term906740, term906740.getClass(), "kind", enum1692);
        setField(term906922, term906922.getClass(), "kind", enum1694);
        setField(term906740, term906740.getClass(), "typeOfThis", term906922);
        setField(term906740, term906740.getClass(), "call", null);
        Class<? extends Object> term910060 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term910059 = ((Class) term910060).getDeclaredField((String) "ORDINARY");
        ((Field) term910059).setAccessible(true);
        Object enum1695 = ((Field) term910059).get((Object) null);
        Class<? extends Object> term910351 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term910350 = ((Class) term910351).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term910350).setAccessible(true);
        Object enum1696 = ((Field) term910350).get((Object) null);
        term909156 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term909157 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term909161 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term909156, term909156.getClass(), "this$0", null);
        setField(term909157, term909157.getClass(), "parameters", null);
        setField(term909157, term909157.getClass(), "returnType", null);
        setBooleanField(term909157, term909157.getClass(), "resolved", false);
        setField(term909157, term909157.getClass(), "resolveResult", null);
        setField(term909157, term909157.getClass(), "registry", null);
        setField(term909156, term909156.getClass(), "call", term909157);
        setField(term909156, term909156.getClass(), "prototype", null);
        setField(term909156, term909156.getClass(), "kind", enum1695);
        setField(term909161, term909161.getClass(), "this$0", null);
        setField(term909161, term909161.getClass(), "call", null);
        setField(term909161, term909161.getClass(), "prototype", null);
        setField(term909161, term909161.getClass(), "kind", enum1696);
        setField(term909161, term909161.getClass(), "typeOfThis", null);
        setField(term909161, term909161.getClass(), "source", null);
        setField(term909161, term909161.getClass(), "implementedInterfaces", null);
        setField(term909161, term909161.getClass(), "subTypes", null);
        setField(term909161, term909161.getClass(), "templateTypeName", null);
        setField(term909161, term909161.getClass(), "className", null);
        setField(term909161, term909161.getClass(), "properties", null);
        setField(term909161, term909161.getClass(), "implicitPrototype", null);
        setBooleanField(term909161, term909161.getClass(), "nativeType", false);
        setBooleanField(term909161, term909161.getClass(), "visited", false);
        setField(term909161, term909161.getClass(), "docInfo", null);
        setBooleanField(term909161, term909161.getClass(), "unknown", false);
        setBooleanField(term909161, term909161.getClass(), "resolved", false);
        setField(term909161, term909161.getClass(), "resolveResult", null);
        setField(term909161, term909161.getClass(), "registry", null);
        setField(term909156, term909156.getClass(), "typeOfThis", term909161);
        setField(term909156, term909156.getClass(), "source", null);
        setField(term909156, term909156.getClass(), "implementedInterfaces", null);
        setField(term909156, term909156.getClass(), "subTypes", null);
        setField(term909156, term909156.getClass(), "templateTypeName", null);
        setField(term909156, term909156.getClass(), "className", null);
        setField(term909156, term909156.getClass(), "properties", null);
        setField(term909156, term909156.getClass(), "implicitPrototype", null);
        setBooleanField(term909156, term909156.getClass(), "nativeType", false);
        setBooleanField(term909156, term909156.getClass(), "visited", false);
        setField(term909156, term909156.getClass(), "docInfo", null);
        setBooleanField(term909156, term909156.getClass(), "unknown", false);
        setBooleanField(term909156, term909156.getClass(), "resolved", false);
        setField(term909156, term909156.getClass(), "resolveResult", null);
        setField(term909156, term909156.getClass(), "registry", null);
        Class<? extends Object> term910651 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term910650 = ((Class) term910651).getDeclaredField((String) "ORDINARY");
        ((Field) term910650).setAccessible(true);
        Object enum1697 = ((Field) term910650).get((Object) null);
        Class<? extends Object> term910942 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term910941 = ((Class) term910942).getDeclaredField((String) "INTERFACE");
        ((Field) term910941).setAccessible(true);
        Object enum1698 = ((Field) term910941).get((Object) null);
        term909165 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term909169 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term909165, term909165.getClass(), "this$0", null);
        setField(term909165, term909165.getClass(), "call", null);
        setField(term909165, term909165.getClass(), "prototype", null);
        setField(term909165, term909165.getClass(), "kind", enum1697);
        setField(term909169, term909169.getClass(), "this$0", null);
        setField(term909169, term909169.getClass(), "call", null);
        setField(term909169, term909169.getClass(), "prototype", null);
        setField(term909169, term909169.getClass(), "kind", enum1698);
        setField(term909169, term909169.getClass(), "typeOfThis", null);
        setField(term909169, term909169.getClass(), "source", null);
        setField(term909169, term909169.getClass(), "implementedInterfaces", null);
        setField(term909169, term909169.getClass(), "subTypes", null);
        setField(term909169, term909169.getClass(), "templateTypeName", null);
        setField(term909169, term909169.getClass(), "className", null);
        setField(term909169, term909169.getClass(), "properties", null);
        setField(term909169, term909169.getClass(), "implicitPrototype", null);
        setBooleanField(term909169, term909169.getClass(), "nativeType", false);
        setBooleanField(term909169, term909169.getClass(), "visited", false);
        setField(term909169, term909169.getClass(), "docInfo", null);
        setBooleanField(term909169, term909169.getClass(), "unknown", false);
        setBooleanField(term909169, term909169.getClass(), "resolved", false);
        setField(term909169, term909169.getClass(), "resolveResult", null);
        setField(term909169, term909169.getClass(), "registry", null);
        setField(term909165, term909165.getClass(), "typeOfThis", term909169);
        setField(term909165, term909165.getClass(), "source", null);
        setField(term909165, term909165.getClass(), "implementedInterfaces", null);
        setField(term909165, term909165.getClass(), "subTypes", null);
        setField(term909165, term909165.getClass(), "templateTypeName", null);
        setField(term909165, term909165.getClass(), "className", null);
        setField(term909165, term909165.getClass(), "properties", null);
        setField(term909165, term909165.getClass(), "implicitPrototype", null);
        setBooleanField(term909165, term909165.getClass(), "nativeType", false);
        setBooleanField(term909165, term909165.getClass(), "visited", false);
        setField(term909165, term909165.getClass(), "docInfo", null);
        setBooleanField(term909165, term909165.getClass(), "unknown", false);
        setBooleanField(term909165, term909165.getClass(), "resolved", false);
        setField(term909165, term909165.getClass(), "resolveResult", null);
        setField(term909165, term909165.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term906740;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term906134, args);
        assertTrue(recursiveEquals(term906134, term909156));
        assertTrue(recursiveEquals(term906740, term909165));
        assertTrue(recursiveEquals(retValue, false));
    }

};


