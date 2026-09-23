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

public class FunctionType_isSubtype_21010021581109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1300457;
     Object term1300713;
     Object term1301768;
     Object term1301772;

    public FunctionType_isSubtype_21010021581109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1301778 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1301777 = ((Class) term1301778).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1301777).setAccessible(true);
        Object enum2428 = ((Field) term1301777).get((Object) null);
        term1300457 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1300457, term1300457.getClass(), "kind", enum2428);
        Class<? extends Object> term1302078 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1302077 = ((Class) term1302078).getDeclaredField((String) "INTERFACE");
        ((Field) term1302077).setAccessible(true);
        Object enum2429 = ((Field) term1302077).get((Object) null);
        term1300713 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1300713, term1300713.getClass(), "kind", enum2429);
        Class<? extends Object> term1302372 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1302371 = ((Class) term1302372).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1302371).setAccessible(true);
        Object enum2430 = ((Field) term1302371).get((Object) null);
        term1301768 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1301768, term1301768.getClass(), "this$0", null);
        setField(term1301768, term1301768.getClass(), "call", null);
        setField(term1301768, term1301768.getClass(), "prototype", null);
        setField(term1301768, term1301768.getClass(), "kind", enum2430);
        setField(term1301768, term1301768.getClass(), "typeOfThis", null);
        setField(term1301768, term1301768.getClass(), "source", null);
        setField(term1301768, term1301768.getClass(), "implementedInterfaces", null);
        setField(term1301768, term1301768.getClass(), "subTypes", null);
        setField(term1301768, term1301768.getClass(), "templateTypeName", null);
        setField(term1301768, term1301768.getClass(), "className", null);
        setField(term1301768, term1301768.getClass(), "properties", null);
        setField(term1301768, term1301768.getClass(), "implicitPrototype", null);
        setBooleanField(term1301768, term1301768.getClass(), "nativeType", false);
        setBooleanField(term1301768, term1301768.getClass(), "visited", false);
        setField(term1301768, term1301768.getClass(), "docInfo", null);
        setBooleanField(term1301768, term1301768.getClass(), "unknown", false);
        setBooleanField(term1301768, term1301768.getClass(), "resolved", false);
        setField(term1301768, term1301768.getClass(), "resolveResult", null);
        setField(term1301768, term1301768.getClass(), "registry", null);
        Class<? extends Object> term1302672 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1302671 = ((Class) term1302672).getDeclaredField((String) "INTERFACE");
        ((Field) term1302671).setAccessible(true);
        Object enum2431 = ((Field) term1302671).get((Object) null);
        term1301772 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1301772, term1301772.getClass(), "this$0", null);
        setField(term1301772, term1301772.getClass(), "call", null);
        setField(term1301772, term1301772.getClass(), "prototype", null);
        setField(term1301772, term1301772.getClass(), "kind", enum2431);
        setField(term1301772, term1301772.getClass(), "typeOfThis", null);
        setField(term1301772, term1301772.getClass(), "source", null);
        setField(term1301772, term1301772.getClass(), "implementedInterfaces", null);
        setField(term1301772, term1301772.getClass(), "subTypes", null);
        setField(term1301772, term1301772.getClass(), "templateTypeName", null);
        setField(term1301772, term1301772.getClass(), "className", null);
        setField(term1301772, term1301772.getClass(), "properties", null);
        setField(term1301772, term1301772.getClass(), "implicitPrototype", null);
        setBooleanField(term1301772, term1301772.getClass(), "nativeType", false);
        setBooleanField(term1301772, term1301772.getClass(), "visited", false);
        setField(term1301772, term1301772.getClass(), "docInfo", null);
        setBooleanField(term1301772, term1301772.getClass(), "unknown", false);
        setBooleanField(term1301772, term1301772.getClass(), "resolved", false);
        setField(term1301772, term1301772.getClass(), "resolveResult", null);
        setField(term1301772, term1301772.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1300713;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1300457, args);
        assertTrue(recursiveEquals(term1300457, term1301768));
        assertTrue(recursiveEquals(term1300713, term1301772));
        assertTrue(recursiveEquals(retValue, true));
    }

};


