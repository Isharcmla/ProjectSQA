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

public class DOMNodePointer_testNode_1702276443240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52337;
     Object term52443;
     Object term52671;
     Object term52672;

    public DOMNodePointer_testNode_1702276443240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52337 = newInstance(Class.forName("org.apache.html.dom.HTMLAppletElementImpl"));
        term52443 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTypeTest"));
        setIntField(term52443, term52443.getClass(), "nodeType", 4);
        term52671 = newInstance(Class.forName("org.apache.html.dom.HTMLAppletElementImpl"));
        setField(term52671, term52671.getClass(), "name", null);
        setField(term52671, term52671.getClass(), "attributes", null);
        setField(term52671, term52671.getClass(), "ownerDocument", null);
        setField(term52671, term52671.getClass(), "firstChild", null);
        setField(term52671, term52671.getClass(), "fNodeListCache", null);
        setField(term52671, term52671.getClass(), "previousSibling", null);
        setField(term52671, term52671.getClass(), "nextSibling", null);
        setField(term52671, term52671.getClass(), "ownerNode", null);
        setShortField(term52671, term52671.getClass(), "flags", (short) 0);
        term52672 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTypeTest"));
        setIntField(term52672, term52672.getClass(), "nodeType", 4);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.w3c.dom.Node");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTest");
        Object[] args = new Object[2];
        args[0] = term52337;
        args[1] = term52443;
        Object retValue = callMethod(klass, "testNode", argTypes, null, args);
        assertTrue(recursiveEquals(term52337, term52671));
        assertTrue(recursiveEquals(term52443, term52672));
        assertTrue(recursiveEquals(retValue, false));
    }

};


