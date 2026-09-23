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

public class TypeCheck_isPropertyTest_65727588290 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7652;
     Object term7706;

    public TypeCheck_isPropertyTest_65727588290() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7656 = new HashMap();
        HashMap term7663 = new HashMap();
        Set<Object> term21966 =  ((Map) term7663).keySet();
        HashSet term7662 = new HashSet((Collection<? extends Object>) term21966);
        HashMap term7669 = new HashMap();
        Set<Object> term21967 =  ((Map) term7669).keySet();
        HashSet term7668 = new HashSet((Collection<? extends Object>) term21967);
        HashMap term7675 = new HashMap();
        Set<Object> term21968 =  ((Map) term7675).keySet();
        HashSet term7674 = new HashSet((Collection<? extends Object>) term21968);
        HashMap term7680 = new HashMap();
        HashMap term7686 = new HashMap();
        HashMap term7691 = new HashMap();
        term7652 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term7653 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term7654 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term7655 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 5);
        setField(term7652, term7652.getClass(), "compiler", null);
        setField(term7653, term7653.getClass(), "compiler", null);
        setField(term7654, term7654.getClass(), "reporter", null);
        setField(term7654, term7654.getClass(), "nativeTypes", term7655);
        setField(term7654, term7654.getClass(), "namesToTypes", term7656);
        setField(term7654, term7654.getClass(), "namespaces", term7662);
        setField(term7654, term7654.getClass(), "nonNullableTypeNames", term7668);
        setField(term7654, term7654.getClass(), "forwardDeclaredTypes", term7674);
        setField(term7654, term7654.getClass(), "typesIndexedByProperty", term7680);
        setField(term7654, term7654.getClass(), "eachRefTypeIndexedByProperty", term7686);
        setField(term7654, term7654.getClass(), "greatestSubtypeByProperty", term7691);
        setField(term7654, term7654.getClass(), "interfaceToImplementors", null);
        setField(term7654, term7654.getClass(), "unresolvedNamedTypes", null);
        setField(term7654, term7654.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term7654, term7654.getClass(), "lastGeneration", false);
        setField(term7654, term7654.getClass(), "templateTypes", null);
        setBooleanField(term7654, term7654.getClass(), "tolerateUndefinedValues", false);
        setField(term7654, term7654.getClass(), "resolveMode", null);
        setField(term7653, term7653.getClass(), "typeRegistry", term7654);
        setField(term7653, term7653.getClass(), "allValueTypes", null);
        setBooleanField(term7653, term7653.getClass(), "shouldReport", false);
        setField(term7653, term7653.getClass(), "nullOrUndefined", null);
        setField(term7653, term7653.getClass(), "mismatches", null);
        setField(term7652, term7652.getClass(), "validator", term7653);
        setField(term7652, term7652.getClass(), "reverseInterpreter", null);
        setField(term7652, term7652.getClass(), "typeRegistry", null);
        setField(term7652, term7652.getClass(), "topScope", null);
        setField(term7652, term7652.getClass(), "scopeCreator", null);
        setField(term7652, term7652.getClass(), "reportMissingOverride", null);
        setField(term7652, term7652.getClass(), "reportUnknownTypes", null);
        setBooleanField(term7652, term7652.getClass(), "reportMissingProperties", false);
        setField(term7652, term7652.getClass(), "inferJSDocInfo", null);
        setIntField(term7652, term7652.getClass(), "typedCount", 0);
        setIntField(term7652, term7652.getClass(), "nullCount", 0);
        setIntField(term7652, term7652.getClass(), "unknownCount", 0);
        setBooleanField(term7652, term7652.getClass(), "inExterns", false);
        setIntField(term7652, term7652.getClass(), "noTypeCheckSection", 0);
        term7706 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7708 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7710 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7712 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7714 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7717 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7721 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7723 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7728 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term7706, term7706.getClass(), "type", -1945635750);
        setIntField(term7708, term7708.getClass(), "type", -1622760744);
        setIntField(term7710, term7710.getClass(), "type", 2068435279);
        setIntField(term7712, term7712.getClass(), "type", -1556527718);
        setIntField(term7714, term7714.getClass(), "type", 895255351);
        setField(term7714, term7714.getClass(), "next", null);
        setField(term7714, term7714.getClass(), "first", null);
        setField(term7714, term7714.getClass(), "last", null);
        setField(term7714, term7714.getClass(), "propListHead", null);
        setIntField(term7714, term7714.getClass(), "sourcePosition", 0);
        setField(term7714, term7714.getClass(), "jsType", null);
        setField(term7714, term7714.getClass(), "parent", null);
        setField(term7712, term7712.getClass(), "next", term7714);
        setIntField(term7717, term7717.getClass(), "type", -1317044799);
        setField(term7717, term7717.getClass(), "next", null);
        setField(term7717, term7717.getClass(), "first", null);
        setField(term7717, term7717.getClass(), "last", term7714);
        setField(term7717, term7717.getClass(), "propListHead", null);
        setIntField(term7717, term7717.getClass(), "sourcePosition", 0);
        setField(term7717, term7717.getClass(), "jsType", null);
        setField(term7717, term7717.getClass(), "parent", null);
        setField(term7712, term7712.getClass(), "first", term7717);
        setField(term7712, term7712.getClass(), "last", term7710);
        setField(term7712, term7712.getClass(), "propListHead", null);
        setIntField(term7712, term7712.getClass(), "sourcePosition", 0);
        setField(term7712, term7712.getClass(), "jsType", null);
        setField(term7712, term7712.getClass(), "parent", null);
        setField(term7710, term7710.getClass(), "next", term7712);
        setField(term7710, term7710.getClass(), "first", term7714);
        setIntField(term7721, term7721.getClass(), "type", -1271375703);
        setIntField(term7723, term7723.getClass(), "type", 1136208236);
        setField(term7723, term7723.getClass(), "next", null);
        setField(term7723, term7723.getClass(), "first", term7717);
        setField(term7723, term7723.getClass(), "last", term7712);
        setField(term7723, term7723.getClass(), "propListHead", null);
        setIntField(term7723, term7723.getClass(), "sourcePosition", 0);
        setField(term7723, term7723.getClass(), "jsType", null);
        setField(term7723, term7723.getClass(), "parent", null);
        setField(term7721, term7721.getClass(), "next", term7723);
        setField(term7721, term7721.getClass(), "first", term7708);
        setField(term7721, term7721.getClass(), "last", term7708);
        setField(term7721, term7721.getClass(), "propListHead", null);
        setIntField(term7721, term7721.getClass(), "sourcePosition", 0);
        setField(term7721, term7721.getClass(), "jsType", null);
        setField(term7721, term7721.getClass(), "parent", null);
        setField(term7710, term7710.getClass(), "last", term7721);
        setField(term7710, term7710.getClass(), "propListHead", null);
        setIntField(term7710, term7710.getClass(), "sourcePosition", 0);
        setField(term7710, term7710.getClass(), "jsType", null);
        setField(term7710, term7710.getClass(), "parent", null);
        setField(term7708, term7708.getClass(), "next", term7710);
        setIntField(term7728, term7728.getClass(), "type", -1220630391);
        setField(term7728, term7728.getClass(), "next", term7721);
        setField(term7728, term7728.getClass(), "first", term7723);
        setField(term7728, term7728.getClass(), "last", term7706);
        setField(term7728, term7728.getClass(), "propListHead", null);
        setIntField(term7728, term7728.getClass(), "sourcePosition", 0);
        setField(term7728, term7728.getClass(), "jsType", null);
        setField(term7728, term7728.getClass(), "parent", null);
        setField(term7708, term7708.getClass(), "first", term7728);
        setField(term7708, term7708.getClass(), "last", term7728);
        setField(term7708, term7708.getClass(), "propListHead", null);
        setIntField(term7708, term7708.getClass(), "sourcePosition", 0);
        setField(term7708, term7708.getClass(), "jsType", null);
        setField(term7708, term7708.getClass(), "parent", null);
        setField(term7706, term7706.getClass(), "next", term7708);
        setField(term7706, term7706.getClass(), "first", term7712);
        setField(term7706, term7706.getClass(), "last", term7714);
        setField(term7706, term7706.getClass(), "propListHead", null);
        setIntField(term7706, term7706.getClass(), "sourcePosition", 0);
        setField(term7706, term7706.getClass(), "jsType", null);
        setField(term7706, term7706.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term7706;
        try {
            callMethod(klass, "isPropertyTest", argTypes, term7652, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


