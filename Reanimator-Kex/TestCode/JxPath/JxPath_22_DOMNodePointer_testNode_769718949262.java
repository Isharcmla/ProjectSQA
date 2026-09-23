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

public class DOMNodePointer_testNode_769718949262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64010;
     Object term64190;
     Object term64527;
     Object term64529;

    public DOMNodePointer_testNode_769718949262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64010 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term64084 = newInstance(Class.forName("org.apache.wml.dom.WMLIElementImpl"));
        setField(term64010, term64010.getClass(), "node", term64084);
        term64190 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTypeTest"));
        setIntField(term64190, term64190.getClass(), "nodeType", 4);
        term64527 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term64528 = newInstance(Class.forName("org.apache.wml.dom.WMLIElementImpl"));
        setField(term64528, term64528.getClass(), "name", null);
        setField(term64528, term64528.getClass(), "attributes", null);
        setField(term64528, term64528.getClass(), "ownerDocument", null);
        setField(term64528, term64528.getClass(), "firstChild", null);
        setField(term64528, term64528.getClass(), "fNodeListCache", null);
        setField(term64528, term64528.getClass(), "previousSibling", null);
        setField(term64528, term64528.getClass(), "nextSibling", null);
        setField(term64528, term64528.getClass(), "ownerNode", null);
        setShortField(term64528, term64528.getClass(), "flags", (short) 0);
        setField(term64527, term64527.getClass(), "node", term64528);
        setField(term64527, term64527.getClass(), "namespaces", null);
        setField(term64527, term64527.getClass(), "defaultNamespace", null);
        setField(term64527, term64527.getClass(), "id", null);
        setField(term64527, term64527.getClass(), "localNamespaceResolver", null);
        setIntField(term64527, term64527.getClass(), "index", 0);
        setBooleanField(term64527, term64527.getClass(), "attribute", false);
        setField(term64527, term64527.getClass(), "namespaceResolver", null);
        setField(term64527, term64527.getClass(), "exceptionHandler", null);
        setField(term64527, term64527.getClass(), "rootNode", null);
        setField(term64527, term64527.getClass(), "parent", null);
        setField(term64527, term64527.getClass(), "locale", null);
        term64529 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTypeTest"));
        setIntField(term64529, term64529.getClass(), "nodeType", 4);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTest");
        Object[] args = new Object[1];
        args[0] = term64190;
        callMethod(klass, "testNode", argTypes, term64010, args);
        assertTrue(recursiveEquals(term64010, term64527));
        assertTrue(recursiveEquals(term64190, term64529));
    }

};


