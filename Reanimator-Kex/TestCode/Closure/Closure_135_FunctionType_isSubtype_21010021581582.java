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

public class FunctionType_isSubtype_21010021581582 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2107207;
     Object term2107557;
     Object term2110453;
     Object term2110458;

    public FunctionType_isSubtype_21010021581582() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2110465 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2110464 = ((Class) term2110465).getDeclaredField((String) "ORDINARY");
        ((Field) term2110464).setAccessible(true);
        Object enum3928 = ((Field) term2110464).get((Object) null);
        term2107207 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2107449 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2107207, term2107207.getClass(), "kind", enum3928);
        setField(term2107207, term2107207.getClass(), "typeOfThis", term2107207);
        setField(term2107207, term2107207.getClass(), "call", term2107449);
        Class<? extends Object> term2110756 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2110755 = ((Class) term2110756).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2110755).setAccessible(true);
        Object enum3929 = ((Field) term2110755).get((Object) null);
        term2107557 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2107799 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2107557, term2107557.getClass(), "kind", enum3929);
        setField(term2107557, term2107557.getClass(), "typeOfThis", null);
        setField(term2107557, term2107557.getClass(), "call", term2107799);
        Class<? extends Object> term2111056 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2111055 = ((Class) term2111056).getDeclaredField((String) "ORDINARY");
        ((Field) term2111055).setAccessible(true);
        Object enum3930 = ((Field) term2111055).get((Object) null);
        term2110453 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2110454 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2110453, term2110453.getClass(), "this$0", null);
        setField(term2110454, term2110454.getClass(), "parameters", null);
        setField(term2110454, term2110454.getClass(), "returnType", null);
        setBooleanField(term2110454, term2110454.getClass(), "resolved", false);
        setField(term2110454, term2110454.getClass(), "resolveResult", null);
        setField(term2110454, term2110454.getClass(), "registry", null);
        setField(term2110453, term2110453.getClass(), "call", term2110454);
        setField(term2110453, term2110453.getClass(), "prototype", null);
        setField(term2110453, term2110453.getClass(), "kind", enum3930);
        setField(term2110453, term2110453.getClass(), "typeOfThis", term2110453);
        setField(term2110453, term2110453.getClass(), "source", null);
        setField(term2110453, term2110453.getClass(), "implementedInterfaces", null);
        setField(term2110453, term2110453.getClass(), "subTypes", null);
        setField(term2110453, term2110453.getClass(), "templateTypeName", null);
        setField(term2110453, term2110453.getClass(), "className", null);
        setField(term2110453, term2110453.getClass(), "properties", null);
        setField(term2110453, term2110453.getClass(), "implicitPrototype", null);
        setBooleanField(term2110453, term2110453.getClass(), "nativeType", false);
        setBooleanField(term2110453, term2110453.getClass(), "visited", false);
        setField(term2110453, term2110453.getClass(), "docInfo", null);
        setBooleanField(term2110453, term2110453.getClass(), "unknown", false);
        setBooleanField(term2110453, term2110453.getClass(), "resolved", false);
        setField(term2110453, term2110453.getClass(), "resolveResult", null);
        setField(term2110453, term2110453.getClass(), "registry", null);
        Class<? extends Object> term2111347 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2111346 = ((Class) term2111347).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2111346).setAccessible(true);
        Object enum3931 = ((Field) term2111346).get((Object) null);
        term2110458 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2110459 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2110458, term2110458.getClass(), "this$0", null);
        setField(term2110459, term2110459.getClass(), "parameters", null);
        setField(term2110459, term2110459.getClass(), "returnType", null);
        setBooleanField(term2110459, term2110459.getClass(), "resolved", false);
        setField(term2110459, term2110459.getClass(), "resolveResult", null);
        setField(term2110459, term2110459.getClass(), "registry", null);
        setField(term2110458, term2110458.getClass(), "call", term2110459);
        setField(term2110458, term2110458.getClass(), "prototype", null);
        setField(term2110458, term2110458.getClass(), "kind", enum3931);
        setField(term2110458, term2110458.getClass(), "typeOfThis", null);
        setField(term2110458, term2110458.getClass(), "source", null);
        setField(term2110458, term2110458.getClass(), "implementedInterfaces", null);
        setField(term2110458, term2110458.getClass(), "subTypes", null);
        setField(term2110458, term2110458.getClass(), "templateTypeName", null);
        setField(term2110458, term2110458.getClass(), "className", null);
        setField(term2110458, term2110458.getClass(), "properties", null);
        setField(term2110458, term2110458.getClass(), "implicitPrototype", null);
        setBooleanField(term2110458, term2110458.getClass(), "nativeType", false);
        setBooleanField(term2110458, term2110458.getClass(), "visited", false);
        setField(term2110458, term2110458.getClass(), "docInfo", null);
        setBooleanField(term2110458, term2110458.getClass(), "unknown", false);
        setBooleanField(term2110458, term2110458.getClass(), "resolved", false);
        setField(term2110458, term2110458.getClass(), "resolveResult", null);
        setField(term2110458, term2110458.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2107557;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term2107207, args);
        assertTrue(recursiveEquals(term2107207, term2110453));
        assertTrue(recursiveEquals(term2107557, term2110458));
        assertTrue(recursiveEquals(retValue, true));
    }

};


