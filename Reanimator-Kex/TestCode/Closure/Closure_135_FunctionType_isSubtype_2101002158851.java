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

public class FunctionType_isSubtype_2101002158851 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term878323;
     Object term878781;
     Object term880129;
     Object term880135;

    public FunctionType_isSubtype_2101002158851() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term880145 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term880144 = ((Class) term880145).getDeclaredField((String) "ORDINARY");
        ((Field) term880144).setAccessible(true);
        Object enum1639 = ((Field) term880144).get((Object) null);
        term878323 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term878579 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term878673 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term878323, term878323.getClass(), "kind", enum1639);
        setField(term878579, term878579.getClass(), "kind", enum1639);
        setField(term878323, term878323.getClass(), "typeOfThis", term878579);
        setField(term878323, term878323.getClass(), "call", term878673);
        Class<? extends Object> term880436 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term880435 = ((Class) term880436).getDeclaredField((String) "INTERFACE");
        ((Field) term880435).setAccessible(true);
        Object enum1640 = ((Field) term880435).get((Object) null);
        term878781 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term878963 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term878781, term878781.getClass(), "kind", enum1639);
        setField(term878963, term878963.getClass(), "kind", enum1640);
        setField(term878781, term878781.getClass(), "typeOfThis", term878963);
        setField(term878781, term878781.getClass(), "call", null);
        Class<? extends Object> term880730 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term880729 = ((Class) term880730).getDeclaredField((String) "ORDINARY");
        ((Field) term880729).setAccessible(true);
        Object enum1641 = ((Field) term880729).get((Object) null);
        term880129 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term880130 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term880134 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term880129, term880129.getClass(), "this$0", null);
        setField(term880130, term880130.getClass(), "parameters", null);
        setField(term880130, term880130.getClass(), "returnType", null);
        setBooleanField(term880130, term880130.getClass(), "resolved", false);
        setField(term880130, term880130.getClass(), "resolveResult", null);
        setField(term880130, term880130.getClass(), "registry", null);
        setField(term880129, term880129.getClass(), "call", term880130);
        setField(term880129, term880129.getClass(), "prototype", null);
        setField(term880129, term880129.getClass(), "kind", enum1641);
        setField(term880134, term880134.getClass(), "this$0", null);
        setField(term880134, term880134.getClass(), "call", null);
        setField(term880134, term880134.getClass(), "prototype", null);
        setField(term880134, term880134.getClass(), "kind", enum1641);
        setField(term880134, term880134.getClass(), "typeOfThis", null);
        setField(term880134, term880134.getClass(), "source", null);
        setField(term880134, term880134.getClass(), "implementedInterfaces", null);
        setField(term880134, term880134.getClass(), "subTypes", null);
        setField(term880134, term880134.getClass(), "templateTypeName", null);
        setField(term880134, term880134.getClass(), "className", null);
        setField(term880134, term880134.getClass(), "properties", null);
        setField(term880134, term880134.getClass(), "implicitPrototype", null);
        setBooleanField(term880134, term880134.getClass(), "nativeType", false);
        setBooleanField(term880134, term880134.getClass(), "visited", false);
        setField(term880134, term880134.getClass(), "docInfo", null);
        setBooleanField(term880134, term880134.getClass(), "unknown", false);
        setBooleanField(term880134, term880134.getClass(), "resolved", false);
        setField(term880134, term880134.getClass(), "resolveResult", null);
        setField(term880134, term880134.getClass(), "registry", null);
        setField(term880129, term880129.getClass(), "typeOfThis", term880134);
        setField(term880129, term880129.getClass(), "source", null);
        setField(term880129, term880129.getClass(), "implementedInterfaces", null);
        setField(term880129, term880129.getClass(), "subTypes", null);
        setField(term880129, term880129.getClass(), "templateTypeName", null);
        setField(term880129, term880129.getClass(), "className", null);
        setField(term880129, term880129.getClass(), "properties", null);
        setField(term880129, term880129.getClass(), "implicitPrototype", null);
        setBooleanField(term880129, term880129.getClass(), "nativeType", false);
        setBooleanField(term880129, term880129.getClass(), "visited", false);
        setField(term880129, term880129.getClass(), "docInfo", null);
        setBooleanField(term880129, term880129.getClass(), "unknown", false);
        setBooleanField(term880129, term880129.getClass(), "resolved", false);
        setField(term880129, term880129.getClass(), "resolveResult", null);
        setField(term880129, term880129.getClass(), "registry", null);
        Class<? extends Object> term881021 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term881020 = ((Class) term881021).getDeclaredField((String) "ORDINARY");
        ((Field) term881020).setAccessible(true);
        Object enum1642 = ((Field) term881020).get((Object) null);
        Class<? extends Object> term881312 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term881311 = ((Class) term881312).getDeclaredField((String) "INTERFACE");
        ((Field) term881311).setAccessible(true);
        Object enum1643 = ((Field) term881311).get((Object) null);
        term880135 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term880139 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term880135, term880135.getClass(), "this$0", null);
        setField(term880135, term880135.getClass(), "call", null);
        setField(term880135, term880135.getClass(), "prototype", null);
        setField(term880135, term880135.getClass(), "kind", enum1642);
        setField(term880139, term880139.getClass(), "this$0", null);
        setField(term880139, term880139.getClass(), "call", null);
        setField(term880139, term880139.getClass(), "prototype", null);
        setField(term880139, term880139.getClass(), "kind", enum1643);
        setField(term880139, term880139.getClass(), "typeOfThis", null);
        setField(term880139, term880139.getClass(), "source", null);
        setField(term880139, term880139.getClass(), "implementedInterfaces", null);
        setField(term880139, term880139.getClass(), "subTypes", null);
        setField(term880139, term880139.getClass(), "templateTypeName", null);
        setField(term880139, term880139.getClass(), "className", null);
        setField(term880139, term880139.getClass(), "properties", null);
        setField(term880139, term880139.getClass(), "implicitPrototype", null);
        setBooleanField(term880139, term880139.getClass(), "nativeType", false);
        setBooleanField(term880139, term880139.getClass(), "visited", false);
        setField(term880139, term880139.getClass(), "docInfo", null);
        setBooleanField(term880139, term880139.getClass(), "unknown", false);
        setBooleanField(term880139, term880139.getClass(), "resolved", false);
        setField(term880139, term880139.getClass(), "resolveResult", null);
        setField(term880139, term880139.getClass(), "registry", null);
        setField(term880135, term880135.getClass(), "typeOfThis", term880139);
        setField(term880135, term880135.getClass(), "source", null);
        setField(term880135, term880135.getClass(), "implementedInterfaces", null);
        setField(term880135, term880135.getClass(), "subTypes", null);
        setField(term880135, term880135.getClass(), "templateTypeName", null);
        setField(term880135, term880135.getClass(), "className", null);
        setField(term880135, term880135.getClass(), "properties", null);
        setField(term880135, term880135.getClass(), "implicitPrototype", null);
        setBooleanField(term880135, term880135.getClass(), "nativeType", false);
        setBooleanField(term880135, term880135.getClass(), "visited", false);
        setField(term880135, term880135.getClass(), "docInfo", null);
        setBooleanField(term880135, term880135.getClass(), "unknown", false);
        setBooleanField(term880135, term880135.getClass(), "resolved", false);
        setField(term880135, term880135.getClass(), "resolveResult", null);
        setField(term880135, term880135.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term878781;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term878323, args);
        assertTrue(recursiveEquals(term878323, term880129));
        assertTrue(recursiveEquals(term878781, term880135));
        assertTrue(recursiveEquals(retValue, false));
    }

};


