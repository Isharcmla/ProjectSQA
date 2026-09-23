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

public class DOMNodePointer_getNamespaceURI_795756451207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49074;
     Object term49274;

    public DOMNodePointer_getNamespaceURI_795756451207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49074 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term49156 = newInstance(Class.forName("org.apache.xerces.dom.PSVIDocumentImpl"));
        setField(term49074, term49074.getClass(), "defaultNamespace", null);
        setField(term49074, term49074.getClass(), "node", term49156);
        term49274 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term49275 = newInstance(Class.forName("org.apache.xerces.dom.PSVIDocumentImpl"));
        setField(term49275, term49275.getClass(), "iterators", null);
        setField(term49275, term49275.getClass(), "ranges", null);
        setField(term49275, term49275.getClass(), "eventListeners", null);
        setBooleanField(term49275, term49275.getClass(), "mutationEvents", false);
        setField(term49275, term49275.getClass(), "savedEnclosingAttr", null);
        setField(term49275, term49275.getClass(), "docType", null);
        setField(term49275, term49275.getClass(), "docElement", null);
        setField(term49275, term49275.getClass(), "fFreeNLCache", null);
        setField(term49275, term49275.getClass(), "encoding", null);
        setField(term49275, term49275.getClass(), "actualEncoding", null);
        setField(term49275, term49275.getClass(), "version", null);
        setBooleanField(term49275, term49275.getClass(), "standalone", false);
        setField(term49275, term49275.getClass(), "fDocumentURI", null);
        setField(term49275, term49275.getClass(), "userData", null);
        setField(term49275, term49275.getClass(), "identifiers", null);
        setField(term49275, term49275.getClass(), "domNormalizer", null);
        setField(term49275, term49275.getClass(), "fConfiguration", null);
        setIntField(term49275, term49275.getClass(), "changes", 0);
        setBooleanField(term49275, term49275.getClass(), "allowGrammarAccess", false);
        setBooleanField(term49275, term49275.getClass(), "errorChecking", false);
        setIntField(term49275, term49275.getClass(), "documentNumber", 0);
        setIntField(term49275, term49275.getClass(), "nodeCounter", 0);
        setField(term49275, term49275.getClass(), "nodeTable", null);
        setField(term49275, term49275.getClass(), "ownerDocument", null);
        setField(term49275, term49275.getClass(), "firstChild", null);
        setField(term49275, term49275.getClass(), "fNodeListCache", null);
        setField(term49275, term49275.getClass(), "previousSibling", null);
        setField(term49275, term49275.getClass(), "nextSibling", null);
        setField(term49275, term49275.getClass(), "ownerNode", null);
        setShortField(term49275, term49275.getClass(), "flags", (short) 0);
        setField(term49274, term49274.getClass(), "node", term49275);
        setField(term49274, term49274.getClass(), "namespaces", null);
        setField(term49274, term49274.getClass(), "defaultNamespace", "");
        setField(term49274, term49274.getClass(), "id", null);
        setField(term49274, term49274.getClass(), "localNamespaceResolver", null);
        setIntField(term49274, term49274.getClass(), "index", 0);
        setBooleanField(term49274, term49274.getClass(), "attribute", false);
        setField(term49274, term49274.getClass(), "namespaceResolver", null);
        setField(term49274, term49274.getClass(), "exceptionHandler", null);
        setField(term49274, term49274.getClass(), "rootNode", null);
        setField(term49274, term49274.getClass(), "parent", null);
        setField(term49274, term49274.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term49074, args);
        assertTrue(recursiveEquals(term49074, term49274));
        assertTrue(recursiveEquals(retValue, null));
    }

};


