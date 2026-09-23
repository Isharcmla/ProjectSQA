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

public class AttributeContext_reset_10433238067 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30;
     Object term191;

    public AttributeContext_reset_10433238067() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term37 = new HashMap();
        HashMap term42 = new HashMap();
        term30 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        Object term32 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.RootContext"));
        Object term33 = newInstance(Class.forName("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        Object term34 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term35 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term30, term30.getClass(), "nodeTest", null);
        setBooleanField(term30, term30.getClass(), "setStarted", true);
        setField(term30, term30.getClass(), "iterator", null);
        setField(term30, term30.getClass(), "currentNodePointer", null);
        setField(term30, term30.getClass(), "parentContext", null);
        setField(term33, term33.getClass(), "rootPointer", null);
        setField(term33, term33.getClass(), "contextPointer", null);
        setField(term35, term35.getClass(), "parent", null);
        setField(term35, term35.getClass(), "namespaceMap", null);
        setField(term35, term35.getClass(), "reverseMap", null);
        setField(term35, term35.getClass(), "pointer", null);
        setBooleanField(term35, term35.getClass(), "sealed", false);
        setField(term34, term34.getClass(), "parent", term35);
        setField(term34, term34.getClass(), "namespaceMap", term37);
        setField(term34, term34.getClass(), "reverseMap", term42);
        setField(term34, term34.getClass(), "pointer", null);
        setBooleanField(term34, term34.getClass(), "sealed", false);
        setField(term33, term33.getClass(), "namespaceResolver", term34);
        setField(term33, term33.getClass(), "parentContext", null);
        setField(term33, term33.getClass(), "contextBean", null);
        setField(term33, term33.getClass(), "vars", null);
        setField(term33, term33.getClass(), "functions", null);
        setField(term33, term33.getClass(), "factory", null);
        setField(term33, term33.getClass(), "locale", null);
        setBooleanField(term33, term33.getClass(), "lenientSet", false);
        setBooleanField(term33, term33.getClass(), "lenient", false);
        setField(term33, term33.getClass(), "idManager", null);
        setField(term33, term33.getClass(), "keyManager", null);
        setField(term33, term33.getClass(), "decimalFormats", null);
        setField(term32, term32.getClass(), "jxpathContext", term33);
        setField(term32, term32.getClass(), "pointer", null);
        setField(term32, term32.getClass(), "registers", null);
        setIntField(term32, term32.getClass(), "availableRegister", 0);
        setField(term32, term32.getClass(), "parentContext", null);
        setField(term32, term32.getClass(), "rootContext", null);
        setIntField(term32, term32.getClass(), "position", 0);
        setBooleanField(term32, term32.getClass(), "startedSetIteration", false);
        setBooleanField(term32, term32.getClass(), "done", false);
        setBooleanField(term32, term32.getClass(), "hasPerformedIteratorStep", false);
        setField(term32, term32.getClass(), "pointerIterator", null);
        setField(term30, term30.getClass(), "rootContext", term32);
        setIntField(term30, term30.getClass(), "position", 1484323161);
        setBooleanField(term30, term30.getClass(), "startedSetIteration", true);
        setBooleanField(term30, term30.getClass(), "done", true);
        setBooleanField(term30, term30.getClass(), "hasPerformedIteratorStep", true);
        setField(term30, term30.getClass(), "pointerIterator", null);
        HashMap term196 = new HashMap();
        HashMap term197 = new HashMap();
        term191 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        Object term192 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.RootContext"));
        Object term193 = newInstance(Class.forName("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        Object term194 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term195 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term191, term191.getClass(), "nodeTest", null);
        setBooleanField(term191, term191.getClass(), "setStarted", false);
        setField(term191, term191.getClass(), "iterator", null);
        setField(term191, term191.getClass(), "currentNodePointer", null);
        setField(term191, term191.getClass(), "parentContext", null);
        setField(term193, term193.getClass(), "rootPointer", null);
        setField(term193, term193.getClass(), "contextPointer", null);
        setField(term195, term195.getClass(), "parent", null);
        setField(term195, term195.getClass(), "namespaceMap", null);
        setField(term195, term195.getClass(), "reverseMap", null);
        setField(term195, term195.getClass(), "pointer", null);
        setBooleanField(term195, term195.getClass(), "sealed", false);
        setField(term194, term194.getClass(), "parent", term195);
        setField(term194, term194.getClass(), "namespaceMap", term196);
        setField(term194, term194.getClass(), "reverseMap", term197);
        setField(term194, term194.getClass(), "pointer", null);
        setBooleanField(term194, term194.getClass(), "sealed", false);
        setField(term193, term193.getClass(), "namespaceResolver", term194);
        setField(term193, term193.getClass(), "parentContext", null);
        setField(term193, term193.getClass(), "contextBean", null);
        setField(term193, term193.getClass(), "vars", null);
        setField(term193, term193.getClass(), "functions", null);
        setField(term193, term193.getClass(), "factory", null);
        setField(term193, term193.getClass(), "locale", null);
        setBooleanField(term193, term193.getClass(), "lenientSet", false);
        setBooleanField(term193, term193.getClass(), "lenient", false);
        setField(term193, term193.getClass(), "idManager", null);
        setField(term193, term193.getClass(), "keyManager", null);
        setField(term193, term193.getClass(), "decimalFormats", null);
        setField(term192, term192.getClass(), "jxpathContext", term193);
        setField(term192, term192.getClass(), "pointer", null);
        setField(term192, term192.getClass(), "registers", null);
        setIntField(term192, term192.getClass(), "availableRegister", 0);
        setField(term192, term192.getClass(), "parentContext", null);
        setField(term192, term192.getClass(), "rootContext", null);
        setIntField(term192, term192.getClass(), "position", 0);
        setBooleanField(term192, term192.getClass(), "startedSetIteration", false);
        setBooleanField(term192, term192.getClass(), "done", false);
        setBooleanField(term192, term192.getClass(), "hasPerformedIteratorStep", false);
        setField(term192, term192.getClass(), "pointerIterator", null);
        setField(term191, term191.getClass(), "rootContext", term192);
        setIntField(term191, term191.getClass(), "position", 0);
        setBooleanField(term191, term191.getClass(), "startedSetIteration", true);
        setBooleanField(term191, term191.getClass(), "done", true);
        setBooleanField(term191, term191.getClass(), "hasPerformedIteratorStep", true);
        setField(term191, term191.getClass(), "pointerIterator", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.AttributeContext");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "reset", argTypes, term30, args);
        assertTrue(recursiveEquals(term30, term191));
    }

};


