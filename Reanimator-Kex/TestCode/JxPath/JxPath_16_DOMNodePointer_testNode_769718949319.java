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

public class DOMNodePointer_testNode_769718949319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87696;
     Object term87892;
     Object term87914;
     Object term87916;

    public DOMNodePointer_testNode_769718949319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87696 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term87786 = newInstance(Class.forName("org.apache.html.dom.HTMLHeadingElementImpl"));
        setField(term87696, term87696.getClass(), "node", term87786);
        term87892 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTypeTest"));
        setIntField(term87892, term87892.getClass(), "nodeType", 4);
        term87914 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term87915 = newInstance(Class.forName("org.apache.html.dom.HTMLHeadingElementImpl"));
        setField(term87915, term87915.getClass(), "name", null);
        setField(term87915, term87915.getClass(), "attributes", null);
        setField(term87915, term87915.getClass(), "ownerDocument", null);
        setField(term87915, term87915.getClass(), "firstChild", null);
        setField(term87915, term87915.getClass(), "fNodeListCache", null);
        setField(term87915, term87915.getClass(), "previousSibling", null);
        setField(term87915, term87915.getClass(), "nextSibling", null);
        setField(term87915, term87915.getClass(), "ownerNode", null);
        setShortField(term87915, term87915.getClass(), "flags", (short) 0);
        setField(term87914, term87914.getClass(), "node", term87915);
        setField(term87914, term87914.getClass(), "namespaces", null);
        setField(term87914, term87914.getClass(), "defaultNamespace", null);
        setField(term87914, term87914.getClass(), "id", null);
        setField(term87914, term87914.getClass(), "localNamespaceResolver", null);
        setIntField(term87914, term87914.getClass(), "index", 0);
        setBooleanField(term87914, term87914.getClass(), "attribute", false);
        setField(term87914, term87914.getClass(), "rootNode", null);
        setField(term87914, term87914.getClass(), "namespaceResolver", null);
        setField(term87914, term87914.getClass(), "parent", null);
        setField(term87914, term87914.getClass(), "locale", null);
        term87916 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTypeTest"));
        setIntField(term87916, term87916.getClass(), "nodeType", 4);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTest");
        Object[] args = new Object[1];
        args[0] = term87892;
        callMethod(klass, "testNode", argTypes, term87696, args);
        assertTrue(recursiveEquals(term87696, term87914));
        assertTrue(recursiveEquals(term87892, term87916));
    }

};


