package org.apache.commons.jxpath.ri.model.dom;

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
import static org.apache.commons.jxpath.ri.model.dom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;

public class DOMNodePointer_attributeIterator_73551815854 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term497;
     Object term575;

    public DOMNodePointer_attributeIterator_73551815854() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term498 = new HashMap();
        HashMap term532 = new HashMap();
        HashMap term537 = new HashMap();
        HashMap term543 = new HashMap();
        HashMap term548 = new HashMap();
        HashMap term554 = new HashMap();
        HashMap term559 = new HashMap();
        HashMap term569 = new HashMap();
        term497 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term527 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term528 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term529 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term530 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term567 = newInstance(Class.forName("java.lang.Object"));
        Object term568 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term497, term497.getClass(), "node", null);
        setField(term497, term497.getClass(), "namespaces", term498);
        setField(term497, term497.getClass(), "defaultNamespace", "uuaPigETmJ");
        setField(term497, term497.getClass(), "id", "MxlszYVzRf");
        setField(term530, term530.getClass(), "parent", null);
        setField(term530, term530.getClass(), "namespaceMap", null);
        setField(term530, term530.getClass(), "reverseMap", null);
        setField(term530, term530.getClass(), "pointer", null);
        setBooleanField(term530, term530.getClass(), "sealed", false);
        setField(term529, term529.getClass(), "parent", term530);
        setField(term529, term529.getClass(), "namespaceMap", term532);
        setField(term529, term529.getClass(), "reverseMap", term537);
        setField(term529, term529.getClass(), "pointer", null);
        setBooleanField(term529, term529.getClass(), "sealed", false);
        setField(term528, term528.getClass(), "parent", term529);
        setField(term528, term528.getClass(), "namespaceMap", term543);
        setField(term528, term528.getClass(), "reverseMap", term548);
        setField(term528, term528.getClass(), "pointer", null);
        setBooleanField(term528, term528.getClass(), "sealed", false);
        setField(term527, term527.getClass(), "parent", term528);
        setField(term527, term527.getClass(), "namespaceMap", term554);
        setField(term527, term527.getClass(), "reverseMap", term559);
        setField(term527, term527.getClass(), "pointer", null);
        setBooleanField(term527, term527.getClass(), "sealed", false);
        setField(term497, term497.getClass(), "localNamespaceResolver", term527);
        setIntField(term497, term497.getClass(), "index", -1922583790);
        setBooleanField(term497, term497.getClass(), "attribute", true);
        setField(term497, term497.getClass(), "rootNode", term567);
        setField(term568, term568.getClass(), "parent", null);
        setField(term568, term568.getClass(), "namespaceMap", term569);
        setField(term568, term568.getClass(), "reverseMap", null);
        setField(term568, term568.getClass(), "pointer", null);
        setBooleanField(term568, term568.getClass(), "sealed", false);
        setField(term497, term497.getClass(), "namespaceResolver", term568);
        setField(term497, term497.getClass(), "parent", null);
        setField(term497, term497.getClass(), "locale", null);
        term575 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term575, term575.getClass(), "prefix", "LQFpaHEwXR");
        setField(term575, term575.getClass(), "name", "oVcInYnLWB");
        setField(term575, term575.getClass(), "qualifiedName", "aJlieCFVtF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[1];
        args[0] = term575;
        try {
            callMethod(klass, "attributeIterator", argTypes, term497, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


