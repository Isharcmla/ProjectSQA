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

public class FunctionType_isEquivalentTo_230708275497 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term439156;
     Object term439622;
     Object term440601;
     Object term440607;

    public FunctionType_isEquivalentTo_230708275497() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term440616 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term440615 = ((Class) term440616).getDeclaredField((String) "ORDINARY");
        ((Field) term440615).setAccessible(true);
        Object enum720 = ((Field) term440615).get((Object) null);
        term439156 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term439412 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term439512 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term439156, term439156.getClass(), "kind", enum720);
        setField(term439412, term439412.getClass(), "kind", enum720);
        setField(term439412, term439412.getClass(), "typeOfThis", term439512);
        setField(term439156, term439156.getClass(), "typeOfThis", term439412);
        Class<? extends Object> term440907 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term440906 = ((Class) term440907).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term440906).setAccessible(true);
        Object enum721 = ((Field) term440906).get((Object) null);
        term439622 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term439804 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term439622, term439622.getClass(), "kind", enum720);
        setField(term439804, term439804.getClass(), "kind", enum721);
        setField(term439804, term439804.getClass(), "typeOfThis", null);
        setField(term439622, term439622.getClass(), "typeOfThis", term439804);
        Class<? extends Object> term441207 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term441206 = ((Class) term441207).getDeclaredField((String) "ORDINARY");
        ((Field) term441206).setAccessible(true);
        Object enum722 = ((Field) term441206).get((Object) null);
        term440601 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term440605 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term440606 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term440601, term440601.getClass(), "leastSupertypeVisitor", null);
        setField(term440601, term440601.getClass(), "greatestSubtypeVisitor", null);
        setField(term440601, term440601.getClass(), "call", null);
        setField(term440601, term440601.getClass(), "prototype", null);
        setField(term440601, term440601.getClass(), "kind", enum722);
        setField(term440605, term440605.getClass(), "this$0", null);
        setField(term440605, term440605.getClass(), "call", null);
        setField(term440605, term440605.getClass(), "prototype", null);
        setField(term440605, term440605.getClass(), "kind", enum722);
        setField(term440606, term440606.getClass(), "name", null);
        setField(term440606, term440606.getClass(), "referencedType", null);
        setField(term440606, term440606.getClass(), "referencedObjType", null);
        setBooleanField(term440606, term440606.getClass(), "visited", false);
        setField(term440606, term440606.getClass(), "docInfo", null);
        setBooleanField(term440606, term440606.getClass(), "unknown", false);
        setBooleanField(term440606, term440606.getClass(), "resolved", false);
        setField(term440606, term440606.getClass(), "resolveResult", null);
        setField(term440606, term440606.getClass(), "registry", null);
        setField(term440605, term440605.getClass(), "typeOfThis", term440606);
        setField(term440605, term440605.getClass(), "source", null);
        setField(term440605, term440605.getClass(), "implementedInterfaces", null);
        setField(term440605, term440605.getClass(), "subTypes", null);
        setField(term440605, term440605.getClass(), "templateTypeName", null);
        setField(term440605, term440605.getClass(), "className", null);
        setField(term440605, term440605.getClass(), "properties", null);
        setBooleanField(term440605, term440605.getClass(), "nativeType", false);
        setField(term440605, term440605.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term440605, term440605.getClass(), "prettyPrint", false);
        setBooleanField(term440605, term440605.getClass(), "visited", false);
        setField(term440605, term440605.getClass(), "docInfo", null);
        setBooleanField(term440605, term440605.getClass(), "unknown", false);
        setBooleanField(term440605, term440605.getClass(), "resolved", false);
        setField(term440605, term440605.getClass(), "resolveResult", null);
        setField(term440605, term440605.getClass(), "registry", null);
        setField(term440601, term440601.getClass(), "typeOfThis", term440605);
        setField(term440601, term440601.getClass(), "source", null);
        setField(term440601, term440601.getClass(), "implementedInterfaces", null);
        setField(term440601, term440601.getClass(), "subTypes", null);
        setField(term440601, term440601.getClass(), "templateTypeName", null);
        setField(term440601, term440601.getClass(), "className", null);
        setField(term440601, term440601.getClass(), "properties", null);
        setBooleanField(term440601, term440601.getClass(), "nativeType", false);
        setField(term440601, term440601.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term440601, term440601.getClass(), "prettyPrint", false);
        setBooleanField(term440601, term440601.getClass(), "visited", false);
        setField(term440601, term440601.getClass(), "docInfo", null);
        setBooleanField(term440601, term440601.getClass(), "unknown", false);
        setBooleanField(term440601, term440601.getClass(), "resolved", false);
        setField(term440601, term440601.getClass(), "resolveResult", null);
        setField(term440601, term440601.getClass(), "registry", null);
        Class<? extends Object> term441498 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term441497 = ((Class) term441498).getDeclaredField((String) "ORDINARY");
        ((Field) term441497).setAccessible(true);
        Object enum723 = ((Field) term441497).get((Object) null);
        Class<? extends Object> term441789 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term441788 = ((Class) term441789).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term441788).setAccessible(true);
        Object enum724 = ((Field) term441788).get((Object) null);
        term440607 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term440611 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term440607, term440607.getClass(), "call", null);
        setField(term440607, term440607.getClass(), "prototype", null);
        setField(term440607, term440607.getClass(), "kind", enum723);
        setField(term440611, term440611.getClass(), "this$0", null);
        setField(term440611, term440611.getClass(), "call", null);
        setField(term440611, term440611.getClass(), "prototype", null);
        setField(term440611, term440611.getClass(), "kind", enum724);
        setField(term440611, term440611.getClass(), "typeOfThis", null);
        setField(term440611, term440611.getClass(), "source", null);
        setField(term440611, term440611.getClass(), "implementedInterfaces", null);
        setField(term440611, term440611.getClass(), "subTypes", null);
        setField(term440611, term440611.getClass(), "templateTypeName", null);
        setField(term440611, term440611.getClass(), "className", null);
        setField(term440611, term440611.getClass(), "properties", null);
        setBooleanField(term440611, term440611.getClass(), "nativeType", false);
        setField(term440611, term440611.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term440611, term440611.getClass(), "prettyPrint", false);
        setBooleanField(term440611, term440611.getClass(), "visited", false);
        setField(term440611, term440611.getClass(), "docInfo", null);
        setBooleanField(term440611, term440611.getClass(), "unknown", false);
        setBooleanField(term440611, term440611.getClass(), "resolved", false);
        setField(term440611, term440611.getClass(), "resolveResult", null);
        setField(term440611, term440611.getClass(), "registry", null);
        setField(term440607, term440607.getClass(), "typeOfThis", term440611);
        setField(term440607, term440607.getClass(), "source", null);
        setField(term440607, term440607.getClass(), "implementedInterfaces", null);
        setField(term440607, term440607.getClass(), "subTypes", null);
        setField(term440607, term440607.getClass(), "templateTypeName", null);
        setField(term440607, term440607.getClass(), "className", null);
        setField(term440607, term440607.getClass(), "properties", null);
        setBooleanField(term440607, term440607.getClass(), "nativeType", false);
        setField(term440607, term440607.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term440607, term440607.getClass(), "prettyPrint", false);
        setBooleanField(term440607, term440607.getClass(), "visited", false);
        setField(term440607, term440607.getClass(), "docInfo", null);
        setBooleanField(term440607, term440607.getClass(), "unknown", false);
        setBooleanField(term440607, term440607.getClass(), "resolved", false);
        setField(term440607, term440607.getClass(), "resolveResult", null);
        setField(term440607, term440607.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term439622;
        callMethod(klass, "isEquivalentTo", argTypes, term439156, args);
        assertTrue(recursiveEquals(term439156, term440601));
        assertTrue(recursiveEquals(term439622, term440607));
    }

};


