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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.Boolean;

public class ClosureReverseAbstractInterpreter_restrictParameter_20687057055 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term607;
     Object term658;
     Object term685;

    public ClosureReverseAbstractInterpreter_restrictParameter_20687057055() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term608 = new HashMap();
        HashMap term615 = new HashMap();
        HashMap term624 = new HashMap();
        Set<Object> term1713 =  ((Map) term624).keySet();
        HashSet term623 = new HashSet((Collection<? extends Object>) term1713);
        HashMap term631 = new HashMap();
        Set<Object> term1714 =  ((Map) term631).keySet();
        HashSet term630 = new HashSet((Collection<? extends Object>) term1714);
        HashMap term638 = new HashMap();
        Set<Object> term1715 =  ((Map) term638).keySet();
        HashSet term637 = new HashSet((Collection<? extends Object>) term1715);
        HashMap term644 = new HashMap();
        HashMap term649 = new HashMap();
        term607 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        Object term613 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term614 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 2);
        setField(term607, term607.getClass(), "restrictToArrayVisitor", null);
        setField(term607, term607.getClass(), "restrictToNotArrayVisitor", null);
        setField(term607, term607.getClass(), "restrictToObjectVisitor", null);
        setField(term607, term607.getClass(), "restrictToNotObjectVisitor", null);
        setField(term607, term607.getClass(), "restricters", term608);
        setField(term607, term607.getClass(), "convention", null);
        setField(term613, term613.getClass(), "reporter", null);
        setField(term613, term613.getClass(), "nativeTypes", term614);
        setField(term613, term613.getClass(), "namesToTypes", term615);
        setField(term613, term613.getClass(), "namespaces", term623);
        setField(term613, term613.getClass(), "enumTypeNames", term630);
        setField(term613, term613.getClass(), "forwardDeclaredTypes", term637);
        setField(term613, term613.getClass(), "typesIndexedByProperty", term644);
        setField(term613, term613.getClass(), "greatestSubtypeByProperty", term649);
        setField(term613, term613.getClass(), "interfaceToImplementors", null);
        setField(term613, term613.getClass(), "unresolvedNamedTypes", null);
        setField(term613, term613.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term613, term613.getClass(), "lastGeneration", false);
        setField(term613, term613.getClass(), "templateTypeName", null);
        setField(term613, term613.getClass(), "templateType", null);
        setField(term607, term607.getClass(), "typeRegistry", term613);
        setField(term607, term607.getClass(), "firstLink", null);
        setField(term607, term607.getClass(), "nextLink", null);
        setField(term607, term607.getClass(), "restrictUndefinedVisitor", null);
        setField(term607, term607.getClass(), "restrictNullVisitor", null);
        term658 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term660 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term662 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term665 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term668 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term671 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term675 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term678 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term681 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term658, term658.getClass(), "type", -1456670397);
        setIntField(term660, term660.getClass(), "type", -6029667);
        setIntField(term662, term662.getClass(), "type", 0);
        setField(term662, term662.getClass(), "next", null);
        setField(term662, term662.getClass(), "first", null);
        setField(term662, term662.getClass(), "last", null);
        setField(term662, term662.getClass(), "propListHead", null);
        setIntField(term662, term662.getClass(), "sourcePosition", 0);
        setField(term662, term662.getClass(), "jsType", null);
        setField(term662, term662.getClass(), "parent", null);
        setField(term660, term660.getClass(), "next", term662);
        setIntField(term665, term665.getClass(), "type", 0);
        setField(term665, term665.getClass(), "next", null);
        setField(term665, term665.getClass(), "first", null);
        setField(term665, term665.getClass(), "last", null);
        setField(term665, term665.getClass(), "propListHead", null);
        setIntField(term665, term665.getClass(), "sourcePosition", 0);
        setField(term665, term665.getClass(), "jsType", null);
        setField(term665, term665.getClass(), "parent", null);
        setField(term660, term660.getClass(), "first", term665);
        setIntField(term668, term668.getClass(), "type", 0);
        setField(term668, term668.getClass(), "next", null);
        setField(term668, term668.getClass(), "first", null);
        setField(term668, term668.getClass(), "last", null);
        setField(term668, term668.getClass(), "propListHead", null);
        setIntField(term668, term668.getClass(), "sourcePosition", 0);
        setField(term668, term668.getClass(), "jsType", null);
        setField(term668, term668.getClass(), "parent", null);
        setField(term660, term660.getClass(), "last", term668);
        setField(term671, term671.getClass(), "next", null);
        setIntField(term671, term671.getClass(), "type", 0);
        setIntField(term671, term671.getClass(), "intValue", 0);
        setField(term671, term671.getClass(), "objectValue", null);
        setField(term660, term660.getClass(), "propListHead", term671);
        setIntField(term660, term660.getClass(), "sourcePosition", -1007160944);
        setField(term660, term660.getClass(), "jsType", null);
        setField(term660, term660.getClass(), "parent", null);
        setField(term658, term658.getClass(), "next", term660);
        setIntField(term675, term675.getClass(), "type", 0);
        setField(term675, term675.getClass(), "next", null);
        setField(term675, term675.getClass(), "first", null);
        setField(term675, term675.getClass(), "last", null);
        setField(term675, term675.getClass(), "propListHead", null);
        setIntField(term675, term675.getClass(), "sourcePosition", 0);
        setField(term675, term675.getClass(), "jsType", null);
        setField(term675, term675.getClass(), "parent", null);
        setField(term658, term658.getClass(), "first", term675);
        setIntField(term678, term678.getClass(), "type", 0);
        setField(term678, term678.getClass(), "next", null);
        setField(term678, term678.getClass(), "first", null);
        setField(term678, term678.getClass(), "last", null);
        setField(term678, term678.getClass(), "propListHead", null);
        setIntField(term678, term678.getClass(), "sourcePosition", 0);
        setField(term678, term678.getClass(), "jsType", null);
        setField(term678, term678.getClass(), "parent", null);
        setField(term658, term658.getClass(), "last", term678);
        setField(term681, term681.getClass(), "next", null);
        setIntField(term681, term681.getClass(), "type", 0);
        setIntField(term681, term681.getClass(), "intValue", 0);
        setField(term681, term681.getClass(), "objectValue", null);
        setField(term658, term658.getClass(), "propListHead", term681);
        setIntField(term658, term658.getClass(), "sourcePosition", 1135664017);
        setField(term658, term658.getClass(), "jsType", null);
        setField(term658, term658.getClass(), "parent", null);
        term685 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.FlowScope");
        argTypes[3] = Class.forName("com.google.common.base.Function");
        argTypes[4] = boolean.class;
        Object[] args = new Object[5];
        args[0] = term658;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = term685;
        try {
            callMethod(klass, "restrictParameter", argTypes, term607, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


