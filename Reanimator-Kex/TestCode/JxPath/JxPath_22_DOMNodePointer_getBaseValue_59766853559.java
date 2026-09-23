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

public class DOMNodePointer_getBaseValue_59766853559 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1236;
     Object term7222;

    public DOMNodePointer_getBaseValue_59766853559() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1237 = new HashMap();
        HashMap term1271 = new HashMap();
        HashMap term1276 = new HashMap();
        HashMap term1282 = new HashMap();
        HashMap term1287 = new HashMap();
        HashMap term1293 = new HashMap();
        HashMap term1298 = new HashMap();
        HashMap term1307 = new HashMap();
        HashMap term1312 = new HashMap();
        term1236 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term1266 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1267 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1268 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1269 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1306 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1236, term1236.getClass(), "node", null);
        setField(term1236, term1236.getClass(), "namespaces", term1237);
        setField(term1236, term1236.getClass(), "defaultNamespace", "IoAlmYsBwc");
        setField(term1236, term1236.getClass(), "id", "TEParAifyi");
        setField(term1269, term1269.getClass(), "parent", null);
        setField(term1269, term1269.getClass(), "namespaceMap", null);
        setField(term1269, term1269.getClass(), "reverseMap", null);
        setField(term1269, term1269.getClass(), "pointer", null);
        setBooleanField(term1269, term1269.getClass(), "sealed", false);
        setField(term1268, term1268.getClass(), "parent", term1269);
        setField(term1268, term1268.getClass(), "namespaceMap", term1271);
        setField(term1268, term1268.getClass(), "reverseMap", term1276);
        setField(term1268, term1268.getClass(), "pointer", null);
        setBooleanField(term1268, term1268.getClass(), "sealed", false);
        setField(term1267, term1267.getClass(), "parent", term1268);
        setField(term1267, term1267.getClass(), "namespaceMap", term1282);
        setField(term1267, term1267.getClass(), "reverseMap", term1287);
        setField(term1267, term1267.getClass(), "pointer", null);
        setBooleanField(term1267, term1267.getClass(), "sealed", false);
        setField(term1266, term1266.getClass(), "parent", term1267);
        setField(term1266, term1266.getClass(), "namespaceMap", term1293);
        setField(term1266, term1266.getClass(), "reverseMap", term1298);
        setField(term1266, term1266.getClass(), "pointer", null);
        setBooleanField(term1266, term1266.getClass(), "sealed", false);
        setField(term1236, term1236.getClass(), "localNamespaceResolver", term1266);
        setIntField(term1236, term1236.getClass(), "index", 1725571209);
        setBooleanField(term1236, term1236.getClass(), "attribute", true);
        setField(term1306, term1306.getClass(), "parent", null);
        setField(term1306, term1306.getClass(), "namespaceMap", term1307);
        setField(term1306, term1306.getClass(), "reverseMap", term1312);
        setField(term1306, term1306.getClass(), "pointer", null);
        setBooleanField(term1306, term1306.getClass(), "sealed", false);
        setField(term1236, term1236.getClass(), "namespaceResolver", term1306);
        setField(term1236, term1236.getClass(), "exceptionHandler", null);
        setField(term1236, term1236.getClass(), "rootNode", null);
        setField(term1236, term1236.getClass(), "parent", null);
        setField(term1236, term1236.getClass(), "locale", null);
        HashMap term7223 = new HashMap();
        HashMap term7232 = new HashMap();
        HashMap term7233 = new HashMap();
        HashMap term7234 = new HashMap();
        HashMap term7235 = new HashMap();
        HashMap term7236 = new HashMap();
        HashMap term7237 = new HashMap();
        HashMap term7239 = new HashMap();
        HashMap term7240 = new HashMap();
        term7222 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term7228 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7229 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7230 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7231 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7238 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term7222, term7222.getClass(), "node", null);
        setField(term7222, term7222.getClass(), "namespaces", term7223);
        setField(term7222, term7222.getClass(), "defaultNamespace", "IoAlmYsBwc");
        setField(term7222, term7222.getClass(), "id", "TEParAifyi");
        setField(term7231, term7231.getClass(), "parent", null);
        setField(term7231, term7231.getClass(), "namespaceMap", null);
        setField(term7231, term7231.getClass(), "reverseMap", null);
        setField(term7231, term7231.getClass(), "pointer", null);
        setBooleanField(term7231, term7231.getClass(), "sealed", false);
        setField(term7230, term7230.getClass(), "parent", term7231);
        setField(term7230, term7230.getClass(), "namespaceMap", term7232);
        setField(term7230, term7230.getClass(), "reverseMap", term7233);
        setField(term7230, term7230.getClass(), "pointer", null);
        setBooleanField(term7230, term7230.getClass(), "sealed", false);
        setField(term7229, term7229.getClass(), "parent", term7230);
        setField(term7229, term7229.getClass(), "namespaceMap", term7234);
        setField(term7229, term7229.getClass(), "reverseMap", term7235);
        setField(term7229, term7229.getClass(), "pointer", null);
        setBooleanField(term7229, term7229.getClass(), "sealed", false);
        setField(term7228, term7228.getClass(), "parent", term7229);
        setField(term7228, term7228.getClass(), "namespaceMap", term7236);
        setField(term7228, term7228.getClass(), "reverseMap", term7237);
        setField(term7228, term7228.getClass(), "pointer", null);
        setBooleanField(term7228, term7228.getClass(), "sealed", false);
        setField(term7222, term7222.getClass(), "localNamespaceResolver", term7228);
        setIntField(term7222, term7222.getClass(), "index", 1725571209);
        setBooleanField(term7222, term7222.getClass(), "attribute", true);
        setField(term7238, term7238.getClass(), "parent", null);
        setField(term7238, term7238.getClass(), "namespaceMap", term7239);
        setField(term7238, term7238.getClass(), "reverseMap", term7240);
        setField(term7238, term7238.getClass(), "pointer", null);
        setBooleanField(term7238, term7238.getClass(), "sealed", false);
        setField(term7222, term7222.getClass(), "namespaceResolver", term7238);
        setField(term7222, term7222.getClass(), "exceptionHandler", null);
        setField(term7222, term7222.getClass(), "rootNode", null);
        setField(term7222, term7222.getClass(), "parent", null);
        setField(term7222, term7222.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getBaseValue", argTypes, term1236, args);
        assertTrue(recursiveEquals(term1236, term7222));
        assertTrue(recursiveEquals(retValue, null));
    }

};


