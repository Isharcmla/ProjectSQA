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

public class DOMNodePointer_getValue_2665989684 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3630;

    public DOMNodePointer_getValue_2665989684() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3631 = new HashMap();
        HashMap term3665 = new HashMap();
        HashMap term3670 = new HashMap();
        HashMap term3676 = new HashMap();
        HashMap term3681 = new HashMap();
        HashMap term3687 = new HashMap();
        HashMap term3692 = new HashMap();
        HashMap term3701 = new HashMap();
        HashMap term3706 = new HashMap();
        term3630 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term3660 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3661 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3662 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3663 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3700 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term3630, term3630.getClass(), "node", null);
        setField(term3630, term3630.getClass(), "namespaces", term3631);
        setField(term3630, term3630.getClass(), "defaultNamespace", "VgZnGoIFwQ");
        setField(term3630, term3630.getClass(), "id", "jUbSRrkrYZ");
        setField(term3663, term3663.getClass(), "parent", null);
        setField(term3663, term3663.getClass(), "namespaceMap", null);
        setField(term3663, term3663.getClass(), "reverseMap", null);
        setField(term3663, term3663.getClass(), "pointer", null);
        setBooleanField(term3663, term3663.getClass(), "sealed", false);
        setField(term3662, term3662.getClass(), "parent", term3663);
        setField(term3662, term3662.getClass(), "namespaceMap", term3665);
        setField(term3662, term3662.getClass(), "reverseMap", term3670);
        setField(term3662, term3662.getClass(), "pointer", null);
        setBooleanField(term3662, term3662.getClass(), "sealed", false);
        setField(term3661, term3661.getClass(), "parent", term3662);
        setField(term3661, term3661.getClass(), "namespaceMap", term3676);
        setField(term3661, term3661.getClass(), "reverseMap", term3681);
        setField(term3661, term3661.getClass(), "pointer", null);
        setBooleanField(term3661, term3661.getClass(), "sealed", false);
        setField(term3660, term3660.getClass(), "parent", term3661);
        setField(term3660, term3660.getClass(), "namespaceMap", term3687);
        setField(term3660, term3660.getClass(), "reverseMap", term3692);
        setField(term3660, term3660.getClass(), "pointer", null);
        setBooleanField(term3660, term3660.getClass(), "sealed", false);
        setField(term3630, term3630.getClass(), "localNamespaceResolver", term3660);
        setIntField(term3630, term3630.getClass(), "index", -226514366);
        setBooleanField(term3630, term3630.getClass(), "attribute", true);
        setField(term3700, term3700.getClass(), "parent", null);
        setField(term3700, term3700.getClass(), "namespaceMap", term3701);
        setField(term3700, term3700.getClass(), "reverseMap", term3706);
        setField(term3700, term3700.getClass(), "pointer", null);
        setBooleanField(term3700, term3700.getClass(), "sealed", false);
        setField(term3630, term3630.getClass(), "namespaceResolver", term3700);
        setField(term3630, term3630.getClass(), "exceptionHandler", null);
        setField(term3630, term3630.getClass(), "rootNode", null);
        setField(term3630, term3630.getClass(), "parent", null);
        setField(term3630, term3630.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getValue", argTypes, term3630, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


