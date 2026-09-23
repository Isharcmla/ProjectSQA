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

public class DOMNodePointer_testNode_769718949273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68357;
     Object term68553;
     Object term68573;
     Object term68575;

    public DOMNodePointer_testNode_769718949273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68357 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term68447 = newInstance(Class.forName("org.apache.html.dom.HTMLHeadingElementImpl"));
        setField(term68357, term68357.getClass(), "node", term68447);
        term68553 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTypeTest"));
        setIntField(term68553, term68553.getClass(), "nodeType", 1);
        term68573 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term68574 = newInstance(Class.forName("org.apache.html.dom.HTMLHeadingElementImpl"));
        setField(term68574, term68574.getClass(), "name", null);
        setField(term68574, term68574.getClass(), "attributes", null);
        setField(term68574, term68574.getClass(), "ownerDocument", null);
        setField(term68574, term68574.getClass(), "firstChild", null);
        setField(term68574, term68574.getClass(), "fNodeListCache", null);
        setField(term68574, term68574.getClass(), "previousSibling", null);
        setField(term68574, term68574.getClass(), "nextSibling", null);
        setField(term68574, term68574.getClass(), "ownerNode", null);
        setShortField(term68574, term68574.getClass(), "flags", (short) 0);
        setField(term68573, term68573.getClass(), "node", term68574);
        setField(term68573, term68573.getClass(), "namespaces", null);
        setField(term68573, term68573.getClass(), "defaultNamespace", null);
        setField(term68573, term68573.getClass(), "id", null);
        setField(term68573, term68573.getClass(), "localNamespaceResolver", null);
        setIntField(term68573, term68573.getClass(), "index", 0);
        setBooleanField(term68573, term68573.getClass(), "attribute", false);
        setField(term68573, term68573.getClass(), "rootNode", null);
        setField(term68573, term68573.getClass(), "namespaceResolver", null);
        setField(term68573, term68573.getClass(), "parent", null);
        setField(term68573, term68573.getClass(), "locale", null);
        term68575 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTypeTest"));
        setIntField(term68575, term68575.getClass(), "nodeType", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTest");
        Object[] args = new Object[1];
        args[0] = term68553;
        callMethod(klass, "testNode", argTypes, term68357, args);
        assertTrue(recursiveEquals(term68357, term68573));
        assertTrue(recursiveEquals(term68553, term68575));
    }

};


