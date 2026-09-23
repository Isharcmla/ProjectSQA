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

public class AttributeContext_nextNode_14695836649 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90;
     Object term276;

    public AttributeContext_nextNode_14695836649() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term97 = new HashMap();
        HashMap term102 = new HashMap();
        term90 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        Object term92 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.RootContext"));
        Object term93 = newInstance(Class.forName("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        Object term94 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term95 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term90, term90.getClass(), "nodeTest", null);
        setBooleanField(term90, term90.getClass(), "setStarted", false);
        setField(term90, term90.getClass(), "iterator", null);
        setField(term90, term90.getClass(), "currentNodePointer", null);
        setField(term90, term90.getClass(), "parentContext", null);
        setField(term93, term93.getClass(), "rootPointer", null);
        setField(term93, term93.getClass(), "contextPointer", null);
        setField(term95, term95.getClass(), "parent", null);
        setField(term95, term95.getClass(), "namespaceMap", null);
        setField(term95, term95.getClass(), "reverseMap", null);
        setField(term95, term95.getClass(), "pointer", null);
        setBooleanField(term95, term95.getClass(), "sealed", false);
        setField(term94, term94.getClass(), "parent", term95);
        setField(term94, term94.getClass(), "namespaceMap", term97);
        setField(term94, term94.getClass(), "reverseMap", term102);
        setField(term94, term94.getClass(), "pointer", null);
        setBooleanField(term94, term94.getClass(), "sealed", false);
        setField(term93, term93.getClass(), "namespaceResolver", term94);
        setField(term93, term93.getClass(), "parentContext", null);
        setField(term93, term93.getClass(), "contextBean", null);
        setField(term93, term93.getClass(), "vars", null);
        setField(term93, term93.getClass(), "functions", null);
        setField(term93, term93.getClass(), "factory", null);
        setField(term93, term93.getClass(), "locale", null);
        setBooleanField(term93, term93.getClass(), "lenientSet", false);
        setBooleanField(term93, term93.getClass(), "lenient", false);
        setField(term93, term93.getClass(), "idManager", null);
        setField(term93, term93.getClass(), "keyManager", null);
        setField(term93, term93.getClass(), "decimalFormats", null);
        setField(term92, term92.getClass(), "jxpathContext", term93);
        setField(term92, term92.getClass(), "pointer", null);
        setField(term92, term92.getClass(), "registers", null);
        setIntField(term92, term92.getClass(), "availableRegister", 0);
        setField(term92, term92.getClass(), "parentContext", null);
        setField(term92, term92.getClass(), "rootContext", null);
        setIntField(term92, term92.getClass(), "position", 0);
        setBooleanField(term92, term92.getClass(), "startedSetIteration", false);
        setBooleanField(term92, term92.getClass(), "done", false);
        setBooleanField(term92, term92.getClass(), "hasPerformedIteratorStep", false);
        setField(term92, term92.getClass(), "pointerIterator", null);
        setField(term90, term90.getClass(), "rootContext", term92);
        setIntField(term90, term90.getClass(), "position", -616727354);
        setBooleanField(term90, term90.getClass(), "startedSetIteration", true);
        setBooleanField(term90, term90.getClass(), "done", false);
        setBooleanField(term90, term90.getClass(), "hasPerformedIteratorStep", false);
        setField(term90, term90.getClass(), "pointerIterator", null);
        HashMap term281 = new HashMap();
        HashMap term282 = new HashMap();
        term276 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        Object term277 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.RootContext"));
        Object term278 = newInstance(Class.forName("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        Object term279 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term280 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term276, term276.getClass(), "nodeTest", null);
        setBooleanField(term276, term276.getClass(), "setStarted", true);
        setField(term276, term276.getClass(), "iterator", null);
        setField(term276, term276.getClass(), "currentNodePointer", null);
        setField(term276, term276.getClass(), "parentContext", null);
        setField(term278, term278.getClass(), "rootPointer", null);
        setField(term278, term278.getClass(), "contextPointer", null);
        setField(term280, term280.getClass(), "parent", null);
        setField(term280, term280.getClass(), "namespaceMap", null);
        setField(term280, term280.getClass(), "reverseMap", null);
        setField(term280, term280.getClass(), "pointer", null);
        setBooleanField(term280, term280.getClass(), "sealed", false);
        setField(term279, term279.getClass(), "parent", term280);
        setField(term279, term279.getClass(), "namespaceMap", term281);
        setField(term279, term279.getClass(), "reverseMap", term282);
        setField(term279, term279.getClass(), "pointer", null);
        setBooleanField(term279, term279.getClass(), "sealed", false);
        setField(term278, term278.getClass(), "namespaceResolver", term279);
        setField(term278, term278.getClass(), "parentContext", null);
        setField(term278, term278.getClass(), "contextBean", null);
        setField(term278, term278.getClass(), "vars", null);
        setField(term278, term278.getClass(), "functions", null);
        setField(term278, term278.getClass(), "factory", null);
        setField(term278, term278.getClass(), "locale", null);
        setBooleanField(term278, term278.getClass(), "lenientSet", false);
        setBooleanField(term278, term278.getClass(), "lenient", false);
        setField(term278, term278.getClass(), "idManager", null);
        setField(term278, term278.getClass(), "keyManager", null);
        setField(term278, term278.getClass(), "decimalFormats", null);
        setField(term277, term277.getClass(), "jxpathContext", term278);
        setField(term277, term277.getClass(), "pointer", null);
        setField(term277, term277.getClass(), "registers", null);
        setIntField(term277, term277.getClass(), "availableRegister", 0);
        setField(term277, term277.getClass(), "parentContext", null);
        setField(term277, term277.getClass(), "rootContext", null);
        setIntField(term277, term277.getClass(), "position", 0);
        setBooleanField(term277, term277.getClass(), "startedSetIteration", false);
        setBooleanField(term277, term277.getClass(), "done", false);
        setBooleanField(term277, term277.getClass(), "hasPerformedIteratorStep", false);
        setField(term277, term277.getClass(), "pointerIterator", null);
        setField(term276, term276.getClass(), "rootContext", term277);
        setIntField(term276, term276.getClass(), "position", -616727353);
        setBooleanField(term276, term276.getClass(), "startedSetIteration", true);
        setBooleanField(term276, term276.getClass(), "done", false);
        setBooleanField(term276, term276.getClass(), "hasPerformedIteratorStep", false);
        setField(term276, term276.getClass(), "pointerIterator", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.AttributeContext");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "nextNode", argTypes, term90, args);
        assertTrue(recursiveEquals(term90, term276));
        assertTrue(recursiveEquals(retValue, false));
    }

};


