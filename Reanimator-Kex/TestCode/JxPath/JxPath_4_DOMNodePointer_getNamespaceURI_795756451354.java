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

public class DOMNodePointer_getNamespaceURI_795756451354 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119099;
     Object term120746;

    public DOMNodePointer_getNamespaceURI_795756451354() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119099 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term119181 = newInstance(Class.forName("org.apache.xerces.dom.PSVIDocumentImpl"));
        Object term119253 = newInstance(Class.forName("org.apache.xerces.dom.ElementImpl"));
        setField(term119099, term119099.getClass(), "defaultNamespace", null);
        setShortField(term119181, term119181.getClass(), "flags", (short) 0);
        setField(term119181, term119181.getClass(), "docElement", term119253);
        setField(term119099, term119099.getClass(), "node", term119181);
        term120746 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term120747 = newInstance(Class.forName("org.apache.xerces.dom.PSVIDocumentImpl"));
        Object term120748 = newInstance(Class.forName("org.apache.xerces.dom.ElementImpl"));
        setField(term120747, term120747.getClass(), "iterators", null);
        setField(term120747, term120747.getClass(), "ranges", null);
        setField(term120747, term120747.getClass(), "eventListeners", null);
        setBooleanField(term120747, term120747.getClass(), "mutationEvents", false);
        setField(term120747, term120747.getClass(), "savedEnclosingAttr", null);
        setField(term120747, term120747.getClass(), "docType", null);
        setField(term120748, term120748.getClass(), "name", null);
        setField(term120748, term120748.getClass(), "attributes", null);
        setField(term120748, term120748.getClass(), "ownerDocument", null);
        setField(term120748, term120748.getClass(), "firstChild", null);
        setField(term120748, term120748.getClass(), "fNodeListCache", null);
        setField(term120748, term120748.getClass(), "previousSibling", null);
        setField(term120748, term120748.getClass(), "nextSibling", null);
        setField(term120748, term120748.getClass(), "ownerNode", null);
        setShortField(term120748, term120748.getClass(), "flags", (short) 0);
        setField(term120747, term120747.getClass(), "docElement", term120748);
        setField(term120747, term120747.getClass(), "fFreeNLCache", null);
        setField(term120747, term120747.getClass(), "encoding", null);
        setField(term120747, term120747.getClass(), "actualEncoding", null);
        setField(term120747, term120747.getClass(), "version", null);
        setBooleanField(term120747, term120747.getClass(), "standalone", false);
        setField(term120747, term120747.getClass(), "fDocumentURI", null);
        setField(term120747, term120747.getClass(), "userData", null);
        setField(term120747, term120747.getClass(), "identifiers", null);
        setField(term120747, term120747.getClass(), "domNormalizer", null);
        setField(term120747, term120747.getClass(), "fConfiguration", null);
        setIntField(term120747, term120747.getClass(), "changes", 0);
        setBooleanField(term120747, term120747.getClass(), "allowGrammarAccess", false);
        setBooleanField(term120747, term120747.getClass(), "errorChecking", false);
        setIntField(term120747, term120747.getClass(), "documentNumber", 0);
        setIntField(term120747, term120747.getClass(), "nodeCounter", 0);
        setField(term120747, term120747.getClass(), "nodeTable", null);
        setField(term120747, term120747.getClass(), "ownerDocument", null);
        setField(term120747, term120747.getClass(), "firstChild", null);
        setField(term120747, term120747.getClass(), "fNodeListCache", null);
        setField(term120747, term120747.getClass(), "previousSibling", null);
        setField(term120747, term120747.getClass(), "nextSibling", null);
        setField(term120747, term120747.getClass(), "ownerNode", null);
        setShortField(term120747, term120747.getClass(), "flags", (short) 0);
        setField(term120746, term120746.getClass(), "node", term120747);
        setField(term120746, term120746.getClass(), "namespaces", null);
        setField(term120746, term120746.getClass(), "defaultNamespace", "");
        setField(term120746, term120746.getClass(), "id", null);
        setIntField(term120746, term120746.getClass(), "index", 0);
        setBooleanField(term120746, term120746.getClass(), "attribute", false);
        setField(term120746, term120746.getClass(), "rootNode", null);
        setField(term120746, term120746.getClass(), "namespaceResolver", null);
        setField(term120746, term120746.getClass(), "parent", null);
        setField(term120746, term120746.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term119099, args);
        assertTrue(recursiveEquals(term119099, term120746));
        assertTrue(recursiveEquals(retValue, null));
    }

};


