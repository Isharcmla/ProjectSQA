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
import static org.apache.commons.jxpath.ri.model.beans.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.jxpath.ri.model.beans.EqualityUtils.*;
import java.lang.Object;
import java.util.HashMap;

public class NullPropertyPointer_getName_38472049925 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term1828;
     Object term1745;

    public NullPropertyPointer_getName_38472049925() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term26 = new HashMap();
        HashMap term31 = new HashMap();
        HashMap term37 = new HashMap();
        HashMap term42 = new HashMap();
        HashMap term48 = new HashMap();
        HashMap term53 = new HashMap();
        term1 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term16 = newInstance(Class.forName("java.lang.Object"));
        Object term17 = newInstance(Class.forName("java.lang.Object"));
        Object term20 = newInstance(Class.forName("java.lang.Object"));
        Object term21 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term22 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term23 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term24 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1, term1.getClass(), "propertyName", "PAEBtnZtTD");
        setBooleanField(term1, term1.getClass(), "byNameAttribute", false);
        setIntField(term1, term1.getClass(), "propertyIndex", 568599855);
        setField(term1, term1.getClass(), "bean", term16);
        setField(term1, term1.getClass(), "value", term17);
        setIntField(term1, term1.getClass(), "index", 1162663216);
        setBooleanField(term1, term1.getClass(), "attribute", false);
        setField(term1, term1.getClass(), "rootNode", term20);
        setField(term24, term24.getClass(), "parent", null);
        setField(term24, term24.getClass(), "namespaceMap", null);
        setField(term24, term24.getClass(), "reverseMap", null);
        setField(term24, term24.getClass(), "pointer", null);
        setField(term24, term24.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term24, term24.getClass(), "sealed", false);
        setField(term23, term23.getClass(), "parent", term24);
        setField(term23, term23.getClass(), "namespaceMap", term26);
        setField(term23, term23.getClass(), "reverseMap", term31);
        setField(term23, term23.getClass(), "pointer", null);
        setField(term23, term23.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term23, term23.getClass(), "sealed", false);
        setField(term22, term22.getClass(), "parent", term23);
        setField(term22, term22.getClass(), "namespaceMap", term37);
        setField(term22, term22.getClass(), "reverseMap", term42);
        setField(term22, term22.getClass(), "pointer", null);
        setField(term22, term22.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term22, term22.getClass(), "sealed", false);
        setField(term21, term21.getClass(), "parent", term22);
        setField(term21, term21.getClass(), "namespaceMap", term48);
        setField(term21, term21.getClass(), "reverseMap", term53);
        setField(term21, term21.getClass(), "pointer", null);
        setField(term21, term21.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term21, term21.getClass(), "sealed", false);
        setField(term1, term1.getClass(), "namespaceResolver", term21);
        setField(term1, term1.getClass(), "parent", null);
        setField(term1, term1.getClass(), "locale", null);
        HashMap term1838 = new HashMap();
        HashMap term1839 = new HashMap();
        HashMap term1840 = new HashMap();
        HashMap term1841 = new HashMap();
        HashMap term1842 = new HashMap();
        HashMap term1843 = new HashMap();
        term1828 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term1831 = newInstance(Class.forName("java.lang.Object"));
        Object term1832 = newInstance(Class.forName("java.lang.Object"));
        Object term1833 = newInstance(Class.forName("java.lang.Object"));
        Object term1834 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1835 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1836 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1837 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1828, term1828.getClass(), "propertyName", "PAEBtnZtTD");
        setBooleanField(term1828, term1828.getClass(), "byNameAttribute", false);
        setIntField(term1828, term1828.getClass(), "propertyIndex", 568599855);
        setField(term1828, term1828.getClass(), "bean", term1831);
        setField(term1828, term1828.getClass(), "value", term1832);
        setIntField(term1828, term1828.getClass(), "index", 1162663216);
        setBooleanField(term1828, term1828.getClass(), "attribute", false);
        setField(term1828, term1828.getClass(), "rootNode", term1833);
        setField(term1837, term1837.getClass(), "parent", null);
        setField(term1837, term1837.getClass(), "namespaceMap", null);
        setField(term1837, term1837.getClass(), "reverseMap", null);
        setField(term1837, term1837.getClass(), "pointer", null);
        setField(term1837, term1837.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1837, term1837.getClass(), "sealed", false);
        setField(term1836, term1836.getClass(), "parent", term1837);
        setField(term1836, term1836.getClass(), "namespaceMap", term1838);
        setField(term1836, term1836.getClass(), "reverseMap", term1839);
        setField(term1836, term1836.getClass(), "pointer", null);
        setField(term1836, term1836.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1836, term1836.getClass(), "sealed", false);
        setField(term1835, term1835.getClass(), "parent", term1836);
        setField(term1835, term1835.getClass(), "namespaceMap", term1840);
        setField(term1835, term1835.getClass(), "reverseMap", term1841);
        setField(term1835, term1835.getClass(), "pointer", null);
        setField(term1835, term1835.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1835, term1835.getClass(), "sealed", false);
        setField(term1834, term1834.getClass(), "parent", term1835);
        setField(term1834, term1834.getClass(), "namespaceMap", term1842);
        setField(term1834, term1834.getClass(), "reverseMap", term1843);
        setField(term1834, term1834.getClass(), "pointer", null);
        setField(term1834, term1834.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1834, term1834.getClass(), "sealed", false);
        setField(term1828, term1828.getClass(), "namespaceResolver", term1834);
        setField(term1828, term1828.getClass(), "parent", null);
        setField(term1828, term1828.getClass(), "locale", null);
        term1745 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term1745, term1745.getClass(), "prefix", null);
        setField(term1745, term1745.getClass(), "name", "PAEBtnZtTD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getName", argTypes, term1, args);
        assertTrue(recursiveEquals(term1, term1828));
        assertTrue(recursiveEquals(retValue, term1745));
    }

};


