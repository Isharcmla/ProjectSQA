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

public class DOMNodePointer_getPointerByID_2127216393313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96052;
     Object term96326;
     Object term96322;

    public DOMNodePointer_getPointerByID_2127216393313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96052 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term96156 = newInstance(Class.forName("org.apache.xerces.dom.DeferredEntityReferenceImpl"));
        Object term96246 = newInstance(Class.forName("org.apache.xerces.dom.DeferredDocumentImpl"));
        setField(term96156, term96156.getClass(), "ownerDocument", term96246);
        setField(term96052, term96052.getClass(), "node", term96156);
        term96326 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term96327 = newInstance(Class.forName("org.apache.xerces.dom.DeferredEntityReferenceImpl"));
        Object term96328 = newInstance(Class.forName("org.apache.xerces.dom.DeferredDocumentImpl"));
        setIntField(term96327, term96327.getClass(), "fNodeIndex", 0);
        setField(term96327, term96327.getClass(), "name", null);
        setField(term96327, term96327.getClass(), "baseURI", null);
        setIntField(term96328, term96328.getClass(), "fNodeCount", 0);
        setField(term96328, term96328.getClass(), "fNodeType", null);
        setField(term96328, term96328.getClass(), "fNodeName", null);
        setField(term96328, term96328.getClass(), "fNodeValue", null);
        setField(term96328, term96328.getClass(), "fNodeParent", null);
        setField(term96328, term96328.getClass(), "fNodeLastChild", null);
        setField(term96328, term96328.getClass(), "fNodePrevSib", null);
        setField(term96328, term96328.getClass(), "fNodeURI", null);
        setField(term96328, term96328.getClass(), "fNodeExtra", null);
        setIntField(term96328, term96328.getClass(), "fIdCount", 0);
        setField(term96328, term96328.getClass(), "fIdName", null);
        setField(term96328, term96328.getClass(), "fIdElement", null);
        setBooleanField(term96328, term96328.getClass(), "fNamespacesEnabled", false);
        setField(term96328, term96328.getClass(), "fBufferStr", null);
        setField(term96328, term96328.getClass(), "fStrChunks", null);
        setField(term96328, term96328.getClass(), "iterators", null);
        setField(term96328, term96328.getClass(), "ranges", null);
        setField(term96328, term96328.getClass(), "eventListeners", null);
        setBooleanField(term96328, term96328.getClass(), "mutationEvents", false);
        setField(term96328, term96328.getClass(), "savedEnclosingAttr", null);
        setField(term96328, term96328.getClass(), "docType", null);
        setField(term96328, term96328.getClass(), "docElement", null);
        setField(term96328, term96328.getClass(), "fFreeNLCache", null);
        setField(term96328, term96328.getClass(), "encoding", null);
        setField(term96328, term96328.getClass(), "actualEncoding", null);
        setField(term96328, term96328.getClass(), "version", null);
        setBooleanField(term96328, term96328.getClass(), "standalone", false);
        setField(term96328, term96328.getClass(), "fDocumentURI", null);
        setField(term96328, term96328.getClass(), "userData", null);
        setField(term96328, term96328.getClass(), "identifiers", null);
        setField(term96328, term96328.getClass(), "domNormalizer", null);
        setField(term96328, term96328.getClass(), "fConfiguration", null);
        setIntField(term96328, term96328.getClass(), "changes", 0);
        setBooleanField(term96328, term96328.getClass(), "allowGrammarAccess", false);
        setBooleanField(term96328, term96328.getClass(), "errorChecking", false);
        setIntField(term96328, term96328.getClass(), "documentNumber", 0);
        setIntField(term96328, term96328.getClass(), "nodeCounter", 0);
        setField(term96328, term96328.getClass(), "nodeTable", null);
        setField(term96328, term96328.getClass(), "ownerDocument", null);
        setField(term96328, term96328.getClass(), "firstChild", null);
        setField(term96328, term96328.getClass(), "fNodeListCache", null);
        setField(term96328, term96328.getClass(), "previousSibling", null);
        setField(term96328, term96328.getClass(), "nextSibling", null);
        setField(term96328, term96328.getClass(), "ownerNode", null);
        setShortField(term96328, term96328.getClass(), "flags", (short) 0);
        setField(term96327, term96327.getClass(), "ownerDocument", term96328);
        setField(term96327, term96327.getClass(), "firstChild", null);
        setField(term96327, term96327.getClass(), "fNodeListCache", null);
        setField(term96327, term96327.getClass(), "previousSibling", null);
        setField(term96327, term96327.getClass(), "nextSibling", null);
        setField(term96327, term96327.getClass(), "ownerNode", null);
        setShortField(term96327, term96327.getClass(), "flags", (short) 0);
        setField(term96326, term96326.getClass(), "node", term96327);
        setField(term96326, term96326.getClass(), "namespaces", null);
        setField(term96326, term96326.getClass(), "defaultNamespace", null);
        setField(term96326, term96326.getClass(), "id", null);
        setIntField(term96326, term96326.getClass(), "index", 0);
        setBooleanField(term96326, term96326.getClass(), "attribute", false);
        setField(term96326, term96326.getClass(), "rootNode", null);
        setField(term96326, term96326.getClass(), "namespaceResolver", null);
        setField(term96326, term96326.getClass(), "parent", null);
        setField(term96326, term96326.getClass(), "locale", null);
        term96322 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
        Object term96323 = newInstance(Class.forName("java.lang.Object"));
        setField(term96322, term96322.getClass(), "name", null);
        setField(term96322, term96322.getClass(), "id", null);
        setField(term96322, term96322.getClass(), "value", term96323);
        setIntField(term96322, term96322.getClass(), "index", -2147483648);
        setBooleanField(term96322, term96322.getClass(), "attribute", false);
        setField(term96322, term96322.getClass(), "rootNode", null);
        setField(term96322, term96322.getClass(), "namespaceResolver", null);
        setField(term96322, term96322.getClass(), "parent", null);
        setField(term96322, term96322.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.JXPathContext");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object retValue = callMethod(klass, "getPointerByID", argTypes, term96052, args);
        assertTrue(recursiveEquals(term96052, term96326));
        assertTrue(recursiveEquals(retValue, term96322));
    }

};


