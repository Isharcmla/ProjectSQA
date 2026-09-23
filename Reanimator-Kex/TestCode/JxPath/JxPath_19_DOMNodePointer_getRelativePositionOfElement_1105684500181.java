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

public class DOMNodePointer_getRelativePositionOfElement_1105684500181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37253;
     Object term37356;

    public DOMNodePointer_getRelativePositionOfElement_1105684500181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37253 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term37343 = newInstance(Class.forName("org.apache.html.dom.HTMLHeadingElementImpl"));
        setField(term37253, term37253.getClass(), "node", term37343);
        term37356 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term37357 = newInstance(Class.forName("org.apache.html.dom.HTMLHeadingElementImpl"));
        setField(term37357, term37357.getClass(), "name", null);
        setField(term37357, term37357.getClass(), "attributes", null);
        setField(term37357, term37357.getClass(), "ownerDocument", null);
        setField(term37357, term37357.getClass(), "firstChild", null);
        setField(term37357, term37357.getClass(), "fNodeListCache", null);
        setField(term37357, term37357.getClass(), "previousSibling", null);
        setField(term37357, term37357.getClass(), "nextSibling", null);
        setField(term37357, term37357.getClass(), "ownerNode", null);
        setShortField(term37357, term37357.getClass(), "flags", (short) 0);
        setField(term37356, term37356.getClass(), "node", term37357);
        setField(term37356, term37356.getClass(), "namespaces", null);
        setField(term37356, term37356.getClass(), "defaultNamespace", null);
        setField(term37356, term37356.getClass(), "id", null);
        setField(term37356, term37356.getClass(), "localNamespaceResolver", null);
        setIntField(term37356, term37356.getClass(), "index", 0);
        setBooleanField(term37356, term37356.getClass(), "attribute", false);
        setField(term37356, term37356.getClass(), "namespaceResolver", null);
        setField(term37356, term37356.getClass(), "rootNode", null);
        setField(term37356, term37356.getClass(), "parent", null);
        setField(term37356, term37356.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRelativePositionOfElement", argTypes, term37253, args);
        assertTrue(recursiveEquals(term37253, term37356));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


