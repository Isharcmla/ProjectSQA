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

public class DOMNodePointer_getNamespaceURI_795756451117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19669;
     Object term20015;

    public DOMNodePointer_getNamespaceURI_795756451117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19669 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        term20015 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term20015, term20015.getClass(), "node", null);
        setField(term20015, term20015.getClass(), "namespaces", null);
        setField(term20015, term20015.getClass(), "defaultNamespace", null);
        setField(term20015, term20015.getClass(), "id", null);
        setField(term20015, term20015.getClass(), "localNamespaceResolver", null);
        setIntField(term20015, term20015.getClass(), "index", 0);
        setBooleanField(term20015, term20015.getClass(), "attribute", false);
        setField(term20015, term20015.getClass(), "rootNode", null);
        setField(term20015, term20015.getClass(), "namespaceResolver", null);
        setField(term20015, term20015.getClass(), "parent", null);
        setField(term20015, term20015.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xml";
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term19669, args);
        assertTrue(recursiveEquals(term19669, term20015));
        assertTrue(recursiveEquals(retValue, "http://www.w3.org/XML/1998/namespace"));
    }

};


