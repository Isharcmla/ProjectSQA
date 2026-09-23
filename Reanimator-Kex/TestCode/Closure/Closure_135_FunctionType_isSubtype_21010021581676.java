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

public class FunctionType_isSubtype_21010021581676 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2267823;
     Object term2268475;
     Object term2271166;
     Object term2271174;

    public FunctionType_isSubtype_21010021581676() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2271184 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2271183 = ((Class) term2271184).getDeclaredField((String) "INTERFACE");
        ((Field) term2271183).setAccessible(true);
        Object enum4237 = ((Field) term2271183).get((Object) null);
        Class<? extends Object> term2271478 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2271477 = ((Class) term2271478).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2271477).setAccessible(true);
        Object enum4238 = ((Field) term2271477).get((Object) null);
        term2267823 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2268367 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2267823, term2267823.getClass(), "kind", enum4237);
        setField(term2268367, term2268367.getClass(), "kind", enum4238);
        setField(term2267823, term2267823.getClass(), "typeOfThis", term2268367);
        term2268475 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2268805 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term2268475, term2268475.getClass(), "kind", enum4237);
        setField(term2268805, term2268805.getClass(), "kind", enum4238);
        setField(term2268475, term2268475.getClass(), "typeOfThis", term2268805);
        Class<? extends Object> term2271778 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2271777 = ((Class) term2271778).getDeclaredField((String) "INTERFACE");
        ((Field) term2271777).setAccessible(true);
        Object enum4239 = ((Field) term2271777).get((Object) null);
        Class<? extends Object> term2272072 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2272071 = ((Class) term2272072).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2272071).setAccessible(true);
        Object enum4240 = ((Field) term2272071).get((Object) null);
        term2271166 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2271170 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2271166, term2271166.getClass(), "this$0", null);
        setField(term2271166, term2271166.getClass(), "call", null);
        setField(term2271166, term2271166.getClass(), "prototype", null);
        setField(term2271166, term2271166.getClass(), "kind", enum4239);
        setField(term2271170, term2271170.getClass(), "call", null);
        setField(term2271170, term2271170.getClass(), "prototype", null);
        setField(term2271170, term2271170.getClass(), "kind", enum4240);
        setField(term2271170, term2271170.getClass(), "typeOfThis", null);
        setField(term2271170, term2271170.getClass(), "source", null);
        setField(term2271170, term2271170.getClass(), "implementedInterfaces", null);
        setField(term2271170, term2271170.getClass(), "subTypes", null);
        setField(term2271170, term2271170.getClass(), "templateTypeName", null);
        setField(term2271170, term2271170.getClass(), "className", null);
        setField(term2271170, term2271170.getClass(), "properties", null);
        setField(term2271170, term2271170.getClass(), "implicitPrototype", null);
        setBooleanField(term2271170, term2271170.getClass(), "nativeType", false);
        setBooleanField(term2271170, term2271170.getClass(), "visited", false);
        setField(term2271170, term2271170.getClass(), "docInfo", null);
        setBooleanField(term2271170, term2271170.getClass(), "unknown", false);
        setBooleanField(term2271170, term2271170.getClass(), "resolved", false);
        setField(term2271170, term2271170.getClass(), "resolveResult", null);
        setField(term2271170, term2271170.getClass(), "registry", null);
        setField(term2271166, term2271166.getClass(), "typeOfThis", term2271170);
        setField(term2271166, term2271166.getClass(), "source", null);
        setField(term2271166, term2271166.getClass(), "implementedInterfaces", null);
        setField(term2271166, term2271166.getClass(), "subTypes", null);
        setField(term2271166, term2271166.getClass(), "templateTypeName", null);
        setField(term2271166, term2271166.getClass(), "className", null);
        setField(term2271166, term2271166.getClass(), "properties", null);
        setField(term2271166, term2271166.getClass(), "implicitPrototype", null);
        setBooleanField(term2271166, term2271166.getClass(), "nativeType", false);
        setBooleanField(term2271166, term2271166.getClass(), "visited", false);
        setField(term2271166, term2271166.getClass(), "docInfo", null);
        setBooleanField(term2271166, term2271166.getClass(), "unknown", false);
        setBooleanField(term2271166, term2271166.getClass(), "resolved", false);
        setField(term2271166, term2271166.getClass(), "resolveResult", null);
        setField(term2271166, term2271166.getClass(), "registry", null);
        Class<? extends Object> term2272372 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2272371 = ((Class) term2272372).getDeclaredField((String) "INTERFACE");
        ((Field) term2272371).setAccessible(true);
        Object enum4241 = ((Field) term2272371).get((Object) null);
        Class<? extends Object> term2272666 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2272665 = ((Class) term2272666).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2272665).setAccessible(true);
        Object enum4242 = ((Field) term2272665).get((Object) null);
        term2271174 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2271178 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term2271174, term2271174.getClass(), "this$0", null);
        setField(term2271174, term2271174.getClass(), "call", null);
        setField(term2271174, term2271174.getClass(), "prototype", null);
        setField(term2271174, term2271174.getClass(), "kind", enum4241);
        setField(term2271178, term2271178.getClass(), "this$0", null);
        setField(term2271178, term2271178.getClass(), "call", null);
        setField(term2271178, term2271178.getClass(), "prototype", null);
        setField(term2271178, term2271178.getClass(), "kind", enum4242);
        setField(term2271178, term2271178.getClass(), "typeOfThis", null);
        setField(term2271178, term2271178.getClass(), "source", null);
        setField(term2271178, term2271178.getClass(), "implementedInterfaces", null);
        setField(term2271178, term2271178.getClass(), "subTypes", null);
        setField(term2271178, term2271178.getClass(), "templateTypeName", null);
        setField(term2271178, term2271178.getClass(), "className", null);
        setField(term2271178, term2271178.getClass(), "properties", null);
        setField(term2271178, term2271178.getClass(), "implicitPrototype", null);
        setBooleanField(term2271178, term2271178.getClass(), "nativeType", false);
        setBooleanField(term2271178, term2271178.getClass(), "visited", false);
        setField(term2271178, term2271178.getClass(), "docInfo", null);
        setBooleanField(term2271178, term2271178.getClass(), "unknown", false);
        setBooleanField(term2271178, term2271178.getClass(), "resolved", false);
        setField(term2271178, term2271178.getClass(), "resolveResult", null);
        setField(term2271178, term2271178.getClass(), "registry", null);
        setField(term2271174, term2271174.getClass(), "typeOfThis", term2271178);
        setField(term2271174, term2271174.getClass(), "source", null);
        setField(term2271174, term2271174.getClass(), "implementedInterfaces", null);
        setField(term2271174, term2271174.getClass(), "subTypes", null);
        setField(term2271174, term2271174.getClass(), "templateTypeName", null);
        setField(term2271174, term2271174.getClass(), "className", null);
        setField(term2271174, term2271174.getClass(), "properties", null);
        setField(term2271174, term2271174.getClass(), "implicitPrototype", null);
        setBooleanField(term2271174, term2271174.getClass(), "nativeType", false);
        setBooleanField(term2271174, term2271174.getClass(), "visited", false);
        setField(term2271174, term2271174.getClass(), "docInfo", null);
        setBooleanField(term2271174, term2271174.getClass(), "unknown", false);
        setBooleanField(term2271174, term2271174.getClass(), "resolved", false);
        setField(term2271174, term2271174.getClass(), "resolveResult", null);
        setField(term2271174, term2271174.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2268475;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term2267823, args);
        assertTrue(recursiveEquals(term2267823, term2271166));
        assertTrue(recursiveEquals(term2268475, term2271174));
        assertTrue(recursiveEquals(retValue, true));
    }

};


