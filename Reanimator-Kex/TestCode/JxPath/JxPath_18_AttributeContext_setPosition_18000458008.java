package org.apache.commons.jxpath.ri.axes;

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
import static org.apache.commons.jxpath.ri.axes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.jxpath.ri.axes.EqualityUtils.*;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Integer;

public class AttributeContext_setPosition_18000458008 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59;
     Object term88;
     Object term233;

    public AttributeContext_setPosition_18000458008() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term66 = new HashMap();
        HashMap term71 = new HashMap();
        term59 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        Object term61 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.RootContext"));
        Object term62 = newInstance(Class.forName("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        Object term63 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term64 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term59, term59.getClass(), "nodeTest", null);
        setBooleanField(term59, term59.getClass(), "setStarted", false);
        setField(term59, term59.getClass(), "iterator", null);
        setField(term59, term59.getClass(), "currentNodePointer", null);
        setField(term59, term59.getClass(), "parentContext", null);
        setField(term62, term62.getClass(), "rootPointer", null);
        setField(term62, term62.getClass(), "contextPointer", null);
        setField(term64, term64.getClass(), "parent", null);
        setField(term64, term64.getClass(), "namespaceMap", null);
        setField(term64, term64.getClass(), "reverseMap", null);
        setField(term64, term64.getClass(), "pointer", null);
        setBooleanField(term64, term64.getClass(), "sealed", false);
        setField(term63, term63.getClass(), "parent", term64);
        setField(term63, term63.getClass(), "namespaceMap", term66);
        setField(term63, term63.getClass(), "reverseMap", term71);
        setField(term63, term63.getClass(), "pointer", null);
        setBooleanField(term63, term63.getClass(), "sealed", false);
        setField(term62, term62.getClass(), "namespaceResolver", term63);
        setField(term62, term62.getClass(), "parentContext", null);
        setField(term62, term62.getClass(), "contextBean", null);
        setField(term62, term62.getClass(), "vars", null);
        setField(term62, term62.getClass(), "functions", null);
        setField(term62, term62.getClass(), "factory", null);
        setField(term62, term62.getClass(), "locale", null);
        setBooleanField(term62, term62.getClass(), "lenientSet", false);
        setBooleanField(term62, term62.getClass(), "lenient", false);
        setField(term62, term62.getClass(), "idManager", null);
        setField(term62, term62.getClass(), "keyManager", null);
        setField(term62, term62.getClass(), "decimalFormats", null);
        setField(term61, term61.getClass(), "jxpathContext", term62);
        setField(term61, term61.getClass(), "pointer", null);
        setField(term61, term61.getClass(), "registers", null);
        setIntField(term61, term61.getClass(), "availableRegister", 0);
        setField(term61, term61.getClass(), "parentContext", null);
        setField(term61, term61.getClass(), "rootContext", null);
        setIntField(term61, term61.getClass(), "position", 0);
        setBooleanField(term61, term61.getClass(), "startedSetIteration", false);
        setBooleanField(term61, term61.getClass(), "done", false);
        setBooleanField(term61, term61.getClass(), "hasPerformedIteratorStep", false);
        setField(term61, term61.getClass(), "pointerIterator", null);
        setField(term59, term59.getClass(), "rootContext", term61);
        setIntField(term59, term59.getClass(), "position", 391863371);
        setBooleanField(term59, term59.getClass(), "startedSetIteration", true);
        setBooleanField(term59, term59.getClass(), "done", false);
        setBooleanField(term59, term59.getClass(), "hasPerformedIteratorStep", true);
        setField(term59, term59.getClass(), "pointerIterator", null);
        term88 = new Integer(-1922583790);
        HashMap term238 = new HashMap();
        HashMap term239 = new HashMap();
        term233 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        Object term234 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.RootContext"));
        Object term235 = newInstance(Class.forName("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        Object term236 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term237 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term233, term233.getClass(), "nodeTest", null);
        setBooleanField(term233, term233.getClass(), "setStarted", false);
        setField(term233, term233.getClass(), "iterator", null);
        setField(term233, term233.getClass(), "currentNodePointer", null);
        setField(term233, term233.getClass(), "parentContext", null);
        setField(term235, term235.getClass(), "rootPointer", null);
        setField(term235, term235.getClass(), "contextPointer", null);
        setField(term237, term237.getClass(), "parent", null);
        setField(term237, term237.getClass(), "namespaceMap", null);
        setField(term237, term237.getClass(), "reverseMap", null);
        setField(term237, term237.getClass(), "pointer", null);
        setBooleanField(term237, term237.getClass(), "sealed", false);
        setField(term236, term236.getClass(), "parent", term237);
        setField(term236, term236.getClass(), "namespaceMap", term238);
        setField(term236, term236.getClass(), "reverseMap", term239);
        setField(term236, term236.getClass(), "pointer", null);
        setBooleanField(term236, term236.getClass(), "sealed", false);
        setField(term235, term235.getClass(), "namespaceResolver", term236);
        setField(term235, term235.getClass(), "parentContext", null);
        setField(term235, term235.getClass(), "contextBean", null);
        setField(term235, term235.getClass(), "vars", null);
        setField(term235, term235.getClass(), "functions", null);
        setField(term235, term235.getClass(), "factory", null);
        setField(term235, term235.getClass(), "locale", null);
        setBooleanField(term235, term235.getClass(), "lenientSet", false);
        setBooleanField(term235, term235.getClass(), "lenient", false);
        setField(term235, term235.getClass(), "idManager", null);
        setField(term235, term235.getClass(), "keyManager", null);
        setField(term235, term235.getClass(), "decimalFormats", null);
        setField(term234, term234.getClass(), "jxpathContext", term235);
        setField(term234, term234.getClass(), "pointer", null);
        setField(term234, term234.getClass(), "registers", null);
        setIntField(term234, term234.getClass(), "availableRegister", 0);
        setField(term234, term234.getClass(), "parentContext", null);
        setField(term234, term234.getClass(), "rootContext", null);
        setIntField(term234, term234.getClass(), "position", 0);
        setBooleanField(term234, term234.getClass(), "startedSetIteration", false);
        setBooleanField(term234, term234.getClass(), "done", false);
        setBooleanField(term234, term234.getClass(), "hasPerformedIteratorStep", false);
        setField(term234, term234.getClass(), "pointerIterator", null);
        setField(term233, term233.getClass(), "rootContext", term234);
        setIntField(term233, term233.getClass(), "position", 0);
        setBooleanField(term233, term233.getClass(), "startedSetIteration", true);
        setBooleanField(term233, term233.getClass(), "done", false);
        setBooleanField(term233, term233.getClass(), "hasPerformedIteratorStep", true);
        setField(term233, term233.getClass(), "pointerIterator", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.AttributeContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term88;
        Object retValue = callMethod(klass, "setPosition", argTypes, term59, args);
        assertTrue(recursiveEquals(term59, term233));
        assertTrue(recursiveEquals(term88, -1922583790));
        assertTrue(recursiveEquals(retValue, true));
    }

};


