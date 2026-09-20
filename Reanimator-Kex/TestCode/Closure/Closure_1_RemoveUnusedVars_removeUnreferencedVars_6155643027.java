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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;

public class RemoveUnusedVars_removeUnreferencedVars_6155643027 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term799;
     Object term4639;

    public RemoveUnusedVars_removeUnreferencedVars_6155643027() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term803 = new HashMap();
        Set<Object> term4648 =  ((Map) term803).keySet();
        HashSet term802 = new HashSet((Collection<? extends Object>) term4648);
        ArrayList term811 = new ArrayList();
        Object term817 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term817, term817.getClass(), "vars", null);
        setField(term817, term817.getClass(), "parent", null);
        setIntField(term817, term817.getClass(), "depth", 0);
        setField(term817, term817.getClass(), "rootNode", null);
        setBooleanField(term817, term817.getClass(), "isBottom", false);
        setField(term817, term817.getClass(), "arguments", null);
        Object term820 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term820, term820.getClass(), "vars", null);
        setField(term820, term820.getClass(), "parent", null);
        setIntField(term820, term820.getClass(), "depth", 0);
        setField(term820, term820.getClass(), "rootNode", null);
        setBooleanField(term820, term820.getClass(), "isBottom", false);
        setField(term820, term820.getClass(), "arguments", null);
        ArrayList term815 = new ArrayList();
        ((ArrayList) term815).add(term817);
        ((ArrayList) term815).add(term820);
        term799 = newInstance(Class.forName("com.google.javascript.jscomp.RemoveUnusedVars"));
        setField(term799, term799.getClass(), "compiler", null);
        setField(term799, term799.getClass(), "codingConvention", null);
        setBooleanField(term799, term799.getClass(), "removeGlobals", true);
        setBooleanField(term799, term799.getClass(), "preserveFunctionExpressionNames", true);
        setField(term799, term799.getClass(), "referenced", term802);
        setField(term799, term799.getClass(), "maybeUnreferenced", term811);
        setField(term799, term799.getClass(), "allFunctionScopes", term815);
        setField(term799, term799.getClass(), "assignsByVar", null);
        setField(term799, term799.getClass(), "assignsByNode", null);
        setField(term799, term799.getClass(), "classDefiningCalls", null);
        setField(term799, term799.getClass(), "continuations", null);
        setBooleanField(term799, term799.getClass(), "modifyCallSites", false);
        setField(term799, term799.getClass(), "callSiteOptimizer", null);
        HashMap term4641 = new HashMap();
        Set<Object> term4649 =  ((Map) term4641).keySet();
        HashSet term4640 = new HashSet((Collection<? extends Object>) term4649);
        ArrayList term4642 = new ArrayList();
        Object term4646 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term4646, term4646.getClass(), "vars", null);
        setField(term4646, term4646.getClass(), "parent", null);
        setIntField(term4646, term4646.getClass(), "depth", 0);
        setField(term4646, term4646.getClass(), "rootNode", null);
        setBooleanField(term4646, term4646.getClass(), "isBottom", false);
        setField(term4646, term4646.getClass(), "arguments", null);
        Object term4647 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term4647, term4647.getClass(), "vars", null);
        setField(term4647, term4647.getClass(), "parent", null);
        setIntField(term4647, term4647.getClass(), "depth", 0);
        setField(term4647, term4647.getClass(), "rootNode", null);
        setBooleanField(term4647, term4647.getClass(), "isBottom", false);
        setField(term4647, term4647.getClass(), "arguments", null);
        ArrayList term4644 = new ArrayList();
        ((ArrayList) term4644).add(term4646);
        ((ArrayList) term4644).add(term4647);
        term4639 = newInstance(Class.forName("com.google.javascript.jscomp.RemoveUnusedVars"));
        setField(term4639, term4639.getClass(), "compiler", null);
        setField(term4639, term4639.getClass(), "codingConvention", null);
        setBooleanField(term4639, term4639.getClass(), "removeGlobals", true);
        setBooleanField(term4639, term4639.getClass(), "preserveFunctionExpressionNames", true);
        setField(term4639, term4639.getClass(), "referenced", term4640);
        setField(term4639, term4639.getClass(), "maybeUnreferenced", term4642);
        setField(term4639, term4639.getClass(), "allFunctionScopes", term4644);
        setField(term4639, term4639.getClass(), "assignsByVar", null);
        setField(term4639, term4639.getClass(), "assignsByNode", null);
        setField(term4639, term4639.getClass(), "classDefiningCalls", null);
        setField(term4639, term4639.getClass(), "continuations", null);
        setBooleanField(term4639, term4639.getClass(), "modifyCallSites", false);
        setField(term4639, term4639.getClass(), "callSiteOptimizer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "removeUnreferencedVars", argTypes, term799, args);
        assertTrue(recursiveEquals(term799, term4639));
    }

};
