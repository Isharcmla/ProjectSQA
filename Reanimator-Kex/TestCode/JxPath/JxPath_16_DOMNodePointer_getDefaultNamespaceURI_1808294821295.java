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

public class DOMNodePointer_getDefaultNamespaceURI_1808294821295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75882;
     Object term76055;

    public DOMNodePointer_getDefaultNamespaceURI_1808294821295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75882 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term75972 = newInstance(Class.forName("org.apache.xerces.impl.xs.dom.DocumentImpl"));
        setField(term75882, term75882.getClass(), "defaultNamespace", null);
        setField(term75882, term75882.getClass(), "node", term75972);
        term76055 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term76056 = newInstance(Class.forName("org.apache.xerces.impl.xs.dom.DocumentImpl"));
        setField(term76056, term76056.getClass(), "fNodePool", null);
        setField(term76056, term76056.getClass(), "docType", null);
        setField(term76056, term76056.getClass(), "docElement", null);
        setField(term76056, term76056.getClass(), "fFreeNLCache", null);
        setField(term76056, term76056.getClass(), "encoding", null);
        setField(term76056, term76056.getClass(), "actualEncoding", null);
        setField(term76056, term76056.getClass(), "version", null);
        setBooleanField(term76056, term76056.getClass(), "standalone", false);
        setField(term76056, term76056.getClass(), "fDocumentURI", null);
        setField(term76056, term76056.getClass(), "userData", null);
        setField(term76056, term76056.getClass(), "identifiers", null);
        setField(term76056, term76056.getClass(), "domNormalizer", null);
        setField(term76056, term76056.getClass(), "fConfiguration", null);
        setIntField(term76056, term76056.getClass(), "changes", 0);
        setBooleanField(term76056, term76056.getClass(), "allowGrammarAccess", false);
        setBooleanField(term76056, term76056.getClass(), "errorChecking", false);
        setIntField(term76056, term76056.getClass(), "documentNumber", 0);
        setIntField(term76056, term76056.getClass(), "nodeCounter", 0);
        setField(term76056, term76056.getClass(), "nodeTable", null);
        setField(term76056, term76056.getClass(), "ownerDocument", null);
        setField(term76056, term76056.getClass(), "firstChild", null);
        setField(term76056, term76056.getClass(), "fNodeListCache", null);
        setField(term76056, term76056.getClass(), "previousSibling", null);
        setField(term76056, term76056.getClass(), "nextSibling", null);
        setField(term76056, term76056.getClass(), "ownerNode", null);
        setShortField(term76056, term76056.getClass(), "flags", (short) 0);
        setField(term76055, term76055.getClass(), "node", term76056);
        setField(term76055, term76055.getClass(), "namespaces", null);
        setField(term76055, term76055.getClass(), "defaultNamespace", "");
        setField(term76055, term76055.getClass(), "id", null);
        setField(term76055, term76055.getClass(), "localNamespaceResolver", null);
        setIntField(term76055, term76055.getClass(), "index", 0);
        setBooleanField(term76055, term76055.getClass(), "attribute", false);
        setField(term76055, term76055.getClass(), "rootNode", null);
        setField(term76055, term76055.getClass(), "namespaceResolver", null);
        setField(term76055, term76055.getClass(), "parent", null);
        setField(term76055, term76055.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDefaultNamespaceURI", argTypes, term75882, args);
        assertTrue(recursiveEquals(term75882, term76055));
        assertTrue(recursiveEquals(retValue, null));
    }

};


