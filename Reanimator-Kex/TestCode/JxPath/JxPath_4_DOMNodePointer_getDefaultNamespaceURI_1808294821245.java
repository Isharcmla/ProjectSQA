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

public class DOMNodePointer_getDefaultNamespaceURI_1808294821245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65855;
     Object term66073;

    public DOMNodePointer_getDefaultNamespaceURI_1808294821245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65855 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term65945 = newInstance(Class.forName("org.apache.xerces.impl.xs.dom.DocumentImpl"));
        Object term66017 = newInstance(Class.forName("org.apache.xerces.dom.ElementImpl"));
        setField(term65855, term65855.getClass(), "defaultNamespace", null);
        setShortField(term65945, term65945.getClass(), "flags", (short) 0);
        setField(term65945, term65945.getClass(), "docElement", term66017);
        setField(term65855, term65855.getClass(), "node", term65945);
        term66073 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term66074 = newInstance(Class.forName("org.apache.xerces.impl.xs.dom.DocumentImpl"));
        Object term66075 = newInstance(Class.forName("org.apache.xerces.dom.ElementImpl"));
        setField(term66074, term66074.getClass(), "fNodePool", null);
        setField(term66074, term66074.getClass(), "docType", null);
        setField(term66075, term66075.getClass(), "name", null);
        setField(term66075, term66075.getClass(), "attributes", null);
        setField(term66075, term66075.getClass(), "ownerDocument", null);
        setField(term66075, term66075.getClass(), "firstChild", null);
        setField(term66075, term66075.getClass(), "fNodeListCache", null);
        setField(term66075, term66075.getClass(), "previousSibling", null);
        setField(term66075, term66075.getClass(), "nextSibling", null);
        setField(term66075, term66075.getClass(), "ownerNode", null);
        setShortField(term66075, term66075.getClass(), "flags", (short) 0);
        setField(term66074, term66074.getClass(), "docElement", term66075);
        setField(term66074, term66074.getClass(), "fFreeNLCache", null);
        setField(term66074, term66074.getClass(), "encoding", null);
        setField(term66074, term66074.getClass(), "actualEncoding", null);
        setField(term66074, term66074.getClass(), "version", null);
        setBooleanField(term66074, term66074.getClass(), "standalone", false);
        setField(term66074, term66074.getClass(), "fDocumentURI", null);
        setField(term66074, term66074.getClass(), "userData", null);
        setField(term66074, term66074.getClass(), "identifiers", null);
        setField(term66074, term66074.getClass(), "domNormalizer", null);
        setField(term66074, term66074.getClass(), "fConfiguration", null);
        setIntField(term66074, term66074.getClass(), "changes", 0);
        setBooleanField(term66074, term66074.getClass(), "allowGrammarAccess", false);
        setBooleanField(term66074, term66074.getClass(), "errorChecking", false);
        setIntField(term66074, term66074.getClass(), "documentNumber", 0);
        setIntField(term66074, term66074.getClass(), "nodeCounter", 0);
        setField(term66074, term66074.getClass(), "nodeTable", null);
        setField(term66074, term66074.getClass(), "ownerDocument", null);
        setField(term66074, term66074.getClass(), "firstChild", null);
        setField(term66074, term66074.getClass(), "fNodeListCache", null);
        setField(term66074, term66074.getClass(), "previousSibling", null);
        setField(term66074, term66074.getClass(), "nextSibling", null);
        setField(term66074, term66074.getClass(), "ownerNode", null);
        setShortField(term66074, term66074.getClass(), "flags", (short) 0);
        setField(term66073, term66073.getClass(), "node", term66074);
        setField(term66073, term66073.getClass(), "namespaces", null);
        setField(term66073, term66073.getClass(), "defaultNamespace", "");
        setField(term66073, term66073.getClass(), "id", null);
        setIntField(term66073, term66073.getClass(), "index", 0);
        setBooleanField(term66073, term66073.getClass(), "attribute", false);
        setField(term66073, term66073.getClass(), "rootNode", null);
        setField(term66073, term66073.getClass(), "namespaceResolver", null);
        setField(term66073, term66073.getClass(), "parent", null);
        setField(term66073, term66073.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDefaultNamespaceURI", argTypes, term65855, args);
        assertTrue(recursiveEquals(term65855, term66073));
        assertTrue(recursiveEquals(retValue, null));
    }

};


