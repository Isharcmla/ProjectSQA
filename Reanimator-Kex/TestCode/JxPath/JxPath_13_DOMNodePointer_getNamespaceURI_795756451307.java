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

public class DOMNodePointer_getNamespaceURI_795756451307 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term242009;
     Object term242138;

    public DOMNodePointer_getNamespaceURI_795756451307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term242009 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term242095 = newInstance(Class.forName("org.apache.html.dom.HTMLQuoteElementImpl"));
        setField(term242009, term242009.getClass(), "defaultNamespace", null);
        setField(term242009, term242009.getClass(), "node", term242095);
        term242138 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term242139 = newInstance(Class.forName("org.apache.html.dom.HTMLQuoteElementImpl"));
        setField(term242139, term242139.getClass(), "name", null);
        setField(term242139, term242139.getClass(), "attributes", null);
        setField(term242139, term242139.getClass(), "ownerDocument", null);
        setField(term242139, term242139.getClass(), "firstChild", null);
        setField(term242139, term242139.getClass(), "fNodeListCache", null);
        setField(term242139, term242139.getClass(), "previousSibling", null);
        setField(term242139, term242139.getClass(), "nextSibling", null);
        setField(term242139, term242139.getClass(), "ownerNode", null);
        setShortField(term242139, term242139.getClass(), "flags", (short) 0);
        setField(term242138, term242138.getClass(), "node", term242139);
        setField(term242138, term242138.getClass(), "namespaces", null);
        setField(term242138, term242138.getClass(), "defaultNamespace", "");
        setField(term242138, term242138.getClass(), "id", null);
        setIntField(term242138, term242138.getClass(), "index", 0);
        setBooleanField(term242138, term242138.getClass(), "attribute", false);
        setField(term242138, term242138.getClass(), "rootNode", null);
        setField(term242138, term242138.getClass(), "namespaceResolver", null);
        setField(term242138, term242138.getClass(), "parent", null);
        setField(term242138, term242138.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term242009, args);
        assertTrue(recursiveEquals(term242009, term242138));
        assertTrue(recursiveEquals(retValue, null));
    }

};


