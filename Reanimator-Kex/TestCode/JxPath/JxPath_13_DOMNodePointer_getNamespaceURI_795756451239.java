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

public class DOMNodePointer_getNamespaceURI_795756451239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64560;
     Object term64773;

    public DOMNodePointer_getNamespaceURI_795756451239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64560 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term64646 = newInstance(Class.forName("org.apache.html.dom.HTMLOListElementImpl"));
        setField(term64560, term64560.getClass(), "defaultNamespace", null);
        setField(term64560, term64560.getClass(), "node", term64646);
        term64773 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term64774 = newInstance(Class.forName("org.apache.html.dom.HTMLOListElementImpl"));
        setField(term64774, term64774.getClass(), "name", null);
        setField(term64774, term64774.getClass(), "attributes", null);
        setField(term64774, term64774.getClass(), "ownerDocument", null);
        setField(term64774, term64774.getClass(), "firstChild", null);
        setField(term64774, term64774.getClass(), "fNodeListCache", null);
        setField(term64774, term64774.getClass(), "previousSibling", null);
        setField(term64774, term64774.getClass(), "nextSibling", null);
        setField(term64774, term64774.getClass(), "ownerNode", null);
        setShortField(term64774, term64774.getClass(), "flags", (short) 0);
        setField(term64773, term64773.getClass(), "node", term64774);
        setField(term64773, term64773.getClass(), "namespaces", null);
        setField(term64773, term64773.getClass(), "defaultNamespace", "");
        setField(term64773, term64773.getClass(), "id", null);
        setIntField(term64773, term64773.getClass(), "index", 0);
        setBooleanField(term64773, term64773.getClass(), "attribute", false);
        setField(term64773, term64773.getClass(), "rootNode", null);
        setField(term64773, term64773.getClass(), "namespaceResolver", null);
        setField(term64773, term64773.getClass(), "parent", null);
        setField(term64773, term64773.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term64560, args);
        assertTrue(recursiveEquals(term64560, term64773));
        assertTrue(recursiveEquals(retValue, null));
    }

};


