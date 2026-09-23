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
import java.lang.NullPointerException;
import static org.apache.commons.jxpath.ri.model.dom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;

public class DOMNodePointer_isLanguage_153304781564 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1581;

    public DOMNodePointer_isLanguage_153304781564() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1582 = new HashMap();
        HashMap term1619 = new HashMap();
        HashMap term1624 = new HashMap();
        HashMap term1630 = new HashMap();
        HashMap term1635 = new HashMap();
        HashMap term1641 = new HashMap();
        HashMap term1646 = new HashMap();
        term1581 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term1613 = newInstance(Class.forName("java.lang.Object"));
        Object term1614 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1615 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1616 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1617 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1581, term1581.getClass(), "node", null);
        setField(term1581, term1581.getClass(), "namespaces", term1582);
        setField(term1581, term1581.getClass(), "defaultNamespace", "nyiiPDVjAc");
        setField(term1581, term1581.getClass(), "id", "aKnKipADSo");
        setIntField(term1581, term1581.getClass(), "index", 597278769);
        setBooleanField(term1581, term1581.getClass(), "attribute", true);
        setField(term1581, term1581.getClass(), "rootNode", term1613);
        setField(term1617, term1617.getClass(), "parent", null);
        setField(term1617, term1617.getClass(), "namespaceMap", null);
        setField(term1617, term1617.getClass(), "reverseMap", null);
        setField(term1617, term1617.getClass(), "pointer", null);
        setBooleanField(term1617, term1617.getClass(), "sealed", false);
        setField(term1616, term1616.getClass(), "parent", term1617);
        setField(term1616, term1616.getClass(), "namespaceMap", term1619);
        setField(term1616, term1616.getClass(), "reverseMap", term1624);
        setField(term1616, term1616.getClass(), "pointer", null);
        setBooleanField(term1616, term1616.getClass(), "sealed", false);
        setField(term1615, term1615.getClass(), "parent", term1616);
        setField(term1615, term1615.getClass(), "namespaceMap", term1630);
        setField(term1615, term1615.getClass(), "reverseMap", term1635);
        setField(term1615, term1615.getClass(), "pointer", null);
        setBooleanField(term1615, term1615.getClass(), "sealed", false);
        setField(term1614, term1614.getClass(), "parent", term1615);
        setField(term1614, term1614.getClass(), "namespaceMap", term1641);
        setField(term1614, term1614.getClass(), "reverseMap", term1646);
        setField(term1614, term1614.getClass(), "pointer", null);
        setBooleanField(term1614, term1614.getClass(), "sealed", false);
        setField(term1581, term1581.getClass(), "namespaceResolver", term1614);
        setField(term1581, term1581.getClass(), "parent", null);
        setField(term1581, term1581.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "wSQxaModmm";
        try {
            callMethod(klass, "isLanguage", argTypes, term1581, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


