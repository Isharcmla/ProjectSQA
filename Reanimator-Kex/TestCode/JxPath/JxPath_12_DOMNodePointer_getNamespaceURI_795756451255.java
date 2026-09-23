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

public class DOMNodePointer_getNamespaceURI_795756451255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68190;
     Object term68576;

    public DOMNodePointer_getNamespaceURI_795756451255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68190 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term68268 = newInstance(Class.forName("org.apache.wml.dom.WMLWmlElementImpl"));
        setField(term68190, term68190.getClass(), "defaultNamespace", null);
        setField(term68190, term68190.getClass(), "node", term68268);
        term68576 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term68577 = newInstance(Class.forName("org.apache.wml.dom.WMLWmlElementImpl"));
        setField(term68577, term68577.getClass(), "name", null);
        setField(term68577, term68577.getClass(), "attributes", null);
        setField(term68577, term68577.getClass(), "ownerDocument", null);
        setField(term68577, term68577.getClass(), "firstChild", null);
        setField(term68577, term68577.getClass(), "fNodeListCache", null);
        setField(term68577, term68577.getClass(), "previousSibling", null);
        setField(term68577, term68577.getClass(), "nextSibling", null);
        setField(term68577, term68577.getClass(), "ownerNode", null);
        setShortField(term68577, term68577.getClass(), "flags", (short) 0);
        setField(term68576, term68576.getClass(), "node", term68577);
        setField(term68576, term68576.getClass(), "namespaces", null);
        setField(term68576, term68576.getClass(), "defaultNamespace", "");
        setField(term68576, term68576.getClass(), "id", null);
        setIntField(term68576, term68576.getClass(), "index", 0);
        setBooleanField(term68576, term68576.getClass(), "attribute", false);
        setField(term68576, term68576.getClass(), "rootNode", null);
        setField(term68576, term68576.getClass(), "namespaceResolver", null);
        setField(term68576, term68576.getClass(), "parent", null);
        setField(term68576, term68576.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term68190, args);
        assertTrue(recursiveEquals(term68190, term68576));
        assertTrue(recursiveEquals(retValue, null));
    }

};


