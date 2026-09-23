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

public class DOMNodePointer_getNamespaceURI_378658202253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67275;
     Object term67466;

    public DOMNodePointer_getNamespaceURI_378658202253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67275 = newInstance(Class.forName("org.apache.xerces.dom.DeferredDocumentImpl"));
        Object term67347 = newInstance(Class.forName("org.apache.xerces.dom.ElementImpl"));
        setShortField(term67275, term67275.getClass(), "flags", (short) 0);
        setShortField(term67347, term67347.getClass(), "flags", (short) 0);
        setField(term67347, term67347.getClass(), "name", "");
        setField(term67275, term67275.getClass(), "docElement", term67347);
        term67466 = newInstance(Class.forName("org.apache.xerces.dom.DeferredDocumentImpl"));
        Object term67467 = newInstance(Class.forName("org.apache.xerces.dom.ElementImpl"));
        setIntField(term67466, term67466.getClass(), "fNodeCount", 0);
        setField(term67466, term67466.getClass(), "fNodeType", null);
        setField(term67466, term67466.getClass(), "fNodeName", null);
        setField(term67466, term67466.getClass(), "fNodeValue", null);
        setField(term67466, term67466.getClass(), "fNodeParent", null);
        setField(term67466, term67466.getClass(), "fNodeLastChild", null);
        setField(term67466, term67466.getClass(), "fNodePrevSib", null);
        setField(term67466, term67466.getClass(), "fNodeURI", null);
        setField(term67466, term67466.getClass(), "fNodeExtra", null);
        setIntField(term67466, term67466.getClass(), "fIdCount", 0);
        setField(term67466, term67466.getClass(), "fIdName", null);
        setField(term67466, term67466.getClass(), "fIdElement", null);
        setBooleanField(term67466, term67466.getClass(), "fNamespacesEnabled", false);
        setField(term67466, term67466.getClass(), "fBufferStr", null);
        setField(term67466, term67466.getClass(), "fStrChunks", null);
        setField(term67466, term67466.getClass(), "iterators", null);
        setField(term67466, term67466.getClass(), "ranges", null);
        setField(term67466, term67466.getClass(), "eventListeners", null);
        setBooleanField(term67466, term67466.getClass(), "mutationEvents", false);
        setField(term67466, term67466.getClass(), "savedEnclosingAttr", null);
        setField(term67466, term67466.getClass(), "docType", null);
        setField(term67467, term67467.getClass(), "name", "");
        setField(term67467, term67467.getClass(), "attributes", null);
        setField(term67467, term67467.getClass(), "ownerDocument", null);
        setField(term67467, term67467.getClass(), "firstChild", null);
        setField(term67467, term67467.getClass(), "fNodeListCache", null);
        setField(term67467, term67467.getClass(), "previousSibling", null);
        setField(term67467, term67467.getClass(), "nextSibling", null);
        setField(term67467, term67467.getClass(), "ownerNode", null);
        setShortField(term67467, term67467.getClass(), "flags", (short) 0);
        setField(term67466, term67466.getClass(), "docElement", term67467);
        setField(term67466, term67466.getClass(), "fFreeNLCache", null);
        setField(term67466, term67466.getClass(), "encoding", null);
        setField(term67466, term67466.getClass(), "actualEncoding", null);
        setField(term67466, term67466.getClass(), "version", null);
        setBooleanField(term67466, term67466.getClass(), "standalone", false);
        setField(term67466, term67466.getClass(), "fDocumentURI", null);
        setField(term67466, term67466.getClass(), "userData", null);
        setField(term67466, term67466.getClass(), "identifiers", null);
        setField(term67466, term67466.getClass(), "domNormalizer", null);
        setField(term67466, term67466.getClass(), "fConfiguration", null);
        setIntField(term67466, term67466.getClass(), "changes", 0);
        setBooleanField(term67466, term67466.getClass(), "allowGrammarAccess", false);
        setBooleanField(term67466, term67466.getClass(), "errorChecking", false);
        setIntField(term67466, term67466.getClass(), "documentNumber", 0);
        setIntField(term67466, term67466.getClass(), "nodeCounter", 0);
        setField(term67466, term67466.getClass(), "nodeTable", null);
        setField(term67466, term67466.getClass(), "ownerDocument", null);
        setField(term67466, term67466.getClass(), "firstChild", null);
        setField(term67466, term67466.getClass(), "fNodeListCache", null);
        setField(term67466, term67466.getClass(), "previousSibling", null);
        setField(term67466, term67466.getClass(), "nextSibling", null);
        setField(term67466, term67466.getClass(), "ownerNode", null);
        setShortField(term67466, term67466.getClass(), "flags", (short) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.w3c.dom.Node");
        Object[] args = new Object[1];
        args[0] = term67275;
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, null, args);
        assertTrue(recursiveEquals(term67275, term67466));
        assertTrue(recursiveEquals(retValue, null));
    }

};


