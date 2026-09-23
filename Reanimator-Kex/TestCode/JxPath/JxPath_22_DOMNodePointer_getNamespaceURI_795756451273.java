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

public class DOMNodePointer_getNamespaceURI_795756451273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67699;
     Object term68131;

    public DOMNodePointer_getNamespaceURI_795756451273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67699 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term67789 = newInstance(Class.forName("org.apache.xerces.impl.xs.dom.DocumentImpl"));
        Object term67861 = newInstance(Class.forName("org.apache.xerces.dom.ElementImpl"));
        setField(term67699, term67699.getClass(), "namespaces", null);
        setShortField(term67789, term67789.getClass(), "flags", (short) 0);
        setField(term67789, term67789.getClass(), "docElement", term67861);
        setField(term67699, term67699.getClass(), "node", term67789);
        HashMap term68134 = new HashMap();
        term68131 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term68132 = newInstance(Class.forName("org.apache.xerces.impl.xs.dom.DocumentImpl"));
        Object term68133 = newInstance(Class.forName("org.apache.xerces.dom.ElementImpl"));
        setField(term68132, term68132.getClass(), "fNodePool", null);
        setField(term68132, term68132.getClass(), "docType", null);
        setField(term68133, term68133.getClass(), "name", null);
        setField(term68133, term68133.getClass(), "attributes", null);
        setField(term68133, term68133.getClass(), "ownerDocument", null);
        setField(term68133, term68133.getClass(), "firstChild", null);
        setField(term68133, term68133.getClass(), "fNodeListCache", null);
        setField(term68133, term68133.getClass(), "previousSibling", null);
        setField(term68133, term68133.getClass(), "nextSibling", null);
        setField(term68133, term68133.getClass(), "ownerNode", null);
        setShortField(term68133, term68133.getClass(), "flags", (short) 0);
        setField(term68132, term68132.getClass(), "docElement", term68133);
        setField(term68132, term68132.getClass(), "fFreeNLCache", null);
        setField(term68132, term68132.getClass(), "encoding", null);
        setField(term68132, term68132.getClass(), "actualEncoding", null);
        setField(term68132, term68132.getClass(), "version", null);
        setBooleanField(term68132, term68132.getClass(), "standalone", false);
        setField(term68132, term68132.getClass(), "fDocumentURI", null);
        setField(term68132, term68132.getClass(), "userData", null);
        setField(term68132, term68132.getClass(), "identifiers", null);
        setField(term68132, term68132.getClass(), "domNormalizer", null);
        setField(term68132, term68132.getClass(), "fConfiguration", null);
        setIntField(term68132, term68132.getClass(), "changes", 0);
        setBooleanField(term68132, term68132.getClass(), "allowGrammarAccess", false);
        setBooleanField(term68132, term68132.getClass(), "errorChecking", false);
        setIntField(term68132, term68132.getClass(), "documentNumber", 0);
        setIntField(term68132, term68132.getClass(), "nodeCounter", 0);
        setField(term68132, term68132.getClass(), "nodeTable", null);
        setField(term68132, term68132.getClass(), "ownerDocument", null);
        setField(term68132, term68132.getClass(), "firstChild", null);
        setField(term68132, term68132.getClass(), "fNodeListCache", null);
        setField(term68132, term68132.getClass(), "previousSibling", null);
        setField(term68132, term68132.getClass(), "nextSibling", null);
        setField(term68132, term68132.getClass(), "ownerNode", null);
        setShortField(term68132, term68132.getClass(), "flags", (short) 0);
        setField(term68131, term68131.getClass(), "node", term68132);
        setField(term68131, term68131.getClass(), "namespaces", term68134);
        setField(term68131, term68131.getClass(), "defaultNamespace", null);
        setField(term68131, term68131.getClass(), "id", null);
        setField(term68131, term68131.getClass(), "localNamespaceResolver", null);
        setIntField(term68131, term68131.getClass(), "index", 0);
        setBooleanField(term68131, term68131.getClass(), "attribute", false);
        setField(term68131, term68131.getClass(), "namespaceResolver", null);
        setField(term68131, term68131.getClass(), "exceptionHandler", null);
        setField(term68131, term68131.getClass(), "rootNode", null);
        setField(term68131, term68131.getClass(), "parent", null);
        setField(term68131, term68131.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                                ";
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term67699, args);
        assertTrue(recursiveEquals(term67699, term68131));
        assertTrue(recursiveEquals(retValue, null));
    }

};


