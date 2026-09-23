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

public class DOMNodePointer_stringValue_2129170303120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19638;
     Object term19726;
     Object term20623;
     Object term20624;

    public DOMNodePointer_stringValue_2129170303120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19638 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        term19726 = newInstance(Class.forName("org.apache.html.dom.HTMLScriptElementImpl"));
        term20623 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term20623, term20623.getClass(), "node", null);
        setField(term20623, term20623.getClass(), "namespaces", null);
        setField(term20623, term20623.getClass(), "defaultNamespace", null);
        setField(term20623, term20623.getClass(), "id", null);
        setField(term20623, term20623.getClass(), "localNamespaceResolver", null);
        setIntField(term20623, term20623.getClass(), "index", 0);
        setBooleanField(term20623, term20623.getClass(), "attribute", false);
        setField(term20623, term20623.getClass(), "namespaceResolver", null);
        setField(term20623, term20623.getClass(), "exceptionHandler", null);
        setField(term20623, term20623.getClass(), "rootNode", null);
        setField(term20623, term20623.getClass(), "parent", null);
        setField(term20623, term20623.getClass(), "locale", null);
        term20624 = newInstance(Class.forName("org.apache.html.dom.HTMLScriptElementImpl"));
        setField(term20624, term20624.getClass(), "name", null);
        setField(term20624, term20624.getClass(), "attributes", null);
        setField(term20624, term20624.getClass(), "ownerDocument", null);
        setField(term20624, term20624.getClass(), "firstChild", null);
        setField(term20624, term20624.getClass(), "fNodeListCache", null);
        setField(term20624, term20624.getClass(), "previousSibling", null);
        setField(term20624, term20624.getClass(), "nextSibling", null);
        setField(term20624, term20624.getClass(), "ownerNode", null);
        setShortField(term20624, term20624.getClass(), "flags", (short) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.w3c.dom.Node");
        Object[] args = new Object[1];
        args[0] = term19726;
        Object retValue = callMethod(klass, "stringValue", argTypes, term19638, args);
        assertTrue(recursiveEquals(term19638, term20623));
        assertTrue(recursiveEquals(term19726, term20624));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


