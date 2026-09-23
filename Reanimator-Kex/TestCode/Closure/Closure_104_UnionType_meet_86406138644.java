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
import java.lang.NullPointerException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class UnionType_meet_86406138644 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1989;

    public UnionType_meet_86406138644() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1991 = new HashMap();
        Set<Object> term7468 =  ((Map) term1991).keySet();
        HashSet term1990 = new HashSet((Collection<? extends Object>) term7468);
        HashMap term2002 = new HashMap();
        HashMap term2011 = new HashMap();
        Set<Object> term7469 =  ((Map) term2011).keySet();
        HashSet term2010 = new HashSet((Collection<? extends Object>) term7469);
        HashMap term2018 = new HashMap();
        Set<Object> term7470 =  ((Map) term2018).keySet();
        HashSet term2017 = new HashSet((Collection<? extends Object>) term7470);
        HashMap term2024 = new HashMap();
        Set<Object> term7471 =  ((Map) term2024).keySet();
        HashSet term2023 = new HashSet((Collection<? extends Object>) term7471);
        HashMap term2030 = new HashMap();
        HashMap term2035 = new HashMap();
        term1989 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term2000 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term2001 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 6);
        Object term2056 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term2070 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term1989, term1989.getClass(), "alternates", term1990);
        setBooleanField(term1989, term1989.getClass(), "resolved", false);
        setField(term1989, term1989.getClass(), "resolveResult", null);
        setField(term2000, term2000.getClass(), "reporter", null);
        setField(term2000, term2000.getClass(), "nativeTypes", term2001);
        setField(term2000, term2000.getClass(), "namesToTypes", term2002);
        setField(term2000, term2000.getClass(), "namespaces", term2010);
        setField(term2000, term2000.getClass(), "enumTypeNames", term2017);
        setField(term2000, term2000.getClass(), "forwardDeclaredTypes", term2023);
        setField(term2000, term2000.getClass(), "typesIndexedByProperty", term2030);
        setField(term2000, term2000.getClass(), "greatestSubtypeByProperty", term2035);
        setField(term2000, term2000.getClass(), "interfaceToImplementors", null);
        setField(term2000, term2000.getClass(), "unresolvedNamedTypes", null);
        setField(term2000, term2000.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term2000, term2000.getClass(), "lastGeneration", false);
        setField(term2000, term2000.getClass(), "templateTypeName", "TtGbVmKcnX");
        setField(term2056, term2056.getClass(), "name", "GJVkUrCVdD");
        setField(term2056, term2056.getClass(), "referencedType", null);
        setBooleanField(term2056, term2056.getClass(), "visited", false);
        setField(term2070, term2070.getClass(), "info", null);
        setField(term2070, term2070.getClass(), "documentation", null);
        setField(term2070, term2070.getClass(), "sourceName", null);
        setField(term2070, term2070.getClass(), "visibility", null);
        setIntField(term2070, term2070.getClass(), "bitset", 0);
        setField(term2070, term2070.getClass(), "type", null);
        setField(term2070, term2070.getClass(), "thisType", null);
        setBooleanField(term2070, term2070.getClass(), "includeDocumentation", false);
        setField(term2056, term2056.getClass(), "docInfo", term2070);
        setBooleanField(term2056, term2056.getClass(), "unknown", false);
        setBooleanField(term2056, term2056.getClass(), "resolved", false);
        setField(term2056, term2056.getClass(), "resolveResult", null);
        setField(term2056, term2056.getClass(), "registry", null);
        setField(term2000, term2000.getClass(), "templateType", term2056);
        setField(term1989, term1989.getClass(), "registry", term2000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "meet", argTypes, term1989, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


