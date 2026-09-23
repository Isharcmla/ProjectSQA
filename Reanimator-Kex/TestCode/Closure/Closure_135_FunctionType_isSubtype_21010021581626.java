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

public class FunctionType_isSubtype_21010021581626 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2183112;
     Object term2183772;
     Object term2186973;
     Object term2186981;

    public FunctionType_isSubtype_21010021581626() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2186989 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2186988 = ((Class) term2186989).getDeclaredField((String) "INTERFACE");
        ((Field) term2186988).setAccessible(true);
        Object enum4073 = ((Field) term2186988).get((Object) null);
        Class<? extends Object> term2187283 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2187282 = ((Class) term2187283).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2187282).setAccessible(true);
        Object enum4074 = ((Field) term2187282).get((Object) null);
        term2183112 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2183664 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2183112, term2183112.getClass(), "kind", enum4073);
        setField(term2183664, term2183664.getClass(), "kind", enum4074);
        setField(term2183664, term2183664.getClass(), "typeOfThis", null);
        setField(term2183112, term2183112.getClass(), "typeOfThis", term2183664);
        term2183772 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2184102 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2184190 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term2183772, term2183772.getClass(), "kind", enum4073);
        setField(term2184102, term2184102.getClass(), "kind", enum4073);
        setField(term2184102, term2184102.getClass(), "typeOfThis", term2184190);
        setField(term2183772, term2183772.getClass(), "typeOfThis", term2184102);
        Class<? extends Object> term2187583 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2187582 = ((Class) term2187583).getDeclaredField((String) "INTERFACE");
        ((Field) term2187582).setAccessible(true);
        Object enum4075 = ((Field) term2187582).get((Object) null);
        Class<? extends Object> term2187877 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2187876 = ((Class) term2187877).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2187876).setAccessible(true);
        Object enum4076 = ((Field) term2187876).get((Object) null);
        term2186973 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2186977 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2186973, term2186973.getClass(), "this$0", null);
        setField(term2186973, term2186973.getClass(), "call", null);
        setField(term2186973, term2186973.getClass(), "prototype", null);
        setField(term2186973, term2186973.getClass(), "kind", enum4075);
        setField(term2186977, term2186977.getClass(), "this$0", null);
        setField(term2186977, term2186977.getClass(), "call", null);
        setField(term2186977, term2186977.getClass(), "prototype", null);
        setField(term2186977, term2186977.getClass(), "kind", enum4076);
        setField(term2186977, term2186977.getClass(), "typeOfThis", null);
        setField(term2186977, term2186977.getClass(), "source", null);
        setField(term2186977, term2186977.getClass(), "implementedInterfaces", null);
        setField(term2186977, term2186977.getClass(), "subTypes", null);
        setField(term2186977, term2186977.getClass(), "templateTypeName", null);
        setField(term2186977, term2186977.getClass(), "className", null);
        setField(term2186977, term2186977.getClass(), "properties", null);
        setField(term2186977, term2186977.getClass(), "implicitPrototype", null);
        setBooleanField(term2186977, term2186977.getClass(), "nativeType", false);
        setBooleanField(term2186977, term2186977.getClass(), "visited", false);
        setField(term2186977, term2186977.getClass(), "docInfo", null);
        setBooleanField(term2186977, term2186977.getClass(), "unknown", false);
        setBooleanField(term2186977, term2186977.getClass(), "resolved", false);
        setField(term2186977, term2186977.getClass(), "resolveResult", null);
        setField(term2186977, term2186977.getClass(), "registry", null);
        setField(term2186973, term2186973.getClass(), "typeOfThis", term2186977);
        setField(term2186973, term2186973.getClass(), "source", null);
        setField(term2186973, term2186973.getClass(), "implementedInterfaces", null);
        setField(term2186973, term2186973.getClass(), "subTypes", null);
        setField(term2186973, term2186973.getClass(), "templateTypeName", null);
        setField(term2186973, term2186973.getClass(), "className", null);
        setField(term2186973, term2186973.getClass(), "properties", null);
        setField(term2186973, term2186973.getClass(), "implicitPrototype", null);
        setBooleanField(term2186973, term2186973.getClass(), "nativeType", false);
        setBooleanField(term2186973, term2186973.getClass(), "visited", false);
        setField(term2186973, term2186973.getClass(), "docInfo", null);
        setBooleanField(term2186973, term2186973.getClass(), "unknown", false);
        setBooleanField(term2186973, term2186973.getClass(), "resolved", false);
        setField(term2186973, term2186973.getClass(), "resolveResult", null);
        setField(term2186973, term2186973.getClass(), "registry", null);
        Class<? extends Object> term2188177 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2188176 = ((Class) term2188177).getDeclaredField((String) "INTERFACE");
        ((Field) term2188176).setAccessible(true);
        Object enum4077 = ((Field) term2188176).get((Object) null);
        term2186981 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2186985 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2186986 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term2186981, term2186981.getClass(), "this$0", null);
        setField(term2186981, term2186981.getClass(), "call", null);
        setField(term2186981, term2186981.getClass(), "prototype", null);
        setField(term2186981, term2186981.getClass(), "kind", enum4077);
        setField(term2186985, term2186985.getClass(), "this$0", null);
        setField(term2186985, term2186985.getClass(), "call", null);
        setField(term2186985, term2186985.getClass(), "prototype", null);
        setField(term2186985, term2186985.getClass(), "kind", enum4077);
        setField(term2186986, term2186986.getClass(), "leastSupertypeVisitor", null);
        setField(term2186986, term2186986.getClass(), "greatestSubtypeVisitor", null);
        setField(term2186986, term2186986.getClass(), "call", null);
        setField(term2186986, term2186986.getClass(), "prototype", null);
        setField(term2186986, term2186986.getClass(), "kind", null);
        setField(term2186986, term2186986.getClass(), "typeOfThis", null);
        setField(term2186986, term2186986.getClass(), "source", null);
        setField(term2186986, term2186986.getClass(), "implementedInterfaces", null);
        setField(term2186986, term2186986.getClass(), "subTypes", null);
        setField(term2186986, term2186986.getClass(), "templateTypeName", null);
        setField(term2186986, term2186986.getClass(), "className", null);
        setField(term2186986, term2186986.getClass(), "properties", null);
        setField(term2186986, term2186986.getClass(), "implicitPrototype", null);
        setBooleanField(term2186986, term2186986.getClass(), "nativeType", false);
        setBooleanField(term2186986, term2186986.getClass(), "visited", false);
        setField(term2186986, term2186986.getClass(), "docInfo", null);
        setBooleanField(term2186986, term2186986.getClass(), "unknown", false);
        setBooleanField(term2186986, term2186986.getClass(), "resolved", false);
        setField(term2186986, term2186986.getClass(), "resolveResult", null);
        setField(term2186986, term2186986.getClass(), "registry", null);
        setField(term2186985, term2186985.getClass(), "typeOfThis", term2186986);
        setField(term2186985, term2186985.getClass(), "source", null);
        setField(term2186985, term2186985.getClass(), "implementedInterfaces", null);
        setField(term2186985, term2186985.getClass(), "subTypes", null);
        setField(term2186985, term2186985.getClass(), "templateTypeName", null);
        setField(term2186985, term2186985.getClass(), "className", null);
        setField(term2186985, term2186985.getClass(), "properties", null);
        setField(term2186985, term2186985.getClass(), "implicitPrototype", null);
        setBooleanField(term2186985, term2186985.getClass(), "nativeType", false);
        setBooleanField(term2186985, term2186985.getClass(), "visited", false);
        setField(term2186985, term2186985.getClass(), "docInfo", null);
        setBooleanField(term2186985, term2186985.getClass(), "unknown", false);
        setBooleanField(term2186985, term2186985.getClass(), "resolved", false);
        setField(term2186985, term2186985.getClass(), "resolveResult", null);
        setField(term2186985, term2186985.getClass(), "registry", null);
        setField(term2186981, term2186981.getClass(), "typeOfThis", term2186985);
        setField(term2186981, term2186981.getClass(), "source", null);
        setField(term2186981, term2186981.getClass(), "implementedInterfaces", null);
        setField(term2186981, term2186981.getClass(), "subTypes", null);
        setField(term2186981, term2186981.getClass(), "templateTypeName", null);
        setField(term2186981, term2186981.getClass(), "className", null);
        setField(term2186981, term2186981.getClass(), "properties", null);
        setField(term2186981, term2186981.getClass(), "implicitPrototype", null);
        setBooleanField(term2186981, term2186981.getClass(), "nativeType", false);
        setBooleanField(term2186981, term2186981.getClass(), "visited", false);
        setField(term2186981, term2186981.getClass(), "docInfo", null);
        setBooleanField(term2186981, term2186981.getClass(), "unknown", false);
        setBooleanField(term2186981, term2186981.getClass(), "resolved", false);
        setField(term2186981, term2186981.getClass(), "resolveResult", null);
        setField(term2186981, term2186981.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2183772;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term2183112, args);
        assertTrue(recursiveEquals(term2183112, term2186973));
        assertTrue(recursiveEquals(term2183772, term2186981));
        assertTrue(recursiveEquals(retValue, true));
    }

};


