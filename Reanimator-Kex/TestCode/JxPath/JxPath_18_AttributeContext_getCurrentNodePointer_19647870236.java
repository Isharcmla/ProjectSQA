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

public class AttributeContext_getCurrentNodePointer_19647870236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term155;

    public AttributeContext_getCurrentNodePointer_19647870236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term8 = new HashMap();
        HashMap term13 = new HashMap();
        term1 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        Object term3 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.RootContext"));
        Object term4 = newInstance(Class.forName("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        Object term5 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1, term1.getClass(), "nodeTest", null);
        setBooleanField(term1, term1.getClass(), "setStarted", false);
        setField(term1, term1.getClass(), "iterator", null);
        setField(term1, term1.getClass(), "currentNodePointer", null);
        setField(term1, term1.getClass(), "parentContext", null);
        setField(term4, term4.getClass(), "rootPointer", null);
        setField(term4, term4.getClass(), "contextPointer", null);
        setField(term6, term6.getClass(), "parent", null);
        setField(term6, term6.getClass(), "namespaceMap", null);
        setField(term6, term6.getClass(), "reverseMap", null);
        setField(term6, term6.getClass(), "pointer", null);
        setBooleanField(term6, term6.getClass(), "sealed", false);
        setField(term5, term5.getClass(), "parent", term6);
        setField(term5, term5.getClass(), "namespaceMap", term8);
        setField(term5, term5.getClass(), "reverseMap", term13);
        setField(term5, term5.getClass(), "pointer", null);
        setBooleanField(term5, term5.getClass(), "sealed", false);
        setField(term4, term4.getClass(), "namespaceResolver", term5);
        setField(term4, term4.getClass(), "parentContext", null);
        setField(term4, term4.getClass(), "contextBean", null);
        setField(term4, term4.getClass(), "vars", null);
        setField(term4, term4.getClass(), "functions", null);
        setField(term4, term4.getClass(), "factory", null);
        setField(term4, term4.getClass(), "locale", null);
        setBooleanField(term4, term4.getClass(), "lenientSet", false);
        setBooleanField(term4, term4.getClass(), "lenient", false);
        setField(term4, term4.getClass(), "idManager", null);
        setField(term4, term4.getClass(), "keyManager", null);
        setField(term4, term4.getClass(), "decimalFormats", null);
        setField(term3, term3.getClass(), "jxpathContext", term4);
        setField(term3, term3.getClass(), "pointer", null);
        setField(term3, term3.getClass(), "registers", null);
        setIntField(term3, term3.getClass(), "availableRegister", 0);
        setField(term3, term3.getClass(), "parentContext", null);
        setField(term3, term3.getClass(), "rootContext", null);
        setIntField(term3, term3.getClass(), "position", 0);
        setBooleanField(term3, term3.getClass(), "startedSetIteration", false);
        setBooleanField(term3, term3.getClass(), "done", false);
        setBooleanField(term3, term3.getClass(), "hasPerformedIteratorStep", false);
        setField(term3, term3.getClass(), "pointerIterator", null);
        setField(term1, term1.getClass(), "rootContext", term3);
        setIntField(term1, term1.getClass(), "position", 1162663216);
        setBooleanField(term1, term1.getClass(), "startedSetIteration", false);
        setBooleanField(term1, term1.getClass(), "done", false);
        setBooleanField(term1, term1.getClass(), "hasPerformedIteratorStep", false);
        setField(term1, term1.getClass(), "pointerIterator", null);
        HashMap term160 = new HashMap();
        HashMap term161 = new HashMap();
        term155 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        Object term156 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.RootContext"));
        Object term157 = newInstance(Class.forName("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        Object term158 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term159 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term155, term155.getClass(), "nodeTest", null);
        setBooleanField(term155, term155.getClass(), "setStarted", false);
        setField(term155, term155.getClass(), "iterator", null);
        setField(term155, term155.getClass(), "currentNodePointer", null);
        setField(term155, term155.getClass(), "parentContext", null);
        setField(term157, term157.getClass(), "rootPointer", null);
        setField(term157, term157.getClass(), "contextPointer", null);
        setField(term159, term159.getClass(), "parent", null);
        setField(term159, term159.getClass(), "namespaceMap", null);
        setField(term159, term159.getClass(), "reverseMap", null);
        setField(term159, term159.getClass(), "pointer", null);
        setBooleanField(term159, term159.getClass(), "sealed", false);
        setField(term158, term158.getClass(), "parent", term159);
        setField(term158, term158.getClass(), "namespaceMap", term160);
        setField(term158, term158.getClass(), "reverseMap", term161);
        setField(term158, term158.getClass(), "pointer", null);
        setBooleanField(term158, term158.getClass(), "sealed", false);
        setField(term157, term157.getClass(), "namespaceResolver", term158);
        setField(term157, term157.getClass(), "parentContext", null);
        setField(term157, term157.getClass(), "contextBean", null);
        setField(term157, term157.getClass(), "vars", null);
        setField(term157, term157.getClass(), "functions", null);
        setField(term157, term157.getClass(), "factory", null);
        setField(term157, term157.getClass(), "locale", null);
        setBooleanField(term157, term157.getClass(), "lenientSet", false);
        setBooleanField(term157, term157.getClass(), "lenient", false);
        setField(term157, term157.getClass(), "idManager", null);
        setField(term157, term157.getClass(), "keyManager", null);
        setField(term157, term157.getClass(), "decimalFormats", null);
        setField(term156, term156.getClass(), "jxpathContext", term157);
        setField(term156, term156.getClass(), "pointer", null);
        setField(term156, term156.getClass(), "registers", null);
        setIntField(term156, term156.getClass(), "availableRegister", 0);
        setField(term156, term156.getClass(), "parentContext", null);
        setField(term156, term156.getClass(), "rootContext", null);
        setIntField(term156, term156.getClass(), "position", 0);
        setBooleanField(term156, term156.getClass(), "startedSetIteration", false);
        setBooleanField(term156, term156.getClass(), "done", false);
        setBooleanField(term156, term156.getClass(), "hasPerformedIteratorStep", false);
        setField(term156, term156.getClass(), "pointerIterator", null);
        setField(term155, term155.getClass(), "rootContext", term156);
        setIntField(term155, term155.getClass(), "position", 1162663216);
        setBooleanField(term155, term155.getClass(), "startedSetIteration", false);
        setBooleanField(term155, term155.getClass(), "done", false);
        setBooleanField(term155, term155.getClass(), "hasPerformedIteratorStep", false);
        setField(term155, term155.getClass(), "pointerIterator", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.AttributeContext");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getCurrentNodePointer", argTypes, term1, args);
        assertTrue(recursiveEquals(term1, term155));
        assertTrue(recursiveEquals(retValue, null));
    }

};


