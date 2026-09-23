package org.apache.commons.jxpath.ri.model.jdom;

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
import static org.apache.commons.jxpath.ri.model.jdom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.jxpath.ri.model.jdom.EqualityUtils.*;
import java.lang.Object;
import java.util.HashMap;

public class JDOMNodePointer_getValue_210627446259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1590;
     Object term6723;

    public JDOMNodePointer_getValue_210627446259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1609 = new HashMap();
        HashMap term1614 = new HashMap();
        HashMap term1620 = new HashMap();
        HashMap term1625 = new HashMap();
        HashMap term1631 = new HashMap();
        HashMap term1636 = new HashMap();
        HashMap term1647 = new HashMap();
        HashMap term1652 = new HashMap();
        HashMap term1658 = new HashMap();
        HashMap term1663 = new HashMap();
        HashMap term1669 = new HashMap();
        HashMap term1674 = new HashMap();
        term1590 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1591 = newInstance(Class.forName("java.lang.Object"));
        Object term1604 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1605 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1606 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1607 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1644 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1645 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1646 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1680 = newInstance(Class.forName("java.lang.Object"));
        setField(term1590, term1590.getClass(), "node", term1591);
        setField(term1590, term1590.getClass(), "id", "hNxWaHcfhY");
        setField(term1607, term1607.getClass(), "parent", null);
        setField(term1607, term1607.getClass(), "namespaceMap", null);
        setField(term1607, term1607.getClass(), "reverseMap", null);
        setField(term1607, term1607.getClass(), "pointer", null);
        setBooleanField(term1607, term1607.getClass(), "sealed", false);
        setField(term1606, term1606.getClass(), "parent", term1607);
        setField(term1606, term1606.getClass(), "namespaceMap", term1609);
        setField(term1606, term1606.getClass(), "reverseMap", term1614);
        setField(term1606, term1606.getClass(), "pointer", null);
        setBooleanField(term1606, term1606.getClass(), "sealed", false);
        setField(term1605, term1605.getClass(), "parent", term1606);
        setField(term1605, term1605.getClass(), "namespaceMap", term1620);
        setField(term1605, term1605.getClass(), "reverseMap", term1625);
        setField(term1605, term1605.getClass(), "pointer", null);
        setBooleanField(term1605, term1605.getClass(), "sealed", false);
        setField(term1604, term1604.getClass(), "parent", term1605);
        setField(term1604, term1604.getClass(), "namespaceMap", term1631);
        setField(term1604, term1604.getClass(), "reverseMap", term1636);
        setField(term1604, term1604.getClass(), "pointer", null);
        setBooleanField(term1604, term1604.getClass(), "sealed", false);
        setField(term1590, term1590.getClass(), "localNamespaceResolver", term1604);
        setIntField(term1590, term1590.getClass(), "index", 1585847225);
        setBooleanField(term1590, term1590.getClass(), "attribute", false);
        setField(term1646, term1646.getClass(), "parent", null);
        setField(term1646, term1646.getClass(), "namespaceMap", term1647);
        setField(term1646, term1646.getClass(), "reverseMap", term1652);
        setField(term1646, term1646.getClass(), "pointer", null);
        setBooleanField(term1646, term1646.getClass(), "sealed", false);
        setField(term1645, term1645.getClass(), "parent", term1646);
        setField(term1645, term1645.getClass(), "namespaceMap", term1658);
        setField(term1645, term1645.getClass(), "reverseMap", term1663);
        setField(term1645, term1645.getClass(), "pointer", null);
        setBooleanField(term1645, term1645.getClass(), "sealed", false);
        setField(term1644, term1644.getClass(), "parent", term1645);
        setField(term1644, term1644.getClass(), "namespaceMap", term1669);
        setField(term1644, term1644.getClass(), "reverseMap", term1674);
        setField(term1644, term1644.getClass(), "pointer", null);
        setBooleanField(term1644, term1644.getClass(), "sealed", false);
        setField(term1590, term1590.getClass(), "namespaceResolver", term1644);
        setField(term1590, term1590.getClass(), "rootNode", term1680);
        setField(term1590, term1590.getClass(), "parent", null);
        setField(term1590, term1590.getClass(), "locale", null);
        HashMap term6731 = new HashMap();
        HashMap term6732 = new HashMap();
        HashMap term6733 = new HashMap();
        HashMap term6734 = new HashMap();
        HashMap term6735 = new HashMap();
        HashMap term6736 = new HashMap();
        HashMap term6740 = new HashMap();
        HashMap term6741 = new HashMap();
        HashMap term6742 = new HashMap();
        HashMap term6743 = new HashMap();
        HashMap term6744 = new HashMap();
        HashMap term6745 = new HashMap();
        term6723 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term6724 = newInstance(Class.forName("java.lang.Object"));
        Object term6727 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6728 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6729 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6730 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6737 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6738 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6739 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6746 = newInstance(Class.forName("java.lang.Object"));
        setField(term6723, term6723.getClass(), "node", term6724);
        setField(term6723, term6723.getClass(), "id", "hNxWaHcfhY");
        setField(term6730, term6730.getClass(), "parent", null);
        setField(term6730, term6730.getClass(), "namespaceMap", null);
        setField(term6730, term6730.getClass(), "reverseMap", null);
        setField(term6730, term6730.getClass(), "pointer", null);
        setBooleanField(term6730, term6730.getClass(), "sealed", false);
        setField(term6729, term6729.getClass(), "parent", term6730);
        setField(term6729, term6729.getClass(), "namespaceMap", term6731);
        setField(term6729, term6729.getClass(), "reverseMap", term6732);
        setField(term6729, term6729.getClass(), "pointer", null);
        setBooleanField(term6729, term6729.getClass(), "sealed", false);
        setField(term6728, term6728.getClass(), "parent", term6729);
        setField(term6728, term6728.getClass(), "namespaceMap", term6733);
        setField(term6728, term6728.getClass(), "reverseMap", term6734);
        setField(term6728, term6728.getClass(), "pointer", null);
        setBooleanField(term6728, term6728.getClass(), "sealed", false);
        setField(term6727, term6727.getClass(), "parent", term6728);
        setField(term6727, term6727.getClass(), "namespaceMap", term6735);
        setField(term6727, term6727.getClass(), "reverseMap", term6736);
        setField(term6727, term6727.getClass(), "pointer", null);
        setBooleanField(term6727, term6727.getClass(), "sealed", false);
        setField(term6723, term6723.getClass(), "localNamespaceResolver", term6727);
        setIntField(term6723, term6723.getClass(), "index", 1585847225);
        setBooleanField(term6723, term6723.getClass(), "attribute", false);
        setField(term6739, term6739.getClass(), "parent", null);
        setField(term6739, term6739.getClass(), "namespaceMap", term6740);
        setField(term6739, term6739.getClass(), "reverseMap", term6741);
        setField(term6739, term6739.getClass(), "pointer", null);
        setBooleanField(term6739, term6739.getClass(), "sealed", false);
        setField(term6738, term6738.getClass(), "parent", term6739);
        setField(term6738, term6738.getClass(), "namespaceMap", term6742);
        setField(term6738, term6738.getClass(), "reverseMap", term6743);
        setField(term6738, term6738.getClass(), "pointer", null);
        setBooleanField(term6738, term6738.getClass(), "sealed", false);
        setField(term6737, term6737.getClass(), "parent", term6738);
        setField(term6737, term6737.getClass(), "namespaceMap", term6744);
        setField(term6737, term6737.getClass(), "reverseMap", term6745);
        setField(term6737, term6737.getClass(), "pointer", null);
        setBooleanField(term6737, term6737.getClass(), "sealed", false);
        setField(term6723, term6723.getClass(), "namespaceResolver", term6737);
        setField(term6723, term6723.getClass(), "rootNode", term6746);
        setField(term6723, term6723.getClass(), "parent", null);
        setField(term6723, term6723.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getValue", argTypes, term1590, args);
        assertTrue(recursiveEquals(term1590, term6723));
        assertTrue(recursiveEquals(retValue, null));
    }

};


