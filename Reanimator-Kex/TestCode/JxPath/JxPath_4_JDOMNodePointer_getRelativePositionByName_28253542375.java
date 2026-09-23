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

public class JDOMNodePointer_getRelativePositionByName_28253542375 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2112;
     Object term8830;

    public JDOMNodePointer_getRelativePositionByName_28253542375() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2134 = new HashMap();
        HashMap term2139 = new HashMap();
        HashMap term2145 = new HashMap();
        HashMap term2150 = new HashMap();
        HashMap term2156 = new HashMap();
        HashMap term2161 = new HashMap();
        term2112 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term2113 = newInstance(Class.forName("java.lang.Object"));
        Object term2128 = newInstance(Class.forName("java.lang.Object"));
        Object term2129 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2130 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2131 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2132 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term2112, term2112.getClass(), "node", term2113);
        setField(term2112, term2112.getClass(), "id", "BndsHwAFMv");
        setIntField(term2112, term2112.getClass(), "index", 865208305);
        setBooleanField(term2112, term2112.getClass(), "attribute", false);
        setField(term2112, term2112.getClass(), "rootNode", term2128);
        setField(term2132, term2132.getClass(), "parent", null);
        setField(term2132, term2132.getClass(), "namespaceMap", null);
        setField(term2132, term2132.getClass(), "reverseMap", null);
        setField(term2132, term2132.getClass(), "pointer", null);
        setField(term2132, term2132.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2132, term2132.getClass(), "sealed", false);
        setField(term2131, term2131.getClass(), "parent", term2132);
        setField(term2131, term2131.getClass(), "namespaceMap", term2134);
        setField(term2131, term2131.getClass(), "reverseMap", term2139);
        setField(term2131, term2131.getClass(), "pointer", null);
        setField(term2131, term2131.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2131, term2131.getClass(), "sealed", false);
        setField(term2130, term2130.getClass(), "parent", term2131);
        setField(term2130, term2130.getClass(), "namespaceMap", term2145);
        setField(term2130, term2130.getClass(), "reverseMap", term2150);
        setField(term2130, term2130.getClass(), "pointer", null);
        setField(term2130, term2130.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2130, term2130.getClass(), "sealed", false);
        setField(term2129, term2129.getClass(), "parent", term2130);
        setField(term2129, term2129.getClass(), "namespaceMap", term2156);
        setField(term2129, term2129.getClass(), "reverseMap", term2161);
        setField(term2129, term2129.getClass(), "pointer", null);
        setField(term2129, term2129.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2129, term2129.getClass(), "sealed", false);
        setField(term2112, term2112.getClass(), "namespaceResolver", term2129);
        setField(term2112, term2112.getClass(), "parent", null);
        setField(term2112, term2112.getClass(), "locale", null);
        HashMap term8839 = new HashMap();
        HashMap term8840 = new HashMap();
        HashMap term8841 = new HashMap();
        HashMap term8842 = new HashMap();
        HashMap term8843 = new HashMap();
        HashMap term8844 = new HashMap();
        term8830 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term8831 = newInstance(Class.forName("java.lang.Object"));
        Object term8834 = newInstance(Class.forName("java.lang.Object"));
        Object term8835 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term8836 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term8837 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term8838 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term8830, term8830.getClass(), "node", term8831);
        setField(term8830, term8830.getClass(), "id", "BndsHwAFMv");
        setIntField(term8830, term8830.getClass(), "index", 865208305);
        setBooleanField(term8830, term8830.getClass(), "attribute", false);
        setField(term8830, term8830.getClass(), "rootNode", term8834);
        setField(term8838, term8838.getClass(), "parent", null);
        setField(term8838, term8838.getClass(), "namespaceMap", null);
        setField(term8838, term8838.getClass(), "reverseMap", null);
        setField(term8838, term8838.getClass(), "pointer", null);
        setField(term8838, term8838.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term8838, term8838.getClass(), "sealed", false);
        setField(term8837, term8837.getClass(), "parent", term8838);
        setField(term8837, term8837.getClass(), "namespaceMap", term8839);
        setField(term8837, term8837.getClass(), "reverseMap", term8840);
        setField(term8837, term8837.getClass(), "pointer", null);
        setField(term8837, term8837.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term8837, term8837.getClass(), "sealed", false);
        setField(term8836, term8836.getClass(), "parent", term8837);
        setField(term8836, term8836.getClass(), "namespaceMap", term8841);
        setField(term8836, term8836.getClass(), "reverseMap", term8842);
        setField(term8836, term8836.getClass(), "pointer", null);
        setField(term8836, term8836.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term8836, term8836.getClass(), "sealed", false);
        setField(term8835, term8835.getClass(), "parent", term8836);
        setField(term8835, term8835.getClass(), "namespaceMap", term8843);
        setField(term8835, term8835.getClass(), "reverseMap", term8844);
        setField(term8835, term8835.getClass(), "pointer", null);
        setField(term8835, term8835.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term8835, term8835.getClass(), "sealed", false);
        setField(term8830, term8830.getClass(), "namespaceResolver", term8835);
        setField(term8830, term8830.getClass(), "parent", null);
        setField(term8830, term8830.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRelativePositionByName", argTypes, term2112, args);
        assertTrue(recursiveEquals(term2112, term8830));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


