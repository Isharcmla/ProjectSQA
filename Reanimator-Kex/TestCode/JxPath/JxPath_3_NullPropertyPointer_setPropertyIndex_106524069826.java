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
import java.lang.Integer;

public class NullPropertyPointer_setPropertyIndex_106524069826 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69;
     Object term127;
     Object term1933;

    public NullPropertyPointer_setPropertyIndex_106524069826() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term94 = new HashMap();
        HashMap term99 = new HashMap();
        HashMap term105 = new HashMap();
        HashMap term110 = new HashMap();
        HashMap term116 = new HashMap();
        HashMap term121 = new HashMap();
        term69 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term84 = newInstance(Class.forName("java.lang.Object"));
        Object term85 = newInstance(Class.forName("java.lang.Object"));
        Object term88 = newInstance(Class.forName("java.lang.Object"));
        Object term89 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term90 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term91 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term92 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term69, term69.getClass(), "propertyName", "sjlJAEtRrb");
        setBooleanField(term69, term69.getClass(), "byNameAttribute", false);
        setIntField(term69, term69.getClass(), "propertyIndex", 1484323161);
        setField(term69, term69.getClass(), "bean", term84);
        setField(term69, term69.getClass(), "value", term85);
        setIntField(term69, term69.getClass(), "index", 391863371);
        setBooleanField(term69, term69.getClass(), "attribute", false);
        setField(term69, term69.getClass(), "rootNode", term88);
        setField(term92, term92.getClass(), "parent", null);
        setField(term92, term92.getClass(), "namespaceMap", null);
        setField(term92, term92.getClass(), "reverseMap", null);
        setField(term92, term92.getClass(), "pointer", null);
        setField(term92, term92.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term92, term92.getClass(), "sealed", false);
        setField(term91, term91.getClass(), "parent", term92);
        setField(term91, term91.getClass(), "namespaceMap", term94);
        setField(term91, term91.getClass(), "reverseMap", term99);
        setField(term91, term91.getClass(), "pointer", null);
        setField(term91, term91.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term91, term91.getClass(), "sealed", false);
        setField(term90, term90.getClass(), "parent", term91);
        setField(term90, term90.getClass(), "namespaceMap", term105);
        setField(term90, term90.getClass(), "reverseMap", term110);
        setField(term90, term90.getClass(), "pointer", null);
        setField(term90, term90.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term90, term90.getClass(), "sealed", false);
        setField(term89, term89.getClass(), "parent", term90);
        setField(term89, term89.getClass(), "namespaceMap", term116);
        setField(term89, term89.getClass(), "reverseMap", term121);
        setField(term89, term89.getClass(), "pointer", null);
        setField(term89, term89.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term89, term89.getClass(), "sealed", false);
        setField(term69, term69.getClass(), "namespaceResolver", term89);
        setField(term69, term69.getClass(), "parent", null);
        setField(term69, term69.getClass(), "locale", null);
        term127 = new Integer(-1922583790);
        HashMap term1943 = new HashMap();
        HashMap term1944 = new HashMap();
        HashMap term1945 = new HashMap();
        HashMap term1946 = new HashMap();
        HashMap term1947 = new HashMap();
        HashMap term1948 = new HashMap();
        term1933 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term1936 = newInstance(Class.forName("java.lang.Object"));
        Object term1937 = newInstance(Class.forName("java.lang.Object"));
        Object term1938 = newInstance(Class.forName("java.lang.Object"));
        Object term1939 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1940 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1941 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1942 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1933, term1933.getClass(), "propertyName", "sjlJAEtRrb");
        setBooleanField(term1933, term1933.getClass(), "byNameAttribute", false);
        setIntField(term1933, term1933.getClass(), "propertyIndex", 1484323161);
        setField(term1933, term1933.getClass(), "bean", term1936);
        setField(term1933, term1933.getClass(), "value", term1937);
        setIntField(term1933, term1933.getClass(), "index", 391863371);
        setBooleanField(term1933, term1933.getClass(), "attribute", false);
        setField(term1933, term1933.getClass(), "rootNode", term1938);
        setField(term1942, term1942.getClass(), "parent", null);
        setField(term1942, term1942.getClass(), "namespaceMap", null);
        setField(term1942, term1942.getClass(), "reverseMap", null);
        setField(term1942, term1942.getClass(), "pointer", null);
        setField(term1942, term1942.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1942, term1942.getClass(), "sealed", false);
        setField(term1941, term1941.getClass(), "parent", term1942);
        setField(term1941, term1941.getClass(), "namespaceMap", term1943);
        setField(term1941, term1941.getClass(), "reverseMap", term1944);
        setField(term1941, term1941.getClass(), "pointer", null);
        setField(term1941, term1941.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1941, term1941.getClass(), "sealed", false);
        setField(term1940, term1940.getClass(), "parent", term1941);
        setField(term1940, term1940.getClass(), "namespaceMap", term1945);
        setField(term1940, term1940.getClass(), "reverseMap", term1946);
        setField(term1940, term1940.getClass(), "pointer", null);
        setField(term1940, term1940.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1940, term1940.getClass(), "sealed", false);
        setField(term1939, term1939.getClass(), "parent", term1940);
        setField(term1939, term1939.getClass(), "namespaceMap", term1947);
        setField(term1939, term1939.getClass(), "reverseMap", term1948);
        setField(term1939, term1939.getClass(), "pointer", null);
        setField(term1939, term1939.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1939, term1939.getClass(), "sealed", false);
        setField(term1933, term1933.getClass(), "namespaceResolver", term1939);
        setField(term1933, term1933.getClass(), "parent", null);
        setField(term1933, term1933.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term127;
        callMethod(klass, "setPropertyIndex", argTypes, term69, args);
        assertTrue(recursiveEquals(term69, term1933));
        assertTrue(recursiveEquals(term127, -1922583790));
    }

};


