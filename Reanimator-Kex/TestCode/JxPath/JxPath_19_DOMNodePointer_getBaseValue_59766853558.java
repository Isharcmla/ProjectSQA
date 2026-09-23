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

public class DOMNodePointer_getBaseValue_59766853558 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1246;
     Object term7177;

    public DOMNodePointer_getBaseValue_59766853558() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1247 = new HashMap();
        HashMap term1281 = new HashMap();
        HashMap term1286 = new HashMap();
        HashMap term1292 = new HashMap();
        HashMap term1297 = new HashMap();
        HashMap term1303 = new HashMap();
        HashMap term1308 = new HashMap();
        HashMap term1317 = new HashMap();
        HashMap term1322 = new HashMap();
        term1246 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term1276 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1277 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1278 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1279 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1316 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1328 = newInstance(Class.forName("java.lang.Object"));
        setField(term1246, term1246.getClass(), "node", null);
        setField(term1246, term1246.getClass(), "namespaces", term1247);
        setField(term1246, term1246.getClass(), "defaultNamespace", "IoAlmYsBwc");
        setField(term1246, term1246.getClass(), "id", "TEParAifyi");
        setField(term1279, term1279.getClass(), "parent", null);
        setField(term1279, term1279.getClass(), "namespaceMap", null);
        setField(term1279, term1279.getClass(), "reverseMap", null);
        setField(term1279, term1279.getClass(), "pointer", null);
        setBooleanField(term1279, term1279.getClass(), "sealed", false);
        setField(term1278, term1278.getClass(), "parent", term1279);
        setField(term1278, term1278.getClass(), "namespaceMap", term1281);
        setField(term1278, term1278.getClass(), "reverseMap", term1286);
        setField(term1278, term1278.getClass(), "pointer", null);
        setBooleanField(term1278, term1278.getClass(), "sealed", false);
        setField(term1277, term1277.getClass(), "parent", term1278);
        setField(term1277, term1277.getClass(), "namespaceMap", term1292);
        setField(term1277, term1277.getClass(), "reverseMap", term1297);
        setField(term1277, term1277.getClass(), "pointer", null);
        setBooleanField(term1277, term1277.getClass(), "sealed", false);
        setField(term1276, term1276.getClass(), "parent", term1277);
        setField(term1276, term1276.getClass(), "namespaceMap", term1303);
        setField(term1276, term1276.getClass(), "reverseMap", term1308);
        setField(term1276, term1276.getClass(), "pointer", null);
        setBooleanField(term1276, term1276.getClass(), "sealed", false);
        setField(term1246, term1246.getClass(), "localNamespaceResolver", term1276);
        setIntField(term1246, term1246.getClass(), "index", 1725571209);
        setBooleanField(term1246, term1246.getClass(), "attribute", true);
        setField(term1316, term1316.getClass(), "parent", null);
        setField(term1316, term1316.getClass(), "namespaceMap", term1317);
        setField(term1316, term1316.getClass(), "reverseMap", term1322);
        setField(term1316, term1316.getClass(), "pointer", null);
        setBooleanField(term1316, term1316.getClass(), "sealed", false);
        setField(term1246, term1246.getClass(), "namespaceResolver", term1316);
        setField(term1246, term1246.getClass(), "rootNode", term1328);
        setField(term1246, term1246.getClass(), "parent", null);
        setField(term1246, term1246.getClass(), "locale", null);
        HashMap term7178 = new HashMap();
        HashMap term7187 = new HashMap();
        HashMap term7188 = new HashMap();
        HashMap term7189 = new HashMap();
        HashMap term7190 = new HashMap();
        HashMap term7191 = new HashMap();
        HashMap term7192 = new HashMap();
        HashMap term7194 = new HashMap();
        HashMap term7195 = new HashMap();
        term7177 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term7183 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7184 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7185 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7186 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7193 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7196 = newInstance(Class.forName("java.lang.Object"));
        setField(term7177, term7177.getClass(), "node", null);
        setField(term7177, term7177.getClass(), "namespaces", term7178);
        setField(term7177, term7177.getClass(), "defaultNamespace", "IoAlmYsBwc");
        setField(term7177, term7177.getClass(), "id", "TEParAifyi");
        setField(term7186, term7186.getClass(), "parent", null);
        setField(term7186, term7186.getClass(), "namespaceMap", null);
        setField(term7186, term7186.getClass(), "reverseMap", null);
        setField(term7186, term7186.getClass(), "pointer", null);
        setBooleanField(term7186, term7186.getClass(), "sealed", false);
        setField(term7185, term7185.getClass(), "parent", term7186);
        setField(term7185, term7185.getClass(), "namespaceMap", term7187);
        setField(term7185, term7185.getClass(), "reverseMap", term7188);
        setField(term7185, term7185.getClass(), "pointer", null);
        setBooleanField(term7185, term7185.getClass(), "sealed", false);
        setField(term7184, term7184.getClass(), "parent", term7185);
        setField(term7184, term7184.getClass(), "namespaceMap", term7189);
        setField(term7184, term7184.getClass(), "reverseMap", term7190);
        setField(term7184, term7184.getClass(), "pointer", null);
        setBooleanField(term7184, term7184.getClass(), "sealed", false);
        setField(term7183, term7183.getClass(), "parent", term7184);
        setField(term7183, term7183.getClass(), "namespaceMap", term7191);
        setField(term7183, term7183.getClass(), "reverseMap", term7192);
        setField(term7183, term7183.getClass(), "pointer", null);
        setBooleanField(term7183, term7183.getClass(), "sealed", false);
        setField(term7177, term7177.getClass(), "localNamespaceResolver", term7183);
        setIntField(term7177, term7177.getClass(), "index", 1725571209);
        setBooleanField(term7177, term7177.getClass(), "attribute", true);
        setField(term7193, term7193.getClass(), "parent", null);
        setField(term7193, term7193.getClass(), "namespaceMap", term7194);
        setField(term7193, term7193.getClass(), "reverseMap", term7195);
        setField(term7193, term7193.getClass(), "pointer", null);
        setBooleanField(term7193, term7193.getClass(), "sealed", false);
        setField(term7177, term7177.getClass(), "namespaceResolver", term7193);
        setField(term7177, term7177.getClass(), "rootNode", term7196);
        setField(term7177, term7177.getClass(), "parent", null);
        setField(term7177, term7177.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getBaseValue", argTypes, term1246, args);
        assertTrue(recursiveEquals(term1246, term7177));
        assertTrue(recursiveEquals(retValue, null));
    }

};


