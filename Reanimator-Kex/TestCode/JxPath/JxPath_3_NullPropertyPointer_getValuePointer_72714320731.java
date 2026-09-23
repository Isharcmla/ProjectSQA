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

public class NullPropertyPointer_getValuePointer_72714320731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term411;
     Object term2450;
     Object term2433;

    public NullPropertyPointer_getValuePointer_72714320731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term436 = new HashMap();
        HashMap term441 = new HashMap();
        HashMap term447 = new HashMap();
        HashMap term452 = new HashMap();
        HashMap term458 = new HashMap();
        HashMap term463 = new HashMap();
        term411 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term426 = newInstance(Class.forName("java.lang.Object"));
        Object term427 = newInstance(Class.forName("java.lang.Object"));
        Object term430 = newInstance(Class.forName("java.lang.Object"));
        Object term431 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term432 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term433 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term434 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term411, term411.getClass(), "propertyName", "SzjVpOQTyS");
        setBooleanField(term411, term411.getClass(), "byNameAttribute", false);
        setIntField(term411, term411.getClass(), "propertyIndex", -883034806);
        setField(term411, term411.getClass(), "bean", term426);
        setField(term411, term411.getClass(), "value", term427);
        setIntField(term411, term411.getClass(), "index", 1585847225);
        setBooleanField(term411, term411.getClass(), "attribute", true);
        setField(term411, term411.getClass(), "rootNode", term430);
        setField(term434, term434.getClass(), "parent", null);
        setField(term434, term434.getClass(), "namespaceMap", null);
        setField(term434, term434.getClass(), "reverseMap", null);
        setField(term434, term434.getClass(), "pointer", null);
        setField(term434, term434.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term434, term434.getClass(), "sealed", false);
        setField(term433, term433.getClass(), "parent", term434);
        setField(term433, term433.getClass(), "namespaceMap", term436);
        setField(term433, term433.getClass(), "reverseMap", term441);
        setField(term433, term433.getClass(), "pointer", null);
        setField(term433, term433.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term433, term433.getClass(), "sealed", false);
        setField(term432, term432.getClass(), "parent", term433);
        setField(term432, term432.getClass(), "namespaceMap", term447);
        setField(term432, term432.getClass(), "reverseMap", term452);
        setField(term432, term432.getClass(), "pointer", null);
        setField(term432, term432.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term432, term432.getClass(), "sealed", false);
        setField(term431, term431.getClass(), "parent", term432);
        setField(term431, term431.getClass(), "namespaceMap", term458);
        setField(term431, term431.getClass(), "reverseMap", term463);
        setField(term431, term431.getClass(), "pointer", null);
        setField(term431, term431.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term431, term431.getClass(), "sealed", false);
        setField(term411, term411.getClass(), "namespaceResolver", term431);
        setField(term411, term411.getClass(), "parent", null);
        setField(term411, term411.getClass(), "locale", null);
        HashMap term2459 = new HashMap();
        HashMap term2460 = new HashMap();
        HashMap term2461 = new HashMap();
        HashMap term2462 = new HashMap();
        term2450 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term2453 = newInstance(Class.forName("java.lang.Object"));
        Object term2454 = newInstance(Class.forName("java.lang.Object"));
        Object term2455 = newInstance(Class.forName("java.lang.Object"));
        Object term2456 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2457 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2458 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term2450, term2450.getClass(), "propertyName", "SzjVpOQTyS");
        setBooleanField(term2450, term2450.getClass(), "byNameAttribute", false);
        setIntField(term2450, term2450.getClass(), "propertyIndex", -883034806);
        setField(term2450, term2450.getClass(), "bean", term2453);
        setField(term2450, term2450.getClass(), "value", term2454);
        setIntField(term2450, term2450.getClass(), "index", 1585847225);
        setBooleanField(term2450, term2450.getClass(), "attribute", true);
        setField(term2450, term2450.getClass(), "rootNode", term2455);
        setField(term2458, term2458.getClass(), "parent", null);
        setField(term2458, term2458.getClass(), "namespaceMap", null);
        setField(term2458, term2458.getClass(), "reverseMap", null);
        setField(term2458, term2458.getClass(), "pointer", null);
        setField(term2458, term2458.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2458, term2458.getClass(), "sealed", false);
        setField(term2457, term2457.getClass(), "parent", term2458);
        setField(term2457, term2457.getClass(), "namespaceMap", term2459);
        setField(term2457, term2457.getClass(), "reverseMap", term2460);
        setField(term2457, term2457.getClass(), "pointer", null);
        setField(term2457, term2457.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2457, term2457.getClass(), "sealed", false);
        setField(term2456, term2456.getClass(), "parent", term2457);
        setField(term2456, term2456.getClass(), "namespaceMap", term2461);
        setField(term2456, term2456.getClass(), "reverseMap", term2462);
        setField(term2456, term2456.getClass(), "pointer", null);
        setField(term2456, term2456.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2456, term2456.getClass(), "sealed", false);
        setField(term2450, term2450.getClass(), "namespaceResolver", term2456);
        setField(term2450, term2450.getClass(), "parent", null);
        setField(term2450, term2450.getClass(), "locale", null);
        HashMap term2385 = new HashMap();
        HashMap term2390 = new HashMap();
        HashMap term2396 = new HashMap();
        HashMap term2401 = new HashMap();
        term2433 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
        Object term2434 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        Object term2447 = newInstance(Class.forName("java.lang.Object"));
        Object term2361 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term2376 = newInstance(Class.forName("java.lang.Object"));
        Object term2377 = newInstance(Class.forName("java.lang.Object"));
        Object term2380 = newInstance(Class.forName("java.lang.Object"));
        Object term2381 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2382 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2383 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term2434, term2434.getClass(), "prefix", null);
        setField(term2434, term2434.getClass(), "name", "SzjVpOQTyS");
        setField(term2433, term2433.getClass(), "name", term2434);
        setField(term2433, term2433.getClass(), "id", null);
        setField(term2433, term2433.getClass(), "value", term2447);
        setIntField(term2433, term2433.getClass(), "index", -2147483648);
        setBooleanField(term2433, term2433.getClass(), "attribute", false);
        setField(term2433, term2433.getClass(), "rootNode", null);
        setField(term2433, term2433.getClass(), "namespaceResolver", null);
        setField(term2361, term2361.getClass(), "propertyName", "SzjVpOQTyS");
        setBooleanField(term2361, term2361.getClass(), "byNameAttribute", false);
        setIntField(term2361, term2361.getClass(), "propertyIndex", -883034806);
        setField(term2361, term2361.getClass(), "bean", term2376);
        setField(term2361, term2361.getClass(), "value", term2377);
        setIntField(term2361, term2361.getClass(), "index", 1585847225);
        setBooleanField(term2361, term2361.getClass(), "attribute", true);
        setField(term2361, term2361.getClass(), "rootNode", term2380);
        setField(term2383, term2383.getClass(), "parent", null);
        setField(term2383, term2383.getClass(), "namespaceMap", null);
        setField(term2383, term2383.getClass(), "reverseMap", null);
        setField(term2383, term2383.getClass(), "pointer", null);
        setField(term2383, term2383.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2383, term2383.getClass(), "sealed", false);
        setField(term2382, term2382.getClass(), "parent", term2383);
        setField(term2382, term2382.getClass(), "namespaceMap", term2385);
        setField(term2382, term2382.getClass(), "reverseMap", term2390);
        setField(term2382, term2382.getClass(), "pointer", null);
        setField(term2382, term2382.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2382, term2382.getClass(), "sealed", false);
        setField(term2381, term2381.getClass(), "parent", term2382);
        setField(term2381, term2381.getClass(), "namespaceMap", term2396);
        setField(term2381, term2381.getClass(), "reverseMap", term2401);
        setField(term2381, term2381.getClass(), "pointer", null);
        setField(term2381, term2381.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2381, term2381.getClass(), "sealed", false);
        setField(term2361, term2361.getClass(), "namespaceResolver", term2381);
        setField(term2361, term2361.getClass(), "parent", null);
        setField(term2361, term2361.getClass(), "locale", null);
        setField(term2433, term2433.getClass(), "parent", term2361);
        setField(term2433, term2433.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getValuePointer", argTypes, term411, args);
        assertTrue(recursiveEquals(term411, term2450));
        assertTrue(recursiveEquals(retValue, term2433));
    }

};


