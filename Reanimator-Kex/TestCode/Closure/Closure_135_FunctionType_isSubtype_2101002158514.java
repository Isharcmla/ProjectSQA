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

public class FunctionType_isSubtype_2101002158514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term380686;
     Object term381338;
     Object term383015;
     Object term383020;

    public FunctionType_isSubtype_2101002158514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term383026 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term383025 = ((Class) term383026).getDeclaredField((String) "ORDINARY");
        ((Field) term383025).setAccessible(true);
        Object enum701 = ((Field) term383025).get((Object) null);
        term380686 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term381230 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term380686, term380686.getClass(), "kind", enum701);
        setField(term380686, term380686.getClass(), "typeOfThis", term381230);
        term381338 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term381338, term381338.getClass(), "kind", enum701);
        setField(term381338, term381338.getClass(), "typeOfThis", null);
        Class<? extends Object> term383317 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term383316 = ((Class) term383317).getDeclaredField((String) "INTERFACE");
        ((Field) term383316).setAccessible(true);
        Object enum702 = ((Field) term383316).get((Object) null);
        term383015 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term383019 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term383015, term383015.getClass(), "this$0", null);
        setField(term383015, term383015.getClass(), "call", null);
        setField(term383015, term383015.getClass(), "prototype", null);
        setField(term383015, term383015.getClass(), "kind", enum702);
        setField(term383019, term383019.getClass(), "call", null);
        setField(term383019, term383019.getClass(), "prototype", null);
        setField(term383019, term383019.getClass(), "kind", null);
        setField(term383019, term383019.getClass(), "typeOfThis", null);
        setField(term383019, term383019.getClass(), "source", null);
        setField(term383019, term383019.getClass(), "implementedInterfaces", null);
        setField(term383019, term383019.getClass(), "subTypes", null);
        setField(term383019, term383019.getClass(), "templateTypeName", null);
        setField(term383019, term383019.getClass(), "className", null);
        setField(term383019, term383019.getClass(), "properties", null);
        setField(term383019, term383019.getClass(), "implicitPrototype", null);
        setBooleanField(term383019, term383019.getClass(), "nativeType", false);
        setBooleanField(term383019, term383019.getClass(), "visited", false);
        setField(term383019, term383019.getClass(), "docInfo", null);
        setBooleanField(term383019, term383019.getClass(), "unknown", false);
        setBooleanField(term383019, term383019.getClass(), "resolved", false);
        setField(term383019, term383019.getClass(), "resolveResult", null);
        setField(term383019, term383019.getClass(), "registry", null);
        setField(term383015, term383015.getClass(), "typeOfThis", term383019);
        setField(term383015, term383015.getClass(), "source", null);
        setField(term383015, term383015.getClass(), "implementedInterfaces", null);
        setField(term383015, term383015.getClass(), "subTypes", null);
        setField(term383015, term383015.getClass(), "templateTypeName", null);
        setField(term383015, term383015.getClass(), "className", null);
        setField(term383015, term383015.getClass(), "properties", null);
        setField(term383015, term383015.getClass(), "implicitPrototype", null);
        setBooleanField(term383015, term383015.getClass(), "nativeType", false);
        setBooleanField(term383015, term383015.getClass(), "visited", false);
        setField(term383015, term383015.getClass(), "docInfo", null);
        setBooleanField(term383015, term383015.getClass(), "unknown", false);
        setBooleanField(term383015, term383015.getClass(), "resolved", false);
        setField(term383015, term383015.getClass(), "resolveResult", null);
        setField(term383015, term383015.getClass(), "registry", null);
        Class<? extends Object> term383611 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term383610 = ((Class) term383611).getDeclaredField((String) "INTERFACE");
        ((Field) term383610).setAccessible(true);
        Object enum703 = ((Field) term383610).get((Object) null);
        term383020 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term383020, term383020.getClass(), "this$0", null);
        setField(term383020, term383020.getClass(), "call", null);
        setField(term383020, term383020.getClass(), "prototype", null);
        setField(term383020, term383020.getClass(), "kind", enum703);
        setField(term383020, term383020.getClass(), "typeOfThis", null);
        setField(term383020, term383020.getClass(), "source", null);
        setField(term383020, term383020.getClass(), "implementedInterfaces", null);
        setField(term383020, term383020.getClass(), "subTypes", null);
        setField(term383020, term383020.getClass(), "templateTypeName", null);
        setField(term383020, term383020.getClass(), "className", null);
        setField(term383020, term383020.getClass(), "properties", null);
        setField(term383020, term383020.getClass(), "implicitPrototype", null);
        setBooleanField(term383020, term383020.getClass(), "nativeType", false);
        setBooleanField(term383020, term383020.getClass(), "visited", false);
        setField(term383020, term383020.getClass(), "docInfo", null);
        setBooleanField(term383020, term383020.getClass(), "unknown", false);
        setBooleanField(term383020, term383020.getClass(), "resolved", false);
        setField(term383020, term383020.getClass(), "resolveResult", null);
        setField(term383020, term383020.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term381338;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term380686, args);
        assertTrue(recursiveEquals(term380686, term383015));
        assertTrue(recursiveEquals(term381338, term383020));
        assertTrue(recursiveEquals(retValue, true));
    }

};


