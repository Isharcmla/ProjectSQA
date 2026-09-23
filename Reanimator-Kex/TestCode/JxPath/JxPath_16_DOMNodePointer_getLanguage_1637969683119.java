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

public class DOMNodePointer_getLanguage_1637969683119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20192;
     Object term20317;

    public DOMNodePointer_getLanguage_1637969683119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20192 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term20268 = newInstance(Class.forName("org.apache.html.dom.HTMLElementImpl"));
        setField(term20192, term20192.getClass(), "node", term20268);
        term20317 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term20318 = newInstance(Class.forName("org.apache.html.dom.HTMLElementImpl"));
        setField(term20318, term20318.getClass(), "name", null);
        setField(term20318, term20318.getClass(), "attributes", null);
        setField(term20318, term20318.getClass(), "ownerDocument", null);
        setField(term20318, term20318.getClass(), "firstChild", null);
        setField(term20318, term20318.getClass(), "fNodeListCache", null);
        setField(term20318, term20318.getClass(), "previousSibling", null);
        setField(term20318, term20318.getClass(), "nextSibling", null);
        setField(term20318, term20318.getClass(), "ownerNode", null);
        setShortField(term20318, term20318.getClass(), "flags", (short) 0);
        setField(term20317, term20317.getClass(), "node", term20318);
        setField(term20317, term20317.getClass(), "namespaces", null);
        setField(term20317, term20317.getClass(), "defaultNamespace", null);
        setField(term20317, term20317.getClass(), "id", null);
        setField(term20317, term20317.getClass(), "localNamespaceResolver", null);
        setIntField(term20317, term20317.getClass(), "index", 0);
        setBooleanField(term20317, term20317.getClass(), "attribute", false);
        setField(term20317, term20317.getClass(), "rootNode", null);
        setField(term20317, term20317.getClass(), "namespaceResolver", null);
        setField(term20317, term20317.getClass(), "parent", null);
        setField(term20317, term20317.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLanguage", argTypes, term20192, args);
        assertTrue(recursiveEquals(term20192, term20317));
        assertTrue(recursiveEquals(retValue, null));
    }

};


