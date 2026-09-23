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

public class FunctionType_isSubtype_21010021581094 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1275857;
     Object term1276609;
     Object term1279081;
     Object term1279087;

    public FunctionType_isSubtype_21010021581094() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1279094 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1279093 = ((Class) term1279094).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1279093).setAccessible(true);
        Object enum2382 = ((Field) term1279093).get((Object) null);
        Class<? extends Object> term1279394 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1279393 = ((Class) term1279394).getDeclaredField((String) "INTERFACE");
        ((Field) term1279393).setAccessible(true);
        Object enum2383 = ((Field) term1279393).get((Object) null);
        term1275857 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1276401 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term1276881 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1275857, term1275857.getClass(), "kind", enum2382);
        setField(term1276401, term1276401.getClass(), "kind", enum2382);
        setField(term1276881, term1276881.getClass(), "kind", enum2383);
        setField(term1276881, term1276881.getClass(), "typeOfThis", null);
        setField(term1276401, term1276401.getClass(), "typeOfThis", term1276881);
        setField(term1275857, term1275857.getClass(), "typeOfThis", term1276401);
        term1276609 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term1276609, term1276609.getClass(), "kind", enum2382);
        setField(term1276609, term1276609.getClass(), "typeOfThis", term1276881);
        Class<? extends Object> term1279688 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1279687 = ((Class) term1279688).getDeclaredField((String) "INTERFACE");
        ((Field) term1279687).setAccessible(true);
        Object enum2384 = ((Field) term1279687).get((Object) null);
        term1279081 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1279085 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term1279086 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1279081, term1279081.getClass(), "this$0", null);
        setField(term1279081, term1279081.getClass(), "call", null);
        setField(term1279081, term1279081.getClass(), "prototype", null);
        setField(term1279081, term1279081.getClass(), "kind", enum2384);
        setField(term1279085, term1279085.getClass(), "leastSupertypeVisitor", null);
        setField(term1279085, term1279085.getClass(), "greatestSubtypeVisitor", null);
        setField(term1279085, term1279085.getClass(), "call", null);
        setField(term1279085, term1279085.getClass(), "prototype", null);
        setField(term1279085, term1279085.getClass(), "kind", enum2384);
        setField(term1279086, term1279086.getClass(), "call", null);
        setField(term1279086, term1279086.getClass(), "prototype", null);
        setField(term1279086, term1279086.getClass(), "kind", enum2384);
        setField(term1279086, term1279086.getClass(), "typeOfThis", null);
        setField(term1279086, term1279086.getClass(), "source", null);
        setField(term1279086, term1279086.getClass(), "implementedInterfaces", null);
        setField(term1279086, term1279086.getClass(), "subTypes", null);
        setField(term1279086, term1279086.getClass(), "templateTypeName", null);
        setField(term1279086, term1279086.getClass(), "className", null);
        setField(term1279086, term1279086.getClass(), "properties", null);
        setField(term1279086, term1279086.getClass(), "implicitPrototype", null);
        setBooleanField(term1279086, term1279086.getClass(), "nativeType", false);
        setBooleanField(term1279086, term1279086.getClass(), "visited", false);
        setField(term1279086, term1279086.getClass(), "docInfo", null);
        setBooleanField(term1279086, term1279086.getClass(), "unknown", false);
        setBooleanField(term1279086, term1279086.getClass(), "resolved", false);
        setField(term1279086, term1279086.getClass(), "resolveResult", null);
        setField(term1279086, term1279086.getClass(), "registry", null);
        setField(term1279085, term1279085.getClass(), "typeOfThis", term1279086);
        setField(term1279085, term1279085.getClass(), "source", null);
        setField(term1279085, term1279085.getClass(), "implementedInterfaces", null);
        setField(term1279085, term1279085.getClass(), "subTypes", null);
        setField(term1279085, term1279085.getClass(), "templateTypeName", null);
        setField(term1279085, term1279085.getClass(), "className", null);
        setField(term1279085, term1279085.getClass(), "properties", null);
        setField(term1279085, term1279085.getClass(), "implicitPrototype", null);
        setBooleanField(term1279085, term1279085.getClass(), "nativeType", false);
        setBooleanField(term1279085, term1279085.getClass(), "visited", false);
        setField(term1279085, term1279085.getClass(), "docInfo", null);
        setBooleanField(term1279085, term1279085.getClass(), "unknown", false);
        setBooleanField(term1279085, term1279085.getClass(), "resolved", false);
        setField(term1279085, term1279085.getClass(), "resolveResult", null);
        setField(term1279085, term1279085.getClass(), "registry", null);
        setField(term1279081, term1279081.getClass(), "typeOfThis", term1279085);
        setField(term1279081, term1279081.getClass(), "source", null);
        setField(term1279081, term1279081.getClass(), "implementedInterfaces", null);
        setField(term1279081, term1279081.getClass(), "subTypes", null);
        setField(term1279081, term1279081.getClass(), "templateTypeName", null);
        setField(term1279081, term1279081.getClass(), "className", null);
        setField(term1279081, term1279081.getClass(), "properties", null);
        setField(term1279081, term1279081.getClass(), "implicitPrototype", null);
        setBooleanField(term1279081, term1279081.getClass(), "nativeType", false);
        setBooleanField(term1279081, term1279081.getClass(), "visited", false);
        setField(term1279081, term1279081.getClass(), "docInfo", null);
        setBooleanField(term1279081, term1279081.getClass(), "unknown", false);
        setBooleanField(term1279081, term1279081.getClass(), "resolved", false);
        setField(term1279081, term1279081.getClass(), "resolveResult", null);
        setField(term1279081, term1279081.getClass(), "registry", null);
        Class<? extends Object> term1279982 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1279981 = ((Class) term1279982).getDeclaredField((String) "INTERFACE");
        ((Field) term1279981).setAccessible(true);
        Object enum2385 = ((Field) term1279981).get((Object) null);
        term1279087 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1279091 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1279087, term1279087.getClass(), "this$0", null);
        setField(term1279087, term1279087.getClass(), "call", null);
        setField(term1279087, term1279087.getClass(), "prototype", null);
        setField(term1279087, term1279087.getClass(), "kind", enum2385);
        setField(term1279091, term1279091.getClass(), "call", null);
        setField(term1279091, term1279091.getClass(), "prototype", null);
        setField(term1279091, term1279091.getClass(), "kind", enum2385);
        setField(term1279091, term1279091.getClass(), "typeOfThis", null);
        setField(term1279091, term1279091.getClass(), "source", null);
        setField(term1279091, term1279091.getClass(), "implementedInterfaces", null);
        setField(term1279091, term1279091.getClass(), "subTypes", null);
        setField(term1279091, term1279091.getClass(), "templateTypeName", null);
        setField(term1279091, term1279091.getClass(), "className", null);
        setField(term1279091, term1279091.getClass(), "properties", null);
        setField(term1279091, term1279091.getClass(), "implicitPrototype", null);
        setBooleanField(term1279091, term1279091.getClass(), "nativeType", false);
        setBooleanField(term1279091, term1279091.getClass(), "visited", false);
        setField(term1279091, term1279091.getClass(), "docInfo", null);
        setBooleanField(term1279091, term1279091.getClass(), "unknown", false);
        setBooleanField(term1279091, term1279091.getClass(), "resolved", false);
        setField(term1279091, term1279091.getClass(), "resolveResult", null);
        setField(term1279091, term1279091.getClass(), "registry", null);
        setField(term1279087, term1279087.getClass(), "typeOfThis", term1279091);
        setField(term1279087, term1279087.getClass(), "source", null);
        setField(term1279087, term1279087.getClass(), "implementedInterfaces", null);
        setField(term1279087, term1279087.getClass(), "subTypes", null);
        setField(term1279087, term1279087.getClass(), "templateTypeName", null);
        setField(term1279087, term1279087.getClass(), "className", null);
        setField(term1279087, term1279087.getClass(), "properties", null);
        setField(term1279087, term1279087.getClass(), "implicitPrototype", null);
        setBooleanField(term1279087, term1279087.getClass(), "nativeType", false);
        setBooleanField(term1279087, term1279087.getClass(), "visited", false);
        setField(term1279087, term1279087.getClass(), "docInfo", null);
        setBooleanField(term1279087, term1279087.getClass(), "unknown", false);
        setBooleanField(term1279087, term1279087.getClass(), "resolved", false);
        setField(term1279087, term1279087.getClass(), "resolveResult", null);
        setField(term1279087, term1279087.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1276609;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1275857, args);
        assertTrue(recursiveEquals(term1275857, term1279081));
        assertTrue(recursiveEquals(term1276609, term1279087));
        assertTrue(recursiveEquals(retValue, true));
    }

};


