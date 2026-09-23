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

public class DOMNodePointer_getNamespaceURI_795756451221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49147;
     Object term49319;

    public DOMNodePointer_getNamespaceURI_795756451221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49147 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term49239 = newInstance(Class.forName("org.apache.xerces.dom.DeferredElementNSImpl"));
        setField(term49147, term49147.getClass(), "defaultNamespace", null);
        setField(term49147, term49147.getClass(), "node", term49239);
        term49319 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term49320 = newInstance(Class.forName("org.apache.xerces.dom.DeferredElementNSImpl"));
        setIntField(term49320, term49320.getClass(), "fNodeIndex", 0);
        setField(term49320, term49320.getClass(), "namespaceURI", null);
        setField(term49320, term49320.getClass(), "localName", null);
        setField(term49320, term49320.getClass(), "type", null);
        setField(term49320, term49320.getClass(), "name", null);
        setField(term49320, term49320.getClass(), "attributes", null);
        setField(term49320, term49320.getClass(), "ownerDocument", null);
        setField(term49320, term49320.getClass(), "firstChild", null);
        setField(term49320, term49320.getClass(), "fNodeListCache", null);
        setField(term49320, term49320.getClass(), "previousSibling", null);
        setField(term49320, term49320.getClass(), "nextSibling", null);
        setField(term49320, term49320.getClass(), "ownerNode", null);
        setShortField(term49320, term49320.getClass(), "flags", (short) 0);
        setField(term49319, term49319.getClass(), "node", term49320);
        setField(term49319, term49319.getClass(), "namespaces", null);
        setField(term49319, term49319.getClass(), "defaultNamespace", "");
        setField(term49319, term49319.getClass(), "id", null);
        setField(term49319, term49319.getClass(), "localNamespaceResolver", null);
        setIntField(term49319, term49319.getClass(), "index", 0);
        setBooleanField(term49319, term49319.getClass(), "attribute", false);
        setField(term49319, term49319.getClass(), "namespaceResolver", null);
        setField(term49319, term49319.getClass(), "rootNode", null);
        setField(term49319, term49319.getClass(), "parent", null);
        setField(term49319, term49319.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term49147, args);
        assertTrue(recursiveEquals(term49147, term49319));
        assertTrue(recursiveEquals(retValue, null));
    }

};


