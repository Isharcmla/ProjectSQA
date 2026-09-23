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

public class DOMNodePointer_getLanguage_1637969683165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32059;
     Object term32172;

    public DOMNodePointer_getLanguage_1637969683165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32059 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term32135 = newInstance(Class.forName("org.apache.wml.dom.WMLGoElementImpl"));
        setField(term32059, term32059.getClass(), "node", term32135);
        term32172 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term32173 = newInstance(Class.forName("org.apache.wml.dom.WMLGoElementImpl"));
        setField(term32173, term32173.getClass(), "name", null);
        setField(term32173, term32173.getClass(), "attributes", null);
        setField(term32173, term32173.getClass(), "ownerDocument", null);
        setField(term32173, term32173.getClass(), "firstChild", null);
        setField(term32173, term32173.getClass(), "fNodeListCache", null);
        setField(term32173, term32173.getClass(), "previousSibling", null);
        setField(term32173, term32173.getClass(), "nextSibling", null);
        setField(term32173, term32173.getClass(), "ownerNode", null);
        setShortField(term32173, term32173.getClass(), "flags", (short) 0);
        setField(term32172, term32172.getClass(), "node", term32173);
        setField(term32172, term32172.getClass(), "namespaces", null);
        setField(term32172, term32172.getClass(), "defaultNamespace", null);
        setField(term32172, term32172.getClass(), "id", null);
        setField(term32172, term32172.getClass(), "localNamespaceResolver", null);
        setIntField(term32172, term32172.getClass(), "index", 0);
        setBooleanField(term32172, term32172.getClass(), "attribute", false);
        setField(term32172, term32172.getClass(), "namespaceResolver", null);
        setField(term32172, term32172.getClass(), "exceptionHandler", null);
        setField(term32172, term32172.getClass(), "rootNode", null);
        setField(term32172, term32172.getClass(), "parent", null);
        setField(term32172, term32172.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLanguage", argTypes, term32059, args);
        assertTrue(recursiveEquals(term32059, term32172));
        assertTrue(recursiveEquals(retValue, null));
    }

};


