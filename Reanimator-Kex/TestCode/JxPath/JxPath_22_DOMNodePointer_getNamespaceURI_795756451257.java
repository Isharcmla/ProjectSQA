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

public class DOMNodePointer_getNamespaceURI_795756451257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63410;
     Object term63583;

    public DOMNodePointer_getNamespaceURI_795756451257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63410 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term63484 = newInstance(Class.forName("org.apache.wml.dom.WMLDocumentImpl"));
        setField(term63410, term63410.getClass(), "defaultNamespace", null);
        setField(term63410, term63410.getClass(), "node", term63484);
        term63583 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term63584 = newInstance(Class.forName("org.apache.wml.dom.WMLDocumentImpl"));
        setField(term63584, term63584.getClass(), "iterators", null);
        setField(term63584, term63584.getClass(), "ranges", null);
        setField(term63584, term63584.getClass(), "eventListeners", null);
        setBooleanField(term63584, term63584.getClass(), "mutationEvents", false);
        setField(term63584, term63584.getClass(), "savedEnclosingAttr", null);
        setField(term63584, term63584.getClass(), "docType", null);
        setField(term63584, term63584.getClass(), "docElement", null);
        setField(term63584, term63584.getClass(), "fFreeNLCache", null);
        setField(term63584, term63584.getClass(), "encoding", null);
        setField(term63584, term63584.getClass(), "actualEncoding", null);
        setField(term63584, term63584.getClass(), "version", null);
        setBooleanField(term63584, term63584.getClass(), "standalone", false);
        setField(term63584, term63584.getClass(), "fDocumentURI", null);
        setField(term63584, term63584.getClass(), "userData", null);
        setField(term63584, term63584.getClass(), "identifiers", null);
        setField(term63584, term63584.getClass(), "domNormalizer", null);
        setField(term63584, term63584.getClass(), "fConfiguration", null);
        setIntField(term63584, term63584.getClass(), "changes", 0);
        setBooleanField(term63584, term63584.getClass(), "allowGrammarAccess", false);
        setBooleanField(term63584, term63584.getClass(), "errorChecking", false);
        setIntField(term63584, term63584.getClass(), "documentNumber", 0);
        setIntField(term63584, term63584.getClass(), "nodeCounter", 0);
        setField(term63584, term63584.getClass(), "nodeTable", null);
        setField(term63584, term63584.getClass(), "ownerDocument", null);
        setField(term63584, term63584.getClass(), "firstChild", null);
        setField(term63584, term63584.getClass(), "fNodeListCache", null);
        setField(term63584, term63584.getClass(), "previousSibling", null);
        setField(term63584, term63584.getClass(), "nextSibling", null);
        setField(term63584, term63584.getClass(), "ownerNode", null);
        setShortField(term63584, term63584.getClass(), "flags", (short) 0);
        setField(term63583, term63583.getClass(), "node", term63584);
        setField(term63583, term63583.getClass(), "namespaces", null);
        setField(term63583, term63583.getClass(), "defaultNamespace", "");
        setField(term63583, term63583.getClass(), "id", null);
        setField(term63583, term63583.getClass(), "localNamespaceResolver", null);
        setIntField(term63583, term63583.getClass(), "index", 0);
        setBooleanField(term63583, term63583.getClass(), "attribute", false);
        setField(term63583, term63583.getClass(), "namespaceResolver", null);
        setField(term63583, term63583.getClass(), "exceptionHandler", null);
        setField(term63583, term63583.getClass(), "rootNode", null);
        setField(term63583, term63583.getClass(), "parent", null);
        setField(term63583, term63583.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term63410, args);
        assertTrue(recursiveEquals(term63410, term63583));
        assertTrue(recursiveEquals(retValue, null));
    }

};


