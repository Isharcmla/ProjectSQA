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

public class JDOMNodePointer_getRelativePositionByQName_190855723476 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3058;
     Object term11206;

    public JDOMNodePointer_getRelativePositionByQName_190855723476() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3077 = new HashMap();
        HashMap term3082 = new HashMap();
        HashMap term3088 = new HashMap();
        HashMap term3093 = new HashMap();
        HashMap term3099 = new HashMap();
        HashMap term3104 = new HashMap();
        HashMap term3115 = new HashMap();
        HashMap term3120 = new HashMap();
        HashMap term3126 = new HashMap();
        HashMap term3131 = new HashMap();
        HashMap term3137 = new HashMap();
        HashMap term3142 = new HashMap();
        term3058 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term3059 = newInstance(Class.forName("java.lang.Object"));
        Object term3072 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3073 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3074 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3075 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3112 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3113 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3114 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3148 = newInstance(Class.forName("java.lang.Object"));
        setField(term3058, term3058.getClass(), "node", term3059);
        setField(term3058, term3058.getClass(), "id", "tShwQLRGNe");
        setField(term3075, term3075.getClass(), "parent", null);
        setField(term3075, term3075.getClass(), "namespaceMap", null);
        setField(term3075, term3075.getClass(), "reverseMap", null);
        setField(term3075, term3075.getClass(), "pointer", null);
        setBooleanField(term3075, term3075.getClass(), "sealed", false);
        setField(term3074, term3074.getClass(), "parent", term3075);
        setField(term3074, term3074.getClass(), "namespaceMap", term3077);
        setField(term3074, term3074.getClass(), "reverseMap", term3082);
        setField(term3074, term3074.getClass(), "pointer", null);
        setBooleanField(term3074, term3074.getClass(), "sealed", false);
        setField(term3073, term3073.getClass(), "parent", term3074);
        setField(term3073, term3073.getClass(), "namespaceMap", term3088);
        setField(term3073, term3073.getClass(), "reverseMap", term3093);
        setField(term3073, term3073.getClass(), "pointer", null);
        setBooleanField(term3073, term3073.getClass(), "sealed", false);
        setField(term3072, term3072.getClass(), "parent", term3073);
        setField(term3072, term3072.getClass(), "namespaceMap", term3099);
        setField(term3072, term3072.getClass(), "reverseMap", term3104);
        setField(term3072, term3072.getClass(), "pointer", null);
        setBooleanField(term3072, term3072.getClass(), "sealed", false);
        setField(term3058, term3058.getClass(), "localNamespaceResolver", term3072);
        setIntField(term3058, term3058.getClass(), "index", 865208305);
        setBooleanField(term3058, term3058.getClass(), "attribute", false);
        setField(term3114, term3114.getClass(), "parent", null);
        setField(term3114, term3114.getClass(), "namespaceMap", term3115);
        setField(term3114, term3114.getClass(), "reverseMap", term3120);
        setField(term3114, term3114.getClass(), "pointer", null);
        setBooleanField(term3114, term3114.getClass(), "sealed", false);
        setField(term3113, term3113.getClass(), "parent", term3114);
        setField(term3113, term3113.getClass(), "namespaceMap", term3126);
        setField(term3113, term3113.getClass(), "reverseMap", term3131);
        setField(term3113, term3113.getClass(), "pointer", null);
        setBooleanField(term3113, term3113.getClass(), "sealed", false);
        setField(term3112, term3112.getClass(), "parent", term3113);
        setField(term3112, term3112.getClass(), "namespaceMap", term3137);
        setField(term3112, term3112.getClass(), "reverseMap", term3142);
        setField(term3112, term3112.getClass(), "pointer", null);
        setBooleanField(term3112, term3112.getClass(), "sealed", false);
        setField(term3058, term3058.getClass(), "namespaceResolver", term3112);
        setField(term3058, term3058.getClass(), "rootNode", term3148);
        setField(term3058, term3058.getClass(), "parent", null);
        setField(term3058, term3058.getClass(), "locale", null);
        HashMap term11214 = new HashMap();
        HashMap term11215 = new HashMap();
        HashMap term11216 = new HashMap();
        HashMap term11217 = new HashMap();
        HashMap term11218 = new HashMap();
        HashMap term11219 = new HashMap();
        HashMap term11223 = new HashMap();
        HashMap term11224 = new HashMap();
        HashMap term11225 = new HashMap();
        HashMap term11226 = new HashMap();
        HashMap term11227 = new HashMap();
        HashMap term11228 = new HashMap();
        term11206 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term11207 = newInstance(Class.forName("java.lang.Object"));
        Object term11210 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term11211 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term11212 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term11213 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term11220 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term11221 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term11222 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term11229 = newInstance(Class.forName("java.lang.Object"));
        setField(term11206, term11206.getClass(), "node", term11207);
        setField(term11206, term11206.getClass(), "id", "tShwQLRGNe");
        setField(term11213, term11213.getClass(), "parent", null);
        setField(term11213, term11213.getClass(), "namespaceMap", null);
        setField(term11213, term11213.getClass(), "reverseMap", null);
        setField(term11213, term11213.getClass(), "pointer", null);
        setBooleanField(term11213, term11213.getClass(), "sealed", false);
        setField(term11212, term11212.getClass(), "parent", term11213);
        setField(term11212, term11212.getClass(), "namespaceMap", term11214);
        setField(term11212, term11212.getClass(), "reverseMap", term11215);
        setField(term11212, term11212.getClass(), "pointer", null);
        setBooleanField(term11212, term11212.getClass(), "sealed", false);
        setField(term11211, term11211.getClass(), "parent", term11212);
        setField(term11211, term11211.getClass(), "namespaceMap", term11216);
        setField(term11211, term11211.getClass(), "reverseMap", term11217);
        setField(term11211, term11211.getClass(), "pointer", null);
        setBooleanField(term11211, term11211.getClass(), "sealed", false);
        setField(term11210, term11210.getClass(), "parent", term11211);
        setField(term11210, term11210.getClass(), "namespaceMap", term11218);
        setField(term11210, term11210.getClass(), "reverseMap", term11219);
        setField(term11210, term11210.getClass(), "pointer", null);
        setBooleanField(term11210, term11210.getClass(), "sealed", false);
        setField(term11206, term11206.getClass(), "localNamespaceResolver", term11210);
        setIntField(term11206, term11206.getClass(), "index", 865208305);
        setBooleanField(term11206, term11206.getClass(), "attribute", false);
        setField(term11222, term11222.getClass(), "parent", null);
        setField(term11222, term11222.getClass(), "namespaceMap", term11223);
        setField(term11222, term11222.getClass(), "reverseMap", term11224);
        setField(term11222, term11222.getClass(), "pointer", null);
        setBooleanField(term11222, term11222.getClass(), "sealed", false);
        setField(term11221, term11221.getClass(), "parent", term11222);
        setField(term11221, term11221.getClass(), "namespaceMap", term11225);
        setField(term11221, term11221.getClass(), "reverseMap", term11226);
        setField(term11221, term11221.getClass(), "pointer", null);
        setBooleanField(term11221, term11221.getClass(), "sealed", false);
        setField(term11220, term11220.getClass(), "parent", term11221);
        setField(term11220, term11220.getClass(), "namespaceMap", term11227);
        setField(term11220, term11220.getClass(), "reverseMap", term11228);
        setField(term11220, term11220.getClass(), "pointer", null);
        setBooleanField(term11220, term11220.getClass(), "sealed", false);
        setField(term11206, term11206.getClass(), "namespaceResolver", term11220);
        setField(term11206, term11206.getClass(), "rootNode", term11229);
        setField(term11206, term11206.getClass(), "parent", null);
        setField(term11206, term11206.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRelativePositionByQName", argTypes, term3058, args);
        assertTrue(recursiveEquals(term3058, term11206));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


