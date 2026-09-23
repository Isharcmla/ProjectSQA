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

public class DOMNodePointer_isCollection_179411917061 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1555;
     Object term7609;

    public DOMNodePointer_isCollection_179411917061() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1556 = new HashMap();
        HashMap term1590 = new HashMap();
        HashMap term1595 = new HashMap();
        HashMap term1601 = new HashMap();
        HashMap term1606 = new HashMap();
        HashMap term1612 = new HashMap();
        HashMap term1617 = new HashMap();
        HashMap term1626 = new HashMap();
        HashMap term1631 = new HashMap();
        term1555 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term1585 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1586 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1587 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1588 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1625 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1637 = newInstance(Class.forName("java.lang.Object"));
        setField(term1555, term1555.getClass(), "node", null);
        setField(term1555, term1555.getClass(), "namespaces", term1556);
        setField(term1555, term1555.getClass(), "defaultNamespace", "kuTXqwMtDB");
        setField(term1555, term1555.getClass(), "id", "Ghbwtircqb");
        setField(term1588, term1588.getClass(), "parent", null);
        setField(term1588, term1588.getClass(), "namespaceMap", null);
        setField(term1588, term1588.getClass(), "reverseMap", null);
        setField(term1588, term1588.getClass(), "pointer", null);
        setBooleanField(term1588, term1588.getClass(), "sealed", false);
        setField(term1587, term1587.getClass(), "parent", term1588);
        setField(term1587, term1587.getClass(), "namespaceMap", term1590);
        setField(term1587, term1587.getClass(), "reverseMap", term1595);
        setField(term1587, term1587.getClass(), "pointer", null);
        setBooleanField(term1587, term1587.getClass(), "sealed", false);
        setField(term1586, term1586.getClass(), "parent", term1587);
        setField(term1586, term1586.getClass(), "namespaceMap", term1601);
        setField(term1586, term1586.getClass(), "reverseMap", term1606);
        setField(term1586, term1586.getClass(), "pointer", null);
        setBooleanField(term1586, term1586.getClass(), "sealed", false);
        setField(term1585, term1585.getClass(), "parent", term1586);
        setField(term1585, term1585.getClass(), "namespaceMap", term1612);
        setField(term1585, term1585.getClass(), "reverseMap", term1617);
        setField(term1585, term1585.getClass(), "pointer", null);
        setBooleanField(term1585, term1585.getClass(), "sealed", false);
        setField(term1555, term1555.getClass(), "localNamespaceResolver", term1585);
        setIntField(term1555, term1555.getClass(), "index", -883034806);
        setBooleanField(term1555, term1555.getClass(), "attribute", false);
        setField(term1625, term1625.getClass(), "parent", null);
        setField(term1625, term1625.getClass(), "namespaceMap", term1626);
        setField(term1625, term1625.getClass(), "reverseMap", term1631);
        setField(term1625, term1625.getClass(), "pointer", null);
        setBooleanField(term1625, term1625.getClass(), "sealed", false);
        setField(term1555, term1555.getClass(), "namespaceResolver", term1625);
        setField(term1555, term1555.getClass(), "rootNode", term1637);
        setField(term1555, term1555.getClass(), "parent", null);
        setField(term1555, term1555.getClass(), "locale", null);
        HashMap term7610 = new HashMap();
        HashMap term7619 = new HashMap();
        HashMap term7620 = new HashMap();
        HashMap term7621 = new HashMap();
        HashMap term7622 = new HashMap();
        HashMap term7623 = new HashMap();
        HashMap term7624 = new HashMap();
        HashMap term7626 = new HashMap();
        HashMap term7627 = new HashMap();
        term7609 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term7615 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7616 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7617 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7618 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7625 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7628 = newInstance(Class.forName("java.lang.Object"));
        setField(term7609, term7609.getClass(), "node", null);
        setField(term7609, term7609.getClass(), "namespaces", term7610);
        setField(term7609, term7609.getClass(), "defaultNamespace", "kuTXqwMtDB");
        setField(term7609, term7609.getClass(), "id", "Ghbwtircqb");
        setField(term7618, term7618.getClass(), "parent", null);
        setField(term7618, term7618.getClass(), "namespaceMap", null);
        setField(term7618, term7618.getClass(), "reverseMap", null);
        setField(term7618, term7618.getClass(), "pointer", null);
        setBooleanField(term7618, term7618.getClass(), "sealed", false);
        setField(term7617, term7617.getClass(), "parent", term7618);
        setField(term7617, term7617.getClass(), "namespaceMap", term7619);
        setField(term7617, term7617.getClass(), "reverseMap", term7620);
        setField(term7617, term7617.getClass(), "pointer", null);
        setBooleanField(term7617, term7617.getClass(), "sealed", false);
        setField(term7616, term7616.getClass(), "parent", term7617);
        setField(term7616, term7616.getClass(), "namespaceMap", term7621);
        setField(term7616, term7616.getClass(), "reverseMap", term7622);
        setField(term7616, term7616.getClass(), "pointer", null);
        setBooleanField(term7616, term7616.getClass(), "sealed", false);
        setField(term7615, term7615.getClass(), "parent", term7616);
        setField(term7615, term7615.getClass(), "namespaceMap", term7623);
        setField(term7615, term7615.getClass(), "reverseMap", term7624);
        setField(term7615, term7615.getClass(), "pointer", null);
        setBooleanField(term7615, term7615.getClass(), "sealed", false);
        setField(term7609, term7609.getClass(), "localNamespaceResolver", term7615);
        setIntField(term7609, term7609.getClass(), "index", -883034806);
        setBooleanField(term7609, term7609.getClass(), "attribute", false);
        setField(term7625, term7625.getClass(), "parent", null);
        setField(term7625, term7625.getClass(), "namespaceMap", term7626);
        setField(term7625, term7625.getClass(), "reverseMap", term7627);
        setField(term7625, term7625.getClass(), "pointer", null);
        setBooleanField(term7625, term7625.getClass(), "sealed", false);
        setField(term7609, term7609.getClass(), "namespaceResolver", term7625);
        setField(term7609, term7609.getClass(), "rootNode", term7628);
        setField(term7609, term7609.getClass(), "parent", null);
        setField(term7609, term7609.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isCollection", argTypes, term1555, args);
        assertTrue(recursiveEquals(term1555, term7609));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


