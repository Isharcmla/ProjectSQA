package org.apache.commons.jxpath.ri.model.beans;

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
import static org.apache.commons.jxpath.ri.model.beans.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;

public class NullPropertyPointer_asPath_3338448546 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1572;

    public NullPropertyPointer_asPath_3338448546() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1597 = new HashMap();
        HashMap term1602 = new HashMap();
        HashMap term1608 = new HashMap();
        HashMap term1613 = new HashMap();
        HashMap term1619 = new HashMap();
        HashMap term1624 = new HashMap();
        term1572 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term1587 = newInstance(Class.forName("java.lang.Object"));
        Object term1588 = newInstance(Class.forName("java.lang.Object"));
        Object term1591 = newInstance(Class.forName("java.lang.Object"));
        Object term1592 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1593 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1594 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1595 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1572, term1572.getClass(), "propertyName", "OclPbYPkcH");
        setBooleanField(term1572, term1572.getClass(), "byNameAttribute", true);
        setIntField(term1572, term1572.getClass(), "propertyIndex", -817164822);
        setField(term1572, term1572.getClass(), "bean", term1587);
        setField(term1572, term1572.getClass(), "value", term1588);
        setIntField(term1572, term1572.getClass(), "index", -1016503459);
        setBooleanField(term1572, term1572.getClass(), "attribute", true);
        setField(term1572, term1572.getClass(), "rootNode", term1591);
        setField(term1595, term1595.getClass(), "parent", null);
        setField(term1595, term1595.getClass(), "namespaceMap", null);
        setField(term1595, term1595.getClass(), "reverseMap", null);
        setField(term1595, term1595.getClass(), "pointer", null);
        setField(term1595, term1595.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1595, term1595.getClass(), "sealed", false);
        setField(term1594, term1594.getClass(), "parent", term1595);
        setField(term1594, term1594.getClass(), "namespaceMap", term1597);
        setField(term1594, term1594.getClass(), "reverseMap", term1602);
        setField(term1594, term1594.getClass(), "pointer", null);
        setField(term1594, term1594.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1594, term1594.getClass(), "sealed", false);
        setField(term1593, term1593.getClass(), "parent", term1594);
        setField(term1593, term1593.getClass(), "namespaceMap", term1608);
        setField(term1593, term1593.getClass(), "reverseMap", term1613);
        setField(term1593, term1593.getClass(), "pointer", null);
        setField(term1593, term1593.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1593, term1593.getClass(), "sealed", false);
        setField(term1592, term1592.getClass(), "parent", term1593);
        setField(term1592, term1592.getClass(), "namespaceMap", term1619);
        setField(term1592, term1592.getClass(), "reverseMap", term1624);
        setField(term1592, term1592.getClass(), "pointer", null);
        setField(term1592, term1592.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1592, term1592.getClass(), "sealed", false);
        setField(term1572, term1572.getClass(), "namespaceResolver", term1592);
        setField(term1572, term1572.getClass(), "parent", null);
        setField(term1572, term1572.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "asPath", argTypes, term1572, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


