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

public class JSTypeRegistry_createConstructorTypeWithVarArgs_2004950473135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9664;
     Object term9741;

    public JSTypeRegistry_createConstructorTypeWithVarArgs_2004950473135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term9666 = new HashMap();
        HashMap term9676 = new HashMap();
        Set<Object> term496382 =  ((Map) term9676).keySet();
        HashSet term9675 = new HashSet((Collection<? extends Object>) term496382);
        HashMap term9682 = new HashMap();
        Set<Object> term496383 =  ((Map) term9682).keySet();
        HashSet term9681 = new HashSet((Collection<? extends Object>) term496383);
        HashMap term9688 = new HashMap();
        Set<Object> term496384 =  ((Map) term9688).keySet();
        HashSet term9687 = new HashSet((Collection<? extends Object>) term496384);
        HashMap term9710 = new HashMap();
        HashMap term9725 = new HashMap();
        HashMap term9730 = new HashMap();
        term9664 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term9665 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 0);
        setField(term9664, term9664.getClass(), "reporter", null);
        setField(term9664, term9664.getClass(), "nativeTypes", term9665);
        setField(term9664, term9664.getClass(), "namesToTypes", term9666);
        setField(term9664, term9664.getClass(), "namespaces", term9675);
        setField(term9664, term9664.getClass(), "nonNullableTypeNames", term9681);
        setField(term9664, term9664.getClass(), "forwardDeclaredTypes", term9687);
        setField(term9664, term9664.getClass(), "typesIndexedByProperty", term9710);
        setField(term9664, term9664.getClass(), "eachRefTypeIndexedByProperty", term9725);
        setField(term9664, term9664.getClass(), "greatestSubtypeByProperty", term9730);
        setField(term9664, term9664.getClass(), "interfaceToImplementors", null);
        setField(term9664, term9664.getClass(), "unresolvedNamedTypes", null);
        setField(term9664, term9664.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term9664, term9664.getClass(), "lastGeneration", false);
        setField(term9664, term9664.getClass(), "templateTypeName", null);
        setField(term9664, term9664.getClass(), "templateType", null);
        setBooleanField(term9664, term9664.getClass(), "tolerateUndefinedValues", false);
        setField(term9664, term9664.getClass(), "resolveMode", null);
        term9741 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Array.newInstance(Class.forName("com.google.javascript.rhino.jstype.JSType"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term9741;
        try {
            callMethod(klass, "createConstructorTypeWithVarArgs", argTypes, term9664, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


