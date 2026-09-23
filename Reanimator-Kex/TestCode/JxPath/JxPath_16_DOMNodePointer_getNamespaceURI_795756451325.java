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

public class DOMNodePointer_getNamespaceURI_795756451325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90409;
     Object term90712;

    public DOMNodePointer_getNamespaceURI_795756451325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90409 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term90491 = newInstance(Class.forName("org.apache.xerces.dom.PSVIDocumentImpl"));
        setField(term90409, term90409.getClass(), "namespaces", null);
        setField(term90409, term90409.getClass(), "node", term90491);
        HashMap term90714 = new HashMap();
        term90712 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term90713 = newInstance(Class.forName("org.apache.xerces.dom.PSVIDocumentImpl"));
        setField(term90713, term90713.getClass(), "iterators", null);
        setField(term90713, term90713.getClass(), "ranges", null);
        setField(term90713, term90713.getClass(), "eventListeners", null);
        setBooleanField(term90713, term90713.getClass(), "mutationEvents", false);
        setField(term90713, term90713.getClass(), "savedEnclosingAttr", null);
        setField(term90713, term90713.getClass(), "docType", null);
        setField(term90713, term90713.getClass(), "docElement", null);
        setField(term90713, term90713.getClass(), "fFreeNLCache", null);
        setField(term90713, term90713.getClass(), "encoding", null);
        setField(term90713, term90713.getClass(), "actualEncoding", null);
        setField(term90713, term90713.getClass(), "version", null);
        setBooleanField(term90713, term90713.getClass(), "standalone", false);
        setField(term90713, term90713.getClass(), "fDocumentURI", null);
        setField(term90713, term90713.getClass(), "userData", null);
        setField(term90713, term90713.getClass(), "identifiers", null);
        setField(term90713, term90713.getClass(), "domNormalizer", null);
        setField(term90713, term90713.getClass(), "fConfiguration", null);
        setIntField(term90713, term90713.getClass(), "changes", 0);
        setBooleanField(term90713, term90713.getClass(), "allowGrammarAccess", false);
        setBooleanField(term90713, term90713.getClass(), "errorChecking", false);
        setIntField(term90713, term90713.getClass(), "documentNumber", 0);
        setIntField(term90713, term90713.getClass(), "nodeCounter", 0);
        setField(term90713, term90713.getClass(), "nodeTable", null);
        setField(term90713, term90713.getClass(), "ownerDocument", null);
        setField(term90713, term90713.getClass(), "firstChild", null);
        setField(term90713, term90713.getClass(), "fNodeListCache", null);
        setField(term90713, term90713.getClass(), "previousSibling", null);
        setField(term90713, term90713.getClass(), "nextSibling", null);
        setField(term90713, term90713.getClass(), "ownerNode", null);
        setShortField(term90713, term90713.getClass(), "flags", (short) 0);
        setField(term90712, term90712.getClass(), "node", term90713);
        setField(term90712, term90712.getClass(), "namespaces", term90714);
        setField(term90712, term90712.getClass(), "defaultNamespace", null);
        setField(term90712, term90712.getClass(), "id", null);
        setField(term90712, term90712.getClass(), "localNamespaceResolver", null);
        setIntField(term90712, term90712.getClass(), "index", 0);
        setBooleanField(term90712, term90712.getClass(), "attribute", false);
        setField(term90712, term90712.getClass(), "rootNode", null);
        setField(term90712, term90712.getClass(), "namespaceResolver", null);
        setField(term90712, term90712.getClass(), "parent", null);
        setField(term90712, term90712.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = " :::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::";
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term90409, args);
        assertTrue(recursiveEquals(term90409, term90712));
        assertTrue(recursiveEquals(retValue, null));
    }

};


