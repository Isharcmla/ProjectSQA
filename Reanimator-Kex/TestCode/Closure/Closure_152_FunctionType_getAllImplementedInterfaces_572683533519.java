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

public class FunctionType_getAllImplementedInterfaces_572683533519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term472441;
     Object term473248;
     Object term473240;

    public FunctionType_getAllImplementedInterfaces_572683533519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term473257 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term473256 = ((Class) term473257).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term473256).setAccessible(true);
        Object enum767 = ((Field) term473256).get((Object) null);
        Object term472859 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        ArrayList term472759 = new ArrayList();
        ((ArrayList) term472759).add(term472859);
        term472441 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term472707 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term472441, term472441.getClass(), "kind", enum767);
        setField(term472707, term472707.getClass(), "implicitPrototypeFallback", null);
        setField(term472441, term472441.getClass(), "prototype", term472707);
        setField(term472441, term472441.getClass(), "implementedInterfaces", term472759);
        Class<? extends Object> term473557 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term473556 = ((Class) term473557).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term473556).setAccessible(true);
        Object enum768 = ((Field) term473556).get((Object) null);
        Object term473255 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term473255, term473255.getClass(), "name", null);
        setField(term473255, term473255.getClass(), "referencedType", null);
        setField(term473255, term473255.getClass(), "referencedObjType", null);
        setBooleanField(term473255, term473255.getClass(), "visited", false);
        setField(term473255, term473255.getClass(), "docInfo", null);
        setBooleanField(term473255, term473255.getClass(), "unknown", false);
        setBooleanField(term473255, term473255.getClass(), "resolved", false);
        setField(term473255, term473255.getClass(), "resolveResult", null);
        setField(term473255, term473255.getClass(), "registry", null);
        ArrayList term473253 = new ArrayList();
        ((ArrayList) term473253).add(term473255);
        term473248 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term473249 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term473248, term473248.getClass(), "call", null);
        setField(term473249, term473249.getClass(), "ownerFunction", null);
        setField(term473249, term473249.getClass(), "className", null);
        setField(term473249, term473249.getClass(), "properties", null);
        setBooleanField(term473249, term473249.getClass(), "nativeType", false);
        setField(term473249, term473249.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term473249, term473249.getClass(), "prettyPrint", false);
        setBooleanField(term473249, term473249.getClass(), "visited", false);
        setField(term473249, term473249.getClass(), "docInfo", null);
        setBooleanField(term473249, term473249.getClass(), "unknown", false);
        setBooleanField(term473249, term473249.getClass(), "resolved", false);
        setField(term473249, term473249.getClass(), "resolveResult", null);
        setField(term473249, term473249.getClass(), "registry", null);
        setField(term473248, term473248.getClass(), "prototype", term473249);
        setField(term473248, term473248.getClass(), "kind", enum768);
        setField(term473248, term473248.getClass(), "typeOfThis", null);
        setField(term473248, term473248.getClass(), "source", null);
        setField(term473248, term473248.getClass(), "implementedInterfaces", term473253);
        setField(term473248, term473248.getClass(), "subTypes", null);
        setField(term473248, term473248.getClass(), "templateTypeName", null);
        setField(term473248, term473248.getClass(), "className", null);
        setField(term473248, term473248.getClass(), "properties", null);
        setBooleanField(term473248, term473248.getClass(), "nativeType", false);
        setField(term473248, term473248.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term473248, term473248.getClass(), "prettyPrint", false);
        setBooleanField(term473248, term473248.getClass(), "visited", false);
        setField(term473248, term473248.getClass(), "docInfo", null);
        setBooleanField(term473248, term473248.getClass(), "unknown", false);
        setBooleanField(term473248, term473248.getClass(), "resolved", false);
        setField(term473248, term473248.getClass(), "resolveResult", null);
        setField(term473248, term473248.getClass(), "registry", null);
        LinkedHashMap term473241 = new LinkedHashMap();
        Set<Object> term473856 =  ((Map) term473241).keySet();
        term473240 = new LinkedHashSet((Collection<? extends Object>) term473856);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getAllImplementedInterfaces", argTypes, term472441, args);
        assertTrue(recursiveEquals(term472441, term473248));
        assertTrue(recursiveEquals(retValue, term473240));
    }

};


