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
import static org.apache.commons.jxpath.ri.model.dom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.jxpath.ri.model.dom.EqualityUtils.*;
import java.util.HashMap;
import java.lang.Object;

public class DOMNodePointer_getLanguage_163796968364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1672;
     Object term7759;

    public DOMNodePointer_getLanguage_163796968364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1673 = new HashMap();
        HashMap term1710 = new HashMap();
        HashMap term1715 = new HashMap();
        HashMap term1721 = new HashMap();
        HashMap term1726 = new HashMap();
        HashMap term1732 = new HashMap();
        HashMap term1737 = new HashMap();
        term1672 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term1704 = newInstance(Class.forName("java.lang.Object"));
        Object term1705 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1706 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1707 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1708 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1672, term1672.getClass(), "node", null);
        setField(term1672, term1672.getClass(), "namespaces", term1673);
        setField(term1672, term1672.getClass(), "defaultNamespace", "wSQxaModmm");
        setField(term1672, term1672.getClass(), "id", "UlajhuVLaP");
        setIntField(term1672, term1672.getClass(), "index", -1685132342);
        setBooleanField(term1672, term1672.getClass(), "attribute", true);
        setField(term1672, term1672.getClass(), "rootNode", term1704);
        setField(term1708, term1708.getClass(), "parent", null);
        setField(term1708, term1708.getClass(), "namespaceMap", null);
        setField(term1708, term1708.getClass(), "reverseMap", null);
        setField(term1708, term1708.getClass(), "pointer", null);
        setField(term1708, term1708.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1708, term1708.getClass(), "sealed", false);
        setField(term1707, term1707.getClass(), "parent", term1708);
        setField(term1707, term1707.getClass(), "namespaceMap", term1710);
        setField(term1707, term1707.getClass(), "reverseMap", term1715);
        setField(term1707, term1707.getClass(), "pointer", null);
        setField(term1707, term1707.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1707, term1707.getClass(), "sealed", false);
        setField(term1706, term1706.getClass(), "parent", term1707);
        setField(term1706, term1706.getClass(), "namespaceMap", term1721);
        setField(term1706, term1706.getClass(), "reverseMap", term1726);
        setField(term1706, term1706.getClass(), "pointer", null);
        setField(term1706, term1706.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1706, term1706.getClass(), "sealed", false);
        setField(term1705, term1705.getClass(), "parent", term1706);
        setField(term1705, term1705.getClass(), "namespaceMap", term1732);
        setField(term1705, term1705.getClass(), "reverseMap", term1737);
        setField(term1705, term1705.getClass(), "pointer", null);
        setField(term1705, term1705.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1705, term1705.getClass(), "sealed", false);
        setField(term1672, term1672.getClass(), "namespaceResolver", term1705);
        setField(term1672, term1672.getClass(), "parent", null);
        setField(term1672, term1672.getClass(), "locale", null);
        HashMap term7760 = new HashMap();
        HashMap term7770 = new HashMap();
        HashMap term7771 = new HashMap();
        HashMap term7772 = new HashMap();
        HashMap term7773 = new HashMap();
        HashMap term7774 = new HashMap();
        HashMap term7775 = new HashMap();
        term7759 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term7765 = newInstance(Class.forName("java.lang.Object"));
        Object term7766 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7767 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7768 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7769 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term7759, term7759.getClass(), "node", null);
        setField(term7759, term7759.getClass(), "namespaces", term7760);
        setField(term7759, term7759.getClass(), "defaultNamespace", "wSQxaModmm");
        setField(term7759, term7759.getClass(), "id", "UlajhuVLaP");
        setIntField(term7759, term7759.getClass(), "index", -1685132342);
        setBooleanField(term7759, term7759.getClass(), "attribute", true);
        setField(term7759, term7759.getClass(), "rootNode", term7765);
        setField(term7769, term7769.getClass(), "parent", null);
        setField(term7769, term7769.getClass(), "namespaceMap", null);
        setField(term7769, term7769.getClass(), "reverseMap", null);
        setField(term7769, term7769.getClass(), "pointer", null);
        setField(term7769, term7769.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term7769, term7769.getClass(), "sealed", false);
        setField(term7768, term7768.getClass(), "parent", term7769);
        setField(term7768, term7768.getClass(), "namespaceMap", term7770);
        setField(term7768, term7768.getClass(), "reverseMap", term7771);
        setField(term7768, term7768.getClass(), "pointer", null);
        setField(term7768, term7768.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term7768, term7768.getClass(), "sealed", false);
        setField(term7767, term7767.getClass(), "parent", term7768);
        setField(term7767, term7767.getClass(), "namespaceMap", term7772);
        setField(term7767, term7767.getClass(), "reverseMap", term7773);
        setField(term7767, term7767.getClass(), "pointer", null);
        setField(term7767, term7767.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term7767, term7767.getClass(), "sealed", false);
        setField(term7766, term7766.getClass(), "parent", term7767);
        setField(term7766, term7766.getClass(), "namespaceMap", term7774);
        setField(term7766, term7766.getClass(), "reverseMap", term7775);
        setField(term7766, term7766.getClass(), "pointer", null);
        setField(term7766, term7766.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term7766, term7766.getClass(), "sealed", false);
        setField(term7759, term7759.getClass(), "namespaceResolver", term7766);
        setField(term7759, term7759.getClass(), "parent", null);
        setField(term7759, term7759.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLanguage", argTypes, term1672, args);
        assertTrue(recursiveEquals(term1672, term7759));
        assertTrue(recursiveEquals(retValue, null));
    }

};
