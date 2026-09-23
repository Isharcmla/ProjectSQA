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
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.LinkedHashSet;

public class FunctionType_getAllImplementedInterfaces_572683533257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149760;
     Object term150458;
     Object term150451;

    public FunctionType_getAllImplementedInterfaces_572683533257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term150466 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term150465 = ((Class) term150466).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term150465).setAccessible(true);
        Object enum284 = ((Field) term150465).get((Object) null);
        ArrayList term150078 = new ArrayList();
        term149760 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term150026 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term149760, term149760.getClass(), "kind", enum284);
        setField(term150026, term150026.getClass(), "implicitPrototypeFallback", null);
        setField(term149760, term149760.getClass(), "prototype", term150026);
        setField(term149760, term149760.getClass(), "implementedInterfaces", term150078);
        Class<? extends Object> term150766 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term150765 = ((Class) term150766).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term150765).setAccessible(true);
        Object enum285 = ((Field) term150765).get((Object) null);
        ArrayList term150463 = new ArrayList();
        term150458 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term150459 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term150458, term150458.getClass(), "call", null);
        setField(term150459, term150459.getClass(), "ownerFunction", null);
        setField(term150459, term150459.getClass(), "className", null);
        setField(term150459, term150459.getClass(), "properties", null);
        setBooleanField(term150459, term150459.getClass(), "nativeType", false);
        setField(term150459, term150459.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term150459, term150459.getClass(), "prettyPrint", false);
        setBooleanField(term150459, term150459.getClass(), "visited", false);
        setField(term150459, term150459.getClass(), "docInfo", null);
        setBooleanField(term150459, term150459.getClass(), "unknown", false);
        setBooleanField(term150459, term150459.getClass(), "resolved", false);
        setField(term150459, term150459.getClass(), "resolveResult", null);
        setField(term150459, term150459.getClass(), "registry", null);
        setField(term150458, term150458.getClass(), "prototype", term150459);
        setField(term150458, term150458.getClass(), "kind", enum285);
        setField(term150458, term150458.getClass(), "typeOfThis", null);
        setField(term150458, term150458.getClass(), "source", null);
        setField(term150458, term150458.getClass(), "implementedInterfaces", term150463);
        setField(term150458, term150458.getClass(), "subTypes", null);
        setField(term150458, term150458.getClass(), "templateTypeName", null);
        setField(term150458, term150458.getClass(), "className", null);
        setField(term150458, term150458.getClass(), "properties", null);
        setBooleanField(term150458, term150458.getClass(), "nativeType", false);
        setField(term150458, term150458.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term150458, term150458.getClass(), "prettyPrint", false);
        setBooleanField(term150458, term150458.getClass(), "visited", false);
        setField(term150458, term150458.getClass(), "docInfo", null);
        setBooleanField(term150458, term150458.getClass(), "unknown", false);
        setBooleanField(term150458, term150458.getClass(), "resolved", false);
        setField(term150458, term150458.getClass(), "resolveResult", null);
        setField(term150458, term150458.getClass(), "registry", null);
        LinkedHashMap term150452 = new LinkedHashMap();
        Set<Object> term151065 =  ((Map) term150452).keySet();
        term150451 = new LinkedHashSet((Collection<? extends Object>) term151065);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getAllImplementedInterfaces", argTypes, term149760, args);
        assertTrue(recursiveEquals(term149760, term150458));
        assertTrue(recursiveEquals(retValue, term150451));
    }

};


