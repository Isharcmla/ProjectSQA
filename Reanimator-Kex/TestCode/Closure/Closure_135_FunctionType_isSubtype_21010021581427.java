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

public class FunctionType_isSubtype_21010021581427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1846321;
     Object term1846671;
     Object term1847245;
     Object term1847250;

    public FunctionType_isSubtype_21010021581427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1847257 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1847256 = ((Class) term1847257).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1847256).setAccessible(true);
        Object enum3440 = ((Field) term1847256).get((Object) null);
        term1846321 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1846563 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1846321, term1846321.getClass(), "kind", enum3440);
        setField(term1846321, term1846321.getClass(), "call", term1846563);
        term1846671 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1846839 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1846671, term1846671.getClass(), "kind", enum3440);
        setField(term1846671, term1846671.getClass(), "call", term1846839);
        Class<? extends Object> term1847557 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1847556 = ((Class) term1847557).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1847556).setAccessible(true);
        Object enum3441 = ((Field) term1847556).get((Object) null);
        term1847245 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1847246 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1847245, term1847245.getClass(), "this$0", null);
        setField(term1847246, term1847246.getClass(), "parameters", null);
        setField(term1847246, term1847246.getClass(), "returnType", null);
        setBooleanField(term1847246, term1847246.getClass(), "resolved", false);
        setField(term1847246, term1847246.getClass(), "resolveResult", null);
        setField(term1847246, term1847246.getClass(), "registry", null);
        setField(term1847245, term1847245.getClass(), "call", term1847246);
        setField(term1847245, term1847245.getClass(), "prototype", null);
        setField(term1847245, term1847245.getClass(), "kind", enum3441);
        setField(term1847245, term1847245.getClass(), "typeOfThis", null);
        setField(term1847245, term1847245.getClass(), "source", null);
        setField(term1847245, term1847245.getClass(), "implementedInterfaces", null);
        setField(term1847245, term1847245.getClass(), "subTypes", null);
        setField(term1847245, term1847245.getClass(), "templateTypeName", null);
        setField(term1847245, term1847245.getClass(), "className", null);
        setField(term1847245, term1847245.getClass(), "properties", null);
        setField(term1847245, term1847245.getClass(), "implicitPrototype", null);
        setBooleanField(term1847245, term1847245.getClass(), "nativeType", false);
        setBooleanField(term1847245, term1847245.getClass(), "visited", false);
        setField(term1847245, term1847245.getClass(), "docInfo", null);
        setBooleanField(term1847245, term1847245.getClass(), "unknown", false);
        setBooleanField(term1847245, term1847245.getClass(), "resolved", false);
        setField(term1847245, term1847245.getClass(), "resolveResult", null);
        setField(term1847245, term1847245.getClass(), "registry", null);
        Class<? extends Object> term1847857 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1847856 = ((Class) term1847857).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1847856).setAccessible(true);
        Object enum3442 = ((Field) term1847856).get((Object) null);
        term1847250 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1847251 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1847250, term1847250.getClass(), "this$0", null);
        setField(term1847251, term1847251.getClass(), "parameters", null);
        setField(term1847251, term1847251.getClass(), "returnType", null);
        setBooleanField(term1847251, term1847251.getClass(), "resolved", false);
        setField(term1847251, term1847251.getClass(), "resolveResult", null);
        setField(term1847251, term1847251.getClass(), "registry", null);
        setField(term1847250, term1847250.getClass(), "call", term1847251);
        setField(term1847250, term1847250.getClass(), "prototype", null);
        setField(term1847250, term1847250.getClass(), "kind", enum3442);
        setField(term1847250, term1847250.getClass(), "typeOfThis", null);
        setField(term1847250, term1847250.getClass(), "source", null);
        setField(term1847250, term1847250.getClass(), "implementedInterfaces", null);
        setField(term1847250, term1847250.getClass(), "subTypes", null);
        setField(term1847250, term1847250.getClass(), "templateTypeName", null);
        setField(term1847250, term1847250.getClass(), "className", null);
        setField(term1847250, term1847250.getClass(), "properties", null);
        setField(term1847250, term1847250.getClass(), "implicitPrototype", null);
        setBooleanField(term1847250, term1847250.getClass(), "nativeType", false);
        setBooleanField(term1847250, term1847250.getClass(), "visited", false);
        setField(term1847250, term1847250.getClass(), "docInfo", null);
        setBooleanField(term1847250, term1847250.getClass(), "unknown", false);
        setBooleanField(term1847250, term1847250.getClass(), "resolved", false);
        setField(term1847250, term1847250.getClass(), "resolveResult", null);
        setField(term1847250, term1847250.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1846671;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1846321, args);
        assertTrue(recursiveEquals(term1846321, term1847245));
        assertTrue(recursiveEquals(term1846671, term1847250));
        assertTrue(recursiveEquals(retValue, true));
    }

};


