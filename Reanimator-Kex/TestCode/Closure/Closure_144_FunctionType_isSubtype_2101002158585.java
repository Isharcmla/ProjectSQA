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

public class FunctionType_isSubtype_2101002158585 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term553954;
     Object term554414;
     Object term555430;
     Object term555436;

    public FunctionType_isSubtype_2101002158585() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term555443 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term555442 = ((Class) term555443).getDeclaredField((String) "ORDINARY");
        ((Field) term555442).setAccessible(true);
        Object enum1010 = ((Field) term555442).get((Object) null);
        term553954 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term554210 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term554304 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term553954, term553954.getClass(), "kind", enum1010);
        setField(term553954, term553954.getClass(), "typeOfThis", term554210);
        setField(term553954, term553954.getClass(), "call", term554304);
        Class<? extends Object> term555734 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term555733 = ((Class) term555734).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term555733).setAccessible(true);
        Object enum1011 = ((Field) term555733).get((Object) null);
        term554414 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term554654 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term554414, term554414.getClass(), "kind", enum1011);
        setField(term554414, term554414.getClass(), "typeOfThis", term554654);
        setField(term554414, term554414.getClass(), "call", null);
        Class<? extends Object> term556034 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term556033 = ((Class) term556034).getDeclaredField((String) "ORDINARY");
        ((Field) term556033).setAccessible(true);
        Object enum1012 = ((Field) term556033).get((Object) null);
        term555430 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term555431 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term555435 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term555431, term555431.getClass(), "parameters", null);
        setField(term555431, term555431.getClass(), "returnType", null);
        setBooleanField(term555431, term555431.getClass(), "returnTypeInferred", false);
        setBooleanField(term555431, term555431.getClass(), "resolved", false);
        setField(term555431, term555431.getClass(), "resolveResult", null);
        setField(term555431, term555431.getClass(), "registry", null);
        setField(term555430, term555430.getClass(), "call", term555431);
        setField(term555430, term555430.getClass(), "prototype", null);
        setField(term555430, term555430.getClass(), "kind", enum1012);
        setField(term555435, term555435.getClass(), "this$0", null);
        setField(term555435, term555435.getClass(), "call", null);
        setField(term555435, term555435.getClass(), "prototype", null);
        setField(term555435, term555435.getClass(), "kind", null);
        setField(term555435, term555435.getClass(), "typeOfThis", null);
        setField(term555435, term555435.getClass(), "source", null);
        setField(term555435, term555435.getClass(), "implementedInterfaces", null);
        setField(term555435, term555435.getClass(), "subTypes", null);
        setField(term555435, term555435.getClass(), "templateTypeName", null);
        setField(term555435, term555435.getClass(), "className", null);
        setField(term555435, term555435.getClass(), "properties", null);
        setField(term555435, term555435.getClass(), "implicitPrototype", null);
        setBooleanField(term555435, term555435.getClass(), "nativeType", false);
        setBooleanField(term555435, term555435.getClass(), "prettyPrint", false);
        setBooleanField(term555435, term555435.getClass(), "visited", false);
        setField(term555435, term555435.getClass(), "docInfo", null);
        setBooleanField(term555435, term555435.getClass(), "unknown", false);
        setBooleanField(term555435, term555435.getClass(), "resolved", false);
        setField(term555435, term555435.getClass(), "resolveResult", null);
        setField(term555435, term555435.getClass(), "registry", null);
        setField(term555430, term555430.getClass(), "typeOfThis", term555435);
        setField(term555430, term555430.getClass(), "source", null);
        setField(term555430, term555430.getClass(), "implementedInterfaces", null);
        setField(term555430, term555430.getClass(), "subTypes", null);
        setField(term555430, term555430.getClass(), "templateTypeName", null);
        setField(term555430, term555430.getClass(), "className", null);
        setField(term555430, term555430.getClass(), "properties", null);
        setField(term555430, term555430.getClass(), "implicitPrototype", null);
        setBooleanField(term555430, term555430.getClass(), "nativeType", false);
        setBooleanField(term555430, term555430.getClass(), "prettyPrint", false);
        setBooleanField(term555430, term555430.getClass(), "visited", false);
        setField(term555430, term555430.getClass(), "docInfo", null);
        setBooleanField(term555430, term555430.getClass(), "unknown", false);
        setBooleanField(term555430, term555430.getClass(), "resolved", false);
        setField(term555430, term555430.getClass(), "resolveResult", null);
        setField(term555430, term555430.getClass(), "registry", null);
        Class<? extends Object> term556325 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term556324 = ((Class) term556325).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term556324).setAccessible(true);
        Object enum1013 = ((Field) term556324).get((Object) null);
        term555436 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term555440 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term555436, term555436.getClass(), "call", null);
        setField(term555436, term555436.getClass(), "prototype", null);
        setField(term555436, term555436.getClass(), "kind", enum1013);
        setField(term555440, term555440.getClass(), "elementsType", null);
        setField(term555440, term555440.getClass(), "elements", null);
        setField(term555440, term555440.getClass(), "className", null);
        setField(term555440, term555440.getClass(), "properties", null);
        setField(term555440, term555440.getClass(), "implicitPrototype", null);
        setBooleanField(term555440, term555440.getClass(), "nativeType", false);
        setBooleanField(term555440, term555440.getClass(), "prettyPrint", false);
        setBooleanField(term555440, term555440.getClass(), "visited", false);
        setField(term555440, term555440.getClass(), "docInfo", null);
        setBooleanField(term555440, term555440.getClass(), "unknown", false);
        setBooleanField(term555440, term555440.getClass(), "resolved", false);
        setField(term555440, term555440.getClass(), "resolveResult", null);
        setField(term555440, term555440.getClass(), "registry", null);
        setField(term555436, term555436.getClass(), "typeOfThis", term555440);
        setField(term555436, term555436.getClass(), "source", null);
        setField(term555436, term555436.getClass(), "implementedInterfaces", null);
        setField(term555436, term555436.getClass(), "subTypes", null);
        setField(term555436, term555436.getClass(), "templateTypeName", null);
        setField(term555436, term555436.getClass(), "className", null);
        setField(term555436, term555436.getClass(), "properties", null);
        setField(term555436, term555436.getClass(), "implicitPrototype", null);
        setBooleanField(term555436, term555436.getClass(), "nativeType", false);
        setBooleanField(term555436, term555436.getClass(), "prettyPrint", false);
        setBooleanField(term555436, term555436.getClass(), "visited", false);
        setField(term555436, term555436.getClass(), "docInfo", null);
        setBooleanField(term555436, term555436.getClass(), "unknown", false);
        setBooleanField(term555436, term555436.getClass(), "resolved", false);
        setField(term555436, term555436.getClass(), "resolveResult", null);
        setField(term555436, term555436.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term554414;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term553954, args);
        assertTrue(recursiveEquals(term553954, term555430));
        assertTrue(recursiveEquals(term554414, term555436));
        assertTrue(recursiveEquals(retValue, false));
    }

};


