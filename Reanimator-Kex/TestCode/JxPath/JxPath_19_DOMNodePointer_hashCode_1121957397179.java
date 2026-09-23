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

public class DOMNodePointer_hashCode_1121957397179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36949;
     Object term37105;

    public DOMNodePointer_hashCode_1121957397179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36949 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term37031 = newInstance(Class.forName("org.apache.xerces.dom.CoreDocumentImpl"));
        setField(term36949, term36949.getClass(), "node", term37031);
        term37105 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term37106 = newInstance(Class.forName("org.apache.xerces.dom.CoreDocumentImpl"));
        setField(term37106, term37106.getClass(), "docType", null);
        setField(term37106, term37106.getClass(), "docElement", null);
        setField(term37106, term37106.getClass(), "fFreeNLCache", null);
        setField(term37106, term37106.getClass(), "encoding", null);
        setField(term37106, term37106.getClass(), "actualEncoding", null);
        setField(term37106, term37106.getClass(), "version", null);
        setBooleanField(term37106, term37106.getClass(), "standalone", false);
        setField(term37106, term37106.getClass(), "fDocumentURI", null);
        setField(term37106, term37106.getClass(), "userData", null);
        setField(term37106, term37106.getClass(), "identifiers", null);
        setField(term37106, term37106.getClass(), "domNormalizer", null);
        setField(term37106, term37106.getClass(), "fConfiguration", null);
        setIntField(term37106, term37106.getClass(), "changes", 0);
        setBooleanField(term37106, term37106.getClass(), "allowGrammarAccess", false);
        setBooleanField(term37106, term37106.getClass(), "errorChecking", false);
        setIntField(term37106, term37106.getClass(), "documentNumber", 0);
        setIntField(term37106, term37106.getClass(), "nodeCounter", 0);
        setField(term37106, term37106.getClass(), "nodeTable", null);
        setField(term37106, term37106.getClass(), "ownerDocument", null);
        setField(term37106, term37106.getClass(), "firstChild", null);
        setField(term37106, term37106.getClass(), "fNodeListCache", null);
        setField(term37106, term37106.getClass(), "previousSibling", null);
        setField(term37106, term37106.getClass(), "nextSibling", null);
        setField(term37106, term37106.getClass(), "ownerNode", null);
        setShortField(term37106, term37106.getClass(), "flags", (short) 0);
        setField(term37105, term37105.getClass(), "node", term37106);
        setField(term37105, term37105.getClass(), "namespaces", null);
        setField(term37105, term37105.getClass(), "defaultNamespace", null);
        setField(term37105, term37105.getClass(), "id", null);
        setField(term37105, term37105.getClass(), "localNamespaceResolver", null);
        setIntField(term37105, term37105.getClass(), "index", 0);
        setBooleanField(term37105, term37105.getClass(), "attribute", false);
        setField(term37105, term37105.getClass(), "namespaceResolver", null);
        setField(term37105, term37105.getClass(), "rootNode", null);
        setField(term37105, term37105.getClass(), "parent", null);
        setField(term37105, term37105.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term36949, args);
        assertTrue(recursiveEquals(term36949, term37105));
        assertTrue(recursiveEquals(retValue, 387819651));
    }

};


