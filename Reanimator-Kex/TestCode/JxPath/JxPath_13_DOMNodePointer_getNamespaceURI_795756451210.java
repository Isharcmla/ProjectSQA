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

public class DOMNodePointer_getNamespaceURI_795756451210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47480;
     Object term48708;

    public DOMNodePointer_getNamespaceURI_795756451210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47480 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term47570 = newInstance(Class.forName("org.apache.xerces.impl.xs.dom.DocumentImpl"));
        setField(term47480, term47480.getClass(), "defaultNamespace", null);
        setField(term47480, term47480.getClass(), "node", term47570);
        term48708 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term48709 = newInstance(Class.forName("org.apache.xerces.impl.xs.dom.DocumentImpl"));
        setField(term48709, term48709.getClass(), "fNodePool", null);
        setField(term48709, term48709.getClass(), "docType", null);
        setField(term48709, term48709.getClass(), "docElement", null);
        setField(term48709, term48709.getClass(), "fFreeNLCache", null);
        setField(term48709, term48709.getClass(), "encoding", null);
        setField(term48709, term48709.getClass(), "actualEncoding", null);
        setField(term48709, term48709.getClass(), "version", null);
        setBooleanField(term48709, term48709.getClass(), "standalone", false);
        setField(term48709, term48709.getClass(), "fDocumentURI", null);
        setField(term48709, term48709.getClass(), "userData", null);
        setField(term48709, term48709.getClass(), "identifiers", null);
        setField(term48709, term48709.getClass(), "domNormalizer", null);
        setField(term48709, term48709.getClass(), "fConfiguration", null);
        setIntField(term48709, term48709.getClass(), "changes", 0);
        setBooleanField(term48709, term48709.getClass(), "allowGrammarAccess", false);
        setBooleanField(term48709, term48709.getClass(), "errorChecking", false);
        setIntField(term48709, term48709.getClass(), "documentNumber", 0);
        setIntField(term48709, term48709.getClass(), "nodeCounter", 0);
        setField(term48709, term48709.getClass(), "nodeTable", null);
        setField(term48709, term48709.getClass(), "ownerDocument", null);
        setField(term48709, term48709.getClass(), "firstChild", null);
        setField(term48709, term48709.getClass(), "fNodeListCache", null);
        setField(term48709, term48709.getClass(), "previousSibling", null);
        setField(term48709, term48709.getClass(), "nextSibling", null);
        setField(term48709, term48709.getClass(), "ownerNode", null);
        setShortField(term48709, term48709.getClass(), "flags", (short) 0);
        setField(term48708, term48708.getClass(), "node", term48709);
        setField(term48708, term48708.getClass(), "namespaces", null);
        setField(term48708, term48708.getClass(), "defaultNamespace", "");
        setField(term48708, term48708.getClass(), "id", null);
        setIntField(term48708, term48708.getClass(), "index", 0);
        setBooleanField(term48708, term48708.getClass(), "attribute", false);
        setField(term48708, term48708.getClass(), "rootNode", null);
        setField(term48708, term48708.getClass(), "namespaceResolver", null);
        setField(term48708, term48708.getClass(), "parent", null);
        setField(term48708, term48708.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term47480, args);
        assertTrue(recursiveEquals(term47480, term48708));
        assertTrue(recursiveEquals(retValue, null));
    }

};


