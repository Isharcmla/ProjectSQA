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
import org.apache.commons.jxpath.JXPathException;
import static org.apache.commons.jxpath.ri.model.jdom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;

public class JDOMNodePointer_remove_166943352476 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2741;

    public JDOMNodePointer_remove_166943352476() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2760 = new HashMap();
        HashMap term2765 = new HashMap();
        HashMap term2771 = new HashMap();
        HashMap term2776 = new HashMap();
        HashMap term2782 = new HashMap();
        HashMap term2787 = new HashMap();
        HashMap term2799 = new HashMap();
        HashMap term2805 = new HashMap();
        HashMap term2810 = new HashMap();
        HashMap term2816 = new HashMap();
        HashMap term2821 = new HashMap();
        term2741 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term2742 = newInstance(Class.forName("java.lang.Object"));
        Object term2755 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2756 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2757 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2758 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2795 = newInstance(Class.forName("java.lang.Object"));
        Object term2796 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2797 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2798 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term2741, term2741.getClass(), "node", term2742);
        setField(term2741, term2741.getClass(), "id", "BndsHwAFMv");
        setField(term2758, term2758.getClass(), "parent", null);
        setField(term2758, term2758.getClass(), "namespaceMap", null);
        setField(term2758, term2758.getClass(), "reverseMap", null);
        setField(term2758, term2758.getClass(), "pointer", null);
        setBooleanField(term2758, term2758.getClass(), "sealed", false);
        setField(term2757, term2757.getClass(), "parent", term2758);
        setField(term2757, term2757.getClass(), "namespaceMap", term2760);
        setField(term2757, term2757.getClass(), "reverseMap", term2765);
        setField(term2757, term2757.getClass(), "pointer", null);
        setBooleanField(term2757, term2757.getClass(), "sealed", false);
        setField(term2756, term2756.getClass(), "parent", term2757);
        setField(term2756, term2756.getClass(), "namespaceMap", term2771);
        setField(term2756, term2756.getClass(), "reverseMap", term2776);
        setField(term2756, term2756.getClass(), "pointer", null);
        setBooleanField(term2756, term2756.getClass(), "sealed", false);
        setField(term2755, term2755.getClass(), "parent", term2756);
        setField(term2755, term2755.getClass(), "namespaceMap", term2782);
        setField(term2755, term2755.getClass(), "reverseMap", term2787);
        setField(term2755, term2755.getClass(), "pointer", null);
        setBooleanField(term2755, term2755.getClass(), "sealed", false);
        setField(term2741, term2741.getClass(), "localNamespaceResolver", term2755);
        setIntField(term2741, term2741.getClass(), "index", 1135664017);
        setBooleanField(term2741, term2741.getClass(), "attribute", true);
        setField(term2741, term2741.getClass(), "rootNode", term2795);
        setField(term2798, term2798.getClass(), "parent", null);
        setField(term2798, term2798.getClass(), "namespaceMap", term2799);
        setField(term2798, term2798.getClass(), "reverseMap", null);
        setField(term2798, term2798.getClass(), "pointer", null);
        setBooleanField(term2798, term2798.getClass(), "sealed", false);
        setField(term2797, term2797.getClass(), "parent", term2798);
        setField(term2797, term2797.getClass(), "namespaceMap", term2805);
        setField(term2797, term2797.getClass(), "reverseMap", term2810);
        setField(term2797, term2797.getClass(), "pointer", null);
        setBooleanField(term2797, term2797.getClass(), "sealed", false);
        setField(term2796, term2796.getClass(), "parent", term2797);
        setField(term2796, term2796.getClass(), "namespaceMap", term2816);
        setField(term2796, term2796.getClass(), "reverseMap", term2821);
        setField(term2796, term2796.getClass(), "pointer", null);
        setBooleanField(term2796, term2796.getClass(), "sealed", false);
        setField(term2741, term2741.getClass(), "namespaceResolver", term2796);
        setField(term2741, term2741.getClass(), "parent", null);
        setField(term2741, term2741.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "remove", argTypes, term2741, args);
            assertTrue(false);
        }
        catch (JXPathException e) {
        }

    }

};


