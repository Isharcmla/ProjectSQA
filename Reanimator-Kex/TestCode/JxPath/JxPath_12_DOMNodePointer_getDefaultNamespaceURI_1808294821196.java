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

public class DOMNodePointer_getDefaultNamespaceURI_1808294821196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41122;
     Object term42572;

    public DOMNodePointer_getDefaultNamespaceURI_1808294821196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41122 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term41214 = newInstance(Class.forName("org.apache.html.dom.HTMLTableColElementImpl"));
        setField(term41122, term41122.getClass(), "defaultNamespace", null);
        setField(term41122, term41122.getClass(), "node", term41214);
        term42572 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term42573 = newInstance(Class.forName("org.apache.html.dom.HTMLTableColElementImpl"));
        setField(term42573, term42573.getClass(), "name", null);
        setField(term42573, term42573.getClass(), "attributes", null);
        setField(term42573, term42573.getClass(), "ownerDocument", null);
        setField(term42573, term42573.getClass(), "firstChild", null);
        setField(term42573, term42573.getClass(), "fNodeListCache", null);
        setField(term42573, term42573.getClass(), "previousSibling", null);
        setField(term42573, term42573.getClass(), "nextSibling", null);
        setField(term42573, term42573.getClass(), "ownerNode", null);
        setShortField(term42573, term42573.getClass(), "flags", (short) 0);
        setField(term42572, term42572.getClass(), "node", term42573);
        setField(term42572, term42572.getClass(), "namespaces", null);
        setField(term42572, term42572.getClass(), "defaultNamespace", "");
        setField(term42572, term42572.getClass(), "id", null);
        setIntField(term42572, term42572.getClass(), "index", 0);
        setBooleanField(term42572, term42572.getClass(), "attribute", false);
        setField(term42572, term42572.getClass(), "rootNode", null);
        setField(term42572, term42572.getClass(), "namespaceResolver", null);
        setField(term42572, term42572.getClass(), "parent", null);
        setField(term42572, term42572.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDefaultNamespaceURI", argTypes, term41122, args);
        assertTrue(recursiveEquals(term41122, term42572));
        assertTrue(recursiveEquals(retValue, null));
    }

};


