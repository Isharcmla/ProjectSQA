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

public class DOMNodePointer_getNamespaceURI_795756451321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99428;
     Object term99576;

    public DOMNodePointer_getNamespaceURI_795756451321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99428 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term99502 = newInstance(Class.forName("org.apache.wml.dom.WMLDocumentImpl"));
        setField(term99428, term99428.getClass(), "defaultNamespace", null);
        setField(term99428, term99428.getClass(), "node", term99502);
        term99576 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term99577 = newInstance(Class.forName("org.apache.wml.dom.WMLDocumentImpl"));
        setField(term99577, term99577.getClass(), "iterators", null);
        setField(term99577, term99577.getClass(), "ranges", null);
        setField(term99577, term99577.getClass(), "eventListeners", null);
        setBooleanField(term99577, term99577.getClass(), "mutationEvents", false);
        setField(term99577, term99577.getClass(), "savedEnclosingAttr", null);
        setField(term99577, term99577.getClass(), "docType", null);
        setField(term99577, term99577.getClass(), "docElement", null);
        setField(term99577, term99577.getClass(), "fFreeNLCache", null);
        setField(term99577, term99577.getClass(), "encoding", null);
        setField(term99577, term99577.getClass(), "actualEncoding", null);
        setField(term99577, term99577.getClass(), "version", null);
        setBooleanField(term99577, term99577.getClass(), "standalone", false);
        setField(term99577, term99577.getClass(), "fDocumentURI", null);
        setField(term99577, term99577.getClass(), "userData", null);
        setField(term99577, term99577.getClass(), "identifiers", null);
        setField(term99577, term99577.getClass(), "domNormalizer", null);
        setField(term99577, term99577.getClass(), "fConfiguration", null);
        setIntField(term99577, term99577.getClass(), "changes", 0);
        setBooleanField(term99577, term99577.getClass(), "allowGrammarAccess", false);
        setBooleanField(term99577, term99577.getClass(), "errorChecking", false);
        setIntField(term99577, term99577.getClass(), "documentNumber", 0);
        setIntField(term99577, term99577.getClass(), "nodeCounter", 0);
        setField(term99577, term99577.getClass(), "nodeTable", null);
        setField(term99577, term99577.getClass(), "ownerDocument", null);
        setField(term99577, term99577.getClass(), "firstChild", null);
        setField(term99577, term99577.getClass(), "fNodeListCache", null);
        setField(term99577, term99577.getClass(), "previousSibling", null);
        setField(term99577, term99577.getClass(), "nextSibling", null);
        setField(term99577, term99577.getClass(), "ownerNode", null);
        setShortField(term99577, term99577.getClass(), "flags", (short) 0);
        setField(term99576, term99576.getClass(), "node", term99577);
        setField(term99576, term99576.getClass(), "namespaces", null);
        setField(term99576, term99576.getClass(), "defaultNamespace", "");
        setField(term99576, term99576.getClass(), "id", null);
        setIntField(term99576, term99576.getClass(), "index", 0);
        setBooleanField(term99576, term99576.getClass(), "attribute", false);
        setField(term99576, term99576.getClass(), "rootNode", null);
        setField(term99576, term99576.getClass(), "namespaceResolver", null);
        setField(term99576, term99576.getClass(), "parent", null);
        setField(term99576, term99576.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term99428, args);
        assertTrue(recursiveEquals(term99428, term99576));
        assertTrue(recursiveEquals(retValue, null));
    }

};


