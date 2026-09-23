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

public class FunctionType_isSubtype_21010021581421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1837754;
     Object term1838104;
     Object term1839054;
     Object term1839059;

    public FunctionType_isSubtype_21010021581421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1839066 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1839065 = ((Class) term1839066).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1839065).setAccessible(true);
        Object enum3426 = ((Field) term1839065).get((Object) null);
        term1837754 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1837996 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1837754, term1837754.getClass(), "kind", enum3426);
        setField(term1837754, term1837754.getClass(), "call", term1837996);
        Class<? extends Object> term1839366 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1839365 = ((Class) term1839366).getDeclaredField((String) "ORDINARY");
        ((Field) term1839365).setAccessible(true);
        Object enum3427 = ((Field) term1839365).get((Object) null);
        term1838104 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1838346 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1838104, term1838104.getClass(), "kind", enum3427);
        setField(term1838104, term1838104.getClass(), "call", term1838346);
        Class<? extends Object> term1839657 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1839656 = ((Class) term1839657).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1839656).setAccessible(true);
        Object enum3428 = ((Field) term1839656).get((Object) null);
        term1839054 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1839055 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1839054, term1839054.getClass(), "this$0", null);
        setField(term1839055, term1839055.getClass(), "parameters", null);
        setField(term1839055, term1839055.getClass(), "returnType", null);
        setBooleanField(term1839055, term1839055.getClass(), "resolved", false);
        setField(term1839055, term1839055.getClass(), "resolveResult", null);
        setField(term1839055, term1839055.getClass(), "registry", null);
        setField(term1839054, term1839054.getClass(), "call", term1839055);
        setField(term1839054, term1839054.getClass(), "prototype", null);
        setField(term1839054, term1839054.getClass(), "kind", enum3428);
        setField(term1839054, term1839054.getClass(), "typeOfThis", null);
        setField(term1839054, term1839054.getClass(), "source", null);
        setField(term1839054, term1839054.getClass(), "implementedInterfaces", null);
        setField(term1839054, term1839054.getClass(), "subTypes", null);
        setField(term1839054, term1839054.getClass(), "templateTypeName", null);
        setField(term1839054, term1839054.getClass(), "className", null);
        setField(term1839054, term1839054.getClass(), "properties", null);
        setField(term1839054, term1839054.getClass(), "implicitPrototype", null);
        setBooleanField(term1839054, term1839054.getClass(), "nativeType", false);
        setBooleanField(term1839054, term1839054.getClass(), "visited", false);
        setField(term1839054, term1839054.getClass(), "docInfo", null);
        setBooleanField(term1839054, term1839054.getClass(), "unknown", false);
        setBooleanField(term1839054, term1839054.getClass(), "resolved", false);
        setField(term1839054, term1839054.getClass(), "resolveResult", null);
        setField(term1839054, term1839054.getClass(), "registry", null);
        Class<? extends Object> term1839957 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1839956 = ((Class) term1839957).getDeclaredField((String) "ORDINARY");
        ((Field) term1839956).setAccessible(true);
        Object enum3429 = ((Field) term1839956).get((Object) null);
        term1839059 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1839060 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1839059, term1839059.getClass(), "this$0", null);
        setField(term1839060, term1839060.getClass(), "parameters", null);
        setField(term1839060, term1839060.getClass(), "returnType", null);
        setBooleanField(term1839060, term1839060.getClass(), "resolved", false);
        setField(term1839060, term1839060.getClass(), "resolveResult", null);
        setField(term1839060, term1839060.getClass(), "registry", null);
        setField(term1839059, term1839059.getClass(), "call", term1839060);
        setField(term1839059, term1839059.getClass(), "prototype", null);
        setField(term1839059, term1839059.getClass(), "kind", enum3429);
        setField(term1839059, term1839059.getClass(), "typeOfThis", null);
        setField(term1839059, term1839059.getClass(), "source", null);
        setField(term1839059, term1839059.getClass(), "implementedInterfaces", null);
        setField(term1839059, term1839059.getClass(), "subTypes", null);
        setField(term1839059, term1839059.getClass(), "templateTypeName", null);
        setField(term1839059, term1839059.getClass(), "className", null);
        setField(term1839059, term1839059.getClass(), "properties", null);
        setField(term1839059, term1839059.getClass(), "implicitPrototype", null);
        setBooleanField(term1839059, term1839059.getClass(), "nativeType", false);
        setBooleanField(term1839059, term1839059.getClass(), "visited", false);
        setField(term1839059, term1839059.getClass(), "docInfo", null);
        setBooleanField(term1839059, term1839059.getClass(), "unknown", false);
        setBooleanField(term1839059, term1839059.getClass(), "resolved", false);
        setField(term1839059, term1839059.getClass(), "resolveResult", null);
        setField(term1839059, term1839059.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1838104;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1837754, args);
        assertTrue(recursiveEquals(term1837754, term1839054));
        assertTrue(recursiveEquals(term1838104, term1839059));
        assertTrue(recursiveEquals(retValue, true));
    }

};


