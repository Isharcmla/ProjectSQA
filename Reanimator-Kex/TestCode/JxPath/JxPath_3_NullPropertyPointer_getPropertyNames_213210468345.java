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

public class NullPropertyPointer_getPropertyNames_213210468345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1504;
     Object term4832;
     Object term4773;

    public NullPropertyPointer_getPropertyNames_213210468345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1529 = new HashMap();
        HashMap term1534 = new HashMap();
        HashMap term1540 = new HashMap();
        HashMap term1545 = new HashMap();
        HashMap term1551 = new HashMap();
        HashMap term1556 = new HashMap();
        term1504 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term1519 = newInstance(Class.forName("java.lang.Object"));
        Object term1520 = newInstance(Class.forName("java.lang.Object"));
        Object term1523 = newInstance(Class.forName("java.lang.Object"));
        Object term1524 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1525 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1526 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1527 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1504, term1504.getClass(), "propertyName", "flxyYxBRtu");
        setBooleanField(term1504, term1504.getClass(), "byNameAttribute", false);
        setIntField(term1504, term1504.getClass(), "propertyIndex", -157887805);
        setField(term1504, term1504.getClass(), "bean", term1519);
        setField(term1504, term1504.getClass(), "value", term1520);
        setIntField(term1504, term1504.getClass(), "index", 1876565163);
        setBooleanField(term1504, term1504.getClass(), "attribute", false);
        setField(term1504, term1504.getClass(), "rootNode", term1523);
        setField(term1527, term1527.getClass(), "parent", null);
        setField(term1527, term1527.getClass(), "namespaceMap", null);
        setField(term1527, term1527.getClass(), "reverseMap", null);
        setField(term1527, term1527.getClass(), "pointer", null);
        setField(term1527, term1527.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1527, term1527.getClass(), "sealed", false);
        setField(term1526, term1526.getClass(), "parent", term1527);
        setField(term1526, term1526.getClass(), "namespaceMap", term1529);
        setField(term1526, term1526.getClass(), "reverseMap", term1534);
        setField(term1526, term1526.getClass(), "pointer", null);
        setField(term1526, term1526.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1526, term1526.getClass(), "sealed", false);
        setField(term1525, term1525.getClass(), "parent", term1526);
        setField(term1525, term1525.getClass(), "namespaceMap", term1540);
        setField(term1525, term1525.getClass(), "reverseMap", term1545);
        setField(term1525, term1525.getClass(), "pointer", null);
        setField(term1525, term1525.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1525, term1525.getClass(), "sealed", false);
        setField(term1524, term1524.getClass(), "parent", term1525);
        setField(term1524, term1524.getClass(), "namespaceMap", term1551);
        setField(term1524, term1524.getClass(), "reverseMap", term1556);
        setField(term1524, term1524.getClass(), "pointer", null);
        setField(term1524, term1524.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1524, term1524.getClass(), "sealed", false);
        setField(term1504, term1504.getClass(), "namespaceResolver", term1524);
        setField(term1504, term1504.getClass(), "parent", null);
        setField(term1504, term1504.getClass(), "locale", null);
        HashMap term4842 = new HashMap();
        HashMap term4843 = new HashMap();
        HashMap term4844 = new HashMap();
        HashMap term4845 = new HashMap();
        HashMap term4846 = new HashMap();
        HashMap term4847 = new HashMap();
        term4832 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term4835 = newInstance(Class.forName("java.lang.Object"));
        Object term4836 = newInstance(Class.forName("java.lang.Object"));
        Object term4837 = newInstance(Class.forName("java.lang.Object"));
        Object term4838 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term4839 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term4840 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term4841 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term4832, term4832.getClass(), "propertyName", "flxyYxBRtu");
        setBooleanField(term4832, term4832.getClass(), "byNameAttribute", false);
        setIntField(term4832, term4832.getClass(), "propertyIndex", -157887805);
        setField(term4832, term4832.getClass(), "bean", term4835);
        setField(term4832, term4832.getClass(), "value", term4836);
        setIntField(term4832, term4832.getClass(), "index", 1876565163);
        setBooleanField(term4832, term4832.getClass(), "attribute", false);
        setField(term4832, term4832.getClass(), "rootNode", term4837);
        setField(term4841, term4841.getClass(), "parent", null);
        setField(term4841, term4841.getClass(), "namespaceMap", null);
        setField(term4841, term4841.getClass(), "reverseMap", null);
        setField(term4841, term4841.getClass(), "pointer", null);
        setField(term4841, term4841.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term4841, term4841.getClass(), "sealed", false);
        setField(term4840, term4840.getClass(), "parent", term4841);
        setField(term4840, term4840.getClass(), "namespaceMap", term4842);
        setField(term4840, term4840.getClass(), "reverseMap", term4843);
        setField(term4840, term4840.getClass(), "pointer", null);
        setField(term4840, term4840.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term4840, term4840.getClass(), "sealed", false);
        setField(term4839, term4839.getClass(), "parent", term4840);
        setField(term4839, term4839.getClass(), "namespaceMap", term4844);
        setField(term4839, term4839.getClass(), "reverseMap", term4845);
        setField(term4839, term4839.getClass(), "pointer", null);
        setField(term4839, term4839.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term4839, term4839.getClass(), "sealed", false);
        setField(term4838, term4838.getClass(), "parent", term4839);
        setField(term4838, term4838.getClass(), "namespaceMap", term4846);
        setField(term4838, term4838.getClass(), "reverseMap", term4847);
        setField(term4838, term4838.getClass(), "pointer", null);
        setField(term4838, term4838.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term4838, term4838.getClass(), "sealed", false);
        setField(term4832, term4832.getClass(), "namespaceResolver", term4838);
        setField(term4832, term4832.getClass(), "parent", null);
        setField(term4832, term4832.getClass(), "locale", null);
        term4773 = (Object[]) newArray("java.lang.String", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPropertyNames", argTypes, term1504, args);
        assertTrue(recursiveEquals(term1504, term4832));
        assertTrue(recursiveEquals(retValue, term4773));
    }

};


