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

public class NullPropertyPointer_escape_119373006847 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1640;
     Object term5295;

    public NullPropertyPointer_escape_119373006847() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1665 = new HashMap();
        HashMap term1670 = new HashMap();
        HashMap term1676 = new HashMap();
        HashMap term1681 = new HashMap();
        HashMap term1687 = new HashMap();
        HashMap term1692 = new HashMap();
        term1640 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term1655 = newInstance(Class.forName("java.lang.Object"));
        Object term1656 = newInstance(Class.forName("java.lang.Object"));
        Object term1659 = newInstance(Class.forName("java.lang.Object"));
        Object term1660 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1661 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1662 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1663 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1640, term1640.getClass(), "propertyName", "IoAlmYsBwc");
        setBooleanField(term1640, term1640.getClass(), "byNameAttribute", false);
        setIntField(term1640, term1640.getClass(), "propertyIndex", -1968847291);
        setField(term1640, term1640.getClass(), "bean", term1655);
        setField(term1640, term1640.getClass(), "value", term1656);
        setIntField(term1640, term1640.getClass(), "index", 579005622);
        setBooleanField(term1640, term1640.getClass(), "attribute", true);
        setField(term1640, term1640.getClass(), "rootNode", term1659);
        setField(term1663, term1663.getClass(), "parent", null);
        setField(term1663, term1663.getClass(), "namespaceMap", null);
        setField(term1663, term1663.getClass(), "reverseMap", null);
        setField(term1663, term1663.getClass(), "pointer", null);
        setField(term1663, term1663.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1663, term1663.getClass(), "sealed", false);
        setField(term1662, term1662.getClass(), "parent", term1663);
        setField(term1662, term1662.getClass(), "namespaceMap", term1665);
        setField(term1662, term1662.getClass(), "reverseMap", term1670);
        setField(term1662, term1662.getClass(), "pointer", null);
        setField(term1662, term1662.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1662, term1662.getClass(), "sealed", false);
        setField(term1661, term1661.getClass(), "parent", term1662);
        setField(term1661, term1661.getClass(), "namespaceMap", term1676);
        setField(term1661, term1661.getClass(), "reverseMap", term1681);
        setField(term1661, term1661.getClass(), "pointer", null);
        setField(term1661, term1661.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1661, term1661.getClass(), "sealed", false);
        setField(term1660, term1660.getClass(), "parent", term1661);
        setField(term1660, term1660.getClass(), "namespaceMap", term1687);
        setField(term1660, term1660.getClass(), "reverseMap", term1692);
        setField(term1660, term1660.getClass(), "pointer", null);
        setField(term1660, term1660.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1660, term1660.getClass(), "sealed", false);
        setField(term1640, term1640.getClass(), "namespaceResolver", term1660);
        setField(term1640, term1640.getClass(), "parent", null);
        setField(term1640, term1640.getClass(), "locale", null);
        HashMap term5305 = new HashMap();
        HashMap term5306 = new HashMap();
        HashMap term5307 = new HashMap();
        HashMap term5308 = new HashMap();
        HashMap term5309 = new HashMap();
        HashMap term5310 = new HashMap();
        term5295 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term5298 = newInstance(Class.forName("java.lang.Object"));
        Object term5299 = newInstance(Class.forName("java.lang.Object"));
        Object term5300 = newInstance(Class.forName("java.lang.Object"));
        Object term5301 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5302 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5303 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5304 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term5295, term5295.getClass(), "propertyName", "IoAlmYsBwc");
        setBooleanField(term5295, term5295.getClass(), "byNameAttribute", false);
        setIntField(term5295, term5295.getClass(), "propertyIndex", -1968847291);
        setField(term5295, term5295.getClass(), "bean", term5298);
        setField(term5295, term5295.getClass(), "value", term5299);
        setIntField(term5295, term5295.getClass(), "index", 579005622);
        setBooleanField(term5295, term5295.getClass(), "attribute", true);
        setField(term5295, term5295.getClass(), "rootNode", term5300);
        setField(term5304, term5304.getClass(), "parent", null);
        setField(term5304, term5304.getClass(), "namespaceMap", null);
        setField(term5304, term5304.getClass(), "reverseMap", null);
        setField(term5304, term5304.getClass(), "pointer", null);
        setField(term5304, term5304.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term5304, term5304.getClass(), "sealed", false);
        setField(term5303, term5303.getClass(), "parent", term5304);
        setField(term5303, term5303.getClass(), "namespaceMap", term5305);
        setField(term5303, term5303.getClass(), "reverseMap", term5306);
        setField(term5303, term5303.getClass(), "pointer", null);
        setField(term5303, term5303.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term5303, term5303.getClass(), "sealed", false);
        setField(term5302, term5302.getClass(), "parent", term5303);
        setField(term5302, term5302.getClass(), "namespaceMap", term5307);
        setField(term5302, term5302.getClass(), "reverseMap", term5308);
        setField(term5302, term5302.getClass(), "pointer", null);
        setField(term5302, term5302.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term5302, term5302.getClass(), "sealed", false);
        setField(term5301, term5301.getClass(), "parent", term5302);
        setField(term5301, term5301.getClass(), "namespaceMap", term5309);
        setField(term5301, term5301.getClass(), "reverseMap", term5310);
        setField(term5301, term5301.getClass(), "pointer", null);
        setField(term5301, term5301.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term5301, term5301.getClass(), "sealed", false);
        setField(term5295, term5295.getClass(), "namespaceResolver", term5301);
        setField(term5295, term5295.getClass(), "parent", null);
        setField(term5295, term5295.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "TEParAifyi";
        Object retValue = callMethod(klass, "escape", argTypes, term1640, args);
        assertTrue(recursiveEquals(term1640, term5295));
        assertTrue(recursiveEquals(retValue, "TEParAifyi"));
    }

};


