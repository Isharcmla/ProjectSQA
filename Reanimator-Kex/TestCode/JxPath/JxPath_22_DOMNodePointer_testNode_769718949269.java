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

public class DOMNodePointer_testNode_769718949269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65611;
     Object term65791;
     Object term66070;
     Object term66072;

    public DOMNodePointer_testNode_769718949269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65611 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term65685 = newInstance(Class.forName("org.apache.wml.dom.WMLIElementImpl"));
        setField(term65611, term65611.getClass(), "node", term65685);
        term65791 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTypeTest"));
        setIntField(term65791, term65791.getClass(), "nodeType", 2);
        term66070 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term66071 = newInstance(Class.forName("org.apache.wml.dom.WMLIElementImpl"));
        setField(term66071, term66071.getClass(), "name", null);
        setField(term66071, term66071.getClass(), "attributes", null);
        setField(term66071, term66071.getClass(), "ownerDocument", null);
        setField(term66071, term66071.getClass(), "firstChild", null);
        setField(term66071, term66071.getClass(), "fNodeListCache", null);
        setField(term66071, term66071.getClass(), "previousSibling", null);
        setField(term66071, term66071.getClass(), "nextSibling", null);
        setField(term66071, term66071.getClass(), "ownerNode", null);
        setShortField(term66071, term66071.getClass(), "flags", (short) 0);
        setField(term66070, term66070.getClass(), "node", term66071);
        setField(term66070, term66070.getClass(), "namespaces", null);
        setField(term66070, term66070.getClass(), "defaultNamespace", null);
        setField(term66070, term66070.getClass(), "id", null);
        setField(term66070, term66070.getClass(), "localNamespaceResolver", null);
        setIntField(term66070, term66070.getClass(), "index", 0);
        setBooleanField(term66070, term66070.getClass(), "attribute", false);
        setField(term66070, term66070.getClass(), "namespaceResolver", null);
        setField(term66070, term66070.getClass(), "exceptionHandler", null);
        setField(term66070, term66070.getClass(), "rootNode", null);
        setField(term66070, term66070.getClass(), "parent", null);
        setField(term66070, term66070.getClass(), "locale", null);
        term66072 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTypeTest"));
        setIntField(term66072, term66072.getClass(), "nodeType", 2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTest");
        Object[] args = new Object[1];
        args[0] = term65791;
        callMethod(klass, "testNode", argTypes, term65611, args);
        assertTrue(recursiveEquals(term65611, term66070));
        assertTrue(recursiveEquals(term65791, term66072));
    }

};


