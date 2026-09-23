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

public class FunctionType_isSubtype_2101002158989 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1106655;
     Object term1107307;
     Object term1109499;
     Object term1109504;

    public FunctionType_isSubtype_2101002158989() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1109510 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1109509 = ((Class) term1109510).getDeclaredField((String) "ORDINARY");
        ((Field) term1109509).setAccessible(true);
        Object enum2063 = ((Field) term1109509).get((Object) null);
        term1106655 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1107199 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1106655, term1106655.getClass(), "kind", enum2063);
        setField(term1106655, term1106655.getClass(), "typeOfThis", term1107199);
        term1107307 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1107307, term1107307.getClass(), "kind", enum2063);
        setField(term1107307, term1107307.getClass(), "typeOfThis", null);
        Class<? extends Object> term1109801 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1109800 = ((Class) term1109801).getDeclaredField((String) "INTERFACE");
        ((Field) term1109800).setAccessible(true);
        Object enum2064 = ((Field) term1109800).get((Object) null);
        term1109499 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1109503 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1109499, term1109499.getClass(), "this$0", null);
        setField(term1109499, term1109499.getClass(), "call", null);
        setField(term1109499, term1109499.getClass(), "prototype", null);
        setField(term1109499, term1109499.getClass(), "kind", enum2064);
        setField(term1109503, term1109503.getClass(), "call", null);
        setField(term1109503, term1109503.getClass(), "prototype", null);
        setField(term1109503, term1109503.getClass(), "kind", null);
        setField(term1109503, term1109503.getClass(), "typeOfThis", null);
        setField(term1109503, term1109503.getClass(), "source", null);
        setField(term1109503, term1109503.getClass(), "implementedInterfaces", null);
        setField(term1109503, term1109503.getClass(), "subTypes", null);
        setField(term1109503, term1109503.getClass(), "templateTypeName", null);
        setField(term1109503, term1109503.getClass(), "className", null);
        setField(term1109503, term1109503.getClass(), "properties", null);
        setField(term1109503, term1109503.getClass(), "implicitPrototype", null);
        setBooleanField(term1109503, term1109503.getClass(), "nativeType", false);
        setBooleanField(term1109503, term1109503.getClass(), "visited", false);
        setField(term1109503, term1109503.getClass(), "docInfo", null);
        setBooleanField(term1109503, term1109503.getClass(), "unknown", false);
        setBooleanField(term1109503, term1109503.getClass(), "resolved", false);
        setField(term1109503, term1109503.getClass(), "resolveResult", null);
        setField(term1109503, term1109503.getClass(), "registry", null);
        setField(term1109499, term1109499.getClass(), "typeOfThis", term1109503);
        setField(term1109499, term1109499.getClass(), "source", null);
        setField(term1109499, term1109499.getClass(), "implementedInterfaces", null);
        setField(term1109499, term1109499.getClass(), "subTypes", null);
        setField(term1109499, term1109499.getClass(), "templateTypeName", null);
        setField(term1109499, term1109499.getClass(), "className", null);
        setField(term1109499, term1109499.getClass(), "properties", null);
        setField(term1109499, term1109499.getClass(), "implicitPrototype", null);
        setBooleanField(term1109499, term1109499.getClass(), "nativeType", false);
        setBooleanField(term1109499, term1109499.getClass(), "visited", false);
        setField(term1109499, term1109499.getClass(), "docInfo", null);
        setBooleanField(term1109499, term1109499.getClass(), "unknown", false);
        setBooleanField(term1109499, term1109499.getClass(), "resolved", false);
        setField(term1109499, term1109499.getClass(), "resolveResult", null);
        setField(term1109499, term1109499.getClass(), "registry", null);
        Class<? extends Object> term1110095 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1110094 = ((Class) term1110095).getDeclaredField((String) "INTERFACE");
        ((Field) term1110094).setAccessible(true);
        Object enum2065 = ((Field) term1110094).get((Object) null);
        term1109504 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1109504, term1109504.getClass(), "this$0", null);
        setField(term1109504, term1109504.getClass(), "call", null);
        setField(term1109504, term1109504.getClass(), "prototype", null);
        setField(term1109504, term1109504.getClass(), "kind", enum2065);
        setField(term1109504, term1109504.getClass(), "typeOfThis", null);
        setField(term1109504, term1109504.getClass(), "source", null);
        setField(term1109504, term1109504.getClass(), "implementedInterfaces", null);
        setField(term1109504, term1109504.getClass(), "subTypes", null);
        setField(term1109504, term1109504.getClass(), "templateTypeName", null);
        setField(term1109504, term1109504.getClass(), "className", null);
        setField(term1109504, term1109504.getClass(), "properties", null);
        setField(term1109504, term1109504.getClass(), "implicitPrototype", null);
        setBooleanField(term1109504, term1109504.getClass(), "nativeType", false);
        setBooleanField(term1109504, term1109504.getClass(), "visited", false);
        setField(term1109504, term1109504.getClass(), "docInfo", null);
        setBooleanField(term1109504, term1109504.getClass(), "unknown", false);
        setBooleanField(term1109504, term1109504.getClass(), "resolved", false);
        setField(term1109504, term1109504.getClass(), "resolveResult", null);
        setField(term1109504, term1109504.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1107307;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1106655, args);
        assertTrue(recursiveEquals(term1106655, term1109499));
        assertTrue(recursiveEquals(term1107307, term1109504));
        assertTrue(recursiveEquals(retValue, true));
    }

};


