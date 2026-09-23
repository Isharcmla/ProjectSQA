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

public class DOMNodePointer_isLeaf_486659650125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20991;
     Object term21094;

    public DOMNodePointer_isLeaf_486659650125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20991 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term21077 = newInstance(Class.forName("org.apache.wml.dom.WMLOneventElementImpl"));
        setField(term20991, term20991.getClass(), "node", term21077);
        term21094 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term21095 = newInstance(Class.forName("org.apache.wml.dom.WMLOneventElementImpl"));
        setField(term21095, term21095.getClass(), "name", null);
        setField(term21095, term21095.getClass(), "attributes", null);
        setField(term21095, term21095.getClass(), "ownerDocument", null);
        setField(term21095, term21095.getClass(), "firstChild", null);
        setField(term21095, term21095.getClass(), "fNodeListCache", null);
        setField(term21095, term21095.getClass(), "previousSibling", null);
        setField(term21095, term21095.getClass(), "nextSibling", null);
        setField(term21095, term21095.getClass(), "ownerNode", null);
        setShortField(term21095, term21095.getClass(), "flags", (short) 0);
        setField(term21094, term21094.getClass(), "node", term21095);
        setField(term21094, term21094.getClass(), "namespaces", null);
        setField(term21094, term21094.getClass(), "defaultNamespace", null);
        setField(term21094, term21094.getClass(), "id", null);
        setIntField(term21094, term21094.getClass(), "index", 0);
        setBooleanField(term21094, term21094.getClass(), "attribute", false);
        setField(term21094, term21094.getClass(), "rootNode", null);
        setField(term21094, term21094.getClass(), "namespaceResolver", null);
        setField(term21094, term21094.getClass(), "parent", null);
        setField(term21094, term21094.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isLeaf", argTypes, term20991, args);
        assertTrue(recursiveEquals(term20991, term21094));
        assertTrue(recursiveEquals(retValue, true));
    }

};


