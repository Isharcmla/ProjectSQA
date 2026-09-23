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

public class DOMNodePointer_getNamespaceURI_795756451209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45029;
     Object term46713;

    public DOMNodePointer_getNamespaceURI_795756451209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45029 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term45119 = newInstance(Class.forName("org.apache.xerces.impl.xs.dom.DocumentImpl"));
        setField(term45029, term45029.getClass(), "namespaces", null);
        setField(term45029, term45029.getClass(), "node", term45119);
        HashMap term46715 = new HashMap();
        term46713 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term46714 = newInstance(Class.forName("org.apache.xerces.impl.xs.dom.DocumentImpl"));
        setField(term46714, term46714.getClass(), "fNodePool", null);
        setField(term46714, term46714.getClass(), "docType", null);
        setField(term46714, term46714.getClass(), "docElement", null);
        setField(term46714, term46714.getClass(), "fFreeNLCache", null);
        setField(term46714, term46714.getClass(), "encoding", null);
        setField(term46714, term46714.getClass(), "actualEncoding", null);
        setField(term46714, term46714.getClass(), "version", null);
        setBooleanField(term46714, term46714.getClass(), "standalone", false);
        setField(term46714, term46714.getClass(), "fDocumentURI", null);
        setField(term46714, term46714.getClass(), "userData", null);
        setField(term46714, term46714.getClass(), "identifiers", null);
        setField(term46714, term46714.getClass(), "domNormalizer", null);
        setField(term46714, term46714.getClass(), "fConfiguration", null);
        setIntField(term46714, term46714.getClass(), "changes", 0);
        setBooleanField(term46714, term46714.getClass(), "allowGrammarAccess", false);
        setBooleanField(term46714, term46714.getClass(), "errorChecking", false);
        setIntField(term46714, term46714.getClass(), "documentNumber", 0);
        setIntField(term46714, term46714.getClass(), "nodeCounter", 0);
        setField(term46714, term46714.getClass(), "nodeTable", null);
        setField(term46714, term46714.getClass(), "ownerDocument", null);
        setField(term46714, term46714.getClass(), "firstChild", null);
        setField(term46714, term46714.getClass(), "fNodeListCache", null);
        setField(term46714, term46714.getClass(), "previousSibling", null);
        setField(term46714, term46714.getClass(), "nextSibling", null);
        setField(term46714, term46714.getClass(), "ownerNode", null);
        setShortField(term46714, term46714.getClass(), "flags", (short) 0);
        setField(term46713, term46713.getClass(), "node", term46714);
        setField(term46713, term46713.getClass(), "namespaces", term46715);
        setField(term46713, term46713.getClass(), "defaultNamespace", null);
        setField(term46713, term46713.getClass(), "id", null);
        setField(term46713, term46713.getClass(), "localNamespaceResolver", null);
        setIntField(term46713, term46713.getClass(), "index", 0);
        setBooleanField(term46713, term46713.getClass(), "attribute", false);
        setField(term46713, term46713.getClass(), "namespaceResolver", null);
        setField(term46713, term46713.getClass(), "rootNode", null);
        setField(term46713, term46713.getClass(), "parent", null);
        setField(term46713, term46713.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = " ";
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term45029, args);
        assertTrue(recursiveEquals(term45029, term46713));
        assertTrue(recursiveEquals(retValue, null));
    }

};


