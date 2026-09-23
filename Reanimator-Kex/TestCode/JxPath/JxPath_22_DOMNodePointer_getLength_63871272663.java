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

public class DOMNodePointer_getLength_63871272663 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1644;
     Object term7791;

    public DOMNodePointer_getLength_63871272663() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1645 = new HashMap();
        HashMap term1679 = new HashMap();
        HashMap term1684 = new HashMap();
        HashMap term1690 = new HashMap();
        HashMap term1695 = new HashMap();
        HashMap term1701 = new HashMap();
        HashMap term1706 = new HashMap();
        HashMap term1715 = new HashMap();
        HashMap term1720 = new HashMap();
        term1644 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term1674 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1675 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1676 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1677 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1714 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1644, term1644.getClass(), "node", null);
        setField(term1644, term1644.getClass(), "namespaces", term1645);
        setField(term1644, term1644.getClass(), "defaultNamespace", "xrwlQZdwCp");
        setField(term1644, term1644.getClass(), "id", "IDCWpPLRkE");
        setField(term1677, term1677.getClass(), "parent", null);
        setField(term1677, term1677.getClass(), "namespaceMap", null);
        setField(term1677, term1677.getClass(), "reverseMap", null);
        setField(term1677, term1677.getClass(), "pointer", null);
        setBooleanField(term1677, term1677.getClass(), "sealed", false);
        setField(term1676, term1676.getClass(), "parent", term1677);
        setField(term1676, term1676.getClass(), "namespaceMap", term1679);
        setField(term1676, term1676.getClass(), "reverseMap", term1684);
        setField(term1676, term1676.getClass(), "pointer", null);
        setBooleanField(term1676, term1676.getClass(), "sealed", false);
        setField(term1675, term1675.getClass(), "parent", term1676);
        setField(term1675, term1675.getClass(), "namespaceMap", term1690);
        setField(term1675, term1675.getClass(), "reverseMap", term1695);
        setField(term1675, term1675.getClass(), "pointer", null);
        setBooleanField(term1675, term1675.getClass(), "sealed", false);
        setField(term1674, term1674.getClass(), "parent", term1675);
        setField(term1674, term1674.getClass(), "namespaceMap", term1701);
        setField(term1674, term1674.getClass(), "reverseMap", term1706);
        setField(term1674, term1674.getClass(), "pointer", null);
        setBooleanField(term1674, term1674.getClass(), "sealed", false);
        setField(term1644, term1644.getClass(), "localNamespaceResolver", term1674);
        setIntField(term1644, term1644.getClass(), "index", 1585847225);
        setBooleanField(term1644, term1644.getClass(), "attribute", false);
        setField(term1714, term1714.getClass(), "parent", null);
        setField(term1714, term1714.getClass(), "namespaceMap", term1715);
        setField(term1714, term1714.getClass(), "reverseMap", term1720);
        setField(term1714, term1714.getClass(), "pointer", null);
        setBooleanField(term1714, term1714.getClass(), "sealed", false);
        setField(term1644, term1644.getClass(), "namespaceResolver", term1714);
        setField(term1644, term1644.getClass(), "exceptionHandler", null);
        setField(term1644, term1644.getClass(), "rootNode", null);
        setField(term1644, term1644.getClass(), "parent", null);
        setField(term1644, term1644.getClass(), "locale", null);
        HashMap term7792 = new HashMap();
        HashMap term7801 = new HashMap();
        HashMap term7802 = new HashMap();
        HashMap term7803 = new HashMap();
        HashMap term7804 = new HashMap();
        HashMap term7805 = new HashMap();
        HashMap term7806 = new HashMap();
        HashMap term7808 = new HashMap();
        HashMap term7809 = new HashMap();
        term7791 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term7797 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7798 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7799 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7800 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7807 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term7791, term7791.getClass(), "node", null);
        setField(term7791, term7791.getClass(), "namespaces", term7792);
        setField(term7791, term7791.getClass(), "defaultNamespace", "xrwlQZdwCp");
        setField(term7791, term7791.getClass(), "id", "IDCWpPLRkE");
        setField(term7800, term7800.getClass(), "parent", null);
        setField(term7800, term7800.getClass(), "namespaceMap", null);
        setField(term7800, term7800.getClass(), "reverseMap", null);
        setField(term7800, term7800.getClass(), "pointer", null);
        setBooleanField(term7800, term7800.getClass(), "sealed", false);
        setField(term7799, term7799.getClass(), "parent", term7800);
        setField(term7799, term7799.getClass(), "namespaceMap", term7801);
        setField(term7799, term7799.getClass(), "reverseMap", term7802);
        setField(term7799, term7799.getClass(), "pointer", null);
        setBooleanField(term7799, term7799.getClass(), "sealed", false);
        setField(term7798, term7798.getClass(), "parent", term7799);
        setField(term7798, term7798.getClass(), "namespaceMap", term7803);
        setField(term7798, term7798.getClass(), "reverseMap", term7804);
        setField(term7798, term7798.getClass(), "pointer", null);
        setBooleanField(term7798, term7798.getClass(), "sealed", false);
        setField(term7797, term7797.getClass(), "parent", term7798);
        setField(term7797, term7797.getClass(), "namespaceMap", term7805);
        setField(term7797, term7797.getClass(), "reverseMap", term7806);
        setField(term7797, term7797.getClass(), "pointer", null);
        setBooleanField(term7797, term7797.getClass(), "sealed", false);
        setField(term7791, term7791.getClass(), "localNamespaceResolver", term7797);
        setIntField(term7791, term7791.getClass(), "index", 1585847225);
        setBooleanField(term7791, term7791.getClass(), "attribute", false);
        setField(term7807, term7807.getClass(), "parent", null);
        setField(term7807, term7807.getClass(), "namespaceMap", term7808);
        setField(term7807, term7807.getClass(), "reverseMap", term7809);
        setField(term7807, term7807.getClass(), "pointer", null);
        setBooleanField(term7807, term7807.getClass(), "sealed", false);
        setField(term7791, term7791.getClass(), "namespaceResolver", term7807);
        setField(term7791, term7791.getClass(), "exceptionHandler", null);
        setField(term7791, term7791.getClass(), "rootNode", null);
        setField(term7791, term7791.getClass(), "parent", null);
        setField(term7791, term7791.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLength", argTypes, term1644, args);
        assertTrue(recursiveEquals(term1644, term7791));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


