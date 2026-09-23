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

public class JDOMNodePointer_testNode_1309895617241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51556;
     Object term51778;
     Object term51838;
     Object term51840;

    public JDOMNodePointer_testNode_1309895617241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51556 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term51672 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        setField(term51556, term51556.getClass(), "node", term51672);
        term51778 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTypeTest"));
        term51838 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term51839 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        setField(term51839, term51839.getClass(), "node", null);
        setField(term51839, term51839.getClass(), "id", null);
        setField(term51839, term51839.getClass(), "localNamespaceResolver", null);
        setIntField(term51839, term51839.getClass(), "index", 0);
        setBooleanField(term51839, term51839.getClass(), "attribute", false);
        setField(term51839, term51839.getClass(), "rootNode", null);
        setField(term51839, term51839.getClass(), "namespaceResolver", null);
        setField(term51839, term51839.getClass(), "parent", null);
        setField(term51839, term51839.getClass(), "locale", null);
        setField(term51838, term51838.getClass(), "node", term51839);
        setField(term51838, term51838.getClass(), "id", null);
        setField(term51838, term51838.getClass(), "localNamespaceResolver", null);
        setIntField(term51838, term51838.getClass(), "index", 0);
        setBooleanField(term51838, term51838.getClass(), "attribute", false);
        setField(term51838, term51838.getClass(), "rootNode", null);
        setField(term51838, term51838.getClass(), "namespaceResolver", null);
        setField(term51838, term51838.getClass(), "parent", null);
        setField(term51838, term51838.getClass(), "locale", null);
        term51840 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTypeTest"));
        setIntField(term51840, term51840.getClass(), "nodeType", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTest");
        Object[] args = new Object[1];
        args[0] = term51778;
        callMethod(klass, "testNode", argTypes, term51556, args);
        assertTrue(recursiveEquals(term51556, term51838));
        assertTrue(recursiveEquals(term51778, term51840));
    }

};


