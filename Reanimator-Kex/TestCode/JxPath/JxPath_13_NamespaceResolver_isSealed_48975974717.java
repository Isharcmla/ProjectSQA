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

public class NamespaceResolver_isSealed_48975974717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term389;
     Object term1563;

    public NamespaceResolver_isSealed_48975974717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term395 = new HashMap();
        HashMap term400 = new HashMap();
        HashMap term406 = new HashMap();
        HashMap term411 = new HashMap();
        HashMap term417 = new HashMap();
        HashMap term422 = new HashMap();
        HashMap term428 = new HashMap();
        HashMap term433 = new HashMap();
        term389 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term390 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term391 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term392 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term393 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term393, term393.getClass(), "parent", null);
        setField(term393, term393.getClass(), "namespaceMap", null);
        setField(term393, term393.getClass(), "reverseMap", null);
        setField(term393, term393.getClass(), "pointer", null);
        setBooleanField(term393, term393.getClass(), "sealed", false);
        setField(term392, term392.getClass(), "parent", term393);
        setField(term392, term392.getClass(), "namespaceMap", term395);
        setField(term392, term392.getClass(), "reverseMap", term400);
        setField(term392, term392.getClass(), "pointer", null);
        setBooleanField(term392, term392.getClass(), "sealed", false);
        setField(term391, term391.getClass(), "parent", term392);
        setField(term391, term391.getClass(), "namespaceMap", term406);
        setField(term391, term391.getClass(), "reverseMap", term411);
        setField(term391, term391.getClass(), "pointer", null);
        setBooleanField(term391, term391.getClass(), "sealed", false);
        setField(term390, term390.getClass(), "parent", term391);
        setField(term390, term390.getClass(), "namespaceMap", term417);
        setField(term390, term390.getClass(), "reverseMap", term422);
        setField(term390, term390.getClass(), "pointer", null);
        setBooleanField(term390, term390.getClass(), "sealed", false);
        setField(term389, term389.getClass(), "parent", term390);
        setField(term389, term389.getClass(), "namespaceMap", term428);
        setField(term389, term389.getClass(), "reverseMap", term433);
        setField(term389, term389.getClass(), "pointer", null);
        setBooleanField(term389, term389.getClass(), "sealed", false);
        HashMap term1568 = new HashMap();
        HashMap term1569 = new HashMap();
        HashMap term1570 = new HashMap();
        HashMap term1571 = new HashMap();
        HashMap term1572 = new HashMap();
        HashMap term1573 = new HashMap();
        HashMap term1574 = new HashMap();
        HashMap term1575 = new HashMap();
        term1563 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1564 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1565 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1566 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1567 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1567, term1567.getClass(), "parent", null);
        setField(term1567, term1567.getClass(), "namespaceMap", null);
        setField(term1567, term1567.getClass(), "reverseMap", null);
        setField(term1567, term1567.getClass(), "pointer", null);
        setBooleanField(term1567, term1567.getClass(), "sealed", false);
        setField(term1566, term1566.getClass(), "parent", term1567);
        setField(term1566, term1566.getClass(), "namespaceMap", term1568);
        setField(term1566, term1566.getClass(), "reverseMap", term1569);
        setField(term1566, term1566.getClass(), "pointer", null);
        setBooleanField(term1566, term1566.getClass(), "sealed", false);
        setField(term1565, term1565.getClass(), "parent", term1566);
        setField(term1565, term1565.getClass(), "namespaceMap", term1570);
        setField(term1565, term1565.getClass(), "reverseMap", term1571);
        setField(term1565, term1565.getClass(), "pointer", null);
        setBooleanField(term1565, term1565.getClass(), "sealed", false);
        setField(term1564, term1564.getClass(), "parent", term1565);
        setField(term1564, term1564.getClass(), "namespaceMap", term1572);
        setField(term1564, term1564.getClass(), "reverseMap", term1573);
        setField(term1564, term1564.getClass(), "pointer", null);
        setBooleanField(term1564, term1564.getClass(), "sealed", false);
        setField(term1563, term1563.getClass(), "parent", term1564);
        setField(term1563, term1563.getClass(), "namespaceMap", term1574);
        setField(term1563, term1563.getClass(), "reverseMap", term1575);
        setField(term1563, term1563.getClass(), "pointer", null);
        setBooleanField(term1563, term1563.getClass(), "sealed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isSealed", argTypes, term389, args);
        assertTrue(recursiveEquals(term389, term1563));
    }

};


