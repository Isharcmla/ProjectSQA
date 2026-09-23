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

public class DOMNodePointer_getNamespaceURI_795756451357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121178;
     Object term121448;

    public DOMNodePointer_getNamespaceURI_795756451357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term121178 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term121268 = newInstance(Class.forName("org.apache.xerces.dom.DeferredDocumentImpl"));
        Object term121340 = newInstance(Class.forName("org.apache.xerces.dom.ElementImpl"));
        setField(term121178, term121178.getClass(), "defaultNamespace", null);
        setShortField(term121268, term121268.getClass(), "flags", (short) 0);
        setField(term121268, term121268.getClass(), "docElement", term121340);
        setField(term121178, term121178.getClass(), "node", term121268);
        term121448 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term121449 = newInstance(Class.forName("org.apache.xerces.dom.DeferredDocumentImpl"));
        Object term121450 = newInstance(Class.forName("org.apache.xerces.dom.ElementImpl"));
        setIntField(term121449, term121449.getClass(), "fNodeCount", 0);
        setField(term121449, term121449.getClass(), "fNodeType", null);
        setField(term121449, term121449.getClass(), "fNodeName", null);
        setField(term121449, term121449.getClass(), "fNodeValue", null);
        setField(term121449, term121449.getClass(), "fNodeParent", null);
        setField(term121449, term121449.getClass(), "fNodeLastChild", null);
        setField(term121449, term121449.getClass(), "fNodePrevSib", null);
        setField(term121449, term121449.getClass(), "fNodeURI", null);
        setField(term121449, term121449.getClass(), "fNodeExtra", null);
        setIntField(term121449, term121449.getClass(), "fIdCount", 0);
        setField(term121449, term121449.getClass(), "fIdName", null);
        setField(term121449, term121449.getClass(), "fIdElement", null);
        setBooleanField(term121449, term121449.getClass(), "fNamespacesEnabled", false);
        setField(term121449, term121449.getClass(), "fBufferStr", null);
        setField(term121449, term121449.getClass(), "fStrChunks", null);
        setField(term121449, term121449.getClass(), "iterators", null);
        setField(term121449, term121449.getClass(), "ranges", null);
        setField(term121449, term121449.getClass(), "eventListeners", null);
        setBooleanField(term121449, term121449.getClass(), "mutationEvents", false);
        setField(term121449, term121449.getClass(), "savedEnclosingAttr", null);
        setField(term121449, term121449.getClass(), "docType", null);
        setField(term121450, term121450.getClass(), "name", null);
        setField(term121450, term121450.getClass(), "attributes", null);
        setField(term121450, term121450.getClass(), "ownerDocument", null);
        setField(term121450, term121450.getClass(), "firstChild", null);
        setField(term121450, term121450.getClass(), "fNodeListCache", null);
        setField(term121450, term121450.getClass(), "previousSibling", null);
        setField(term121450, term121450.getClass(), "nextSibling", null);
        setField(term121450, term121450.getClass(), "ownerNode", null);
        setShortField(term121450, term121450.getClass(), "flags", (short) 0);
        setField(term121449, term121449.getClass(), "docElement", term121450);
        setField(term121449, term121449.getClass(), "fFreeNLCache", null);
        setField(term121449, term121449.getClass(), "encoding", null);
        setField(term121449, term121449.getClass(), "actualEncoding", null);
        setField(term121449, term121449.getClass(), "version", null);
        setBooleanField(term121449, term121449.getClass(), "standalone", false);
        setField(term121449, term121449.getClass(), "fDocumentURI", null);
        setField(term121449, term121449.getClass(), "userData", null);
        setField(term121449, term121449.getClass(), "identifiers", null);
        setField(term121449, term121449.getClass(), "domNormalizer", null);
        setField(term121449, term121449.getClass(), "fConfiguration", null);
        setIntField(term121449, term121449.getClass(), "changes", 0);
        setBooleanField(term121449, term121449.getClass(), "allowGrammarAccess", false);
        setBooleanField(term121449, term121449.getClass(), "errorChecking", false);
        setIntField(term121449, term121449.getClass(), "documentNumber", 0);
        setIntField(term121449, term121449.getClass(), "nodeCounter", 0);
        setField(term121449, term121449.getClass(), "nodeTable", null);
        setField(term121449, term121449.getClass(), "ownerDocument", null);
        setField(term121449, term121449.getClass(), "firstChild", null);
        setField(term121449, term121449.getClass(), "fNodeListCache", null);
        setField(term121449, term121449.getClass(), "previousSibling", null);
        setField(term121449, term121449.getClass(), "nextSibling", null);
        setField(term121449, term121449.getClass(), "ownerNode", null);
        setShortField(term121449, term121449.getClass(), "flags", (short) 0);
        setField(term121448, term121448.getClass(), "node", term121449);
        setField(term121448, term121448.getClass(), "namespaces", null);
        setField(term121448, term121448.getClass(), "defaultNamespace", "");
        setField(term121448, term121448.getClass(), "id", null);
        setIntField(term121448, term121448.getClass(), "index", 0);
        setBooleanField(term121448, term121448.getClass(), "attribute", false);
        setField(term121448, term121448.getClass(), "rootNode", null);
        setField(term121448, term121448.getClass(), "namespaceResolver", null);
        setField(term121448, term121448.getClass(), "parent", null);
        setField(term121448, term121448.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term121178, args);
        assertTrue(recursiveEquals(term121178, term121448));
        assertTrue(recursiveEquals(retValue, null));
    }

};


