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

public class DOMNodePointer_stringValue_212917030383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3661;

    public DOMNodePointer_stringValue_212917030383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3662 = new HashMap();
        HashMap term3696 = new HashMap();
        HashMap term3701 = new HashMap();
        HashMap term3707 = new HashMap();
        HashMap term3712 = new HashMap();
        HashMap term3718 = new HashMap();
        HashMap term3723 = new HashMap();
        HashMap term3732 = new HashMap();
        HashMap term3737 = new HashMap();
        term3661 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term3691 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3692 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3693 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3694 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3731 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3743 = newInstance(Class.forName("java.lang.Object"));
        setField(term3661, term3661.getClass(), "node", null);
        setField(term3661, term3661.getClass(), "namespaces", term3662);
        setField(term3661, term3661.getClass(), "defaultNamespace", "VgZnGoIFwQ");
        setField(term3661, term3661.getClass(), "id", "jUbSRrkrYZ");
        setField(term3694, term3694.getClass(), "parent", null);
        setField(term3694, term3694.getClass(), "namespaceMap", null);
        setField(term3694, term3694.getClass(), "reverseMap", null);
        setField(term3694, term3694.getClass(), "pointer", null);
        setBooleanField(term3694, term3694.getClass(), "sealed", false);
        setField(term3693, term3693.getClass(), "parent", term3694);
        setField(term3693, term3693.getClass(), "namespaceMap", term3696);
        setField(term3693, term3693.getClass(), "reverseMap", term3701);
        setField(term3693, term3693.getClass(), "pointer", null);
        setBooleanField(term3693, term3693.getClass(), "sealed", false);
        setField(term3692, term3692.getClass(), "parent", term3693);
        setField(term3692, term3692.getClass(), "namespaceMap", term3707);
        setField(term3692, term3692.getClass(), "reverseMap", term3712);
        setField(term3692, term3692.getClass(), "pointer", null);
        setBooleanField(term3692, term3692.getClass(), "sealed", false);
        setField(term3691, term3691.getClass(), "parent", term3692);
        setField(term3691, term3691.getClass(), "namespaceMap", term3718);
        setField(term3691, term3691.getClass(), "reverseMap", term3723);
        setField(term3691, term3691.getClass(), "pointer", null);
        setBooleanField(term3691, term3691.getClass(), "sealed", false);
        setField(term3661, term3661.getClass(), "localNamespaceResolver", term3691);
        setIntField(term3661, term3661.getClass(), "index", -226514366);
        setBooleanField(term3661, term3661.getClass(), "attribute", true);
        setField(term3731, term3731.getClass(), "parent", null);
        setField(term3731, term3731.getClass(), "namespaceMap", term3732);
        setField(term3731, term3731.getClass(), "reverseMap", term3737);
        setField(term3731, term3731.getClass(), "pointer", null);
        setBooleanField(term3731, term3731.getClass(), "sealed", false);
        setField(term3661, term3661.getClass(), "namespaceResolver", term3731);
        setField(term3661, term3661.getClass(), "rootNode", term3743);
        setField(term3661, term3661.getClass(), "parent", null);
        setField(term3661, term3661.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.w3c.dom.Node");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "stringValue", argTypes, term3661, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


