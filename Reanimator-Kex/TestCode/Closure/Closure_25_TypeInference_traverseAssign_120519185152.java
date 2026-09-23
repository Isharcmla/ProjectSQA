package com.google.javascript.jscomp;

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
import java.lang.ArrayIndexOutOfBoundsException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class TypeInference_traverseAssign_120519185152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term747;
     Object term802;

    public TypeInference_traverseAssign_120519185152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term750 = new HashMap();
        HashMap term759 = new HashMap();
        Set<Object> term10187 =  ((Map) term759).keySet();
        HashSet term758 = new HashSet((Collection<? extends Object>) term10187);
        HashMap term766 = new HashMap();
        Set<Object> term10188 =  ((Map) term766).keySet();
        HashSet term765 = new HashSet((Collection<? extends Object>) term10188);
        HashMap term773 = new HashMap();
        Set<Object> term10189 =  ((Map) term773).keySet();
        HashSet term772 = new HashSet((Collection<? extends Object>) term10189);
        HashMap term779 = new HashMap();
        HashMap term787 = new HashMap();
        HashMap term792 = new HashMap();
        term747 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term748 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term749 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 6);
        setField(term747, term747.getClass(), "compiler", null);
        setField(term748, term748.getClass(), "reporter", null);
        setField(term748, term748.getClass(), "nativeTypes", term749);
        setField(term748, term748.getClass(), "namesToTypes", term750);
        setField(term748, term748.getClass(), "namespaces", term758);
        setField(term748, term748.getClass(), "nonNullableTypeNames", term765);
        setField(term748, term748.getClass(), "forwardDeclaredTypes", term772);
        setField(term748, term748.getClass(), "typesIndexedByProperty", term779);
        setField(term748, term748.getClass(), "eachRefTypeIndexedByProperty", term787);
        setField(term748, term748.getClass(), "greatestSubtypeByProperty", term792);
        setField(term748, term748.getClass(), "interfaceToImplementors", null);
        setField(term748, term748.getClass(), "unresolvedNamedTypes", null);
        setField(term748, term748.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term748, term748.getClass(), "lastGeneration", false);
        setField(term748, term748.getClass(), "templateTypeName", null);
        setField(term748, term748.getClass(), "templateType", null);
        setBooleanField(term748, term748.getClass(), "tolerateUndefinedValues", false);
        setField(term748, term748.getClass(), "resolveMode", null);
        setField(term747, term747.getClass(), "registry", term748);
        setField(term747, term747.getClass(), "reverseInterpreter", null);
        setField(term747, term747.getClass(), "syntacticScope", null);
        setField(term747, term747.getClass(), "functionScope", null);
        setField(term747, term747.getClass(), "bottomScope", null);
        setField(term747, term747.getClass(), "assertionFunctionsMap", null);
        setField(term747, term747.getClass(), "cfg", null);
        setField(term747, term747.getClass(), "joinOp", null);
        setField(term747, term747.getClass(), "orderedWorkSet", null);
        term802 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term804 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term806 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term808 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term810 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term813 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term817 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term819 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term824 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term802, term802.getClass(), "type", -1210583429);
        setIntField(term804, term804.getClass(), "type", -663691365);
        setIntField(term806, term806.getClass(), "type", 339854490);
        setIntField(term808, term808.getClass(), "type", -615654495);
        setIntField(term810, term810.getClass(), "type", -1476117762);
        setField(term810, term810.getClass(), "next", null);
        setField(term810, term810.getClass(), "first", null);
        setField(term810, term810.getClass(), "last", null);
        setField(term810, term810.getClass(), "propListHead", null);
        setIntField(term810, term810.getClass(), "sourcePosition", 0);
        setField(term810, term810.getClass(), "jsType", null);
        setField(term810, term810.getClass(), "parent", null);
        setField(term808, term808.getClass(), "next", term810);
        setIntField(term813, term813.getClass(), "type", -341962980);
        setField(term813, term813.getClass(), "next", null);
        setField(term813, term813.getClass(), "first", null);
        setField(term813, term813.getClass(), "last", term810);
        setField(term813, term813.getClass(), "propListHead", null);
        setIntField(term813, term813.getClass(), "sourcePosition", 0);
        setField(term813, term813.getClass(), "jsType", null);
        setField(term813, term813.getClass(), "parent", null);
        setField(term808, term808.getClass(), "first", term813);
        setField(term808, term808.getClass(), "last", term806);
        setField(term808, term808.getClass(), "propListHead", null);
        setIntField(term808, term808.getClass(), "sourcePosition", 0);
        setField(term808, term808.getClass(), "jsType", null);
        setField(term808, term808.getClass(), "parent", null);
        setField(term806, term806.getClass(), "next", term808);
        setField(term806, term806.getClass(), "first", term810);
        setIntField(term817, term817.getClass(), "type", -1801760683);
        setIntField(term819, term819.getClass(), "type", 1141317871);
        setField(term819, term819.getClass(), "next", null);
        setField(term819, term819.getClass(), "first", term813);
        setField(term819, term819.getClass(), "last", term808);
        setField(term819, term819.getClass(), "propListHead", null);
        setIntField(term819, term819.getClass(), "sourcePosition", 0);
        setField(term819, term819.getClass(), "jsType", null);
        setField(term819, term819.getClass(), "parent", null);
        setField(term817, term817.getClass(), "next", term819);
        setField(term817, term817.getClass(), "first", term804);
        setField(term817, term817.getClass(), "last", term804);
        setField(term817, term817.getClass(), "propListHead", null);
        setIntField(term817, term817.getClass(), "sourcePosition", 0);
        setField(term817, term817.getClass(), "jsType", null);
        setField(term817, term817.getClass(), "parent", null);
        setField(term806, term806.getClass(), "last", term817);
        setField(term806, term806.getClass(), "propListHead", null);
        setIntField(term806, term806.getClass(), "sourcePosition", 0);
        setField(term806, term806.getClass(), "jsType", null);
        setField(term806, term806.getClass(), "parent", null);
        setField(term804, term804.getClass(), "next", term806);
        setIntField(term824, term824.getClass(), "type", 890669485);
        setField(term824, term824.getClass(), "next", term817);
        setField(term824, term824.getClass(), "first", term819);
        setField(term824, term824.getClass(), "last", term802);
        setField(term824, term824.getClass(), "propListHead", null);
        setIntField(term824, term824.getClass(), "sourcePosition", 0);
        setField(term824, term824.getClass(), "jsType", null);
        setField(term824, term824.getClass(), "parent", null);
        setField(term804, term804.getClass(), "first", term824);
        setField(term804, term804.getClass(), "last", term824);
        setField(term804, term804.getClass(), "propListHead", null);
        setIntField(term804, term804.getClass(), "sourcePosition", 0);
        setField(term804, term804.getClass(), "jsType", null);
        setField(term804, term804.getClass(), "parent", null);
        setField(term802, term802.getClass(), "next", term804);
        setField(term802, term802.getClass(), "first", term808);
        setField(term802, term802.getClass(), "last", term810);
        setField(term802, term802.getClass(), "propListHead", null);
        setIntField(term802, term802.getClass(), "sourcePosition", 0);
        setField(term802, term802.getClass(), "jsType", null);
        setField(term802, term802.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term802;
        args[1] = null;
        try {
            callMethod(klass, "traverseAssign", argTypes, term747, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


