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

public class JDOMNodePointer_setValue_211851725462 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1616;
     Object term1702;

    public JDOMNodePointer_setValue_211851725462() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1635 = new HashMap();
        HashMap term1640 = new HashMap();
        HashMap term1646 = new HashMap();
        HashMap term1651 = new HashMap();
        HashMap term1657 = new HashMap();
        HashMap term1662 = new HashMap();
        HashMap term1674 = new HashMap();
        HashMap term1680 = new HashMap();
        HashMap term1685 = new HashMap();
        HashMap term1691 = new HashMap();
        HashMap term1696 = new HashMap();
        term1616 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1617 = newInstance(Class.forName("java.lang.Object"));
        Object term1630 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1631 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1632 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1633 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1670 = newInstance(Class.forName("java.lang.Object"));
        Object term1671 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1672 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1673 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1616, term1616.getClass(), "node", term1617);
        setField(term1616, term1616.getClass(), "id", "RkybSrpybU");
        setField(term1633, term1633.getClass(), "parent", null);
        setField(term1633, term1633.getClass(), "namespaceMap", null);
        setField(term1633, term1633.getClass(), "reverseMap", null);
        setField(term1633, term1633.getClass(), "pointer", null);
        setBooleanField(term1633, term1633.getClass(), "sealed", false);
        setField(term1632, term1632.getClass(), "parent", term1633);
        setField(term1632, term1632.getClass(), "namespaceMap", term1635);
        setField(term1632, term1632.getClass(), "reverseMap", term1640);
        setField(term1632, term1632.getClass(), "pointer", null);
        setBooleanField(term1632, term1632.getClass(), "sealed", false);
        setField(term1631, term1631.getClass(), "parent", term1632);
        setField(term1631, term1631.getClass(), "namespaceMap", term1646);
        setField(term1631, term1631.getClass(), "reverseMap", term1651);
        setField(term1631, term1631.getClass(), "pointer", null);
        setBooleanField(term1631, term1631.getClass(), "sealed", false);
        setField(term1630, term1630.getClass(), "parent", term1631);
        setField(term1630, term1630.getClass(), "namespaceMap", term1657);
        setField(term1630, term1630.getClass(), "reverseMap", term1662);
        setField(term1630, term1630.getClass(), "pointer", null);
        setBooleanField(term1630, term1630.getClass(), "sealed", false);
        setField(term1616, term1616.getClass(), "localNamespaceResolver", term1630);
        setIntField(term1616, term1616.getClass(), "index", 597278769);
        setBooleanField(term1616, term1616.getClass(), "attribute", true);
        setField(term1616, term1616.getClass(), "rootNode", term1670);
        setField(term1673, term1673.getClass(), "parent", null);
        setField(term1673, term1673.getClass(), "namespaceMap", term1674);
        setField(term1673, term1673.getClass(), "reverseMap", null);
        setField(term1673, term1673.getClass(), "pointer", null);
        setBooleanField(term1673, term1673.getClass(), "sealed", false);
        setField(term1672, term1672.getClass(), "parent", term1673);
        setField(term1672, term1672.getClass(), "namespaceMap", term1680);
        setField(term1672, term1672.getClass(), "reverseMap", term1685);
        setField(term1672, term1672.getClass(), "pointer", null);
        setBooleanField(term1672, term1672.getClass(), "sealed", false);
        setField(term1671, term1671.getClass(), "parent", term1672);
        setField(term1671, term1671.getClass(), "namespaceMap", term1691);
        setField(term1671, term1671.getClass(), "reverseMap", term1696);
        setField(term1671, term1671.getClass(), "pointer", null);
        setBooleanField(term1671, term1671.getClass(), "sealed", false);
        setField(term1616, term1616.getClass(), "namespaceResolver", term1671);
        setField(term1616, term1616.getClass(), "parent", null);
        setField(term1616, term1616.getClass(), "locale", null);
        term1702 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1702;
        try {
            callMethod(klass, "setValue", argTypes, term1616, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


