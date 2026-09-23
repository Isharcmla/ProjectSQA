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

public class JDOMNodePointer_getLength_144090184055 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1186;
     Object term6107;

    public JDOMNodePointer_getLength_144090184055() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1205 = new HashMap();
        HashMap term1210 = new HashMap();
        HashMap term1216 = new HashMap();
        HashMap term1221 = new HashMap();
        HashMap term1227 = new HashMap();
        HashMap term1232 = new HashMap();
        HashMap term1243 = new HashMap();
        HashMap term1248 = new HashMap();
        HashMap term1254 = new HashMap();
        HashMap term1259 = new HashMap();
        HashMap term1265 = new HashMap();
        HashMap term1270 = new HashMap();
        term1186 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1187 = newInstance(Class.forName("java.lang.Object"));
        Object term1200 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1201 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1202 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1203 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1240 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1241 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1242 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1276 = newInstance(Class.forName("java.lang.Object"));
        setField(term1186, term1186.getClass(), "node", term1187);
        setField(term1186, term1186.getClass(), "id", "ZiaGIbnzTs");
        setField(term1203, term1203.getClass(), "parent", null);
        setField(term1203, term1203.getClass(), "namespaceMap", null);
        setField(term1203, term1203.getClass(), "reverseMap", null);
        setField(term1203, term1203.getClass(), "pointer", null);
        setBooleanField(term1203, term1203.getClass(), "sealed", false);
        setField(term1202, term1202.getClass(), "parent", term1203);
        setField(term1202, term1202.getClass(), "namespaceMap", term1205);
        setField(term1202, term1202.getClass(), "reverseMap", term1210);
        setField(term1202, term1202.getClass(), "pointer", null);
        setBooleanField(term1202, term1202.getClass(), "sealed", false);
        setField(term1201, term1201.getClass(), "parent", term1202);
        setField(term1201, term1201.getClass(), "namespaceMap", term1216);
        setField(term1201, term1201.getClass(), "reverseMap", term1221);
        setField(term1201, term1201.getClass(), "pointer", null);
        setBooleanField(term1201, term1201.getClass(), "sealed", false);
        setField(term1200, term1200.getClass(), "parent", term1201);
        setField(term1200, term1200.getClass(), "namespaceMap", term1227);
        setField(term1200, term1200.getClass(), "reverseMap", term1232);
        setField(term1200, term1200.getClass(), "pointer", null);
        setBooleanField(term1200, term1200.getClass(), "sealed", false);
        setField(term1186, term1186.getClass(), "localNamespaceResolver", term1200);
        setIntField(term1186, term1186.getClass(), "index", 1725571209);
        setBooleanField(term1186, term1186.getClass(), "attribute", true);
        setField(term1242, term1242.getClass(), "parent", null);
        setField(term1242, term1242.getClass(), "namespaceMap", term1243);
        setField(term1242, term1242.getClass(), "reverseMap", term1248);
        setField(term1242, term1242.getClass(), "pointer", null);
        setBooleanField(term1242, term1242.getClass(), "sealed", false);
        setField(term1241, term1241.getClass(), "parent", term1242);
        setField(term1241, term1241.getClass(), "namespaceMap", term1254);
        setField(term1241, term1241.getClass(), "reverseMap", term1259);
        setField(term1241, term1241.getClass(), "pointer", null);
        setBooleanField(term1241, term1241.getClass(), "sealed", false);
        setField(term1240, term1240.getClass(), "parent", term1241);
        setField(term1240, term1240.getClass(), "namespaceMap", term1265);
        setField(term1240, term1240.getClass(), "reverseMap", term1270);
        setField(term1240, term1240.getClass(), "pointer", null);
        setBooleanField(term1240, term1240.getClass(), "sealed", false);
        setField(term1186, term1186.getClass(), "namespaceResolver", term1240);
        setField(term1186, term1186.getClass(), "rootNode", term1276);
        setField(term1186, term1186.getClass(), "parent", null);
        setField(term1186, term1186.getClass(), "locale", null);
        HashMap term6115 = new HashMap();
        HashMap term6116 = new HashMap();
        HashMap term6117 = new HashMap();
        HashMap term6118 = new HashMap();
        HashMap term6119 = new HashMap();
        HashMap term6120 = new HashMap();
        HashMap term6124 = new HashMap();
        HashMap term6125 = new HashMap();
        HashMap term6126 = new HashMap();
        HashMap term6127 = new HashMap();
        HashMap term6128 = new HashMap();
        HashMap term6129 = new HashMap();
        term6107 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term6108 = newInstance(Class.forName("java.lang.Object"));
        Object term6111 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6112 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6113 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6114 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6121 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6122 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6123 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6130 = newInstance(Class.forName("java.lang.Object"));
        setField(term6107, term6107.getClass(), "node", term6108);
        setField(term6107, term6107.getClass(), "id", "ZiaGIbnzTs");
        setField(term6114, term6114.getClass(), "parent", null);
        setField(term6114, term6114.getClass(), "namespaceMap", null);
        setField(term6114, term6114.getClass(), "reverseMap", null);
        setField(term6114, term6114.getClass(), "pointer", null);
        setBooleanField(term6114, term6114.getClass(), "sealed", false);
        setField(term6113, term6113.getClass(), "parent", term6114);
        setField(term6113, term6113.getClass(), "namespaceMap", term6115);
        setField(term6113, term6113.getClass(), "reverseMap", term6116);
        setField(term6113, term6113.getClass(), "pointer", null);
        setBooleanField(term6113, term6113.getClass(), "sealed", false);
        setField(term6112, term6112.getClass(), "parent", term6113);
        setField(term6112, term6112.getClass(), "namespaceMap", term6117);
        setField(term6112, term6112.getClass(), "reverseMap", term6118);
        setField(term6112, term6112.getClass(), "pointer", null);
        setBooleanField(term6112, term6112.getClass(), "sealed", false);
        setField(term6111, term6111.getClass(), "parent", term6112);
        setField(term6111, term6111.getClass(), "namespaceMap", term6119);
        setField(term6111, term6111.getClass(), "reverseMap", term6120);
        setField(term6111, term6111.getClass(), "pointer", null);
        setBooleanField(term6111, term6111.getClass(), "sealed", false);
        setField(term6107, term6107.getClass(), "localNamespaceResolver", term6111);
        setIntField(term6107, term6107.getClass(), "index", 1725571209);
        setBooleanField(term6107, term6107.getClass(), "attribute", true);
        setField(term6123, term6123.getClass(), "parent", null);
        setField(term6123, term6123.getClass(), "namespaceMap", term6124);
        setField(term6123, term6123.getClass(), "reverseMap", term6125);
        setField(term6123, term6123.getClass(), "pointer", null);
        setBooleanField(term6123, term6123.getClass(), "sealed", false);
        setField(term6122, term6122.getClass(), "parent", term6123);
        setField(term6122, term6122.getClass(), "namespaceMap", term6126);
        setField(term6122, term6122.getClass(), "reverseMap", term6127);
        setField(term6122, term6122.getClass(), "pointer", null);
        setBooleanField(term6122, term6122.getClass(), "sealed", false);
        setField(term6121, term6121.getClass(), "parent", term6122);
        setField(term6121, term6121.getClass(), "namespaceMap", term6128);
        setField(term6121, term6121.getClass(), "reverseMap", term6129);
        setField(term6121, term6121.getClass(), "pointer", null);
        setBooleanField(term6121, term6121.getClass(), "sealed", false);
        setField(term6107, term6107.getClass(), "namespaceResolver", term6121);
        setField(term6107, term6107.getClass(), "rootNode", term6130);
        setField(term6107, term6107.getClass(), "parent", null);
        setField(term6107, term6107.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLength", argTypes, term1186, args);
        assertTrue(recursiveEquals(term1186, term6107));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


