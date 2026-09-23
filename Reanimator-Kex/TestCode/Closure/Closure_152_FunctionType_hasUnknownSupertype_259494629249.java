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

public class FunctionType_hasUnknownSupertype_259494629249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131247;
     Object term133173;

    public FunctionType_hasUnknownSupertype_259494629249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term133180 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term133179 = ((Class) term133180).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term133179).setAccessible(true);
        Object enum246 = ((Field) term133179).get((Object) null);
        term131247 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term131513 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term131247, term131247.getClass(), "kind", enum246);
        setBooleanField(term131247, term131247.getClass(), "unknown", false);
        setField(term131247, term131247.getClass(), "prototype", term131513);
        Class<? extends Object> term133480 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term133479 = ((Class) term133480).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term133479).setAccessible(true);
        Object enum247 = ((Field) term133479).get((Object) null);
        term133173 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term133174 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term133173, term133173.getClass(), "call", null);
        setField(term133174, term133174.getClass(), "ownerFunction", null);
        setField(term133174, term133174.getClass(), "className", null);
        setField(term133174, term133174.getClass(), "properties", null);
        setBooleanField(term133174, term133174.getClass(), "nativeType", false);
        setField(term133174, term133174.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term133174, term133174.getClass(), "prettyPrint", false);
        setBooleanField(term133174, term133174.getClass(), "visited", false);
        setField(term133174, term133174.getClass(), "docInfo", null);
        setBooleanField(term133174, term133174.getClass(), "unknown", false);
        setBooleanField(term133174, term133174.getClass(), "resolved", false);
        setField(term133174, term133174.getClass(), "resolveResult", null);
        setField(term133174, term133174.getClass(), "registry", null);
        setField(term133173, term133173.getClass(), "prototype", term133174);
        setField(term133173, term133173.getClass(), "kind", enum247);
        setField(term133173, term133173.getClass(), "typeOfThis", null);
        setField(term133173, term133173.getClass(), "source", null);
        setField(term133173, term133173.getClass(), "implementedInterfaces", null);
        setField(term133173, term133173.getClass(), "subTypes", null);
        setField(term133173, term133173.getClass(), "templateTypeName", null);
        setField(term133173, term133173.getClass(), "className", null);
        setField(term133173, term133173.getClass(), "properties", null);
        setBooleanField(term133173, term133173.getClass(), "nativeType", false);
        setField(term133173, term133173.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term133173, term133173.getClass(), "prettyPrint", false);
        setBooleanField(term133173, term133173.getClass(), "visited", false);
        setField(term133173, term133173.getClass(), "docInfo", null);
        setBooleanField(term133173, term133173.getClass(), "unknown", false);
        setBooleanField(term133173, term133173.getClass(), "resolved", false);
        setField(term133173, term133173.getClass(), "resolveResult", null);
        setField(term133173, term133173.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasUnknownSupertype", argTypes, term131247, args);
        assertTrue(recursiveEquals(term131247, term133173));
        assertTrue(recursiveEquals(retValue, false));
    }

};


