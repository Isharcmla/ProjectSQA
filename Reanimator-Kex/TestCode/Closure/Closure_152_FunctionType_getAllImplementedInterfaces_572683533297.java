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

public class FunctionType_getAllImplementedInterfaces_572683533297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176557;
     Object term178487;
     Object term178480;

    public FunctionType_getAllImplementedInterfaces_572683533297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term178495 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term178494 = ((Class) term178495).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term178494).setAccessible(true);
        Object enum322 = ((Field) term178494).get((Object) null);
        ArrayList term176875 = new ArrayList();
        term176557 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term176823 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term176557, term176557.getClass(), "kind", enum322);
        setField(term176823, term176823.getClass(), "implicitPrototypeFallback", null);
        setField(term176557, term176557.getClass(), "prototype", term176823);
        setField(term176557, term176557.getClass(), "implementedInterfaces", term176875);
        Class<? extends Object> term178795 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term178794 = ((Class) term178795).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term178794).setAccessible(true);
        Object enum323 = ((Field) term178794).get((Object) null);
        ArrayList term178492 = new ArrayList();
        term178487 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term178488 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term178487, term178487.getClass(), "call", null);
        setField(term178488, term178488.getClass(), "ownerFunction", null);
        setField(term178488, term178488.getClass(), "className", null);
        setField(term178488, term178488.getClass(), "properties", null);
        setBooleanField(term178488, term178488.getClass(), "nativeType", false);
        setField(term178488, term178488.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term178488, term178488.getClass(), "prettyPrint", false);
        setBooleanField(term178488, term178488.getClass(), "visited", false);
        setField(term178488, term178488.getClass(), "docInfo", null);
        setBooleanField(term178488, term178488.getClass(), "unknown", false);
        setBooleanField(term178488, term178488.getClass(), "resolved", false);
        setField(term178488, term178488.getClass(), "resolveResult", null);
        setField(term178488, term178488.getClass(), "registry", null);
        setField(term178487, term178487.getClass(), "prototype", term178488);
        setField(term178487, term178487.getClass(), "kind", enum323);
        setField(term178487, term178487.getClass(), "typeOfThis", null);
        setField(term178487, term178487.getClass(), "source", null);
        setField(term178487, term178487.getClass(), "implementedInterfaces", term178492);
        setField(term178487, term178487.getClass(), "subTypes", null);
        setField(term178487, term178487.getClass(), "templateTypeName", null);
        setField(term178487, term178487.getClass(), "className", null);
        setField(term178487, term178487.getClass(), "properties", null);
        setBooleanField(term178487, term178487.getClass(), "nativeType", false);
        setField(term178487, term178487.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term178487, term178487.getClass(), "prettyPrint", false);
        setBooleanField(term178487, term178487.getClass(), "visited", false);
        setField(term178487, term178487.getClass(), "docInfo", null);
        setBooleanField(term178487, term178487.getClass(), "unknown", false);
        setBooleanField(term178487, term178487.getClass(), "resolved", false);
        setField(term178487, term178487.getClass(), "resolveResult", null);
        setField(term178487, term178487.getClass(), "registry", null);
        LinkedHashMap term178481 = new LinkedHashMap();
        Set<Object> term179094 =  ((Map) term178481).keySet();
        term178480 = new LinkedHashSet((Collection<? extends Object>) term179094);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getAllImplementedInterfaces", argTypes, term176557, args);
        assertTrue(recursiveEquals(term176557, term178487));
        assertTrue(recursiveEquals(retValue, term178480));
    }

};


