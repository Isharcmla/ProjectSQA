package org.apache.commons.jxpath.ri.model.jdom;

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
import static org.apache.commons.jxpath.ri.model.jdom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.jxpath.ri.model.jdom.EqualityUtils.*;
import java.lang.Object;

public class JDOMNodePointer_testNode_1309895617240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51199;
     Object term51421;
     Object term51816;
     Object term51818;

    public JDOMNodePointer_testNode_1309895617240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51199 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term51315 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        setField(term51199, term51199.getClass(), "node", term51315);
        term51421 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.NodeNameTest"));
        term51816 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term51817 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        setField(term51817, term51817.getClass(), "node", null);
        setField(term51817, term51817.getClass(), "id", null);
        setField(term51817, term51817.getClass(), "localNamespaceResolver", null);
        setIntField(term51817, term51817.getClass(), "index", 0);
        setBooleanField(term51817, term51817.getClass(), "attribute", false);
        setField(term51817, term51817.getClass(), "rootNode", null);
        setField(term51817, term51817.getClass(), "namespaceResolver", null);
        setField(term51817, term51817.getClass(), "parent", null);
        setField(term51817, term51817.getClass(), "locale", null);
        setField(term51816, term51816.getClass(), "node", term51817);
        setField(term51816, term51816.getClass(), "id", null);
        setField(term51816, term51816.getClass(), "localNamespaceResolver", null);
        setIntField(term51816, term51816.getClass(), "index", 0);
        setBooleanField(term51816, term51816.getClass(), "attribute", false);
        setField(term51816, term51816.getClass(), "rootNode", null);
        setField(term51816, term51816.getClass(), "namespaceResolver", null);
        setField(term51816, term51816.getClass(), "parent", null);
        setField(term51816, term51816.getClass(), "locale", null);
        term51818 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.NodeNameTest"));
        setField(term51818, term51818.getClass(), "qname", null);
        setField(term51818, term51818.getClass(), "namespaceURI", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTest");
        Object[] args = new Object[1];
        args[0] = term51421;
        callMethod(klass, "testNode", argTypes, term51199, args);
        assertTrue(recursiveEquals(term51199, term51816));
        assertTrue(recursiveEquals(term51421, term51818));
    }

};


