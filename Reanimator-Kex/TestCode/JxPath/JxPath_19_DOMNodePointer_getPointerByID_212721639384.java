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

public class DOMNodePointer_getPointerByID_212721639384 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3764;

    public DOMNodePointer_getPointerByID_212721639384() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3765 = new HashMap();
        HashMap term3799 = new HashMap();
        HashMap term3804 = new HashMap();
        HashMap term3810 = new HashMap();
        HashMap term3815 = new HashMap();
        HashMap term3821 = new HashMap();
        HashMap term3826 = new HashMap();
        HashMap term3835 = new HashMap();
        HashMap term3840 = new HashMap();
        term3764 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term3794 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3795 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3796 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3797 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3834 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3846 = newInstance(Class.forName("java.lang.Object"));
        setField(term3764, term3764.getClass(), "node", null);
        setField(term3764, term3764.getClass(), "namespaces", term3765);
        setField(term3764, term3764.getClass(), "defaultNamespace", "bWWfajKbEX");
        setField(term3764, term3764.getClass(), "id", "cAPeiZHKGJ");
        setField(term3797, term3797.getClass(), "parent", null);
        setField(term3797, term3797.getClass(), "namespaceMap", null);
        setField(term3797, term3797.getClass(), "reverseMap", null);
        setField(term3797, term3797.getClass(), "pointer", null);
        setBooleanField(term3797, term3797.getClass(), "sealed", false);
        setField(term3796, term3796.getClass(), "parent", term3797);
        setField(term3796, term3796.getClass(), "namespaceMap", term3799);
        setField(term3796, term3796.getClass(), "reverseMap", term3804);
        setField(term3796, term3796.getClass(), "pointer", null);
        setBooleanField(term3796, term3796.getClass(), "sealed", false);
        setField(term3795, term3795.getClass(), "parent", term3796);
        setField(term3795, term3795.getClass(), "namespaceMap", term3810);
        setField(term3795, term3795.getClass(), "reverseMap", term3815);
        setField(term3795, term3795.getClass(), "pointer", null);
        setBooleanField(term3795, term3795.getClass(), "sealed", false);
        setField(term3794, term3794.getClass(), "parent", term3795);
        setField(term3794, term3794.getClass(), "namespaceMap", term3821);
        setField(term3794, term3794.getClass(), "reverseMap", term3826);
        setField(term3794, term3794.getClass(), "pointer", null);
        setBooleanField(term3794, term3794.getClass(), "sealed", false);
        setField(term3764, term3764.getClass(), "localNamespaceResolver", term3794);
        setIntField(term3764, term3764.getClass(), "index", 1193880199);
        setBooleanField(term3764, term3764.getClass(), "attribute", true);
        setField(term3834, term3834.getClass(), "parent", null);
        setField(term3834, term3834.getClass(), "namespaceMap", term3835);
        setField(term3834, term3834.getClass(), "reverseMap", term3840);
        setField(term3834, term3834.getClass(), "pointer", null);
        setBooleanField(term3834, term3834.getClass(), "sealed", false);
        setField(term3764, term3764.getClass(), "namespaceResolver", term3834);
        setField(term3764, term3764.getClass(), "rootNode", term3846);
        setField(term3764, term3764.getClass(), "parent", null);
        setField(term3764, term3764.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.JXPathContext");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = "LvJFtLBaxj";
        try {
            callMethod(klass, "getPointerByID", argTypes, term3764, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


