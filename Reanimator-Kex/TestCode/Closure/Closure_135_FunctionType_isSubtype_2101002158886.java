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

public class FunctionType_isSubtype_2101002158886 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term939126;
     Object term939878;
     Object term942163;
     Object term942169;

    public FunctionType_isSubtype_2101002158886() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term942176 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term942175 = ((Class) term942176).getDeclaredField((String) "INTERFACE");
        ((Field) term942175).setAccessible(true);
        Object enum1753 = ((Field) term942175).get((Object) null);
        term939126 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term939670 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term939770 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term939126, term939126.getClass(), "kind", enum1753);
        setField(term939670, term939670.getClass(), "kind", enum1753);
        setField(term939670, term939670.getClass(), "typeOfThis", term939770);
        setField(term939126, term939126.getClass(), "typeOfThis", term939670);
        Class<? extends Object> term942470 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term942469 = ((Class) term942470).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term942469).setAccessible(true);
        Object enum1754 = ((Field) term942469).get((Object) null);
        term939878 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term940060 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term939878, term939878.getClass(), "kind", enum1754);
        setField(term940060, term940060.getClass(), "kind", enum1754);
        setField(term940060, term940060.getClass(), "typeOfThis", null);
        setField(term939878, term939878.getClass(), "typeOfThis", term940060);
        Class<? extends Object> term942770 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term942769 = ((Class) term942770).getDeclaredField((String) "INTERFACE");
        ((Field) term942769).setAccessible(true);
        Object enum1755 = ((Field) term942769).get((Object) null);
        term942163 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term942167 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term942168 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term942163, term942163.getClass(), "this$0", null);
        setField(term942163, term942163.getClass(), "call", null);
        setField(term942163, term942163.getClass(), "prototype", null);
        setField(term942163, term942163.getClass(), "kind", enum1755);
        setField(term942167, term942167.getClass(), "call", null);
        setField(term942167, term942167.getClass(), "prototype", null);
        setField(term942167, term942167.getClass(), "kind", enum1755);
        setField(term942168, term942168.getClass(), "call", null);
        setField(term942168, term942168.getClass(), "prototype", null);
        setField(term942168, term942168.getClass(), "kind", null);
        setField(term942168, term942168.getClass(), "typeOfThis", null);
        setField(term942168, term942168.getClass(), "source", null);
        setField(term942168, term942168.getClass(), "implementedInterfaces", null);
        setField(term942168, term942168.getClass(), "subTypes", null);
        setField(term942168, term942168.getClass(), "templateTypeName", null);
        setField(term942168, term942168.getClass(), "className", null);
        setField(term942168, term942168.getClass(), "properties", null);
        setField(term942168, term942168.getClass(), "implicitPrototype", null);
        setBooleanField(term942168, term942168.getClass(), "nativeType", false);
        setBooleanField(term942168, term942168.getClass(), "visited", false);
        setField(term942168, term942168.getClass(), "docInfo", null);
        setBooleanField(term942168, term942168.getClass(), "unknown", false);
        setBooleanField(term942168, term942168.getClass(), "resolved", false);
        setField(term942168, term942168.getClass(), "resolveResult", null);
        setField(term942168, term942168.getClass(), "registry", null);
        setField(term942167, term942167.getClass(), "typeOfThis", term942168);
        setField(term942167, term942167.getClass(), "source", null);
        setField(term942167, term942167.getClass(), "implementedInterfaces", null);
        setField(term942167, term942167.getClass(), "subTypes", null);
        setField(term942167, term942167.getClass(), "templateTypeName", null);
        setField(term942167, term942167.getClass(), "className", null);
        setField(term942167, term942167.getClass(), "properties", null);
        setField(term942167, term942167.getClass(), "implicitPrototype", null);
        setBooleanField(term942167, term942167.getClass(), "nativeType", false);
        setBooleanField(term942167, term942167.getClass(), "visited", false);
        setField(term942167, term942167.getClass(), "docInfo", null);
        setBooleanField(term942167, term942167.getClass(), "unknown", false);
        setBooleanField(term942167, term942167.getClass(), "resolved", false);
        setField(term942167, term942167.getClass(), "resolveResult", null);
        setField(term942167, term942167.getClass(), "registry", null);
        setField(term942163, term942163.getClass(), "typeOfThis", term942167);
        setField(term942163, term942163.getClass(), "source", null);
        setField(term942163, term942163.getClass(), "implementedInterfaces", null);
        setField(term942163, term942163.getClass(), "subTypes", null);
        setField(term942163, term942163.getClass(), "templateTypeName", null);
        setField(term942163, term942163.getClass(), "className", null);
        setField(term942163, term942163.getClass(), "properties", null);
        setField(term942163, term942163.getClass(), "implicitPrototype", null);
        setBooleanField(term942163, term942163.getClass(), "nativeType", false);
        setBooleanField(term942163, term942163.getClass(), "visited", false);
        setField(term942163, term942163.getClass(), "docInfo", null);
        setBooleanField(term942163, term942163.getClass(), "unknown", false);
        setBooleanField(term942163, term942163.getClass(), "resolved", false);
        setField(term942163, term942163.getClass(), "resolveResult", null);
        setField(term942163, term942163.getClass(), "registry", null);
        Class<? extends Object> term943064 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term943063 = ((Class) term943064).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term943063).setAccessible(true);
        Object enum1756 = ((Field) term943063).get((Object) null);
        term942169 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term942173 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term942169, term942169.getClass(), "this$0", null);
        setField(term942169, term942169.getClass(), "call", null);
        setField(term942169, term942169.getClass(), "prototype", null);
        setField(term942169, term942169.getClass(), "kind", enum1756);
        setField(term942173, term942173.getClass(), "this$0", null);
        setField(term942173, term942173.getClass(), "call", null);
        setField(term942173, term942173.getClass(), "prototype", null);
        setField(term942173, term942173.getClass(), "kind", enum1756);
        setField(term942173, term942173.getClass(), "typeOfThis", null);
        setField(term942173, term942173.getClass(), "source", null);
        setField(term942173, term942173.getClass(), "implementedInterfaces", null);
        setField(term942173, term942173.getClass(), "subTypes", null);
        setField(term942173, term942173.getClass(), "templateTypeName", null);
        setField(term942173, term942173.getClass(), "className", null);
        setField(term942173, term942173.getClass(), "properties", null);
        setField(term942173, term942173.getClass(), "implicitPrototype", null);
        setBooleanField(term942173, term942173.getClass(), "nativeType", false);
        setBooleanField(term942173, term942173.getClass(), "visited", false);
        setField(term942173, term942173.getClass(), "docInfo", null);
        setBooleanField(term942173, term942173.getClass(), "unknown", false);
        setBooleanField(term942173, term942173.getClass(), "resolved", false);
        setField(term942173, term942173.getClass(), "resolveResult", null);
        setField(term942173, term942173.getClass(), "registry", null);
        setField(term942169, term942169.getClass(), "typeOfThis", term942173);
        setField(term942169, term942169.getClass(), "source", null);
        setField(term942169, term942169.getClass(), "implementedInterfaces", null);
        setField(term942169, term942169.getClass(), "subTypes", null);
        setField(term942169, term942169.getClass(), "templateTypeName", null);
        setField(term942169, term942169.getClass(), "className", null);
        setField(term942169, term942169.getClass(), "properties", null);
        setField(term942169, term942169.getClass(), "implicitPrototype", null);
        setBooleanField(term942169, term942169.getClass(), "nativeType", false);
        setBooleanField(term942169, term942169.getClass(), "visited", false);
        setField(term942169, term942169.getClass(), "docInfo", null);
        setBooleanField(term942169, term942169.getClass(), "unknown", false);
        setBooleanField(term942169, term942169.getClass(), "resolved", false);
        setField(term942169, term942169.getClass(), "resolveResult", null);
        setField(term942169, term942169.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term939878;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term939126, args);
        assertTrue(recursiveEquals(term939126, term942163));
        assertTrue(recursiveEquals(term939878, term942169));
        assertTrue(recursiveEquals(retValue, false));
    }

};


