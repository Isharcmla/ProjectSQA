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

public class FunctionType_isSubtype_2101002158933 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1019200;
     Object term1019650;
     Object term1020268;
     Object term1020274;

    public FunctionType_isSubtype_2101002158933() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1020281 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1020280 = ((Class) term1020281).getDeclaredField((String) "ORDINARY");
        ((Field) term1020280).setAccessible(true);
        Object enum1902 = ((Field) term1020280).get((Object) null);
        term1019200 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1019448 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1019542 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1019200, term1019200.getClass(), "kind", enum1902);
        setField(term1019200, term1019200.getClass(), "typeOfThis", term1019448);
        setField(term1019200, term1019200.getClass(), "call", term1019542);
        term1019650 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1019812 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term1019650, term1019650.getClass(), "kind", enum1902);
        setField(term1019650, term1019650.getClass(), "typeOfThis", term1019812);
        setField(term1019650, term1019650.getClass(), "call", null);
        Class<? extends Object> term1020572 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1020571 = ((Class) term1020572).getDeclaredField((String) "ORDINARY");
        ((Field) term1020571).setAccessible(true);
        Object enum1903 = ((Field) term1020571).get((Object) null);
        term1020268 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1020269 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term1020273 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1020268, term1020268.getClass(), "this$0", null);
        setField(term1020269, term1020269.getClass(), "parameters", null);
        setField(term1020269, term1020269.getClass(), "returnType", null);
        setBooleanField(term1020269, term1020269.getClass(), "resolved", false);
        setField(term1020269, term1020269.getClass(), "resolveResult", null);
        setField(term1020269, term1020269.getClass(), "registry", null);
        setField(term1020268, term1020268.getClass(), "call", term1020269);
        setField(term1020268, term1020268.getClass(), "prototype", null);
        setField(term1020268, term1020268.getClass(), "kind", enum1903);
        setField(term1020273, term1020273.getClass(), "call", null);
        setField(term1020273, term1020273.getClass(), "prototype", null);
        setField(term1020273, term1020273.getClass(), "kind", null);
        setField(term1020273, term1020273.getClass(), "typeOfThis", null);
        setField(term1020273, term1020273.getClass(), "source", null);
        setField(term1020273, term1020273.getClass(), "implementedInterfaces", null);
        setField(term1020273, term1020273.getClass(), "subTypes", null);
        setField(term1020273, term1020273.getClass(), "templateTypeName", null);
        setField(term1020273, term1020273.getClass(), "className", null);
        setField(term1020273, term1020273.getClass(), "properties", null);
        setField(term1020273, term1020273.getClass(), "implicitPrototype", null);
        setBooleanField(term1020273, term1020273.getClass(), "nativeType", false);
        setBooleanField(term1020273, term1020273.getClass(), "visited", false);
        setField(term1020273, term1020273.getClass(), "docInfo", null);
        setBooleanField(term1020273, term1020273.getClass(), "unknown", false);
        setBooleanField(term1020273, term1020273.getClass(), "resolved", false);
        setField(term1020273, term1020273.getClass(), "resolveResult", null);
        setField(term1020273, term1020273.getClass(), "registry", null);
        setField(term1020268, term1020268.getClass(), "typeOfThis", term1020273);
        setField(term1020268, term1020268.getClass(), "source", null);
        setField(term1020268, term1020268.getClass(), "implementedInterfaces", null);
        setField(term1020268, term1020268.getClass(), "subTypes", null);
        setField(term1020268, term1020268.getClass(), "templateTypeName", null);
        setField(term1020268, term1020268.getClass(), "className", null);
        setField(term1020268, term1020268.getClass(), "properties", null);
        setField(term1020268, term1020268.getClass(), "implicitPrototype", null);
        setBooleanField(term1020268, term1020268.getClass(), "nativeType", false);
        setBooleanField(term1020268, term1020268.getClass(), "visited", false);
        setField(term1020268, term1020268.getClass(), "docInfo", null);
        setBooleanField(term1020268, term1020268.getClass(), "unknown", false);
        setBooleanField(term1020268, term1020268.getClass(), "resolved", false);
        setField(term1020268, term1020268.getClass(), "resolveResult", null);
        setField(term1020268, term1020268.getClass(), "registry", null);
        Class<? extends Object> term1020863 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1020862 = ((Class) term1020863).getDeclaredField((String) "ORDINARY");
        ((Field) term1020862).setAccessible(true);
        Object enum1904 = ((Field) term1020862).get((Object) null);
        term1020274 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1020278 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term1020274, term1020274.getClass(), "this$0", null);
        setField(term1020274, term1020274.getClass(), "call", null);
        setField(term1020274, term1020274.getClass(), "prototype", null);
        setField(term1020274, term1020274.getClass(), "kind", enum1904);
        setField(term1020278, term1020278.getClass(), "leastSupertypeVisitor", null);
        setField(term1020278, term1020278.getClass(), "greatestSubtypeVisitor", null);
        setField(term1020278, term1020278.getClass(), "call", null);
        setField(term1020278, term1020278.getClass(), "prototype", null);
        setField(term1020278, term1020278.getClass(), "kind", null);
        setField(term1020278, term1020278.getClass(), "typeOfThis", null);
        setField(term1020278, term1020278.getClass(), "source", null);
        setField(term1020278, term1020278.getClass(), "implementedInterfaces", null);
        setField(term1020278, term1020278.getClass(), "subTypes", null);
        setField(term1020278, term1020278.getClass(), "templateTypeName", null);
        setField(term1020278, term1020278.getClass(), "className", null);
        setField(term1020278, term1020278.getClass(), "properties", null);
        setField(term1020278, term1020278.getClass(), "implicitPrototype", null);
        setBooleanField(term1020278, term1020278.getClass(), "nativeType", false);
        setBooleanField(term1020278, term1020278.getClass(), "visited", false);
        setField(term1020278, term1020278.getClass(), "docInfo", null);
        setBooleanField(term1020278, term1020278.getClass(), "unknown", false);
        setBooleanField(term1020278, term1020278.getClass(), "resolved", false);
        setField(term1020278, term1020278.getClass(), "resolveResult", null);
        setField(term1020278, term1020278.getClass(), "registry", null);
        setField(term1020274, term1020274.getClass(), "typeOfThis", term1020278);
        setField(term1020274, term1020274.getClass(), "source", null);
        setField(term1020274, term1020274.getClass(), "implementedInterfaces", null);
        setField(term1020274, term1020274.getClass(), "subTypes", null);
        setField(term1020274, term1020274.getClass(), "templateTypeName", null);
        setField(term1020274, term1020274.getClass(), "className", null);
        setField(term1020274, term1020274.getClass(), "properties", null);
        setField(term1020274, term1020274.getClass(), "implicitPrototype", null);
        setBooleanField(term1020274, term1020274.getClass(), "nativeType", false);
        setBooleanField(term1020274, term1020274.getClass(), "visited", false);
        setField(term1020274, term1020274.getClass(), "docInfo", null);
        setBooleanField(term1020274, term1020274.getClass(), "unknown", false);
        setBooleanField(term1020274, term1020274.getClass(), "resolved", false);
        setField(term1020274, term1020274.getClass(), "resolveResult", null);
        setField(term1020274, term1020274.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1019650;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1019200, args);
        assertTrue(recursiveEquals(term1019200, term1020268));
        assertTrue(recursiveEquals(term1019650, term1020274));
        assertTrue(recursiveEquals(retValue, false));
    }

};


