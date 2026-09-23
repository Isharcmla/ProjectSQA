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

public class UnionType_matchesNumberContext_32580870433 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term752;
     Object term5148;

    public UnionType_matchesNumberContext_32580870433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term754 = new HashMap();
        Set<Object> term5170 =  ((Map) term754).keySet();
        HashSet term753 = new HashSet((Collection<? extends Object>) term5170);
        HashMap term765 = new HashMap();
        HashMap term774 = new HashMap();
        Set<Object> term5171 =  ((Map) term774).keySet();
        HashSet term773 = new HashSet((Collection<? extends Object>) term5171);
        HashMap term781 = new HashMap();
        Set<Object> term5172 =  ((Map) term781).keySet();
        HashSet term780 = new HashSet((Collection<? extends Object>) term5172);
        HashMap term788 = new HashMap();
        Set<Object> term5173 =  ((Map) term788).keySet();
        HashSet term787 = new HashSet((Collection<? extends Object>) term5173);
        HashMap term794 = new HashMap();
        HashMap term799 = new HashMap();
        term752 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term763 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term764 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 9);
        Object term820 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term834 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term752, term752.getClass(), "alternates", term753);
        setBooleanField(term752, term752.getClass(), "resolved", false);
        setField(term752, term752.getClass(), "resolveResult", null);
        setField(term763, term763.getClass(), "reporter", null);
        setField(term763, term763.getClass(), "nativeTypes", term764);
        setField(term763, term763.getClass(), "namesToTypes", term765);
        setField(term763, term763.getClass(), "namespaces", term773);
        setField(term763, term763.getClass(), "enumTypeNames", term780);
        setField(term763, term763.getClass(), "forwardDeclaredTypes", term787);
        setField(term763, term763.getClass(), "typesIndexedByProperty", term794);
        setField(term763, term763.getClass(), "greatestSubtypeByProperty", term799);
        setField(term763, term763.getClass(), "interfaceToImplementors", null);
        setField(term763, term763.getClass(), "unresolvedNamedTypes", null);
        setField(term763, term763.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term763, term763.getClass(), "lastGeneration", true);
        setField(term763, term763.getClass(), "templateTypeName", "jiKYgYHqIS");
        setField(term820, term820.getClass(), "name", "DfISiziTgG");
        setField(term820, term820.getClass(), "referencedType", null);
        setBooleanField(term820, term820.getClass(), "visited", true);
        setField(term834, term834.getClass(), "info", null);
        setField(term834, term834.getClass(), "documentation", null);
        setField(term834, term834.getClass(), "sourceName", null);
        setField(term834, term834.getClass(), "visibility", null);
        setIntField(term834, term834.getClass(), "bitset", 0);
        setField(term834, term834.getClass(), "type", null);
        setField(term834, term834.getClass(), "thisType", null);
        setBooleanField(term834, term834.getClass(), "includeDocumentation", false);
        setField(term820, term820.getClass(), "docInfo", term834);
        setBooleanField(term820, term820.getClass(), "unknown", false);
        setBooleanField(term820, term820.getClass(), "resolved", false);
        setField(term820, term820.getClass(), "resolveResult", null);
        setField(term820, term820.getClass(), "registry", null);
        setField(term763, term763.getClass(), "templateType", term820);
        setField(term752, term752.getClass(), "registry", term763);
        HashMap term5150 = new HashMap();
        Set<Object> term5194 =  ((Map) term5150).keySet();
        HashSet term5149 = new HashSet((Collection<? extends Object>) term5194);
        HashMap term5154 = new HashMap();
        HashMap term5156 = new HashMap();
        Set<Object> term5195 =  ((Map) term5156).keySet();
        HashSet term5155 = new HashSet((Collection<? extends Object>) term5195);
        HashMap term5158 = new HashMap();
        Set<Object> term5196 =  ((Map) term5158).keySet();
        HashSet term5157 = new HashSet((Collection<? extends Object>) term5196);
        HashMap term5160 = new HashMap();
        Set<Object> term5197 =  ((Map) term5160).keySet();
        HashSet term5159 = new HashSet((Collection<? extends Object>) term5197);
        HashMap term5161 = new HashMap();
        HashMap term5162 = new HashMap();
        term5148 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term5152 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term5153 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 9);
        Object term5165 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term5168 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term5148, term5148.getClass(), "alternates", term5149);
        setBooleanField(term5148, term5148.getClass(), "resolved", false);
        setField(term5148, term5148.getClass(), "resolveResult", null);
        setField(term5152, term5152.getClass(), "reporter", null);
        setField(term5152, term5152.getClass(), "nativeTypes", term5153);
        setField(term5152, term5152.getClass(), "namesToTypes", term5154);
        setField(term5152, term5152.getClass(), "namespaces", term5155);
        setField(term5152, term5152.getClass(), "enumTypeNames", term5157);
        setField(term5152, term5152.getClass(), "forwardDeclaredTypes", term5159);
        setField(term5152, term5152.getClass(), "typesIndexedByProperty", term5161);
        setField(term5152, term5152.getClass(), "greatestSubtypeByProperty", term5162);
        setField(term5152, term5152.getClass(), "interfaceToImplementors", null);
        setField(term5152, term5152.getClass(), "unresolvedNamedTypes", null);
        setField(term5152, term5152.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term5152, term5152.getClass(), "lastGeneration", true);
        setField(term5152, term5152.getClass(), "templateTypeName", "jiKYgYHqIS");
        setField(term5165, term5165.getClass(), "name", "DfISiziTgG");
        setField(term5165, term5165.getClass(), "referencedType", null);
        setBooleanField(term5165, term5165.getClass(), "visited", true);
        setField(term5168, term5168.getClass(), "info", null);
        setField(term5168, term5168.getClass(), "documentation", null);
        setField(term5168, term5168.getClass(), "sourceName", null);
        setField(term5168, term5168.getClass(), "visibility", null);
        setIntField(term5168, term5168.getClass(), "bitset", 0);
        setField(term5168, term5168.getClass(), "type", null);
        setField(term5168, term5168.getClass(), "thisType", null);
        setBooleanField(term5168, term5168.getClass(), "includeDocumentation", false);
        setField(term5165, term5165.getClass(), "docInfo", term5168);
        setBooleanField(term5165, term5165.getClass(), "unknown", false);
        setBooleanField(term5165, term5165.getClass(), "resolved", false);
        setField(term5165, term5165.getClass(), "resolveResult", null);
        setField(term5165, term5165.getClass(), "registry", null);
        setField(term5152, term5152.getClass(), "templateType", term5165);
        setField(term5148, term5148.getClass(), "registry", term5152);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "matchesNumberContext", argTypes, term752, args);
        assertTrue(recursiveEquals(term752, term5148));
        assertTrue(recursiveEquals(retValue, false));
    }

};


