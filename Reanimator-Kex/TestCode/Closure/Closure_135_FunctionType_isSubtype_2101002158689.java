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

public class FunctionType_isSubtype_2101002158689 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term625892;
     Object term626644;
     Object term627375;
     Object term627381;

    public FunctionType_isSubtype_2101002158689() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term627388 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term627387 = ((Class) term627388).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term627387).setAccessible(true);
        Object enum1163 = ((Field) term627387).get((Object) null);
        term625892 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term626436 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term626536 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term625892, term625892.getClass(), "kind", enum1163);
        setField(term626436, term626436.getClass(), "kind", enum1163);
        setField(term626436, term626436.getClass(), "typeOfThis", term626536);
        setField(term625892, term625892.getClass(), "typeOfThis", term626436);
        term626644 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term626974 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term626644, term626644.getClass(), "kind", enum1163);
        setField(term626974, term626974.getClass(), "kind", enum1163);
        setField(term626974, term626974.getClass(), "typeOfThis", null);
        setField(term626644, term626644.getClass(), "typeOfThis", term626974);
        Class<? extends Object> term627688 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term627687 = ((Class) term627688).getDeclaredField((String) "INTERFACE");
        ((Field) term627687).setAccessible(true);
        Object enum1164 = ((Field) term627687).get((Object) null);
        term627375 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term627379 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term627380 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term627375, term627375.getClass(), "this$0", null);
        setField(term627375, term627375.getClass(), "call", null);
        setField(term627375, term627375.getClass(), "prototype", null);
        setField(term627375, term627375.getClass(), "kind", enum1164);
        setField(term627379, term627379.getClass(), "call", null);
        setField(term627379, term627379.getClass(), "prototype", null);
        setField(term627379, term627379.getClass(), "kind", enum1164);
        setField(term627380, term627380.getClass(), "leastSupertypeVisitor", null);
        setField(term627380, term627380.getClass(), "greatestSubtypeVisitor", null);
        setField(term627380, term627380.getClass(), "call", null);
        setField(term627380, term627380.getClass(), "prototype", null);
        setField(term627380, term627380.getClass(), "kind", null);
        setField(term627380, term627380.getClass(), "typeOfThis", null);
        setField(term627380, term627380.getClass(), "source", null);
        setField(term627380, term627380.getClass(), "implementedInterfaces", null);
        setField(term627380, term627380.getClass(), "subTypes", null);
        setField(term627380, term627380.getClass(), "templateTypeName", null);
        setField(term627380, term627380.getClass(), "className", null);
        setField(term627380, term627380.getClass(), "properties", null);
        setField(term627380, term627380.getClass(), "implicitPrototype", null);
        setBooleanField(term627380, term627380.getClass(), "nativeType", false);
        setBooleanField(term627380, term627380.getClass(), "visited", false);
        setField(term627380, term627380.getClass(), "docInfo", null);
        setBooleanField(term627380, term627380.getClass(), "unknown", false);
        setBooleanField(term627380, term627380.getClass(), "resolved", false);
        setField(term627380, term627380.getClass(), "resolveResult", null);
        setField(term627380, term627380.getClass(), "registry", null);
        setField(term627379, term627379.getClass(), "typeOfThis", term627380);
        setField(term627379, term627379.getClass(), "source", null);
        setField(term627379, term627379.getClass(), "implementedInterfaces", null);
        setField(term627379, term627379.getClass(), "subTypes", null);
        setField(term627379, term627379.getClass(), "templateTypeName", null);
        setField(term627379, term627379.getClass(), "className", null);
        setField(term627379, term627379.getClass(), "properties", null);
        setField(term627379, term627379.getClass(), "implicitPrototype", null);
        setBooleanField(term627379, term627379.getClass(), "nativeType", false);
        setBooleanField(term627379, term627379.getClass(), "visited", false);
        setField(term627379, term627379.getClass(), "docInfo", null);
        setBooleanField(term627379, term627379.getClass(), "unknown", false);
        setBooleanField(term627379, term627379.getClass(), "resolved", false);
        setField(term627379, term627379.getClass(), "resolveResult", null);
        setField(term627379, term627379.getClass(), "registry", null);
        setField(term627375, term627375.getClass(), "typeOfThis", term627379);
        setField(term627375, term627375.getClass(), "source", null);
        setField(term627375, term627375.getClass(), "implementedInterfaces", null);
        setField(term627375, term627375.getClass(), "subTypes", null);
        setField(term627375, term627375.getClass(), "templateTypeName", null);
        setField(term627375, term627375.getClass(), "className", null);
        setField(term627375, term627375.getClass(), "properties", null);
        setField(term627375, term627375.getClass(), "implicitPrototype", null);
        setBooleanField(term627375, term627375.getClass(), "nativeType", false);
        setBooleanField(term627375, term627375.getClass(), "visited", false);
        setField(term627375, term627375.getClass(), "docInfo", null);
        setBooleanField(term627375, term627375.getClass(), "unknown", false);
        setBooleanField(term627375, term627375.getClass(), "resolved", false);
        setField(term627375, term627375.getClass(), "resolveResult", null);
        setField(term627375, term627375.getClass(), "registry", null);
        Class<? extends Object> term627982 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term627981 = ((Class) term627982).getDeclaredField((String) "INTERFACE");
        ((Field) term627981).setAccessible(true);
        Object enum1165 = ((Field) term627981).get((Object) null);
        term627381 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term627385 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term627381, term627381.getClass(), "this$0", null);
        setField(term627381, term627381.getClass(), "call", null);
        setField(term627381, term627381.getClass(), "prototype", null);
        setField(term627381, term627381.getClass(), "kind", enum1165);
        setField(term627385, term627385.getClass(), "this$0", null);
        setField(term627385, term627385.getClass(), "call", null);
        setField(term627385, term627385.getClass(), "prototype", null);
        setField(term627385, term627385.getClass(), "kind", enum1165);
        setField(term627385, term627385.getClass(), "typeOfThis", null);
        setField(term627385, term627385.getClass(), "source", null);
        setField(term627385, term627385.getClass(), "implementedInterfaces", null);
        setField(term627385, term627385.getClass(), "subTypes", null);
        setField(term627385, term627385.getClass(), "templateTypeName", null);
        setField(term627385, term627385.getClass(), "className", null);
        setField(term627385, term627385.getClass(), "properties", null);
        setField(term627385, term627385.getClass(), "implicitPrototype", null);
        setBooleanField(term627385, term627385.getClass(), "nativeType", false);
        setBooleanField(term627385, term627385.getClass(), "visited", false);
        setField(term627385, term627385.getClass(), "docInfo", null);
        setBooleanField(term627385, term627385.getClass(), "unknown", false);
        setBooleanField(term627385, term627385.getClass(), "resolved", false);
        setField(term627385, term627385.getClass(), "resolveResult", null);
        setField(term627385, term627385.getClass(), "registry", null);
        setField(term627381, term627381.getClass(), "typeOfThis", term627385);
        setField(term627381, term627381.getClass(), "source", null);
        setField(term627381, term627381.getClass(), "implementedInterfaces", null);
        setField(term627381, term627381.getClass(), "subTypes", null);
        setField(term627381, term627381.getClass(), "templateTypeName", null);
        setField(term627381, term627381.getClass(), "className", null);
        setField(term627381, term627381.getClass(), "properties", null);
        setField(term627381, term627381.getClass(), "implicitPrototype", null);
        setBooleanField(term627381, term627381.getClass(), "nativeType", false);
        setBooleanField(term627381, term627381.getClass(), "visited", false);
        setField(term627381, term627381.getClass(), "docInfo", null);
        setBooleanField(term627381, term627381.getClass(), "unknown", false);
        setBooleanField(term627381, term627381.getClass(), "resolved", false);
        setField(term627381, term627381.getClass(), "resolveResult", null);
        setField(term627381, term627381.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term626644;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term625892, args);
        assertTrue(recursiveEquals(term625892, term627375));
        assertTrue(recursiveEquals(term626644, term627381));
        assertTrue(recursiveEquals(retValue, true));
    }

};


