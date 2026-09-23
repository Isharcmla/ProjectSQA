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

public class FunctionType_isSubtype_21010021581399 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1804730;
     Object term1805080;
     Object term1805654;
     Object term1805659;

    public FunctionType_isSubtype_21010021581399() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1805666 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1805665 = ((Class) term1805666).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1805665).setAccessible(true);
        Object enum3365 = ((Field) term1805665).get((Object) null);
        term1804730 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1804972 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1804730, term1804730.getClass(), "kind", enum3365);
        setField(term1804730, term1804730.getClass(), "call", term1804972);
        term1805080 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1805248 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1805080, term1805080.getClass(), "kind", enum3365);
        setField(term1805080, term1805080.getClass(), "call", term1805248);
        Class<? extends Object> term1805966 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1805965 = ((Class) term1805966).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1805965).setAccessible(true);
        Object enum3366 = ((Field) term1805965).get((Object) null);
        term1805654 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1805655 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1805654, term1805654.getClass(), "this$0", null);
        setField(term1805655, term1805655.getClass(), "parameters", null);
        setField(term1805655, term1805655.getClass(), "returnType", null);
        setBooleanField(term1805655, term1805655.getClass(), "resolved", false);
        setField(term1805655, term1805655.getClass(), "resolveResult", null);
        setField(term1805655, term1805655.getClass(), "registry", null);
        setField(term1805654, term1805654.getClass(), "call", term1805655);
        setField(term1805654, term1805654.getClass(), "prototype", null);
        setField(term1805654, term1805654.getClass(), "kind", enum3366);
        setField(term1805654, term1805654.getClass(), "typeOfThis", null);
        setField(term1805654, term1805654.getClass(), "source", null);
        setField(term1805654, term1805654.getClass(), "implementedInterfaces", null);
        setField(term1805654, term1805654.getClass(), "subTypes", null);
        setField(term1805654, term1805654.getClass(), "templateTypeName", null);
        setField(term1805654, term1805654.getClass(), "className", null);
        setField(term1805654, term1805654.getClass(), "properties", null);
        setField(term1805654, term1805654.getClass(), "implicitPrototype", null);
        setBooleanField(term1805654, term1805654.getClass(), "nativeType", false);
        setBooleanField(term1805654, term1805654.getClass(), "visited", false);
        setField(term1805654, term1805654.getClass(), "docInfo", null);
        setBooleanField(term1805654, term1805654.getClass(), "unknown", false);
        setBooleanField(term1805654, term1805654.getClass(), "resolved", false);
        setField(term1805654, term1805654.getClass(), "resolveResult", null);
        setField(term1805654, term1805654.getClass(), "registry", null);
        Class<? extends Object> term1806266 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1806265 = ((Class) term1806266).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1806265).setAccessible(true);
        Object enum3367 = ((Field) term1806265).get((Object) null);
        term1805659 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1805660 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1805659, term1805659.getClass(), "this$0", null);
        setField(term1805660, term1805660.getClass(), "parameters", null);
        setField(term1805660, term1805660.getClass(), "returnType", null);
        setBooleanField(term1805660, term1805660.getClass(), "resolved", false);
        setField(term1805660, term1805660.getClass(), "resolveResult", null);
        setField(term1805660, term1805660.getClass(), "registry", null);
        setField(term1805659, term1805659.getClass(), "call", term1805660);
        setField(term1805659, term1805659.getClass(), "prototype", null);
        setField(term1805659, term1805659.getClass(), "kind", enum3367);
        setField(term1805659, term1805659.getClass(), "typeOfThis", null);
        setField(term1805659, term1805659.getClass(), "source", null);
        setField(term1805659, term1805659.getClass(), "implementedInterfaces", null);
        setField(term1805659, term1805659.getClass(), "subTypes", null);
        setField(term1805659, term1805659.getClass(), "templateTypeName", null);
        setField(term1805659, term1805659.getClass(), "className", null);
        setField(term1805659, term1805659.getClass(), "properties", null);
        setField(term1805659, term1805659.getClass(), "implicitPrototype", null);
        setBooleanField(term1805659, term1805659.getClass(), "nativeType", false);
        setBooleanField(term1805659, term1805659.getClass(), "visited", false);
        setField(term1805659, term1805659.getClass(), "docInfo", null);
        setBooleanField(term1805659, term1805659.getClass(), "unknown", false);
        setBooleanField(term1805659, term1805659.getClass(), "resolved", false);
        setField(term1805659, term1805659.getClass(), "resolveResult", null);
        setField(term1805659, term1805659.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1805080;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1804730, args);
        assertTrue(recursiveEquals(term1804730, term1805654));
        assertTrue(recursiveEquals(term1805080, term1805659));
        assertTrue(recursiveEquals(retValue, true));
    }

};


