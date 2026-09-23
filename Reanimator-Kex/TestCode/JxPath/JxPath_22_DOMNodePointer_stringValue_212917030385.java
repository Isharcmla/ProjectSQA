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

public class DOMNodePointer_stringValue_212917030385 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3732;

    public DOMNodePointer_stringValue_212917030385() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3733 = new HashMap();
        HashMap term3767 = new HashMap();
        HashMap term3772 = new HashMap();
        HashMap term3778 = new HashMap();
        HashMap term3783 = new HashMap();
        HashMap term3789 = new HashMap();
        HashMap term3794 = new HashMap();
        HashMap term3803 = new HashMap();
        HashMap term3808 = new HashMap();
        term3732 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term3762 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3763 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3764 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3765 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3802 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term3732, term3732.getClass(), "node", null);
        setField(term3732, term3732.getClass(), "namespaces", term3733);
        setField(term3732, term3732.getClass(), "defaultNamespace", "bWWfajKbEX");
        setField(term3732, term3732.getClass(), "id", "cAPeiZHKGJ");
        setField(term3765, term3765.getClass(), "parent", null);
        setField(term3765, term3765.getClass(), "namespaceMap", null);
        setField(term3765, term3765.getClass(), "reverseMap", null);
        setField(term3765, term3765.getClass(), "pointer", null);
        setBooleanField(term3765, term3765.getClass(), "sealed", false);
        setField(term3764, term3764.getClass(), "parent", term3765);
        setField(term3764, term3764.getClass(), "namespaceMap", term3767);
        setField(term3764, term3764.getClass(), "reverseMap", term3772);
        setField(term3764, term3764.getClass(), "pointer", null);
        setBooleanField(term3764, term3764.getClass(), "sealed", false);
        setField(term3763, term3763.getClass(), "parent", term3764);
        setField(term3763, term3763.getClass(), "namespaceMap", term3778);
        setField(term3763, term3763.getClass(), "reverseMap", term3783);
        setField(term3763, term3763.getClass(), "pointer", null);
        setBooleanField(term3763, term3763.getClass(), "sealed", false);
        setField(term3762, term3762.getClass(), "parent", term3763);
        setField(term3762, term3762.getClass(), "namespaceMap", term3789);
        setField(term3762, term3762.getClass(), "reverseMap", term3794);
        setField(term3762, term3762.getClass(), "pointer", null);
        setBooleanField(term3762, term3762.getClass(), "sealed", false);
        setField(term3732, term3732.getClass(), "localNamespaceResolver", term3762);
        setIntField(term3732, term3732.getClass(), "index", 1193880199);
        setBooleanField(term3732, term3732.getClass(), "attribute", true);
        setField(term3802, term3802.getClass(), "parent", null);
        setField(term3802, term3802.getClass(), "namespaceMap", term3803);
        setField(term3802, term3802.getClass(), "reverseMap", term3808);
        setField(term3802, term3802.getClass(), "pointer", null);
        setBooleanField(term3802, term3802.getClass(), "sealed", false);
        setField(term3732, term3732.getClass(), "namespaceResolver", term3802);
        setField(term3732, term3732.getClass(), "exceptionHandler", null);
        setField(term3732, term3732.getClass(), "rootNode", null);
        setField(term3732, term3732.getClass(), "parent", null);
        setField(term3732, term3732.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.w3c.dom.Node");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "stringValue", argTypes, term3732, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


