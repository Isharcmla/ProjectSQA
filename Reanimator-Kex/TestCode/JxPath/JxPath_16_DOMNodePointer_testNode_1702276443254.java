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

public class DOMNodePointer_testNode_1702276443254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59842;
     Object term59948;
     Object term61073;
     Object term61074;

    public DOMNodePointer_testNode_1702276443254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59842 = newInstance(Class.forName("org.apache.html.dom.HTMLBaseFontElementImpl"));
        term59948 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTypeTest"));
        setIntField(term59948, term59948.getClass(), "nodeType", 2);
        term61073 = newInstance(Class.forName("org.apache.html.dom.HTMLBaseFontElementImpl"));
        setField(term61073, term61073.getClass(), "name", null);
        setField(term61073, term61073.getClass(), "attributes", null);
        setField(term61073, term61073.getClass(), "ownerDocument", null);
        setField(term61073, term61073.getClass(), "firstChild", null);
        setField(term61073, term61073.getClass(), "fNodeListCache", null);
        setField(term61073, term61073.getClass(), "previousSibling", null);
        setField(term61073, term61073.getClass(), "nextSibling", null);
        setField(term61073, term61073.getClass(), "ownerNode", null);
        setShortField(term61073, term61073.getClass(), "flags", (short) 0);
        term61074 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTypeTest"));
        setIntField(term61074, term61074.getClass(), "nodeType", 2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.w3c.dom.Node");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTest");
        Object[] args = new Object[2];
        args[0] = term59842;
        args[1] = term59948;
        Object retValue = callMethod(klass, "testNode", argTypes, null, args);
        assertTrue(recursiveEquals(term59842, term61073));
        assertTrue(recursiveEquals(term59948, term61074));
        assertTrue(recursiveEquals(retValue, false));
    }

};


