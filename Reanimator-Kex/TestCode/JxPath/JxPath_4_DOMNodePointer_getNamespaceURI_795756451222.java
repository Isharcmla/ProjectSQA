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

public class DOMNodePointer_getNamespaceURI_795756451222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54705;
     Object term60807;

    public DOMNodePointer_getNamespaceURI_795756451222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54705 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term54795 = newInstance(Class.forName("org.apache.xerces.impl.xs.dom.DocumentImpl"));
        setField(term54705, term54705.getClass(), "namespaces", null);
        setField(term54705, term54705.getClass(), "node", term54795);
        HashMap term60809 = new HashMap();
        term60807 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term60808 = newInstance(Class.forName("org.apache.xerces.impl.xs.dom.DocumentImpl"));
        setField(term60808, term60808.getClass(), "fNodePool", null);
        setField(term60808, term60808.getClass(), "docType", null);
        setField(term60808, term60808.getClass(), "docElement", null);
        setField(term60808, term60808.getClass(), "fFreeNLCache", null);
        setField(term60808, term60808.getClass(), "encoding", null);
        setField(term60808, term60808.getClass(), "actualEncoding", null);
        setField(term60808, term60808.getClass(), "version", null);
        setBooleanField(term60808, term60808.getClass(), "standalone", false);
        setField(term60808, term60808.getClass(), "fDocumentURI", null);
        setField(term60808, term60808.getClass(), "userData", null);
        setField(term60808, term60808.getClass(), "identifiers", null);
        setField(term60808, term60808.getClass(), "domNormalizer", null);
        setField(term60808, term60808.getClass(), "fConfiguration", null);
        setIntField(term60808, term60808.getClass(), "changes", 0);
        setBooleanField(term60808, term60808.getClass(), "allowGrammarAccess", false);
        setBooleanField(term60808, term60808.getClass(), "errorChecking", false);
        setIntField(term60808, term60808.getClass(), "documentNumber", 0);
        setIntField(term60808, term60808.getClass(), "nodeCounter", 0);
        setField(term60808, term60808.getClass(), "nodeTable", null);
        setField(term60808, term60808.getClass(), "ownerDocument", null);
        setField(term60808, term60808.getClass(), "firstChild", null);
        setField(term60808, term60808.getClass(), "fNodeListCache", null);
        setField(term60808, term60808.getClass(), "previousSibling", null);
        setField(term60808, term60808.getClass(), "nextSibling", null);
        setField(term60808, term60808.getClass(), "ownerNode", null);
        setShortField(term60808, term60808.getClass(), "flags", (short) 0);
        setField(term60807, term60807.getClass(), "node", term60808);
        setField(term60807, term60807.getClass(), "namespaces", term60809);
        setField(term60807, term60807.getClass(), "defaultNamespace", null);
        setField(term60807, term60807.getClass(), "id", null);
        setIntField(term60807, term60807.getClass(), "index", 0);
        setBooleanField(term60807, term60807.getClass(), "attribute", false);
        setField(term60807, term60807.getClass(), "rootNode", null);
        setField(term60807, term60807.getClass(), "namespaceResolver", null);
        setField(term60807, term60807.getClass(), "parent", null);
        setField(term60807, term60807.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = " ";
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term54705, args);
        assertTrue(recursiveEquals(term54705, term60807));
        assertTrue(recursiveEquals(retValue, null));
    }

};


