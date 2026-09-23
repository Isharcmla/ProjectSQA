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

public class DOMNodePointer_testNode_76971894947 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59;
     Object term4303;

    public DOMNodePointer_testNode_76971894947() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term60 = new HashMap();
        HashMap term94 = new HashMap();
        HashMap term99 = new HashMap();
        HashMap term105 = new HashMap();
        HashMap term110 = new HashMap();
        HashMap term116 = new HashMap();
        HashMap term121 = new HashMap();
        HashMap term130 = new HashMap();
        HashMap term135 = new HashMap();
        term59 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term89 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term90 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term91 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term92 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term129 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term59, term59.getClass(), "node", null);
        setField(term59, term59.getClass(), "namespaces", term60);
        setField(term59, term59.getClass(), "defaultNamespace", "sjlJAEtRrb");
        setField(term59, term59.getClass(), "id", "MuLcgQHgqz");
        setField(term92, term92.getClass(), "parent", null);
        setField(term92, term92.getClass(), "namespaceMap", null);
        setField(term92, term92.getClass(), "reverseMap", null);
        setField(term92, term92.getClass(), "pointer", null);
        setBooleanField(term92, term92.getClass(), "sealed", false);
        setField(term91, term91.getClass(), "parent", term92);
        setField(term91, term91.getClass(), "namespaceMap", term94);
        setField(term91, term91.getClass(), "reverseMap", term99);
        setField(term91, term91.getClass(), "pointer", null);
        setBooleanField(term91, term91.getClass(), "sealed", false);
        setField(term90, term90.getClass(), "parent", term91);
        setField(term90, term90.getClass(), "namespaceMap", term105);
        setField(term90, term90.getClass(), "reverseMap", term110);
        setField(term90, term90.getClass(), "pointer", null);
        setBooleanField(term90, term90.getClass(), "sealed", false);
        setField(term89, term89.getClass(), "parent", term90);
        setField(term89, term89.getClass(), "namespaceMap", term116);
        setField(term89, term89.getClass(), "reverseMap", term121);
        setField(term89, term89.getClass(), "pointer", null);
        setBooleanField(term89, term89.getClass(), "sealed", false);
        setField(term59, term59.getClass(), "localNamespaceResolver", term89);
        setIntField(term59, term59.getClass(), "index", 568599855);
        setBooleanField(term59, term59.getClass(), "attribute", false);
        setField(term129, term129.getClass(), "parent", null);
        setField(term129, term129.getClass(), "namespaceMap", term130);
        setField(term129, term129.getClass(), "reverseMap", term135);
        setField(term129, term129.getClass(), "pointer", null);
        setBooleanField(term129, term129.getClass(), "sealed", false);
        setField(term59, term59.getClass(), "namespaceResolver", term129);
        setField(term59, term59.getClass(), "exceptionHandler", null);
        setField(term59, term59.getClass(), "rootNode", null);
        setField(term59, term59.getClass(), "parent", null);
        setField(term59, term59.getClass(), "locale", null);
        HashMap term4304 = new HashMap();
        HashMap term4313 = new HashMap();
        HashMap term4314 = new HashMap();
        HashMap term4315 = new HashMap();
        HashMap term4316 = new HashMap();
        HashMap term4317 = new HashMap();
        HashMap term4318 = new HashMap();
        HashMap term4320 = new HashMap();
        HashMap term4321 = new HashMap();
        term4303 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term4309 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term4310 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term4311 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term4312 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term4319 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term4303, term4303.getClass(), "node", null);
        setField(term4303, term4303.getClass(), "namespaces", term4304);
        setField(term4303, term4303.getClass(), "defaultNamespace", "sjlJAEtRrb");
        setField(term4303, term4303.getClass(), "id", "MuLcgQHgqz");
        setField(term4312, term4312.getClass(), "parent", null);
        setField(term4312, term4312.getClass(), "namespaceMap", null);
        setField(term4312, term4312.getClass(), "reverseMap", null);
        setField(term4312, term4312.getClass(), "pointer", null);
        setBooleanField(term4312, term4312.getClass(), "sealed", false);
        setField(term4311, term4311.getClass(), "parent", term4312);
        setField(term4311, term4311.getClass(), "namespaceMap", term4313);
        setField(term4311, term4311.getClass(), "reverseMap", term4314);
        setField(term4311, term4311.getClass(), "pointer", null);
        setBooleanField(term4311, term4311.getClass(), "sealed", false);
        setField(term4310, term4310.getClass(), "parent", term4311);
        setField(term4310, term4310.getClass(), "namespaceMap", term4315);
        setField(term4310, term4310.getClass(), "reverseMap", term4316);
        setField(term4310, term4310.getClass(), "pointer", null);
        setBooleanField(term4310, term4310.getClass(), "sealed", false);
        setField(term4309, term4309.getClass(), "parent", term4310);
        setField(term4309, term4309.getClass(), "namespaceMap", term4317);
        setField(term4309, term4309.getClass(), "reverseMap", term4318);
        setField(term4309, term4309.getClass(), "pointer", null);
        setBooleanField(term4309, term4309.getClass(), "sealed", false);
        setField(term4303, term4303.getClass(), "localNamespaceResolver", term4309);
        setIntField(term4303, term4303.getClass(), "index", 568599855);
        setBooleanField(term4303, term4303.getClass(), "attribute", false);
        setField(term4319, term4319.getClass(), "parent", null);
        setField(term4319, term4319.getClass(), "namespaceMap", term4320);
        setField(term4319, term4319.getClass(), "reverseMap", term4321);
        setField(term4319, term4319.getClass(), "pointer", null);
        setBooleanField(term4319, term4319.getClass(), "sealed", false);
        setField(term4303, term4303.getClass(), "namespaceResolver", term4319);
        setField(term4303, term4303.getClass(), "exceptionHandler", null);
        setField(term4303, term4303.getClass(), "rootNode", null);
        setField(term4303, term4303.getClass(), "parent", null);
        setField(term4303, term4303.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTest");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "testNode", argTypes, term59, args);
        assertTrue(recursiveEquals(term59, term4303));
    }

};


