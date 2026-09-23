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
import java.lang.NullPointerException;
import static org.apache.commons.jxpath.ri.model.jdom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;

public class JDOMNodePointer_getAbstractFactory_6050402085 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3650;

    public JDOMNodePointer_getAbstractFactory_6050402085() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3669 = new HashMap();
        HashMap term3674 = new HashMap();
        HashMap term3680 = new HashMap();
        HashMap term3685 = new HashMap();
        HashMap term3691 = new HashMap();
        HashMap term3696 = new HashMap();
        HashMap term3708 = new HashMap();
        HashMap term3714 = new HashMap();
        HashMap term3719 = new HashMap();
        HashMap term3725 = new HashMap();
        HashMap term3730 = new HashMap();
        term3650 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term3651 = newInstance(Class.forName("java.lang.Object"));
        Object term3664 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3665 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3666 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3667 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3704 = newInstance(Class.forName("java.lang.Object"));
        Object term3705 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3706 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3707 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term3650, term3650.getClass(), "node", term3651);
        setField(term3650, term3650.getClass(), "id", "YRHGsAkhxb");
        setField(term3667, term3667.getClass(), "parent", null);
        setField(term3667, term3667.getClass(), "namespaceMap", null);
        setField(term3667, term3667.getClass(), "reverseMap", null);
        setField(term3667, term3667.getClass(), "pointer", null);
        setBooleanField(term3667, term3667.getClass(), "sealed", false);
        setField(term3666, term3666.getClass(), "parent", term3667);
        setField(term3666, term3666.getClass(), "namespaceMap", term3669);
        setField(term3666, term3666.getClass(), "reverseMap", term3674);
        setField(term3666, term3666.getClass(), "pointer", null);
        setBooleanField(term3666, term3666.getClass(), "sealed", false);
        setField(term3665, term3665.getClass(), "parent", term3666);
        setField(term3665, term3665.getClass(), "namespaceMap", term3680);
        setField(term3665, term3665.getClass(), "reverseMap", term3685);
        setField(term3665, term3665.getClass(), "pointer", null);
        setBooleanField(term3665, term3665.getClass(), "sealed", false);
        setField(term3664, term3664.getClass(), "parent", term3665);
        setField(term3664, term3664.getClass(), "namespaceMap", term3691);
        setField(term3664, term3664.getClass(), "reverseMap", term3696);
        setField(term3664, term3664.getClass(), "pointer", null);
        setBooleanField(term3664, term3664.getClass(), "sealed", false);
        setField(term3650, term3650.getClass(), "localNamespaceResolver", term3664);
        setIntField(term3650, term3650.getClass(), "index", 1193880199);
        setBooleanField(term3650, term3650.getClass(), "attribute", true);
        setField(term3650, term3650.getClass(), "rootNode", term3704);
        setField(term3707, term3707.getClass(), "parent", null);
        setField(term3707, term3707.getClass(), "namespaceMap", term3708);
        setField(term3707, term3707.getClass(), "reverseMap", null);
        setField(term3707, term3707.getClass(), "pointer", null);
        setBooleanField(term3707, term3707.getClass(), "sealed", false);
        setField(term3706, term3706.getClass(), "parent", term3707);
        setField(term3706, term3706.getClass(), "namespaceMap", term3714);
        setField(term3706, term3706.getClass(), "reverseMap", term3719);
        setField(term3706, term3706.getClass(), "pointer", null);
        setBooleanField(term3706, term3706.getClass(), "sealed", false);
        setField(term3705, term3705.getClass(), "parent", term3706);
        setField(term3705, term3705.getClass(), "namespaceMap", term3725);
        setField(term3705, term3705.getClass(), "reverseMap", term3730);
        setField(term3705, term3705.getClass(), "pointer", null);
        setBooleanField(term3705, term3705.getClass(), "sealed", false);
        setField(term3650, term3650.getClass(), "namespaceResolver", term3705);
        setField(term3650, term3650.getClass(), "parent", null);
        setField(term3650, term3650.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.JXPathContext");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getAbstractFactory", argTypes, term3650, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


