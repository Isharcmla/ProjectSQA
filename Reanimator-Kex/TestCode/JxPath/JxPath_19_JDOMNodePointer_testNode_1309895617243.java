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

public class JDOMNodePointer_testNode_1309895617243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47740;
     Object term47962;
     Object term48755;
     Object term48757;

    public JDOMNodePointer_testNode_1309895617243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47740 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term47856 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        setField(term47740, term47740.getClass(), "node", term47856);
        term47962 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTypeTest"));
        term48755 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term48756 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        setField(term48756, term48756.getClass(), "node", null);
        setField(term48756, term48756.getClass(), "id", null);
        setField(term48756, term48756.getClass(), "localNamespaceResolver", null);
        setIntField(term48756, term48756.getClass(), "index", 0);
        setBooleanField(term48756, term48756.getClass(), "attribute", false);
        setField(term48756, term48756.getClass(), "namespaceResolver", null);
        setField(term48756, term48756.getClass(), "rootNode", null);
        setField(term48756, term48756.getClass(), "parent", null);
        setField(term48756, term48756.getClass(), "locale", null);
        setField(term48755, term48755.getClass(), "node", term48756);
        setField(term48755, term48755.getClass(), "id", null);
        setField(term48755, term48755.getClass(), "localNamespaceResolver", null);
        setIntField(term48755, term48755.getClass(), "index", 0);
        setBooleanField(term48755, term48755.getClass(), "attribute", false);
        setField(term48755, term48755.getClass(), "namespaceResolver", null);
        setField(term48755, term48755.getClass(), "rootNode", null);
        setField(term48755, term48755.getClass(), "parent", null);
        setField(term48755, term48755.getClass(), "locale", null);
        term48757 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTypeTest"));
        setIntField(term48757, term48757.getClass(), "nodeType", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTest");
        Object[] args = new Object[1];
        args[0] = term47962;
        callMethod(klass, "testNode", argTypes, term47740, args);
        assertTrue(recursiveEquals(term47740, term48755));
        assertTrue(recursiveEquals(term47962, term48757));
    }

};


