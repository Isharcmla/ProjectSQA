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

public class DOMNodePointer_testNode_1702276443231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51077;
     Object term51183;
     Object term51231;
     Object term51232;

    public DOMNodePointer_testNode_1702276443231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51077 = newInstance(Class.forName("org.apache.html.dom.HTMLAppletElementImpl"));
        term51183 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTypeTest"));
        setIntField(term51183, term51183.getClass(), "nodeType", 1);
        term51231 = newInstance(Class.forName("org.apache.html.dom.HTMLAppletElementImpl"));
        setField(term51231, term51231.getClass(), "name", null);
        setField(term51231, term51231.getClass(), "attributes", null);
        setField(term51231, term51231.getClass(), "ownerDocument", null);
        setField(term51231, term51231.getClass(), "firstChild", null);
        setField(term51231, term51231.getClass(), "fNodeListCache", null);
        setField(term51231, term51231.getClass(), "previousSibling", null);
        setField(term51231, term51231.getClass(), "nextSibling", null);
        setField(term51231, term51231.getClass(), "ownerNode", null);
        setShortField(term51231, term51231.getClass(), "flags", (short) 0);
        term51232 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTypeTest"));
        setIntField(term51232, term51232.getClass(), "nodeType", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.w3c.dom.Node");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTest");
        Object[] args = new Object[2];
        args[0] = term51077;
        args[1] = term51183;
        Object retValue = callMethod(klass, "testNode", argTypes, null, args);
        assertTrue(recursiveEquals(term51077, term51231));
        assertTrue(recursiveEquals(term51183, term51232));
        assertTrue(recursiveEquals(retValue, true));
    }

};


