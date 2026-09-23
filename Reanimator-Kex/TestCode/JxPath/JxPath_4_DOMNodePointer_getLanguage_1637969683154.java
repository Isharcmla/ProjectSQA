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

public class DOMNodePointer_getLanguage_1637969683154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28928;
     Object term29719;

    public DOMNodePointer_getLanguage_1637969683154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28928 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term29018 = newInstance(Class.forName("org.apache.xerces.impl.xs.dom.DocumentImpl"));
        setField(term28928, term28928.getClass(), "node", term29018);
        term29719 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term29720 = newInstance(Class.forName("org.apache.xerces.impl.xs.dom.DocumentImpl"));
        setField(term29720, term29720.getClass(), "fNodePool", null);
        setField(term29720, term29720.getClass(), "docType", null);
        setField(term29720, term29720.getClass(), "docElement", null);
        setField(term29720, term29720.getClass(), "fFreeNLCache", null);
        setField(term29720, term29720.getClass(), "encoding", null);
        setField(term29720, term29720.getClass(), "actualEncoding", null);
        setField(term29720, term29720.getClass(), "version", null);
        setBooleanField(term29720, term29720.getClass(), "standalone", false);
        setField(term29720, term29720.getClass(), "fDocumentURI", null);
        setField(term29720, term29720.getClass(), "userData", null);
        setField(term29720, term29720.getClass(), "identifiers", null);
        setField(term29720, term29720.getClass(), "domNormalizer", null);
        setField(term29720, term29720.getClass(), "fConfiguration", null);
        setIntField(term29720, term29720.getClass(), "changes", 0);
        setBooleanField(term29720, term29720.getClass(), "allowGrammarAccess", false);
        setBooleanField(term29720, term29720.getClass(), "errorChecking", false);
        setIntField(term29720, term29720.getClass(), "documentNumber", 0);
        setIntField(term29720, term29720.getClass(), "nodeCounter", 0);
        setField(term29720, term29720.getClass(), "nodeTable", null);
        setField(term29720, term29720.getClass(), "ownerDocument", null);
        setField(term29720, term29720.getClass(), "firstChild", null);
        setField(term29720, term29720.getClass(), "fNodeListCache", null);
        setField(term29720, term29720.getClass(), "previousSibling", null);
        setField(term29720, term29720.getClass(), "nextSibling", null);
        setField(term29720, term29720.getClass(), "ownerNode", null);
        setShortField(term29720, term29720.getClass(), "flags", (short) 0);
        setField(term29719, term29719.getClass(), "node", term29720);
        setField(term29719, term29719.getClass(), "namespaces", null);
        setField(term29719, term29719.getClass(), "defaultNamespace", null);
        setField(term29719, term29719.getClass(), "id", null);
        setIntField(term29719, term29719.getClass(), "index", 0);
        setBooleanField(term29719, term29719.getClass(), "attribute", false);
        setField(term29719, term29719.getClass(), "rootNode", null);
        setField(term29719, term29719.getClass(), "namespaceResolver", null);
        setField(term29719, term29719.getClass(), "parent", null);
        setField(term29719, term29719.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLanguage", argTypes, term28928, args);
        assertTrue(recursiveEquals(term28928, term29719));
        assertTrue(recursiveEquals(retValue, null));
    }

};


