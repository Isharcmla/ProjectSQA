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

public class FunctionType_isSubtype_21010021581417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1829308;
     Object term1829564;
     Object term1832665;
     Object term1832669;

    public FunctionType_isSubtype_21010021581417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1832679 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1832678 = ((Class) term1832679).getDeclaredField((String) "INTERFACE");
        ((Field) term1832678).setAccessible(true);
        Object enum3412 = ((Field) term1832678).get((Object) null);
        term1829308 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1829308, term1829308.getClass(), "kind", enum3412);
        setField(term1829308, term1829308.getClass(), "typeOfThis", term1829308);
        Class<? extends Object> term1832973 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1832972 = ((Class) term1832973).getDeclaredField((String) "ORDINARY");
        ((Field) term1832972).setAccessible(true);
        Object enum3413 = ((Field) term1832972).get((Object) null);
        Class<? extends Object> term1833264 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1833263 = ((Class) term1833264).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1833263).setAccessible(true);
        Object enum3414 = ((Field) term1833263).get((Object) null);
        term1829564 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1830042 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1829564, term1829564.getClass(), "kind", enum3413);
        setField(term1830042, term1830042.getClass(), "kind", enum3414);
        setField(term1829564, term1829564.getClass(), "typeOfThis", term1830042);
        Class<? extends Object> term1833564 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1833563 = ((Class) term1833564).getDeclaredField((String) "INTERFACE");
        ((Field) term1833563).setAccessible(true);
        Object enum3415 = ((Field) term1833563).get((Object) null);
        term1832665 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1832665, term1832665.getClass(), "this$0", null);
        setField(term1832665, term1832665.getClass(), "call", null);
        setField(term1832665, term1832665.getClass(), "prototype", null);
        setField(term1832665, term1832665.getClass(), "kind", enum3415);
        setField(term1832665, term1832665.getClass(), "typeOfThis", term1832665);
        setField(term1832665, term1832665.getClass(), "source", null);
        setField(term1832665, term1832665.getClass(), "implementedInterfaces", null);
        setField(term1832665, term1832665.getClass(), "subTypes", null);
        setField(term1832665, term1832665.getClass(), "templateTypeName", null);
        setField(term1832665, term1832665.getClass(), "className", null);
        setField(term1832665, term1832665.getClass(), "properties", null);
        setField(term1832665, term1832665.getClass(), "implicitPrototype", null);
        setBooleanField(term1832665, term1832665.getClass(), "nativeType", false);
        setBooleanField(term1832665, term1832665.getClass(), "visited", false);
        setField(term1832665, term1832665.getClass(), "docInfo", null);
        setBooleanField(term1832665, term1832665.getClass(), "unknown", false);
        setBooleanField(term1832665, term1832665.getClass(), "resolved", false);
        setField(term1832665, term1832665.getClass(), "resolveResult", null);
        setField(term1832665, term1832665.getClass(), "registry", null);
        Class<? extends Object> term1833858 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1833857 = ((Class) term1833858).getDeclaredField((String) "ORDINARY");
        ((Field) term1833857).setAccessible(true);
        Object enum3416 = ((Field) term1833857).get((Object) null);
        Class<? extends Object> term1834149 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1834148 = ((Class) term1834149).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1834148).setAccessible(true);
        Object enum3417 = ((Field) term1834148).get((Object) null);
        term1832669 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1832673 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1832669, term1832669.getClass(), "this$0", null);
        setField(term1832669, term1832669.getClass(), "call", null);
        setField(term1832669, term1832669.getClass(), "prototype", null);
        setField(term1832669, term1832669.getClass(), "kind", enum3416);
        setField(term1832673, term1832673.getClass(), "this$0", null);
        setField(term1832673, term1832673.getClass(), "call", null);
        setField(term1832673, term1832673.getClass(), "prototype", null);
        setField(term1832673, term1832673.getClass(), "kind", enum3417);
        setField(term1832673, term1832673.getClass(), "typeOfThis", null);
        setField(term1832673, term1832673.getClass(), "source", null);
        setField(term1832673, term1832673.getClass(), "implementedInterfaces", null);
        setField(term1832673, term1832673.getClass(), "subTypes", null);
        setField(term1832673, term1832673.getClass(), "templateTypeName", null);
        setField(term1832673, term1832673.getClass(), "className", null);
        setField(term1832673, term1832673.getClass(), "properties", null);
        setField(term1832673, term1832673.getClass(), "implicitPrototype", null);
        setBooleanField(term1832673, term1832673.getClass(), "nativeType", false);
        setBooleanField(term1832673, term1832673.getClass(), "visited", false);
        setField(term1832673, term1832673.getClass(), "docInfo", null);
        setBooleanField(term1832673, term1832673.getClass(), "unknown", false);
        setBooleanField(term1832673, term1832673.getClass(), "resolved", false);
        setField(term1832673, term1832673.getClass(), "resolveResult", null);
        setField(term1832673, term1832673.getClass(), "registry", null);
        setField(term1832669, term1832669.getClass(), "typeOfThis", term1832673);
        setField(term1832669, term1832669.getClass(), "source", null);
        setField(term1832669, term1832669.getClass(), "implementedInterfaces", null);
        setField(term1832669, term1832669.getClass(), "subTypes", null);
        setField(term1832669, term1832669.getClass(), "templateTypeName", null);
        setField(term1832669, term1832669.getClass(), "className", null);
        setField(term1832669, term1832669.getClass(), "properties", null);
        setField(term1832669, term1832669.getClass(), "implicitPrototype", null);
        setBooleanField(term1832669, term1832669.getClass(), "nativeType", false);
        setBooleanField(term1832669, term1832669.getClass(), "visited", false);
        setField(term1832669, term1832669.getClass(), "docInfo", null);
        setBooleanField(term1832669, term1832669.getClass(), "unknown", false);
        setBooleanField(term1832669, term1832669.getClass(), "resolved", false);
        setField(term1832669, term1832669.getClass(), "resolveResult", null);
        setField(term1832669, term1832669.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1829564;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1829308, args);
        assertTrue(recursiveEquals(term1829308, term1832665));
        assertTrue(recursiveEquals(term1829564, term1832669));
        assertTrue(recursiveEquals(retValue, false));
    }

};


