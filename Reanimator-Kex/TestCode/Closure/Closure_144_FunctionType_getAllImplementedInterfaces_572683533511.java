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

public class FunctionType_getAllImplementedInterfaces_572683533511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term443330;
     Object term444138;
     Object term444132;

    public FunctionType_getAllImplementedInterfaces_572683533511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term444147 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term444146 = ((Class) term444147).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term444146).setAccessible(true);
        Object enum805 = ((Field) term444146).get((Object) null);
        ArrayList term443736 = new ArrayList();
        term443330 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term443596 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term443684 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term443330, term443330.getClass(), "kind", enum805);
        setField(term443596, term443596.getClass(), "implicitPrototype", term443684);
        setField(term443330, term443330.getClass(), "prototype", term443596);
        setField(term443330, term443330.getClass(), "implementedInterfaces", term443736);
        Class<? extends Object> term444447 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term444446 = ((Class) term444447).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term444446).setAccessible(true);
        Object enum806 = ((Field) term444446).get((Object) null);
        ArrayList term444144 = new ArrayList();
        term444138 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term444139 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term444140 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term444138, term444138.getClass(), "call", null);
        setField(term444139, term444139.getClass(), "ownerFunction", null);
        setField(term444139, term444139.getClass(), "className", null);
        setField(term444139, term444139.getClass(), "properties", null);
        setField(term444140, term444140.getClass(), "leastSupertypeVisitor", null);
        setField(term444140, term444140.getClass(), "greatestSubtypeVisitor", null);
        setField(term444140, term444140.getClass(), "call", null);
        setField(term444140, term444140.getClass(), "prototype", null);
        setField(term444140, term444140.getClass(), "kind", null);
        setField(term444140, term444140.getClass(), "typeOfThis", null);
        setField(term444140, term444140.getClass(), "source", null);
        setField(term444140, term444140.getClass(), "implementedInterfaces", null);
        setField(term444140, term444140.getClass(), "subTypes", null);
        setField(term444140, term444140.getClass(), "templateTypeName", null);
        setField(term444140, term444140.getClass(), "className", null);
        setField(term444140, term444140.getClass(), "properties", null);
        setField(term444140, term444140.getClass(), "implicitPrototype", null);
        setBooleanField(term444140, term444140.getClass(), "nativeType", false);
        setBooleanField(term444140, term444140.getClass(), "prettyPrint", false);
        setBooleanField(term444140, term444140.getClass(), "visited", false);
        setField(term444140, term444140.getClass(), "docInfo", null);
        setBooleanField(term444140, term444140.getClass(), "unknown", false);
        setBooleanField(term444140, term444140.getClass(), "resolved", false);
        setField(term444140, term444140.getClass(), "resolveResult", null);
        setField(term444140, term444140.getClass(), "registry", null);
        setField(term444139, term444139.getClass(), "implicitPrototype", term444140);
        setBooleanField(term444139, term444139.getClass(), "nativeType", false);
        setBooleanField(term444139, term444139.getClass(), "prettyPrint", false);
        setBooleanField(term444139, term444139.getClass(), "visited", false);
        setField(term444139, term444139.getClass(), "docInfo", null);
        setBooleanField(term444139, term444139.getClass(), "unknown", false);
        setBooleanField(term444139, term444139.getClass(), "resolved", false);
        setField(term444139, term444139.getClass(), "resolveResult", null);
        setField(term444139, term444139.getClass(), "registry", null);
        setField(term444138, term444138.getClass(), "prototype", term444139);
        setField(term444138, term444138.getClass(), "kind", enum806);
        setField(term444138, term444138.getClass(), "typeOfThis", null);
        setField(term444138, term444138.getClass(), "source", null);
        setField(term444138, term444138.getClass(), "implementedInterfaces", term444144);
        setField(term444138, term444138.getClass(), "subTypes", null);
        setField(term444138, term444138.getClass(), "templateTypeName", null);
        setField(term444138, term444138.getClass(), "className", null);
        setField(term444138, term444138.getClass(), "properties", null);
        setField(term444138, term444138.getClass(), "implicitPrototype", null);
        setBooleanField(term444138, term444138.getClass(), "nativeType", false);
        setBooleanField(term444138, term444138.getClass(), "prettyPrint", false);
        setBooleanField(term444138, term444138.getClass(), "visited", false);
        setField(term444138, term444138.getClass(), "docInfo", null);
        setBooleanField(term444138, term444138.getClass(), "unknown", false);
        setBooleanField(term444138, term444138.getClass(), "resolved", false);
        setField(term444138, term444138.getClass(), "resolveResult", null);
        setField(term444138, term444138.getClass(), "registry", null);
        HashMap term444133 = new HashMap();
        Set<Object> term444746 =  ((Map) term444133).keySet();
        term444132 = new HashSet((Collection<? extends Object>) term444746);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getAllImplementedInterfaces", argTypes, term443330, args);
        assertTrue(recursiveEquals(term443330, term444138));
        assertTrue(recursiveEquals(retValue, term444132));
    }

};


