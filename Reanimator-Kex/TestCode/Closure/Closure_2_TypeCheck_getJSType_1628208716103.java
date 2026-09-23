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

public class TypeCheck_getJSType_1628208716103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11027;
     Object term11081;

    public TypeCheck_getJSType_1628208716103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term11031 = new HashMap();
        HashMap term11038 = new HashMap();
        Set<Object> term24982 =  ((Map) term11038).keySet();
        HashSet term11037 = new HashSet((Collection<? extends Object>) term24982);
        HashMap term11044 = new HashMap();
        Set<Object> term24983 =  ((Map) term11044).keySet();
        HashSet term11043 = new HashSet((Collection<? extends Object>) term24983);
        HashMap term11050 = new HashMap();
        Set<Object> term24984 =  ((Map) term11050).keySet();
        HashSet term11049 = new HashSet((Collection<? extends Object>) term24984);
        HashMap term11055 = new HashMap();
        HashMap term11061 = new HashMap();
        HashMap term11066 = new HashMap();
        term11027 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term11028 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term11029 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term11030 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 0);
        setField(term11027, term11027.getClass(), "compiler", null);
        setField(term11028, term11028.getClass(), "compiler", null);
        setField(term11029, term11029.getClass(), "reporter", null);
        setField(term11029, term11029.getClass(), "nativeTypes", term11030);
        setField(term11029, term11029.getClass(), "namesToTypes", term11031);
        setField(term11029, term11029.getClass(), "namespaces", term11037);
        setField(term11029, term11029.getClass(), "nonNullableTypeNames", term11043);
        setField(term11029, term11029.getClass(), "forwardDeclaredTypes", term11049);
        setField(term11029, term11029.getClass(), "typesIndexedByProperty", term11055);
        setField(term11029, term11029.getClass(), "eachRefTypeIndexedByProperty", term11061);
        setField(term11029, term11029.getClass(), "greatestSubtypeByProperty", term11066);
        setField(term11029, term11029.getClass(), "interfaceToImplementors", null);
        setField(term11029, term11029.getClass(), "unresolvedNamedTypes", null);
        setField(term11029, term11029.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term11029, term11029.getClass(), "lastGeneration", false);
        setField(term11029, term11029.getClass(), "templateTypes", null);
        setBooleanField(term11029, term11029.getClass(), "tolerateUndefinedValues", false);
        setField(term11029, term11029.getClass(), "resolveMode", null);
        setField(term11028, term11028.getClass(), "typeRegistry", term11029);
        setField(term11028, term11028.getClass(), "allValueTypes", null);
        setBooleanField(term11028, term11028.getClass(), "shouldReport", false);
        setField(term11028, term11028.getClass(), "nullOrUndefined", null);
        setField(term11028, term11028.getClass(), "mismatches", null);
        setField(term11027, term11027.getClass(), "validator", term11028);
        setField(term11027, term11027.getClass(), "reverseInterpreter", null);
        setField(term11027, term11027.getClass(), "typeRegistry", null);
        setField(term11027, term11027.getClass(), "topScope", null);
        setField(term11027, term11027.getClass(), "scopeCreator", null);
        setField(term11027, term11027.getClass(), "reportMissingOverride", null);
        setField(term11027, term11027.getClass(), "reportUnknownTypes", null);
        setBooleanField(term11027, term11027.getClass(), "reportMissingProperties", false);
        setField(term11027, term11027.getClass(), "inferJSDocInfo", null);
        setIntField(term11027, term11027.getClass(), "typedCount", 0);
        setIntField(term11027, term11027.getClass(), "nullCount", 0);
        setIntField(term11027, term11027.getClass(), "unknownCount", 0);
        setBooleanField(term11027, term11027.getClass(), "inExterns", false);
        setIntField(term11027, term11027.getClass(), "noTypeCheckSection", 0);
        term11081 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11083 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11085 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11087 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11089 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11092 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11096 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11098 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11103 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term11081, term11081.getClass(), "type", 934338954);
        setIntField(term11083, term11083.getClass(), "type", 598635505);
        setIntField(term11085, term11085.getClass(), "type", -944986533);
        setIntField(term11087, term11087.getClass(), "type", 1894454926);
        setIntField(term11089, term11089.getClass(), "type", 1415142780);
        setField(term11089, term11089.getClass(), "next", null);
        setField(term11089, term11089.getClass(), "first", null);
        setField(term11089, term11089.getClass(), "last", null);
        setField(term11089, term11089.getClass(), "propListHead", null);
        setIntField(term11089, term11089.getClass(), "sourcePosition", 0);
        setField(term11089, term11089.getClass(), "jsType", null);
        setField(term11089, term11089.getClass(), "parent", null);
        setField(term11087, term11087.getClass(), "next", term11089);
        setIntField(term11092, term11092.getClass(), "type", -574105759);
        setField(term11092, term11092.getClass(), "next", null);
        setField(term11092, term11092.getClass(), "first", null);
        setField(term11092, term11092.getClass(), "last", term11089);
        setField(term11092, term11092.getClass(), "propListHead", null);
        setIntField(term11092, term11092.getClass(), "sourcePosition", 0);
        setField(term11092, term11092.getClass(), "jsType", null);
        setField(term11092, term11092.getClass(), "parent", null);
        setField(term11087, term11087.getClass(), "first", term11092);
        setField(term11087, term11087.getClass(), "last", term11085);
        setField(term11087, term11087.getClass(), "propListHead", null);
        setIntField(term11087, term11087.getClass(), "sourcePosition", 0);
        setField(term11087, term11087.getClass(), "jsType", null);
        setField(term11087, term11087.getClass(), "parent", null);
        setField(term11085, term11085.getClass(), "next", term11087);
        setField(term11085, term11085.getClass(), "first", term11089);
        setIntField(term11096, term11096.getClass(), "type", 376834234);
        setIntField(term11098, term11098.getClass(), "type", -1911972560);
        setField(term11098, term11098.getClass(), "next", null);
        setField(term11098, term11098.getClass(), "first", term11092);
        setField(term11098, term11098.getClass(), "last", term11087);
        setField(term11098, term11098.getClass(), "propListHead", null);
        setIntField(term11098, term11098.getClass(), "sourcePosition", 0);
        setField(term11098, term11098.getClass(), "jsType", null);
        setField(term11098, term11098.getClass(), "parent", null);
        setField(term11096, term11096.getClass(), "next", term11098);
        setField(term11096, term11096.getClass(), "first", term11083);
        setField(term11096, term11096.getClass(), "last", term11083);
        setField(term11096, term11096.getClass(), "propListHead", null);
        setIntField(term11096, term11096.getClass(), "sourcePosition", 0);
        setField(term11096, term11096.getClass(), "jsType", null);
        setField(term11096, term11096.getClass(), "parent", null);
        setField(term11085, term11085.getClass(), "last", term11096);
        setField(term11085, term11085.getClass(), "propListHead", null);
        setIntField(term11085, term11085.getClass(), "sourcePosition", 0);
        setField(term11085, term11085.getClass(), "jsType", null);
        setField(term11085, term11085.getClass(), "parent", null);
        setField(term11083, term11083.getClass(), "next", term11085);
        setIntField(term11103, term11103.getClass(), "type", -642716895);
        setField(term11103, term11103.getClass(), "next", term11096);
        setField(term11103, term11103.getClass(), "first", term11098);
        setField(term11103, term11103.getClass(), "last", term11081);
        setField(term11103, term11103.getClass(), "propListHead", null);
        setIntField(term11103, term11103.getClass(), "sourcePosition", 0);
        setField(term11103, term11103.getClass(), "jsType", null);
        setField(term11103, term11103.getClass(), "parent", null);
        setField(term11083, term11083.getClass(), "first", term11103);
        setField(term11083, term11083.getClass(), "last", term11103);
        setField(term11083, term11083.getClass(), "propListHead", null);
        setIntField(term11083, term11083.getClass(), "sourcePosition", 0);
        setField(term11083, term11083.getClass(), "jsType", null);
        setField(term11083, term11083.getClass(), "parent", null);
        setField(term11081, term11081.getClass(), "next", term11083);
        setField(term11081, term11081.getClass(), "first", term11087);
        setField(term11081, term11081.getClass(), "last", term11089);
        setField(term11081, term11081.getClass(), "propListHead", null);
        setIntField(term11081, term11081.getClass(), "sourcePosition", 0);
        setField(term11081, term11081.getClass(), "jsType", null);
        setField(term11081, term11081.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term11081;
        try {
            callMethod(klass, "getJSType", argTypes, term11027, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


