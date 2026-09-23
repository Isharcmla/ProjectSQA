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

public class DOMNodePointer_getImmediateNode_97539716261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1294;
     Object term7279;

    public DOMNodePointer_getImmediateNode_97539716261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1295 = new HashMap();
        HashMap term1329 = new HashMap();
        HashMap term1334 = new HashMap();
        HashMap term1340 = new HashMap();
        HashMap term1345 = new HashMap();
        HashMap term1351 = new HashMap();
        HashMap term1356 = new HashMap();
        HashMap term1366 = new HashMap();
        term1294 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term1324 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1325 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1326 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1327 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1364 = newInstance(Class.forName("java.lang.Object"));
        Object term1365 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1294, term1294.getClass(), "node", null);
        setField(term1294, term1294.getClass(), "namespaces", term1295);
        setField(term1294, term1294.getClass(), "defaultNamespace", "OWDIEULEFu");
        setField(term1294, term1294.getClass(), "id", "dWRymuLBtr");
        setField(term1327, term1327.getClass(), "parent", null);
        setField(term1327, term1327.getClass(), "namespaceMap", null);
        setField(term1327, term1327.getClass(), "reverseMap", null);
        setField(term1327, term1327.getClass(), "pointer", null);
        setBooleanField(term1327, term1327.getClass(), "sealed", false);
        setField(term1326, term1326.getClass(), "parent", term1327);
        setField(term1326, term1326.getClass(), "namespaceMap", term1329);
        setField(term1326, term1326.getClass(), "reverseMap", term1334);
        setField(term1326, term1326.getClass(), "pointer", null);
        setBooleanField(term1326, term1326.getClass(), "sealed", false);
        setField(term1325, term1325.getClass(), "parent", term1326);
        setField(term1325, term1325.getClass(), "namespaceMap", term1340);
        setField(term1325, term1325.getClass(), "reverseMap", term1345);
        setField(term1325, term1325.getClass(), "pointer", null);
        setBooleanField(term1325, term1325.getClass(), "sealed", false);
        setField(term1324, term1324.getClass(), "parent", term1325);
        setField(term1324, term1324.getClass(), "namespaceMap", term1351);
        setField(term1324, term1324.getClass(), "reverseMap", term1356);
        setField(term1324, term1324.getClass(), "pointer", null);
        setBooleanField(term1324, term1324.getClass(), "sealed", false);
        setField(term1294, term1294.getClass(), "localNamespaceResolver", term1324);
        setIntField(term1294, term1294.getClass(), "index", -522618178);
        setBooleanField(term1294, term1294.getClass(), "attribute", false);
        setField(term1294, term1294.getClass(), "rootNode", term1364);
        setField(term1365, term1365.getClass(), "parent", null);
        setField(term1365, term1365.getClass(), "namespaceMap", term1366);
        setField(term1365, term1365.getClass(), "reverseMap", null);
        setField(term1365, term1365.getClass(), "pointer", null);
        setBooleanField(term1365, term1365.getClass(), "sealed", false);
        setField(term1294, term1294.getClass(), "namespaceResolver", term1365);
        setField(term1294, term1294.getClass(), "parent", null);
        setField(term1294, term1294.getClass(), "locale", null);
        HashMap term7280 = new HashMap();
        HashMap term7289 = new HashMap();
        HashMap term7290 = new HashMap();
        HashMap term7291 = new HashMap();
        HashMap term7292 = new HashMap();
        HashMap term7293 = new HashMap();
        HashMap term7294 = new HashMap();
        HashMap term7297 = new HashMap();
        term7279 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term7285 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7286 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7287 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7288 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7295 = newInstance(Class.forName("java.lang.Object"));
        Object term7296 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term7279, term7279.getClass(), "node", null);
        setField(term7279, term7279.getClass(), "namespaces", term7280);
        setField(term7279, term7279.getClass(), "defaultNamespace", "OWDIEULEFu");
        setField(term7279, term7279.getClass(), "id", "dWRymuLBtr");
        setField(term7288, term7288.getClass(), "parent", null);
        setField(term7288, term7288.getClass(), "namespaceMap", null);
        setField(term7288, term7288.getClass(), "reverseMap", null);
        setField(term7288, term7288.getClass(), "pointer", null);
        setBooleanField(term7288, term7288.getClass(), "sealed", false);
        setField(term7287, term7287.getClass(), "parent", term7288);
        setField(term7287, term7287.getClass(), "namespaceMap", term7289);
        setField(term7287, term7287.getClass(), "reverseMap", term7290);
        setField(term7287, term7287.getClass(), "pointer", null);
        setBooleanField(term7287, term7287.getClass(), "sealed", false);
        setField(term7286, term7286.getClass(), "parent", term7287);
        setField(term7286, term7286.getClass(), "namespaceMap", term7291);
        setField(term7286, term7286.getClass(), "reverseMap", term7292);
        setField(term7286, term7286.getClass(), "pointer", null);
        setBooleanField(term7286, term7286.getClass(), "sealed", false);
        setField(term7285, term7285.getClass(), "parent", term7286);
        setField(term7285, term7285.getClass(), "namespaceMap", term7293);
        setField(term7285, term7285.getClass(), "reverseMap", term7294);
        setField(term7285, term7285.getClass(), "pointer", null);
        setBooleanField(term7285, term7285.getClass(), "sealed", false);
        setField(term7279, term7279.getClass(), "localNamespaceResolver", term7285);
        setIntField(term7279, term7279.getClass(), "index", -522618178);
        setBooleanField(term7279, term7279.getClass(), "attribute", false);
        setField(term7279, term7279.getClass(), "rootNode", term7295);
        setField(term7296, term7296.getClass(), "parent", null);
        setField(term7296, term7296.getClass(), "namespaceMap", term7297);
        setField(term7296, term7296.getClass(), "reverseMap", null);
        setField(term7296, term7296.getClass(), "pointer", null);
        setBooleanField(term7296, term7296.getClass(), "sealed", false);
        setField(term7279, term7279.getClass(), "namespaceResolver", term7296);
        setField(term7279, term7279.getClass(), "parent", null);
        setField(term7279, term7279.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getImmediateNode", argTypes, term1294, args);
        assertTrue(recursiveEquals(term1294, term7279));
        assertTrue(recursiveEquals(retValue, null));
    }

};


