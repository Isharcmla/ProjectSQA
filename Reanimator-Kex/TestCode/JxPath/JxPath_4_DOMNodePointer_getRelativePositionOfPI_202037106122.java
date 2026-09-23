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

public class DOMNodePointer_getRelativePositionOfPI_202037106122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18574;
     Object term20614;

    public DOMNodePointer_getRelativePositionOfPI_202037106122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18574 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term18664 = newInstance(Class.forName("org.apache.html.dom.HTMLIsIndexElementImpl"));
        setField(term18574, term18574.getClass(), "node", term18664);
        term20614 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term20615 = newInstance(Class.forName("org.apache.html.dom.HTMLIsIndexElementImpl"));
        setField(term20615, term20615.getClass(), "name", null);
        setField(term20615, term20615.getClass(), "attributes", null);
        setField(term20615, term20615.getClass(), "ownerDocument", null);
        setField(term20615, term20615.getClass(), "firstChild", null);
        setField(term20615, term20615.getClass(), "fNodeListCache", null);
        setField(term20615, term20615.getClass(), "previousSibling", null);
        setField(term20615, term20615.getClass(), "nextSibling", null);
        setField(term20615, term20615.getClass(), "ownerNode", null);
        setShortField(term20615, term20615.getClass(), "flags", (short) 0);
        setField(term20614, term20614.getClass(), "node", term20615);
        setField(term20614, term20614.getClass(), "namespaces", null);
        setField(term20614, term20614.getClass(), "defaultNamespace", null);
        setField(term20614, term20614.getClass(), "id", null);
        setIntField(term20614, term20614.getClass(), "index", 0);
        setBooleanField(term20614, term20614.getClass(), "attribute", false);
        setField(term20614, term20614.getClass(), "rootNode", null);
        setField(term20614, term20614.getClass(), "namespaceResolver", null);
        setField(term20614, term20614.getClass(), "parent", null);
        setField(term20614, term20614.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "getRelativePositionOfPI", argTypes, term18574, args);
        assertTrue(recursiveEquals(term18574, term20614));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


