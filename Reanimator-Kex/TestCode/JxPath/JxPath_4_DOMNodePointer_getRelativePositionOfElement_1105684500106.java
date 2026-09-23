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

public class DOMNodePointer_getRelativePositionOfElement_1105684500106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14959;
     Object term17505;

    public DOMNodePointer_getRelativePositionOfElement_1105684500106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14959 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term15043 = newInstance(Class.forName("org.apache.html.dom.HTMLMetaElementImpl"));
        setField(term14959, term14959.getClass(), "node", term15043);
        term17505 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term17506 = newInstance(Class.forName("org.apache.html.dom.HTMLMetaElementImpl"));
        setField(term17506, term17506.getClass(), "name", null);
        setField(term17506, term17506.getClass(), "attributes", null);
        setField(term17506, term17506.getClass(), "ownerDocument", null);
        setField(term17506, term17506.getClass(), "firstChild", null);
        setField(term17506, term17506.getClass(), "fNodeListCache", null);
        setField(term17506, term17506.getClass(), "previousSibling", null);
        setField(term17506, term17506.getClass(), "nextSibling", null);
        setField(term17506, term17506.getClass(), "ownerNode", null);
        setShortField(term17506, term17506.getClass(), "flags", (short) 0);
        setField(term17505, term17505.getClass(), "node", term17506);
        setField(term17505, term17505.getClass(), "namespaces", null);
        setField(term17505, term17505.getClass(), "defaultNamespace", null);
        setField(term17505, term17505.getClass(), "id", null);
        setIntField(term17505, term17505.getClass(), "index", 0);
        setBooleanField(term17505, term17505.getClass(), "attribute", false);
        setField(term17505, term17505.getClass(), "rootNode", null);
        setField(term17505, term17505.getClass(), "namespaceResolver", null);
        setField(term17505, term17505.getClass(), "parent", null);
        setField(term17505, term17505.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRelativePositionOfElement", argTypes, term14959, args);
        assertTrue(recursiveEquals(term14959, term17505));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


