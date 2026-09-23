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

public class DOMNodePointer_getPointerByID_212721639387 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3724;

    public DOMNodePointer_getPointerByID_212721639387() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3725 = new HashMap();
        HashMap term3759 = new HashMap();
        HashMap term3764 = new HashMap();
        HashMap term3770 = new HashMap();
        HashMap term3775 = new HashMap();
        HashMap term3781 = new HashMap();
        HashMap term3786 = new HashMap();
        HashMap term3796 = new HashMap();
        term3724 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term3754 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3755 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3756 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3757 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3794 = newInstance(Class.forName("java.lang.Object"));
        Object term3795 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term3724, term3724.getClass(), "node", null);
        setField(term3724, term3724.getClass(), "namespaces", term3725);
        setField(term3724, term3724.getClass(), "defaultNamespace", "PHvxnGHptP");
        setField(term3724, term3724.getClass(), "id", "TimdotUuNC");
        setField(term3757, term3757.getClass(), "parent", null);
        setField(term3757, term3757.getClass(), "namespaceMap", null);
        setField(term3757, term3757.getClass(), "reverseMap", null);
        setField(term3757, term3757.getClass(), "pointer", null);
        setBooleanField(term3757, term3757.getClass(), "sealed", false);
        setField(term3756, term3756.getClass(), "parent", term3757);
        setField(term3756, term3756.getClass(), "namespaceMap", term3759);
        setField(term3756, term3756.getClass(), "reverseMap", term3764);
        setField(term3756, term3756.getClass(), "pointer", null);
        setBooleanField(term3756, term3756.getClass(), "sealed", false);
        setField(term3755, term3755.getClass(), "parent", term3756);
        setField(term3755, term3755.getClass(), "namespaceMap", term3770);
        setField(term3755, term3755.getClass(), "reverseMap", term3775);
        setField(term3755, term3755.getClass(), "pointer", null);
        setBooleanField(term3755, term3755.getClass(), "sealed", false);
        setField(term3754, term3754.getClass(), "parent", term3755);
        setField(term3754, term3754.getClass(), "namespaceMap", term3781);
        setField(term3754, term3754.getClass(), "reverseMap", term3786);
        setField(term3754, term3754.getClass(), "pointer", null);
        setBooleanField(term3754, term3754.getClass(), "sealed", false);
        setField(term3724, term3724.getClass(), "localNamespaceResolver", term3754);
        setIntField(term3724, term3724.getClass(), "index", -1087774327);
        setBooleanField(term3724, term3724.getClass(), "attribute", false);
        setField(term3724, term3724.getClass(), "rootNode", term3794);
        setField(term3795, term3795.getClass(), "parent", null);
        setField(term3795, term3795.getClass(), "namespaceMap", term3796);
        setField(term3795, term3795.getClass(), "reverseMap", null);
        setField(term3795, term3795.getClass(), "pointer", null);
        setBooleanField(term3795, term3795.getClass(), "sealed", false);
        setField(term3724, term3724.getClass(), "namespaceResolver", term3795);
        setField(term3724, term3724.getClass(), "parent", null);
        setField(term3724, term3724.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.JXPathContext");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = "PkWMRdJcBb";
        try {
            callMethod(klass, "getPointerByID", argTypes, term3724, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


