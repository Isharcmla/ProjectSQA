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

public class DOMNodePointer_getRelativePositionOfPI_202037106131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20305;
     Object term20743;

    public DOMNodePointer_getRelativePositionOfPI_202037106131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20305 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term20379 = newInstance(Class.forName("org.apache.wml.dom.WMLDocumentImpl"));
        setField(term20305, term20305.getClass(), "node", term20379);
        term20743 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term20744 = newInstance(Class.forName("org.apache.wml.dom.WMLDocumentImpl"));
        setField(term20744, term20744.getClass(), "iterators", null);
        setField(term20744, term20744.getClass(), "ranges", null);
        setField(term20744, term20744.getClass(), "eventListeners", null);
        setBooleanField(term20744, term20744.getClass(), "mutationEvents", false);
        setField(term20744, term20744.getClass(), "savedEnclosingAttr", null);
        setField(term20744, term20744.getClass(), "docType", null);
        setField(term20744, term20744.getClass(), "docElement", null);
        setField(term20744, term20744.getClass(), "fFreeNLCache", null);
        setField(term20744, term20744.getClass(), "encoding", null);
        setField(term20744, term20744.getClass(), "actualEncoding", null);
        setField(term20744, term20744.getClass(), "version", null);
        setBooleanField(term20744, term20744.getClass(), "standalone", false);
        setField(term20744, term20744.getClass(), "fDocumentURI", null);
        setField(term20744, term20744.getClass(), "userData", null);
        setField(term20744, term20744.getClass(), "identifiers", null);
        setField(term20744, term20744.getClass(), "domNormalizer", null);
        setField(term20744, term20744.getClass(), "fConfiguration", null);
        setIntField(term20744, term20744.getClass(), "changes", 0);
        setBooleanField(term20744, term20744.getClass(), "allowGrammarAccess", false);
        setBooleanField(term20744, term20744.getClass(), "errorChecking", false);
        setIntField(term20744, term20744.getClass(), "documentNumber", 0);
        setIntField(term20744, term20744.getClass(), "nodeCounter", 0);
        setField(term20744, term20744.getClass(), "nodeTable", null);
        setField(term20744, term20744.getClass(), "ownerDocument", null);
        setField(term20744, term20744.getClass(), "firstChild", null);
        setField(term20744, term20744.getClass(), "fNodeListCache", null);
        setField(term20744, term20744.getClass(), "previousSibling", null);
        setField(term20744, term20744.getClass(), "nextSibling", null);
        setField(term20744, term20744.getClass(), "ownerNode", null);
        setShortField(term20744, term20744.getClass(), "flags", (short) 0);
        setField(term20743, term20743.getClass(), "node", term20744);
        setField(term20743, term20743.getClass(), "namespaces", null);
        setField(term20743, term20743.getClass(), "defaultNamespace", null);
        setField(term20743, term20743.getClass(), "id", null);
        setIntField(term20743, term20743.getClass(), "index", 0);
        setBooleanField(term20743, term20743.getClass(), "attribute", false);
        setField(term20743, term20743.getClass(), "rootNode", null);
        setField(term20743, term20743.getClass(), "namespaceResolver", null);
        setField(term20743, term20743.getClass(), "parent", null);
        setField(term20743, term20743.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "getRelativePositionOfPI", argTypes, term20305, args);
        assertTrue(recursiveEquals(term20305, term20743));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


