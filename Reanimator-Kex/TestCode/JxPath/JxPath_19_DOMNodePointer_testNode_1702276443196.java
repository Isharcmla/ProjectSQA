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

public class DOMNodePointer_testNode_1702276443196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39719;
     Object term39825;
     Object term40324;
     Object term40325;

    public DOMNodePointer_testNode_1702276443196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39719 = newInstance(Class.forName("org.apache.html.dom.HTMLAppletElementImpl"));
        term39825 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTypeTest"));
        term40324 = newInstance(Class.forName("org.apache.html.dom.HTMLAppletElementImpl"));
        setField(term40324, term40324.getClass(), "name", null);
        setField(term40324, term40324.getClass(), "attributes", null);
        setField(term40324, term40324.getClass(), "ownerDocument", null);
        setField(term40324, term40324.getClass(), "firstChild", null);
        setField(term40324, term40324.getClass(), "fNodeListCache", null);
        setField(term40324, term40324.getClass(), "previousSibling", null);
        setField(term40324, term40324.getClass(), "nextSibling", null);
        setField(term40324, term40324.getClass(), "ownerNode", null);
        setShortField(term40324, term40324.getClass(), "flags", (short) 0);
        term40325 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTypeTest"));
        setIntField(term40325, term40325.getClass(), "nodeType", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.w3c.dom.Node");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTest");
        Object[] args = new Object[2];
        args[0] = term39719;
        args[1] = term39825;
        Object retValue = callMethod(klass, "testNode", argTypes, null, args);
        assertTrue(recursiveEquals(term39719, term40324));
        assertTrue(recursiveEquals(term39825, term40325));
        assertTrue(recursiveEquals(retValue, false));
    }

};


