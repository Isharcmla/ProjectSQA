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

public class DOMNodePointer_getNamespaceURI_795756451249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59346;
     Object term59503;

    public DOMNodePointer_getNamespaceURI_795756451249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59346 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term59426 = newInstance(Class.forName("org.apache.wml.dom.WMLMetaElementImpl"));
        setField(term59346, term59346.getClass(), "defaultNamespace", null);
        setField(term59346, term59346.getClass(), "node", term59426);
        term59503 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term59504 = newInstance(Class.forName("org.apache.wml.dom.WMLMetaElementImpl"));
        setField(term59504, term59504.getClass(), "name", null);
        setField(term59504, term59504.getClass(), "attributes", null);
        setField(term59504, term59504.getClass(), "ownerDocument", null);
        setField(term59504, term59504.getClass(), "firstChild", null);
        setField(term59504, term59504.getClass(), "fNodeListCache", null);
        setField(term59504, term59504.getClass(), "previousSibling", null);
        setField(term59504, term59504.getClass(), "nextSibling", null);
        setField(term59504, term59504.getClass(), "ownerNode", null);
        setShortField(term59504, term59504.getClass(), "flags", (short) 0);
        setField(term59503, term59503.getClass(), "node", term59504);
        setField(term59503, term59503.getClass(), "namespaces", null);
        setField(term59503, term59503.getClass(), "defaultNamespace", "");
        setField(term59503, term59503.getClass(), "id", null);
        setField(term59503, term59503.getClass(), "localNamespaceResolver", null);
        setIntField(term59503, term59503.getClass(), "index", 0);
        setBooleanField(term59503, term59503.getClass(), "attribute", false);
        setField(term59503, term59503.getClass(), "rootNode", null);
        setField(term59503, term59503.getClass(), "namespaceResolver", null);
        setField(term59503, term59503.getClass(), "parent", null);
        setField(term59503, term59503.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term59346, args);
        assertTrue(recursiveEquals(term59346, term59503));
        assertTrue(recursiveEquals(retValue, null));
    }

};


