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

public class UnionType_matchesObjectContext_192417931835 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term974;
     Object term5444;

    public UnionType_matchesObjectContext_192417931835() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term976 = new HashMap();
        Set<Object> term5466 =  ((Map) term976).keySet();
        HashSet term975 = new HashSet((Collection<? extends Object>) term5466);
        HashMap term987 = new HashMap();
        HashMap term996 = new HashMap();
        Set<Object> term5467 =  ((Map) term996).keySet();
        HashSet term995 = new HashSet((Collection<? extends Object>) term5467);
        HashMap term1003 = new HashMap();
        Set<Object> term5468 =  ((Map) term1003).keySet();
        HashSet term1002 = new HashSet((Collection<? extends Object>) term5468);
        HashMap term1010 = new HashMap();
        Set<Object> term5469 =  ((Map) term1010).keySet();
        HashSet term1009 = new HashSet((Collection<? extends Object>) term5469);
        HashMap term1016 = new HashMap();
        HashMap term1021 = new HashMap();
        term974 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term985 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term986 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 2);
        Object term1042 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term1056 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term974, term974.getClass(), "alternates", term975);
        setBooleanField(term974, term974.getClass(), "resolved", false);
        setField(term974, term974.getClass(), "resolveResult", null);
        setField(term985, term985.getClass(), "reporter", null);
        setField(term985, term985.getClass(), "nativeTypes", term986);
        setField(term985, term985.getClass(), "namesToTypes", term987);
        setField(term985, term985.getClass(), "namespaces", term995);
        setField(term985, term985.getClass(), "enumTypeNames", term1002);
        setField(term985, term985.getClass(), "forwardDeclaredTypes", term1009);
        setField(term985, term985.getClass(), "typesIndexedByProperty", term1016);
        setField(term985, term985.getClass(), "greatestSubtypeByProperty", term1021);
        setField(term985, term985.getClass(), "interfaceToImplementors", null);
        setField(term985, term985.getClass(), "unresolvedNamedTypes", null);
        setField(term985, term985.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term985, term985.getClass(), "lastGeneration", false);
        setField(term985, term985.getClass(), "templateTypeName", "OJJtVNPyKZ");
        setField(term1042, term1042.getClass(), "name", "AKNapTAfmD");
        setField(term1042, term1042.getClass(), "referencedType", null);
        setBooleanField(term1042, term1042.getClass(), "visited", false);
        setField(term1056, term1056.getClass(), "info", null);
        setField(term1056, term1056.getClass(), "documentation", null);
        setField(term1056, term1056.getClass(), "sourceName", null);
        setField(term1056, term1056.getClass(), "visibility", null);
        setIntField(term1056, term1056.getClass(), "bitset", 0);
        setField(term1056, term1056.getClass(), "type", null);
        setField(term1056, term1056.getClass(), "thisType", null);
        setBooleanField(term1056, term1056.getClass(), "includeDocumentation", false);
        setField(term1042, term1042.getClass(), "docInfo", term1056);
        setBooleanField(term1042, term1042.getClass(), "unknown", true);
        setBooleanField(term1042, term1042.getClass(), "resolved", true);
        setField(term1042, term1042.getClass(), "resolveResult", null);
        setField(term1042, term1042.getClass(), "registry", null);
        setField(term985, term985.getClass(), "templateType", term1042);
        setField(term974, term974.getClass(), "registry", term985);
        HashMap term5446 = new HashMap();
        Set<Object> term5490 =  ((Map) term5446).keySet();
        HashSet term5445 = new HashSet((Collection<? extends Object>) term5490);
        HashMap term5450 = new HashMap();
        HashMap term5452 = new HashMap();
        Set<Object> term5491 =  ((Map) term5452).keySet();
        HashSet term5451 = new HashSet((Collection<? extends Object>) term5491);
        HashMap term5454 = new HashMap();
        Set<Object> term5492 =  ((Map) term5454).keySet();
        HashSet term5453 = new HashSet((Collection<? extends Object>) term5492);
        HashMap term5456 = new HashMap();
        Set<Object> term5493 =  ((Map) term5456).keySet();
        HashSet term5455 = new HashSet((Collection<? extends Object>) term5493);
        HashMap term5457 = new HashMap();
        HashMap term5458 = new HashMap();
        term5444 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term5448 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term5449 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 2);
        Object term5461 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term5464 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term5444, term5444.getClass(), "alternates", term5445);
        setBooleanField(term5444, term5444.getClass(), "resolved", false);
        setField(term5444, term5444.getClass(), "resolveResult", null);
        setField(term5448, term5448.getClass(), "reporter", null);
        setField(term5448, term5448.getClass(), "nativeTypes", term5449);
        setField(term5448, term5448.getClass(), "namesToTypes", term5450);
        setField(term5448, term5448.getClass(), "namespaces", term5451);
        setField(term5448, term5448.getClass(), "enumTypeNames", term5453);
        setField(term5448, term5448.getClass(), "forwardDeclaredTypes", term5455);
        setField(term5448, term5448.getClass(), "typesIndexedByProperty", term5457);
        setField(term5448, term5448.getClass(), "greatestSubtypeByProperty", term5458);
        setField(term5448, term5448.getClass(), "interfaceToImplementors", null);
        setField(term5448, term5448.getClass(), "unresolvedNamedTypes", null);
        setField(term5448, term5448.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term5448, term5448.getClass(), "lastGeneration", false);
        setField(term5448, term5448.getClass(), "templateTypeName", "OJJtVNPyKZ");
        setField(term5461, term5461.getClass(), "name", "AKNapTAfmD");
        setField(term5461, term5461.getClass(), "referencedType", null);
        setBooleanField(term5461, term5461.getClass(), "visited", false);
        setField(term5464, term5464.getClass(), "info", null);
        setField(term5464, term5464.getClass(), "documentation", null);
        setField(term5464, term5464.getClass(), "sourceName", null);
        setField(term5464, term5464.getClass(), "visibility", null);
        setIntField(term5464, term5464.getClass(), "bitset", 0);
        setField(term5464, term5464.getClass(), "type", null);
        setField(term5464, term5464.getClass(), "thisType", null);
        setBooleanField(term5464, term5464.getClass(), "includeDocumentation", false);
        setField(term5461, term5461.getClass(), "docInfo", term5464);
        setBooleanField(term5461, term5461.getClass(), "unknown", true);
        setBooleanField(term5461, term5461.getClass(), "resolved", true);
        setField(term5461, term5461.getClass(), "resolveResult", null);
        setField(term5461, term5461.getClass(), "registry", null);
        setField(term5448, term5448.getClass(), "templateType", term5461);
        setField(term5444, term5444.getClass(), "registry", term5448);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "matchesObjectContext", argTypes, term974, args);
        assertTrue(recursiveEquals(term974, term5444));
        assertTrue(recursiveEquals(retValue, false));
    }

};


