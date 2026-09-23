package org.apache.commons.jxpath.ri;

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
import static org.apache.commons.jxpath.ri.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.jxpath.ri.EqualityUtils.*;
import java.lang.Object;
import java.util.HashMap;

public class NamespaceResolver_init_201293114511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term593;
     Object term605;

    public NamespaceResolver_init_201293114511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7 = new HashMap();
        HashMap term12 = new HashMap();
        HashMap term18 = new HashMap();
        HashMap term23 = new HashMap();
        HashMap term29 = new HashMap();
        HashMap term34 = new HashMap();
        HashMap term40 = new HashMap();
        HashMap term45 = new HashMap();
        term1 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term4 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term5, term5.getClass(), "parent", null);
        setField(term5, term5.getClass(), "namespaceMap", null);
        setField(term5, term5.getClass(), "reverseMap", null);
        setField(term5, term5.getClass(), "pointer", null);
        setBooleanField(term5, term5.getClass(), "sealed", false);
        setField(term4, term4.getClass(), "parent", term5);
        setField(term4, term4.getClass(), "namespaceMap", term7);
        setField(term4, term4.getClass(), "reverseMap", term12);
        setField(term4, term4.getClass(), "pointer", null);
        setBooleanField(term4, term4.getClass(), "sealed", false);
        setField(term3, term3.getClass(), "parent", term4);
        setField(term3, term3.getClass(), "namespaceMap", term18);
        setField(term3, term3.getClass(), "reverseMap", term23);
        setField(term3, term3.getClass(), "pointer", null);
        setBooleanField(term3, term3.getClass(), "sealed", false);
        setField(term2, term2.getClass(), "parent", term3);
        setField(term2, term2.getClass(), "namespaceMap", term29);
        setField(term2, term2.getClass(), "reverseMap", term34);
        setField(term2, term2.getClass(), "pointer", null);
        setBooleanField(term2, term2.getClass(), "sealed", false);
        setField(term1, term1.getClass(), "parent", term2);
        setField(term1, term1.getClass(), "namespaceMap", term40);
        setField(term1, term1.getClass(), "reverseMap", term45);
        setField(term1, term1.getClass(), "pointer", null);
        setBooleanField(term1, term1.getClass(), "sealed", false);
        HashMap term598 = new HashMap();
        HashMap term599 = new HashMap();
        HashMap term600 = new HashMap();
        HashMap term601 = new HashMap();
        HashMap term602 = new HashMap();
        HashMap term603 = new HashMap();
        HashMap term604 = new HashMap();
        term593 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term594 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term595 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term596 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term597 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term597, term597.getClass(), "parent", null);
        setField(term597, term597.getClass(), "namespaceMap", null);
        setField(term597, term597.getClass(), "reverseMap", null);
        setField(term597, term597.getClass(), "pointer", null);
        setBooleanField(term597, term597.getClass(), "sealed", false);
        setField(term596, term596.getClass(), "parent", term597);
        setField(term596, term596.getClass(), "namespaceMap", term598);
        setField(term596, term596.getClass(), "reverseMap", term599);
        setField(term596, term596.getClass(), "pointer", null);
        setBooleanField(term596, term596.getClass(), "sealed", false);
        setField(term595, term595.getClass(), "parent", term596);
        setField(term595, term595.getClass(), "namespaceMap", term600);
        setField(term595, term595.getClass(), "reverseMap", term601);
        setField(term595, term595.getClass(), "pointer", null);
        setBooleanField(term595, term595.getClass(), "sealed", false);
        setField(term594, term594.getClass(), "parent", term595);
        setField(term594, term594.getClass(), "namespaceMap", term602);
        setField(term594, term594.getClass(), "reverseMap", term603);
        setField(term594, term594.getClass(), "pointer", null);
        setBooleanField(term594, term594.getClass(), "sealed", false);
        setField(term593, term593.getClass(), "parent", term594);
        setField(term593, term593.getClass(), "namespaceMap", term604);
        setField(term593, term593.getClass(), "reverseMap", null);
        setField(term593, term593.getClass(), "pointer", null);
        setBooleanField(term593, term593.getClass(), "sealed", false);
        HashMap term609 = new HashMap();
        HashMap term610 = new HashMap();
        HashMap term611 = new HashMap();
        HashMap term612 = new HashMap();
        HashMap term613 = new HashMap();
        HashMap term614 = new HashMap();
        term605 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term606 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term607 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term608 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term608, term608.getClass(), "parent", null);
        setField(term608, term608.getClass(), "namespaceMap", null);
        setField(term608, term608.getClass(), "reverseMap", null);
        setField(term608, term608.getClass(), "pointer", null);
        setBooleanField(term608, term608.getClass(), "sealed", false);
        setField(term607, term607.getClass(), "parent", term608);
        setField(term607, term607.getClass(), "namespaceMap", term609);
        setField(term607, term607.getClass(), "reverseMap", term610);
        setField(term607, term607.getClass(), "pointer", null);
        setBooleanField(term607, term607.getClass(), "sealed", false);
        setField(term606, term606.getClass(), "parent", term607);
        setField(term606, term606.getClass(), "namespaceMap", term611);
        setField(term606, term606.getClass(), "reverseMap", term612);
        setField(term606, term606.getClass(), "pointer", null);
        setBooleanField(term606, term606.getClass(), "sealed", false);
        setField(term605, term605.getClass(), "parent", term606);
        setField(term605, term605.getClass(), "namespaceMap", term613);
        setField(term605, term605.getClass(), "reverseMap", term614);
        setField(term605, term605.getClass(), "pointer", null);
        setBooleanField(term605, term605.getClass(), "sealed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver");
        Object[] args = new Object[1];
        args[0] = term1;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term593));
        assertTrue(recursiveEquals(term1, term605));
    }

};


