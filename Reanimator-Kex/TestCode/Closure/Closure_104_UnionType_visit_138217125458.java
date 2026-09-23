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

public class UnionType_visit_138217125458 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3535;

    public UnionType_visit_138217125458() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3537 = new HashMap();
        Set<Object> term11569 =  ((Map) term3537).keySet();
        HashSet term3536 = new HashSet((Collection<? extends Object>) term11569);
        HashMap term3548 = new HashMap();
        HashMap term3557 = new HashMap();
        Set<Object> term11570 =  ((Map) term3557).keySet();
        HashSet term3556 = new HashSet((Collection<? extends Object>) term11570);
        HashMap term3564 = new HashMap();
        Set<Object> term11571 =  ((Map) term3564).keySet();
        HashSet term3563 = new HashSet((Collection<? extends Object>) term11571);
        HashMap term3571 = new HashMap();
        Set<Object> term11572 =  ((Map) term3571).keySet();
        HashSet term3570 = new HashSet((Collection<? extends Object>) term11572);
        HashMap term3577 = new HashMap();
        HashMap term3582 = new HashMap();
        term3535 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term3546 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term3547 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 6);
        Object term3603 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term3617 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term3535, term3535.getClass(), "alternates", term3536);
        setBooleanField(term3535, term3535.getClass(), "resolved", false);
        setField(term3535, term3535.getClass(), "resolveResult", null);
        setField(term3546, term3546.getClass(), "reporter", null);
        setField(term3546, term3546.getClass(), "nativeTypes", term3547);
        setField(term3546, term3546.getClass(), "namesToTypes", term3548);
        setField(term3546, term3546.getClass(), "namespaces", term3556);
        setField(term3546, term3546.getClass(), "enumTypeNames", term3563);
        setField(term3546, term3546.getClass(), "forwardDeclaredTypes", term3570);
        setField(term3546, term3546.getClass(), "typesIndexedByProperty", term3577);
        setField(term3546, term3546.getClass(), "greatestSubtypeByProperty", term3582);
        setField(term3546, term3546.getClass(), "interfaceToImplementors", null);
        setField(term3546, term3546.getClass(), "unresolvedNamedTypes", null);
        setField(term3546, term3546.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term3546, term3546.getClass(), "lastGeneration", true);
        setField(term3546, term3546.getClass(), "templateTypeName", "xeyjTOCOJb");
        setField(term3603, term3603.getClass(), "name", "DGRqjjdhzy");
        setField(term3603, term3603.getClass(), "referencedType", null);
        setBooleanField(term3603, term3603.getClass(), "visited", false);
        setField(term3617, term3617.getClass(), "info", null);
        setField(term3617, term3617.getClass(), "documentation", null);
        setField(term3617, term3617.getClass(), "sourceName", null);
        setField(term3617, term3617.getClass(), "visibility", null);
        setIntField(term3617, term3617.getClass(), "bitset", 0);
        setField(term3617, term3617.getClass(), "type", null);
        setField(term3617, term3617.getClass(), "thisType", null);
        setBooleanField(term3617, term3617.getClass(), "includeDocumentation", false);
        setField(term3603, term3603.getClass(), "docInfo", term3617);
        setBooleanField(term3603, term3603.getClass(), "unknown", false);
        setBooleanField(term3603, term3603.getClass(), "resolved", true);
        setField(term3603, term3603.getClass(), "resolveResult", null);
        setField(term3603, term3603.getClass(), "registry", null);
        setField(term3546, term3546.getClass(), "templateType", term3603);
        setField(term3535, term3535.getClass(), "registry", term3546);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.Visitor");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "visit", argTypes, term3535, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


