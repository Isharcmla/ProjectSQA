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

public class DOMNodePointer_getNamespaceURI_795756451110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15451;
     Object term18176;

    public DOMNodePointer_getNamespaceURI_795756451110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15451 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        term18176 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term18176, term18176.getClass(), "node", null);
        setField(term18176, term18176.getClass(), "namespaces", null);
        setField(term18176, term18176.getClass(), "defaultNamespace", null);
        setField(term18176, term18176.getClass(), "id", null);
        setIntField(term18176, term18176.getClass(), "index", 0);
        setBooleanField(term18176, term18176.getClass(), "attribute", false);
        setField(term18176, term18176.getClass(), "rootNode", null);
        setField(term18176, term18176.getClass(), "namespaceResolver", null);
        setField(term18176, term18176.getClass(), "parent", null);
        setField(term18176, term18176.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xml";
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term15451, args);
        assertTrue(recursiveEquals(term15451, term18176));
        assertTrue(recursiveEquals(retValue, "http://www.w3.org/XML/1998/namespace"));
    }

};


