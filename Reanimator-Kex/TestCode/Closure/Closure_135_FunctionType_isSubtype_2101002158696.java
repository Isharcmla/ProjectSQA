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

public class FunctionType_isSubtype_2101002158696 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term636554;
     Object term636812;
     Object term639650;
     Object term639654;

    public FunctionType_isSubtype_2101002158696() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term639660 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term639659 = ((Class) term639660).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term639659).setAccessible(true);
        Object enum1187 = ((Field) term639659).get((Object) null);
        term636554 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term636554, term636554.getClass(), "kind", enum1187);
        Class<? extends Object> term639960 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term639959 = ((Class) term639960).getDeclaredField((String) "INTERFACE");
        ((Field) term639959).setAccessible(true);
        Object enum1188 = ((Field) term639959).get((Object) null);
        term636812 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term636812, term636812.getClass(), "kind", enum1188);
        Class<? extends Object> term640254 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term640253 = ((Class) term640254).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term640253).setAccessible(true);
        Object enum1189 = ((Field) term640253).get((Object) null);
        term639650 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term639650, term639650.getClass(), "this$0", null);
        setField(term639650, term639650.getClass(), "call", null);
        setField(term639650, term639650.getClass(), "prototype", null);
        setField(term639650, term639650.getClass(), "kind", enum1189);
        setField(term639650, term639650.getClass(), "typeOfThis", null);
        setField(term639650, term639650.getClass(), "source", null);
        setField(term639650, term639650.getClass(), "implementedInterfaces", null);
        setField(term639650, term639650.getClass(), "subTypes", null);
        setField(term639650, term639650.getClass(), "templateTypeName", null);
        setField(term639650, term639650.getClass(), "className", null);
        setField(term639650, term639650.getClass(), "properties", null);
        setField(term639650, term639650.getClass(), "implicitPrototype", null);
        setBooleanField(term639650, term639650.getClass(), "nativeType", false);
        setBooleanField(term639650, term639650.getClass(), "visited", false);
        setField(term639650, term639650.getClass(), "docInfo", null);
        setBooleanField(term639650, term639650.getClass(), "unknown", false);
        setBooleanField(term639650, term639650.getClass(), "resolved", false);
        setField(term639650, term639650.getClass(), "resolveResult", null);
        setField(term639650, term639650.getClass(), "registry", null);
        Class<? extends Object> term640554 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term640553 = ((Class) term640554).getDeclaredField((String) "INTERFACE");
        ((Field) term640553).setAccessible(true);
        Object enum1190 = ((Field) term640553).get((Object) null);
        term639654 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term639654, term639654.getClass(), "call", null);
        setField(term639654, term639654.getClass(), "prototype", null);
        setField(term639654, term639654.getClass(), "kind", enum1190);
        setField(term639654, term639654.getClass(), "typeOfThis", null);
        setField(term639654, term639654.getClass(), "source", null);
        setField(term639654, term639654.getClass(), "implementedInterfaces", null);
        setField(term639654, term639654.getClass(), "subTypes", null);
        setField(term639654, term639654.getClass(), "templateTypeName", null);
        setField(term639654, term639654.getClass(), "className", null);
        setField(term639654, term639654.getClass(), "properties", null);
        setField(term639654, term639654.getClass(), "implicitPrototype", null);
        setBooleanField(term639654, term639654.getClass(), "nativeType", false);
        setBooleanField(term639654, term639654.getClass(), "visited", false);
        setField(term639654, term639654.getClass(), "docInfo", null);
        setBooleanField(term639654, term639654.getClass(), "unknown", false);
        setBooleanField(term639654, term639654.getClass(), "resolved", false);
        setField(term639654, term639654.getClass(), "resolveResult", null);
        setField(term639654, term639654.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term636812;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term636554, args);
        assertTrue(recursiveEquals(term636554, term639650));
        assertTrue(recursiveEquals(term636812, term639654));
        assertTrue(recursiveEquals(retValue, true));
    }

};


