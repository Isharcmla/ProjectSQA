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

public class FunctionType_isSubtype_21010021581628 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2188712;
     Object term2189372;
     Object term2190728;
     Object term2190733;

    public FunctionType_isSubtype_21010021581628() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2190743 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2190742 = ((Class) term2190743).getDeclaredField((String) "INTERFACE");
        ((Field) term2190742).setAccessible(true);
        Object enum4081 = ((Field) term2190742).get((Object) null);
        Class<? extends Object> term2191037 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2191036 = ((Class) term2191037).getDeclaredField((String) "INTERFACE");
        ((Field) term2191036).setAccessible(true);
        Object enum4082 = ((Field) term2191036).get((Object) null);
        term2188712 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2189264 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term2188712, term2188712.getClass(), "kind", enum4081);
        setField(term2189264, term2189264.getClass(), "kind", enum4082);
        setField(term2188712, term2188712.getClass(), "typeOfThis", term2189264);
        Class<? extends Object> term2191331 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2191330 = ((Class) term2191331).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2191330).setAccessible(true);
        Object enum4083 = ((Field) term2191330).get((Object) null);
        term2189372 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2189702 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term2189372, term2189372.getClass(), "kind", enum4081);
        setField(term2189702, term2189702.getClass(), "kind", enum4083);
        setField(term2189372, term2189372.getClass(), "typeOfThis", term2189702);
        Class<? extends Object> term2191631 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2191630 = ((Class) term2191631).getDeclaredField((String) "INTERFACE");
        ((Field) term2191630).setAccessible(true);
        Object enum4084 = ((Field) term2191630).get((Object) null);
        term2190728 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2190732 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term2190728, term2190728.getClass(), "call", null);
        setField(term2190728, term2190728.getClass(), "prototype", null);
        setField(term2190728, term2190728.getClass(), "kind", enum4084);
        setField(term2190732, term2190732.getClass(), "this$0", null);
        setField(term2190732, term2190732.getClass(), "call", null);
        setField(term2190732, term2190732.getClass(), "prototype", null);
        setField(term2190732, term2190732.getClass(), "kind", enum4084);
        setField(term2190732, term2190732.getClass(), "typeOfThis", null);
        setField(term2190732, term2190732.getClass(), "source", null);
        setField(term2190732, term2190732.getClass(), "implementedInterfaces", null);
        setField(term2190732, term2190732.getClass(), "subTypes", null);
        setField(term2190732, term2190732.getClass(), "templateTypeName", null);
        setField(term2190732, term2190732.getClass(), "className", null);
        setField(term2190732, term2190732.getClass(), "properties", null);
        setField(term2190732, term2190732.getClass(), "implicitPrototype", null);
        setBooleanField(term2190732, term2190732.getClass(), "nativeType", false);
        setBooleanField(term2190732, term2190732.getClass(), "visited", false);
        setField(term2190732, term2190732.getClass(), "docInfo", null);
        setBooleanField(term2190732, term2190732.getClass(), "unknown", false);
        setBooleanField(term2190732, term2190732.getClass(), "resolved", false);
        setField(term2190732, term2190732.getClass(), "resolveResult", null);
        setField(term2190732, term2190732.getClass(), "registry", null);
        setField(term2190728, term2190728.getClass(), "typeOfThis", term2190732);
        setField(term2190728, term2190728.getClass(), "source", null);
        setField(term2190728, term2190728.getClass(), "implementedInterfaces", null);
        setField(term2190728, term2190728.getClass(), "subTypes", null);
        setField(term2190728, term2190728.getClass(), "templateTypeName", null);
        setField(term2190728, term2190728.getClass(), "className", null);
        setField(term2190728, term2190728.getClass(), "properties", null);
        setField(term2190728, term2190728.getClass(), "implicitPrototype", null);
        setBooleanField(term2190728, term2190728.getClass(), "nativeType", false);
        setBooleanField(term2190728, term2190728.getClass(), "visited", false);
        setField(term2190728, term2190728.getClass(), "docInfo", null);
        setBooleanField(term2190728, term2190728.getClass(), "unknown", false);
        setBooleanField(term2190728, term2190728.getClass(), "resolved", false);
        setField(term2190728, term2190728.getClass(), "resolveResult", null);
        setField(term2190728, term2190728.getClass(), "registry", null);
        Class<? extends Object> term2191925 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2191924 = ((Class) term2191925).getDeclaredField((String) "INTERFACE");
        ((Field) term2191924).setAccessible(true);
        Object enum4085 = ((Field) term2191924).get((Object) null);
        Class<? extends Object> term2192219 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2192218 = ((Class) term2192219).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2192218).setAccessible(true);
        Object enum4086 = ((Field) term2192218).get((Object) null);
        term2190733 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2190737 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term2190733, term2190733.getClass(), "this$0", null);
        setField(term2190733, term2190733.getClass(), "call", null);
        setField(term2190733, term2190733.getClass(), "prototype", null);
        setField(term2190733, term2190733.getClass(), "kind", enum4085);
        setField(term2190737, term2190737.getClass(), "this$0", null);
        setField(term2190737, term2190737.getClass(), "call", null);
        setField(term2190737, term2190737.getClass(), "prototype", null);
        setField(term2190737, term2190737.getClass(), "kind", enum4086);
        setField(term2190737, term2190737.getClass(), "typeOfThis", null);
        setField(term2190737, term2190737.getClass(), "source", null);
        setField(term2190737, term2190737.getClass(), "implementedInterfaces", null);
        setField(term2190737, term2190737.getClass(), "subTypes", null);
        setField(term2190737, term2190737.getClass(), "templateTypeName", null);
        setField(term2190737, term2190737.getClass(), "className", null);
        setField(term2190737, term2190737.getClass(), "properties", null);
        setField(term2190737, term2190737.getClass(), "implicitPrototype", null);
        setBooleanField(term2190737, term2190737.getClass(), "nativeType", false);
        setBooleanField(term2190737, term2190737.getClass(), "visited", false);
        setField(term2190737, term2190737.getClass(), "docInfo", null);
        setBooleanField(term2190737, term2190737.getClass(), "unknown", false);
        setBooleanField(term2190737, term2190737.getClass(), "resolved", false);
        setField(term2190737, term2190737.getClass(), "resolveResult", null);
        setField(term2190737, term2190737.getClass(), "registry", null);
        setField(term2190733, term2190733.getClass(), "typeOfThis", term2190737);
        setField(term2190733, term2190733.getClass(), "source", null);
        setField(term2190733, term2190733.getClass(), "implementedInterfaces", null);
        setField(term2190733, term2190733.getClass(), "subTypes", null);
        setField(term2190733, term2190733.getClass(), "templateTypeName", null);
        setField(term2190733, term2190733.getClass(), "className", null);
        setField(term2190733, term2190733.getClass(), "properties", null);
        setField(term2190733, term2190733.getClass(), "implicitPrototype", null);
        setBooleanField(term2190733, term2190733.getClass(), "nativeType", false);
        setBooleanField(term2190733, term2190733.getClass(), "visited", false);
        setField(term2190733, term2190733.getClass(), "docInfo", null);
        setBooleanField(term2190733, term2190733.getClass(), "unknown", false);
        setBooleanField(term2190733, term2190733.getClass(), "resolved", false);
        setField(term2190733, term2190733.getClass(), "resolveResult", null);
        setField(term2190733, term2190733.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2189372;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term2188712, args);
        assertTrue(recursiveEquals(term2188712, term2190728));
        assertTrue(recursiveEquals(term2189372, term2190733));
        assertTrue(recursiveEquals(retValue, true));
    }

};


