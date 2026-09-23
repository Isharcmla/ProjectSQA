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

public class UnionType_isObject_86608015048 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2430;
     Object term8008;

    public UnionType_isObject_86608015048() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2432 = new HashMap();
        Set<Object> term8030 =  ((Map) term2432).keySet();
        HashSet term2431 = new HashSet((Collection<? extends Object>) term8030);
        HashMap term2443 = new HashMap();
        HashMap term2452 = new HashMap();
        Set<Object> term8031 =  ((Map) term2452).keySet();
        HashSet term2451 = new HashSet((Collection<? extends Object>) term8031);
        HashMap term2459 = new HashMap();
        Set<Object> term8032 =  ((Map) term2459).keySet();
        HashSet term2458 = new HashSet((Collection<? extends Object>) term8032);
        HashMap term2466 = new HashMap();
        Set<Object> term8033 =  ((Map) term2466).keySet();
        HashSet term2465 = new HashSet((Collection<? extends Object>) term8033);
        HashMap term2472 = new HashMap();
        HashMap term2477 = new HashMap();
        term2430 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term2441 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term2442 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 6);
        Object term2498 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term2512 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term2430, term2430.getClass(), "alternates", term2431);
        setBooleanField(term2430, term2430.getClass(), "resolved", true);
        setField(term2430, term2430.getClass(), "resolveResult", null);
        setField(term2441, term2441.getClass(), "reporter", null);
        setField(term2441, term2441.getClass(), "nativeTypes", term2442);
        setField(term2441, term2441.getClass(), "namesToTypes", term2443);
        setField(term2441, term2441.getClass(), "namespaces", term2451);
        setField(term2441, term2441.getClass(), "enumTypeNames", term2458);
        setField(term2441, term2441.getClass(), "forwardDeclaredTypes", term2465);
        setField(term2441, term2441.getClass(), "typesIndexedByProperty", term2472);
        setField(term2441, term2441.getClass(), "greatestSubtypeByProperty", term2477);
        setField(term2441, term2441.getClass(), "interfaceToImplementors", null);
        setField(term2441, term2441.getClass(), "unresolvedNamedTypes", null);
        setField(term2441, term2441.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term2441, term2441.getClass(), "lastGeneration", true);
        setField(term2441, term2441.getClass(), "templateTypeName", "RSaoipUlsg");
        setField(term2498, term2498.getClass(), "name", "cSHGbqKqlN");
        setField(term2498, term2498.getClass(), "referencedType", null);
        setBooleanField(term2498, term2498.getClass(), "visited", true);
        setField(term2512, term2512.getClass(), "info", null);
        setField(term2512, term2512.getClass(), "documentation", null);
        setField(term2512, term2512.getClass(), "sourceName", null);
        setField(term2512, term2512.getClass(), "visibility", null);
        setIntField(term2512, term2512.getClass(), "bitset", 0);
        setField(term2512, term2512.getClass(), "type", null);
        setField(term2512, term2512.getClass(), "thisType", null);
        setBooleanField(term2512, term2512.getClass(), "includeDocumentation", false);
        setField(term2498, term2498.getClass(), "docInfo", term2512);
        setBooleanField(term2498, term2498.getClass(), "unknown", true);
        setBooleanField(term2498, term2498.getClass(), "resolved", false);
        setField(term2498, term2498.getClass(), "resolveResult", null);
        setField(term2498, term2498.getClass(), "registry", null);
        setField(term2441, term2441.getClass(), "templateType", term2498);
        setField(term2430, term2430.getClass(), "registry", term2441);
        HashMap term8010 = new HashMap();
        Set<Object> term8054 =  ((Map) term8010).keySet();
        HashSet term8009 = new HashSet((Collection<? extends Object>) term8054);
        HashMap term8014 = new HashMap();
        HashMap term8016 = new HashMap();
        Set<Object> term8055 =  ((Map) term8016).keySet();
        HashSet term8015 = new HashSet((Collection<? extends Object>) term8055);
        HashMap term8018 = new HashMap();
        Set<Object> term8056 =  ((Map) term8018).keySet();
        HashSet term8017 = new HashSet((Collection<? extends Object>) term8056);
        HashMap term8020 = new HashMap();
        Set<Object> term8057 =  ((Map) term8020).keySet();
        HashSet term8019 = new HashSet((Collection<? extends Object>) term8057);
        HashMap term8021 = new HashMap();
        HashMap term8022 = new HashMap();
        term8008 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term8012 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term8013 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 6);
        Object term8025 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term8028 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term8008, term8008.getClass(), "alternates", term8009);
        setBooleanField(term8008, term8008.getClass(), "resolved", true);
        setField(term8008, term8008.getClass(), "resolveResult", null);
        setField(term8012, term8012.getClass(), "reporter", null);
        setField(term8012, term8012.getClass(), "nativeTypes", term8013);
        setField(term8012, term8012.getClass(), "namesToTypes", term8014);
        setField(term8012, term8012.getClass(), "namespaces", term8015);
        setField(term8012, term8012.getClass(), "enumTypeNames", term8017);
        setField(term8012, term8012.getClass(), "forwardDeclaredTypes", term8019);
        setField(term8012, term8012.getClass(), "typesIndexedByProperty", term8021);
        setField(term8012, term8012.getClass(), "greatestSubtypeByProperty", term8022);
        setField(term8012, term8012.getClass(), "interfaceToImplementors", null);
        setField(term8012, term8012.getClass(), "unresolvedNamedTypes", null);
        setField(term8012, term8012.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term8012, term8012.getClass(), "lastGeneration", true);
        setField(term8012, term8012.getClass(), "templateTypeName", "RSaoipUlsg");
        setField(term8025, term8025.getClass(), "name", "cSHGbqKqlN");
        setField(term8025, term8025.getClass(), "referencedType", null);
        setBooleanField(term8025, term8025.getClass(), "visited", true);
        setField(term8028, term8028.getClass(), "info", null);
        setField(term8028, term8028.getClass(), "documentation", null);
        setField(term8028, term8028.getClass(), "sourceName", null);
        setField(term8028, term8028.getClass(), "visibility", null);
        setIntField(term8028, term8028.getClass(), "bitset", 0);
        setField(term8028, term8028.getClass(), "type", null);
        setField(term8028, term8028.getClass(), "thisType", null);
        setBooleanField(term8028, term8028.getClass(), "includeDocumentation", false);
        setField(term8025, term8025.getClass(), "docInfo", term8028);
        setBooleanField(term8025, term8025.getClass(), "unknown", true);
        setBooleanField(term8025, term8025.getClass(), "resolved", false);
        setField(term8025, term8025.getClass(), "resolveResult", null);
        setField(term8025, term8025.getClass(), "registry", null);
        setField(term8012, term8012.getClass(), "templateType", term8025);
        setField(term8008, term8008.getClass(), "registry", term8012);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isObject", argTypes, term2430, args);
        assertTrue(recursiveEquals(term2430, term8008));
        assertTrue(recursiveEquals(retValue, true));
    }

};


