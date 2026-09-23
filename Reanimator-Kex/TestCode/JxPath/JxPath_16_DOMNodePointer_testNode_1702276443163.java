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

public class DOMNodePointer_testNode_1702276443163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32602;
     Object term32708;
     Object term33318;
     Object term33319;

    public DOMNodePointer_testNode_1702276443163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32602 = newInstance(Class.forName("org.apache.html.dom.HTMLBaseFontElementImpl"));
        term32708 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTypeTest"));
        term33318 = newInstance(Class.forName("org.apache.html.dom.HTMLBaseFontElementImpl"));
        setField(term33318, term33318.getClass(), "name", null);
        setField(term33318, term33318.getClass(), "attributes", null);
        setField(term33318, term33318.getClass(), "ownerDocument", null);
        setField(term33318, term33318.getClass(), "firstChild", null);
        setField(term33318, term33318.getClass(), "fNodeListCache", null);
        setField(term33318, term33318.getClass(), "previousSibling", null);
        setField(term33318, term33318.getClass(), "nextSibling", null);
        setField(term33318, term33318.getClass(), "ownerNode", null);
        setShortField(term33318, term33318.getClass(), "flags", (short) 0);
        term33319 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTypeTest"));
        setIntField(term33319, term33319.getClass(), "nodeType", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.w3c.dom.Node");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTest");
        Object[] args = new Object[2];
        args[0] = term32602;
        args[1] = term32708;
        Object retValue = callMethod(klass, "testNode", argTypes, null, args);
        assertTrue(recursiveEquals(term32602, term33318));
        assertTrue(recursiveEquals(term32708, term33319));
        assertTrue(recursiveEquals(retValue, false));
    }

};


