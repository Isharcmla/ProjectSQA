package org.apache.commons.jxpath.ri.model.beans;

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
import static org.apache.commons.jxpath.ri.model.beans.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.jxpath.ri.model.beans.EqualityUtils.*;
import java.lang.Object;
import java.util.HashMap;

public class NullPropertyPointer_setNameAttributeValue_55383414842 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1278;
     Object term4521;

    public NullPropertyPointer_setNameAttributeValue_55383414842() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1303 = new HashMap();
        HashMap term1308 = new HashMap();
        HashMap term1314 = new HashMap();
        HashMap term1319 = new HashMap();
        HashMap term1325 = new HashMap();
        HashMap term1330 = new HashMap();
        term1278 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term1293 = newInstance(Class.forName("java.lang.Object"));
        Object term1294 = newInstance(Class.forName("java.lang.Object"));
        Object term1297 = newInstance(Class.forName("java.lang.Object"));
        Object term1298 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1299 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1300 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1301 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1278, term1278.getClass(), "propertyName", "xOEqzGAmDU");
        setBooleanField(term1278, term1278.getClass(), "byNameAttribute", false);
        setIntField(term1278, term1278.getClass(), "propertyIndex", -469968304);
        setField(term1278, term1278.getClass(), "bean", term1293);
        setField(term1278, term1278.getClass(), "value", term1294);
        setIntField(term1278, term1278.getClass(), "index", -1145578966);
        setBooleanField(term1278, term1278.getClass(), "attribute", true);
        setField(term1278, term1278.getClass(), "rootNode", term1297);
        setField(term1301, term1301.getClass(), "parent", null);
        setField(term1301, term1301.getClass(), "namespaceMap", null);
        setField(term1301, term1301.getClass(), "reverseMap", null);
        setField(term1301, term1301.getClass(), "pointer", null);
        setField(term1301, term1301.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1301, term1301.getClass(), "sealed", false);
        setField(term1300, term1300.getClass(), "parent", term1301);
        setField(term1300, term1300.getClass(), "namespaceMap", term1303);
        setField(term1300, term1300.getClass(), "reverseMap", term1308);
        setField(term1300, term1300.getClass(), "pointer", null);
        setField(term1300, term1300.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1300, term1300.getClass(), "sealed", false);
        setField(term1299, term1299.getClass(), "parent", term1300);
        setField(term1299, term1299.getClass(), "namespaceMap", term1314);
        setField(term1299, term1299.getClass(), "reverseMap", term1319);
        setField(term1299, term1299.getClass(), "pointer", null);
        setField(term1299, term1299.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1299, term1299.getClass(), "sealed", false);
        setField(term1298, term1298.getClass(), "parent", term1299);
        setField(term1298, term1298.getClass(), "namespaceMap", term1325);
        setField(term1298, term1298.getClass(), "reverseMap", term1330);
        setField(term1298, term1298.getClass(), "pointer", null);
        setField(term1298, term1298.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1298, term1298.getClass(), "sealed", false);
        setField(term1278, term1278.getClass(), "namespaceResolver", term1298);
        setField(term1278, term1278.getClass(), "parent", null);
        setField(term1278, term1278.getClass(), "locale", null);
        HashMap term4531 = new HashMap();
        HashMap term4532 = new HashMap();
        HashMap term4533 = new HashMap();
        HashMap term4534 = new HashMap();
        HashMap term4535 = new HashMap();
        HashMap term4536 = new HashMap();
        term4521 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term4524 = newInstance(Class.forName("java.lang.Object"));
        Object term4525 = newInstance(Class.forName("java.lang.Object"));
        Object term4526 = newInstance(Class.forName("java.lang.Object"));
        Object term4527 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term4528 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term4529 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term4530 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term4521, term4521.getClass(), "propertyName", "eZFUvlxvGV");
        setBooleanField(term4521, term4521.getClass(), "byNameAttribute", true);
        setIntField(term4521, term4521.getClass(), "propertyIndex", -469968304);
        setField(term4521, term4521.getClass(), "bean", term4524);
        setField(term4521, term4521.getClass(), "value", term4525);
        setIntField(term4521, term4521.getClass(), "index", -1145578966);
        setBooleanField(term4521, term4521.getClass(), "attribute", true);
        setField(term4521, term4521.getClass(), "rootNode", term4526);
        setField(term4530, term4530.getClass(), "parent", null);
        setField(term4530, term4530.getClass(), "namespaceMap", null);
        setField(term4530, term4530.getClass(), "reverseMap", null);
        setField(term4530, term4530.getClass(), "pointer", null);
        setField(term4530, term4530.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term4530, term4530.getClass(), "sealed", false);
        setField(term4529, term4529.getClass(), "parent", term4530);
        setField(term4529, term4529.getClass(), "namespaceMap", term4531);
        setField(term4529, term4529.getClass(), "reverseMap", term4532);
        setField(term4529, term4529.getClass(), "pointer", null);
        setField(term4529, term4529.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term4529, term4529.getClass(), "sealed", false);
        setField(term4528, term4528.getClass(), "parent", term4529);
        setField(term4528, term4528.getClass(), "namespaceMap", term4533);
        setField(term4528, term4528.getClass(), "reverseMap", term4534);
        setField(term4528, term4528.getClass(), "pointer", null);
        setField(term4528, term4528.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term4528, term4528.getClass(), "sealed", false);
        setField(term4527, term4527.getClass(), "parent", term4528);
        setField(term4527, term4527.getClass(), "namespaceMap", term4535);
        setField(term4527, term4527.getClass(), "reverseMap", term4536);
        setField(term4527, term4527.getClass(), "pointer", null);
        setField(term4527, term4527.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term4527, term4527.getClass(), "sealed", false);
        setField(term4521, term4521.getClass(), "namespaceResolver", term4527);
        setField(term4521, term4521.getClass(), "parent", null);
        setField(term4521, term4521.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "eZFUvlxvGV";
        callMethod(klass, "setNameAttributeValue", argTypes, term1278, args);
        assertTrue(recursiveEquals(term1278, term4521));
    }

};


