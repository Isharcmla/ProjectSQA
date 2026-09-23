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

public class DOMNodePointer_getRelativePositionOfElement_1105684500227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50499;
     Object term50706;

    public DOMNodePointer_getRelativePositionOfElement_1105684500227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50499 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term50589 = newInstance(Class.forName("org.apache.html.dom.HTMLHeadingElementImpl"));
        Object term50679 = newInstance(Class.forName("org.apache.html.dom.HTMLHeadingElementImpl"));
        setShortField(term50589, term50589.getClass(), "flags", (short) 0);
        setField(term50589, term50589.getClass(), "previousSibling", term50679);
        setField(term50499, term50499.getClass(), "node", term50589);
        term50706 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term50707 = newInstance(Class.forName("org.apache.html.dom.HTMLHeadingElementImpl"));
        Object term50708 = newInstance(Class.forName("org.apache.html.dom.HTMLHeadingElementImpl"));
        setField(term50707, term50707.getClass(), "name", null);
        setField(term50707, term50707.getClass(), "attributes", null);
        setField(term50707, term50707.getClass(), "ownerDocument", null);
        setField(term50707, term50707.getClass(), "firstChild", null);
        setField(term50707, term50707.getClass(), "fNodeListCache", null);
        setField(term50708, term50708.getClass(), "name", null);
        setField(term50708, term50708.getClass(), "attributes", null);
        setField(term50708, term50708.getClass(), "ownerDocument", null);
        setField(term50708, term50708.getClass(), "firstChild", null);
        setField(term50708, term50708.getClass(), "fNodeListCache", null);
        setField(term50708, term50708.getClass(), "previousSibling", null);
        setField(term50708, term50708.getClass(), "nextSibling", null);
        setField(term50708, term50708.getClass(), "ownerNode", null);
        setShortField(term50708, term50708.getClass(), "flags", (short) 0);
        setField(term50707, term50707.getClass(), "previousSibling", term50708);
        setField(term50707, term50707.getClass(), "nextSibling", null);
        setField(term50707, term50707.getClass(), "ownerNode", null);
        setShortField(term50707, term50707.getClass(), "flags", (short) 0);
        setField(term50706, term50706.getClass(), "node", term50707);
        setField(term50706, term50706.getClass(), "namespaces", null);
        setField(term50706, term50706.getClass(), "defaultNamespace", null);
        setField(term50706, term50706.getClass(), "id", null);
        setField(term50706, term50706.getClass(), "localNamespaceResolver", null);
        setIntField(term50706, term50706.getClass(), "index", 0);
        setBooleanField(term50706, term50706.getClass(), "attribute", false);
        setField(term50706, term50706.getClass(), "namespaceResolver", null);
        setField(term50706, term50706.getClass(), "rootNode", null);
        setField(term50706, term50706.getClass(), "parent", null);
        setField(term50706, term50706.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRelativePositionOfElement", argTypes, term50499, args);
        assertTrue(recursiveEquals(term50499, term50706));
    }

};


