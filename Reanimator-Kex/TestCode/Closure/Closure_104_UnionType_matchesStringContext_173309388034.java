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

public class UnionType_matchesStringContext_173309388034 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term863;
     Object term5296;

    public UnionType_matchesStringContext_173309388034() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term865 = new HashMap();
        Set<Object> term5318 =  ((Map) term865).keySet();
        HashSet term864 = new HashSet((Collection<? extends Object>) term5318);
        HashMap term876 = new HashMap();
        HashMap term885 = new HashMap();
        Set<Object> term5319 =  ((Map) term885).keySet();
        HashSet term884 = new HashSet((Collection<? extends Object>) term5319);
        HashMap term892 = new HashMap();
        Set<Object> term5320 =  ((Map) term892).keySet();
        HashSet term891 = new HashSet((Collection<? extends Object>) term5320);
        HashMap term899 = new HashMap();
        Set<Object> term5321 =  ((Map) term899).keySet();
        HashSet term898 = new HashSet((Collection<? extends Object>) term5321);
        HashMap term905 = new HashMap();
        HashMap term910 = new HashMap();
        term863 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term874 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term875 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 3);
        Object term931 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term945 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term863, term863.getClass(), "alternates", term864);
        setBooleanField(term863, term863.getClass(), "resolved", true);
        setField(term863, term863.getClass(), "resolveResult", null);
        setField(term874, term874.getClass(), "reporter", null);
        setField(term874, term874.getClass(), "nativeTypes", term875);
        setField(term874, term874.getClass(), "namesToTypes", term876);
        setField(term874, term874.getClass(), "namespaces", term884);
        setField(term874, term874.getClass(), "enumTypeNames", term891);
        setField(term874, term874.getClass(), "forwardDeclaredTypes", term898);
        setField(term874, term874.getClass(), "typesIndexedByProperty", term905);
        setField(term874, term874.getClass(), "greatestSubtypeByProperty", term910);
        setField(term874, term874.getClass(), "interfaceToImplementors", null);
        setField(term874, term874.getClass(), "unresolvedNamedTypes", null);
        setField(term874, term874.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term874, term874.getClass(), "lastGeneration", true);
        setField(term874, term874.getClass(), "templateTypeName", "RYdKCNNMBR");
        setField(term931, term931.getClass(), "name", "yGtHPyvYiQ");
        setField(term931, term931.getClass(), "referencedType", null);
        setBooleanField(term931, term931.getClass(), "visited", true);
        setField(term945, term945.getClass(), "info", null);
        setField(term945, term945.getClass(), "documentation", null);
        setField(term945, term945.getClass(), "sourceName", null);
        setField(term945, term945.getClass(), "visibility", null);
        setIntField(term945, term945.getClass(), "bitset", 0);
        setField(term945, term945.getClass(), "type", null);
        setField(term945, term945.getClass(), "thisType", null);
        setBooleanField(term945, term945.getClass(), "includeDocumentation", false);
        setField(term931, term931.getClass(), "docInfo", term945);
        setBooleanField(term931, term931.getClass(), "unknown", true);
        setBooleanField(term931, term931.getClass(), "resolved", true);
        setField(term931, term931.getClass(), "resolveResult", null);
        setField(term931, term931.getClass(), "registry", null);
        setField(term874, term874.getClass(), "templateType", term931);
        setField(term863, term863.getClass(), "registry", term874);
        HashMap term5298 = new HashMap();
        Set<Object> term5342 =  ((Map) term5298).keySet();
        HashSet term5297 = new HashSet((Collection<? extends Object>) term5342);
        HashMap term5302 = new HashMap();
        HashMap term5304 = new HashMap();
        Set<Object> term5343 =  ((Map) term5304).keySet();
        HashSet term5303 = new HashSet((Collection<? extends Object>) term5343);
        HashMap term5306 = new HashMap();
        Set<Object> term5344 =  ((Map) term5306).keySet();
        HashSet term5305 = new HashSet((Collection<? extends Object>) term5344);
        HashMap term5308 = new HashMap();
        Set<Object> term5345 =  ((Map) term5308).keySet();
        HashSet term5307 = new HashSet((Collection<? extends Object>) term5345);
        HashMap term5309 = new HashMap();
        HashMap term5310 = new HashMap();
        term5296 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term5300 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term5301 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 3);
        Object term5313 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term5316 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term5296, term5296.getClass(), "alternates", term5297);
        setBooleanField(term5296, term5296.getClass(), "resolved", true);
        setField(term5296, term5296.getClass(), "resolveResult", null);
        setField(term5300, term5300.getClass(), "reporter", null);
        setField(term5300, term5300.getClass(), "nativeTypes", term5301);
        setField(term5300, term5300.getClass(), "namesToTypes", term5302);
        setField(term5300, term5300.getClass(), "namespaces", term5303);
        setField(term5300, term5300.getClass(), "enumTypeNames", term5305);
        setField(term5300, term5300.getClass(), "forwardDeclaredTypes", term5307);
        setField(term5300, term5300.getClass(), "typesIndexedByProperty", term5309);
        setField(term5300, term5300.getClass(), "greatestSubtypeByProperty", term5310);
        setField(term5300, term5300.getClass(), "interfaceToImplementors", null);
        setField(term5300, term5300.getClass(), "unresolvedNamedTypes", null);
        setField(term5300, term5300.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term5300, term5300.getClass(), "lastGeneration", true);
        setField(term5300, term5300.getClass(), "templateTypeName", "RYdKCNNMBR");
        setField(term5313, term5313.getClass(), "name", "yGtHPyvYiQ");
        setField(term5313, term5313.getClass(), "referencedType", null);
        setBooleanField(term5313, term5313.getClass(), "visited", true);
        setField(term5316, term5316.getClass(), "info", null);
        setField(term5316, term5316.getClass(), "documentation", null);
        setField(term5316, term5316.getClass(), "sourceName", null);
        setField(term5316, term5316.getClass(), "visibility", null);
        setIntField(term5316, term5316.getClass(), "bitset", 0);
        setField(term5316, term5316.getClass(), "type", null);
        setField(term5316, term5316.getClass(), "thisType", null);
        setBooleanField(term5316, term5316.getClass(), "includeDocumentation", false);
        setField(term5313, term5313.getClass(), "docInfo", term5316);
        setBooleanField(term5313, term5313.getClass(), "unknown", true);
        setBooleanField(term5313, term5313.getClass(), "resolved", true);
        setField(term5313, term5313.getClass(), "resolveResult", null);
        setField(term5313, term5313.getClass(), "registry", null);
        setField(term5300, term5300.getClass(), "templateType", term5313);
        setField(term5296, term5296.getClass(), "registry", term5300);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "matchesStringContext", argTypes, term863, args);
        assertTrue(recursiveEquals(term863, term5296));
        assertTrue(recursiveEquals(retValue, false));
    }

};


