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

public class DOMNodePointer_getNamespaceURI_795756451287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83557;
     Object term83744;

    public DOMNodePointer_getNamespaceURI_795756451287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83557 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term83647 = newInstance(Class.forName("org.apache.xerces.impl.xs.dom.DocumentImpl"));
        setField(term83557, term83557.getClass(), "namespaces", null);
        setField(term83557, term83557.getClass(), "node", term83647);
        HashMap term83746 = new HashMap();
        term83744 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term83745 = newInstance(Class.forName("org.apache.xerces.impl.xs.dom.DocumentImpl"));
        setField(term83745, term83745.getClass(), "fNodePool", null);
        setField(term83745, term83745.getClass(), "docType", null);
        setField(term83745, term83745.getClass(), "docElement", null);
        setField(term83745, term83745.getClass(), "fFreeNLCache", null);
        setField(term83745, term83745.getClass(), "encoding", null);
        setField(term83745, term83745.getClass(), "actualEncoding", null);
        setField(term83745, term83745.getClass(), "version", null);
        setBooleanField(term83745, term83745.getClass(), "standalone", false);
        setField(term83745, term83745.getClass(), "fDocumentURI", null);
        setField(term83745, term83745.getClass(), "userData", null);
        setField(term83745, term83745.getClass(), "identifiers", null);
        setField(term83745, term83745.getClass(), "domNormalizer", null);
        setField(term83745, term83745.getClass(), "fConfiguration", null);
        setIntField(term83745, term83745.getClass(), "changes", 0);
        setBooleanField(term83745, term83745.getClass(), "allowGrammarAccess", false);
        setBooleanField(term83745, term83745.getClass(), "errorChecking", false);
        setIntField(term83745, term83745.getClass(), "documentNumber", 0);
        setIntField(term83745, term83745.getClass(), "nodeCounter", 0);
        setField(term83745, term83745.getClass(), "nodeTable", null);
        setField(term83745, term83745.getClass(), "ownerDocument", null);
        setField(term83745, term83745.getClass(), "firstChild", null);
        setField(term83745, term83745.getClass(), "fNodeListCache", null);
        setField(term83745, term83745.getClass(), "previousSibling", null);
        setField(term83745, term83745.getClass(), "nextSibling", null);
        setField(term83745, term83745.getClass(), "ownerNode", null);
        setShortField(term83745, term83745.getClass(), "flags", (short) 0);
        setField(term83744, term83744.getClass(), "node", term83745);
        setField(term83744, term83744.getClass(), "namespaces", term83746);
        setField(term83744, term83744.getClass(), "defaultNamespace", null);
        setField(term83744, term83744.getClass(), "id", null);
        setIntField(term83744, term83744.getClass(), "index", 0);
        setBooleanField(term83744, term83744.getClass(), "attribute", false);
        setField(term83744, term83744.getClass(), "rootNode", null);
        setField(term83744, term83744.getClass(), "namespaceResolver", null);
        setField(term83744, term83744.getClass(), "parent", null);
        setField(term83744, term83744.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = " ";
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term83557, args);
        assertTrue(recursiveEquals(term83557, term83744));
        assertTrue(recursiveEquals(retValue, null));
    }

};


