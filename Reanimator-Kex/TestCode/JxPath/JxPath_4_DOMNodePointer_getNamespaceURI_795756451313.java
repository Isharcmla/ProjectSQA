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

public class DOMNodePointer_getNamespaceURI_795756451313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96758;
     Object term96930;

    public DOMNodePointer_getNamespaceURI_795756451313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96758 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term96848 = newInstance(Class.forName("org.apache.xerces.dom.DeferredDocumentImpl"));
        setField(term96758, term96758.getClass(), "defaultNamespace", null);
        setField(term96758, term96758.getClass(), "node", term96848);
        term96930 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term96931 = newInstance(Class.forName("org.apache.xerces.dom.DeferredDocumentImpl"));
        setIntField(term96931, term96931.getClass(), "fNodeCount", 0);
        setField(term96931, term96931.getClass(), "fNodeType", null);
        setField(term96931, term96931.getClass(), "fNodeName", null);
        setField(term96931, term96931.getClass(), "fNodeValue", null);
        setField(term96931, term96931.getClass(), "fNodeParent", null);
        setField(term96931, term96931.getClass(), "fNodeLastChild", null);
        setField(term96931, term96931.getClass(), "fNodePrevSib", null);
        setField(term96931, term96931.getClass(), "fNodeURI", null);
        setField(term96931, term96931.getClass(), "fNodeExtra", null);
        setIntField(term96931, term96931.getClass(), "fIdCount", 0);
        setField(term96931, term96931.getClass(), "fIdName", null);
        setField(term96931, term96931.getClass(), "fIdElement", null);
        setBooleanField(term96931, term96931.getClass(), "fNamespacesEnabled", false);
        setField(term96931, term96931.getClass(), "fBufferStr", null);
        setField(term96931, term96931.getClass(), "fStrChunks", null);
        setField(term96931, term96931.getClass(), "iterators", null);
        setField(term96931, term96931.getClass(), "ranges", null);
        setField(term96931, term96931.getClass(), "eventListeners", null);
        setBooleanField(term96931, term96931.getClass(), "mutationEvents", false);
        setField(term96931, term96931.getClass(), "savedEnclosingAttr", null);
        setField(term96931, term96931.getClass(), "docType", null);
        setField(term96931, term96931.getClass(), "docElement", null);
        setField(term96931, term96931.getClass(), "fFreeNLCache", null);
        setField(term96931, term96931.getClass(), "encoding", null);
        setField(term96931, term96931.getClass(), "actualEncoding", null);
        setField(term96931, term96931.getClass(), "version", null);
        setBooleanField(term96931, term96931.getClass(), "standalone", false);
        setField(term96931, term96931.getClass(), "fDocumentURI", null);
        setField(term96931, term96931.getClass(), "userData", null);
        setField(term96931, term96931.getClass(), "identifiers", null);
        setField(term96931, term96931.getClass(), "domNormalizer", null);
        setField(term96931, term96931.getClass(), "fConfiguration", null);
        setIntField(term96931, term96931.getClass(), "changes", 0);
        setBooleanField(term96931, term96931.getClass(), "allowGrammarAccess", false);
        setBooleanField(term96931, term96931.getClass(), "errorChecking", false);
        setIntField(term96931, term96931.getClass(), "documentNumber", 0);
        setIntField(term96931, term96931.getClass(), "nodeCounter", 0);
        setField(term96931, term96931.getClass(), "nodeTable", null);
        setField(term96931, term96931.getClass(), "ownerDocument", null);
        setField(term96931, term96931.getClass(), "firstChild", null);
        setField(term96931, term96931.getClass(), "fNodeListCache", null);
        setField(term96931, term96931.getClass(), "previousSibling", null);
        setField(term96931, term96931.getClass(), "nextSibling", null);
        setField(term96931, term96931.getClass(), "ownerNode", null);
        setShortField(term96931, term96931.getClass(), "flags", (short) 0);
        setField(term96930, term96930.getClass(), "node", term96931);
        setField(term96930, term96930.getClass(), "namespaces", null);
        setField(term96930, term96930.getClass(), "defaultNamespace", "");
        setField(term96930, term96930.getClass(), "id", null);
        setIntField(term96930, term96930.getClass(), "index", 0);
        setBooleanField(term96930, term96930.getClass(), "attribute", false);
        setField(term96930, term96930.getClass(), "rootNode", null);
        setField(term96930, term96930.getClass(), "namespaceResolver", null);
        setField(term96930, term96930.getClass(), "parent", null);
        setField(term96930, term96930.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term96758, args);
        assertTrue(recursiveEquals(term96758, term96930));
        assertTrue(recursiveEquals(retValue, null));
    }

};


