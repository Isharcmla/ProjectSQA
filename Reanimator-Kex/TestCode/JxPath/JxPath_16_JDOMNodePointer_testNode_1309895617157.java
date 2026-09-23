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

public class JDOMNodePointer_testNode_1309895617157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27534;
     Object term27772;
     Object term27795;
     Object term27797;

    public JDOMNodePointer_testNode_1309895617157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27534 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term27640 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.NodeNameTest"));
        setField(term27534, term27534.getClass(), "node", term27640);
        term27772 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest"));
        term27795 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term27796 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.NodeNameTest"));
        setField(term27796, term27796.getClass(), "qname", null);
        setField(term27796, term27796.getClass(), "namespaceURI", null);
        setField(term27795, term27795.getClass(), "node", term27796);
        setField(term27795, term27795.getClass(), "id", null);
        setField(term27795, term27795.getClass(), "localNamespaceResolver", null);
        setIntField(term27795, term27795.getClass(), "index", 0);
        setBooleanField(term27795, term27795.getClass(), "attribute", false);
        setField(term27795, term27795.getClass(), "rootNode", null);
        setField(term27795, term27795.getClass(), "namespaceResolver", null);
        setField(term27795, term27795.getClass(), "parent", null);
        setField(term27795, term27795.getClass(), "locale", null);
        term27797 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest"));
        setField(term27797, term27797.getClass(), "target", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTest");
        Object[] args = new Object[1];
        args[0] = term27772;
        callMethod(klass, "testNode", argTypes, term27534, args);
        assertTrue(recursiveEquals(term27534, term27795));
        assertTrue(recursiveEquals(term27772, term27797));
    }

};


