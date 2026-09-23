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

public class JDOMNodePointer_testNode_1309895617150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26924;
     Object term27136;
     Object term27877;
     Object term27879;

    public JDOMNodePointer_testNode_1309895617150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26924 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term27030 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTypeTest"));
        setField(term26924, term26924.getClass(), "node", term27030);
        term27136 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.NodeNameTest"));
        term27877 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term27878 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTypeTest"));
        setIntField(term27878, term27878.getClass(), "nodeType", 0);
        setField(term27877, term27877.getClass(), "node", term27878);
        setField(term27877, term27877.getClass(), "id", null);
        setField(term27877, term27877.getClass(), "localNamespaceResolver", null);
        setIntField(term27877, term27877.getClass(), "index", 0);
        setBooleanField(term27877, term27877.getClass(), "attribute", false);
        setField(term27877, term27877.getClass(), "namespaceResolver", null);
        setField(term27877, term27877.getClass(), "rootNode", null);
        setField(term27877, term27877.getClass(), "parent", null);
        setField(term27877, term27877.getClass(), "locale", null);
        term27879 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.NodeNameTest"));
        setField(term27879, term27879.getClass(), "qname", null);
        setField(term27879, term27879.getClass(), "namespaceURI", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTest");
        Object[] args = new Object[1];
        args[0] = term27136;
        callMethod(klass, "testNode", argTypes, term26924, args);
        assertTrue(recursiveEquals(term26924, term27877));
        assertTrue(recursiveEquals(term27136, term27879));
    }

};


