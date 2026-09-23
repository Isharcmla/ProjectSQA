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
     Object term779;
     Object term4183;

    public RemoveUnusedVars_removeUnreferencedVars_6155643027() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term783 = new HashMap();
        Set<Object> term4192 =  ((Map) term783).keySet();
        HashSet term782 = new HashSet((Collection<? extends Object>) term4192);
        ArrayList term791 = new ArrayList();
        Object term797 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term797, term797.getClass(), "vars", null);
        setField(term797, term797.getClass(), "parent", null);
        setIntField(term797, term797.getClass(), "depth", 0);
        setField(term797, term797.getClass(), "rootNode", null);
        setField(term797, term797.getClass(), "thisType", null);
        setBooleanField(term797, term797.getClass(), "isBottom", false);
        setField(term797, term797.getClass(), "arguments", null);
        Object term800 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term800, term800.getClass(), "vars", null);
        setField(term800, term800.getClass(), "parent", null);
        setIntField(term800, term800.getClass(), "depth", 0);
        setField(term800, term800.getClass(), "rootNode", null);
        setField(term800, term800.getClass(), "thisType", null);
        setBooleanField(term800, term800.getClass(), "isBottom", false);
        setField(term800, term800.getClass(), "arguments", null);
        ArrayList term795 = new ArrayList();
        ((ArrayList) term795).add(term797);
        ((ArrayList) term795).add(term800);
        term779 = newInstance(Class.forName("com.google.javascript.jscomp.RemoveUnusedVars"));
        setField(term779, term779.getClass(), "compiler", null);
        setField(term779, term779.getClass(), "codingConvention", null);
        setBooleanField(term779, term779.getClass(), "removeGlobals", false);
        setBooleanField(term779, term779.getClass(), "preserveFunctionExpressionNames", false);
        setField(term779, term779.getClass(), "referenced", term782);
        setField(term779, term779.getClass(), "maybeUnreferenced", term791);
        setField(term779, term779.getClass(), "allFunctionScopes", term795);
        setField(term779, term779.getClass(), "assignsByVar", null);
        setField(term779, term779.getClass(), "assignsByNode", null);
        setField(term779, term779.getClass(), "inheritsCalls", null);
        setField(term779, term779.getClass(), "continuations", null);
        setBooleanField(term779, term779.getClass(), "modifyCallSites", false);
        setField(term779, term779.getClass(), "callSiteOptimizer", null);
        HashMap term4185 = new HashMap();
        Set<Object> term4193 =  ((Map) term4185).keySet();
        HashSet term4184 = new HashSet((Collection<? extends Object>) term4193);
        ArrayList term4186 = new ArrayList();
        Object term4190 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term4190, term4190.getClass(), "vars", null);
        setField(term4190, term4190.getClass(), "parent", null);
        setIntField(term4190, term4190.getClass(), "depth", 0);
        setField(term4190, term4190.getClass(), "rootNode", null);
        setField(term4190, term4190.getClass(), "thisType", null);
        setBooleanField(term4190, term4190.getClass(), "isBottom", false);
        setField(term4190, term4190.getClass(), "arguments", null);
        Object term4191 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term4191, term4191.getClass(), "vars", null);
        setField(term4191, term4191.getClass(), "parent", null);
        setIntField(term4191, term4191.getClass(), "depth", 0);
        setField(term4191, term4191.getClass(), "rootNode", null);
        setField(term4191, term4191.getClass(), "thisType", null);
        setBooleanField(term4191, term4191.getClass(), "isBottom", false);
        setField(term4191, term4191.getClass(), "arguments", null);
        ArrayList term4188 = new ArrayList();
        ((ArrayList) term4188).add(term4190);
        ((ArrayList) term4188).add(term4191);
        term4183 = newInstance(Class.forName("com.google.javascript.jscomp.RemoveUnusedVars"));
        setField(term4183, term4183.getClass(), "compiler", null);
        setField(term4183, term4183.getClass(), "codingConvention", null);
        setBooleanField(term4183, term4183.getClass(), "removeGlobals", false);
        setBooleanField(term4183, term4183.getClass(), "preserveFunctionExpressionNames", false);
        setField(term4183, term4183.getClass(), "referenced", term4184);
        setField(term4183, term4183.getClass(), "maybeUnreferenced", term4186);
        setField(term4183, term4183.getClass(), "allFunctionScopes", term4188);
        setField(term4183, term4183.getClass(), "assignsByVar", null);
        setField(term4183, term4183.getClass(), "assignsByNode", null);
        setField(term4183, term4183.getClass(), "inheritsCalls", null);
        setField(term4183, term4183.getClass(), "continuations", null);
        setBooleanField(term4183, term4183.getClass(), "modifyCallSites", false);
        setField(term4183, term4183.getClass(), "callSiteOptimizer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "removeUnreferencedVars", argTypes, term779, args);
        assertTrue(recursiveEquals(term779, term4183));
    }

};


