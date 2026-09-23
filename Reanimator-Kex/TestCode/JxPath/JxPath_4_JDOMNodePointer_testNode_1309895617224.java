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

public class JDOMNodePointer_testNode_1309895617224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41604;
     Object term41816;
     Object term44261;
     Object term44263;

    public JDOMNodePointer_testNode_1309895617224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41604 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term41710 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTypeTest"));
        setField(term41604, term41604.getClass(), "node", term41710);
        term41816 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.NodeNameTest"));
        term44261 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term44262 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTypeTest"));
        setIntField(term44262, term44262.getClass(), "nodeType", 0);
        setField(term44261, term44261.getClass(), "node", term44262);
        setField(term44261, term44261.getClass(), "id", null);
        setIntField(term44261, term44261.getClass(), "index", 0);
        setBooleanField(term44261, term44261.getClass(), "attribute", false);
        setField(term44261, term44261.getClass(), "rootNode", null);
        setField(term44261, term44261.getClass(), "namespaceResolver", null);
        setField(term44261, term44261.getClass(), "parent", null);
        setField(term44261, term44261.getClass(), "locale", null);
        term44263 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.NodeNameTest"));
        setField(term44263, term44263.getClass(), "qname", null);
        setField(term44263, term44263.getClass(), "namespaceURI", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTest");
        Object[] args = new Object[1];
        args[0] = term41816;
        callMethod(klass, "testNode", argTypes, term41604, args);
        assertTrue(recursiveEquals(term41604, term44261));
        assertTrue(recursiveEquals(term41816, term44263));
    }

};


