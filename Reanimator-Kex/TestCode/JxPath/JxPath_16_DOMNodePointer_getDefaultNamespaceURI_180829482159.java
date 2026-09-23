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

public class DOMNodePointer_getDefaultNamespaceURI_180829482159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1098;
     Object term6995;

    public DOMNodePointer_getDefaultNamespaceURI_180829482159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1099 = new HashMap();
        HashMap term1133 = new HashMap();
        HashMap term1138 = new HashMap();
        HashMap term1144 = new HashMap();
        HashMap term1149 = new HashMap();
        HashMap term1155 = new HashMap();
        HashMap term1160 = new HashMap();
        HashMap term1170 = new HashMap();
        term1098 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term1128 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1129 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1130 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1131 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1168 = newInstance(Class.forName("java.lang.Object"));
        Object term1169 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1098, term1098.getClass(), "node", null);
        setField(term1098, term1098.getClass(), "namespaces", term1099);
        setField(term1098, term1098.getClass(), "defaultNamespace", "flxyYxBRtu");
        setField(term1098, term1098.getClass(), "id", "OclPbYPkcH");
        setField(term1131, term1131.getClass(), "parent", null);
        setField(term1131, term1131.getClass(), "namespaceMap", null);
        setField(term1131, term1131.getClass(), "reverseMap", null);
        setField(term1131, term1131.getClass(), "pointer", null);
        setBooleanField(term1131, term1131.getClass(), "sealed", false);
        setField(term1130, term1130.getClass(), "parent", term1131);
        setField(term1130, term1130.getClass(), "namespaceMap", term1133);
        setField(term1130, term1130.getClass(), "reverseMap", term1138);
        setField(term1130, term1130.getClass(), "pointer", null);
        setBooleanField(term1130, term1130.getClass(), "sealed", false);
        setField(term1129, term1129.getClass(), "parent", term1130);
        setField(term1129, term1129.getClass(), "namespaceMap", term1144);
        setField(term1129, term1129.getClass(), "reverseMap", term1149);
        setField(term1129, term1129.getClass(), "pointer", null);
        setBooleanField(term1129, term1129.getClass(), "sealed", false);
        setField(term1128, term1128.getClass(), "parent", term1129);
        setField(term1128, term1128.getClass(), "namespaceMap", term1155);
        setField(term1128, term1128.getClass(), "reverseMap", term1160);
        setField(term1128, term1128.getClass(), "pointer", null);
        setBooleanField(term1128, term1128.getClass(), "sealed", false);
        setField(term1098, term1098.getClass(), "localNamespaceResolver", term1128);
        setIntField(term1098, term1098.getClass(), "index", -1339778481);
        setBooleanField(term1098, term1098.getClass(), "attribute", false);
        setField(term1098, term1098.getClass(), "rootNode", term1168);
        setField(term1169, term1169.getClass(), "parent", null);
        setField(term1169, term1169.getClass(), "namespaceMap", term1170);
        setField(term1169, term1169.getClass(), "reverseMap", null);
        setField(term1169, term1169.getClass(), "pointer", null);
        setBooleanField(term1169, term1169.getClass(), "sealed", false);
        setField(term1098, term1098.getClass(), "namespaceResolver", term1169);
        setField(term1098, term1098.getClass(), "parent", null);
        setField(term1098, term1098.getClass(), "locale", null);
        HashMap term6996 = new HashMap();
        HashMap term7005 = new HashMap();
        HashMap term7006 = new HashMap();
        HashMap term7007 = new HashMap();
        HashMap term7008 = new HashMap();
        HashMap term7009 = new HashMap();
        HashMap term7010 = new HashMap();
        HashMap term7013 = new HashMap();
        term6995 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term7001 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7002 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7003 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7004 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7011 = newInstance(Class.forName("java.lang.Object"));
        Object term7012 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term6995, term6995.getClass(), "node", null);
        setField(term6995, term6995.getClass(), "namespaces", term6996);
        setField(term6995, term6995.getClass(), "defaultNamespace", "flxyYxBRtu");
        setField(term6995, term6995.getClass(), "id", "OclPbYPkcH");
        setField(term7004, term7004.getClass(), "parent", null);
        setField(term7004, term7004.getClass(), "namespaceMap", null);
        setField(term7004, term7004.getClass(), "reverseMap", null);
        setField(term7004, term7004.getClass(), "pointer", null);
        setBooleanField(term7004, term7004.getClass(), "sealed", false);
        setField(term7003, term7003.getClass(), "parent", term7004);
        setField(term7003, term7003.getClass(), "namespaceMap", term7005);
        setField(term7003, term7003.getClass(), "reverseMap", term7006);
        setField(term7003, term7003.getClass(), "pointer", null);
        setBooleanField(term7003, term7003.getClass(), "sealed", false);
        setField(term7002, term7002.getClass(), "parent", term7003);
        setField(term7002, term7002.getClass(), "namespaceMap", term7007);
        setField(term7002, term7002.getClass(), "reverseMap", term7008);
        setField(term7002, term7002.getClass(), "pointer", null);
        setBooleanField(term7002, term7002.getClass(), "sealed", false);
        setField(term7001, term7001.getClass(), "parent", term7002);
        setField(term7001, term7001.getClass(), "namespaceMap", term7009);
        setField(term7001, term7001.getClass(), "reverseMap", term7010);
        setField(term7001, term7001.getClass(), "pointer", null);
        setBooleanField(term7001, term7001.getClass(), "sealed", false);
        setField(term6995, term6995.getClass(), "localNamespaceResolver", term7001);
        setIntField(term6995, term6995.getClass(), "index", -1339778481);
        setBooleanField(term6995, term6995.getClass(), "attribute", false);
        setField(term6995, term6995.getClass(), "rootNode", term7011);
        setField(term7012, term7012.getClass(), "parent", null);
        setField(term7012, term7012.getClass(), "namespaceMap", term7013);
        setField(term7012, term7012.getClass(), "reverseMap", null);
        setField(term7012, term7012.getClass(), "pointer", null);
        setBooleanField(term7012, term7012.getClass(), "sealed", false);
        setField(term6995, term6995.getClass(), "namespaceResolver", term7012);
        setField(term6995, term6995.getClass(), "parent", null);
        setField(term6995, term6995.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDefaultNamespaceURI", argTypes, term1098, args);
        assertTrue(recursiveEquals(term1098, term6995));
        assertTrue(recursiveEquals(retValue, "flxyYxBRtu"));
    }

};


