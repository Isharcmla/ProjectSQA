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

public class DOMNodePointer_getRelativePositionOfPI_202037106273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79343;
     Object term79631;

    public DOMNodePointer_getRelativePositionOfPI_202037106273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79343 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term79425 = newInstance(Class.forName("org.apache.wml.dom.WMLTimerElementImpl"));
        Object term79507 = newInstance(Class.forName("org.apache.wml.dom.WMLTimerElementImpl"));
        Object term79589 = newInstance(Class.forName("org.apache.wml.dom.WMLTimerElementImpl"));
        setShortField(term79425, term79425.getClass(), "flags", (short) 0);
        setShortField(term79507, term79507.getClass(), "flags", (short) 0);
        setField(term79507, term79507.getClass(), "previousSibling", term79589);
        setField(term79425, term79425.getClass(), "previousSibling", term79507);
        setField(term79343, term79343.getClass(), "node", term79425);
        term79631 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term79632 = newInstance(Class.forName("org.apache.wml.dom.WMLTimerElementImpl"));
        Object term79633 = newInstance(Class.forName("org.apache.wml.dom.WMLTimerElementImpl"));
        Object term79634 = newInstance(Class.forName("org.apache.wml.dom.WMLTimerElementImpl"));
        setField(term79632, term79632.getClass(), "name", null);
        setField(term79632, term79632.getClass(), "attributes", null);
        setField(term79632, term79632.getClass(), "ownerDocument", null);
        setField(term79632, term79632.getClass(), "firstChild", null);
        setField(term79632, term79632.getClass(), "fNodeListCache", null);
        setField(term79633, term79633.getClass(), "name", null);
        setField(term79633, term79633.getClass(), "attributes", null);
        setField(term79633, term79633.getClass(), "ownerDocument", null);
        setField(term79633, term79633.getClass(), "firstChild", null);
        setField(term79633, term79633.getClass(), "fNodeListCache", null);
        setField(term79634, term79634.getClass(), "name", null);
        setField(term79634, term79634.getClass(), "attributes", null);
        setField(term79634, term79634.getClass(), "ownerDocument", null);
        setField(term79634, term79634.getClass(), "firstChild", null);
        setField(term79634, term79634.getClass(), "fNodeListCache", null);
        setField(term79634, term79634.getClass(), "previousSibling", null);
        setField(term79634, term79634.getClass(), "nextSibling", null);
        setField(term79634, term79634.getClass(), "ownerNode", null);
        setShortField(term79634, term79634.getClass(), "flags", (short) 0);
        setField(term79633, term79633.getClass(), "previousSibling", term79634);
        setField(term79633, term79633.getClass(), "nextSibling", null);
        setField(term79633, term79633.getClass(), "ownerNode", null);
        setShortField(term79633, term79633.getClass(), "flags", (short) 0);
        setField(term79632, term79632.getClass(), "previousSibling", term79633);
        setField(term79632, term79632.getClass(), "nextSibling", null);
        setField(term79632, term79632.getClass(), "ownerNode", null);
        setShortField(term79632, term79632.getClass(), "flags", (short) 0);
        setField(term79631, term79631.getClass(), "node", term79632);
        setField(term79631, term79631.getClass(), "namespaces", null);
        setField(term79631, term79631.getClass(), "defaultNamespace", null);
        setField(term79631, term79631.getClass(), "id", null);
        setIntField(term79631, term79631.getClass(), "index", 0);
        setBooleanField(term79631, term79631.getClass(), "attribute", false);
        setField(term79631, term79631.getClass(), "rootNode", null);
        setField(term79631, term79631.getClass(), "namespaceResolver", null);
        setField(term79631, term79631.getClass(), "parent", null);
        setField(term79631, term79631.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getRelativePositionOfPI", argTypes, term79343, args);
        assertTrue(recursiveEquals(term79343, term79631));
    }

};


