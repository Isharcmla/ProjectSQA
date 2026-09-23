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

public class DOMNodePointer_getBaseValue_59766853560 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1196;
     Object term7142;

    public DOMNodePointer_getBaseValue_59766853560() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1197 = new HashMap();
        HashMap term1231 = new HashMap();
        HashMap term1236 = new HashMap();
        HashMap term1242 = new HashMap();
        HashMap term1247 = new HashMap();
        HashMap term1253 = new HashMap();
        HashMap term1258 = new HashMap();
        HashMap term1268 = new HashMap();
        term1196 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term1226 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1227 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1228 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1229 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1266 = newInstance(Class.forName("java.lang.Object"));
        Object term1267 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1196, term1196.getClass(), "node", null);
        setField(term1196, term1196.getClass(), "namespaces", term1197);
        setField(term1196, term1196.getClass(), "defaultNamespace", "IoAlmYsBwc");
        setField(term1196, term1196.getClass(), "id", "TEParAifyi");
        setField(term1229, term1229.getClass(), "parent", null);
        setField(term1229, term1229.getClass(), "namespaceMap", null);
        setField(term1229, term1229.getClass(), "reverseMap", null);
        setField(term1229, term1229.getClass(), "pointer", null);
        setBooleanField(term1229, term1229.getClass(), "sealed", false);
        setField(term1228, term1228.getClass(), "parent", term1229);
        setField(term1228, term1228.getClass(), "namespaceMap", term1231);
        setField(term1228, term1228.getClass(), "reverseMap", term1236);
        setField(term1228, term1228.getClass(), "pointer", null);
        setBooleanField(term1228, term1228.getClass(), "sealed", false);
        setField(term1227, term1227.getClass(), "parent", term1228);
        setField(term1227, term1227.getClass(), "namespaceMap", term1242);
        setField(term1227, term1227.getClass(), "reverseMap", term1247);
        setField(term1227, term1227.getClass(), "pointer", null);
        setBooleanField(term1227, term1227.getClass(), "sealed", false);
        setField(term1226, term1226.getClass(), "parent", term1227);
        setField(term1226, term1226.getClass(), "namespaceMap", term1253);
        setField(term1226, term1226.getClass(), "reverseMap", term1258);
        setField(term1226, term1226.getClass(), "pointer", null);
        setBooleanField(term1226, term1226.getClass(), "sealed", false);
        setField(term1196, term1196.getClass(), "localNamespaceResolver", term1226);
        setIntField(term1196, term1196.getClass(), "index", 1725571209);
        setBooleanField(term1196, term1196.getClass(), "attribute", true);
        setField(term1196, term1196.getClass(), "rootNode", term1266);
        setField(term1267, term1267.getClass(), "parent", null);
        setField(term1267, term1267.getClass(), "namespaceMap", term1268);
        setField(term1267, term1267.getClass(), "reverseMap", null);
        setField(term1267, term1267.getClass(), "pointer", null);
        setBooleanField(term1267, term1267.getClass(), "sealed", false);
        setField(term1196, term1196.getClass(), "namespaceResolver", term1267);
        setField(term1196, term1196.getClass(), "parent", null);
        setField(term1196, term1196.getClass(), "locale", null);
        HashMap term7143 = new HashMap();
        HashMap term7152 = new HashMap();
        HashMap term7153 = new HashMap();
        HashMap term7154 = new HashMap();
        HashMap term7155 = new HashMap();
        HashMap term7156 = new HashMap();
        HashMap term7157 = new HashMap();
        HashMap term7160 = new HashMap();
        term7142 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term7148 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7149 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7150 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7151 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7158 = newInstance(Class.forName("java.lang.Object"));
        Object term7159 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term7142, term7142.getClass(), "node", null);
        setField(term7142, term7142.getClass(), "namespaces", term7143);
        setField(term7142, term7142.getClass(), "defaultNamespace", "IoAlmYsBwc");
        setField(term7142, term7142.getClass(), "id", "TEParAifyi");
        setField(term7151, term7151.getClass(), "parent", null);
        setField(term7151, term7151.getClass(), "namespaceMap", null);
        setField(term7151, term7151.getClass(), "reverseMap", null);
        setField(term7151, term7151.getClass(), "pointer", null);
        setBooleanField(term7151, term7151.getClass(), "sealed", false);
        setField(term7150, term7150.getClass(), "parent", term7151);
        setField(term7150, term7150.getClass(), "namespaceMap", term7152);
        setField(term7150, term7150.getClass(), "reverseMap", term7153);
        setField(term7150, term7150.getClass(), "pointer", null);
        setBooleanField(term7150, term7150.getClass(), "sealed", false);
        setField(term7149, term7149.getClass(), "parent", term7150);
        setField(term7149, term7149.getClass(), "namespaceMap", term7154);
        setField(term7149, term7149.getClass(), "reverseMap", term7155);
        setField(term7149, term7149.getClass(), "pointer", null);
        setBooleanField(term7149, term7149.getClass(), "sealed", false);
        setField(term7148, term7148.getClass(), "parent", term7149);
        setField(term7148, term7148.getClass(), "namespaceMap", term7156);
        setField(term7148, term7148.getClass(), "reverseMap", term7157);
        setField(term7148, term7148.getClass(), "pointer", null);
        setBooleanField(term7148, term7148.getClass(), "sealed", false);
        setField(term7142, term7142.getClass(), "localNamespaceResolver", term7148);
        setIntField(term7142, term7142.getClass(), "index", 1725571209);
        setBooleanField(term7142, term7142.getClass(), "attribute", true);
        setField(term7142, term7142.getClass(), "rootNode", term7158);
        setField(term7159, term7159.getClass(), "parent", null);
        setField(term7159, term7159.getClass(), "namespaceMap", term7160);
        setField(term7159, term7159.getClass(), "reverseMap", null);
        setField(term7159, term7159.getClass(), "pointer", null);
        setBooleanField(term7159, term7159.getClass(), "sealed", false);
        setField(term7142, term7142.getClass(), "namespaceResolver", term7159);
        setField(term7142, term7142.getClass(), "parent", null);
        setField(term7142, term7142.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getBaseValue", argTypes, term1196, args);
        assertTrue(recursiveEquals(term1196, term7142));
        assertTrue(recursiveEquals(retValue, null));
    }

};


