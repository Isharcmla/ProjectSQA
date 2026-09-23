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

public class DOMNodePointer_getAbstractFactory_214011858686 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3537;

    public DOMNodePointer_getAbstractFactory_214011858686() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3538 = new HashMap();
        HashMap term3575 = new HashMap();
        HashMap term3580 = new HashMap();
        HashMap term3586 = new HashMap();
        HashMap term3591 = new HashMap();
        HashMap term3597 = new HashMap();
        HashMap term3602 = new HashMap();
        term3537 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term3569 = newInstance(Class.forName("java.lang.Object"));
        Object term3570 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3571 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3572 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3573 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term3537, term3537.getClass(), "node", null);
        setField(term3537, term3537.getClass(), "namespaces", term3538);
        setField(term3537, term3537.getClass(), "defaultNamespace", "PkWMRdJcBb");
        setField(term3537, term3537.getClass(), "id", "jSpAteRute");
        setIntField(term3537, term3537.getClass(), "index", -1087774327);
        setBooleanField(term3537, term3537.getClass(), "attribute", false);
        setField(term3537, term3537.getClass(), "rootNode", term3569);
        setField(term3573, term3573.getClass(), "parent", null);
        setField(term3573, term3573.getClass(), "namespaceMap", null);
        setField(term3573, term3573.getClass(), "reverseMap", null);
        setField(term3573, term3573.getClass(), "pointer", null);
        setBooleanField(term3573, term3573.getClass(), "sealed", false);
        setField(term3572, term3572.getClass(), "parent", term3573);
        setField(term3572, term3572.getClass(), "namespaceMap", term3575);
        setField(term3572, term3572.getClass(), "reverseMap", term3580);
        setField(term3572, term3572.getClass(), "pointer", null);
        setBooleanField(term3572, term3572.getClass(), "sealed", false);
        setField(term3571, term3571.getClass(), "parent", term3572);
        setField(term3571, term3571.getClass(), "namespaceMap", term3586);
        setField(term3571, term3571.getClass(), "reverseMap", term3591);
        setField(term3571, term3571.getClass(), "pointer", null);
        setBooleanField(term3571, term3571.getClass(), "sealed", false);
        setField(term3570, term3570.getClass(), "parent", term3571);
        setField(term3570, term3570.getClass(), "namespaceMap", term3597);
        setField(term3570, term3570.getClass(), "reverseMap", term3602);
        setField(term3570, term3570.getClass(), "pointer", null);
        setBooleanField(term3570, term3570.getClass(), "sealed", false);
        setField(term3537, term3537.getClass(), "namespaceResolver", term3570);
        setField(term3537, term3537.getClass(), "parent", null);
        setField(term3537, term3537.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.JXPathContext");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getAbstractFactory", argTypes, term3537, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


