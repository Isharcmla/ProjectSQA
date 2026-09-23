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

public class DOMNodePointer_getRelativePositionByName_1797079143201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42595;
     Object term42691;

    public DOMNodePointer_getRelativePositionByName_1797079143201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42595 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term42679 = newInstance(Class.forName("org.apache.xerces.impl.xs.opti.AttrImpl"));
        setField(term42595, term42595.getClass(), "node", term42679);
        term42691 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term42692 = newInstance(Class.forName("org.apache.xerces.impl.xs.opti.AttrImpl"));
        setField(term42692, term42692.getClass(), "element", null);
        setField(term42692, term42692.getClass(), "value", null);
        setField(term42692, term42692.getClass(), "prefix", null);
        setField(term42692, term42692.getClass(), "localpart", null);
        setField(term42692, term42692.getClass(), "rawname", null);
        setField(term42692, term42692.getClass(), "uri", null);
        setShortField(term42692, term42692.getClass(), "nodeType", (short) 0);
        setBooleanField(term42692, term42692.getClass(), "hidden", false);
        setField(term42691, term42691.getClass(), "node", term42692);
        setField(term42691, term42691.getClass(), "namespaces", null);
        setField(term42691, term42691.getClass(), "defaultNamespace", null);
        setField(term42691, term42691.getClass(), "id", null);
        setField(term42691, term42691.getClass(), "localNamespaceResolver", null);
        setIntField(term42691, term42691.getClass(), "index", 0);
        setBooleanField(term42691, term42691.getClass(), "attribute", false);
        setField(term42691, term42691.getClass(), "rootNode", null);
        setField(term42691, term42691.getClass(), "namespaceResolver", null);
        setField(term42691, term42691.getClass(), "parent", null);
        setField(term42691, term42691.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRelativePositionByName", argTypes, term42595, args);
        assertTrue(recursiveEquals(term42595, term42691));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


