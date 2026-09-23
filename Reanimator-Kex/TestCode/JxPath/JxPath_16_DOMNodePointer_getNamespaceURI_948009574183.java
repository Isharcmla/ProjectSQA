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

public class DOMNodePointer_getNamespaceURI_948009574183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37328;
     Object term37499;

    public DOMNodePointer_getNamespaceURI_948009574183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37328 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term37404 = newInstance(Class.forName("org.apache.wml.dom.WMLBrElementImpl"));
        setShortField(term37404, term37404.getClass(), "flags", (short) 0);
        setField(term37404, term37404.getClass(), "name", "");
        setField(term37328, term37328.getClass(), "node", term37404);
        term37499 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term37500 = newInstance(Class.forName("org.apache.wml.dom.WMLBrElementImpl"));
        setField(term37500, term37500.getClass(), "name", "");
        setField(term37500, term37500.getClass(), "attributes", null);
        setField(term37500, term37500.getClass(), "ownerDocument", null);
        setField(term37500, term37500.getClass(), "firstChild", null);
        setField(term37500, term37500.getClass(), "fNodeListCache", null);
        setField(term37500, term37500.getClass(), "previousSibling", null);
        setField(term37500, term37500.getClass(), "nextSibling", null);
        setField(term37500, term37500.getClass(), "ownerNode", null);
        setShortField(term37500, term37500.getClass(), "flags", (short) 0);
        setField(term37499, term37499.getClass(), "node", term37500);
        setField(term37499, term37499.getClass(), "namespaces", null);
        setField(term37499, term37499.getClass(), "defaultNamespace", null);
        setField(term37499, term37499.getClass(), "id", null);
        setField(term37499, term37499.getClass(), "localNamespaceResolver", null);
        setIntField(term37499, term37499.getClass(), "index", 0);
        setBooleanField(term37499, term37499.getClass(), "attribute", false);
        setField(term37499, term37499.getClass(), "rootNode", null);
        setField(term37499, term37499.getClass(), "namespaceResolver", null);
        setField(term37499, term37499.getClass(), "parent", null);
        setField(term37499, term37499.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term37328, args);
        assertTrue(recursiveEquals(term37328, term37499));
        assertTrue(recursiveEquals(retValue, null));
    }

};


