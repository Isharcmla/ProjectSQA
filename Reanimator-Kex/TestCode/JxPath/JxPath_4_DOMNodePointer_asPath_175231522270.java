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

public class DOMNodePointer_asPath_175231522270 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2447;
     Object term10194;

    public DOMNodePointer_asPath_175231522270() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2448 = new HashMap();
        HashMap term2485 = new HashMap();
        HashMap term2490 = new HashMap();
        HashMap term2496 = new HashMap();
        HashMap term2501 = new HashMap();
        HashMap term2507 = new HashMap();
        HashMap term2512 = new HashMap();
        term2447 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term2479 = newInstance(Class.forName("java.lang.Object"));
        Object term2480 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2481 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2482 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2483 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term2447, term2447.getClass(), "node", null);
        setField(term2447, term2447.getClass(), "namespaces", term2448);
        setField(term2447, term2447.getClass(), "defaultNamespace", "hoicvmsovO");
        setField(term2447, term2447.getClass(), "id", "eqJfYWRaEL");
        setIntField(term2447, term2447.getClass(), "index", -1007160944);
        setBooleanField(term2447, term2447.getClass(), "attribute", true);
        setField(term2447, term2447.getClass(), "rootNode", term2479);
        setField(term2483, term2483.getClass(), "parent", null);
        setField(term2483, term2483.getClass(), "namespaceMap", null);
        setField(term2483, term2483.getClass(), "reverseMap", null);
        setField(term2483, term2483.getClass(), "pointer", null);
        setField(term2483, term2483.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2483, term2483.getClass(), "sealed", false);
        setField(term2482, term2482.getClass(), "parent", term2483);
        setField(term2482, term2482.getClass(), "namespaceMap", term2485);
        setField(term2482, term2482.getClass(), "reverseMap", term2490);
        setField(term2482, term2482.getClass(), "pointer", null);
        setField(term2482, term2482.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2482, term2482.getClass(), "sealed", false);
        setField(term2481, term2481.getClass(), "parent", term2482);
        setField(term2481, term2481.getClass(), "namespaceMap", term2496);
        setField(term2481, term2481.getClass(), "reverseMap", term2501);
        setField(term2481, term2481.getClass(), "pointer", null);
        setField(term2481, term2481.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2481, term2481.getClass(), "sealed", false);
        setField(term2480, term2480.getClass(), "parent", term2481);
        setField(term2480, term2480.getClass(), "namespaceMap", term2507);
        setField(term2480, term2480.getClass(), "reverseMap", term2512);
        setField(term2480, term2480.getClass(), "pointer", null);
        setField(term2480, term2480.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2480, term2480.getClass(), "sealed", false);
        setField(term2447, term2447.getClass(), "namespaceResolver", term2480);
        setField(term2447, term2447.getClass(), "parent", null);
        setField(term2447, term2447.getClass(), "locale", null);
        HashMap term10195 = new HashMap();
        HashMap term10205 = new HashMap();
        HashMap term10206 = new HashMap();
        HashMap term10207 = new HashMap();
        HashMap term10208 = new HashMap();
        HashMap term10209 = new HashMap();
        HashMap term10210 = new HashMap();
        term10194 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term10200 = newInstance(Class.forName("java.lang.Object"));
        Object term10201 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term10202 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term10203 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term10204 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term10194, term10194.getClass(), "node", null);
        setField(term10194, term10194.getClass(), "namespaces", term10195);
        setField(term10194, term10194.getClass(), "defaultNamespace", "hoicvmsovO");
        setField(term10194, term10194.getClass(), "id", "eqJfYWRaEL");
        setIntField(term10194, term10194.getClass(), "index", -1007160944);
        setBooleanField(term10194, term10194.getClass(), "attribute", true);
        setField(term10194, term10194.getClass(), "rootNode", term10200);
        setField(term10204, term10204.getClass(), "parent", null);
        setField(term10204, term10204.getClass(), "namespaceMap", null);
        setField(term10204, term10204.getClass(), "reverseMap", null);
        setField(term10204, term10204.getClass(), "pointer", null);
        setField(term10204, term10204.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term10204, term10204.getClass(), "sealed", false);
        setField(term10203, term10203.getClass(), "parent", term10204);
        setField(term10203, term10203.getClass(), "namespaceMap", term10205);
        setField(term10203, term10203.getClass(), "reverseMap", term10206);
        setField(term10203, term10203.getClass(), "pointer", null);
        setField(term10203, term10203.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term10203, term10203.getClass(), "sealed", false);
        setField(term10202, term10202.getClass(), "parent", term10203);
        setField(term10202, term10202.getClass(), "namespaceMap", term10207);
        setField(term10202, term10202.getClass(), "reverseMap", term10208);
        setField(term10202, term10202.getClass(), "pointer", null);
        setField(term10202, term10202.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term10202, term10202.getClass(), "sealed", false);
        setField(term10201, term10201.getClass(), "parent", term10202);
        setField(term10201, term10201.getClass(), "namespaceMap", term10209);
        setField(term10201, term10201.getClass(), "reverseMap", term10210);
        setField(term10201, term10201.getClass(), "pointer", null);
        setField(term10201, term10201.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term10201, term10201.getClass(), "sealed", false);
        setField(term10194, term10194.getClass(), "namespaceResolver", term10201);
        setField(term10194, term10194.getClass(), "parent", null);
        setField(term10194, term10194.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asPath", argTypes, term2447, args);
        assertTrue(recursiveEquals(term2447, term10194));
        assertTrue(recursiveEquals(retValue, "id(\'eqJfYWRaEL\')"));
    }

};


