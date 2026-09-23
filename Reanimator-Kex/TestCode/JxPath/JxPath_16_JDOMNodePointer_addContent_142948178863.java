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
import java.lang.ClassCastException;
import static org.apache.commons.jxpath.ri.model.jdom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.LinkedList;

public class JDOMNodePointer_addContent_142948178863 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1713;
     Object term1799;

    public JDOMNodePointer_addContent_142948178863() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1732 = new HashMap();
        HashMap term1737 = new HashMap();
        HashMap term1743 = new HashMap();
        HashMap term1748 = new HashMap();
        HashMap term1754 = new HashMap();
        HashMap term1759 = new HashMap();
        HashMap term1771 = new HashMap();
        HashMap term1777 = new HashMap();
        HashMap term1782 = new HashMap();
        HashMap term1788 = new HashMap();
        HashMap term1793 = new HashMap();
        term1713 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1714 = newInstance(Class.forName("java.lang.Object"));
        Object term1727 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1728 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1729 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1730 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1767 = newInstance(Class.forName("java.lang.Object"));
        Object term1768 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1769 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1770 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1713, term1713.getClass(), "node", term1714);
        setField(term1713, term1713.getClass(), "id", "xOEqzGAmDU");
        setField(term1730, term1730.getClass(), "parent", null);
        setField(term1730, term1730.getClass(), "namespaceMap", null);
        setField(term1730, term1730.getClass(), "reverseMap", null);
        setField(term1730, term1730.getClass(), "pointer", null);
        setBooleanField(term1730, term1730.getClass(), "sealed", false);
        setField(term1729, term1729.getClass(), "parent", term1730);
        setField(term1729, term1729.getClass(), "namespaceMap", term1732);
        setField(term1729, term1729.getClass(), "reverseMap", term1737);
        setField(term1729, term1729.getClass(), "pointer", null);
        setBooleanField(term1729, term1729.getClass(), "sealed", false);
        setField(term1728, term1728.getClass(), "parent", term1729);
        setField(term1728, term1728.getClass(), "namespaceMap", term1743);
        setField(term1728, term1728.getClass(), "reverseMap", term1748);
        setField(term1728, term1728.getClass(), "pointer", null);
        setBooleanField(term1728, term1728.getClass(), "sealed", false);
        setField(term1727, term1727.getClass(), "parent", term1728);
        setField(term1727, term1727.getClass(), "namespaceMap", term1754);
        setField(term1727, term1727.getClass(), "reverseMap", term1759);
        setField(term1727, term1727.getClass(), "pointer", null);
        setBooleanField(term1727, term1727.getClass(), "sealed", false);
        setField(term1713, term1713.getClass(), "localNamespaceResolver", term1727);
        setIntField(term1713, term1713.getClass(), "index", -1685132342);
        setBooleanField(term1713, term1713.getClass(), "attribute", true);
        setField(term1713, term1713.getClass(), "rootNode", term1767);
        setField(term1770, term1770.getClass(), "parent", null);
        setField(term1770, term1770.getClass(), "namespaceMap", term1771);
        setField(term1770, term1770.getClass(), "reverseMap", null);
        setField(term1770, term1770.getClass(), "pointer", null);
        setBooleanField(term1770, term1770.getClass(), "sealed", false);
        setField(term1769, term1769.getClass(), "parent", term1770);
        setField(term1769, term1769.getClass(), "namespaceMap", term1777);
        setField(term1769, term1769.getClass(), "reverseMap", term1782);
        setField(term1769, term1769.getClass(), "pointer", null);
        setBooleanField(term1769, term1769.getClass(), "sealed", false);
        setField(term1768, term1768.getClass(), "parent", term1769);
        setField(term1768, term1768.getClass(), "namespaceMap", term1788);
        setField(term1768, term1768.getClass(), "reverseMap", term1793);
        setField(term1768, term1768.getClass(), "pointer", null);
        setBooleanField(term1768, term1768.getClass(), "sealed", false);
        setField(term1713, term1713.getClass(), "namespaceResolver", term1768);
        setField(term1713, term1713.getClass(), "parent", null);
        setField(term1713, term1713.getClass(), "locale", null);
        Object term1802 = newInstance(Class.forName("java.lang.Object"));
        Object term1804 = newInstance(Class.forName("java.lang.Object"));
        Object term1806 = newInstance(Class.forName("java.lang.Object"));
        term1799 = new LinkedList();
        ((LinkedList) term1799).add(term1802);
        ((LinkedList) term1799).add(term1804);
        ((LinkedList) term1799).add(term1806);
        ((LinkedList) term1799).add((Object)null);
        ((LinkedList) term1799).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term1799;
        try {
            callMethod(klass, "addContent", argTypes, term1713, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


