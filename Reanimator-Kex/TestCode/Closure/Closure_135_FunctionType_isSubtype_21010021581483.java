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

public class FunctionType_isSubtype_21010021581483 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1940945;
     Object term1941597;
     Object term1942788;
     Object term1942793;

    public FunctionType_isSubtype_21010021581483() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1942800 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1942799 = ((Class) term1942800).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1942799).setAccessible(true);
        Object enum3617 = ((Field) term1942799).get((Object) null);
        Class<? extends Object> term1943100 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1943099 = ((Class) term1943100).getDeclaredField((String) "INTERFACE");
        ((Field) term1943099).setAccessible(true);
        Object enum3618 = ((Field) term1943099).get((Object) null);
        term1940945 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1941489 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1940945, term1940945.getClass(), "kind", enum3617);
        setField(term1941489, term1941489.getClass(), "kind", enum3618);
        setField(term1940945, term1940945.getClass(), "typeOfThis", term1941489);
        Class<? extends Object> term1943394 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1943393 = ((Class) term1943394).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1943393).setAccessible(true);
        Object enum3619 = ((Field) term1943393).get((Object) null);
        term1941597 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1941779 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1941597, term1941597.getClass(), "kind", enum3619);
        setField(term1941779, term1941779.getClass(), "kind", enum3619);
        setField(term1941597, term1941597.getClass(), "typeOfThis", term1941779);
        Class<? extends Object> term1943694 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1943693 = ((Class) term1943694).getDeclaredField((String) "INTERFACE");
        ((Field) term1943693).setAccessible(true);
        Object enum3620 = ((Field) term1943693).get((Object) null);
        term1942788 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1942792 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1942788, term1942788.getClass(), "this$0", null);
        setField(term1942788, term1942788.getClass(), "call", null);
        setField(term1942788, term1942788.getClass(), "prototype", null);
        setField(term1942788, term1942788.getClass(), "kind", enum3620);
        setField(term1942792, term1942792.getClass(), "call", null);
        setField(term1942792, term1942792.getClass(), "prototype", null);
        setField(term1942792, term1942792.getClass(), "kind", enum3620);
        setField(term1942792, term1942792.getClass(), "typeOfThis", null);
        setField(term1942792, term1942792.getClass(), "source", null);
        setField(term1942792, term1942792.getClass(), "implementedInterfaces", null);
        setField(term1942792, term1942792.getClass(), "subTypes", null);
        setField(term1942792, term1942792.getClass(), "templateTypeName", null);
        setField(term1942792, term1942792.getClass(), "className", null);
        setField(term1942792, term1942792.getClass(), "properties", null);
        setField(term1942792, term1942792.getClass(), "implicitPrototype", null);
        setBooleanField(term1942792, term1942792.getClass(), "nativeType", false);
        setBooleanField(term1942792, term1942792.getClass(), "visited", false);
        setField(term1942792, term1942792.getClass(), "docInfo", null);
        setBooleanField(term1942792, term1942792.getClass(), "unknown", false);
        setBooleanField(term1942792, term1942792.getClass(), "resolved", false);
        setField(term1942792, term1942792.getClass(), "resolveResult", null);
        setField(term1942792, term1942792.getClass(), "registry", null);
        setField(term1942788, term1942788.getClass(), "typeOfThis", term1942792);
        setField(term1942788, term1942788.getClass(), "source", null);
        setField(term1942788, term1942788.getClass(), "implementedInterfaces", null);
        setField(term1942788, term1942788.getClass(), "subTypes", null);
        setField(term1942788, term1942788.getClass(), "templateTypeName", null);
        setField(term1942788, term1942788.getClass(), "className", null);
        setField(term1942788, term1942788.getClass(), "properties", null);
        setField(term1942788, term1942788.getClass(), "implicitPrototype", null);
        setBooleanField(term1942788, term1942788.getClass(), "nativeType", false);
        setBooleanField(term1942788, term1942788.getClass(), "visited", false);
        setField(term1942788, term1942788.getClass(), "docInfo", null);
        setBooleanField(term1942788, term1942788.getClass(), "unknown", false);
        setBooleanField(term1942788, term1942788.getClass(), "resolved", false);
        setField(term1942788, term1942788.getClass(), "resolveResult", null);
        setField(term1942788, term1942788.getClass(), "registry", null);
        Class<? extends Object> term1943988 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1943987 = ((Class) term1943988).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1943987).setAccessible(true);
        Object enum3621 = ((Field) term1943987).get((Object) null);
        term1942793 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1942797 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1942793, term1942793.getClass(), "this$0", null);
        setField(term1942793, term1942793.getClass(), "call", null);
        setField(term1942793, term1942793.getClass(), "prototype", null);
        setField(term1942793, term1942793.getClass(), "kind", enum3621);
        setField(term1942797, term1942797.getClass(), "this$0", null);
        setField(term1942797, term1942797.getClass(), "call", null);
        setField(term1942797, term1942797.getClass(), "prototype", null);
        setField(term1942797, term1942797.getClass(), "kind", enum3621);
        setField(term1942797, term1942797.getClass(), "typeOfThis", null);
        setField(term1942797, term1942797.getClass(), "source", null);
        setField(term1942797, term1942797.getClass(), "implementedInterfaces", null);
        setField(term1942797, term1942797.getClass(), "subTypes", null);
        setField(term1942797, term1942797.getClass(), "templateTypeName", null);
        setField(term1942797, term1942797.getClass(), "className", null);
        setField(term1942797, term1942797.getClass(), "properties", null);
        setField(term1942797, term1942797.getClass(), "implicitPrototype", null);
        setBooleanField(term1942797, term1942797.getClass(), "nativeType", false);
        setBooleanField(term1942797, term1942797.getClass(), "visited", false);
        setField(term1942797, term1942797.getClass(), "docInfo", null);
        setBooleanField(term1942797, term1942797.getClass(), "unknown", false);
        setBooleanField(term1942797, term1942797.getClass(), "resolved", false);
        setField(term1942797, term1942797.getClass(), "resolveResult", null);
        setField(term1942797, term1942797.getClass(), "registry", null);
        setField(term1942793, term1942793.getClass(), "typeOfThis", term1942797);
        setField(term1942793, term1942793.getClass(), "source", null);
        setField(term1942793, term1942793.getClass(), "implementedInterfaces", null);
        setField(term1942793, term1942793.getClass(), "subTypes", null);
        setField(term1942793, term1942793.getClass(), "templateTypeName", null);
        setField(term1942793, term1942793.getClass(), "className", null);
        setField(term1942793, term1942793.getClass(), "properties", null);
        setField(term1942793, term1942793.getClass(), "implicitPrototype", null);
        setBooleanField(term1942793, term1942793.getClass(), "nativeType", false);
        setBooleanField(term1942793, term1942793.getClass(), "visited", false);
        setField(term1942793, term1942793.getClass(), "docInfo", null);
        setBooleanField(term1942793, term1942793.getClass(), "unknown", false);
        setBooleanField(term1942793, term1942793.getClass(), "resolved", false);
        setField(term1942793, term1942793.getClass(), "resolveResult", null);
        setField(term1942793, term1942793.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1941597;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1940945, args);
        assertTrue(recursiveEquals(term1940945, term1942788));
        assertTrue(recursiveEquals(term1941597, term1942793));
        assertTrue(recursiveEquals(retValue, false));
    }

};


