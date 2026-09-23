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

public class FunctionType_isSubtype_21010021581081 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1253197;
     Object term1253849;
     Object term1256897;
     Object term1256905;

    public FunctionType_isSubtype_21010021581081() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1256912 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1256911 = ((Class) term1256912).getDeclaredField((String) "ORDINARY");
        ((Field) term1256911).setAccessible(true);
        Object enum2340 = ((Field) term1256911).get((Object) null);
        Class<? extends Object> term1257203 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1257202 = ((Class) term1257203).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1257202).setAccessible(true);
        Object enum2341 = ((Field) term1257202).get((Object) null);
        term1253197 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1253741 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1253197, term1253197.getClass(), "kind", enum2340);
        setField(term1253741, term1253741.getClass(), "kind", enum2341);
        setField(term1253197, term1253197.getClass(), "typeOfThis", term1253741);
        term1253849 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1254031 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1253849, term1253849.getClass(), "kind", enum2341);
        setField(term1253849, term1253849.getClass(), "typeOfThis", term1254031);
        Class<? extends Object> term1257503 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1257502 = ((Class) term1257503).getDeclaredField((String) "INTERFACE");
        ((Field) term1257502).setAccessible(true);
        Object enum2342 = ((Field) term1257502).get((Object) null);
        Class<? extends Object> term1257797 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1257796 = ((Class) term1257797).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1257796).setAccessible(true);
        Object enum2343 = ((Field) term1257796).get((Object) null);
        term1256897 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1256901 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1256897, term1256897.getClass(), "this$0", null);
        setField(term1256897, term1256897.getClass(), "call", null);
        setField(term1256897, term1256897.getClass(), "prototype", null);
        setField(term1256897, term1256897.getClass(), "kind", enum2342);
        setField(term1256901, term1256901.getClass(), "call", null);
        setField(term1256901, term1256901.getClass(), "prototype", null);
        setField(term1256901, term1256901.getClass(), "kind", enum2343);
        setField(term1256901, term1256901.getClass(), "typeOfThis", null);
        setField(term1256901, term1256901.getClass(), "source", null);
        setField(term1256901, term1256901.getClass(), "implementedInterfaces", null);
        setField(term1256901, term1256901.getClass(), "subTypes", null);
        setField(term1256901, term1256901.getClass(), "templateTypeName", null);
        setField(term1256901, term1256901.getClass(), "className", null);
        setField(term1256901, term1256901.getClass(), "properties", null);
        setField(term1256901, term1256901.getClass(), "implicitPrototype", null);
        setBooleanField(term1256901, term1256901.getClass(), "nativeType", false);
        setBooleanField(term1256901, term1256901.getClass(), "visited", false);
        setField(term1256901, term1256901.getClass(), "docInfo", null);
        setBooleanField(term1256901, term1256901.getClass(), "unknown", false);
        setBooleanField(term1256901, term1256901.getClass(), "resolved", false);
        setField(term1256901, term1256901.getClass(), "resolveResult", null);
        setField(term1256901, term1256901.getClass(), "registry", null);
        setField(term1256897, term1256897.getClass(), "typeOfThis", term1256901);
        setField(term1256897, term1256897.getClass(), "source", null);
        setField(term1256897, term1256897.getClass(), "implementedInterfaces", null);
        setField(term1256897, term1256897.getClass(), "subTypes", null);
        setField(term1256897, term1256897.getClass(), "templateTypeName", null);
        setField(term1256897, term1256897.getClass(), "className", null);
        setField(term1256897, term1256897.getClass(), "properties", null);
        setField(term1256897, term1256897.getClass(), "implicitPrototype", null);
        setBooleanField(term1256897, term1256897.getClass(), "nativeType", false);
        setBooleanField(term1256897, term1256897.getClass(), "visited", false);
        setField(term1256897, term1256897.getClass(), "docInfo", null);
        setBooleanField(term1256897, term1256897.getClass(), "unknown", false);
        setBooleanField(term1256897, term1256897.getClass(), "resolved", false);
        setField(term1256897, term1256897.getClass(), "resolveResult", null);
        setField(term1256897, term1256897.getClass(), "registry", null);
        Class<? extends Object> term1258097 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1258096 = ((Class) term1258097).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1258096).setAccessible(true);
        Object enum2344 = ((Field) term1258096).get((Object) null);
        term1256905 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1256909 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1256905, term1256905.getClass(), "this$0", null);
        setField(term1256905, term1256905.getClass(), "call", null);
        setField(term1256905, term1256905.getClass(), "prototype", null);
        setField(term1256905, term1256905.getClass(), "kind", enum2344);
        setField(term1256909, term1256909.getClass(), "this$0", null);
        setField(term1256909, term1256909.getClass(), "call", null);
        setField(term1256909, term1256909.getClass(), "prototype", null);
        setField(term1256909, term1256909.getClass(), "kind", null);
        setField(term1256909, term1256909.getClass(), "typeOfThis", null);
        setField(term1256909, term1256909.getClass(), "source", null);
        setField(term1256909, term1256909.getClass(), "implementedInterfaces", null);
        setField(term1256909, term1256909.getClass(), "subTypes", null);
        setField(term1256909, term1256909.getClass(), "templateTypeName", null);
        setField(term1256909, term1256909.getClass(), "className", null);
        setField(term1256909, term1256909.getClass(), "properties", null);
        setField(term1256909, term1256909.getClass(), "implicitPrototype", null);
        setBooleanField(term1256909, term1256909.getClass(), "nativeType", false);
        setBooleanField(term1256909, term1256909.getClass(), "visited", false);
        setField(term1256909, term1256909.getClass(), "docInfo", null);
        setBooleanField(term1256909, term1256909.getClass(), "unknown", false);
        setBooleanField(term1256909, term1256909.getClass(), "resolved", false);
        setField(term1256909, term1256909.getClass(), "resolveResult", null);
        setField(term1256909, term1256909.getClass(), "registry", null);
        setField(term1256905, term1256905.getClass(), "typeOfThis", term1256909);
        setField(term1256905, term1256905.getClass(), "source", null);
        setField(term1256905, term1256905.getClass(), "implementedInterfaces", null);
        setField(term1256905, term1256905.getClass(), "subTypes", null);
        setField(term1256905, term1256905.getClass(), "templateTypeName", null);
        setField(term1256905, term1256905.getClass(), "className", null);
        setField(term1256905, term1256905.getClass(), "properties", null);
        setField(term1256905, term1256905.getClass(), "implicitPrototype", null);
        setBooleanField(term1256905, term1256905.getClass(), "nativeType", false);
        setBooleanField(term1256905, term1256905.getClass(), "visited", false);
        setField(term1256905, term1256905.getClass(), "docInfo", null);
        setBooleanField(term1256905, term1256905.getClass(), "unknown", false);
        setBooleanField(term1256905, term1256905.getClass(), "resolved", false);
        setField(term1256905, term1256905.getClass(), "resolveResult", null);
        setField(term1256905, term1256905.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1253849;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1253197, args);
        assertTrue(recursiveEquals(term1253197, term1256897));
        assertTrue(recursiveEquals(term1253849, term1256905));
        assertTrue(recursiveEquals(retValue, false));
    }

};


