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

public class DOMNodePointer_testNode_769718949257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61973;
     Object term62169;
     Object term62189;
     Object term62191;

    public DOMNodePointer_testNode_769718949257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61973 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term62063 = newInstance(Class.forName("org.apache.html.dom.HTMLHeadingElementImpl"));
        setField(term61973, term61973.getClass(), "node", term62063);
        term62169 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTypeTest"));
        setIntField(term62169, term62169.getClass(), "nodeType", 3);
        term62189 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term62190 = newInstance(Class.forName("org.apache.html.dom.HTMLHeadingElementImpl"));
        setField(term62190, term62190.getClass(), "name", null);
        setField(term62190, term62190.getClass(), "attributes", null);
        setField(term62190, term62190.getClass(), "ownerDocument", null);
        setField(term62190, term62190.getClass(), "firstChild", null);
        setField(term62190, term62190.getClass(), "fNodeListCache", null);
        setField(term62190, term62190.getClass(), "previousSibling", null);
        setField(term62190, term62190.getClass(), "nextSibling", null);
        setField(term62190, term62190.getClass(), "ownerNode", null);
        setShortField(term62190, term62190.getClass(), "flags", (short) 0);
        setField(term62189, term62189.getClass(), "node", term62190);
        setField(term62189, term62189.getClass(), "namespaces", null);
        setField(term62189, term62189.getClass(), "defaultNamespace", null);
        setField(term62189, term62189.getClass(), "id", null);
        setField(term62189, term62189.getClass(), "localNamespaceResolver", null);
        setIntField(term62189, term62189.getClass(), "index", 0);
        setBooleanField(term62189, term62189.getClass(), "attribute", false);
        setField(term62189, term62189.getClass(), "rootNode", null);
        setField(term62189, term62189.getClass(), "namespaceResolver", null);
        setField(term62189, term62189.getClass(), "parent", null);
        setField(term62189, term62189.getClass(), "locale", null);
        term62191 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTypeTest"));
        setIntField(term62191, term62191.getClass(), "nodeType", 3);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTest");
        Object[] args = new Object[1];
        args[0] = term62169;
        callMethod(klass, "testNode", argTypes, term61973, args);
        assertTrue(recursiveEquals(term61973, term62189));
        assertTrue(recursiveEquals(term62169, term62191));
    }

};


