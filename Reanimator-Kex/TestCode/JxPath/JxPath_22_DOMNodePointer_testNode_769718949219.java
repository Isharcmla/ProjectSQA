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
import static org.apache.commons.jxpath.ri.model.dom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.jxpath.ri.model.dom.EqualityUtils.*;
import java.lang.Object;

public class DOMNodePointer_testNode_769718949219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51315;
     Object term51495;
     Object term51514;
     Object term51516;

    public DOMNodePointer_testNode_769718949219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51315 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term51389 = newInstance(Class.forName("org.apache.wml.dom.WMLIElementImpl"));
        setField(term51315, term51315.getClass(), "node", term51389);
        term51495 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTypeTest"));
        term51514 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term51515 = newInstance(Class.forName("org.apache.wml.dom.WMLIElementImpl"));
        setField(term51515, term51515.getClass(), "name", null);
        setField(term51515, term51515.getClass(), "attributes", null);
        setField(term51515, term51515.getClass(), "ownerDocument", null);
        setField(term51515, term51515.getClass(), "firstChild", null);
        setField(term51515, term51515.getClass(), "fNodeListCache", null);
        setField(term51515, term51515.getClass(), "previousSibling", null);
        setField(term51515, term51515.getClass(), "nextSibling", null);
        setField(term51515, term51515.getClass(), "ownerNode", null);
        setShortField(term51515, term51515.getClass(), "flags", (short) 0);
        setField(term51514, term51514.getClass(), "node", term51515);
        setField(term51514, term51514.getClass(), "namespaces", null);
        setField(term51514, term51514.getClass(), "defaultNamespace", null);
        setField(term51514, term51514.getClass(), "id", null);
        setField(term51514, term51514.getClass(), "localNamespaceResolver", null);
        setIntField(term51514, term51514.getClass(), "index", 0);
        setBooleanField(term51514, term51514.getClass(), "attribute", false);
        setField(term51514, term51514.getClass(), "namespaceResolver", null);
        setField(term51514, term51514.getClass(), "exceptionHandler", null);
        setField(term51514, term51514.getClass(), "rootNode", null);
        setField(term51514, term51514.getClass(), "parent", null);
        setField(term51514, term51514.getClass(), "locale", null);
        term51516 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTypeTest"));
        setIntField(term51516, term51516.getClass(), "nodeType", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTest");
        Object[] args = new Object[1];
        args[0] = term51495;
        callMethod(klass, "testNode", argTypes, term51315, args);
        assertTrue(recursiveEquals(term51315, term51514));
        assertTrue(recursiveEquals(term51495, term51516));
    }

};


