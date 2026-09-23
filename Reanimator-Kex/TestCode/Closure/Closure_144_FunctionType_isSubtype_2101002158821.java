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

public class FunctionType_isSubtype_2101002158821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term952310;
     Object term952972;
     Object term953879;
     Object term953884;

    public FunctionType_isSubtype_2101002158821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term953891 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term953890 = ((Class) term953891).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term953890).setAccessible(true);
        Object enum1724 = ((Field) term953890).get((Object) null);
        term952310 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term952862 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term952310, term952310.getClass(), "kind", enum1724);
        setField(term952310, term952310.getClass(), "typeOfThis", term952862);
        Class<? extends Object> term954191 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term954190 = ((Class) term954191).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term954190).setAccessible(true);
        Object enum1725 = ((Field) term954190).get((Object) null);
        term952972 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term953156 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term952972, term952972.getClass(), "kind", enum1725);
        setField(term952972, term952972.getClass(), "typeOfThis", term953156);
        Class<? extends Object> term954491 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term954490 = ((Class) term954491).getDeclaredField((String) "INTERFACE");
        ((Field) term954490).setAccessible(true);
        Object enum1726 = ((Field) term954490).get((Object) null);
        term953879 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term953883 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term953879, term953879.getClass(), "call", null);
        setField(term953879, term953879.getClass(), "prototype", null);
        setField(term953879, term953879.getClass(), "kind", enum1726);
        setField(term953883, term953883.getClass(), "this$0", null);
        setField(term953883, term953883.getClass(), "call", null);
        setField(term953883, term953883.getClass(), "prototype", null);
        setField(term953883, term953883.getClass(), "kind", null);
        setField(term953883, term953883.getClass(), "typeOfThis", null);
        setField(term953883, term953883.getClass(), "source", null);
        setField(term953883, term953883.getClass(), "implementedInterfaces", null);
        setField(term953883, term953883.getClass(), "subTypes", null);
        setField(term953883, term953883.getClass(), "templateTypeName", null);
        setField(term953883, term953883.getClass(), "className", null);
        setField(term953883, term953883.getClass(), "properties", null);
        setField(term953883, term953883.getClass(), "implicitPrototype", null);
        setBooleanField(term953883, term953883.getClass(), "nativeType", false);
        setBooleanField(term953883, term953883.getClass(), "prettyPrint", false);
        setBooleanField(term953883, term953883.getClass(), "visited", false);
        setField(term953883, term953883.getClass(), "docInfo", null);
        setBooleanField(term953883, term953883.getClass(), "unknown", false);
        setBooleanField(term953883, term953883.getClass(), "resolved", false);
        setField(term953883, term953883.getClass(), "resolveResult", null);
        setField(term953883, term953883.getClass(), "registry", null);
        setField(term953879, term953879.getClass(), "typeOfThis", term953883);
        setField(term953879, term953879.getClass(), "source", null);
        setField(term953879, term953879.getClass(), "implementedInterfaces", null);
        setField(term953879, term953879.getClass(), "subTypes", null);
        setField(term953879, term953879.getClass(), "templateTypeName", null);
        setField(term953879, term953879.getClass(), "className", null);
        setField(term953879, term953879.getClass(), "properties", null);
        setField(term953879, term953879.getClass(), "implicitPrototype", null);
        setBooleanField(term953879, term953879.getClass(), "nativeType", false);
        setBooleanField(term953879, term953879.getClass(), "prettyPrint", false);
        setBooleanField(term953879, term953879.getClass(), "visited", false);
        setField(term953879, term953879.getClass(), "docInfo", null);
        setBooleanField(term953879, term953879.getClass(), "unknown", false);
        setBooleanField(term953879, term953879.getClass(), "resolved", false);
        setField(term953879, term953879.getClass(), "resolveResult", null);
        setField(term953879, term953879.getClass(), "registry", null);
        Class<? extends Object> term954785 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term954784 = ((Class) term954785).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term954784).setAccessible(true);
        Object enum1727 = ((Field) term954784).get((Object) null);
        term953884 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term953888 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term953884, term953884.getClass(), "call", null);
        setField(term953884, term953884.getClass(), "prototype", null);
        setField(term953884, term953884.getClass(), "kind", enum1727);
        setField(term953888, term953888.getClass(), "call", null);
        setField(term953888, term953888.getClass(), "prototype", null);
        setField(term953888, term953888.getClass(), "kind", null);
        setField(term953888, term953888.getClass(), "typeOfThis", null);
        setField(term953888, term953888.getClass(), "source", null);
        setField(term953888, term953888.getClass(), "implementedInterfaces", null);
        setField(term953888, term953888.getClass(), "subTypes", null);
        setField(term953888, term953888.getClass(), "templateTypeName", null);
        setField(term953888, term953888.getClass(), "className", null);
        setField(term953888, term953888.getClass(), "properties", null);
        setField(term953888, term953888.getClass(), "implicitPrototype", null);
        setBooleanField(term953888, term953888.getClass(), "nativeType", false);
        setBooleanField(term953888, term953888.getClass(), "prettyPrint", false);
        setBooleanField(term953888, term953888.getClass(), "visited", false);
        setField(term953888, term953888.getClass(), "docInfo", null);
        setBooleanField(term953888, term953888.getClass(), "unknown", false);
        setBooleanField(term953888, term953888.getClass(), "resolved", false);
        setField(term953888, term953888.getClass(), "resolveResult", null);
        setField(term953888, term953888.getClass(), "registry", null);
        setField(term953884, term953884.getClass(), "typeOfThis", term953888);
        setField(term953884, term953884.getClass(), "source", null);
        setField(term953884, term953884.getClass(), "implementedInterfaces", null);
        setField(term953884, term953884.getClass(), "subTypes", null);
        setField(term953884, term953884.getClass(), "templateTypeName", null);
        setField(term953884, term953884.getClass(), "className", null);
        setField(term953884, term953884.getClass(), "properties", null);
        setField(term953884, term953884.getClass(), "implicitPrototype", null);
        setBooleanField(term953884, term953884.getClass(), "nativeType", false);
        setBooleanField(term953884, term953884.getClass(), "prettyPrint", false);
        setBooleanField(term953884, term953884.getClass(), "visited", false);
        setField(term953884, term953884.getClass(), "docInfo", null);
        setBooleanField(term953884, term953884.getClass(), "unknown", false);
        setBooleanField(term953884, term953884.getClass(), "resolved", false);
        setField(term953884, term953884.getClass(), "resolveResult", null);
        setField(term953884, term953884.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term952972;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term952310, args);
        assertTrue(recursiveEquals(term952310, term953879));
        assertTrue(recursiveEquals(term952972, term953884));
        assertTrue(recursiveEquals(retValue, false));
    }

};


