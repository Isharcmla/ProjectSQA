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
     Object term3515;

    public DOMNodePointer_getAbstractFactory_214011858684() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3516 = new HashMap();
        HashMap term3553 = new HashMap();
        HashMap term3558 = new HashMap();
        HashMap term3564 = new HashMap();
        HashMap term3569 = new HashMap();
        HashMap term3575 = new HashMap();
        HashMap term3580 = new HashMap();
        term3515 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term3547 = newInstance(Class.forName("java.lang.Object"));
        Object term3548 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3549 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3550 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3551 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term3515, term3515.getClass(), "node", null);
        setField(term3515, term3515.getClass(), "namespaces", term3516);
        setField(term3515, term3515.getClass(), "defaultNamespace", "TimdotUuNC");
        setField(term3515, term3515.getClass(), "id", "PkWMRdJcBb");
        setIntField(term3515, term3515.getClass(), "index", -1087774327);
        setBooleanField(term3515, term3515.getClass(), "attribute", false);
        setField(term3515, term3515.getClass(), "rootNode", term3547);
        setField(term3551, term3551.getClass(), "parent", null);
        setField(term3551, term3551.getClass(), "namespaceMap", null);
        setField(term3551, term3551.getClass(), "reverseMap", null);
        setField(term3551, term3551.getClass(), "pointer", null);
        setField(term3551, term3551.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3551, term3551.getClass(), "sealed", false);
        setField(term3550, term3550.getClass(), "parent", term3551);
        setField(term3550, term3550.getClass(), "namespaceMap", term3553);
        setField(term3550, term3550.getClass(), "reverseMap", term3558);
        setField(term3550, term3550.getClass(), "pointer", null);
        setField(term3550, term3550.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3550, term3550.getClass(), "sealed", false);
        setField(term3549, term3549.getClass(), "parent", term3550);
        setField(term3549, term3549.getClass(), "namespaceMap", term3564);
        setField(term3549, term3549.getClass(), "reverseMap", term3569);
        setField(term3549, term3549.getClass(), "pointer", null);
        setField(term3549, term3549.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3549, term3549.getClass(), "sealed", false);
        setField(term3548, term3548.getClass(), "parent", term3549);
        setField(term3548, term3548.getClass(), "namespaceMap", term3575);
        setField(term3548, term3548.getClass(), "reverseMap", term3580);
        setField(term3548, term3548.getClass(), "pointer", null);
        setField(term3548, term3548.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3548, term3548.getClass(), "sealed", false);
        setField(term3515, term3515.getClass(), "namespaceResolver", term3548);
        setField(term3515, term3515.getClass(), "parent", null);
        setField(term3515, term3515.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.JXPathContext");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getAbstractFactory", argTypes, term3515, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


