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

public class DOMNodePointer_getNamespaceURI_795756451305 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93882;
     Object term94040;

    public DOMNodePointer_getNamespaceURI_795756451305() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93882 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term93964 = newInstance(Class.forName("org.apache.xerces.dom.PSVIDocumentImpl"));
        setField(term93882, term93882.getClass(), "defaultNamespace", null);
        setField(term93882, term93882.getClass(), "node", term93964);
        term94040 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term94041 = newInstance(Class.forName("org.apache.xerces.dom.PSVIDocumentImpl"));
        setField(term94041, term94041.getClass(), "iterators", null);
        setField(term94041, term94041.getClass(), "ranges", null);
        setField(term94041, term94041.getClass(), "eventListeners", null);
        setBooleanField(term94041, term94041.getClass(), "mutationEvents", false);
        setField(term94041, term94041.getClass(), "savedEnclosingAttr", null);
        setField(term94041, term94041.getClass(), "docType", null);
        setField(term94041, term94041.getClass(), "docElement", null);
        setField(term94041, term94041.getClass(), "fFreeNLCache", null);
        setField(term94041, term94041.getClass(), "encoding", null);
        setField(term94041, term94041.getClass(), "actualEncoding", null);
        setField(term94041, term94041.getClass(), "version", null);
        setBooleanField(term94041, term94041.getClass(), "standalone", false);
        setField(term94041, term94041.getClass(), "fDocumentURI", null);
        setField(term94041, term94041.getClass(), "userData", null);
        setField(term94041, term94041.getClass(), "identifiers", null);
        setField(term94041, term94041.getClass(), "domNormalizer", null);
        setField(term94041, term94041.getClass(), "fConfiguration", null);
        setIntField(term94041, term94041.getClass(), "changes", 0);
        setBooleanField(term94041, term94041.getClass(), "allowGrammarAccess", false);
        setBooleanField(term94041, term94041.getClass(), "errorChecking", false);
        setIntField(term94041, term94041.getClass(), "documentNumber", 0);
        setIntField(term94041, term94041.getClass(), "nodeCounter", 0);
        setField(term94041, term94041.getClass(), "nodeTable", null);
        setField(term94041, term94041.getClass(), "ownerDocument", null);
        setField(term94041, term94041.getClass(), "firstChild", null);
        setField(term94041, term94041.getClass(), "fNodeListCache", null);
        setField(term94041, term94041.getClass(), "previousSibling", null);
        setField(term94041, term94041.getClass(), "nextSibling", null);
        setField(term94041, term94041.getClass(), "ownerNode", null);
        setShortField(term94041, term94041.getClass(), "flags", (short) 0);
        setField(term94040, term94040.getClass(), "node", term94041);
        setField(term94040, term94040.getClass(), "namespaces", null);
        setField(term94040, term94040.getClass(), "defaultNamespace", "");
        setField(term94040, term94040.getClass(), "id", null);
        setIntField(term94040, term94040.getClass(), "index", 0);
        setBooleanField(term94040, term94040.getClass(), "attribute", false);
        setField(term94040, term94040.getClass(), "rootNode", null);
        setField(term94040, term94040.getClass(), "namespaceResolver", null);
        setField(term94040, term94040.getClass(), "parent", null);
        setField(term94040, term94040.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term93882, args);
        assertTrue(recursiveEquals(term93882, term94040));
        assertTrue(recursiveEquals(retValue, null));
    }

};


