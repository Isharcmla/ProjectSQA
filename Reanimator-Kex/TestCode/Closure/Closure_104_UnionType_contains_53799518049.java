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

public class UnionType_contains_53799518049 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2541;
     Object term8154;

    public UnionType_contains_53799518049() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2543 = new HashMap();
        Set<Object> term8174 =  ((Map) term2543).keySet();
        HashSet term2542 = new HashSet((Collection<? extends Object>) term8174);
        HashMap term2554 = new HashMap();
        HashMap term2563 = new HashMap();
        Set<Object> term8175 =  ((Map) term2563).keySet();
        HashSet term2562 = new HashSet((Collection<? extends Object>) term8175);
        HashMap term2570 = new HashMap();
        Set<Object> term8176 =  ((Map) term2570).keySet();
        HashSet term2569 = new HashSet((Collection<? extends Object>) term8176);
        HashMap term2577 = new HashMap();
        Set<Object> term8177 =  ((Map) term2577).keySet();
        HashSet term2576 = new HashSet((Collection<? extends Object>) term8177);
        HashMap term2582 = new HashMap();
        HashMap term2587 = new HashMap();
        term2541 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term2552 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term2553 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 0);
        Object term2608 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term2622 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term2541, term2541.getClass(), "alternates", term2542);
        setBooleanField(term2541, term2541.getClass(), "resolved", false);
        setField(term2541, term2541.getClass(), "resolveResult", null);
        setField(term2552, term2552.getClass(), "reporter", null);
        setField(term2552, term2552.getClass(), "nativeTypes", term2553);
        setField(term2552, term2552.getClass(), "namesToTypes", term2554);
        setField(term2552, term2552.getClass(), "namespaces", term2562);
        setField(term2552, term2552.getClass(), "enumTypeNames", term2569);
        setField(term2552, term2552.getClass(), "forwardDeclaredTypes", term2576);
        setField(term2552, term2552.getClass(), "typesIndexedByProperty", term2582);
        setField(term2552, term2552.getClass(), "greatestSubtypeByProperty", term2587);
        setField(term2552, term2552.getClass(), "interfaceToImplementors", null);
        setField(term2552, term2552.getClass(), "unresolvedNamedTypes", null);
        setField(term2552, term2552.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term2552, term2552.getClass(), "lastGeneration", true);
        setField(term2552, term2552.getClass(), "templateTypeName", "BBXiTNHqGE");
        setField(term2608, term2608.getClass(), "name", "IEYhJmgCVd");
        setField(term2608, term2608.getClass(), "referencedType", null);
        setBooleanField(term2608, term2608.getClass(), "visited", true);
        setField(term2622, term2622.getClass(), "info", null);
        setField(term2622, term2622.getClass(), "documentation", null);
        setField(term2622, term2622.getClass(), "sourceName", null);
        setField(term2622, term2622.getClass(), "visibility", null);
        setIntField(term2622, term2622.getClass(), "bitset", 0);
        setField(term2622, term2622.getClass(), "type", null);
        setField(term2622, term2622.getClass(), "thisType", null);
        setBooleanField(term2622, term2622.getClass(), "includeDocumentation", false);
        setField(term2608, term2608.getClass(), "docInfo", term2622);
        setBooleanField(term2608, term2608.getClass(), "unknown", true);
        setBooleanField(term2608, term2608.getClass(), "resolved", false);
        setField(term2608, term2608.getClass(), "resolveResult", null);
        setField(term2608, term2608.getClass(), "registry", null);
        setField(term2552, term2552.getClass(), "templateType", term2608);
        setField(term2541, term2541.getClass(), "registry", term2552);
        HashMap term8156 = new HashMap();
        Set<Object> term8198 =  ((Map) term8156).keySet();
        HashSet term8155 = new HashSet((Collection<? extends Object>) term8198);
        HashMap term8159 = new HashMap();
        HashMap term8161 = new HashMap();
        Set<Object> term8199 =  ((Map) term8161).keySet();
        HashSet term8160 = new HashSet((Collection<? extends Object>) term8199);
        HashMap term8163 = new HashMap();
        Set<Object> term8200 =  ((Map) term8163).keySet();
        HashSet term8162 = new HashSet((Collection<? extends Object>) term8200);
        HashMap term8165 = new HashMap();
        Set<Object> term8201 =  ((Map) term8165).keySet();
        HashSet term8164 = new HashSet((Collection<? extends Object>) term8201);
        HashMap term8166 = new HashMap();
        HashMap term8167 = new HashMap();
        term8154 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term8157 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term8158 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 0);
        Object term8170 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term8173 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term8154, term8154.getClass(), "alternates", term8155);
        setBooleanField(term8154, term8154.getClass(), "resolved", false);
        setField(term8154, term8154.getClass(), "resolveResult", null);
        setField(term8157, term8157.getClass(), "reporter", null);
        setField(term8157, term8157.getClass(), "nativeTypes", term8158);
        setField(term8157, term8157.getClass(), "namesToTypes", term8159);
        setField(term8157, term8157.getClass(), "namespaces", term8160);
        setField(term8157, term8157.getClass(), "enumTypeNames", term8162);
        setField(term8157, term8157.getClass(), "forwardDeclaredTypes", term8164);
        setField(term8157, term8157.getClass(), "typesIndexedByProperty", term8166);
        setField(term8157, term8157.getClass(), "greatestSubtypeByProperty", term8167);
        setField(term8157, term8157.getClass(), "interfaceToImplementors", null);
        setField(term8157, term8157.getClass(), "unresolvedNamedTypes", null);
        setField(term8157, term8157.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term8157, term8157.getClass(), "lastGeneration", true);
        setField(term8157, term8157.getClass(), "templateTypeName", "BBXiTNHqGE");
        setField(term8170, term8170.getClass(), "name", "IEYhJmgCVd");
        setField(term8170, term8170.getClass(), "referencedType", null);
        setBooleanField(term8170, term8170.getClass(), "visited", true);
        setField(term8173, term8173.getClass(), "info", null);
        setField(term8173, term8173.getClass(), "documentation", null);
        setField(term8173, term8173.getClass(), "sourceName", null);
        setField(term8173, term8173.getClass(), "visibility", null);
        setIntField(term8173, term8173.getClass(), "bitset", 0);
        setField(term8173, term8173.getClass(), "type", null);
        setField(term8173, term8173.getClass(), "thisType", null);
        setBooleanField(term8173, term8173.getClass(), "includeDocumentation", false);
        setField(term8170, term8170.getClass(), "docInfo", term8173);
        setBooleanField(term8170, term8170.getClass(), "unknown", true);
        setBooleanField(term8170, term8170.getClass(), "resolved", false);
        setField(term8170, term8170.getClass(), "resolveResult", null);
        setField(term8170, term8170.getClass(), "registry", null);
        setField(term8157, term8157.getClass(), "templateType", term8170);
        setField(term8154, term8154.getClass(), "registry", term8157);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "contains", argTypes, term2541, args);
        assertTrue(recursiveEquals(term2541, term8154));
    }

};


