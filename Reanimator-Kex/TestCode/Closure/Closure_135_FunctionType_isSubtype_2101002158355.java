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

public class FunctionType_isSubtype_2101002158355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term207839;
     Object term208393;
     Object term209143;
     Object term209147;

    public FunctionType_isSubtype_2101002158355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term209153 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term209152 = ((Class) term209153).getDeclaredField((String) "ORDINARY");
        ((Field) term209152).setAccessible(true);
        Object enum377 = ((Field) term209152).get((Object) null);
        term207839 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term207839, term207839.getClass(), "kind", enum377);
        Class<? extends Object> term209444 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term209443 = ((Class) term209444).getDeclaredField((String) "INTERFACE");
        ((Field) term209443).setAccessible(true);
        Object enum378 = ((Field) term209443).get((Object) null);
        term208393 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term208393, term208393.getClass(), "kind", enum378);
        Class<? extends Object> term209738 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term209737 = ((Class) term209738).getDeclaredField((String) "ORDINARY");
        ((Field) term209737).setAccessible(true);
        Object enum379 = ((Field) term209737).get((Object) null);
        term209143 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term209143, term209143.getClass(), "call", null);
        setField(term209143, term209143.getClass(), "prototype", null);
        setField(term209143, term209143.getClass(), "kind", enum379);
        setField(term209143, term209143.getClass(), "typeOfThis", null);
        setField(term209143, term209143.getClass(), "source", null);
        setField(term209143, term209143.getClass(), "implementedInterfaces", null);
        setField(term209143, term209143.getClass(), "subTypes", null);
        setField(term209143, term209143.getClass(), "templateTypeName", null);
        setField(term209143, term209143.getClass(), "className", null);
        setField(term209143, term209143.getClass(), "properties", null);
        setField(term209143, term209143.getClass(), "implicitPrototype", null);
        setBooleanField(term209143, term209143.getClass(), "nativeType", false);
        setBooleanField(term209143, term209143.getClass(), "visited", false);
        setField(term209143, term209143.getClass(), "docInfo", null);
        setBooleanField(term209143, term209143.getClass(), "unknown", false);
        setBooleanField(term209143, term209143.getClass(), "resolved", false);
        setField(term209143, term209143.getClass(), "resolveResult", null);
        setField(term209143, term209143.getClass(), "registry", null);
        Class<? extends Object> term210029 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term210028 = ((Class) term210029).getDeclaredField((String) "INTERFACE");
        ((Field) term210028).setAccessible(true);
        Object enum380 = ((Field) term210028).get((Object) null);
        term209147 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term209147, term209147.getClass(), "call", null);
        setField(term209147, term209147.getClass(), "prototype", null);
        setField(term209147, term209147.getClass(), "kind", enum380);
        setField(term209147, term209147.getClass(), "typeOfThis", null);
        setField(term209147, term209147.getClass(), "source", null);
        setField(term209147, term209147.getClass(), "implementedInterfaces", null);
        setField(term209147, term209147.getClass(), "subTypes", null);
        setField(term209147, term209147.getClass(), "templateTypeName", null);
        setField(term209147, term209147.getClass(), "className", null);
        setField(term209147, term209147.getClass(), "properties", null);
        setField(term209147, term209147.getClass(), "implicitPrototype", null);
        setBooleanField(term209147, term209147.getClass(), "nativeType", false);
        setBooleanField(term209147, term209147.getClass(), "visited", false);
        setField(term209147, term209147.getClass(), "docInfo", null);
        setBooleanField(term209147, term209147.getClass(), "unknown", false);
        setBooleanField(term209147, term209147.getClass(), "resolved", false);
        setField(term209147, term209147.getClass(), "resolveResult", null);
        setField(term209147, term209147.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term208393;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term207839, args);
        assertTrue(recursiveEquals(term207839, term209143));
        assertTrue(recursiveEquals(term208393, term209147));
        assertTrue(recursiveEquals(retValue, true));
    }

};


