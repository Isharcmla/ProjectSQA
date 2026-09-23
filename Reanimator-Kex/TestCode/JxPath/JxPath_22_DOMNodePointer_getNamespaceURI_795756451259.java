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

public class DOMNodePointer_getNamespaceURI_795756451259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63725;
     Object term63868;

    public DOMNodePointer_getNamespaceURI_795756451259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63725 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term63815 = newInstance(Class.forName("org.apache.xerces.dom.DeferredDocumentImpl"));
        setField(term63725, term63725.getClass(), "defaultNamespace", null);
        setField(term63725, term63725.getClass(), "node", term63815);
        term63868 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term63869 = newInstance(Class.forName("org.apache.xerces.dom.DeferredDocumentImpl"));
        setIntField(term63869, term63869.getClass(), "fNodeCount", 0);
        setField(term63869, term63869.getClass(), "fNodeType", null);
        setField(term63869, term63869.getClass(), "fNodeName", null);
        setField(term63869, term63869.getClass(), "fNodeValue", null);
        setField(term63869, term63869.getClass(), "fNodeParent", null);
        setField(term63869, term63869.getClass(), "fNodeLastChild", null);
        setField(term63869, term63869.getClass(), "fNodePrevSib", null);
        setField(term63869, term63869.getClass(), "fNodeURI", null);
        setField(term63869, term63869.getClass(), "fNodeExtra", null);
        setIntField(term63869, term63869.getClass(), "fIdCount", 0);
        setField(term63869, term63869.getClass(), "fIdName", null);
        setField(term63869, term63869.getClass(), "fIdElement", null);
        setBooleanField(term63869, term63869.getClass(), "fNamespacesEnabled", false);
        setField(term63869, term63869.getClass(), "fBufferStr", null);
        setField(term63869, term63869.getClass(), "fStrChunks", null);
        setField(term63869, term63869.getClass(), "iterators", null);
        setField(term63869, term63869.getClass(), "ranges", null);
        setField(term63869, term63869.getClass(), "eventListeners", null);
        setBooleanField(term63869, term63869.getClass(), "mutationEvents", false);
        setField(term63869, term63869.getClass(), "savedEnclosingAttr", null);
        setField(term63869, term63869.getClass(), "docType", null);
        setField(term63869, term63869.getClass(), "docElement", null);
        setField(term63869, term63869.getClass(), "fFreeNLCache", null);
        setField(term63869, term63869.getClass(), "encoding", null);
        setField(term63869, term63869.getClass(), "actualEncoding", null);
        setField(term63869, term63869.getClass(), "version", null);
        setBooleanField(term63869, term63869.getClass(), "standalone", false);
        setField(term63869, term63869.getClass(), "fDocumentURI", null);
        setField(term63869, term63869.getClass(), "userData", null);
        setField(term63869, term63869.getClass(), "identifiers", null);
        setField(term63869, term63869.getClass(), "domNormalizer", null);
        setField(term63869, term63869.getClass(), "fConfiguration", null);
        setIntField(term63869, term63869.getClass(), "changes", 0);
        setBooleanField(term63869, term63869.getClass(), "allowGrammarAccess", false);
        setBooleanField(term63869, term63869.getClass(), "errorChecking", false);
        setIntField(term63869, term63869.getClass(), "documentNumber", 0);
        setIntField(term63869, term63869.getClass(), "nodeCounter", 0);
        setField(term63869, term63869.getClass(), "nodeTable", null);
        setField(term63869, term63869.getClass(), "ownerDocument", null);
        setField(term63869, term63869.getClass(), "firstChild", null);
        setField(term63869, term63869.getClass(), "fNodeListCache", null);
        setField(term63869, term63869.getClass(), "previousSibling", null);
        setField(term63869, term63869.getClass(), "nextSibling", null);
        setField(term63869, term63869.getClass(), "ownerNode", null);
        setShortField(term63869, term63869.getClass(), "flags", (short) 0);
        setField(term63868, term63868.getClass(), "node", term63869);
        setField(term63868, term63868.getClass(), "namespaces", null);
        setField(term63868, term63868.getClass(), "defaultNamespace", "");
        setField(term63868, term63868.getClass(), "id", null);
        setField(term63868, term63868.getClass(), "localNamespaceResolver", null);
        setIntField(term63868, term63868.getClass(), "index", 0);
        setBooleanField(term63868, term63868.getClass(), "attribute", false);
        setField(term63868, term63868.getClass(), "namespaceResolver", null);
        setField(term63868, term63868.getClass(), "exceptionHandler", null);
        setField(term63868, term63868.getClass(), "rootNode", null);
        setField(term63868, term63868.getClass(), "parent", null);
        setField(term63868, term63868.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term63725, args);
        assertTrue(recursiveEquals(term63725, term63868));
        assertTrue(recursiveEquals(retValue, null));
    }

};


