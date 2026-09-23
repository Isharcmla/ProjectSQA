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
import java.util.HashMap;

public class DOMNodePointer_getNamespaceURI_795756451208 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46927;
     Object term48517;

    public DOMNodePointer_getNamespaceURI_795756451208() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46927 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term47019 = newInstance(Class.forName("org.apache.xerces.dom.DeferredElementNSImpl"));
        setField(term46927, term46927.getClass(), "namespaces", null);
        setField(term46927, term46927.getClass(), "node", term47019);
        HashMap term48519 = new HashMap();
        term48517 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term48518 = newInstance(Class.forName("org.apache.xerces.dom.DeferredElementNSImpl"));
        setIntField(term48518, term48518.getClass(), "fNodeIndex", 0);
        setField(term48518, term48518.getClass(), "namespaceURI", null);
        setField(term48518, term48518.getClass(), "localName", null);
        setField(term48518, term48518.getClass(), "type", null);
        setField(term48518, term48518.getClass(), "name", null);
        setField(term48518, term48518.getClass(), "attributes", null);
        setField(term48518, term48518.getClass(), "ownerDocument", null);
        setField(term48518, term48518.getClass(), "firstChild", null);
        setField(term48518, term48518.getClass(), "fNodeListCache", null);
        setField(term48518, term48518.getClass(), "previousSibling", null);
        setField(term48518, term48518.getClass(), "nextSibling", null);
        setField(term48518, term48518.getClass(), "ownerNode", null);
        setShortField(term48518, term48518.getClass(), "flags", (short) 0);
        setField(term48517, term48517.getClass(), "node", term48518);
        setField(term48517, term48517.getClass(), "namespaces", term48519);
        setField(term48517, term48517.getClass(), "defaultNamespace", null);
        setField(term48517, term48517.getClass(), "id", null);
        setIntField(term48517, term48517.getClass(), "index", 0);
        setBooleanField(term48517, term48517.getClass(), "attribute", false);
        setField(term48517, term48517.getClass(), "rootNode", null);
        setField(term48517, term48517.getClass(), "namespaceResolver", null);
        setField(term48517, term48517.getClass(), "parent", null);
        setField(term48517, term48517.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = " :::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::";
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term46927, args);
        assertTrue(recursiveEquals(term46927, term48517));
        assertTrue(recursiveEquals(retValue, null));
    }

};


