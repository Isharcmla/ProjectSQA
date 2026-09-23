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

public class JDOMNodePointer_testNode_202417738225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41877;
     Object term41983;
     Object term44275;
     Object term44276;

    public JDOMNodePointer_testNode_202417738225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41877 = newInstance(Class.forName("org.jdom.Element"));
        term41983 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTypeTest"));
        setIntField(term41983, term41983.getClass(), "nodeType", 1);
        term44275 = newInstance(Class.forName("org.jdom.Element"));
        setField(term44275, term44275.getClass(), "name", null);
        setField(term44275, term44275.getClass(), "namespace", null);
        setField(term44275, term44275.getClass(), "additionalNamespaces", null);
        setField(term44275, term44275.getClass(), "attributes", null);
        setField(term44275, term44275.getClass(), "content", null);
        setField(term44275, term44275.getClass(), "parent", null);
        term44276 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTypeTest"));
        setIntField(term44276, term44276.getClass(), "nodeType", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("java.lang.Object");
        argTypes[2] = Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTest");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term41877;
        args[2] = term41983;
        Object retValue = callMethod(klass, "testNode", argTypes, null, args);
        assertTrue(recursiveEquals(term41877, term44275));
        assertTrue(recursiveEquals(term41983, term44276));
        assertTrue(recursiveEquals(retValue, true));
    }

};


