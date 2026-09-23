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

public class FunctionType_isSubtype_21010021581383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1777188;
     Object term1777444;
     Object term1778959;
     Object term1778963;

    public FunctionType_isSubtype_21010021581383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1778973 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1778972 = ((Class) term1778973).getDeclaredField((String) "INTERFACE");
        ((Field) term1778972).setAccessible(true);
        Object enum3315 = ((Field) term1778972).get((Object) null);
        term1777188 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1777188, term1777188.getClass(), "kind", enum3315);
        setField(term1777188, term1777188.getClass(), "typeOfThis", term1777188);
        Class<? extends Object> term1779267 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1779266 = ((Class) term1779267).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1779266).setAccessible(true);
        Object enum3316 = ((Field) term1779266).get((Object) null);
        Class<? extends Object> term1779567 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1779566 = ((Class) term1779567).getDeclaredField((String) "ORDINARY");
        ((Field) term1779566).setAccessible(true);
        Object enum3317 = ((Field) term1779566).get((Object) null);
        term1777444 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1777700 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1777444, term1777444.getClass(), "kind", enum3316);
        setField(term1777700, term1777700.getClass(), "kind", enum3317);
        setField(term1777444, term1777444.getClass(), "typeOfThis", term1777700);
        Class<? extends Object> term1779858 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1779857 = ((Class) term1779858).getDeclaredField((String) "INTERFACE");
        ((Field) term1779857).setAccessible(true);
        Object enum3318 = ((Field) term1779857).get((Object) null);
        term1778959 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1778959, term1778959.getClass(), "this$0", null);
        setField(term1778959, term1778959.getClass(), "call", null);
        setField(term1778959, term1778959.getClass(), "prototype", null);
        setField(term1778959, term1778959.getClass(), "kind", enum3318);
        setField(term1778959, term1778959.getClass(), "typeOfThis", term1778959);
        setField(term1778959, term1778959.getClass(), "source", null);
        setField(term1778959, term1778959.getClass(), "implementedInterfaces", null);
        setField(term1778959, term1778959.getClass(), "subTypes", null);
        setField(term1778959, term1778959.getClass(), "templateTypeName", null);
        setField(term1778959, term1778959.getClass(), "className", null);
        setField(term1778959, term1778959.getClass(), "properties", null);
        setField(term1778959, term1778959.getClass(), "implicitPrototype", null);
        setBooleanField(term1778959, term1778959.getClass(), "nativeType", false);
        setBooleanField(term1778959, term1778959.getClass(), "visited", false);
        setField(term1778959, term1778959.getClass(), "docInfo", null);
        setBooleanField(term1778959, term1778959.getClass(), "unknown", false);
        setBooleanField(term1778959, term1778959.getClass(), "resolved", false);
        setField(term1778959, term1778959.getClass(), "resolveResult", null);
        setField(term1778959, term1778959.getClass(), "registry", null);
        Class<? extends Object> term1780152 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1780151 = ((Class) term1780152).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1780151).setAccessible(true);
        Object enum3319 = ((Field) term1780151).get((Object) null);
        Class<? extends Object> term1780452 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1780451 = ((Class) term1780452).getDeclaredField((String) "ORDINARY");
        ((Field) term1780451).setAccessible(true);
        Object enum3320 = ((Field) term1780451).get((Object) null);
        term1778963 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1778967 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1778963, term1778963.getClass(), "this$0", null);
        setField(term1778963, term1778963.getClass(), "call", null);
        setField(term1778963, term1778963.getClass(), "prototype", null);
        setField(term1778963, term1778963.getClass(), "kind", enum3319);
        setField(term1778967, term1778967.getClass(), "this$0", null);
        setField(term1778967, term1778967.getClass(), "call", null);
        setField(term1778967, term1778967.getClass(), "prototype", null);
        setField(term1778967, term1778967.getClass(), "kind", enum3320);
        setField(term1778967, term1778967.getClass(), "typeOfThis", null);
        setField(term1778967, term1778967.getClass(), "source", null);
        setField(term1778967, term1778967.getClass(), "implementedInterfaces", null);
        setField(term1778967, term1778967.getClass(), "subTypes", null);
        setField(term1778967, term1778967.getClass(), "templateTypeName", null);
        setField(term1778967, term1778967.getClass(), "className", null);
        setField(term1778967, term1778967.getClass(), "properties", null);
        setField(term1778967, term1778967.getClass(), "implicitPrototype", null);
        setBooleanField(term1778967, term1778967.getClass(), "nativeType", false);
        setBooleanField(term1778967, term1778967.getClass(), "visited", false);
        setField(term1778967, term1778967.getClass(), "docInfo", null);
        setBooleanField(term1778967, term1778967.getClass(), "unknown", false);
        setBooleanField(term1778967, term1778967.getClass(), "resolved", false);
        setField(term1778967, term1778967.getClass(), "resolveResult", null);
        setField(term1778967, term1778967.getClass(), "registry", null);
        setField(term1778963, term1778963.getClass(), "typeOfThis", term1778967);
        setField(term1778963, term1778963.getClass(), "source", null);
        setField(term1778963, term1778963.getClass(), "implementedInterfaces", null);
        setField(term1778963, term1778963.getClass(), "subTypes", null);
        setField(term1778963, term1778963.getClass(), "templateTypeName", null);
        setField(term1778963, term1778963.getClass(), "className", null);
        setField(term1778963, term1778963.getClass(), "properties", null);
        setField(term1778963, term1778963.getClass(), "implicitPrototype", null);
        setBooleanField(term1778963, term1778963.getClass(), "nativeType", false);
        setBooleanField(term1778963, term1778963.getClass(), "visited", false);
        setField(term1778963, term1778963.getClass(), "docInfo", null);
        setBooleanField(term1778963, term1778963.getClass(), "unknown", false);
        setBooleanField(term1778963, term1778963.getClass(), "resolved", false);
        setField(term1778963, term1778963.getClass(), "resolveResult", null);
        setField(term1778963, term1778963.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1777444;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1777188, args);
        assertTrue(recursiveEquals(term1777188, term1778959));
        assertTrue(recursiveEquals(term1777444, term1778963));
        assertTrue(recursiveEquals(retValue, false));
    }

};


