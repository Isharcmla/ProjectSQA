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

public class JDOMNodePointer_asPath_32729934475 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2957;
     Object term11053;

    public JDOMNodePointer_asPath_32729934475() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2976 = new HashMap();
        HashMap term2981 = new HashMap();
        HashMap term2987 = new HashMap();
        HashMap term2992 = new HashMap();
        HashMap term2998 = new HashMap();
        HashMap term3003 = new HashMap();
        HashMap term3014 = new HashMap();
        HashMap term3019 = new HashMap();
        HashMap term3025 = new HashMap();
        HashMap term3030 = new HashMap();
        HashMap term3036 = new HashMap();
        HashMap term3041 = new HashMap();
        term2957 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term2958 = newInstance(Class.forName("java.lang.Object"));
        Object term2971 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2972 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2973 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2974 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3011 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3012 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3013 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3047 = newInstance(Class.forName("java.lang.Object"));
        setField(term2957, term2957.getClass(), "node", term2958);
        setField(term2957, term2957.getClass(), "id", "GzFkzHGYFt");
        setField(term2974, term2974.getClass(), "parent", null);
        setField(term2974, term2974.getClass(), "namespaceMap", null);
        setField(term2974, term2974.getClass(), "reverseMap", null);
        setField(term2974, term2974.getClass(), "pointer", null);
        setBooleanField(term2974, term2974.getClass(), "sealed", false);
        setField(term2973, term2973.getClass(), "parent", term2974);
        setField(term2973, term2973.getClass(), "namespaceMap", term2976);
        setField(term2973, term2973.getClass(), "reverseMap", term2981);
        setField(term2973, term2973.getClass(), "pointer", null);
        setBooleanField(term2973, term2973.getClass(), "sealed", false);
        setField(term2972, term2972.getClass(), "parent", term2973);
        setField(term2972, term2972.getClass(), "namespaceMap", term2987);
        setField(term2972, term2972.getClass(), "reverseMap", term2992);
        setField(term2972, term2972.getClass(), "pointer", null);
        setBooleanField(term2972, term2972.getClass(), "sealed", false);
        setField(term2971, term2971.getClass(), "parent", term2972);
        setField(term2971, term2971.getClass(), "namespaceMap", term2998);
        setField(term2971, term2971.getClass(), "reverseMap", term3003);
        setField(term2971, term2971.getClass(), "pointer", null);
        setBooleanField(term2971, term2971.getClass(), "sealed", false);
        setField(term2957, term2957.getClass(), "localNamespaceResolver", term2971);
        setIntField(term2957, term2957.getClass(), "index", 590364439);
        setBooleanField(term2957, term2957.getClass(), "attribute", false);
        setField(term3013, term3013.getClass(), "parent", null);
        setField(term3013, term3013.getClass(), "namespaceMap", term3014);
        setField(term3013, term3013.getClass(), "reverseMap", term3019);
        setField(term3013, term3013.getClass(), "pointer", null);
        setBooleanField(term3013, term3013.getClass(), "sealed", false);
        setField(term3012, term3012.getClass(), "parent", term3013);
        setField(term3012, term3012.getClass(), "namespaceMap", term3025);
        setField(term3012, term3012.getClass(), "reverseMap", term3030);
        setField(term3012, term3012.getClass(), "pointer", null);
        setBooleanField(term3012, term3012.getClass(), "sealed", false);
        setField(term3011, term3011.getClass(), "parent", term3012);
        setField(term3011, term3011.getClass(), "namespaceMap", term3036);
        setField(term3011, term3011.getClass(), "reverseMap", term3041);
        setField(term3011, term3011.getClass(), "pointer", null);
        setBooleanField(term3011, term3011.getClass(), "sealed", false);
        setField(term2957, term2957.getClass(), "namespaceResolver", term3011);
        setField(term2957, term2957.getClass(), "rootNode", term3047);
        setField(term2957, term2957.getClass(), "parent", null);
        setField(term2957, term2957.getClass(), "locale", null);
        HashMap term11061 = new HashMap();
        HashMap term11062 = new HashMap();
        HashMap term11063 = new HashMap();
        HashMap term11064 = new HashMap();
        HashMap term11065 = new HashMap();
        HashMap term11066 = new HashMap();
        HashMap term11070 = new HashMap();
        HashMap term11071 = new HashMap();
        HashMap term11072 = new HashMap();
        HashMap term11073 = new HashMap();
        HashMap term11074 = new HashMap();
        HashMap term11075 = new HashMap();
        term11053 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term11054 = newInstance(Class.forName("java.lang.Object"));
        Object term11057 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term11058 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term11059 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term11060 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term11067 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term11068 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term11069 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term11076 = newInstance(Class.forName("java.lang.Object"));
        setField(term11053, term11053.getClass(), "node", term11054);
        setField(term11053, term11053.getClass(), "id", "GzFkzHGYFt");
        setField(term11060, term11060.getClass(), "parent", null);
        setField(term11060, term11060.getClass(), "namespaceMap", null);
        setField(term11060, term11060.getClass(), "reverseMap", null);
        setField(term11060, term11060.getClass(), "pointer", null);
        setBooleanField(term11060, term11060.getClass(), "sealed", false);
        setField(term11059, term11059.getClass(), "parent", term11060);
        setField(term11059, term11059.getClass(), "namespaceMap", term11061);
        setField(term11059, term11059.getClass(), "reverseMap", term11062);
        setField(term11059, term11059.getClass(), "pointer", null);
        setBooleanField(term11059, term11059.getClass(), "sealed", false);
        setField(term11058, term11058.getClass(), "parent", term11059);
        setField(term11058, term11058.getClass(), "namespaceMap", term11063);
        setField(term11058, term11058.getClass(), "reverseMap", term11064);
        setField(term11058, term11058.getClass(), "pointer", null);
        setBooleanField(term11058, term11058.getClass(), "sealed", false);
        setField(term11057, term11057.getClass(), "parent", term11058);
        setField(term11057, term11057.getClass(), "namespaceMap", term11065);
        setField(term11057, term11057.getClass(), "reverseMap", term11066);
        setField(term11057, term11057.getClass(), "pointer", null);
        setBooleanField(term11057, term11057.getClass(), "sealed", false);
        setField(term11053, term11053.getClass(), "localNamespaceResolver", term11057);
        setIntField(term11053, term11053.getClass(), "index", 590364439);
        setBooleanField(term11053, term11053.getClass(), "attribute", false);
        setField(term11069, term11069.getClass(), "parent", null);
        setField(term11069, term11069.getClass(), "namespaceMap", term11070);
        setField(term11069, term11069.getClass(), "reverseMap", term11071);
        setField(term11069, term11069.getClass(), "pointer", null);
        setBooleanField(term11069, term11069.getClass(), "sealed", false);
        setField(term11068, term11068.getClass(), "parent", term11069);
        setField(term11068, term11068.getClass(), "namespaceMap", term11072);
        setField(term11068, term11068.getClass(), "reverseMap", term11073);
        setField(term11068, term11068.getClass(), "pointer", null);
        setBooleanField(term11068, term11068.getClass(), "sealed", false);
        setField(term11067, term11067.getClass(), "parent", term11068);
        setField(term11067, term11067.getClass(), "namespaceMap", term11074);
        setField(term11067, term11067.getClass(), "reverseMap", term11075);
        setField(term11067, term11067.getClass(), "pointer", null);
        setBooleanField(term11067, term11067.getClass(), "sealed", false);
        setField(term11053, term11053.getClass(), "namespaceResolver", term11067);
        setField(term11053, term11053.getClass(), "rootNode", term11076);
        setField(term11053, term11053.getClass(), "parent", null);
        setField(term11053, term11053.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asPath", argTypes, term2957, args);
        assertTrue(recursiveEquals(term2957, term11053));
        assertTrue(recursiveEquals(retValue, "id(\'GzFkzHGYFt\')"));
    }

};


