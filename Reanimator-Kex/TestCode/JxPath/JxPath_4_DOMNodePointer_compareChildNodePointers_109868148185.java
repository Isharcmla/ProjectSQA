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

public class DOMNodePointer_compareChildNodePointers_109868148185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3606;

    public DOMNodePointer_compareChildNodePointers_109868148185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3607 = new HashMap();
        HashMap term3644 = new HashMap();
        HashMap term3649 = new HashMap();
        HashMap term3655 = new HashMap();
        HashMap term3660 = new HashMap();
        HashMap term3666 = new HashMap();
        HashMap term3671 = new HashMap();
        term3606 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term3638 = newInstance(Class.forName("java.lang.Object"));
        Object term3639 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3640 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3641 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3642 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term3606, term3606.getClass(), "node", null);
        setField(term3606, term3606.getClass(), "namespaces", term3607);
        setField(term3606, term3606.getClass(), "defaultNamespace", "jSpAteRute");
        setField(term3606, term3606.getClass(), "id", "swZVeJAxjt");
        setIntField(term3606, term3606.getClass(), "index", -1530420153);
        setBooleanField(term3606, term3606.getClass(), "attribute", true);
        setField(term3606, term3606.getClass(), "rootNode", term3638);
        setField(term3642, term3642.getClass(), "parent", null);
        setField(term3642, term3642.getClass(), "namespaceMap", null);
        setField(term3642, term3642.getClass(), "reverseMap", null);
        setField(term3642, term3642.getClass(), "pointer", null);
        setField(term3642, term3642.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3642, term3642.getClass(), "sealed", false);
        setField(term3641, term3641.getClass(), "parent", term3642);
        setField(term3641, term3641.getClass(), "namespaceMap", term3644);
        setField(term3641, term3641.getClass(), "reverseMap", term3649);
        setField(term3641, term3641.getClass(), "pointer", null);
        setField(term3641, term3641.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3641, term3641.getClass(), "sealed", false);
        setField(term3640, term3640.getClass(), "parent", term3641);
        setField(term3640, term3640.getClass(), "namespaceMap", term3655);
        setField(term3640, term3640.getClass(), "reverseMap", term3660);
        setField(term3640, term3640.getClass(), "pointer", null);
        setField(term3640, term3640.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3640, term3640.getClass(), "sealed", false);
        setField(term3639, term3639.getClass(), "parent", term3640);
        setField(term3639, term3639.getClass(), "namespaceMap", term3666);
        setField(term3639, term3639.getClass(), "reverseMap", term3671);
        setField(term3639, term3639.getClass(), "pointer", null);
        setField(term3639, term3639.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3639, term3639.getClass(), "sealed", false);
        setField(term3606, term3606.getClass(), "namespaceResolver", term3639);
        setField(term3606, term3606.getClass(), "parent", null);
        setField(term3606, term3606.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "compareChildNodePointers", argTypes, term3606, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


