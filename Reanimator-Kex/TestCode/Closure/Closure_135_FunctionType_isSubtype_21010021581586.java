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

public class FunctionType_isSubtype_21010021581586 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2113567;
     Object term2114321;
     Object term2117480;
     Object term2117489;

    public FunctionType_isSubtype_21010021581586() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2117499 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2117498 = ((Class) term2117499).getDeclaredField((String) "ORDINARY");
        ((Field) term2117498).setAccessible(true);
        Object enum3942 = ((Field) term2117498).get((Object) null);
        Class<? extends Object> term2117790 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2117789 = ((Class) term2117790).getDeclaredField((String) "INTERFACE");
        ((Field) term2117789).setAccessible(true);
        Object enum3943 = ((Field) term2117789).get((Object) null);
        term2113567 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2114119 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2114213 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2113567, term2113567.getClass(), "kind", enum3942);
        setField(term2114119, term2114119.getClass(), "kind", enum3943);
        setField(term2114119, term2114119.getClass(), "className", null);
        setField(term2113567, term2113567.getClass(), "typeOfThis", term2114119);
        setField(term2113567, term2113567.getClass(), "call", term2114213);
        term2114321 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2114651 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term2114321, term2114321.getClass(), "kind", enum3942);
        setField(term2114651, term2114651.getClass(), "kind", enum3943);
        setField(term2114651, term2114651.getClass(), "className", null);
        setField(term2114321, term2114321.getClass(), "typeOfThis", term2114651);
        setField(term2114321, term2114321.getClass(), "call", null);
        Class<? extends Object> term2118084 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2118083 = ((Class) term2118084).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2118083).setAccessible(true);
        Object enum3944 = ((Field) term2118083).get((Object) null);
        Class<? extends Object> term2118384 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2118383 = ((Class) term2118384).getDeclaredField((String) "INTERFACE");
        ((Field) term2118383).setAccessible(true);
        Object enum3945 = ((Field) term2118383).get((Object) null);
        term2117480 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2117481 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term2117485 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2117480, term2117480.getClass(), "this$0", null);
        setField(term2117481, term2117481.getClass(), "parameters", null);
        setField(term2117481, term2117481.getClass(), "returnType", null);
        setBooleanField(term2117481, term2117481.getClass(), "resolved", false);
        setField(term2117481, term2117481.getClass(), "resolveResult", null);
        setField(term2117481, term2117481.getClass(), "registry", null);
        setField(term2117480, term2117480.getClass(), "call", term2117481);
        setField(term2117480, term2117480.getClass(), "prototype", null);
        setField(term2117480, term2117480.getClass(), "kind", enum3944);
        setField(term2117485, term2117485.getClass(), "this$0", null);
        setField(term2117485, term2117485.getClass(), "call", null);
        setField(term2117485, term2117485.getClass(), "prototype", null);
        setField(term2117485, term2117485.getClass(), "kind", enum3945);
        setField(term2117485, term2117485.getClass(), "typeOfThis", null);
        setField(term2117485, term2117485.getClass(), "source", null);
        setField(term2117485, term2117485.getClass(), "implementedInterfaces", null);
        setField(term2117485, term2117485.getClass(), "subTypes", null);
        setField(term2117485, term2117485.getClass(), "templateTypeName", null);
        setField(term2117485, term2117485.getClass(), "className", null);
        setField(term2117485, term2117485.getClass(), "properties", null);
        setField(term2117485, term2117485.getClass(), "implicitPrototype", null);
        setBooleanField(term2117485, term2117485.getClass(), "nativeType", false);
        setBooleanField(term2117485, term2117485.getClass(), "visited", false);
        setField(term2117485, term2117485.getClass(), "docInfo", null);
        setBooleanField(term2117485, term2117485.getClass(), "unknown", false);
        setBooleanField(term2117485, term2117485.getClass(), "resolved", false);
        setField(term2117485, term2117485.getClass(), "resolveResult", null);
        setField(term2117485, term2117485.getClass(), "registry", null);
        setField(term2117480, term2117480.getClass(), "typeOfThis", term2117485);
        setField(term2117480, term2117480.getClass(), "source", null);
        setField(term2117480, term2117480.getClass(), "implementedInterfaces", null);
        setField(term2117480, term2117480.getClass(), "subTypes", null);
        setField(term2117480, term2117480.getClass(), "templateTypeName", null);
        setField(term2117480, term2117480.getClass(), "className", null);
        setField(term2117480, term2117480.getClass(), "properties", null);
        setField(term2117480, term2117480.getClass(), "implicitPrototype", null);
        setBooleanField(term2117480, term2117480.getClass(), "nativeType", false);
        setBooleanField(term2117480, term2117480.getClass(), "visited", false);
        setField(term2117480, term2117480.getClass(), "docInfo", null);
        setBooleanField(term2117480, term2117480.getClass(), "unknown", false);
        setBooleanField(term2117480, term2117480.getClass(), "resolved", false);
        setField(term2117480, term2117480.getClass(), "resolveResult", null);
        setField(term2117480, term2117480.getClass(), "registry", null);
        Class<? extends Object> term2118678 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2118677 = ((Class) term2118678).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2118677).setAccessible(true);
        Object enum3946 = ((Field) term2118677).get((Object) null);
        Class<? extends Object> term2118978 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2118977 = ((Class) term2118978).getDeclaredField((String) "INTERFACE");
        ((Field) term2118977).setAccessible(true);
        Object enum3947 = ((Field) term2118977).get((Object) null);
        term2117489 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2117493 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term2117489, term2117489.getClass(), "this$0", null);
        setField(term2117489, term2117489.getClass(), "call", null);
        setField(term2117489, term2117489.getClass(), "prototype", null);
        setField(term2117489, term2117489.getClass(), "kind", enum3946);
        setField(term2117493, term2117493.getClass(), "this$0", null);
        setField(term2117493, term2117493.getClass(), "call", null);
        setField(term2117493, term2117493.getClass(), "prototype", null);
        setField(term2117493, term2117493.getClass(), "kind", enum3947);
        setField(term2117493, term2117493.getClass(), "typeOfThis", null);
        setField(term2117493, term2117493.getClass(), "source", null);
        setField(term2117493, term2117493.getClass(), "implementedInterfaces", null);
        setField(term2117493, term2117493.getClass(), "subTypes", null);
        setField(term2117493, term2117493.getClass(), "templateTypeName", null);
        setField(term2117493, term2117493.getClass(), "className", null);
        setField(term2117493, term2117493.getClass(), "properties", null);
        setField(term2117493, term2117493.getClass(), "implicitPrototype", null);
        setBooleanField(term2117493, term2117493.getClass(), "nativeType", false);
        setBooleanField(term2117493, term2117493.getClass(), "visited", false);
        setField(term2117493, term2117493.getClass(), "docInfo", null);
        setBooleanField(term2117493, term2117493.getClass(), "unknown", false);
        setBooleanField(term2117493, term2117493.getClass(), "resolved", false);
        setField(term2117493, term2117493.getClass(), "resolveResult", null);
        setField(term2117493, term2117493.getClass(), "registry", null);
        setField(term2117489, term2117489.getClass(), "typeOfThis", term2117493);
        setField(term2117489, term2117489.getClass(), "source", null);
        setField(term2117489, term2117489.getClass(), "implementedInterfaces", null);
        setField(term2117489, term2117489.getClass(), "subTypes", null);
        setField(term2117489, term2117489.getClass(), "templateTypeName", null);
        setField(term2117489, term2117489.getClass(), "className", null);
        setField(term2117489, term2117489.getClass(), "properties", null);
        setField(term2117489, term2117489.getClass(), "implicitPrototype", null);
        setBooleanField(term2117489, term2117489.getClass(), "nativeType", false);
        setBooleanField(term2117489, term2117489.getClass(), "visited", false);
        setField(term2117489, term2117489.getClass(), "docInfo", null);
        setBooleanField(term2117489, term2117489.getClass(), "unknown", false);
        setBooleanField(term2117489, term2117489.getClass(), "resolved", false);
        setField(term2117489, term2117489.getClass(), "resolveResult", null);
        setField(term2117489, term2117489.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2114321;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term2113567, args);
        assertTrue(recursiveEquals(term2113567, term2117480));
        assertTrue(recursiveEquals(term2114321, term2117489));
        assertTrue(recursiveEquals(retValue, false));
    }

};


