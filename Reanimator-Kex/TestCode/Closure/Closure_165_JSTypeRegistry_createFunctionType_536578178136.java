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
import java.util.LinkedList;

public class JSTypeRegistry_createFunctionType_536578178136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9745;
     Object term9842;

    public JSTypeRegistry_createFunctionType_536578178136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term9747 = new HashMap();
        HashMap term9757 = new HashMap();
        Set<Object> term496993 =  ((Map) term9757).keySet();
        HashSet term9756 = new HashSet((Collection<? extends Object>) term496993);
        HashMap term9778 = new HashMap();
        Set<Object> term496994 =  ((Map) term9778).keySet();
        HashSet term9777 = new HashSet((Collection<? extends Object>) term496994);
        HashMap term9789 = new HashMap();
        Set<Object> term496995 =  ((Map) term9789).keySet();
        HashSet term9788 = new HashSet((Collection<? extends Object>) term496995);
        HashMap term9811 = new HashMap();
        HashMap term9826 = new HashMap();
        HashMap term9831 = new HashMap();
        term9745 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term9746 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 5);
        setField(term9745, term9745.getClass(), "reporter", null);
        setField(term9745, term9745.getClass(), "nativeTypes", term9746);
        setField(term9745, term9745.getClass(), "namesToTypes", term9747);
        setField(term9745, term9745.getClass(), "namespaces", term9756);
        setField(term9745, term9745.getClass(), "nonNullableTypeNames", term9777);
        setField(term9745, term9745.getClass(), "forwardDeclaredTypes", term9788);
        setField(term9745, term9745.getClass(), "typesIndexedByProperty", term9811);
        setField(term9745, term9745.getClass(), "eachRefTypeIndexedByProperty", term9826);
        setField(term9745, term9745.getClass(), "greatestSubtypeByProperty", term9831);
        setField(term9745, term9745.getClass(), "interfaceToImplementors", null);
        setField(term9745, term9745.getClass(), "unresolvedNamedTypes", null);
        setField(term9745, term9745.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term9745, term9745.getClass(), "lastGeneration", false);
        setField(term9745, term9745.getClass(), "templateTypeName", null);
        setField(term9745, term9745.getClass(), "templateType", null);
        setBooleanField(term9745, term9745.getClass(), "tolerateUndefinedValues", false);
        setField(term9745, term9745.getClass(), "resolveMode", null);
        term9842 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[2] = Class.forName("java.util.List");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term9842;
        try {
            callMethod(klass, "createFunctionType", argTypes, term9745, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


