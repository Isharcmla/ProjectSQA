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

public class DOMNodePointer_getRelativePositionByName_1797079143151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28699;
     Object term28806;

    public DOMNodePointer_getRelativePositionByName_1797079143151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28699 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term28779 = newInstance(Class.forName("org.apache.wml.dom.WMLMetaElementImpl"));
        setField(term28699, term28699.getClass(), "node", term28779);
        term28806 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term28807 = newInstance(Class.forName("org.apache.wml.dom.WMLMetaElementImpl"));
        setField(term28807, term28807.getClass(), "name", null);
        setField(term28807, term28807.getClass(), "attributes", null);
        setField(term28807, term28807.getClass(), "ownerDocument", null);
        setField(term28807, term28807.getClass(), "firstChild", null);
        setField(term28807, term28807.getClass(), "fNodeListCache", null);
        setField(term28807, term28807.getClass(), "previousSibling", null);
        setField(term28807, term28807.getClass(), "nextSibling", null);
        setField(term28807, term28807.getClass(), "ownerNode", null);
        setShortField(term28807, term28807.getClass(), "flags", (short) 0);
        setField(term28806, term28806.getClass(), "node", term28807);
        setField(term28806, term28806.getClass(), "namespaces", null);
        setField(term28806, term28806.getClass(), "defaultNamespace", null);
        setField(term28806, term28806.getClass(), "id", null);
        setIntField(term28806, term28806.getClass(), "index", 0);
        setBooleanField(term28806, term28806.getClass(), "attribute", false);
        setField(term28806, term28806.getClass(), "rootNode", null);
        setField(term28806, term28806.getClass(), "namespaceResolver", null);
        setField(term28806, term28806.getClass(), "parent", null);
        setField(term28806, term28806.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRelativePositionByName", argTypes, term28699, args);
        assertTrue(recursiveEquals(term28699, term28806));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


