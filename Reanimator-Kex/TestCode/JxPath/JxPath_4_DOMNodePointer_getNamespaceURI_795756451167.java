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

public class DOMNodePointer_getNamespaceURI_795756451167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32146;
     Object term32235;

    public DOMNodePointer_getNamespaceURI_795756451167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32146 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        term32235 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term32235, term32235.getClass(), "node", null);
        setField(term32235, term32235.getClass(), "namespaces", null);
        setField(term32235, term32235.getClass(), "defaultNamespace", "");
        setField(term32235, term32235.getClass(), "id", null);
        setIntField(term32235, term32235.getClass(), "index", 0);
        setBooleanField(term32235, term32235.getClass(), "attribute", false);
        setField(term32235, term32235.getClass(), "rootNode", null);
        setField(term32235, term32235.getClass(), "namespaceResolver", null);
        setField(term32235, term32235.getClass(), "parent", null);
        setField(term32235, term32235.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term32146, args);
        assertTrue(recursiveEquals(term32146, term32235));
        assertTrue(recursiveEquals(retValue, null));
    }

};


