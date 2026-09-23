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

public class DOMNodePointer_getPointerByID_2127216393211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49828;
     Object term50064;
     Object term50060;

    public DOMNodePointer_getPointerByID_2127216393211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49828 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term49920 = newInstance(Class.forName("org.apache.xerces.dom.DeferredElementNSImpl"));
        Object term50002 = newInstance(Class.forName("org.apache.xerces.dom.CoreDocumentImpl"));
        setField(term49920, term49920.getClass(), "ownerDocument", term50002);
        setField(term49828, term49828.getClass(), "node", term49920);
        term50064 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term50065 = newInstance(Class.forName("org.apache.xerces.dom.DeferredElementNSImpl"));
        Object term50066 = newInstance(Class.forName("org.apache.xerces.dom.CoreDocumentImpl"));
        setIntField(term50065, term50065.getClass(), "fNodeIndex", 0);
        setField(term50065, term50065.getClass(), "namespaceURI", null);
        setField(term50065, term50065.getClass(), "localName", null);
        setField(term50065, term50065.getClass(), "type", null);
        setField(term50065, term50065.getClass(), "name", null);
        setField(term50065, term50065.getClass(), "attributes", null);
        setField(term50066, term50066.getClass(), "docType", null);
        setField(term50066, term50066.getClass(), "docElement", null);
        setField(term50066, term50066.getClass(), "fFreeNLCache", null);
        setField(term50066, term50066.getClass(), "encoding", null);
        setField(term50066, term50066.getClass(), "actualEncoding", null);
        setField(term50066, term50066.getClass(), "version", null);
        setBooleanField(term50066, term50066.getClass(), "standalone", false);
        setField(term50066, term50066.getClass(), "fDocumentURI", null);
        setField(term50066, term50066.getClass(), "userData", null);
        setField(term50066, term50066.getClass(), "identifiers", null);
        setField(term50066, term50066.getClass(), "domNormalizer", null);
        setField(term50066, term50066.getClass(), "fConfiguration", null);
        setIntField(term50066, term50066.getClass(), "changes", 0);
        setBooleanField(term50066, term50066.getClass(), "allowGrammarAccess", false);
        setBooleanField(term50066, term50066.getClass(), "errorChecking", false);
        setIntField(term50066, term50066.getClass(), "documentNumber", 0);
        setIntField(term50066, term50066.getClass(), "nodeCounter", 0);
        setField(term50066, term50066.getClass(), "nodeTable", null);
        setField(term50066, term50066.getClass(), "ownerDocument", null);
        setField(term50066, term50066.getClass(), "firstChild", null);
        setField(term50066, term50066.getClass(), "fNodeListCache", null);
        setField(term50066, term50066.getClass(), "previousSibling", null);
        setField(term50066, term50066.getClass(), "nextSibling", null);
        setField(term50066, term50066.getClass(), "ownerNode", null);
        setShortField(term50066, term50066.getClass(), "flags", (short) 0);
        setField(term50065, term50065.getClass(), "ownerDocument", term50066);
        setField(term50065, term50065.getClass(), "firstChild", null);
        setField(term50065, term50065.getClass(), "fNodeListCache", null);
        setField(term50065, term50065.getClass(), "previousSibling", null);
        setField(term50065, term50065.getClass(), "nextSibling", null);
        setField(term50065, term50065.getClass(), "ownerNode", null);
        setShortField(term50065, term50065.getClass(), "flags", (short) 0);
        setField(term50064, term50064.getClass(), "node", term50065);
        setField(term50064, term50064.getClass(), "namespaces", null);
        setField(term50064, term50064.getClass(), "defaultNamespace", null);
        setField(term50064, term50064.getClass(), "id", null);
        setField(term50064, term50064.getClass(), "localNamespaceResolver", null);
        setIntField(term50064, term50064.getClass(), "index", 0);
        setBooleanField(term50064, term50064.getClass(), "attribute", false);
        setField(term50064, term50064.getClass(), "namespaceResolver", null);
        setField(term50064, term50064.getClass(), "exceptionHandler", null);
        setField(term50064, term50064.getClass(), "rootNode", null);
        setField(term50064, term50064.getClass(), "parent", null);
        setField(term50064, term50064.getClass(), "locale", null);
        term50060 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
        Object term50061 = newInstance(Class.forName("java.lang.Object"));
        setField(term50060, term50060.getClass(), "name", null);
        setField(term50060, term50060.getClass(), "id", null);
        setField(term50060, term50060.getClass(), "value", term50061);
        setIntField(term50060, term50060.getClass(), "index", -2147483648);
        setBooleanField(term50060, term50060.getClass(), "attribute", false);
        setField(term50060, term50060.getClass(), "namespaceResolver", null);
        setField(term50060, term50060.getClass(), "exceptionHandler", null);
        setField(term50060, term50060.getClass(), "rootNode", null);
        setField(term50060, term50060.getClass(), "parent", null);
        setField(term50060, term50060.getClass(), "locale", null);
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
        Object retValue = callMethod(klass, "getPointerByID", argTypes, term49828, args);
        assertTrue(recursiveEquals(term49828, term50064));
        assertTrue(recursiveEquals(retValue, term50060));
    }

};


