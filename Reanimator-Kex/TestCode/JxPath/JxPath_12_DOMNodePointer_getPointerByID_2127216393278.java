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

public class DOMNodePointer_getPointerByID_2127216393278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77431;
     Object term78946;
     Object term78942;

    public DOMNodePointer_getPointerByID_2127216393278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77431 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term77535 = newInstance(Class.forName("org.apache.xerces.dom.DeferredEntityReferenceImpl"));
        Object term77617 = newInstance(Class.forName("org.apache.xerces.dom.CoreDocumentImpl"));
        setField(term77535, term77535.getClass(), "ownerDocument", term77617);
        setField(term77431, term77431.getClass(), "node", term77535);
        term78946 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term78947 = newInstance(Class.forName("org.apache.xerces.dom.DeferredEntityReferenceImpl"));
        Object term78948 = newInstance(Class.forName("org.apache.xerces.dom.CoreDocumentImpl"));
        setIntField(term78947, term78947.getClass(), "fNodeIndex", 0);
        setField(term78947, term78947.getClass(), "name", null);
        setField(term78947, term78947.getClass(), "baseURI", null);
        setField(term78948, term78948.getClass(), "docType", null);
        setField(term78948, term78948.getClass(), "docElement", null);
        setField(term78948, term78948.getClass(), "fFreeNLCache", null);
        setField(term78948, term78948.getClass(), "encoding", null);
        setField(term78948, term78948.getClass(), "actualEncoding", null);
        setField(term78948, term78948.getClass(), "version", null);
        setBooleanField(term78948, term78948.getClass(), "standalone", false);
        setField(term78948, term78948.getClass(), "fDocumentURI", null);
        setField(term78948, term78948.getClass(), "userData", null);
        setField(term78948, term78948.getClass(), "identifiers", null);
        setField(term78948, term78948.getClass(), "domNormalizer", null);
        setField(term78948, term78948.getClass(), "fConfiguration", null);
        setIntField(term78948, term78948.getClass(), "changes", 0);
        setBooleanField(term78948, term78948.getClass(), "allowGrammarAccess", false);
        setBooleanField(term78948, term78948.getClass(), "errorChecking", false);
        setIntField(term78948, term78948.getClass(), "documentNumber", 0);
        setIntField(term78948, term78948.getClass(), "nodeCounter", 0);
        setField(term78948, term78948.getClass(), "nodeTable", null);
        setField(term78948, term78948.getClass(), "ownerDocument", null);
        setField(term78948, term78948.getClass(), "firstChild", null);
        setField(term78948, term78948.getClass(), "fNodeListCache", null);
        setField(term78948, term78948.getClass(), "previousSibling", null);
        setField(term78948, term78948.getClass(), "nextSibling", null);
        setField(term78948, term78948.getClass(), "ownerNode", null);
        setShortField(term78948, term78948.getClass(), "flags", (short) 0);
        setField(term78947, term78947.getClass(), "ownerDocument", term78948);
        setField(term78947, term78947.getClass(), "firstChild", null);
        setField(term78947, term78947.getClass(), "fNodeListCache", null);
        setField(term78947, term78947.getClass(), "previousSibling", null);
        setField(term78947, term78947.getClass(), "nextSibling", null);
        setField(term78947, term78947.getClass(), "ownerNode", null);
        setShortField(term78947, term78947.getClass(), "flags", (short) 0);
        setField(term78946, term78946.getClass(), "node", term78947);
        setField(term78946, term78946.getClass(), "namespaces", null);
        setField(term78946, term78946.getClass(), "defaultNamespace", null);
        setField(term78946, term78946.getClass(), "id", null);
        setIntField(term78946, term78946.getClass(), "index", 0);
        setBooleanField(term78946, term78946.getClass(), "attribute", false);
        setField(term78946, term78946.getClass(), "rootNode", null);
        setField(term78946, term78946.getClass(), "namespaceResolver", null);
        setField(term78946, term78946.getClass(), "parent", null);
        setField(term78946, term78946.getClass(), "locale", null);
        term78942 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
        Object term78943 = newInstance(Class.forName("java.lang.Object"));
        setField(term78942, term78942.getClass(), "name", null);
        setField(term78942, term78942.getClass(), "id", null);
        setField(term78942, term78942.getClass(), "value", term78943);
        setIntField(term78942, term78942.getClass(), "index", -2147483648);
        setBooleanField(term78942, term78942.getClass(), "attribute", false);
        setField(term78942, term78942.getClass(), "rootNode", null);
        setField(term78942, term78942.getClass(), "namespaceResolver", null);
        setField(term78942, term78942.getClass(), "parent", null);
        setField(term78942, term78942.getClass(), "locale", null);
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
        Object retValue = callMethod(klass, "getPointerByID", argTypes, term77431, args);
        assertTrue(recursiveEquals(term77431, term78946));
        assertTrue(recursiveEquals(retValue, term78942));
    }

};


