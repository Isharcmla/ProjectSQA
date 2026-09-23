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

public class FunctionType_isSubtype_21010021581535 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2033699;
     Object term2034359;
     Object term2035550;
     Object term2035555;

    public FunctionType_isSubtype_21010021581535() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2035562 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2035561 = ((Class) term2035562).getDeclaredField((String) "INTERFACE");
        ((Field) term2035561).setAccessible(true);
        Object enum3791 = ((Field) term2035561).get((Object) null);
        Class<? extends Object> term2035856 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2035855 = ((Class) term2035856).getDeclaredField((String) "INTERFACE");
        ((Field) term2035855).setAccessible(true);
        Object enum3792 = ((Field) term2035855).get((Object) null);
        term2033699 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2034251 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2033699, term2033699.getClass(), "kind", enum3791);
        setField(term2034251, term2034251.getClass(), "kind", enum3792);
        setField(term2033699, term2033699.getClass(), "typeOfThis", term2034251);
        Class<? extends Object> term2036150 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2036149 = ((Class) term2036150).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2036149).setAccessible(true);
        Object enum3793 = ((Field) term2036149).get((Object) null);
        term2034359 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2034541 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term2034359, term2034359.getClass(), "kind", enum3793);
        setField(term2034359, term2034359.getClass(), "typeOfThis", term2034541);
        Class<? extends Object> term2036450 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2036449 = ((Class) term2036450).getDeclaredField((String) "INTERFACE");
        ((Field) term2036449).setAccessible(true);
        Object enum3794 = ((Field) term2036449).get((Object) null);
        term2035550 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2035554 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2035550, term2035550.getClass(), "this$0", null);
        setField(term2035550, term2035550.getClass(), "call", null);
        setField(term2035550, term2035550.getClass(), "prototype", null);
        setField(term2035550, term2035550.getClass(), "kind", enum3794);
        setField(term2035554, term2035554.getClass(), "this$0", null);
        setField(term2035554, term2035554.getClass(), "call", null);
        setField(term2035554, term2035554.getClass(), "prototype", null);
        setField(term2035554, term2035554.getClass(), "kind", enum3794);
        setField(term2035554, term2035554.getClass(), "typeOfThis", null);
        setField(term2035554, term2035554.getClass(), "source", null);
        setField(term2035554, term2035554.getClass(), "implementedInterfaces", null);
        setField(term2035554, term2035554.getClass(), "subTypes", null);
        setField(term2035554, term2035554.getClass(), "templateTypeName", null);
        setField(term2035554, term2035554.getClass(), "className", null);
        setField(term2035554, term2035554.getClass(), "properties", null);
        setField(term2035554, term2035554.getClass(), "implicitPrototype", null);
        setBooleanField(term2035554, term2035554.getClass(), "nativeType", false);
        setBooleanField(term2035554, term2035554.getClass(), "visited", false);
        setField(term2035554, term2035554.getClass(), "docInfo", null);
        setBooleanField(term2035554, term2035554.getClass(), "unknown", false);
        setBooleanField(term2035554, term2035554.getClass(), "resolved", false);
        setField(term2035554, term2035554.getClass(), "resolveResult", null);
        setField(term2035554, term2035554.getClass(), "registry", null);
        setField(term2035550, term2035550.getClass(), "typeOfThis", term2035554);
        setField(term2035550, term2035550.getClass(), "source", null);
        setField(term2035550, term2035550.getClass(), "implementedInterfaces", null);
        setField(term2035550, term2035550.getClass(), "subTypes", null);
        setField(term2035550, term2035550.getClass(), "templateTypeName", null);
        setField(term2035550, term2035550.getClass(), "className", null);
        setField(term2035550, term2035550.getClass(), "properties", null);
        setField(term2035550, term2035550.getClass(), "implicitPrototype", null);
        setBooleanField(term2035550, term2035550.getClass(), "nativeType", false);
        setBooleanField(term2035550, term2035550.getClass(), "visited", false);
        setField(term2035550, term2035550.getClass(), "docInfo", null);
        setBooleanField(term2035550, term2035550.getClass(), "unknown", false);
        setBooleanField(term2035550, term2035550.getClass(), "resolved", false);
        setField(term2035550, term2035550.getClass(), "resolveResult", null);
        setField(term2035550, term2035550.getClass(), "registry", null);
        Class<? extends Object> term2036744 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2036743 = ((Class) term2036744).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2036743).setAccessible(true);
        Object enum3795 = ((Field) term2036743).get((Object) null);
        term2035555 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2035559 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term2035555, term2035555.getClass(), "this$0", null);
        setField(term2035555, term2035555.getClass(), "call", null);
        setField(term2035555, term2035555.getClass(), "prototype", null);
        setField(term2035555, term2035555.getClass(), "kind", enum3795);
        setField(term2035559, term2035559.getClass(), "this$0", null);
        setField(term2035559, term2035559.getClass(), "call", null);
        setField(term2035559, term2035559.getClass(), "prototype", null);
        setField(term2035559, term2035559.getClass(), "kind", null);
        setField(term2035559, term2035559.getClass(), "typeOfThis", null);
        setField(term2035559, term2035559.getClass(), "source", null);
        setField(term2035559, term2035559.getClass(), "implementedInterfaces", null);
        setField(term2035559, term2035559.getClass(), "subTypes", null);
        setField(term2035559, term2035559.getClass(), "templateTypeName", null);
        setField(term2035559, term2035559.getClass(), "className", null);
        setField(term2035559, term2035559.getClass(), "properties", null);
        setField(term2035559, term2035559.getClass(), "implicitPrototype", null);
        setBooleanField(term2035559, term2035559.getClass(), "nativeType", false);
        setBooleanField(term2035559, term2035559.getClass(), "visited", false);
        setField(term2035559, term2035559.getClass(), "docInfo", null);
        setBooleanField(term2035559, term2035559.getClass(), "unknown", false);
        setBooleanField(term2035559, term2035559.getClass(), "resolved", false);
        setField(term2035559, term2035559.getClass(), "resolveResult", null);
        setField(term2035559, term2035559.getClass(), "registry", null);
        setField(term2035555, term2035555.getClass(), "typeOfThis", term2035559);
        setField(term2035555, term2035555.getClass(), "source", null);
        setField(term2035555, term2035555.getClass(), "implementedInterfaces", null);
        setField(term2035555, term2035555.getClass(), "subTypes", null);
        setField(term2035555, term2035555.getClass(), "templateTypeName", null);
        setField(term2035555, term2035555.getClass(), "className", null);
        setField(term2035555, term2035555.getClass(), "properties", null);
        setField(term2035555, term2035555.getClass(), "implicitPrototype", null);
        setBooleanField(term2035555, term2035555.getClass(), "nativeType", false);
        setBooleanField(term2035555, term2035555.getClass(), "visited", false);
        setField(term2035555, term2035555.getClass(), "docInfo", null);
        setBooleanField(term2035555, term2035555.getClass(), "unknown", false);
        setBooleanField(term2035555, term2035555.getClass(), "resolved", false);
        setField(term2035555, term2035555.getClass(), "resolveResult", null);
        setField(term2035555, term2035555.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2034359;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term2033699, args);
        assertTrue(recursiveEquals(term2033699, term2035550));
        assertTrue(recursiveEquals(term2034359, term2035555));
        assertTrue(recursiveEquals(retValue, false));
    }

};


