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

public class DOMNodePointer_getRelativePositionOfTextNode_767316437154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29484;
     Object term29665;

    public DOMNodePointer_getRelativePositionOfTextNode_767316437154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29484 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term29566 = newInstance(Class.forName("org.apache.wml.dom.WMLTableElementImpl"));
        setField(term29484, term29484.getClass(), "node", term29566);
        term29665 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term29666 = newInstance(Class.forName("org.apache.wml.dom.WMLTableElementImpl"));
        setField(term29666, term29666.getClass(), "name", null);
        setField(term29666, term29666.getClass(), "attributes", null);
        setField(term29666, term29666.getClass(), "ownerDocument", null);
        setField(term29666, term29666.getClass(), "firstChild", null);
        setField(term29666, term29666.getClass(), "fNodeListCache", null);
        setField(term29666, term29666.getClass(), "previousSibling", null);
        setField(term29666, term29666.getClass(), "nextSibling", null);
        setField(term29666, term29666.getClass(), "ownerNode", null);
        setShortField(term29666, term29666.getClass(), "flags", (short) 0);
        setField(term29665, term29665.getClass(), "node", term29666);
        setField(term29665, term29665.getClass(), "namespaces", null);
        setField(term29665, term29665.getClass(), "defaultNamespace", null);
        setField(term29665, term29665.getClass(), "id", null);
        setField(term29665, term29665.getClass(), "localNamespaceResolver", null);
        setIntField(term29665, term29665.getClass(), "index", 0);
        setBooleanField(term29665, term29665.getClass(), "attribute", false);
        setField(term29665, term29665.getClass(), "namespaceResolver", null);
        setField(term29665, term29665.getClass(), "rootNode", null);
        setField(term29665, term29665.getClass(), "parent", null);
        setField(term29665, term29665.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRelativePositionOfTextNode", argTypes, term29484, args);
        assertTrue(recursiveEquals(term29484, term29665));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


