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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class TypeCheck_getTypedPercent_6213520105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12887;
     Object term25295;

    public TypeCheck_getTypedPercent_6213520105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term12891 = new HashMap();
        HashMap term12898 = new HashMap();
        Set<Object> term25309 =  ((Map) term12898).keySet();
        HashSet term12897 = new HashSet((Collection<? extends Object>) term25309);
        HashMap term12904 = new HashMap();
        Set<Object> term25310 =  ((Map) term12904).keySet();
        HashSet term12903 = new HashSet((Collection<? extends Object>) term25310);
        HashMap term12910 = new HashMap();
        Set<Object> term25311 =  ((Map) term12910).keySet();
        HashSet term12909 = new HashSet((Collection<? extends Object>) term25311);
        HashMap term12915 = new HashMap();
        HashMap term12921 = new HashMap();
        HashMap term12926 = new HashMap();
        term12887 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term12888 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term12889 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term12890 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 4);
        setField(term12887, term12887.getClass(), "compiler", null);
        setField(term12888, term12888.getClass(), "compiler", null);
        setField(term12889, term12889.getClass(), "reporter", null);
        setField(term12889, term12889.getClass(), "nativeTypes", term12890);
        setField(term12889, term12889.getClass(), "namesToTypes", term12891);
        setField(term12889, term12889.getClass(), "namespaces", term12897);
        setField(term12889, term12889.getClass(), "nonNullableTypeNames", term12903);
        setField(term12889, term12889.getClass(), "forwardDeclaredTypes", term12909);
        setField(term12889, term12889.getClass(), "typesIndexedByProperty", term12915);
        setField(term12889, term12889.getClass(), "eachRefTypeIndexedByProperty", term12921);
        setField(term12889, term12889.getClass(), "greatestSubtypeByProperty", term12926);
        setField(term12889, term12889.getClass(), "interfaceToImplementors", null);
        setField(term12889, term12889.getClass(), "unresolvedNamedTypes", null);
        setField(term12889, term12889.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term12889, term12889.getClass(), "lastGeneration", false);
        setField(term12889, term12889.getClass(), "templateTypes", null);
        setBooleanField(term12889, term12889.getClass(), "tolerateUndefinedValues", false);
        setField(term12889, term12889.getClass(), "resolveMode", null);
        setField(term12888, term12888.getClass(), "typeRegistry", term12889);
        setField(term12888, term12888.getClass(), "allValueTypes", null);
        setBooleanField(term12888, term12888.getClass(), "shouldReport", false);
        setField(term12888, term12888.getClass(), "nullOrUndefined", null);
        setField(term12888, term12888.getClass(), "mismatches", null);
        setField(term12887, term12887.getClass(), "validator", term12888);
        setField(term12887, term12887.getClass(), "reverseInterpreter", null);
        setField(term12887, term12887.getClass(), "typeRegistry", null);
        setField(term12887, term12887.getClass(), "topScope", null);
        setField(term12887, term12887.getClass(), "scopeCreator", null);
        setField(term12887, term12887.getClass(), "reportMissingOverride", null);
        setField(term12887, term12887.getClass(), "reportUnknownTypes", null);
        setBooleanField(term12887, term12887.getClass(), "reportMissingProperties", false);
        setField(term12887, term12887.getClass(), "inferJSDocInfo", null);
        setIntField(term12887, term12887.getClass(), "typedCount", 0);
        setIntField(term12887, term12887.getClass(), "nullCount", 0);
        setIntField(term12887, term12887.getClass(), "unknownCount", 0);
        setBooleanField(term12887, term12887.getClass(), "inExterns", false);
        setIntField(term12887, term12887.getClass(), "noTypeCheckSection", 0);
        HashMap term25299 = new HashMap();
        HashMap term25301 = new HashMap();
        Set<Object> term25312 =  ((Map) term25301).keySet();
        HashSet term25300 = new HashSet((Collection<? extends Object>) term25312);
        HashMap term25303 = new HashMap();
        Set<Object> term25313 =  ((Map) term25303).keySet();
        HashSet term25302 = new HashSet((Collection<? extends Object>) term25313);
        HashMap term25305 = new HashMap();
        Set<Object> term25314 =  ((Map) term25305).keySet();
        HashSet term25304 = new HashSet((Collection<? extends Object>) term25314);
        HashMap term25306 = new HashMap();
        HashMap term25307 = new HashMap();
        HashMap term25308 = new HashMap();
        term25295 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term25296 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term25297 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term25298 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 4);
        setField(term25295, term25295.getClass(), "compiler", null);
        setField(term25296, term25296.getClass(), "compiler", null);
        setField(term25297, term25297.getClass(), "reporter", null);
        setField(term25297, term25297.getClass(), "nativeTypes", term25298);
        setField(term25297, term25297.getClass(), "namesToTypes", term25299);
        setField(term25297, term25297.getClass(), "namespaces", term25300);
        setField(term25297, term25297.getClass(), "nonNullableTypeNames", term25302);
        setField(term25297, term25297.getClass(), "forwardDeclaredTypes", term25304);
        setField(term25297, term25297.getClass(), "typesIndexedByProperty", term25306);
        setField(term25297, term25297.getClass(), "eachRefTypeIndexedByProperty", term25307);
        setField(term25297, term25297.getClass(), "greatestSubtypeByProperty", term25308);
        setField(term25297, term25297.getClass(), "interfaceToImplementors", null);
        setField(term25297, term25297.getClass(), "unresolvedNamedTypes", null);
        setField(term25297, term25297.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term25297, term25297.getClass(), "lastGeneration", false);
        setField(term25297, term25297.getClass(), "templateTypes", null);
        setBooleanField(term25297, term25297.getClass(), "tolerateUndefinedValues", false);
        setField(term25297, term25297.getClass(), "resolveMode", null);
        setField(term25296, term25296.getClass(), "typeRegistry", term25297);
        setField(term25296, term25296.getClass(), "allValueTypes", null);
        setBooleanField(term25296, term25296.getClass(), "shouldReport", false);
        setField(term25296, term25296.getClass(), "nullOrUndefined", null);
        setField(term25296, term25296.getClass(), "mismatches", null);
        setField(term25295, term25295.getClass(), "validator", term25296);
        setField(term25295, term25295.getClass(), "reverseInterpreter", null);
        setField(term25295, term25295.getClass(), "typeRegistry", null);
        setField(term25295, term25295.getClass(), "topScope", null);
        setField(term25295, term25295.getClass(), "scopeCreator", null);
        setField(term25295, term25295.getClass(), "reportMissingOverride", null);
        setField(term25295, term25295.getClass(), "reportUnknownTypes", null);
        setBooleanField(term25295, term25295.getClass(), "reportMissingProperties", false);
        setField(term25295, term25295.getClass(), "inferJSDocInfo", null);
        setIntField(term25295, term25295.getClass(), "typedCount", 0);
        setIntField(term25295, term25295.getClass(), "nullCount", 0);
        setIntField(term25295, term25295.getClass(), "unknownCount", 0);
        setBooleanField(term25295, term25295.getClass(), "inExterns", false);
        setIntField(term25295, term25295.getClass(), "noTypeCheckSection", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getTypedPercent", argTypes, term12887, args);
        assertTrue(recursiveEquals(term12887, term25295));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


