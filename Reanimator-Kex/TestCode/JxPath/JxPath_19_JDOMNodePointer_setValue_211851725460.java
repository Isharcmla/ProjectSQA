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

public class JDOMNodePointer_setValue_211851725460 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1691;
     Object term1782;

    public JDOMNodePointer_setValue_211851725460() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1710 = new HashMap();
        HashMap term1715 = new HashMap();
        HashMap term1721 = new HashMap();
        HashMap term1726 = new HashMap();
        HashMap term1732 = new HashMap();
        HashMap term1737 = new HashMap();
        HashMap term1748 = new HashMap();
        HashMap term1753 = new HashMap();
        HashMap term1759 = new HashMap();
        HashMap term1764 = new HashMap();
        HashMap term1770 = new HashMap();
        HashMap term1775 = new HashMap();
        term1691 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1692 = newInstance(Class.forName("java.lang.Object"));
        Object term1705 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1706 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1707 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1708 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1745 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1746 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1747 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1781 = newInstance(Class.forName("java.lang.Object"));
        setField(term1691, term1691.getClass(), "node", term1692);
        setField(term1691, term1691.getClass(), "id", "RkybSrpybU");
        setField(term1708, term1708.getClass(), "parent", null);
        setField(term1708, term1708.getClass(), "namespaceMap", null);
        setField(term1708, term1708.getClass(), "reverseMap", null);
        setField(term1708, term1708.getClass(), "pointer", null);
        setBooleanField(term1708, term1708.getClass(), "sealed", false);
        setField(term1707, term1707.getClass(), "parent", term1708);
        setField(term1707, term1707.getClass(), "namespaceMap", term1710);
        setField(term1707, term1707.getClass(), "reverseMap", term1715);
        setField(term1707, term1707.getClass(), "pointer", null);
        setBooleanField(term1707, term1707.getClass(), "sealed", false);
        setField(term1706, term1706.getClass(), "parent", term1707);
        setField(term1706, term1706.getClass(), "namespaceMap", term1721);
        setField(term1706, term1706.getClass(), "reverseMap", term1726);
        setField(term1706, term1706.getClass(), "pointer", null);
        setBooleanField(term1706, term1706.getClass(), "sealed", false);
        setField(term1705, term1705.getClass(), "parent", term1706);
        setField(term1705, term1705.getClass(), "namespaceMap", term1732);
        setField(term1705, term1705.getClass(), "reverseMap", term1737);
        setField(term1705, term1705.getClass(), "pointer", null);
        setBooleanField(term1705, term1705.getClass(), "sealed", false);
        setField(term1691, term1691.getClass(), "localNamespaceResolver", term1705);
        setIntField(term1691, term1691.getClass(), "index", 597278769);
        setBooleanField(term1691, term1691.getClass(), "attribute", true);
        setField(term1747, term1747.getClass(), "parent", null);
        setField(term1747, term1747.getClass(), "namespaceMap", term1748);
        setField(term1747, term1747.getClass(), "reverseMap", term1753);
        setField(term1747, term1747.getClass(), "pointer", null);
        setBooleanField(term1747, term1747.getClass(), "sealed", false);
        setField(term1746, term1746.getClass(), "parent", term1747);
        setField(term1746, term1746.getClass(), "namespaceMap", term1759);
        setField(term1746, term1746.getClass(), "reverseMap", term1764);
        setField(term1746, term1746.getClass(), "pointer", null);
        setBooleanField(term1746, term1746.getClass(), "sealed", false);
        setField(term1745, term1745.getClass(), "parent", term1746);
        setField(term1745, term1745.getClass(), "namespaceMap", term1770);
        setField(term1745, term1745.getClass(), "reverseMap", term1775);
        setField(term1745, term1745.getClass(), "pointer", null);
        setBooleanField(term1745, term1745.getClass(), "sealed", false);
        setField(term1691, term1691.getClass(), "namespaceResolver", term1745);
        setField(term1691, term1691.getClass(), "rootNode", term1781);
        setField(term1691, term1691.getClass(), "parent", null);
        setField(term1691, term1691.getClass(), "locale", null);
        term1782 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1782;
        try {
            callMethod(klass, "setValue", argTypes, term1691, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


