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

public class DOMNodePointer_getNamespaceURI_795756451273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80725;
     Object term80895;

    public DOMNodePointer_getNamespaceURI_795756451273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80725 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term80815 = newInstance(Class.forName("org.apache.xerces.dom.DeferredDocumentImpl"));
        setField(term80725, term80725.getClass(), "defaultNamespace", null);
        setField(term80725, term80725.getClass(), "node", term80815);
        term80895 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term80896 = newInstance(Class.forName("org.apache.xerces.dom.DeferredDocumentImpl"));
        setIntField(term80896, term80896.getClass(), "fNodeCount", 0);
        setField(term80896, term80896.getClass(), "fNodeType", null);
        setField(term80896, term80896.getClass(), "fNodeName", null);
        setField(term80896, term80896.getClass(), "fNodeValue", null);
        setField(term80896, term80896.getClass(), "fNodeParent", null);
        setField(term80896, term80896.getClass(), "fNodeLastChild", null);
        setField(term80896, term80896.getClass(), "fNodePrevSib", null);
        setField(term80896, term80896.getClass(), "fNodeURI", null);
        setField(term80896, term80896.getClass(), "fNodeExtra", null);
        setIntField(term80896, term80896.getClass(), "fIdCount", 0);
        setField(term80896, term80896.getClass(), "fIdName", null);
        setField(term80896, term80896.getClass(), "fIdElement", null);
        setBooleanField(term80896, term80896.getClass(), "fNamespacesEnabled", false);
        setField(term80896, term80896.getClass(), "fBufferStr", null);
        setField(term80896, term80896.getClass(), "fStrChunks", null);
        setField(term80896, term80896.getClass(), "iterators", null);
        setField(term80896, term80896.getClass(), "ranges", null);
        setField(term80896, term80896.getClass(), "eventListeners", null);
        setBooleanField(term80896, term80896.getClass(), "mutationEvents", false);
        setField(term80896, term80896.getClass(), "savedEnclosingAttr", null);
        setField(term80896, term80896.getClass(), "docType", null);
        setField(term80896, term80896.getClass(), "docElement", null);
        setField(term80896, term80896.getClass(), "fFreeNLCache", null);
        setField(term80896, term80896.getClass(), "encoding", null);
        setField(term80896, term80896.getClass(), "actualEncoding", null);
        setField(term80896, term80896.getClass(), "version", null);
        setBooleanField(term80896, term80896.getClass(), "standalone", false);
        setField(term80896, term80896.getClass(), "fDocumentURI", null);
        setField(term80896, term80896.getClass(), "userData", null);
        setField(term80896, term80896.getClass(), "identifiers", null);
        setField(term80896, term80896.getClass(), "domNormalizer", null);
        setField(term80896, term80896.getClass(), "fConfiguration", null);
        setIntField(term80896, term80896.getClass(), "changes", 0);
        setBooleanField(term80896, term80896.getClass(), "allowGrammarAccess", false);
        setBooleanField(term80896, term80896.getClass(), "errorChecking", false);
        setIntField(term80896, term80896.getClass(), "documentNumber", 0);
        setIntField(term80896, term80896.getClass(), "nodeCounter", 0);
        setField(term80896, term80896.getClass(), "nodeTable", null);
        setField(term80896, term80896.getClass(), "ownerDocument", null);
        setField(term80896, term80896.getClass(), "firstChild", null);
        setField(term80896, term80896.getClass(), "fNodeListCache", null);
        setField(term80896, term80896.getClass(), "previousSibling", null);
        setField(term80896, term80896.getClass(), "nextSibling", null);
        setField(term80896, term80896.getClass(), "ownerNode", null);
        setShortField(term80896, term80896.getClass(), "flags", (short) 0);
        setField(term80895, term80895.getClass(), "node", term80896);
        setField(term80895, term80895.getClass(), "namespaces", null);
        setField(term80895, term80895.getClass(), "defaultNamespace", "");
        setField(term80895, term80895.getClass(), "id", null);
        setIntField(term80895, term80895.getClass(), "index", 0);
        setBooleanField(term80895, term80895.getClass(), "attribute", false);
        setField(term80895, term80895.getClass(), "rootNode", null);
        setField(term80895, term80895.getClass(), "namespaceResolver", null);
        setField(term80895, term80895.getClass(), "parent", null);
        setField(term80895, term80895.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term80725, args);
        assertTrue(recursiveEquals(term80725, term80895));
        assertTrue(recursiveEquals(retValue, null));
    }

};


