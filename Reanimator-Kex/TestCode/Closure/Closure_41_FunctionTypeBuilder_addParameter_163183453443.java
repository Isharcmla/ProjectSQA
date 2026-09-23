package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.Boolean;

public class FunctionTypeBuilder_addParameter_163183453443 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6907;
     Object term6994;
     Object term7051;
     Object term7053;
     Object term7055;

    public FunctionTypeBuilder_addParameter_163183453443() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6922 = new HashMap();
        HashMap term6931 = new HashMap();
        Set<Object> term13304 =  ((Map) term6931).keySet();
        HashSet term6930 = new HashSet((Collection<? extends Object>) term13304);
        HashMap term6937 = new HashMap();
        Set<Object> term13305 =  ((Map) term6937).keySet();
        HashSet term6936 = new HashSet((Collection<? extends Object>) term13305);
        HashMap term6944 = new HashMap();
        Set<Object> term13306 =  ((Map) term6944).keySet();
        HashSet term6943 = new HashSet((Collection<? extends Object>) term13306);
        HashMap term6950 = new HashMap();
        HashMap term6958 = new HashMap();
        HashMap term6963 = new HashMap();
        term6907 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term6920 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term6921 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 2);
        Object term6973 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6988 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term6907, term6907.getClass(), "fnName", "SrWMUlbtWV");
        setField(term6907, term6907.getClass(), "compiler", null);
        setField(term6907, term6907.getClass(), "codingConvention", null);
        setField(term6920, term6920.getClass(), "reporter", null);
        setField(term6920, term6920.getClass(), "nativeTypes", term6921);
        setField(term6920, term6920.getClass(), "namesToTypes", term6922);
        setField(term6920, term6920.getClass(), "namespaces", term6930);
        setField(term6920, term6920.getClass(), "nonNullableTypeNames", term6936);
        setField(term6920, term6920.getClass(), "forwardDeclaredTypes", term6943);
        setField(term6920, term6920.getClass(), "typesIndexedByProperty", term6950);
        setField(term6920, term6920.getClass(), "eachRefTypeIndexedByProperty", term6958);
        setField(term6920, term6920.getClass(), "greatestSubtypeByProperty", term6963);
        setField(term6920, term6920.getClass(), "interfaceToImplementors", null);
        setField(term6920, term6920.getClass(), "unresolvedNamedTypes", null);
        setField(term6920, term6920.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term6920, term6920.getClass(), "lastGeneration", false);
        setField(term6920, term6920.getClass(), "templateTypeName", null);
        setField(term6920, term6920.getClass(), "templateType", null);
        setBooleanField(term6920, term6920.getClass(), "tolerateUndefinedValues", false);
        setField(term6920, term6920.getClass(), "resolveMode", null);
        setField(term6907, term6907.getClass(), "typeRegistry", term6920);
        setIntField(term6973, term6973.getClass(), "type", 0);
        setField(term6973, term6973.getClass(), "next", null);
        setField(term6973, term6973.getClass(), "first", null);
        setField(term6973, term6973.getClass(), "last", null);
        setField(term6973, term6973.getClass(), "propListHead", null);
        setIntField(term6973, term6973.getClass(), "sourcePosition", 0);
        setField(term6973, term6973.getClass(), "jsType", null);
        setField(term6973, term6973.getClass(), "parent", null);
        setField(term6907, term6907.getClass(), "errorRoot", term6973);
        setField(term6907, term6907.getClass(), "sourceName", "AhOHzCsHKW");
        setField(term6988, term6988.getClass(), "vars", null);
        setField(term6988, term6988.getClass(), "parent", null);
        setIntField(term6988, term6988.getClass(), "depth", 0);
        setField(term6988, term6988.getClass(), "rootNode", null);
        setField(term6988, term6988.getClass(), "thisType", null);
        setBooleanField(term6988, term6988.getClass(), "isBottom", false);
        setField(term6988, term6988.getClass(), "arguments", null);
        setField(term6907, term6907.getClass(), "scope", term6988);
        setField(term6907, term6907.getClass(), "contents", null);
        setField(term6907, term6907.getClass(), "returnType", null);
        setBooleanField(term6907, term6907.getClass(), "returnTypeInferred", false);
        setField(term6907, term6907.getClass(), "implementedInterfaces", null);
        setField(term6907, term6907.getClass(), "extendedInterfaces", null);
        setField(term6907, term6907.getClass(), "baseType", null);
        setField(term6907, term6907.getClass(), "thisType", null);
        setBooleanField(term6907, term6907.getClass(), "isConstructor", false);
        setBooleanField(term6907, term6907.getClass(), "isInterface", false);
        setField(term6907, term6907.getClass(), "parametersNode", null);
        setField(term6907, term6907.getClass(), "templateTypeName", null);
        HashMap term6997 = new HashMap();
        HashMap term7006 = new HashMap();
        Set<Object> term13317 =  ((Map) term7006).keySet();
        HashSet term7005 = new HashSet((Collection<? extends Object>) term13317);
        HashMap term7013 = new HashMap();
        Set<Object> term13318 =  ((Map) term7013).keySet();
        HashSet term7012 = new HashSet((Collection<? extends Object>) term13318);
        HashMap term7019 = new HashMap();
        Set<Object> term13319 =  ((Map) term7019).keySet();
        HashSet term7018 = new HashSet((Collection<? extends Object>) term13319);
        HashMap term7025 = new HashMap();
        HashMap term7033 = new HashMap();
        HashMap term7038 = new HashMap();
        term6994 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionParamBuilder"));
        Object term6995 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term6996 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 5);
        Object term7048 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term6995, term6995.getClass(), "reporter", null);
        setField(term6995, term6995.getClass(), "nativeTypes", term6996);
        setField(term6995, term6995.getClass(), "namesToTypes", term6997);
        setField(term6995, term6995.getClass(), "namespaces", term7005);
        setField(term6995, term6995.getClass(), "nonNullableTypeNames", term7012);
        setField(term6995, term6995.getClass(), "forwardDeclaredTypes", term7018);
        setField(term6995, term6995.getClass(), "typesIndexedByProperty", term7025);
        setField(term6995, term6995.getClass(), "eachRefTypeIndexedByProperty", term7033);
        setField(term6995, term6995.getClass(), "greatestSubtypeByProperty", term7038);
        setField(term6995, term6995.getClass(), "interfaceToImplementors", null);
        setField(term6995, term6995.getClass(), "unresolvedNamedTypes", null);
        setField(term6995, term6995.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term6995, term6995.getClass(), "lastGeneration", false);
        setField(term6995, term6995.getClass(), "templateTypeName", null);
        setField(term6995, term6995.getClass(), "templateType", null);
        setBooleanField(term6995, term6995.getClass(), "tolerateUndefinedValues", false);
        setField(term6995, term6995.getClass(), "resolveMode", null);
        setField(term6994, term6994.getClass(), "registry", term6995);
        setIntField(term7048, term7048.getClass(), "type", 0);
        setField(term7048, term7048.getClass(), "next", null);
        setField(term7048, term7048.getClass(), "first", null);
        setField(term7048, term7048.getClass(), "last", null);
        setField(term7048, term7048.getClass(), "propListHead", null);
        setIntField(term7048, term7048.getClass(), "sourcePosition", 0);
        setField(term7048, term7048.getClass(), "jsType", null);
        setField(term7048, term7048.getClass(), "parent", null);
        setField(term6994, term6994.getClass(), "root", term7048);
        term7051 = new Boolean(true);
        term7053 = new Boolean(true);
        term7055 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionParamBuilder");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[2] = boolean.class;
        argTypes[3] = boolean.class;
        argTypes[4] = boolean.class;
        Object[] args = new Object[5];
        args[0] = term6994;
        args[1] = null;
        args[2] = term7051;
        args[3] = term7053;
        args[4] = term7055;
        try {
            callMethod(klass, "addParameter", argTypes, term6907, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


