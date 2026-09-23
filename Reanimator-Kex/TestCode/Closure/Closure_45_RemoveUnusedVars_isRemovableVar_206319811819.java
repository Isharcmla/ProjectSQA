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
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;

public class RemoveUnusedVars_isRemovableVar_206319811819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term277;
     Object term334;

    public RemoveUnusedVars_isRemovableVar_206319811819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term281 = new HashMap();
        Set<Object> term2577 =  ((Map) term281).keySet();
        HashSet term280 = new HashSet((Collection<? extends Object>) term2577);
        Object term291 = newInstance(Class.forName("com.google.javascript.jscomp.Scope$Var"));
        setField(term291, term291.getClass(), "name", null);
        setField(term291, term291.getClass(), "nameNode", null);
        setField(term291, term291.getClass(), "type", null);
        setField(term291, term291.getClass(), "info", null);
        setBooleanField(term291, term291.getClass(), "typeInferred", false);
        setField(term291, term291.getClass(), "input", null);
        setBooleanField(term291, term291.getClass(), "isDefine", false);
        setIntField(term291, term291.getClass(), "index", 0);
        setField(term291, term291.getClass(), "scope", null);
        setBooleanField(term291, term291.getClass(), "markedEscaped", false);
        Object term296 = newInstance(Class.forName("com.google.javascript.jscomp.Scope$Var"));
        setField(term296, term296.getClass(), "name", null);
        setField(term296, term296.getClass(), "nameNode", null);
        setField(term296, term296.getClass(), "type", null);
        setField(term296, term296.getClass(), "info", null);
        setBooleanField(term296, term296.getClass(), "typeInferred", false);
        setField(term296, term296.getClass(), "input", null);
        setBooleanField(term296, term296.getClass(), "isDefine", false);
        setIntField(term296, term296.getClass(), "index", 0);
        setField(term296, term296.getClass(), "scope", null);
        setBooleanField(term296, term296.getClass(), "markedEscaped", false);
        Object term301 = newInstance(Class.forName("com.google.javascript.jscomp.Scope$Var"));
        setField(term301, term301.getClass(), "name", null);
        setField(term301, term301.getClass(), "nameNode", null);
        setField(term301, term301.getClass(), "type", null);
        setField(term301, term301.getClass(), "info", null);
        setBooleanField(term301, term301.getClass(), "typeInferred", false);
        setField(term301, term301.getClass(), "input", null);
        setBooleanField(term301, term301.getClass(), "isDefine", false);
        setIntField(term301, term301.getClass(), "index", 0);
        setField(term301, term301.getClass(), "scope", null);
        setBooleanField(term301, term301.getClass(), "markedEscaped", false);
        Object term306 = newInstance(Class.forName("com.google.javascript.jscomp.Scope$Var"));
        setField(term306, term306.getClass(), "name", null);
        setField(term306, term306.getClass(), "nameNode", null);
        setField(term306, term306.getClass(), "type", null);
        setField(term306, term306.getClass(), "info", null);
        setBooleanField(term306, term306.getClass(), "typeInferred", false);
        setField(term306, term306.getClass(), "input", null);
        setBooleanField(term306, term306.getClass(), "isDefine", false);
        setIntField(term306, term306.getClass(), "index", 0);
        setField(term306, term306.getClass(), "scope", null);
        setBooleanField(term306, term306.getClass(), "markedEscaped", false);
        Object term311 = newInstance(Class.forName("com.google.javascript.jscomp.Scope$Var"));
        setField(term311, term311.getClass(), "name", null);
        setField(term311, term311.getClass(), "nameNode", null);
        setField(term311, term311.getClass(), "type", null);
        setField(term311, term311.getClass(), "info", null);
        setBooleanField(term311, term311.getClass(), "typeInferred", false);
        setField(term311, term311.getClass(), "input", null);
        setBooleanField(term311, term311.getClass(), "isDefine", false);
        setIntField(term311, term311.getClass(), "index", 0);
        setField(term311, term311.getClass(), "scope", null);
        setBooleanField(term311, term311.getClass(), "markedEscaped", false);
        Object term316 = newInstance(Class.forName("com.google.javascript.jscomp.Scope$Var"));
        setField(term316, term316.getClass(), "name", null);
        setField(term316, term316.getClass(), "nameNode", null);
        setField(term316, term316.getClass(), "type", null);
        setField(term316, term316.getClass(), "info", null);
        setBooleanField(term316, term316.getClass(), "typeInferred", false);
        setField(term316, term316.getClass(), "input", null);
        setBooleanField(term316, term316.getClass(), "isDefine", false);
        setIntField(term316, term316.getClass(), "index", 0);
        setField(term316, term316.getClass(), "scope", null);
        setBooleanField(term316, term316.getClass(), "markedEscaped", false);
        ArrayList term289 = new ArrayList();
        ((ArrayList) term289).add(term291);
        ((ArrayList) term289).add(term296);
        ((ArrayList) term289).add(term301);
        ((ArrayList) term289).add(term306);
        ((ArrayList) term289).add(term311);
        ((ArrayList) term289).add(term316);
        Object term325 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term325, term325.getClass(), "vars", null);
        setField(term325, term325.getClass(), "parent", null);
        setIntField(term325, term325.getClass(), "depth", 0);
        setField(term325, term325.getClass(), "rootNode", null);
        setField(term325, term325.getClass(), "thisType", null);
        setBooleanField(term325, term325.getClass(), "isBottom", false);
        setField(term325, term325.getClass(), "arguments", null);
        Object term328 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term328, term328.getClass(), "vars", null);
        setField(term328, term328.getClass(), "parent", null);
        setIntField(term328, term328.getClass(), "depth", 0);
        setField(term328, term328.getClass(), "rootNode", null);
        setField(term328, term328.getClass(), "thisType", null);
        setBooleanField(term328, term328.getClass(), "isBottom", false);
        setField(term328, term328.getClass(), "arguments", null);
        ArrayList term323 = new ArrayList();
        ((ArrayList) term323).add(term325);
        ((ArrayList) term323).add(term328);
        term277 = newInstance(Class.forName("com.google.javascript.jscomp.RemoveUnusedVars"));
        setField(term277, term277.getClass(), "compiler", null);
        setField(term277, term277.getClass(), "codingConvention", null);
        setBooleanField(term277, term277.getClass(), "removeGlobals", true);
        setBooleanField(term277, term277.getClass(), "preserveFunctionExpressionNames", false);
        setField(term277, term277.getClass(), "referenced", term280);
        setField(term277, term277.getClass(), "maybeUnreferenced", term289);
        setField(term277, term277.getClass(), "allFunctionScopes", term323);
        setField(term277, term277.getClass(), "assignsByVar", null);
        setField(term277, term277.getClass(), "assignsByNode", null);
        setField(term277, term277.getClass(), "inheritsCalls", null);
        setField(term277, term277.getClass(), "continuations", null);
        setBooleanField(term277, term277.getClass(), "modifyCallSites", false);
        setField(term277, term277.getClass(), "callSiteOptimizer", null);
        term334 = newInstance(Class.forName("com.google.javascript.jscomp.Scope$Var"));
        Object term347 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term349 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term351 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term353 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term356 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term359 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term363 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term367 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term334, term334.getClass(), "name", "MjGYSRKTNF");
        setIntField(term347, term347.getClass(), "type", -1963434938);
        setIntField(term349, term349.getClass(), "type", 906181092);
        setIntField(term351, term351.getClass(), "type", 1045657203);
        setIntField(term353, term353.getClass(), "type", 1386130016);
        setField(term353, term353.getClass(), "next", null);
        setField(term353, term353.getClass(), "first", null);
        setField(term353, term353.getClass(), "last", null);
        setField(term353, term353.getClass(), "propListHead", null);
        setIntField(term353, term353.getClass(), "sourcePosition", 0);
        setField(term353, term353.getClass(), "jsType", null);
        setField(term353, term353.getClass(), "parent", null);
        setField(term351, term351.getClass(), "next", term353);
        setIntField(term356, term356.getClass(), "type", 568954359);
        setField(term356, term356.getClass(), "next", null);
        setField(term356, term356.getClass(), "first", term347);
        setField(term356, term356.getClass(), "last", null);
        setField(term356, term356.getClass(), "propListHead", null);
        setIntField(term356, term356.getClass(), "sourcePosition", 0);
        setField(term356, term356.getClass(), "jsType", null);
        setField(term356, term356.getClass(), "parent", null);
        setField(term351, term351.getClass(), "first", term356);
        setIntField(term359, term359.getClass(), "type", 1861318859);
        setField(term359, term359.getClass(), "next", null);
        setField(term359, term359.getClass(), "first", term349);
        setField(term359, term359.getClass(), "last", null);
        setField(term359, term359.getClass(), "propListHead", null);
        setIntField(term359, term359.getClass(), "sourcePosition", 0);
        setField(term359, term359.getClass(), "jsType", null);
        setField(term359, term359.getClass(), "parent", null);
        setField(term351, term351.getClass(), "last", term359);
        setField(term351, term351.getClass(), "propListHead", null);
        setIntField(term351, term351.getClass(), "sourcePosition", 0);
        setField(term351, term351.getClass(), "jsType", null);
        setField(term351, term351.getClass(), "parent", null);
        setField(term349, term349.getClass(), "next", term351);
        setField(term349, term349.getClass(), "first", term351);
        setIntField(term363, term363.getClass(), "type", 1072005683);
        setField(term363, term363.getClass(), "next", term359);
        setField(term363, term363.getClass(), "first", term356);
        setField(term363, term363.getClass(), "last", term356);
        setField(term363, term363.getClass(), "propListHead", null);
        setIntField(term363, term363.getClass(), "sourcePosition", 0);
        setField(term363, term363.getClass(), "jsType", null);
        setField(term363, term363.getClass(), "parent", null);
        setField(term349, term349.getClass(), "last", term363);
        setField(term349, term349.getClass(), "propListHead", null);
        setIntField(term349, term349.getClass(), "sourcePosition", 0);
        setField(term349, term349.getClass(), "jsType", null);
        setField(term349, term349.getClass(), "parent", null);
        setField(term347, term347.getClass(), "next", term349);
        setField(term347, term347.getClass(), "first", term356);
        setIntField(term367, term367.getClass(), "type", 0);
        setField(term367, term367.getClass(), "next", null);
        setField(term367, term367.getClass(), "first", null);
        setField(term367, term367.getClass(), "last", null);
        setField(term367, term367.getClass(), "propListHead", null);
        setIntField(term367, term367.getClass(), "sourcePosition", 0);
        setField(term367, term367.getClass(), "jsType", null);
        setField(term367, term367.getClass(), "parent", null);
        setField(term347, term347.getClass(), "last", term367);
        setField(term347, term347.getClass(), "propListHead", null);
        setIntField(term347, term347.getClass(), "sourcePosition", 0);
        setField(term347, term347.getClass(), "jsType", null);
        setField(term347, term347.getClass(), "parent", null);
        setField(term334, term334.getClass(), "nameNode", term347);
        setField(term334, term334.getClass(), "type", null);
        setField(term334, term334.getClass(), "info", null);
        setBooleanField(term334, term334.getClass(), "typeInferred", false);
        setField(term334, term334.getClass(), "input", null);
        setBooleanField(term334, term334.getClass(), "isDefine", false);
        setIntField(term334, term334.getClass(), "index", 0);
        setField(term334, term334.getClass(), "scope", null);
        setBooleanField(term334, term334.getClass(), "markedEscaped", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Object[] args = new Object[1];
        args[0] = term334;
        try {
            callMethod(klass, "isRemovableVar", argTypes, term277, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


