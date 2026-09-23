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

public class JDOMNodePointer_getValue_210627446261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1520;
     Object term6715;

    public JDOMNodePointer_getValue_210627446261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1539 = new HashMap();
        HashMap term1544 = new HashMap();
        HashMap term1550 = new HashMap();
        HashMap term1555 = new HashMap();
        HashMap term1561 = new HashMap();
        HashMap term1566 = new HashMap();
        HashMap term1578 = new HashMap();
        HashMap term1584 = new HashMap();
        HashMap term1589 = new HashMap();
        HashMap term1595 = new HashMap();
        HashMap term1600 = new HashMap();
        term1520 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1521 = newInstance(Class.forName("java.lang.Object"));
        Object term1534 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1535 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1536 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1537 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1574 = newInstance(Class.forName("java.lang.Object"));
        Object term1575 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1576 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1577 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1520, term1520.getClass(), "node", term1521);
        setField(term1520, term1520.getClass(), "id", "hNxWaHcfhY");
        setField(term1537, term1537.getClass(), "parent", null);
        setField(term1537, term1537.getClass(), "namespaceMap", null);
        setField(term1537, term1537.getClass(), "reverseMap", null);
        setField(term1537, term1537.getClass(), "pointer", null);
        setBooleanField(term1537, term1537.getClass(), "sealed", false);
        setField(term1536, term1536.getClass(), "parent", term1537);
        setField(term1536, term1536.getClass(), "namespaceMap", term1539);
        setField(term1536, term1536.getClass(), "reverseMap", term1544);
        setField(term1536, term1536.getClass(), "pointer", null);
        setBooleanField(term1536, term1536.getClass(), "sealed", false);
        setField(term1535, term1535.getClass(), "parent", term1536);
        setField(term1535, term1535.getClass(), "namespaceMap", term1550);
        setField(term1535, term1535.getClass(), "reverseMap", term1555);
        setField(term1535, term1535.getClass(), "pointer", null);
        setBooleanField(term1535, term1535.getClass(), "sealed", false);
        setField(term1534, term1534.getClass(), "parent", term1535);
        setField(term1534, term1534.getClass(), "namespaceMap", term1561);
        setField(term1534, term1534.getClass(), "reverseMap", term1566);
        setField(term1534, term1534.getClass(), "pointer", null);
        setBooleanField(term1534, term1534.getClass(), "sealed", false);
        setField(term1520, term1520.getClass(), "localNamespaceResolver", term1534);
        setIntField(term1520, term1520.getClass(), "index", 1585847225);
        setBooleanField(term1520, term1520.getClass(), "attribute", false);
        setField(term1520, term1520.getClass(), "rootNode", term1574);
        setField(term1577, term1577.getClass(), "parent", null);
        setField(term1577, term1577.getClass(), "namespaceMap", term1578);
        setField(term1577, term1577.getClass(), "reverseMap", null);
        setField(term1577, term1577.getClass(), "pointer", null);
        setBooleanField(term1577, term1577.getClass(), "sealed", false);
        setField(term1576, term1576.getClass(), "parent", term1577);
        setField(term1576, term1576.getClass(), "namespaceMap", term1584);
        setField(term1576, term1576.getClass(), "reverseMap", term1589);
        setField(term1576, term1576.getClass(), "pointer", null);
        setBooleanField(term1576, term1576.getClass(), "sealed", false);
        setField(term1575, term1575.getClass(), "parent", term1576);
        setField(term1575, term1575.getClass(), "namespaceMap", term1595);
        setField(term1575, term1575.getClass(), "reverseMap", term1600);
        setField(term1575, term1575.getClass(), "pointer", null);
        setBooleanField(term1575, term1575.getClass(), "sealed", false);
        setField(term1520, term1520.getClass(), "namespaceResolver", term1575);
        setField(term1520, term1520.getClass(), "parent", null);
        setField(term1520, term1520.getClass(), "locale", null);
        HashMap term6723 = new HashMap();
        HashMap term6724 = new HashMap();
        HashMap term6725 = new HashMap();
        HashMap term6726 = new HashMap();
        HashMap term6727 = new HashMap();
        HashMap term6728 = new HashMap();
        HashMap term6733 = new HashMap();
        HashMap term6734 = new HashMap();
        HashMap term6735 = new HashMap();
        HashMap term6736 = new HashMap();
        HashMap term6737 = new HashMap();
        term6715 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term6716 = newInstance(Class.forName("java.lang.Object"));
        Object term6719 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6720 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6721 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6722 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6729 = newInstance(Class.forName("java.lang.Object"));
        Object term6730 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6731 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6732 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term6715, term6715.getClass(), "node", term6716);
        setField(term6715, term6715.getClass(), "id", "hNxWaHcfhY");
        setField(term6722, term6722.getClass(), "parent", null);
        setField(term6722, term6722.getClass(), "namespaceMap", null);
        setField(term6722, term6722.getClass(), "reverseMap", null);
        setField(term6722, term6722.getClass(), "pointer", null);
        setBooleanField(term6722, term6722.getClass(), "sealed", false);
        setField(term6721, term6721.getClass(), "parent", term6722);
        setField(term6721, term6721.getClass(), "namespaceMap", term6723);
        setField(term6721, term6721.getClass(), "reverseMap", term6724);
        setField(term6721, term6721.getClass(), "pointer", null);
        setBooleanField(term6721, term6721.getClass(), "sealed", false);
        setField(term6720, term6720.getClass(), "parent", term6721);
        setField(term6720, term6720.getClass(), "namespaceMap", term6725);
        setField(term6720, term6720.getClass(), "reverseMap", term6726);
        setField(term6720, term6720.getClass(), "pointer", null);
        setBooleanField(term6720, term6720.getClass(), "sealed", false);
        setField(term6719, term6719.getClass(), "parent", term6720);
        setField(term6719, term6719.getClass(), "namespaceMap", term6727);
        setField(term6719, term6719.getClass(), "reverseMap", term6728);
        setField(term6719, term6719.getClass(), "pointer", null);
        setBooleanField(term6719, term6719.getClass(), "sealed", false);
        setField(term6715, term6715.getClass(), "localNamespaceResolver", term6719);
        setIntField(term6715, term6715.getClass(), "index", 1585847225);
        setBooleanField(term6715, term6715.getClass(), "attribute", false);
        setField(term6715, term6715.getClass(), "rootNode", term6729);
        setField(term6732, term6732.getClass(), "parent", null);
        setField(term6732, term6732.getClass(), "namespaceMap", term6733);
        setField(term6732, term6732.getClass(), "reverseMap", null);
        setField(term6732, term6732.getClass(), "pointer", null);
        setBooleanField(term6732, term6732.getClass(), "sealed", false);
        setField(term6731, term6731.getClass(), "parent", term6732);
        setField(term6731, term6731.getClass(), "namespaceMap", term6734);
        setField(term6731, term6731.getClass(), "reverseMap", term6735);
        setField(term6731, term6731.getClass(), "pointer", null);
        setBooleanField(term6731, term6731.getClass(), "sealed", false);
        setField(term6730, term6730.getClass(), "parent", term6731);
        setField(term6730, term6730.getClass(), "namespaceMap", term6736);
        setField(term6730, term6730.getClass(), "reverseMap", term6737);
        setField(term6730, term6730.getClass(), "pointer", null);
        setBooleanField(term6730, term6730.getClass(), "sealed", false);
        setField(term6715, term6715.getClass(), "namespaceResolver", term6730);
        setField(term6715, term6715.getClass(), "parent", null);
        setField(term6715, term6715.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getValue", argTypes, term1520, args);
        assertTrue(recursiveEquals(term1520, term6715));
        assertTrue(recursiveEquals(retValue, null));
    }

};


