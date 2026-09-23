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

public class UnionType_isNullable_176165855241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1660;
     Object term6649;

    public UnionType_isNullable_176165855241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1662 = new HashMap();
        Set<Object> term6671 =  ((Map) term1662).keySet();
        HashSet term1661 = new HashSet((Collection<? extends Object>) term6671);
        HashMap term1673 = new HashMap();
        HashMap term1682 = new HashMap();
        Set<Object> term6672 =  ((Map) term1682).keySet();
        HashSet term1681 = new HashSet((Collection<? extends Object>) term6672);
        HashMap term1689 = new HashMap();
        Set<Object> term6673 =  ((Map) term1689).keySet();
        HashSet term1688 = new HashSet((Collection<? extends Object>) term6673);
        HashMap term1696 = new HashMap();
        Set<Object> term6674 =  ((Map) term1696).keySet();
        HashSet term1695 = new HashSet((Collection<? extends Object>) term6674);
        HashMap term1702 = new HashMap();
        HashMap term1707 = new HashMap();
        term1660 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term1671 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term1672 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 9);
        Object term1728 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term1742 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term1660, term1660.getClass(), "alternates", term1661);
        setBooleanField(term1660, term1660.getClass(), "resolved", false);
        setField(term1660, term1660.getClass(), "resolveResult", null);
        setField(term1671, term1671.getClass(), "reporter", null);
        setField(term1671, term1671.getClass(), "nativeTypes", term1672);
        setField(term1671, term1671.getClass(), "namesToTypes", term1673);
        setField(term1671, term1671.getClass(), "namespaces", term1681);
        setField(term1671, term1671.getClass(), "enumTypeNames", term1688);
        setField(term1671, term1671.getClass(), "forwardDeclaredTypes", term1695);
        setField(term1671, term1671.getClass(), "typesIndexedByProperty", term1702);
        setField(term1671, term1671.getClass(), "greatestSubtypeByProperty", term1707);
        setField(term1671, term1671.getClass(), "interfaceToImplementors", null);
        setField(term1671, term1671.getClass(), "unresolvedNamedTypes", null);
        setField(term1671, term1671.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term1671, term1671.getClass(), "lastGeneration", false);
        setField(term1671, term1671.getClass(), "templateTypeName", "vOuMEpOQAg");
        setField(term1728, term1728.getClass(), "name", "SIODFGaQhr");
        setField(term1728, term1728.getClass(), "referencedType", null);
        setBooleanField(term1728, term1728.getClass(), "visited", true);
        setField(term1742, term1742.getClass(), "info", null);
        setField(term1742, term1742.getClass(), "documentation", null);
        setField(term1742, term1742.getClass(), "sourceName", null);
        setField(term1742, term1742.getClass(), "visibility", null);
        setIntField(term1742, term1742.getClass(), "bitset", 0);
        setField(term1742, term1742.getClass(), "type", null);
        setField(term1742, term1742.getClass(), "thisType", null);
        setBooleanField(term1742, term1742.getClass(), "includeDocumentation", false);
        setField(term1728, term1728.getClass(), "docInfo", term1742);
        setBooleanField(term1728, term1728.getClass(), "unknown", false);
        setBooleanField(term1728, term1728.getClass(), "resolved", false);
        setField(term1728, term1728.getClass(), "resolveResult", null);
        setField(term1728, term1728.getClass(), "registry", null);
        setField(term1671, term1671.getClass(), "templateType", term1728);
        setField(term1660, term1660.getClass(), "registry", term1671);
        HashMap term6651 = new HashMap();
        Set<Object> term6695 =  ((Map) term6651).keySet();
        HashSet term6650 = new HashSet((Collection<? extends Object>) term6695);
        HashMap term6655 = new HashMap();
        HashMap term6657 = new HashMap();
        Set<Object> term6696 =  ((Map) term6657).keySet();
        HashSet term6656 = new HashSet((Collection<? extends Object>) term6696);
        HashMap term6659 = new HashMap();
        Set<Object> term6697 =  ((Map) term6659).keySet();
        HashSet term6658 = new HashSet((Collection<? extends Object>) term6697);
        HashMap term6661 = new HashMap();
        Set<Object> term6698 =  ((Map) term6661).keySet();
        HashSet term6660 = new HashSet((Collection<? extends Object>) term6698);
        HashMap term6662 = new HashMap();
        HashMap term6663 = new HashMap();
        term6649 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term6653 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term6654 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 9);
        Object term6666 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term6669 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term6649, term6649.getClass(), "alternates", term6650);
        setBooleanField(term6649, term6649.getClass(), "resolved", false);
        setField(term6649, term6649.getClass(), "resolveResult", null);
        setField(term6653, term6653.getClass(), "reporter", null);
        setField(term6653, term6653.getClass(), "nativeTypes", term6654);
        setField(term6653, term6653.getClass(), "namesToTypes", term6655);
        setField(term6653, term6653.getClass(), "namespaces", term6656);
        setField(term6653, term6653.getClass(), "enumTypeNames", term6658);
        setField(term6653, term6653.getClass(), "forwardDeclaredTypes", term6660);
        setField(term6653, term6653.getClass(), "typesIndexedByProperty", term6662);
        setField(term6653, term6653.getClass(), "greatestSubtypeByProperty", term6663);
        setField(term6653, term6653.getClass(), "interfaceToImplementors", null);
        setField(term6653, term6653.getClass(), "unresolvedNamedTypes", null);
        setField(term6653, term6653.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term6653, term6653.getClass(), "lastGeneration", false);
        setField(term6653, term6653.getClass(), "templateTypeName", "vOuMEpOQAg");
        setField(term6666, term6666.getClass(), "name", "SIODFGaQhr");
        setField(term6666, term6666.getClass(), "referencedType", null);
        setBooleanField(term6666, term6666.getClass(), "visited", true);
        setField(term6669, term6669.getClass(), "info", null);
        setField(term6669, term6669.getClass(), "documentation", null);
        setField(term6669, term6669.getClass(), "sourceName", null);
        setField(term6669, term6669.getClass(), "visibility", null);
        setIntField(term6669, term6669.getClass(), "bitset", 0);
        setField(term6669, term6669.getClass(), "type", null);
        setField(term6669, term6669.getClass(), "thisType", null);
        setBooleanField(term6669, term6669.getClass(), "includeDocumentation", false);
        setField(term6666, term6666.getClass(), "docInfo", term6669);
        setBooleanField(term6666, term6666.getClass(), "unknown", false);
        setBooleanField(term6666, term6666.getClass(), "resolved", false);
        setField(term6666, term6666.getClass(), "resolveResult", null);
        setField(term6666, term6666.getClass(), "registry", null);
        setField(term6653, term6653.getClass(), "templateType", term6666);
        setField(term6649, term6649.getClass(), "registry", term6653);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isNullable", argTypes, term1660, args);
        assertTrue(recursiveEquals(term1660, term6649));
        assertTrue(recursiveEquals(retValue, false));
    }

};


