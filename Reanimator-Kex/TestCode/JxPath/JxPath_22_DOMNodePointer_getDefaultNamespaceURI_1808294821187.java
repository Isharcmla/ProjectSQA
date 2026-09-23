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

public class DOMNodePointer_getDefaultNamespaceURI_1808294821187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37040;
     Object term37154;

    public DOMNodePointer_getDefaultNamespaceURI_1808294821187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37040 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term37122 = newInstance(Class.forName("org.apache.xerces.dom.PSVIDocumentImpl"));
        setField(term37040, term37040.getClass(), "defaultNamespace", null);
        setField(term37040, term37040.getClass(), "node", term37122);
        term37154 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term37155 = newInstance(Class.forName("org.apache.xerces.dom.PSVIDocumentImpl"));
        setField(term37155, term37155.getClass(), "iterators", null);
        setField(term37155, term37155.getClass(), "ranges", null);
        setField(term37155, term37155.getClass(), "eventListeners", null);
        setBooleanField(term37155, term37155.getClass(), "mutationEvents", false);
        setField(term37155, term37155.getClass(), "savedEnclosingAttr", null);
        setField(term37155, term37155.getClass(), "docType", null);
        setField(term37155, term37155.getClass(), "docElement", null);
        setField(term37155, term37155.getClass(), "fFreeNLCache", null);
        setField(term37155, term37155.getClass(), "encoding", null);
        setField(term37155, term37155.getClass(), "actualEncoding", null);
        setField(term37155, term37155.getClass(), "version", null);
        setBooleanField(term37155, term37155.getClass(), "standalone", false);
        setField(term37155, term37155.getClass(), "fDocumentURI", null);
        setField(term37155, term37155.getClass(), "userData", null);
        setField(term37155, term37155.getClass(), "identifiers", null);
        setField(term37155, term37155.getClass(), "domNormalizer", null);
        setField(term37155, term37155.getClass(), "fConfiguration", null);
        setIntField(term37155, term37155.getClass(), "changes", 0);
        setBooleanField(term37155, term37155.getClass(), "allowGrammarAccess", false);
        setBooleanField(term37155, term37155.getClass(), "errorChecking", false);
        setIntField(term37155, term37155.getClass(), "documentNumber", 0);
        setIntField(term37155, term37155.getClass(), "nodeCounter", 0);
        setField(term37155, term37155.getClass(), "nodeTable", null);
        setField(term37155, term37155.getClass(), "ownerDocument", null);
        setField(term37155, term37155.getClass(), "firstChild", null);
        setField(term37155, term37155.getClass(), "fNodeListCache", null);
        setField(term37155, term37155.getClass(), "previousSibling", null);
        setField(term37155, term37155.getClass(), "nextSibling", null);
        setField(term37155, term37155.getClass(), "ownerNode", null);
        setShortField(term37155, term37155.getClass(), "flags", (short) 0);
        setField(term37154, term37154.getClass(), "node", term37155);
        setField(term37154, term37154.getClass(), "namespaces", null);
        setField(term37154, term37154.getClass(), "defaultNamespace", "");
        setField(term37154, term37154.getClass(), "id", null);
        setField(term37154, term37154.getClass(), "localNamespaceResolver", null);
        setIntField(term37154, term37154.getClass(), "index", 0);
        setBooleanField(term37154, term37154.getClass(), "attribute", false);
        setField(term37154, term37154.getClass(), "namespaceResolver", null);
        setField(term37154, term37154.getClass(), "exceptionHandler", null);
        setField(term37154, term37154.getClass(), "rootNode", null);
        setField(term37154, term37154.getClass(), "parent", null);
        setField(term37154, term37154.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDefaultNamespaceURI", argTypes, term37040, args);
        assertTrue(recursiveEquals(term37040, term37154));
        assertTrue(recursiveEquals(retValue, null));
    }

};


