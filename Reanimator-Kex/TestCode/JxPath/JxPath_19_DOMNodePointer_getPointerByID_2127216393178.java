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

public class DOMNodePointer_getPointerByID_2127216393178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36658;
     Object term37090;
     Object term37086;

    public DOMNodePointer_getPointerByID_2127216393178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36658 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term36746 = newInstance(Class.forName("org.apache.html.dom.HTMLLegendElementImpl"));
        Object term36828 = newInstance(Class.forName("org.apache.xerces.dom.CoreDocumentImpl"));
        setField(term36746, term36746.getClass(), "ownerDocument", term36828);
        setField(term36658, term36658.getClass(), "node", term36746);
        term37090 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term37091 = newInstance(Class.forName("org.apache.html.dom.HTMLLegendElementImpl"));
        Object term37092 = newInstance(Class.forName("org.apache.xerces.dom.CoreDocumentImpl"));
        setField(term37091, term37091.getClass(), "name", null);
        setField(term37091, term37091.getClass(), "attributes", null);
        setField(term37092, term37092.getClass(), "docType", null);
        setField(term37092, term37092.getClass(), "docElement", null);
        setField(term37092, term37092.getClass(), "fFreeNLCache", null);
        setField(term37092, term37092.getClass(), "encoding", null);
        setField(term37092, term37092.getClass(), "actualEncoding", null);
        setField(term37092, term37092.getClass(), "version", null);
        setBooleanField(term37092, term37092.getClass(), "standalone", false);
        setField(term37092, term37092.getClass(), "fDocumentURI", null);
        setField(term37092, term37092.getClass(), "userData", null);
        setField(term37092, term37092.getClass(), "identifiers", null);
        setField(term37092, term37092.getClass(), "domNormalizer", null);
        setField(term37092, term37092.getClass(), "fConfiguration", null);
        setIntField(term37092, term37092.getClass(), "changes", 0);
        setBooleanField(term37092, term37092.getClass(), "allowGrammarAccess", false);
        setBooleanField(term37092, term37092.getClass(), "errorChecking", false);
        setIntField(term37092, term37092.getClass(), "documentNumber", 0);
        setIntField(term37092, term37092.getClass(), "nodeCounter", 0);
        setField(term37092, term37092.getClass(), "nodeTable", null);
        setField(term37092, term37092.getClass(), "ownerDocument", null);
        setField(term37092, term37092.getClass(), "firstChild", null);
        setField(term37092, term37092.getClass(), "fNodeListCache", null);
        setField(term37092, term37092.getClass(), "previousSibling", null);
        setField(term37092, term37092.getClass(), "nextSibling", null);
        setField(term37092, term37092.getClass(), "ownerNode", null);
        setShortField(term37092, term37092.getClass(), "flags", (short) 0);
        setField(term37091, term37091.getClass(), "ownerDocument", term37092);
        setField(term37091, term37091.getClass(), "firstChild", null);
        setField(term37091, term37091.getClass(), "fNodeListCache", null);
        setField(term37091, term37091.getClass(), "previousSibling", null);
        setField(term37091, term37091.getClass(), "nextSibling", null);
        setField(term37091, term37091.getClass(), "ownerNode", null);
        setShortField(term37091, term37091.getClass(), "flags", (short) 0);
        setField(term37090, term37090.getClass(), "node", term37091);
        setField(term37090, term37090.getClass(), "namespaces", null);
        setField(term37090, term37090.getClass(), "defaultNamespace", null);
        setField(term37090, term37090.getClass(), "id", null);
        setField(term37090, term37090.getClass(), "localNamespaceResolver", null);
        setIntField(term37090, term37090.getClass(), "index", 0);
        setBooleanField(term37090, term37090.getClass(), "attribute", false);
        setField(term37090, term37090.getClass(), "namespaceResolver", null);
        setField(term37090, term37090.getClass(), "rootNode", null);
        setField(term37090, term37090.getClass(), "parent", null);
        setField(term37090, term37090.getClass(), "locale", null);
        term37086 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
        Object term37087 = newInstance(Class.forName("java.lang.Object"));
        setField(term37086, term37086.getClass(), "name", null);
        setField(term37086, term37086.getClass(), "id", null);
        setField(term37086, term37086.getClass(), "value", term37087);
        setIntField(term37086, term37086.getClass(), "index", -2147483648);
        setBooleanField(term37086, term37086.getClass(), "attribute", false);
        setField(term37086, term37086.getClass(), "namespaceResolver", null);
        setField(term37086, term37086.getClass(), "rootNode", null);
        setField(term37086, term37086.getClass(), "parent", null);
        setField(term37086, term37086.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.JXPathContext");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object retValue = callMethod(klass, "getPointerByID", argTypes, term36658, args);
        assertTrue(recursiveEquals(term36658, term37090));
        assertTrue(recursiveEquals(retValue, term37086));
    }

};


