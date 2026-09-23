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

public class JDOMNodePointer_getLength_144090184057 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1136;
     Object term6123;

    public JDOMNodePointer_getLength_144090184057() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1155 = new HashMap();
        HashMap term1160 = new HashMap();
        HashMap term1166 = new HashMap();
        HashMap term1171 = new HashMap();
        HashMap term1177 = new HashMap();
        HashMap term1182 = new HashMap();
        HashMap term1194 = new HashMap();
        HashMap term1200 = new HashMap();
        HashMap term1205 = new HashMap();
        HashMap term1211 = new HashMap();
        HashMap term1216 = new HashMap();
        term1136 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1137 = newInstance(Class.forName("java.lang.Object"));
        Object term1150 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1151 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1152 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1153 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1190 = newInstance(Class.forName("java.lang.Object"));
        Object term1191 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1192 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1193 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1136, term1136.getClass(), "node", term1137);
        setField(term1136, term1136.getClass(), "id", "ZiaGIbnzTs");
        setField(term1153, term1153.getClass(), "parent", null);
        setField(term1153, term1153.getClass(), "namespaceMap", null);
        setField(term1153, term1153.getClass(), "reverseMap", null);
        setField(term1153, term1153.getClass(), "pointer", null);
        setBooleanField(term1153, term1153.getClass(), "sealed", false);
        setField(term1152, term1152.getClass(), "parent", term1153);
        setField(term1152, term1152.getClass(), "namespaceMap", term1155);
        setField(term1152, term1152.getClass(), "reverseMap", term1160);
        setField(term1152, term1152.getClass(), "pointer", null);
        setBooleanField(term1152, term1152.getClass(), "sealed", false);
        setField(term1151, term1151.getClass(), "parent", term1152);
        setField(term1151, term1151.getClass(), "namespaceMap", term1166);
        setField(term1151, term1151.getClass(), "reverseMap", term1171);
        setField(term1151, term1151.getClass(), "pointer", null);
        setBooleanField(term1151, term1151.getClass(), "sealed", false);
        setField(term1150, term1150.getClass(), "parent", term1151);
        setField(term1150, term1150.getClass(), "namespaceMap", term1177);
        setField(term1150, term1150.getClass(), "reverseMap", term1182);
        setField(term1150, term1150.getClass(), "pointer", null);
        setBooleanField(term1150, term1150.getClass(), "sealed", false);
        setField(term1136, term1136.getClass(), "localNamespaceResolver", term1150);
        setIntField(term1136, term1136.getClass(), "index", 1725571209);
        setBooleanField(term1136, term1136.getClass(), "attribute", true);
        setField(term1136, term1136.getClass(), "rootNode", term1190);
        setField(term1193, term1193.getClass(), "parent", null);
        setField(term1193, term1193.getClass(), "namespaceMap", term1194);
        setField(term1193, term1193.getClass(), "reverseMap", null);
        setField(term1193, term1193.getClass(), "pointer", null);
        setBooleanField(term1193, term1193.getClass(), "sealed", false);
        setField(term1192, term1192.getClass(), "parent", term1193);
        setField(term1192, term1192.getClass(), "namespaceMap", term1200);
        setField(term1192, term1192.getClass(), "reverseMap", term1205);
        setField(term1192, term1192.getClass(), "pointer", null);
        setBooleanField(term1192, term1192.getClass(), "sealed", false);
        setField(term1191, term1191.getClass(), "parent", term1192);
        setField(term1191, term1191.getClass(), "namespaceMap", term1211);
        setField(term1191, term1191.getClass(), "reverseMap", term1216);
        setField(term1191, term1191.getClass(), "pointer", null);
        setBooleanField(term1191, term1191.getClass(), "sealed", false);
        setField(term1136, term1136.getClass(), "namespaceResolver", term1191);
        setField(term1136, term1136.getClass(), "parent", null);
        setField(term1136, term1136.getClass(), "locale", null);
        HashMap term6131 = new HashMap();
        HashMap term6132 = new HashMap();
        HashMap term6133 = new HashMap();
        HashMap term6134 = new HashMap();
        HashMap term6135 = new HashMap();
        HashMap term6136 = new HashMap();
        HashMap term6141 = new HashMap();
        HashMap term6142 = new HashMap();
        HashMap term6143 = new HashMap();
        HashMap term6144 = new HashMap();
        HashMap term6145 = new HashMap();
        term6123 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term6124 = newInstance(Class.forName("java.lang.Object"));
        Object term6127 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6128 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6129 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6130 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6137 = newInstance(Class.forName("java.lang.Object"));
        Object term6138 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6139 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6140 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term6123, term6123.getClass(), "node", term6124);
        setField(term6123, term6123.getClass(), "id", "ZiaGIbnzTs");
        setField(term6130, term6130.getClass(), "parent", null);
        setField(term6130, term6130.getClass(), "namespaceMap", null);
        setField(term6130, term6130.getClass(), "reverseMap", null);
        setField(term6130, term6130.getClass(), "pointer", null);
        setBooleanField(term6130, term6130.getClass(), "sealed", false);
        setField(term6129, term6129.getClass(), "parent", term6130);
        setField(term6129, term6129.getClass(), "namespaceMap", term6131);
        setField(term6129, term6129.getClass(), "reverseMap", term6132);
        setField(term6129, term6129.getClass(), "pointer", null);
        setBooleanField(term6129, term6129.getClass(), "sealed", false);
        setField(term6128, term6128.getClass(), "parent", term6129);
        setField(term6128, term6128.getClass(), "namespaceMap", term6133);
        setField(term6128, term6128.getClass(), "reverseMap", term6134);
        setField(term6128, term6128.getClass(), "pointer", null);
        setBooleanField(term6128, term6128.getClass(), "sealed", false);
        setField(term6127, term6127.getClass(), "parent", term6128);
        setField(term6127, term6127.getClass(), "namespaceMap", term6135);
        setField(term6127, term6127.getClass(), "reverseMap", term6136);
        setField(term6127, term6127.getClass(), "pointer", null);
        setBooleanField(term6127, term6127.getClass(), "sealed", false);
        setField(term6123, term6123.getClass(), "localNamespaceResolver", term6127);
        setIntField(term6123, term6123.getClass(), "index", 1725571209);
        setBooleanField(term6123, term6123.getClass(), "attribute", true);
        setField(term6123, term6123.getClass(), "rootNode", term6137);
        setField(term6140, term6140.getClass(), "parent", null);
        setField(term6140, term6140.getClass(), "namespaceMap", term6141);
        setField(term6140, term6140.getClass(), "reverseMap", null);
        setField(term6140, term6140.getClass(), "pointer", null);
        setBooleanField(term6140, term6140.getClass(), "sealed", false);
        setField(term6139, term6139.getClass(), "parent", term6140);
        setField(term6139, term6139.getClass(), "namespaceMap", term6142);
        setField(term6139, term6139.getClass(), "reverseMap", term6143);
        setField(term6139, term6139.getClass(), "pointer", null);
        setBooleanField(term6139, term6139.getClass(), "sealed", false);
        setField(term6138, term6138.getClass(), "parent", term6139);
        setField(term6138, term6138.getClass(), "namespaceMap", term6144);
        setField(term6138, term6138.getClass(), "reverseMap", term6145);
        setField(term6138, term6138.getClass(), "pointer", null);
        setBooleanField(term6138, term6138.getClass(), "sealed", false);
        setField(term6123, term6123.getClass(), "namespaceResolver", term6138);
        setField(term6123, term6123.getClass(), "parent", null);
        setField(term6123, term6123.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLength", argTypes, term1136, args);
        assertTrue(recursiveEquals(term1136, term6123));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


