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

public class DOMNodePointer_isLeaf_486659650107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16640;
     Object term17979;

    public DOMNodePointer_isLeaf_486659650107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16640 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term16732 = newInstance(Class.forName("org.apache.html.dom.HTMLTableColElementImpl"));
        setField(term16640, term16640.getClass(), "node", term16732);
        term17979 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term17980 = newInstance(Class.forName("org.apache.html.dom.HTMLTableColElementImpl"));
        setField(term17980, term17980.getClass(), "name", null);
        setField(term17980, term17980.getClass(), "attributes", null);
        setField(term17980, term17980.getClass(), "ownerDocument", null);
        setField(term17980, term17980.getClass(), "firstChild", null);
        setField(term17980, term17980.getClass(), "fNodeListCache", null);
        setField(term17980, term17980.getClass(), "previousSibling", null);
        setField(term17980, term17980.getClass(), "nextSibling", null);
        setField(term17980, term17980.getClass(), "ownerNode", null);
        setShortField(term17980, term17980.getClass(), "flags", (short) 0);
        setField(term17979, term17979.getClass(), "node", term17980);
        setField(term17979, term17979.getClass(), "namespaces", null);
        setField(term17979, term17979.getClass(), "defaultNamespace", null);
        setField(term17979, term17979.getClass(), "id", null);
        setField(term17979, term17979.getClass(), "localNamespaceResolver", null);
        setIntField(term17979, term17979.getClass(), "index", 0);
        setBooleanField(term17979, term17979.getClass(), "attribute", false);
        setField(term17979, term17979.getClass(), "rootNode", null);
        setField(term17979, term17979.getClass(), "namespaceResolver", null);
        setField(term17979, term17979.getClass(), "parent", null);
        setField(term17979, term17979.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isLeaf", argTypes, term16640, args);
        assertTrue(recursiveEquals(term16640, term17979));
        assertTrue(recursiveEquals(retValue, true));
    }

};


