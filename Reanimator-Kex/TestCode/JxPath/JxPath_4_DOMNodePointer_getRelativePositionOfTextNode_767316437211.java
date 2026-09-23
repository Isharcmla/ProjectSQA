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

public class DOMNodePointer_getRelativePositionOfTextNode_767316437211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51640;
     Object term51854;

    public DOMNodePointer_getRelativePositionOfTextNode_767316437211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51640 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term51734 = newInstance(Class.forName("org.apache.html.dom.HTMLParagraphElementImpl"));
        Object term51828 = newInstance(Class.forName("org.apache.html.dom.HTMLParagraphElementImpl"));
        setShortField(term51734, term51734.getClass(), "flags", (short) 0);
        setField(term51734, term51734.getClass(), "previousSibling", term51828);
        setField(term51640, term51640.getClass(), "node", term51734);
        term51854 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term51855 = newInstance(Class.forName("org.apache.html.dom.HTMLParagraphElementImpl"));
        Object term51856 = newInstance(Class.forName("org.apache.html.dom.HTMLParagraphElementImpl"));
        setField(term51855, term51855.getClass(), "name", null);
        setField(term51855, term51855.getClass(), "attributes", null);
        setField(term51855, term51855.getClass(), "ownerDocument", null);
        setField(term51855, term51855.getClass(), "firstChild", null);
        setField(term51855, term51855.getClass(), "fNodeListCache", null);
        setField(term51856, term51856.getClass(), "name", null);
        setField(term51856, term51856.getClass(), "attributes", null);
        setField(term51856, term51856.getClass(), "ownerDocument", null);
        setField(term51856, term51856.getClass(), "firstChild", null);
        setField(term51856, term51856.getClass(), "fNodeListCache", null);
        setField(term51856, term51856.getClass(), "previousSibling", null);
        setField(term51856, term51856.getClass(), "nextSibling", null);
        setField(term51856, term51856.getClass(), "ownerNode", null);
        setShortField(term51856, term51856.getClass(), "flags", (short) 0);
        setField(term51855, term51855.getClass(), "previousSibling", term51856);
        setField(term51855, term51855.getClass(), "nextSibling", null);
        setField(term51855, term51855.getClass(), "ownerNode", null);
        setShortField(term51855, term51855.getClass(), "flags", (short) 0);
        setField(term51854, term51854.getClass(), "node", term51855);
        setField(term51854, term51854.getClass(), "namespaces", null);
        setField(term51854, term51854.getClass(), "defaultNamespace", null);
        setField(term51854, term51854.getClass(), "id", null);
        setIntField(term51854, term51854.getClass(), "index", 0);
        setBooleanField(term51854, term51854.getClass(), "attribute", false);
        setField(term51854, term51854.getClass(), "rootNode", null);
        setField(term51854, term51854.getClass(), "namespaceResolver", null);
        setField(term51854, term51854.getClass(), "parent", null);
        setField(term51854, term51854.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRelativePositionOfTextNode", argTypes, term51640, args);
        assertTrue(recursiveEquals(term51640, term51854));
    }

};


