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

public class FunctionType_isSubtype_2101002158417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term271206;
     Object term271462;
     Object term272301;
     Object term272305;

    public FunctionType_isSubtype_2101002158417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term272311 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term272310 = ((Class) term272311).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term272310).setAccessible(true);
        Object enum493 = ((Field) term272310).get((Object) null);
        term271206 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term271206, term271206.getClass(), "kind", enum493);
        Class<? extends Object> term272611 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term272610 = ((Class) term272611).getDeclaredField((String) "INTERFACE");
        ((Field) term272610).setAccessible(true);
        Object enum494 = ((Field) term272610).get((Object) null);
        term271462 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term271462, term271462.getClass(), "kind", enum494);
        Class<? extends Object> term272905 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term272904 = ((Class) term272905).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term272904).setAccessible(true);
        Object enum495 = ((Field) term272904).get((Object) null);
        term272301 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term272301, term272301.getClass(), "this$0", null);
        setField(term272301, term272301.getClass(), "call", null);
        setField(term272301, term272301.getClass(), "prototype", null);
        setField(term272301, term272301.getClass(), "kind", enum495);
        setField(term272301, term272301.getClass(), "typeOfThis", null);
        setField(term272301, term272301.getClass(), "source", null);
        setField(term272301, term272301.getClass(), "implementedInterfaces", null);
        setField(term272301, term272301.getClass(), "subTypes", null);
        setField(term272301, term272301.getClass(), "templateTypeName", null);
        setField(term272301, term272301.getClass(), "className", null);
        setField(term272301, term272301.getClass(), "properties", null);
        setField(term272301, term272301.getClass(), "implicitPrototype", null);
        setBooleanField(term272301, term272301.getClass(), "nativeType", false);
        setBooleanField(term272301, term272301.getClass(), "visited", false);
        setField(term272301, term272301.getClass(), "docInfo", null);
        setBooleanField(term272301, term272301.getClass(), "unknown", false);
        setBooleanField(term272301, term272301.getClass(), "resolved", false);
        setField(term272301, term272301.getClass(), "resolveResult", null);
        setField(term272301, term272301.getClass(), "registry", null);
        Class<? extends Object> term273205 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term273204 = ((Class) term273205).getDeclaredField((String) "INTERFACE");
        ((Field) term273204).setAccessible(true);
        Object enum496 = ((Field) term273204).get((Object) null);
        term272305 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term272305, term272305.getClass(), "this$0", null);
        setField(term272305, term272305.getClass(), "call", null);
        setField(term272305, term272305.getClass(), "prototype", null);
        setField(term272305, term272305.getClass(), "kind", enum496);
        setField(term272305, term272305.getClass(), "typeOfThis", null);
        setField(term272305, term272305.getClass(), "source", null);
        setField(term272305, term272305.getClass(), "implementedInterfaces", null);
        setField(term272305, term272305.getClass(), "subTypes", null);
        setField(term272305, term272305.getClass(), "templateTypeName", null);
        setField(term272305, term272305.getClass(), "className", null);
        setField(term272305, term272305.getClass(), "properties", null);
        setField(term272305, term272305.getClass(), "implicitPrototype", null);
        setBooleanField(term272305, term272305.getClass(), "nativeType", false);
        setBooleanField(term272305, term272305.getClass(), "visited", false);
        setField(term272305, term272305.getClass(), "docInfo", null);
        setBooleanField(term272305, term272305.getClass(), "unknown", false);
        setBooleanField(term272305, term272305.getClass(), "resolved", false);
        setField(term272305, term272305.getClass(), "resolveResult", null);
        setField(term272305, term272305.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term271462;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term271206, args);
        assertTrue(recursiveEquals(term271206, term272301));
        assertTrue(recursiveEquals(term271462, term272305));
        assertTrue(recursiveEquals(retValue, true));
    }

};


