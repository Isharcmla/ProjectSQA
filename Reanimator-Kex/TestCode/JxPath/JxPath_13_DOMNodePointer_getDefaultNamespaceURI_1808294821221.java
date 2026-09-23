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

public class DOMNodePointer_getDefaultNamespaceURI_1808294821221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55538;
     Object term55644;

    public DOMNodePointer_getDefaultNamespaceURI_1808294821221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55538 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term55612 = newInstance(Class.forName("org.apache.wml.dom.WMLDocumentImpl"));
        setField(term55538, term55538.getClass(), "defaultNamespace", null);
        setField(term55538, term55538.getClass(), "node", term55612);
        term55644 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term55645 = newInstance(Class.forName("org.apache.wml.dom.WMLDocumentImpl"));
        setField(term55645, term55645.getClass(), "iterators", null);
        setField(term55645, term55645.getClass(), "ranges", null);
        setField(term55645, term55645.getClass(), "eventListeners", null);
        setBooleanField(term55645, term55645.getClass(), "mutationEvents", false);
        setField(term55645, term55645.getClass(), "savedEnclosingAttr", null);
        setField(term55645, term55645.getClass(), "docType", null);
        setField(term55645, term55645.getClass(), "docElement", null);
        setField(term55645, term55645.getClass(), "fFreeNLCache", null);
        setField(term55645, term55645.getClass(), "encoding", null);
        setField(term55645, term55645.getClass(), "actualEncoding", null);
        setField(term55645, term55645.getClass(), "version", null);
        setBooleanField(term55645, term55645.getClass(), "standalone", false);
        setField(term55645, term55645.getClass(), "fDocumentURI", null);
        setField(term55645, term55645.getClass(), "userData", null);
        setField(term55645, term55645.getClass(), "identifiers", null);
        setField(term55645, term55645.getClass(), "domNormalizer", null);
        setField(term55645, term55645.getClass(), "fConfiguration", null);
        setIntField(term55645, term55645.getClass(), "changes", 0);
        setBooleanField(term55645, term55645.getClass(), "allowGrammarAccess", false);
        setBooleanField(term55645, term55645.getClass(), "errorChecking", false);
        setIntField(term55645, term55645.getClass(), "documentNumber", 0);
        setIntField(term55645, term55645.getClass(), "nodeCounter", 0);
        setField(term55645, term55645.getClass(), "nodeTable", null);
        setField(term55645, term55645.getClass(), "ownerDocument", null);
        setField(term55645, term55645.getClass(), "firstChild", null);
        setField(term55645, term55645.getClass(), "fNodeListCache", null);
        setField(term55645, term55645.getClass(), "previousSibling", null);
        setField(term55645, term55645.getClass(), "nextSibling", null);
        setField(term55645, term55645.getClass(), "ownerNode", null);
        setShortField(term55645, term55645.getClass(), "flags", (short) 0);
        setField(term55644, term55644.getClass(), "node", term55645);
        setField(term55644, term55644.getClass(), "namespaces", null);
        setField(term55644, term55644.getClass(), "defaultNamespace", "");
        setField(term55644, term55644.getClass(), "id", null);
        setIntField(term55644, term55644.getClass(), "index", 0);
        setBooleanField(term55644, term55644.getClass(), "attribute", false);
        setField(term55644, term55644.getClass(), "rootNode", null);
        setField(term55644, term55644.getClass(), "namespaceResolver", null);
        setField(term55644, term55644.getClass(), "parent", null);
        setField(term55644, term55644.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDefaultNamespaceURI", argTypes, term55538, args);
        assertTrue(recursiveEquals(term55538, term55644));
        assertTrue(recursiveEquals(retValue, null));
    }

};


