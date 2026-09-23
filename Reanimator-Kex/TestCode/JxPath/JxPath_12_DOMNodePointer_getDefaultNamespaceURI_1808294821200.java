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

public class DOMNodePointer_getDefaultNamespaceURI_1808294821200 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43500;
     Object term43843;

    public DOMNodePointer_getDefaultNamespaceURI_1808294821200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43500 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term43574 = newInstance(Class.forName("org.apache.wml.dom.WMLDocumentImpl"));
        setField(term43500, term43500.getClass(), "defaultNamespace", null);
        setField(term43500, term43500.getClass(), "node", term43574);
        term43843 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term43844 = newInstance(Class.forName("org.apache.wml.dom.WMLDocumentImpl"));
        setField(term43844, term43844.getClass(), "iterators", null);
        setField(term43844, term43844.getClass(), "ranges", null);
        setField(term43844, term43844.getClass(), "eventListeners", null);
        setBooleanField(term43844, term43844.getClass(), "mutationEvents", false);
        setField(term43844, term43844.getClass(), "savedEnclosingAttr", null);
        setField(term43844, term43844.getClass(), "docType", null);
        setField(term43844, term43844.getClass(), "docElement", null);
        setField(term43844, term43844.getClass(), "fFreeNLCache", null);
        setField(term43844, term43844.getClass(), "encoding", null);
        setField(term43844, term43844.getClass(), "actualEncoding", null);
        setField(term43844, term43844.getClass(), "version", null);
        setBooleanField(term43844, term43844.getClass(), "standalone", false);
        setField(term43844, term43844.getClass(), "fDocumentURI", null);
        setField(term43844, term43844.getClass(), "userData", null);
        setField(term43844, term43844.getClass(), "identifiers", null);
        setField(term43844, term43844.getClass(), "domNormalizer", null);
        setField(term43844, term43844.getClass(), "fConfiguration", null);
        setIntField(term43844, term43844.getClass(), "changes", 0);
        setBooleanField(term43844, term43844.getClass(), "allowGrammarAccess", false);
        setBooleanField(term43844, term43844.getClass(), "errorChecking", false);
        setIntField(term43844, term43844.getClass(), "documentNumber", 0);
        setIntField(term43844, term43844.getClass(), "nodeCounter", 0);
        setField(term43844, term43844.getClass(), "nodeTable", null);
        setField(term43844, term43844.getClass(), "ownerDocument", null);
        setField(term43844, term43844.getClass(), "firstChild", null);
        setField(term43844, term43844.getClass(), "fNodeListCache", null);
        setField(term43844, term43844.getClass(), "previousSibling", null);
        setField(term43844, term43844.getClass(), "nextSibling", null);
        setField(term43844, term43844.getClass(), "ownerNode", null);
        setShortField(term43844, term43844.getClass(), "flags", (short) 0);
        setField(term43843, term43843.getClass(), "node", term43844);
        setField(term43843, term43843.getClass(), "namespaces", null);
        setField(term43843, term43843.getClass(), "defaultNamespace", "");
        setField(term43843, term43843.getClass(), "id", null);
        setIntField(term43843, term43843.getClass(), "index", 0);
        setBooleanField(term43843, term43843.getClass(), "attribute", false);
        setField(term43843, term43843.getClass(), "rootNode", null);
        setField(term43843, term43843.getClass(), "namespaceResolver", null);
        setField(term43843, term43843.getClass(), "parent", null);
        setField(term43843, term43843.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDefaultNamespaceURI", argTypes, term43500, args);
        assertTrue(recursiveEquals(term43500, term43843));
        assertTrue(recursiveEquals(retValue, null));
    }

};


