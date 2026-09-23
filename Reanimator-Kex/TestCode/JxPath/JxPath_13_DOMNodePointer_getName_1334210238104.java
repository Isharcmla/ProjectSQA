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

public class DOMNodePointer_getName_1334210238104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14687;
     Object term16607;
     Object term16595;

    public DOMNodePointer_getName_1334210238104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14687 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term14777 = newInstance(Class.forName("org.apache.xerces.impl.xs.dom.DocumentImpl"));
        setField(term14687, term14687.getClass(), "node", term14777);
        term16607 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term16608 = newInstance(Class.forName("org.apache.xerces.impl.xs.dom.DocumentImpl"));
        setField(term16608, term16608.getClass(), "fNodePool", null);
        setField(term16608, term16608.getClass(), "docType", null);
        setField(term16608, term16608.getClass(), "docElement", null);
        setField(term16608, term16608.getClass(), "fFreeNLCache", null);
        setField(term16608, term16608.getClass(), "encoding", null);
        setField(term16608, term16608.getClass(), "actualEncoding", null);
        setField(term16608, term16608.getClass(), "version", null);
        setBooleanField(term16608, term16608.getClass(), "standalone", false);
        setField(term16608, term16608.getClass(), "fDocumentURI", null);
        setField(term16608, term16608.getClass(), "userData", null);
        setField(term16608, term16608.getClass(), "identifiers", null);
        setField(term16608, term16608.getClass(), "domNormalizer", null);
        setField(term16608, term16608.getClass(), "fConfiguration", null);
        setIntField(term16608, term16608.getClass(), "changes", 0);
        setBooleanField(term16608, term16608.getClass(), "allowGrammarAccess", false);
        setBooleanField(term16608, term16608.getClass(), "errorChecking", false);
        setIntField(term16608, term16608.getClass(), "documentNumber", 0);
        setIntField(term16608, term16608.getClass(), "nodeCounter", 0);
        setField(term16608, term16608.getClass(), "nodeTable", null);
        setField(term16608, term16608.getClass(), "ownerDocument", null);
        setField(term16608, term16608.getClass(), "firstChild", null);
        setField(term16608, term16608.getClass(), "fNodeListCache", null);
        setField(term16608, term16608.getClass(), "previousSibling", null);
        setField(term16608, term16608.getClass(), "nextSibling", null);
        setField(term16608, term16608.getClass(), "ownerNode", null);
        setShortField(term16608, term16608.getClass(), "flags", (short) 0);
        setField(term16607, term16607.getClass(), "node", term16608);
        setField(term16607, term16607.getClass(), "namespaces", null);
        setField(term16607, term16607.getClass(), "defaultNamespace", null);
        setField(term16607, term16607.getClass(), "id", null);
        setIntField(term16607, term16607.getClass(), "index", 0);
        setBooleanField(term16607, term16607.getClass(), "attribute", false);
        setField(term16607, term16607.getClass(), "rootNode", null);
        setField(term16607, term16607.getClass(), "namespaceResolver", null);
        setField(term16607, term16607.getClass(), "parent", null);
        setField(term16607, term16607.getClass(), "locale", null);
        term16595 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term16595, term16595.getClass(), "prefix", null);
        setField(term16595, term16595.getClass(), "name", null);
        setField(term16595, term16595.getClass(), "qualifiedName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getName", argTypes, term14687, args);
        assertTrue(recursiveEquals(term14687, term16607));
        assertTrue(recursiveEquals(retValue, term16595));
    }

};


