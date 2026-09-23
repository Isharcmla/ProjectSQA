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

public class NamespaceResolver_clone_192776584919 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term489;
     Object term1776;
     Object term1724;

    public NamespaceResolver_clone_192776584919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term495 = new HashMap();
        HashMap term500 = new HashMap();
        HashMap term506 = new HashMap();
        HashMap term511 = new HashMap();
        HashMap term517 = new HashMap();
        HashMap term522 = new HashMap();
        HashMap term528 = new HashMap();
        HashMap term533 = new HashMap();
        term489 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term490 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term491 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term492 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term493 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term493, term493.getClass(), "parent", null);
        setField(term493, term493.getClass(), "namespaceMap", null);
        setField(term493, term493.getClass(), "reverseMap", null);
        setField(term493, term493.getClass(), "pointer", null);
        setBooleanField(term493, term493.getClass(), "sealed", false);
        setField(term492, term492.getClass(), "parent", term493);
        setField(term492, term492.getClass(), "namespaceMap", term495);
        setField(term492, term492.getClass(), "reverseMap", term500);
        setField(term492, term492.getClass(), "pointer", null);
        setBooleanField(term492, term492.getClass(), "sealed", false);
        setField(term491, term491.getClass(), "parent", term492);
        setField(term491, term491.getClass(), "namespaceMap", term506);
        setField(term491, term491.getClass(), "reverseMap", term511);
        setField(term491, term491.getClass(), "pointer", null);
        setBooleanField(term491, term491.getClass(), "sealed", false);
        setField(term490, term490.getClass(), "parent", term491);
        setField(term490, term490.getClass(), "namespaceMap", term517);
        setField(term490, term490.getClass(), "reverseMap", term522);
        setField(term490, term490.getClass(), "pointer", null);
        setBooleanField(term490, term490.getClass(), "sealed", false);
        setField(term489, term489.getClass(), "parent", term490);
        setField(term489, term489.getClass(), "namespaceMap", term528);
        setField(term489, term489.getClass(), "reverseMap", term533);
        setField(term489, term489.getClass(), "pointer", null);
        setBooleanField(term489, term489.getClass(), "sealed", false);
        HashMap term1781 = new HashMap();
        HashMap term1782 = new HashMap();
        HashMap term1783 = new HashMap();
        HashMap term1784 = new HashMap();
        HashMap term1785 = new HashMap();
        HashMap term1786 = new HashMap();
        HashMap term1787 = new HashMap();
        HashMap term1788 = new HashMap();
        term1776 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1777 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1778 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1779 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1780 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1780, term1780.getClass(), "parent", null);
        setField(term1780, term1780.getClass(), "namespaceMap", null);
        setField(term1780, term1780.getClass(), "reverseMap", null);
        setField(term1780, term1780.getClass(), "pointer", null);
        setBooleanField(term1780, term1780.getClass(), "sealed", false);
        setField(term1779, term1779.getClass(), "parent", term1780);
        setField(term1779, term1779.getClass(), "namespaceMap", term1781);
        setField(term1779, term1779.getClass(), "reverseMap", term1782);
        setField(term1779, term1779.getClass(), "pointer", null);
        setBooleanField(term1779, term1779.getClass(), "sealed", false);
        setField(term1778, term1778.getClass(), "parent", term1779);
        setField(term1778, term1778.getClass(), "namespaceMap", term1783);
        setField(term1778, term1778.getClass(), "reverseMap", term1784);
        setField(term1778, term1778.getClass(), "pointer", null);
        setBooleanField(term1778, term1778.getClass(), "sealed", false);
        setField(term1777, term1777.getClass(), "parent", term1778);
        setField(term1777, term1777.getClass(), "namespaceMap", term1785);
        setField(term1777, term1777.getClass(), "reverseMap", term1786);
        setField(term1777, term1777.getClass(), "pointer", null);
        setBooleanField(term1777, term1777.getClass(), "sealed", false);
        setField(term1776, term1776.getClass(), "parent", term1777);
        setField(term1776, term1776.getClass(), "namespaceMap", term1787);
        setField(term1776, term1776.getClass(), "reverseMap", term1788);
        setField(term1776, term1776.getClass(), "pointer", null);
        setBooleanField(term1776, term1776.getClass(), "sealed", false);
        HashMap term1730 = new HashMap();
        HashMap term1735 = new HashMap();
        HashMap term1741 = new HashMap();
        HashMap term1746 = new HashMap();
        HashMap term1752 = new HashMap();
        HashMap term1757 = new HashMap();
        HashMap term1763 = new HashMap();
        HashMap term1768 = new HashMap();
        term1724 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1725 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1726 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1727 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1728 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1728, term1728.getClass(), "parent", null);
        setField(term1728, term1728.getClass(), "namespaceMap", null);
        setField(term1728, term1728.getClass(), "reverseMap", null);
        setField(term1728, term1728.getClass(), "pointer", null);
        setBooleanField(term1728, term1728.getClass(), "sealed", false);
        setField(term1727, term1727.getClass(), "parent", term1728);
        setField(term1727, term1727.getClass(), "namespaceMap", term1730);
        setField(term1727, term1727.getClass(), "reverseMap", term1735);
        setField(term1727, term1727.getClass(), "pointer", null);
        setBooleanField(term1727, term1727.getClass(), "sealed", false);
        setField(term1726, term1726.getClass(), "parent", term1727);
        setField(term1726, term1726.getClass(), "namespaceMap", term1741);
        setField(term1726, term1726.getClass(), "reverseMap", term1746);
        setField(term1726, term1726.getClass(), "pointer", null);
        setBooleanField(term1726, term1726.getClass(), "sealed", false);
        setField(term1725, term1725.getClass(), "parent", term1726);
        setField(term1725, term1725.getClass(), "namespaceMap", term1752);
        setField(term1725, term1725.getClass(), "reverseMap", term1757);
        setField(term1725, term1725.getClass(), "pointer", null);
        setBooleanField(term1725, term1725.getClass(), "sealed", false);
        setField(term1724, term1724.getClass(), "parent", term1725);
        setField(term1724, term1724.getClass(), "namespaceMap", term1763);
        setField(term1724, term1724.getClass(), "reverseMap", term1768);
        setField(term1724, term1724.getClass(), "pointer", null);
        setBooleanField(term1724, term1724.getClass(), "sealed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "clone", argTypes, term489, args);
        assertTrue(recursiveEquals(term489, term1776));
        assertTrue(recursiveEquals(retValue, term1724));
    }

};


