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

public class NullPropertyPointer_getPropertyName_91979228440 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1120;
     Object term4277;

    public NullPropertyPointer_getPropertyName_91979228440() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1145 = new HashMap();
        HashMap term1150 = new HashMap();
        HashMap term1156 = new HashMap();
        HashMap term1161 = new HashMap();
        HashMap term1167 = new HashMap();
        HashMap term1172 = new HashMap();
        term1120 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term1135 = newInstance(Class.forName("java.lang.Object"));
        Object term1136 = newInstance(Class.forName("java.lang.Object"));
        Object term1139 = newInstance(Class.forName("java.lang.Object"));
        Object term1140 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1141 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1142 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1143 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1120, term1120.getClass(), "propertyName", "pCTimMblYc");
        setBooleanField(term1120, term1120.getClass(), "byNameAttribute", true);
        setIntField(term1120, term1120.getClass(), "propertyIndex", -226514366);
        setField(term1120, term1120.getClass(), "bean", term1135);
        setField(term1120, term1120.getClass(), "value", term1136);
        setIntField(term1120, term1120.getClass(), "index", 1193880199);
        setBooleanField(term1120, term1120.getClass(), "attribute", true);
        setField(term1120, term1120.getClass(), "rootNode", term1139);
        setField(term1143, term1143.getClass(), "parent", null);
        setField(term1143, term1143.getClass(), "namespaceMap", null);
        setField(term1143, term1143.getClass(), "reverseMap", null);
        setField(term1143, term1143.getClass(), "pointer", null);
        setField(term1143, term1143.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1143, term1143.getClass(), "sealed", false);
        setField(term1142, term1142.getClass(), "parent", term1143);
        setField(term1142, term1142.getClass(), "namespaceMap", term1145);
        setField(term1142, term1142.getClass(), "reverseMap", term1150);
        setField(term1142, term1142.getClass(), "pointer", null);
        setField(term1142, term1142.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1142, term1142.getClass(), "sealed", false);
        setField(term1141, term1141.getClass(), "parent", term1142);
        setField(term1141, term1141.getClass(), "namespaceMap", term1156);
        setField(term1141, term1141.getClass(), "reverseMap", term1161);
        setField(term1141, term1141.getClass(), "pointer", null);
        setField(term1141, term1141.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1141, term1141.getClass(), "sealed", false);
        setField(term1140, term1140.getClass(), "parent", term1141);
        setField(term1140, term1140.getClass(), "namespaceMap", term1167);
        setField(term1140, term1140.getClass(), "reverseMap", term1172);
        setField(term1140, term1140.getClass(), "pointer", null);
        setField(term1140, term1140.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1140, term1140.getClass(), "sealed", false);
        setField(term1120, term1120.getClass(), "namespaceResolver", term1140);
        setField(term1120, term1120.getClass(), "parent", null);
        setField(term1120, term1120.getClass(), "locale", null);
        HashMap term4287 = new HashMap();
        HashMap term4288 = new HashMap();
        HashMap term4289 = new HashMap();
        HashMap term4290 = new HashMap();
        HashMap term4291 = new HashMap();
        HashMap term4292 = new HashMap();
        term4277 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term4280 = newInstance(Class.forName("java.lang.Object"));
        Object term4281 = newInstance(Class.forName("java.lang.Object"));
        Object term4282 = newInstance(Class.forName("java.lang.Object"));
        Object term4283 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term4284 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term4285 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term4286 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term4277, term4277.getClass(), "propertyName", "pCTimMblYc");
        setBooleanField(term4277, term4277.getClass(), "byNameAttribute", true);
        setIntField(term4277, term4277.getClass(), "propertyIndex", -226514366);
        setField(term4277, term4277.getClass(), "bean", term4280);
        setField(term4277, term4277.getClass(), "value", term4281);
        setIntField(term4277, term4277.getClass(), "index", 1193880199);
        setBooleanField(term4277, term4277.getClass(), "attribute", true);
        setField(term4277, term4277.getClass(), "rootNode", term4282);
        setField(term4286, term4286.getClass(), "parent", null);
        setField(term4286, term4286.getClass(), "namespaceMap", null);
        setField(term4286, term4286.getClass(), "reverseMap", null);
        setField(term4286, term4286.getClass(), "pointer", null);
        setField(term4286, term4286.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term4286, term4286.getClass(), "sealed", false);
        setField(term4285, term4285.getClass(), "parent", term4286);
        setField(term4285, term4285.getClass(), "namespaceMap", term4287);
        setField(term4285, term4285.getClass(), "reverseMap", term4288);
        setField(term4285, term4285.getClass(), "pointer", null);
        setField(term4285, term4285.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term4285, term4285.getClass(), "sealed", false);
        setField(term4284, term4284.getClass(), "parent", term4285);
        setField(term4284, term4284.getClass(), "namespaceMap", term4289);
        setField(term4284, term4284.getClass(), "reverseMap", term4290);
        setField(term4284, term4284.getClass(), "pointer", null);
        setField(term4284, term4284.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term4284, term4284.getClass(), "sealed", false);
        setField(term4283, term4283.getClass(), "parent", term4284);
        setField(term4283, term4283.getClass(), "namespaceMap", term4291);
        setField(term4283, term4283.getClass(), "reverseMap", term4292);
        setField(term4283, term4283.getClass(), "pointer", null);
        setField(term4283, term4283.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term4283, term4283.getClass(), "sealed", false);
        setField(term4277, term4277.getClass(), "namespaceResolver", term4283);
        setField(term4277, term4277.getClass(), "parent", null);
        setField(term4277, term4277.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPropertyName", argTypes, term1120, args);
        assertTrue(recursiveEquals(term1120, term4277));
        assertTrue(recursiveEquals(retValue, "pCTimMblYc"));
    }

};


