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
import static org.apache.commons.jxpath.ri.model.jdom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.jxpath.ri.model.jdom.EqualityUtils.*;
import java.lang.Object;
import java.util.HashMap;

public class JDOMNodePointer_asPath_32729934477 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2837;
     Object term10997;

    public JDOMNodePointer_asPath_32729934477() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2856 = new HashMap();
        HashMap term2861 = new HashMap();
        HashMap term2867 = new HashMap();
        HashMap term2872 = new HashMap();
        HashMap term2878 = new HashMap();
        HashMap term2883 = new HashMap();
        HashMap term2895 = new HashMap();
        HashMap term2901 = new HashMap();
        HashMap term2906 = new HashMap();
        HashMap term2912 = new HashMap();
        HashMap term2917 = new HashMap();
        term2837 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term2838 = newInstance(Class.forName("java.lang.Object"));
        Object term2851 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2852 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2853 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2854 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2891 = newInstance(Class.forName("java.lang.Object"));
        Object term2892 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2893 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2894 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term2837, term2837.getClass(), "node", term2838);
        setField(term2837, term2837.getClass(), "id", "GzFkzHGYFt");
        setField(term2854, term2854.getClass(), "parent", null);
        setField(term2854, term2854.getClass(), "namespaceMap", null);
        setField(term2854, term2854.getClass(), "reverseMap", null);
        setField(term2854, term2854.getClass(), "pointer", null);
        setBooleanField(term2854, term2854.getClass(), "sealed", false);
        setField(term2853, term2853.getClass(), "parent", term2854);
        setField(term2853, term2853.getClass(), "namespaceMap", term2856);
        setField(term2853, term2853.getClass(), "reverseMap", term2861);
        setField(term2853, term2853.getClass(), "pointer", null);
        setBooleanField(term2853, term2853.getClass(), "sealed", false);
        setField(term2852, term2852.getClass(), "parent", term2853);
        setField(term2852, term2852.getClass(), "namespaceMap", term2867);
        setField(term2852, term2852.getClass(), "reverseMap", term2872);
        setField(term2852, term2852.getClass(), "pointer", null);
        setBooleanField(term2852, term2852.getClass(), "sealed", false);
        setField(term2851, term2851.getClass(), "parent", term2852);
        setField(term2851, term2851.getClass(), "namespaceMap", term2878);
        setField(term2851, term2851.getClass(), "reverseMap", term2883);
        setField(term2851, term2851.getClass(), "pointer", null);
        setBooleanField(term2851, term2851.getClass(), "sealed", false);
        setField(term2837, term2837.getClass(), "localNamespaceResolver", term2851);
        setIntField(term2837, term2837.getClass(), "index", 590364439);
        setBooleanField(term2837, term2837.getClass(), "attribute", false);
        setField(term2837, term2837.getClass(), "rootNode", term2891);
        setField(term2894, term2894.getClass(), "parent", null);
        setField(term2894, term2894.getClass(), "namespaceMap", term2895);
        setField(term2894, term2894.getClass(), "reverseMap", null);
        setField(term2894, term2894.getClass(), "pointer", null);
        setBooleanField(term2894, term2894.getClass(), "sealed", false);
        setField(term2893, term2893.getClass(), "parent", term2894);
        setField(term2893, term2893.getClass(), "namespaceMap", term2901);
        setField(term2893, term2893.getClass(), "reverseMap", term2906);
        setField(term2893, term2893.getClass(), "pointer", null);
        setBooleanField(term2893, term2893.getClass(), "sealed", false);
        setField(term2892, term2892.getClass(), "parent", term2893);
        setField(term2892, term2892.getClass(), "namespaceMap", term2912);
        setField(term2892, term2892.getClass(), "reverseMap", term2917);
        setField(term2892, term2892.getClass(), "pointer", null);
        setBooleanField(term2892, term2892.getClass(), "sealed", false);
        setField(term2837, term2837.getClass(), "namespaceResolver", term2892);
        setField(term2837, term2837.getClass(), "parent", null);
        setField(term2837, term2837.getClass(), "locale", null);
        HashMap term11005 = new HashMap();
        HashMap term11006 = new HashMap();
        HashMap term11007 = new HashMap();
        HashMap term11008 = new HashMap();
        HashMap term11009 = new HashMap();
        HashMap term11010 = new HashMap();
        HashMap term11015 = new HashMap();
        HashMap term11016 = new HashMap();
        HashMap term11017 = new HashMap();
        HashMap term11018 = new HashMap();
        HashMap term11019 = new HashMap();
        term10997 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term10998 = newInstance(Class.forName("java.lang.Object"));
        Object term11001 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term11002 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term11003 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term11004 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term11011 = newInstance(Class.forName("java.lang.Object"));
        Object term11012 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term11013 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term11014 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term10997, term10997.getClass(), "node", term10998);
        setField(term10997, term10997.getClass(), "id", "GzFkzHGYFt");
        setField(term11004, term11004.getClass(), "parent", null);
        setField(term11004, term11004.getClass(), "namespaceMap", null);
        setField(term11004, term11004.getClass(), "reverseMap", null);
        setField(term11004, term11004.getClass(), "pointer", null);
        setBooleanField(term11004, term11004.getClass(), "sealed", false);
        setField(term11003, term11003.getClass(), "parent", term11004);
        setField(term11003, term11003.getClass(), "namespaceMap", term11005);
        setField(term11003, term11003.getClass(), "reverseMap", term11006);
        setField(term11003, term11003.getClass(), "pointer", null);
        setBooleanField(term11003, term11003.getClass(), "sealed", false);
        setField(term11002, term11002.getClass(), "parent", term11003);
        setField(term11002, term11002.getClass(), "namespaceMap", term11007);
        setField(term11002, term11002.getClass(), "reverseMap", term11008);
        setField(term11002, term11002.getClass(), "pointer", null);
        setBooleanField(term11002, term11002.getClass(), "sealed", false);
        setField(term11001, term11001.getClass(), "parent", term11002);
        setField(term11001, term11001.getClass(), "namespaceMap", term11009);
        setField(term11001, term11001.getClass(), "reverseMap", term11010);
        setField(term11001, term11001.getClass(), "pointer", null);
        setBooleanField(term11001, term11001.getClass(), "sealed", false);
        setField(term10997, term10997.getClass(), "localNamespaceResolver", term11001);
        setIntField(term10997, term10997.getClass(), "index", 590364439);
        setBooleanField(term10997, term10997.getClass(), "attribute", false);
        setField(term10997, term10997.getClass(), "rootNode", term11011);
        setField(term11014, term11014.getClass(), "parent", null);
        setField(term11014, term11014.getClass(), "namespaceMap", term11015);
        setField(term11014, term11014.getClass(), "reverseMap", null);
        setField(term11014, term11014.getClass(), "pointer", null);
        setBooleanField(term11014, term11014.getClass(), "sealed", false);
        setField(term11013, term11013.getClass(), "parent", term11014);
        setField(term11013, term11013.getClass(), "namespaceMap", term11016);
        setField(term11013, term11013.getClass(), "reverseMap", term11017);
        setField(term11013, term11013.getClass(), "pointer", null);
        setBooleanField(term11013, term11013.getClass(), "sealed", false);
        setField(term11012, term11012.getClass(), "parent", term11013);
        setField(term11012, term11012.getClass(), "namespaceMap", term11018);
        setField(term11012, term11012.getClass(), "reverseMap", term11019);
        setField(term11012, term11012.getClass(), "pointer", null);
        setBooleanField(term11012, term11012.getClass(), "sealed", false);
        setField(term10997, term10997.getClass(), "namespaceResolver", term11012);
        setField(term10997, term10997.getClass(), "parent", null);
        setField(term10997, term10997.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asPath", argTypes, term2837, args);
        assertTrue(recursiveEquals(term2837, term10997));
        assertTrue(recursiveEquals(retValue, "id(\'GzFkzHGYFt\')"));
    }

};


