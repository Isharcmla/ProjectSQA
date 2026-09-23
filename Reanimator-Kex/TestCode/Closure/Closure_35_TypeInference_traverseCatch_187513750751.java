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

public class TypeInference_traverseCatch_187513750751 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term662;
     Object term717;

    public TypeInference_traverseCatch_187513750751() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term665 = new HashMap();
        HashMap term674 = new HashMap();
        Set<Object> term9677 =  ((Map) term674).keySet();
        HashSet term673 = new HashSet((Collection<? extends Object>) term9677);
        HashMap term681 = new HashMap();
        Set<Object> term9678 =  ((Map) term681).keySet();
        HashSet term680 = new HashSet((Collection<? extends Object>) term9678);
        HashMap term688 = new HashMap();
        Set<Object> term9679 =  ((Map) term688).keySet();
        HashSet term687 = new HashSet((Collection<? extends Object>) term9679);
        HashMap term694 = new HashMap();
        HashMap term702 = new HashMap();
        HashMap term707 = new HashMap();
        term662 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term663 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term664 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 7);
        setField(term662, term662.getClass(), "compiler", null);
        setField(term663, term663.getClass(), "reporter", null);
        setField(term663, term663.getClass(), "nativeTypes", term664);
        setField(term663, term663.getClass(), "namesToTypes", term665);
        setField(term663, term663.getClass(), "namespaces", term673);
        setField(term663, term663.getClass(), "nonNullableTypeNames", term680);
        setField(term663, term663.getClass(), "forwardDeclaredTypes", term687);
        setField(term663, term663.getClass(), "typesIndexedByProperty", term694);
        setField(term663, term663.getClass(), "eachRefTypeIndexedByProperty", term702);
        setField(term663, term663.getClass(), "greatestSubtypeByProperty", term707);
        setField(term663, term663.getClass(), "interfaceToImplementors", null);
        setField(term663, term663.getClass(), "unresolvedNamedTypes", null);
        setField(term663, term663.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term663, term663.getClass(), "lastGeneration", false);
        setField(term663, term663.getClass(), "templateTypeName", null);
        setField(term663, term663.getClass(), "templateType", null);
        setBooleanField(term663, term663.getClass(), "tolerateUndefinedValues", false);
        setField(term663, term663.getClass(), "resolveMode", null);
        setField(term662, term662.getClass(), "registry", term663);
        setField(term662, term662.getClass(), "reverseInterpreter", null);
        setField(term662, term662.getClass(), "syntacticScope", null);
        setField(term662, term662.getClass(), "functionScope", null);
        setField(term662, term662.getClass(), "bottomScope", null);
        setField(term662, term662.getClass(), "assertionFunctionsMap", null);
        setField(term662, term662.getClass(), "cfg", null);
        setField(term662, term662.getClass(), "joinOp", null);
        setField(term662, term662.getClass(), "orderedWorkSet", null);
        term717 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term719 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term721 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term723 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term725 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term728 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term732 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term734 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term739 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term717, term717.getClass(), "type", -1845499264);
        setIntField(term719, term719.getClass(), "type", -505439934);
        setIntField(term721, term721.getClass(), "type", -344842608);
        setIntField(term723, term723.getClass(), "type", 941650513);
        setIntField(term725, term725.getClass(), "type", 444029505);
        setField(term725, term725.getClass(), "next", null);
        setField(term725, term725.getClass(), "first", null);
        setField(term725, term725.getClass(), "last", null);
        setField(term725, term725.getClass(), "propListHead", null);
        setIntField(term725, term725.getClass(), "sourcePosition", 0);
        setField(term725, term725.getClass(), "jsType", null);
        setField(term725, term725.getClass(), "parent", null);
        setField(term723, term723.getClass(), "next", term725);
        setIntField(term728, term728.getClass(), "type", -1034506028);
        setField(term728, term728.getClass(), "next", null);
        setField(term728, term728.getClass(), "first", null);
        setField(term728, term728.getClass(), "last", term725);
        setField(term728, term728.getClass(), "propListHead", null);
        setIntField(term728, term728.getClass(), "sourcePosition", 0);
        setField(term728, term728.getClass(), "jsType", null);
        setField(term728, term728.getClass(), "parent", null);
        setField(term723, term723.getClass(), "first", term728);
        setField(term723, term723.getClass(), "last", term721);
        setField(term723, term723.getClass(), "propListHead", null);
        setIntField(term723, term723.getClass(), "sourcePosition", 0);
        setField(term723, term723.getClass(), "jsType", null);
        setField(term723, term723.getClass(), "parent", null);
        setField(term721, term721.getClass(), "next", term723);
        setField(term721, term721.getClass(), "first", term725);
        setIntField(term732, term732.getClass(), "type", -894662986);
        setIntField(term734, term734.getClass(), "type", 304775596);
        setField(term734, term734.getClass(), "next", null);
        setField(term734, term734.getClass(), "first", term728);
        setField(term734, term734.getClass(), "last", term723);
        setField(term734, term734.getClass(), "propListHead", null);
        setIntField(term734, term734.getClass(), "sourcePosition", 0);
        setField(term734, term734.getClass(), "jsType", null);
        setField(term734, term734.getClass(), "parent", null);
        setField(term732, term732.getClass(), "next", term734);
        setField(term732, term732.getClass(), "first", term719);
        setField(term732, term732.getClass(), "last", term719);
        setField(term732, term732.getClass(), "propListHead", null);
        setIntField(term732, term732.getClass(), "sourcePosition", 0);
        setField(term732, term732.getClass(), "jsType", null);
        setField(term732, term732.getClass(), "parent", null);
        setField(term721, term721.getClass(), "last", term732);
        setField(term721, term721.getClass(), "propListHead", null);
        setIntField(term721, term721.getClass(), "sourcePosition", 0);
        setField(term721, term721.getClass(), "jsType", null);
        setField(term721, term721.getClass(), "parent", null);
        setField(term719, term719.getClass(), "next", term721);
        setIntField(term739, term739.getClass(), "type", -1347665717);
        setField(term739, term739.getClass(), "next", term732);
        setField(term739, term739.getClass(), "first", term734);
        setField(term739, term739.getClass(), "last", term717);
        setField(term739, term739.getClass(), "propListHead", null);
        setIntField(term739, term739.getClass(), "sourcePosition", 0);
        setField(term739, term739.getClass(), "jsType", null);
        setField(term739, term739.getClass(), "parent", null);
        setField(term719, term719.getClass(), "first", term739);
        setField(term719, term719.getClass(), "last", term739);
        setField(term719, term719.getClass(), "propListHead", null);
        setIntField(term719, term719.getClass(), "sourcePosition", 0);
        setField(term719, term719.getClass(), "jsType", null);
        setField(term719, term719.getClass(), "parent", null);
        setField(term717, term717.getClass(), "next", term719);
        setField(term717, term717.getClass(), "first", term723);
        setField(term717, term717.getClass(), "last", term725);
        setField(term717, term717.getClass(), "propListHead", null);
        setIntField(term717, term717.getClass(), "sourcePosition", 0);
        setField(term717, term717.getClass(), "jsType", null);
        setField(term717, term717.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term717;
        args[1] = null;
        try {
            callMethod(klass, "traverseCatch", argTypes, term662, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


