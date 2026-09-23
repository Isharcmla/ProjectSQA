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
     Object term94499;
     Object term94735;

    public DOMNodePointer_getNamespaceURI_795756451307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94499 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term94589 = newInstance(Class.forName("org.apache.xerces.impl.xs.dom.DocumentImpl"));
        Object term94671 = newInstance(Class.forName("org.apache.html.dom.HTMLMapElementImpl"));
        setField(term94499, term94499.getClass(), "defaultNamespace", null);
        setShortField(term94589, term94589.getClass(), "flags", (short) 0);
        setField(term94589, term94589.getClass(), "docElement", term94671);
        setField(term94499, term94499.getClass(), "node", term94589);
        term94735 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term94736 = newInstance(Class.forName("org.apache.xerces.impl.xs.dom.DocumentImpl"));
        Object term94737 = newInstance(Class.forName("org.apache.html.dom.HTMLMapElementImpl"));
        setField(term94736, term94736.getClass(), "fNodePool", null);
        setField(term94736, term94736.getClass(), "docType", null);
        setField(term94737, term94737.getClass(), "_areas", null);
        setField(term94737, term94737.getClass(), "name", null);
        setField(term94737, term94737.getClass(), "attributes", null);
        setField(term94737, term94737.getClass(), "ownerDocument", null);
        setField(term94737, term94737.getClass(), "firstChild", null);
        setField(term94737, term94737.getClass(), "fNodeListCache", null);
        setField(term94737, term94737.getClass(), "previousSibling", null);
        setField(term94737, term94737.getClass(), "nextSibling", null);
        setField(term94737, term94737.getClass(), "ownerNode", null);
        setShortField(term94737, term94737.getClass(), "flags", (short) 0);
        setField(term94736, term94736.getClass(), "docElement", term94737);
        setField(term94736, term94736.getClass(), "fFreeNLCache", null);
        setField(term94736, term94736.getClass(), "encoding", null);
        setField(term94736, term94736.getClass(), "actualEncoding", null);
        setField(term94736, term94736.getClass(), "version", null);
        setBooleanField(term94736, term94736.getClass(), "standalone", false);
        setField(term94736, term94736.getClass(), "fDocumentURI", null);
        setField(term94736, term94736.getClass(), "userData", null);
        setField(term94736, term94736.getClass(), "identifiers", null);
        setField(term94736, term94736.getClass(), "domNormalizer", null);
        setField(term94736, term94736.getClass(), "fConfiguration", null);
        setIntField(term94736, term94736.getClass(), "changes", 0);
        setBooleanField(term94736, term94736.getClass(), "allowGrammarAccess", false);
        setBooleanField(term94736, term94736.getClass(), "errorChecking", false);
        setIntField(term94736, term94736.getClass(), "documentNumber", 0);
        setIntField(term94736, term94736.getClass(), "nodeCounter", 0);
        setField(term94736, term94736.getClass(), "nodeTable", null);
        setField(term94736, term94736.getClass(), "ownerDocument", null);
        setField(term94736, term94736.getClass(), "firstChild", null);
        setField(term94736, term94736.getClass(), "fNodeListCache", null);
        setField(term94736, term94736.getClass(), "previousSibling", null);
        setField(term94736, term94736.getClass(), "nextSibling", null);
        setField(term94736, term94736.getClass(), "ownerNode", null);
        setShortField(term94736, term94736.getClass(), "flags", (short) 0);
        setField(term94735, term94735.getClass(), "node", term94736);
        setField(term94735, term94735.getClass(), "namespaces", null);
        setField(term94735, term94735.getClass(), "defaultNamespace", "");
        setField(term94735, term94735.getClass(), "id", null);
        setIntField(term94735, term94735.getClass(), "index", 0);
        setBooleanField(term94735, term94735.getClass(), "attribute", false);
        setField(term94735, term94735.getClass(), "rootNode", null);
        setField(term94735, term94735.getClass(), "namespaceResolver", null);
        setField(term94735, term94735.getClass(), "parent", null);
        setField(term94735, term94735.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term94499, args);
        assertTrue(recursiveEquals(term94499, term94735));
        assertTrue(recursiveEquals(retValue, null));
    }

};


