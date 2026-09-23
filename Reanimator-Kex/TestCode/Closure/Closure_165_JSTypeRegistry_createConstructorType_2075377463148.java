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
import java.lang.NullPointerException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.Boolean;

public class JSTypeRegistry_createConstructorType_2075377463148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11528;
     Object term11623;
     Object term11625;

    public JSTypeRegistry_createConstructorType_2075377463148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term11530 = new HashMap();
        HashMap term11540 = new HashMap();
        Set<Object> term505271 =  ((Map) term11540).keySet();
        HashSet term11539 = new HashSet((Collection<? extends Object>) term505271);
        HashMap term11557 = new HashMap();
        Set<Object> term505272 =  ((Map) term11557).keySet();
        HashSet term11556 = new HashSet((Collection<? extends Object>) term505272);
        HashMap term11570 = new HashMap();
        Set<Object> term505273 =  ((Map) term11570).keySet();
        HashSet term11569 = new HashSet((Collection<? extends Object>) term505273);
        HashMap term11592 = new HashMap();
        HashMap term11607 = new HashMap();
        HashMap term11612 = new HashMap();
        term11528 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term11529 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 2);
        setField(term11528, term11528.getClass(), "reporter", null);
        setField(term11528, term11528.getClass(), "nativeTypes", term11529);
        setField(term11528, term11528.getClass(), "namesToTypes", term11530);
        setField(term11528, term11528.getClass(), "namespaces", term11539);
        setField(term11528, term11528.getClass(), "nonNullableTypeNames", term11556);
        setField(term11528, term11528.getClass(), "forwardDeclaredTypes", term11569);
        setField(term11528, term11528.getClass(), "typesIndexedByProperty", term11592);
        setField(term11528, term11528.getClass(), "eachRefTypeIndexedByProperty", term11607);
        setField(term11528, term11528.getClass(), "greatestSubtypeByProperty", term11612);
        setField(term11528, term11528.getClass(), "interfaceToImplementors", null);
        setField(term11528, term11528.getClass(), "unresolvedNamedTypes", null);
        setField(term11528, term11528.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term11528, term11528.getClass(), "lastGeneration", false);
        setField(term11528, term11528.getClass(), "templateTypeName", null);
        setField(term11528, term11528.getClass(), "templateType", null);
        setBooleanField(term11528, term11528.getClass(), "tolerateUndefinedValues", false);
        setField(term11528, term11528.getClass(), "resolveMode", null);
        term11623 = new Boolean(true);
        term11625 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 3);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = boolean.class;
        argTypes[2] = Array.newInstance(Class.forName("com.google.javascript.rhino.jstype.JSType"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term11623;
        args[2] = term11625;
        try {
            callMethod(klass, "createConstructorType", argTypes, term11528, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


