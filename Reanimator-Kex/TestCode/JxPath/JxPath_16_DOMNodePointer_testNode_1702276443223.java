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

public class DOMNodePointer_testNode_1702276443223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48687;
     Object term48793;
     Object term48815;
     Object term48816;

    public DOMNodePointer_testNode_1702276443223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48687 = newInstance(Class.forName("org.apache.html.dom.HTMLBaseFontElementImpl"));
        term48793 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTypeTest"));
        setIntField(term48793, term48793.getClass(), "nodeType", 3);
        term48815 = newInstance(Class.forName("org.apache.html.dom.HTMLBaseFontElementImpl"));
        setField(term48815, term48815.getClass(), "name", null);
        setField(term48815, term48815.getClass(), "attributes", null);
        setField(term48815, term48815.getClass(), "ownerDocument", null);
        setField(term48815, term48815.getClass(), "firstChild", null);
        setField(term48815, term48815.getClass(), "fNodeListCache", null);
        setField(term48815, term48815.getClass(), "previousSibling", null);
        setField(term48815, term48815.getClass(), "nextSibling", null);
        setField(term48815, term48815.getClass(), "ownerNode", null);
        setShortField(term48815, term48815.getClass(), "flags", (short) 0);
        term48816 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTypeTest"));
        setIntField(term48816, term48816.getClass(), "nodeType", 3);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.w3c.dom.Node");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTest");
        Object[] args = new Object[2];
        args[0] = term48687;
        args[1] = term48793;
        Object retValue = callMethod(klass, "testNode", argTypes, null, args);
        assertTrue(recursiveEquals(term48687, term48815));
        assertTrue(recursiveEquals(term48793, term48816));
        assertTrue(recursiveEquals(retValue, false));
    }

};


