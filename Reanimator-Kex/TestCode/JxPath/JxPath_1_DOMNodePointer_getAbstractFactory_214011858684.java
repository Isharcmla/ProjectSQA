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
import java.lang.NullPointerException;
import static org.apache.commons.jxpath.ri.model.dom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;

public class DOMNodePointer_getAbstractFactory_214011858684 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3427;

    public DOMNodePointer_getAbstractFactory_214011858684() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3428 = new HashMap();
        HashMap term3465 = new HashMap();
        HashMap term3470 = new HashMap();
        HashMap term3476 = new HashMap();
        HashMap term3481 = new HashMap();
        HashMap term3487 = new HashMap();
        HashMap term3492 = new HashMap();
        term3427 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term3459 = newInstance(Class.forName("java.lang.Object"));
        Object term3460 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3461 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3462 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3463 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term3427, term3427.getClass(), "node", null);
        setField(term3427, term3427.getClass(), "namespaces", term3428);
        setField(term3427, term3427.getClass(), "defaultNamespace", "bWWfajKbEX");
        setField(term3427, term3427.getClass(), "id", "cAPeiZHKGJ");
        setIntField(term3427, term3427.getClass(), "index", -1087774327);
        setBooleanField(term3427, term3427.getClass(), "attribute", false);
        setField(term3427, term3427.getClass(), "rootNode", term3459);
        setField(term3463, term3463.getClass(), "parent", null);
        setField(term3463, term3463.getClass(), "namespaceMap", null);
        setField(term3463, term3463.getClass(), "reverseMap", null);
        setField(term3463, term3463.getClass(), "pointer", null);
        setField(term3463, term3463.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3463, term3463.getClass(), "sealed", false);
        setField(term3462, term3462.getClass(), "parent", term3463);
        setField(term3462, term3462.getClass(), "namespaceMap", term3465);
        setField(term3462, term3462.getClass(), "reverseMap", term3470);
        setField(term3462, term3462.getClass(), "pointer", null);
        setField(term3462, term3462.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3462, term3462.getClass(), "sealed", false);
        setField(term3461, term3461.getClass(), "parent", term3462);
        setField(term3461, term3461.getClass(), "namespaceMap", term3476);
        setField(term3461, term3461.getClass(), "reverseMap", term3481);
        setField(term3461, term3461.getClass(), "pointer", null);
        setField(term3461, term3461.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3461, term3461.getClass(), "sealed", false);
        setField(term3460, term3460.getClass(), "parent", term3461);
        setField(term3460, term3460.getClass(), "namespaceMap", term3487);
        setField(term3460, term3460.getClass(), "reverseMap", term3492);
        setField(term3460, term3460.getClass(), "pointer", null);
        setField(term3460, term3460.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3460, term3460.getClass(), "sealed", false);
        setField(term3427, term3427.getClass(), "namespaceResolver", term3460);
        setField(term3427, term3427.getClass(), "parent", null);
        setField(term3427, term3427.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.JXPathContext");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getAbstractFactory", argTypes, term3427, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
