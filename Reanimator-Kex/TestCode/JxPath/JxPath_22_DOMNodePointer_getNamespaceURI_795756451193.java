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
import java.util.HashMap;

public class DOMNodePointer_getNamespaceURI_795756451193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41602;
     Object term42815;

    public DOMNodePointer_getNamespaceURI_795756451193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41602 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term41692 = newInstance(Class.forName("org.apache.xerces.impl.xs.dom.DocumentImpl"));
        setField(term41602, term41602.getClass(), "namespaces", null);
        setField(term41602, term41602.getClass(), "node", term41692);
        HashMap term42817 = new HashMap();
        term42815 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term42816 = newInstance(Class.forName("org.apache.xerces.impl.xs.dom.DocumentImpl"));
        setField(term42816, term42816.getClass(), "fNodePool", null);
        setField(term42816, term42816.getClass(), "docType", null);
        setField(term42816, term42816.getClass(), "docElement", null);
        setField(term42816, term42816.getClass(), "fFreeNLCache", null);
        setField(term42816, term42816.getClass(), "encoding", null);
        setField(term42816, term42816.getClass(), "actualEncoding", null);
        setField(term42816, term42816.getClass(), "version", null);
        setBooleanField(term42816, term42816.getClass(), "standalone", false);
        setField(term42816, term42816.getClass(), "fDocumentURI", null);
        setField(term42816, term42816.getClass(), "userData", null);
        setField(term42816, term42816.getClass(), "identifiers", null);
        setField(term42816, term42816.getClass(), "domNormalizer", null);
        setField(term42816, term42816.getClass(), "fConfiguration", null);
        setIntField(term42816, term42816.getClass(), "changes", 0);
        setBooleanField(term42816, term42816.getClass(), "allowGrammarAccess", false);
        setBooleanField(term42816, term42816.getClass(), "errorChecking", false);
        setIntField(term42816, term42816.getClass(), "documentNumber", 0);
        setIntField(term42816, term42816.getClass(), "nodeCounter", 0);
        setField(term42816, term42816.getClass(), "nodeTable", null);
        setField(term42816, term42816.getClass(), "ownerDocument", null);
        setField(term42816, term42816.getClass(), "firstChild", null);
        setField(term42816, term42816.getClass(), "fNodeListCache", null);
        setField(term42816, term42816.getClass(), "previousSibling", null);
        setField(term42816, term42816.getClass(), "nextSibling", null);
        setField(term42816, term42816.getClass(), "ownerNode", null);
        setShortField(term42816, term42816.getClass(), "flags", (short) 0);
        setField(term42815, term42815.getClass(), "node", term42816);
        setField(term42815, term42815.getClass(), "namespaces", term42817);
        setField(term42815, term42815.getClass(), "defaultNamespace", null);
        setField(term42815, term42815.getClass(), "id", null);
        setField(term42815, term42815.getClass(), "localNamespaceResolver", null);
        setIntField(term42815, term42815.getClass(), "index", 0);
        setBooleanField(term42815, term42815.getClass(), "attribute", false);
        setField(term42815, term42815.getClass(), "namespaceResolver", null);
        setField(term42815, term42815.getClass(), "exceptionHandler", null);
        setField(term42815, term42815.getClass(), "rootNode", null);
        setField(term42815, term42815.getClass(), "parent", null);
        setField(term42815, term42815.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = " :::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::";
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term41602, args);
        assertTrue(recursiveEquals(term41602, term42815));
        assertTrue(recursiveEquals(retValue, null));
    }

};


