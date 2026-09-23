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
import java.lang.ArrayIndexOutOfBoundsException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.Integer;

public class JSTypeRegistry_createNamedType_1855252281158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12667;
     Object term12770;
     Object term12772;

    public JSTypeRegistry_createNamedType_1855252281158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term12669 = new HashMap();
        HashMap term12679 = new HashMap();
        Set<Object> term507887 =  ((Map) term12679).keySet();
        HashSet term12678 = new HashSet((Collection<? extends Object>) term507887);
        HashMap term12696 = new HashMap();
        Set<Object> term507888 =  ((Map) term12696).keySet();
        HashSet term12695 = new HashSet((Collection<? extends Object>) term507888);
        HashMap term12705 = new HashMap();
        Set<Object> term507889 =  ((Map) term12705).keySet();
        HashSet term12704 = new HashSet((Collection<? extends Object>) term507889);
        HashMap term12715 = new HashMap();
        HashMap term12730 = new HashMap();
        HashMap term12735 = new HashMap();
        term12667 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term12668 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 9);
        setField(term12667, term12667.getClass(), "reporter", null);
        setField(term12667, term12667.getClass(), "nativeTypes", term12668);
        setField(term12667, term12667.getClass(), "namesToTypes", term12669);
        setField(term12667, term12667.getClass(), "namespaces", term12678);
        setField(term12667, term12667.getClass(), "nonNullableTypeNames", term12695);
        setField(term12667, term12667.getClass(), "forwardDeclaredTypes", term12704);
        setField(term12667, term12667.getClass(), "typesIndexedByProperty", term12715);
        setField(term12667, term12667.getClass(), "eachRefTypeIndexedByProperty", term12730);
        setField(term12667, term12667.getClass(), "greatestSubtypeByProperty", term12735);
        setField(term12667, term12667.getClass(), "interfaceToImplementors", null);
        setField(term12667, term12667.getClass(), "unresolvedNamedTypes", null);
        setField(term12667, term12667.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term12667, term12667.getClass(), "lastGeneration", false);
        setField(term12667, term12667.getClass(), "templateTypeName", null);
        setField(term12667, term12667.getClass(), "templateType", null);
        setBooleanField(term12667, term12667.getClass(), "tolerateUndefinedValues", false);
        setField(term12667, term12667.getClass(), "resolveMode", null);
        term12770 = new Integer(5603560);
        term12772 = new Integer(-1079020032);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = "abzzbYwTRo";
        args[1] = "HxIZqtNMYu";
        args[2] = term12770;
        args[3] = term12772;
        try {
            callMethod(klass, "createNamedType", argTypes, term12667, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


