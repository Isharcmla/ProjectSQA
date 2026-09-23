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

public class DOMNodePointer_getNamespaceURI_378658202281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69527;
     Object term69736;

    public DOMNodePointer_getNamespaceURI_378658202281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69527 = newInstance(Class.forName("org.apache.xerces.impl.xs.dom.DocumentImpl"));
        Object term69599 = newInstance(Class.forName("org.apache.xerces.dom.ElementImpl"));
        setShortField(term69527, term69527.getClass(), "flags", (short) 0);
        setShortField(term69599, term69599.getClass(), "flags", (short) 0);
        setField(term69599, term69599.getClass(), "name", "");
        setField(term69527, term69527.getClass(), "docElement", term69599);
        term69736 = newInstance(Class.forName("org.apache.xerces.impl.xs.dom.DocumentImpl"));
        Object term69737 = newInstance(Class.forName("org.apache.xerces.dom.ElementImpl"));
        setField(term69736, term69736.getClass(), "fNodePool", null);
        setField(term69736, term69736.getClass(), "docType", null);
        setField(term69737, term69737.getClass(), "name", "");
        setField(term69737, term69737.getClass(), "attributes", null);
        setField(term69737, term69737.getClass(), "ownerDocument", null);
        setField(term69737, term69737.getClass(), "firstChild", null);
        setField(term69737, term69737.getClass(), "fNodeListCache", null);
        setField(term69737, term69737.getClass(), "previousSibling", null);
        setField(term69737, term69737.getClass(), "nextSibling", null);
        setField(term69737, term69737.getClass(), "ownerNode", null);
        setShortField(term69737, term69737.getClass(), "flags", (short) 0);
        setField(term69736, term69736.getClass(), "docElement", term69737);
        setField(term69736, term69736.getClass(), "fFreeNLCache", null);
        setField(term69736, term69736.getClass(), "encoding", null);
        setField(term69736, term69736.getClass(), "actualEncoding", null);
        setField(term69736, term69736.getClass(), "version", null);
        setBooleanField(term69736, term69736.getClass(), "standalone", false);
        setField(term69736, term69736.getClass(), "fDocumentURI", null);
        setField(term69736, term69736.getClass(), "userData", null);
        setField(term69736, term69736.getClass(), "identifiers", null);
        setField(term69736, term69736.getClass(), "domNormalizer", null);
        setField(term69736, term69736.getClass(), "fConfiguration", null);
        setIntField(term69736, term69736.getClass(), "changes", 0);
        setBooleanField(term69736, term69736.getClass(), "allowGrammarAccess", false);
        setBooleanField(term69736, term69736.getClass(), "errorChecking", false);
        setIntField(term69736, term69736.getClass(), "documentNumber", 0);
        setIntField(term69736, term69736.getClass(), "nodeCounter", 0);
        setField(term69736, term69736.getClass(), "nodeTable", null);
        setField(term69736, term69736.getClass(), "ownerDocument", null);
        setField(term69736, term69736.getClass(), "firstChild", null);
        setField(term69736, term69736.getClass(), "fNodeListCache", null);
        setField(term69736, term69736.getClass(), "previousSibling", null);
        setField(term69736, term69736.getClass(), "nextSibling", null);
        setField(term69736, term69736.getClass(), "ownerNode", null);
        setShortField(term69736, term69736.getClass(), "flags", (short) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.w3c.dom.Node");
        Object[] args = new Object[1];
        args[0] = term69527;
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, null, args);
        assertTrue(recursiveEquals(term69527, term69736));
        assertTrue(recursiveEquals(retValue, null));
    }

};


