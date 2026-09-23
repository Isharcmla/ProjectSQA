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

public class DOMNodePointer_setValue_96835476237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51948;
     Object term52120;
     Object term52224;
     Object term52226;

    public DOMNodePointer_setValue_96835476237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51948 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term52034 = newInstance(Class.forName("org.apache.html.dom.HTMLTitleElementImpl"));
        setShortField(term52034, term52034.getClass(), "flags", (short) 0);
        setField(term52034, term52034.getClass(), "fNodeListCache", null);
        setField(term52034, term52034.getClass(), "firstChild", null);
        setField(term51948, term51948.getClass(), "node", term52034);
        term52120 = newInstance(Class.forName("org.apache.html.dom.HTMLTitleElementImpl"));
        term52224 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term52225 = newInstance(Class.forName("org.apache.html.dom.HTMLTitleElementImpl"));
        setField(term52225, term52225.getClass(), "name", null);
        setField(term52225, term52225.getClass(), "attributes", null);
        setField(term52225, term52225.getClass(), "ownerDocument", null);
        setField(term52225, term52225.getClass(), "firstChild", null);
        setField(term52225, term52225.getClass(), "fNodeListCache", null);
        setField(term52225, term52225.getClass(), "previousSibling", null);
        setField(term52225, term52225.getClass(), "nextSibling", null);
        setField(term52225, term52225.getClass(), "ownerNode", null);
        setShortField(term52225, term52225.getClass(), "flags", (short) 0);
        setField(term52224, term52224.getClass(), "node", term52225);
        setField(term52224, term52224.getClass(), "namespaces", null);
        setField(term52224, term52224.getClass(), "defaultNamespace", null);
        setField(term52224, term52224.getClass(), "id", null);
        setField(term52224, term52224.getClass(), "localNamespaceResolver", null);
        setIntField(term52224, term52224.getClass(), "index", 0);
        setBooleanField(term52224, term52224.getClass(), "attribute", false);
        setField(term52224, term52224.getClass(), "namespaceResolver", null);
        setField(term52224, term52224.getClass(), "rootNode", null);
        setField(term52224, term52224.getClass(), "parent", null);
        setField(term52224, term52224.getClass(), "locale", null);
        term52226 = newInstance(Class.forName("org.apache.html.dom.HTMLTitleElementImpl"));
        setField(term52226, term52226.getClass(), "name", null);
        setField(term52226, term52226.getClass(), "attributes", null);
        setField(term52226, term52226.getClass(), "ownerDocument", null);
        setField(term52226, term52226.getClass(), "firstChild", null);
        setField(term52226, term52226.getClass(), "fNodeListCache", null);
        setField(term52226, term52226.getClass(), "previousSibling", null);
        setField(term52226, term52226.getClass(), "nextSibling", null);
        setField(term52226, term52226.getClass(), "ownerNode", null);
        setShortField(term52226, term52226.getClass(), "flags", (short) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term52120;
        callMethod(klass, "setValue", argTypes, term51948, args);
        assertTrue(recursiveEquals(term51948, term52224));
        assertTrue(recursiveEquals(term52120, term52226));
    }

};


