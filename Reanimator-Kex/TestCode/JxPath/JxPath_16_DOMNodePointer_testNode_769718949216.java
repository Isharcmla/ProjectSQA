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

public class DOMNodePointer_testNode_769718949216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44434;
     Object term44630;
     Object term47266;
     Object term47268;

    public DOMNodePointer_testNode_769718949216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44434 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term44524 = newInstance(Class.forName("org.apache.html.dom.HTMLHeadingElementImpl"));
        setField(term44434, term44434.getClass(), "node", term44524);
        term44630 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTypeTest"));
        term47266 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term47267 = newInstance(Class.forName("org.apache.html.dom.HTMLHeadingElementImpl"));
        setField(term47267, term47267.getClass(), "name", null);
        setField(term47267, term47267.getClass(), "attributes", null);
        setField(term47267, term47267.getClass(), "ownerDocument", null);
        setField(term47267, term47267.getClass(), "firstChild", null);
        setField(term47267, term47267.getClass(), "fNodeListCache", null);
        setField(term47267, term47267.getClass(), "previousSibling", null);
        setField(term47267, term47267.getClass(), "nextSibling", null);
        setField(term47267, term47267.getClass(), "ownerNode", null);
        setShortField(term47267, term47267.getClass(), "flags", (short) 0);
        setField(term47266, term47266.getClass(), "node", term47267);
        setField(term47266, term47266.getClass(), "namespaces", null);
        setField(term47266, term47266.getClass(), "defaultNamespace", null);
        setField(term47266, term47266.getClass(), "id", null);
        setField(term47266, term47266.getClass(), "localNamespaceResolver", null);
        setIntField(term47266, term47266.getClass(), "index", 0);
        setBooleanField(term47266, term47266.getClass(), "attribute", false);
        setField(term47266, term47266.getClass(), "rootNode", null);
        setField(term47266, term47266.getClass(), "namespaceResolver", null);
        setField(term47266, term47266.getClass(), "parent", null);
        setField(term47266, term47266.getClass(), "locale", null);
        term47268 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTypeTest"));
        setIntField(term47268, term47268.getClass(), "nodeType", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTest");
        Object[] args = new Object[1];
        args[0] = term44630;
        callMethod(klass, "testNode", argTypes, term44434, args);
        assertTrue(recursiveEquals(term44434, term47266));
        assertTrue(recursiveEquals(term44630, term47268));
    }

};


