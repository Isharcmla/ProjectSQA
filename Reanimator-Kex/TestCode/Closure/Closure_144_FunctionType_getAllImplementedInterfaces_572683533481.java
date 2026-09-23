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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class FunctionType_getAllImplementedInterfaces_572683533481 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term407870;
     Object term408566;
     Object term408560;

    public FunctionType_getAllImplementedInterfaces_572683533481() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term408574 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term408573 = ((Class) term408574).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term408573).setAccessible(true);
        Object enum739 = ((Field) term408573).get((Object) null);
        ArrayList term408188 = new ArrayList();
        term407870 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term408136 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term407870, term407870.getClass(), "kind", enum739);
        setField(term408136, term408136.getClass(), "implicitPrototype", null);
        setField(term407870, term407870.getClass(), "prototype", term408136);
        setField(term407870, term407870.getClass(), "implementedInterfaces", term408188);
        Class<? extends Object> term408874 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term408873 = ((Class) term408874).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term408873).setAccessible(true);
        Object enum740 = ((Field) term408873).get((Object) null);
        ArrayList term408571 = new ArrayList();
        term408566 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term408567 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term408566, term408566.getClass(), "call", null);
        setField(term408567, term408567.getClass(), "ownerFunction", null);
        setField(term408567, term408567.getClass(), "className", null);
        setField(term408567, term408567.getClass(), "properties", null);
        setField(term408567, term408567.getClass(), "implicitPrototype", null);
        setBooleanField(term408567, term408567.getClass(), "nativeType", false);
        setBooleanField(term408567, term408567.getClass(), "prettyPrint", false);
        setBooleanField(term408567, term408567.getClass(), "visited", false);
        setField(term408567, term408567.getClass(), "docInfo", null);
        setBooleanField(term408567, term408567.getClass(), "unknown", false);
        setBooleanField(term408567, term408567.getClass(), "resolved", false);
        setField(term408567, term408567.getClass(), "resolveResult", null);
        setField(term408567, term408567.getClass(), "registry", null);
        setField(term408566, term408566.getClass(), "prototype", term408567);
        setField(term408566, term408566.getClass(), "kind", enum740);
        setField(term408566, term408566.getClass(), "typeOfThis", null);
        setField(term408566, term408566.getClass(), "source", null);
        setField(term408566, term408566.getClass(), "implementedInterfaces", term408571);
        setField(term408566, term408566.getClass(), "subTypes", null);
        setField(term408566, term408566.getClass(), "templateTypeName", null);
        setField(term408566, term408566.getClass(), "className", null);
        setField(term408566, term408566.getClass(), "properties", null);
        setField(term408566, term408566.getClass(), "implicitPrototype", null);
        setBooleanField(term408566, term408566.getClass(), "nativeType", false);
        setBooleanField(term408566, term408566.getClass(), "prettyPrint", false);
        setBooleanField(term408566, term408566.getClass(), "visited", false);
        setField(term408566, term408566.getClass(), "docInfo", null);
        setBooleanField(term408566, term408566.getClass(), "unknown", false);
        setBooleanField(term408566, term408566.getClass(), "resolved", false);
        setField(term408566, term408566.getClass(), "resolveResult", null);
        setField(term408566, term408566.getClass(), "registry", null);
        HashMap term408561 = new HashMap();
        Set<Object> term409173 =  ((Map) term408561).keySet();
        term408560 = new HashSet((Collection<? extends Object>) term409173);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getAllImplementedInterfaces", argTypes, term407870, args);
        assertTrue(recursiveEquals(term407870, term408566));
        assertTrue(recursiveEquals(retValue, term408560));
    }

};


