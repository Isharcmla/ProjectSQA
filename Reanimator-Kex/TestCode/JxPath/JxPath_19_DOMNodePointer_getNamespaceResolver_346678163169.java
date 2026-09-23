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
import java.util.HashMap;

public class DOMNodePointer_getNamespaceResolver_346678163169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32482;
     Object term32528;
     Object term32487;

    public DOMNodePointer_getNamespaceResolver_346678163169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32482 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term32482, term32482.getClass(), "localNamespaceResolver", null);
        HashMap term32530 = new HashMap();
        HashMap term32531 = new HashMap();
        term32528 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term32529 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term32528, term32528.getClass(), "node", null);
        setField(term32528, term32528.getClass(), "namespaces", null);
        setField(term32528, term32528.getClass(), "defaultNamespace", null);
        setField(term32528, term32528.getClass(), "id", null);
        setField(term32529, term32529.getClass(), "parent", null);
        setField(term32529, term32529.getClass(), "namespaceMap", term32530);
        setField(term32529, term32529.getClass(), "reverseMap", term32531);
        setField(term32529, term32529.getClass(), "pointer", term32528);
        setBooleanField(term32529, term32529.getClass(), "sealed", false);
        setField(term32528, term32528.getClass(), "localNamespaceResolver", term32529);
        setIntField(term32528, term32528.getClass(), "index", 0);
        setBooleanField(term32528, term32528.getClass(), "attribute", false);
        setField(term32528, term32528.getClass(), "namespaceResolver", null);
        setField(term32528, term32528.getClass(), "rootNode", null);
        setField(term32528, term32528.getClass(), "parent", null);
        setField(term32528, term32528.getClass(), "locale", null);
        HashMap term32488 = new HashMap();
        HashMap term32493 = new HashMap();
        term32487 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term32486 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term32487, term32487.getClass(), "parent", null);
        setField(term32487, term32487.getClass(), "namespaceMap", term32488);
        setField(term32487, term32487.getClass(), "reverseMap", term32493);
        setField(term32486, term32486.getClass(), "node", null);
        setField(term32486, term32486.getClass(), "namespaces", null);
        setField(term32486, term32486.getClass(), "defaultNamespace", null);
        setField(term32486, term32486.getClass(), "id", null);
        setField(term32486, term32486.getClass(), "localNamespaceResolver", term32487);
        setIntField(term32486, term32486.getClass(), "index", 0);
        setBooleanField(term32486, term32486.getClass(), "attribute", false);
        setField(term32486, term32486.getClass(), "namespaceResolver", null);
        setField(term32486, term32486.getClass(), "rootNode", null);
        setField(term32486, term32486.getClass(), "parent", null);
        setField(term32486, term32486.getClass(), "locale", null);
        setField(term32487, term32487.getClass(), "pointer", term32486);
        setBooleanField(term32487, term32487.getClass(), "sealed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNamespaceResolver", argTypes, term32482, args);
        assertTrue(recursiveEquals(term32482, term32528));
        assertTrue(recursiveEquals(retValue, term32487));
    }

};


