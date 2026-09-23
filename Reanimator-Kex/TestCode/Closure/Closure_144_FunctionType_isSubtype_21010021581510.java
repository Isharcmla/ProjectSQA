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

public class FunctionType_isSubtype_21010021581510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2192978;
     Object term2193638;
     Object term2196750;
     Object term2196758;

    public FunctionType_isSubtype_21010021581510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2196768 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2196767 = ((Class) term2196768).getDeclaredField((String) "ORDINARY");
        ((Field) term2196767).setAccessible(true);
        Object enum3913 = ((Field) term2196767).get((Object) null);
        Class<? extends Object> term2197059 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2197058 = ((Class) term2197059).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2197058).setAccessible(true);
        Object enum3914 = ((Field) term2197058).get((Object) null);
        term2192978 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2193530 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2192978, term2192978.getClass(), "kind", enum3913);
        setField(term2193530, term2193530.getClass(), "kind", enum3914);
        setField(term2192978, term2192978.getClass(), "typeOfThis", term2193530);
        term2193638 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2193820 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2193638, term2193638.getClass(), "kind", enum3914);
        setField(term2193820, term2193820.getClass(), "kind", enum3913);
        setField(term2193638, term2193638.getClass(), "typeOfThis", term2193820);
        Class<? extends Object> term2197359 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2197358 = ((Class) term2197359).getDeclaredField((String) "INTERFACE");
        ((Field) term2197358).setAccessible(true);
        Object enum3915 = ((Field) term2197358).get((Object) null);
        Class<? extends Object> term2197653 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2197652 = ((Class) term2197653).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2197652).setAccessible(true);
        Object enum3916 = ((Field) term2197652).get((Object) null);
        term2196750 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2196754 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2196750, term2196750.getClass(), "this$0", null);
        setField(term2196750, term2196750.getClass(), "call", null);
        setField(term2196750, term2196750.getClass(), "prototype", null);
        setField(term2196750, term2196750.getClass(), "kind", enum3915);
        setField(term2196754, term2196754.getClass(), "this$0", null);
        setField(term2196754, term2196754.getClass(), "call", null);
        setField(term2196754, term2196754.getClass(), "prototype", null);
        setField(term2196754, term2196754.getClass(), "kind", enum3916);
        setField(term2196754, term2196754.getClass(), "typeOfThis", null);
        setField(term2196754, term2196754.getClass(), "source", null);
        setField(term2196754, term2196754.getClass(), "implementedInterfaces", null);
        setField(term2196754, term2196754.getClass(), "subTypes", null);
        setField(term2196754, term2196754.getClass(), "templateTypeName", null);
        setField(term2196754, term2196754.getClass(), "className", null);
        setField(term2196754, term2196754.getClass(), "properties", null);
        setField(term2196754, term2196754.getClass(), "implicitPrototype", null);
        setBooleanField(term2196754, term2196754.getClass(), "nativeType", false);
        setBooleanField(term2196754, term2196754.getClass(), "prettyPrint", false);
        setBooleanField(term2196754, term2196754.getClass(), "visited", false);
        setField(term2196754, term2196754.getClass(), "docInfo", null);
        setBooleanField(term2196754, term2196754.getClass(), "unknown", false);
        setBooleanField(term2196754, term2196754.getClass(), "resolved", false);
        setField(term2196754, term2196754.getClass(), "resolveResult", null);
        setField(term2196754, term2196754.getClass(), "registry", null);
        setField(term2196750, term2196750.getClass(), "typeOfThis", term2196754);
        setField(term2196750, term2196750.getClass(), "source", null);
        setField(term2196750, term2196750.getClass(), "implementedInterfaces", null);
        setField(term2196750, term2196750.getClass(), "subTypes", null);
        setField(term2196750, term2196750.getClass(), "templateTypeName", null);
        setField(term2196750, term2196750.getClass(), "className", null);
        setField(term2196750, term2196750.getClass(), "properties", null);
        setField(term2196750, term2196750.getClass(), "implicitPrototype", null);
        setBooleanField(term2196750, term2196750.getClass(), "nativeType", false);
        setBooleanField(term2196750, term2196750.getClass(), "prettyPrint", false);
        setBooleanField(term2196750, term2196750.getClass(), "visited", false);
        setField(term2196750, term2196750.getClass(), "docInfo", null);
        setBooleanField(term2196750, term2196750.getClass(), "unknown", false);
        setBooleanField(term2196750, term2196750.getClass(), "resolved", false);
        setField(term2196750, term2196750.getClass(), "resolveResult", null);
        setField(term2196750, term2196750.getClass(), "registry", null);
        Class<? extends Object> term2197953 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2197952 = ((Class) term2197953).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2197952).setAccessible(true);
        Object enum3917 = ((Field) term2197952).get((Object) null);
        Class<? extends Object> term2198253 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2198252 = ((Class) term2198253).getDeclaredField((String) "INTERFACE");
        ((Field) term2198252).setAccessible(true);
        Object enum3918 = ((Field) term2198252).get((Object) null);
        term2196758 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2196762 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2196758, term2196758.getClass(), "this$0", null);
        setField(term2196758, term2196758.getClass(), "call", null);
        setField(term2196758, term2196758.getClass(), "prototype", null);
        setField(term2196758, term2196758.getClass(), "kind", enum3917);
        setField(term2196762, term2196762.getClass(), "this$0", null);
        setField(term2196762, term2196762.getClass(), "call", null);
        setField(term2196762, term2196762.getClass(), "prototype", null);
        setField(term2196762, term2196762.getClass(), "kind", enum3918);
        setField(term2196762, term2196762.getClass(), "typeOfThis", null);
        setField(term2196762, term2196762.getClass(), "source", null);
        setField(term2196762, term2196762.getClass(), "implementedInterfaces", null);
        setField(term2196762, term2196762.getClass(), "subTypes", null);
        setField(term2196762, term2196762.getClass(), "templateTypeName", null);
        setField(term2196762, term2196762.getClass(), "className", null);
        setField(term2196762, term2196762.getClass(), "properties", null);
        setField(term2196762, term2196762.getClass(), "implicitPrototype", null);
        setBooleanField(term2196762, term2196762.getClass(), "nativeType", false);
        setBooleanField(term2196762, term2196762.getClass(), "prettyPrint", false);
        setBooleanField(term2196762, term2196762.getClass(), "visited", false);
        setField(term2196762, term2196762.getClass(), "docInfo", null);
        setBooleanField(term2196762, term2196762.getClass(), "unknown", false);
        setBooleanField(term2196762, term2196762.getClass(), "resolved", false);
        setField(term2196762, term2196762.getClass(), "resolveResult", null);
        setField(term2196762, term2196762.getClass(), "registry", null);
        setField(term2196758, term2196758.getClass(), "typeOfThis", term2196762);
        setField(term2196758, term2196758.getClass(), "source", null);
        setField(term2196758, term2196758.getClass(), "implementedInterfaces", null);
        setField(term2196758, term2196758.getClass(), "subTypes", null);
        setField(term2196758, term2196758.getClass(), "templateTypeName", null);
        setField(term2196758, term2196758.getClass(), "className", null);
        setField(term2196758, term2196758.getClass(), "properties", null);
        setField(term2196758, term2196758.getClass(), "implicitPrototype", null);
        setBooleanField(term2196758, term2196758.getClass(), "nativeType", false);
        setBooleanField(term2196758, term2196758.getClass(), "prettyPrint", false);
        setBooleanField(term2196758, term2196758.getClass(), "visited", false);
        setField(term2196758, term2196758.getClass(), "docInfo", null);
        setBooleanField(term2196758, term2196758.getClass(), "unknown", false);
        setBooleanField(term2196758, term2196758.getClass(), "resolved", false);
        setField(term2196758, term2196758.getClass(), "resolveResult", null);
        setField(term2196758, term2196758.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2193638;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term2192978, args);
        assertTrue(recursiveEquals(term2192978, term2196750));
        assertTrue(recursiveEquals(term2193638, term2196758));
        assertTrue(recursiveEquals(retValue, false));
    }

};


