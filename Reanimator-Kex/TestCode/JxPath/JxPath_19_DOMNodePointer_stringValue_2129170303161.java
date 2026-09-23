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

public class DOMNodePointer_stringValue_2129170303161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30987;
     Object term31063;
     Object term31129;
     Object term31130;

    public DOMNodePointer_stringValue_2129170303161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30987 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        term31063 = newInstance(Class.forName("org.apache.html.dom.HTMLElementImpl"));
        term31129 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term31129, term31129.getClass(), "node", null);
        setField(term31129, term31129.getClass(), "namespaces", null);
        setField(term31129, term31129.getClass(), "defaultNamespace", null);
        setField(term31129, term31129.getClass(), "id", null);
        setField(term31129, term31129.getClass(), "localNamespaceResolver", null);
        setIntField(term31129, term31129.getClass(), "index", 0);
        setBooleanField(term31129, term31129.getClass(), "attribute", false);
        setField(term31129, term31129.getClass(), "namespaceResolver", null);
        setField(term31129, term31129.getClass(), "rootNode", null);
        setField(term31129, term31129.getClass(), "parent", null);
        setField(term31129, term31129.getClass(), "locale", null);
        term31130 = newInstance(Class.forName("org.apache.html.dom.HTMLElementImpl"));
        setField(term31130, term31130.getClass(), "name", null);
        setField(term31130, term31130.getClass(), "attributes", null);
        setField(term31130, term31130.getClass(), "ownerDocument", null);
        setField(term31130, term31130.getClass(), "firstChild", null);
        setField(term31130, term31130.getClass(), "fNodeListCache", null);
        setField(term31130, term31130.getClass(), "previousSibling", null);
        setField(term31130, term31130.getClass(), "nextSibling", null);
        setField(term31130, term31130.getClass(), "ownerNode", null);
        setShortField(term31130, term31130.getClass(), "flags", (short) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.w3c.dom.Node");
        Object[] args = new Object[1];
        args[0] = term31063;
        Object retValue = callMethod(klass, "stringValue", argTypes, term30987, args);
        assertTrue(recursiveEquals(term30987, term31129));
        assertTrue(recursiveEquals(term31063, term31130));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


