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

public class JSTypeRegistry_createFunctionTypeWithVarArgs_1025399424137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9848;
     Object term9922;

    public JSTypeRegistry_createFunctionTypeWithVarArgs_1025399424137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term9850 = new HashMap();
        HashMap term9860 = new HashMap();
        Set<Object> term497604 =  ((Map) term9860).keySet();
        HashSet term9859 = new HashSet((Collection<? extends Object>) term497604);
        HashMap term9871 = new HashMap();
        Set<Object> term497605 =  ((Map) term9871).keySet();
        HashSet term9870 = new HashSet((Collection<? extends Object>) term497605);
        HashMap term9886 = new HashMap();
        Set<Object> term497606 =  ((Map) term9886).keySet();
        HashSet term9885 = new HashSet((Collection<? extends Object>) term497606);
        HashMap term9891 = new HashMap();
        HashMap term9906 = new HashMap();
        HashMap term9911 = new HashMap();
        term9848 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term9849 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 6);
        setField(term9848, term9848.getClass(), "reporter", null);
        setField(term9848, term9848.getClass(), "nativeTypes", term9849);
        setField(term9848, term9848.getClass(), "namesToTypes", term9850);
        setField(term9848, term9848.getClass(), "namespaces", term9859);
        setField(term9848, term9848.getClass(), "nonNullableTypeNames", term9870);
        setField(term9848, term9848.getClass(), "forwardDeclaredTypes", term9885);
        setField(term9848, term9848.getClass(), "typesIndexedByProperty", term9891);
        setField(term9848, term9848.getClass(), "eachRefTypeIndexedByProperty", term9906);
        setField(term9848, term9848.getClass(), "greatestSubtypeByProperty", term9911);
        setField(term9848, term9848.getClass(), "interfaceToImplementors", null);
        setField(term9848, term9848.getClass(), "unresolvedNamedTypes", null);
        setField(term9848, term9848.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term9848, term9848.getClass(), "lastGeneration", false);
        setField(term9848, term9848.getClass(), "templateTypeName", null);
        setField(term9848, term9848.getClass(), "templateType", null);
        setBooleanField(term9848, term9848.getClass(), "tolerateUndefinedValues", false);
        setField(term9848, term9848.getClass(), "resolveMode", null);
        term9922 = new LinkedList();
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
        args[2] = term9922;
        try {
            callMethod(klass, "createFunctionTypeWithVarArgs", argTypes, term9848, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


