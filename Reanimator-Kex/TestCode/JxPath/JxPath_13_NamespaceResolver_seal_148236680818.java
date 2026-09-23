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

public class NamespaceResolver_seal_148236680818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term439;
     Object term1711;

    public NamespaceResolver_seal_148236680818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term445 = new HashMap();
        HashMap term450 = new HashMap();
        HashMap term456 = new HashMap();
        HashMap term461 = new HashMap();
        HashMap term467 = new HashMap();
        HashMap term472 = new HashMap();
        HashMap term478 = new HashMap();
        HashMap term483 = new HashMap();
        term439 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term440 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term441 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term442 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term443 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term443, term443.getClass(), "parent", null);
        setField(term443, term443.getClass(), "namespaceMap", null);
        setField(term443, term443.getClass(), "reverseMap", null);
        setField(term443, term443.getClass(), "pointer", null);
        setBooleanField(term443, term443.getClass(), "sealed", false);
        setField(term442, term442.getClass(), "parent", term443);
        setField(term442, term442.getClass(), "namespaceMap", term445);
        setField(term442, term442.getClass(), "reverseMap", term450);
        setField(term442, term442.getClass(), "pointer", null);
        setBooleanField(term442, term442.getClass(), "sealed", false);
        setField(term441, term441.getClass(), "parent", term442);
        setField(term441, term441.getClass(), "namespaceMap", term456);
        setField(term441, term441.getClass(), "reverseMap", term461);
        setField(term441, term441.getClass(), "pointer", null);
        setBooleanField(term441, term441.getClass(), "sealed", false);
        setField(term440, term440.getClass(), "parent", term441);
        setField(term440, term440.getClass(), "namespaceMap", term467);
        setField(term440, term440.getClass(), "reverseMap", term472);
        setField(term440, term440.getClass(), "pointer", null);
        setBooleanField(term440, term440.getClass(), "sealed", false);
        setField(term439, term439.getClass(), "parent", term440);
        setField(term439, term439.getClass(), "namespaceMap", term478);
        setField(term439, term439.getClass(), "reverseMap", term483);
        setField(term439, term439.getClass(), "pointer", null);
        setBooleanField(term439, term439.getClass(), "sealed", false);
        HashMap term1716 = new HashMap();
        HashMap term1717 = new HashMap();
        HashMap term1718 = new HashMap();
        HashMap term1719 = new HashMap();
        HashMap term1720 = new HashMap();
        HashMap term1721 = new HashMap();
        HashMap term1722 = new HashMap();
        HashMap term1723 = new HashMap();
        term1711 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1712 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1713 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1714 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1715 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1715, term1715.getClass(), "parent", null);
        setField(term1715, term1715.getClass(), "namespaceMap", null);
        setField(term1715, term1715.getClass(), "reverseMap", null);
        setField(term1715, term1715.getClass(), "pointer", null);
        setBooleanField(term1715, term1715.getClass(), "sealed", true);
        setField(term1714, term1714.getClass(), "parent", term1715);
        setField(term1714, term1714.getClass(), "namespaceMap", term1716);
        setField(term1714, term1714.getClass(), "reverseMap", term1717);
        setField(term1714, term1714.getClass(), "pointer", null);
        setBooleanField(term1714, term1714.getClass(), "sealed", true);
        setField(term1713, term1713.getClass(), "parent", term1714);
        setField(term1713, term1713.getClass(), "namespaceMap", term1718);
        setField(term1713, term1713.getClass(), "reverseMap", term1719);
        setField(term1713, term1713.getClass(), "pointer", null);
        setBooleanField(term1713, term1713.getClass(), "sealed", true);
        setField(term1712, term1712.getClass(), "parent", term1713);
        setField(term1712, term1712.getClass(), "namespaceMap", term1720);
        setField(term1712, term1712.getClass(), "reverseMap", term1721);
        setField(term1712, term1712.getClass(), "pointer", null);
        setBooleanField(term1712, term1712.getClass(), "sealed", true);
        setField(term1711, term1711.getClass(), "parent", term1712);
        setField(term1711, term1711.getClass(), "namespaceMap", term1722);
        setField(term1711, term1711.getClass(), "reverseMap", term1723);
        setField(term1711, term1711.getClass(), "pointer", null);
        setBooleanField(term1711, term1711.getClass(), "sealed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "seal", argTypes, term439, args);
        assertTrue(recursiveEquals(term439, term1711));
    }

};


