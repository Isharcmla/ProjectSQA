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

public class UnionType_toString_126067436651 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2762;
     Object term8726;

    public UnionType_toString_126067436651() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2764 = new HashMap();
        Set<Object> term8747 =  ((Map) term2764).keySet();
        HashSet term2763 = new HashSet((Collection<? extends Object>) term8747);
        HashMap term2775 = new HashMap();
        HashMap term2784 = new HashMap();
        Set<Object> term8748 =  ((Map) term2784).keySet();
        HashSet term2783 = new HashSet((Collection<? extends Object>) term8748);
        HashMap term2791 = new HashMap();
        Set<Object> term8749 =  ((Map) term2791).keySet();
        HashSet term2790 = new HashSet((Collection<? extends Object>) term8749);
        HashMap term2797 = new HashMap();
        Set<Object> term8750 =  ((Map) term2797).keySet();
        HashSet term2796 = new HashSet((Collection<? extends Object>) term8750);
        HashMap term2803 = new HashMap();
        HashMap term2808 = new HashMap();
        term2762 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term2773 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term2774 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 4);
        Object term2829 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term2843 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term2762, term2762.getClass(), "alternates", term2763);
        setBooleanField(term2762, term2762.getClass(), "resolved", true);
        setField(term2762, term2762.getClass(), "resolveResult", null);
        setField(term2773, term2773.getClass(), "reporter", null);
        setField(term2773, term2773.getClass(), "nativeTypes", term2774);
        setField(term2773, term2773.getClass(), "namesToTypes", term2775);
        setField(term2773, term2773.getClass(), "namespaces", term2783);
        setField(term2773, term2773.getClass(), "enumTypeNames", term2790);
        setField(term2773, term2773.getClass(), "forwardDeclaredTypes", term2796);
        setField(term2773, term2773.getClass(), "typesIndexedByProperty", term2803);
        setField(term2773, term2773.getClass(), "greatestSubtypeByProperty", term2808);
        setField(term2773, term2773.getClass(), "interfaceToImplementors", null);
        setField(term2773, term2773.getClass(), "unresolvedNamedTypes", null);
        setField(term2773, term2773.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term2773, term2773.getClass(), "lastGeneration", true);
        setField(term2773, term2773.getClass(), "templateTypeName", "vSeruUyNWX");
        setField(term2829, term2829.getClass(), "name", "UkKvaeJfEC");
        setField(term2829, term2829.getClass(), "referencedType", null);
        setBooleanField(term2829, term2829.getClass(), "visited", false);
        setField(term2843, term2843.getClass(), "info", null);
        setField(term2843, term2843.getClass(), "documentation", null);
        setField(term2843, term2843.getClass(), "sourceName", null);
        setField(term2843, term2843.getClass(), "visibility", null);
        setIntField(term2843, term2843.getClass(), "bitset", 0);
        setField(term2843, term2843.getClass(), "type", null);
        setField(term2843, term2843.getClass(), "thisType", null);
        setBooleanField(term2843, term2843.getClass(), "includeDocumentation", false);
        setField(term2829, term2829.getClass(), "docInfo", term2843);
        setBooleanField(term2829, term2829.getClass(), "unknown", true);
        setBooleanField(term2829, term2829.getClass(), "resolved", true);
        setField(term2829, term2829.getClass(), "resolveResult", null);
        setField(term2829, term2829.getClass(), "registry", null);
        setField(term2773, term2773.getClass(), "templateType", term2829);
        setField(term2762, term2762.getClass(), "registry", term2773);
        HashMap term8728 = new HashMap();
        Set<Object> term8771 =  ((Map) term8728).keySet();
        HashSet term8727 = new HashSet((Collection<? extends Object>) term8771);
        HashMap term8732 = new HashMap();
        HashMap term8734 = new HashMap();
        Set<Object> term8772 =  ((Map) term8734).keySet();
        HashSet term8733 = new HashSet((Collection<? extends Object>) term8772);
        HashMap term8736 = new HashMap();
        Set<Object> term8773 =  ((Map) term8736).keySet();
        HashSet term8735 = new HashSet((Collection<? extends Object>) term8773);
        HashMap term8738 = new HashMap();
        Set<Object> term8774 =  ((Map) term8738).keySet();
        HashSet term8737 = new HashSet((Collection<? extends Object>) term8774);
        HashMap term8739 = new HashMap();
        HashMap term8740 = new HashMap();
        term8726 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term8730 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term8731 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 4);
        Object term8743 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term8746 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term8726, term8726.getClass(), "alternates", term8727);
        setBooleanField(term8726, term8726.getClass(), "resolved", true);
        setField(term8726, term8726.getClass(), "resolveResult", null);
        setField(term8730, term8730.getClass(), "reporter", null);
        setField(term8730, term8730.getClass(), "nativeTypes", term8731);
        setField(term8730, term8730.getClass(), "namesToTypes", term8732);
        setField(term8730, term8730.getClass(), "namespaces", term8733);
        setField(term8730, term8730.getClass(), "enumTypeNames", term8735);
        setField(term8730, term8730.getClass(), "forwardDeclaredTypes", term8737);
        setField(term8730, term8730.getClass(), "typesIndexedByProperty", term8739);
        setField(term8730, term8730.getClass(), "greatestSubtypeByProperty", term8740);
        setField(term8730, term8730.getClass(), "interfaceToImplementors", null);
        setField(term8730, term8730.getClass(), "unresolvedNamedTypes", null);
        setField(term8730, term8730.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term8730, term8730.getClass(), "lastGeneration", true);
        setField(term8730, term8730.getClass(), "templateTypeName", "vSeruUyNWX");
        setField(term8743, term8743.getClass(), "name", "UkKvaeJfEC");
        setField(term8743, term8743.getClass(), "referencedType", null);
        setBooleanField(term8743, term8743.getClass(), "visited", false);
        setField(term8746, term8746.getClass(), "info", null);
        setField(term8746, term8746.getClass(), "documentation", null);
        setField(term8746, term8746.getClass(), "sourceName", null);
        setField(term8746, term8746.getClass(), "visibility", null);
        setIntField(term8746, term8746.getClass(), "bitset", 0);
        setField(term8746, term8746.getClass(), "type", null);
        setField(term8746, term8746.getClass(), "thisType", null);
        setBooleanField(term8746, term8746.getClass(), "includeDocumentation", false);
        setField(term8743, term8743.getClass(), "docInfo", term8746);
        setBooleanField(term8743, term8743.getClass(), "unknown", true);
        setBooleanField(term8743, term8743.getClass(), "resolved", true);
        setField(term8743, term8743.getClass(), "resolveResult", null);
        setField(term8743, term8743.getClass(), "registry", null);
        setField(term8730, term8730.getClass(), "templateType", term8743);
        setField(term8726, term8726.getClass(), "registry", term8730);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term2762, args);
        assertTrue(recursiveEquals(term2762, term8726));
        assertTrue(recursiveEquals(retValue, "()"));
    }

};


