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
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class UnionType_equals_207484656545 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2099;
     Object term2186;
     Object term7570;
     Object term7590;

    public UnionType_equals_207484656545() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2101 = new HashMap();
        Set<Object> term7737 =  ((Map) term2101).keySet();
        HashSet term2100 = new HashSet((Collection<? extends Object>) term7737);
        HashMap term2112 = new HashMap();
        HashMap term2121 = new HashMap();
        Set<Object> term7738 =  ((Map) term2121).keySet();
        HashSet term2120 = new HashSet((Collection<? extends Object>) term7738);
        HashMap term2128 = new HashMap();
        Set<Object> term7739 =  ((Map) term2128).keySet();
        HashSet term2127 = new HashSet((Collection<? extends Object>) term7739);
        HashMap term2135 = new HashMap();
        Set<Object> term7740 =  ((Map) term2135).keySet();
        HashSet term2134 = new HashSet((Collection<? extends Object>) term7740);
        HashMap term2141 = new HashMap();
        HashMap term2146 = new HashMap();
        term2099 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term2110 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term2111 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 6);
        Object term2167 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term2181 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term2099, term2099.getClass(), "alternates", term2100);
        setBooleanField(term2099, term2099.getClass(), "resolved", false);
        setField(term2099, term2099.getClass(), "resolveResult", null);
        setField(term2110, term2110.getClass(), "reporter", null);
        setField(term2110, term2110.getClass(), "nativeTypes", term2111);
        setField(term2110, term2110.getClass(), "namesToTypes", term2112);
        setField(term2110, term2110.getClass(), "namespaces", term2120);
        setField(term2110, term2110.getClass(), "enumTypeNames", term2127);
        setField(term2110, term2110.getClass(), "forwardDeclaredTypes", term2134);
        setField(term2110, term2110.getClass(), "typesIndexedByProperty", term2141);
        setField(term2110, term2110.getClass(), "greatestSubtypeByProperty", term2146);
        setField(term2110, term2110.getClass(), "interfaceToImplementors", null);
        setField(term2110, term2110.getClass(), "unresolvedNamedTypes", null);
        setField(term2110, term2110.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term2110, term2110.getClass(), "lastGeneration", true);
        setField(term2110, term2110.getClass(), "templateTypeName", "PsqusYmejD");
        setField(term2167, term2167.getClass(), "name", "NTWMiBEaDF");
        setField(term2167, term2167.getClass(), "referencedType", null);
        setBooleanField(term2167, term2167.getClass(), "visited", false);
        setField(term2181, term2181.getClass(), "info", null);
        setField(term2181, term2181.getClass(), "documentation", null);
        setField(term2181, term2181.getClass(), "sourceName", null);
        setField(term2181, term2181.getClass(), "visibility", null);
        setIntField(term2181, term2181.getClass(), "bitset", 0);
        setField(term2181, term2181.getClass(), "type", null);
        setField(term2181, term2181.getClass(), "thisType", null);
        setBooleanField(term2181, term2181.getClass(), "includeDocumentation", false);
        setField(term2167, term2167.getClass(), "docInfo", term2181);
        setBooleanField(term2167, term2167.getClass(), "unknown", false);
        setBooleanField(term2167, term2167.getClass(), "resolved", true);
        setField(term2167, term2167.getClass(), "resolveResult", null);
        setField(term2167, term2167.getClass(), "registry", null);
        setField(term2110, term2110.getClass(), "templateType", term2167);
        setField(term2099, term2099.getClass(), "registry", term2110);
        term2186 = newInstance(Class.forName("java.lang.Object"));
        HashMap term7572 = new HashMap();
        Set<Object> term7761 =  ((Map) term7572).keySet();
        HashSet term7571 = new HashSet((Collection<? extends Object>) term7761);
        HashMap term7575 = new HashMap();
        HashMap term7577 = new HashMap();
        Set<Object> term7762 =  ((Map) term7577).keySet();
        HashSet term7576 = new HashSet((Collection<? extends Object>) term7762);
        HashMap term7579 = new HashMap();
        Set<Object> term7763 =  ((Map) term7579).keySet();
        HashSet term7578 = new HashSet((Collection<? extends Object>) term7763);
        HashMap term7581 = new HashMap();
        Set<Object> term7764 =  ((Map) term7581).keySet();
        HashSet term7580 = new HashSet((Collection<? extends Object>) term7764);
        HashMap term7582 = new HashMap();
        HashMap term7583 = new HashMap();
        term7570 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term7573 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term7574 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 6);
        Object term7586 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term7589 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term7570, term7570.getClass(), "alternates", term7571);
        setBooleanField(term7570, term7570.getClass(), "resolved", false);
        setField(term7570, term7570.getClass(), "resolveResult", null);
        setField(term7573, term7573.getClass(), "reporter", null);
        setField(term7573, term7573.getClass(), "nativeTypes", term7574);
        setField(term7573, term7573.getClass(), "namesToTypes", term7575);
        setField(term7573, term7573.getClass(), "namespaces", term7576);
        setField(term7573, term7573.getClass(), "enumTypeNames", term7578);
        setField(term7573, term7573.getClass(), "forwardDeclaredTypes", term7580);
        setField(term7573, term7573.getClass(), "typesIndexedByProperty", term7582);
        setField(term7573, term7573.getClass(), "greatestSubtypeByProperty", term7583);
        setField(term7573, term7573.getClass(), "interfaceToImplementors", null);
        setField(term7573, term7573.getClass(), "unresolvedNamedTypes", null);
        setField(term7573, term7573.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term7573, term7573.getClass(), "lastGeneration", true);
        setField(term7573, term7573.getClass(), "templateTypeName", "PsqusYmejD");
        setField(term7586, term7586.getClass(), "name", "NTWMiBEaDF");
        setField(term7586, term7586.getClass(), "referencedType", null);
        setBooleanField(term7586, term7586.getClass(), "visited", false);
        setField(term7589, term7589.getClass(), "info", null);
        setField(term7589, term7589.getClass(), "documentation", null);
        setField(term7589, term7589.getClass(), "sourceName", null);
        setField(term7589, term7589.getClass(), "visibility", null);
        setIntField(term7589, term7589.getClass(), "bitset", 0);
        setField(term7589, term7589.getClass(), "type", null);
        setField(term7589, term7589.getClass(), "thisType", null);
        setBooleanField(term7589, term7589.getClass(), "includeDocumentation", false);
        setField(term7586, term7586.getClass(), "docInfo", term7589);
        setBooleanField(term7586, term7586.getClass(), "unknown", false);
        setBooleanField(term7586, term7586.getClass(), "resolved", true);
        setField(term7586, term7586.getClass(), "resolveResult", null);
        setField(term7586, term7586.getClass(), "registry", null);
        setField(term7573, term7573.getClass(), "templateType", term7586);
        setField(term7570, term7570.getClass(), "registry", term7573);
        term7590 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2186;
        callMethod(klass, "equals", argTypes, term2099, args);
        assertTrue(recursiveEquals(term2099, term7570));
        assertTrue(recursiveEquals(term2186, term7590));
    }

};


