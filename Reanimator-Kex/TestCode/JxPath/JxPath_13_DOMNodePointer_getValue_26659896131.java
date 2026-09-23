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

public class DOMNodePointer_getValue_26659896131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21947;
     Object term22072;

    public DOMNodePointer_getValue_26659896131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21947 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term22029 = newInstance(Class.forName("org.apache.xerces.dom.CDATASectionImpl"));
        setField(term21947, term21947.getClass(), "node", term22029);
        term22072 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term22073 = newInstance(Class.forName("org.apache.xerces.dom.CDATASectionImpl"));
        setField(term22073, term22073.getClass(), "data", null);
        setField(term22073, term22073.getClass(), "previousSibling", null);
        setField(term22073, term22073.getClass(), "nextSibling", null);
        setField(term22073, term22073.getClass(), "ownerNode", null);
        setShortField(term22073, term22073.getClass(), "flags", (short) 0);
        setField(term22072, term22072.getClass(), "node", term22073);
        setField(term22072, term22072.getClass(), "namespaces", null);
        setField(term22072, term22072.getClass(), "defaultNamespace", null);
        setField(term22072, term22072.getClass(), "id", null);
        setIntField(term22072, term22072.getClass(), "index", 0);
        setBooleanField(term22072, term22072.getClass(), "attribute", false);
        setField(term22072, term22072.getClass(), "rootNode", null);
        setField(term22072, term22072.getClass(), "namespaceResolver", null);
        setField(term22072, term22072.getClass(), "parent", null);
        setField(term22072, term22072.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getValue", argTypes, term21947, args);
        assertTrue(recursiveEquals(term21947, term22072));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


