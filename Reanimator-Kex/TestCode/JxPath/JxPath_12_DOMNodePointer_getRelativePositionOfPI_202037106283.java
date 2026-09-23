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

public class DOMNodePointer_getRelativePositionOfPI_202037106283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79099;
     Object term80892;

    public DOMNodePointer_getRelativePositionOfPI_202037106283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79099 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term79173 = newInstance(Class.forName("org.apache.wml.dom.WMLDocumentImpl"));
        Object term79247 = newInstance(Class.forName("org.apache.wml.dom.WMLDocumentImpl"));
        Object term79321 = newInstance(Class.forName("org.apache.wml.dom.WMLDocumentImpl"));
        setShortField(term79173, term79173.getClass(), "flags", (short) 0);
        setShortField(term79247, term79247.getClass(), "flags", (short) 0);
        setField(term79247, term79247.getClass(), "previousSibling", term79321);
        setField(term79173, term79173.getClass(), "previousSibling", term79247);
        setField(term79099, term79099.getClass(), "node", term79173);
        term80892 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term80893 = newInstance(Class.forName("org.apache.wml.dom.WMLDocumentImpl"));
        Object term80894 = newInstance(Class.forName("org.apache.wml.dom.WMLDocumentImpl"));
        Object term80895 = newInstance(Class.forName("org.apache.wml.dom.WMLDocumentImpl"));
        setField(term80893, term80893.getClass(), "iterators", null);
        setField(term80893, term80893.getClass(), "ranges", null);
        setField(term80893, term80893.getClass(), "eventListeners", null);
        setBooleanField(term80893, term80893.getClass(), "mutationEvents", false);
        setField(term80893, term80893.getClass(), "savedEnclosingAttr", null);
        setField(term80893, term80893.getClass(), "docType", null);
        setField(term80893, term80893.getClass(), "docElement", null);
        setField(term80893, term80893.getClass(), "fFreeNLCache", null);
        setField(term80893, term80893.getClass(), "encoding", null);
        setField(term80893, term80893.getClass(), "actualEncoding", null);
        setField(term80893, term80893.getClass(), "version", null);
        setBooleanField(term80893, term80893.getClass(), "standalone", false);
        setField(term80893, term80893.getClass(), "fDocumentURI", null);
        setField(term80893, term80893.getClass(), "userData", null);
        setField(term80893, term80893.getClass(), "identifiers", null);
        setField(term80893, term80893.getClass(), "domNormalizer", null);
        setField(term80893, term80893.getClass(), "fConfiguration", null);
        setIntField(term80893, term80893.getClass(), "changes", 0);
        setBooleanField(term80893, term80893.getClass(), "allowGrammarAccess", false);
        setBooleanField(term80893, term80893.getClass(), "errorChecking", false);
        setIntField(term80893, term80893.getClass(), "documentNumber", 0);
        setIntField(term80893, term80893.getClass(), "nodeCounter", 0);
        setField(term80893, term80893.getClass(), "nodeTable", null);
        setField(term80893, term80893.getClass(), "ownerDocument", null);
        setField(term80893, term80893.getClass(), "firstChild", null);
        setField(term80893, term80893.getClass(), "fNodeListCache", null);
        setField(term80894, term80894.getClass(), "iterators", null);
        setField(term80894, term80894.getClass(), "ranges", null);
        setField(term80894, term80894.getClass(), "eventListeners", null);
        setBooleanField(term80894, term80894.getClass(), "mutationEvents", false);
        setField(term80894, term80894.getClass(), "savedEnclosingAttr", null);
        setField(term80894, term80894.getClass(), "docType", null);
        setField(term80894, term80894.getClass(), "docElement", null);
        setField(term80894, term80894.getClass(), "fFreeNLCache", null);
        setField(term80894, term80894.getClass(), "encoding", null);
        setField(term80894, term80894.getClass(), "actualEncoding", null);
        setField(term80894, term80894.getClass(), "version", null);
        setBooleanField(term80894, term80894.getClass(), "standalone", false);
        setField(term80894, term80894.getClass(), "fDocumentURI", null);
        setField(term80894, term80894.getClass(), "userData", null);
        setField(term80894, term80894.getClass(), "identifiers", null);
        setField(term80894, term80894.getClass(), "domNormalizer", null);
        setField(term80894, term80894.getClass(), "fConfiguration", null);
        setIntField(term80894, term80894.getClass(), "changes", 0);
        setBooleanField(term80894, term80894.getClass(), "allowGrammarAccess", false);
        setBooleanField(term80894, term80894.getClass(), "errorChecking", false);
        setIntField(term80894, term80894.getClass(), "documentNumber", 0);
        setIntField(term80894, term80894.getClass(), "nodeCounter", 0);
        setField(term80894, term80894.getClass(), "nodeTable", null);
        setField(term80894, term80894.getClass(), "ownerDocument", null);
        setField(term80894, term80894.getClass(), "firstChild", null);
        setField(term80894, term80894.getClass(), "fNodeListCache", null);
        setField(term80895, term80895.getClass(), "iterators", null);
        setField(term80895, term80895.getClass(), "ranges", null);
        setField(term80895, term80895.getClass(), "eventListeners", null);
        setBooleanField(term80895, term80895.getClass(), "mutationEvents", false);
        setField(term80895, term80895.getClass(), "savedEnclosingAttr", null);
        setField(term80895, term80895.getClass(), "docType", null);
        setField(term80895, term80895.getClass(), "docElement", null);
        setField(term80895, term80895.getClass(), "fFreeNLCache", null);
        setField(term80895, term80895.getClass(), "encoding", null);
        setField(term80895, term80895.getClass(), "actualEncoding", null);
        setField(term80895, term80895.getClass(), "version", null);
        setBooleanField(term80895, term80895.getClass(), "standalone", false);
        setField(term80895, term80895.getClass(), "fDocumentURI", null);
        setField(term80895, term80895.getClass(), "userData", null);
        setField(term80895, term80895.getClass(), "identifiers", null);
        setField(term80895, term80895.getClass(), "domNormalizer", null);
        setField(term80895, term80895.getClass(), "fConfiguration", null);
        setIntField(term80895, term80895.getClass(), "changes", 0);
        setBooleanField(term80895, term80895.getClass(), "allowGrammarAccess", false);
        setBooleanField(term80895, term80895.getClass(), "errorChecking", false);
        setIntField(term80895, term80895.getClass(), "documentNumber", 0);
        setIntField(term80895, term80895.getClass(), "nodeCounter", 0);
        setField(term80895, term80895.getClass(), "nodeTable", null);
        setField(term80895, term80895.getClass(), "ownerDocument", null);
        setField(term80895, term80895.getClass(), "firstChild", null);
        setField(term80895, term80895.getClass(), "fNodeListCache", null);
        setField(term80895, term80895.getClass(), "previousSibling", null);
        setField(term80895, term80895.getClass(), "nextSibling", null);
        setField(term80895, term80895.getClass(), "ownerNode", null);
        setShortField(term80895, term80895.getClass(), "flags", (short) 0);
        setField(term80894, term80894.getClass(), "previousSibling", term80895);
        setField(term80894, term80894.getClass(), "nextSibling", null);
        setField(term80894, term80894.getClass(), "ownerNode", null);
        setShortField(term80894, term80894.getClass(), "flags", (short) 0);
        setField(term80893, term80893.getClass(), "previousSibling", term80894);
        setField(term80893, term80893.getClass(), "nextSibling", null);
        setField(term80893, term80893.getClass(), "ownerNode", null);
        setShortField(term80893, term80893.getClass(), "flags", (short) 0);
        setField(term80892, term80892.getClass(), "node", term80893);
        setField(term80892, term80892.getClass(), "namespaces", null);
        setField(term80892, term80892.getClass(), "defaultNamespace", null);
        setField(term80892, term80892.getClass(), "id", null);
        setIntField(term80892, term80892.getClass(), "index", 0);
        setBooleanField(term80892, term80892.getClass(), "attribute", false);
        setField(term80892, term80892.getClass(), "rootNode", null);
        setField(term80892, term80892.getClass(), "namespaceResolver", null);
        setField(term80892, term80892.getClass(), "parent", null);
        setField(term80892, term80892.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getRelativePositionOfPI", argTypes, term79099, args);
        assertTrue(recursiveEquals(term79099, term80892));
    }

};


