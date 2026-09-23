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

public class DOMNodePointer_getRelativePositionOfElement_1105684500293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89257;
     Object term89450;

    public DOMNodePointer_getRelativePositionOfElement_1105684500293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term89257 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term89341 = newInstance(Class.forName("org.apache.html.dom.HTMLBodyElementImpl"));
        Object term89425 = newInstance(Class.forName("org.apache.html.dom.HTMLBodyElementImpl"));
        setShortField(term89341, term89341.getClass(), "flags", (short) 0);
        setField(term89341, term89341.getClass(), "previousSibling", term89425);
        setField(term89257, term89257.getClass(), "node", term89341);
        term89450 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term89451 = newInstance(Class.forName("org.apache.html.dom.HTMLBodyElementImpl"));
        Object term89452 = newInstance(Class.forName("org.apache.html.dom.HTMLBodyElementImpl"));
        setField(term89451, term89451.getClass(), "name", null);
        setField(term89451, term89451.getClass(), "attributes", null);
        setField(term89451, term89451.getClass(), "ownerDocument", null);
        setField(term89451, term89451.getClass(), "firstChild", null);
        setField(term89451, term89451.getClass(), "fNodeListCache", null);
        setField(term89452, term89452.getClass(), "name", null);
        setField(term89452, term89452.getClass(), "attributes", null);
        setField(term89452, term89452.getClass(), "ownerDocument", null);
        setField(term89452, term89452.getClass(), "firstChild", null);
        setField(term89452, term89452.getClass(), "fNodeListCache", null);
        setField(term89452, term89452.getClass(), "previousSibling", null);
        setField(term89452, term89452.getClass(), "nextSibling", null);
        setField(term89452, term89452.getClass(), "ownerNode", null);
        setShortField(term89452, term89452.getClass(), "flags", (short) 0);
        setField(term89451, term89451.getClass(), "previousSibling", term89452);
        setField(term89451, term89451.getClass(), "nextSibling", null);
        setField(term89451, term89451.getClass(), "ownerNode", null);
        setShortField(term89451, term89451.getClass(), "flags", (short) 0);
        setField(term89450, term89450.getClass(), "node", term89451);
        setField(term89450, term89450.getClass(), "namespaces", null);
        setField(term89450, term89450.getClass(), "defaultNamespace", null);
        setField(term89450, term89450.getClass(), "id", null);
        setIntField(term89450, term89450.getClass(), "index", 0);
        setBooleanField(term89450, term89450.getClass(), "attribute", false);
        setField(term89450, term89450.getClass(), "rootNode", null);
        setField(term89450, term89450.getClass(), "namespaceResolver", null);
        setField(term89450, term89450.getClass(), "parent", null);
        setField(term89450, term89450.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRelativePositionOfElement", argTypes, term89257, args);
        assertTrue(recursiveEquals(term89257, term89450));
    }

};


