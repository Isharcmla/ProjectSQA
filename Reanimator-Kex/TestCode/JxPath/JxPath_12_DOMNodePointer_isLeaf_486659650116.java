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

public class DOMNodePointer_isLeaf_486659650116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16563;
     Object term18509;

    public DOMNodePointer_isLeaf_486659650116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16563 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term16641 = newInstance(Class.forName("org.apache.wml.dom.WMLWmlElementImpl"));
        setField(term16563, term16563.getClass(), "node", term16641);
        term18509 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term18510 = newInstance(Class.forName("org.apache.wml.dom.WMLWmlElementImpl"));
        setField(term18510, term18510.getClass(), "name", null);
        setField(term18510, term18510.getClass(), "attributes", null);
        setField(term18510, term18510.getClass(), "ownerDocument", null);
        setField(term18510, term18510.getClass(), "firstChild", null);
        setField(term18510, term18510.getClass(), "fNodeListCache", null);
        setField(term18510, term18510.getClass(), "previousSibling", null);
        setField(term18510, term18510.getClass(), "nextSibling", null);
        setField(term18510, term18510.getClass(), "ownerNode", null);
        setShortField(term18510, term18510.getClass(), "flags", (short) 0);
        setField(term18509, term18509.getClass(), "node", term18510);
        setField(term18509, term18509.getClass(), "namespaces", null);
        setField(term18509, term18509.getClass(), "defaultNamespace", null);
        setField(term18509, term18509.getClass(), "id", null);
        setIntField(term18509, term18509.getClass(), "index", 0);
        setBooleanField(term18509, term18509.getClass(), "attribute", false);
        setField(term18509, term18509.getClass(), "rootNode", null);
        setField(term18509, term18509.getClass(), "namespaceResolver", null);
        setField(term18509, term18509.getClass(), "parent", null);
        setField(term18509, term18509.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isLeaf", argTypes, term16563, args);
        assertTrue(recursiveEquals(term16563, term18509));
        assertTrue(recursiveEquals(retValue, true));
    }

};


