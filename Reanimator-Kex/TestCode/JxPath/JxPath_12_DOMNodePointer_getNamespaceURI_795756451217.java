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

public class DOMNodePointer_getNamespaceURI_795756451217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52319;
     Object term53129;

    public DOMNodePointer_getNamespaceURI_795756451217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52319 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term52411 = newInstance(Class.forName("org.apache.xerces.dom.ElementDefinitionImpl"));
        setField(term52319, term52319.getClass(), "defaultNamespace", null);
        setField(term52319, term52319.getClass(), "node", term52411);
        term53129 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term53130 = newInstance(Class.forName("org.apache.xerces.dom.ElementDefinitionImpl"));
        setField(term53130, term53130.getClass(), "name", null);
        setField(term53130, term53130.getClass(), "attributes", null);
        setField(term53130, term53130.getClass(), "ownerDocument", null);
        setField(term53130, term53130.getClass(), "firstChild", null);
        setField(term53130, term53130.getClass(), "fNodeListCache", null);
        setField(term53130, term53130.getClass(), "previousSibling", null);
        setField(term53130, term53130.getClass(), "nextSibling", null);
        setField(term53130, term53130.getClass(), "ownerNode", null);
        setShortField(term53130, term53130.getClass(), "flags", (short) 0);
        setField(term53129, term53129.getClass(), "node", term53130);
        setField(term53129, term53129.getClass(), "namespaces", null);
        setField(term53129, term53129.getClass(), "defaultNamespace", "");
        setField(term53129, term53129.getClass(), "id", null);
        setIntField(term53129, term53129.getClass(), "index", 0);
        setBooleanField(term53129, term53129.getClass(), "attribute", false);
        setField(term53129, term53129.getClass(), "rootNode", null);
        setField(term53129, term53129.getClass(), "namespaceResolver", null);
        setField(term53129, term53129.getClass(), "parent", null);
        setField(term53129, term53129.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term52319, args);
        assertTrue(recursiveEquals(term52319, term53129));
        assertTrue(recursiveEquals(retValue, null));
    }

};


