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

public class DOMNodePointer_testNode_76971894946 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59;
     Object term4236;

    public DOMNodePointer_testNode_76971894946() {
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
        Object term141 = newInstance(Class.forName("java.lang.Object"));
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
        setField(term59, term59.getClass(), "rootNode", term141);
        setField(term59, term59.getClass(), "parent", null);
        setField(term59, term59.getClass(), "locale", null);
        HashMap term4237 = new HashMap();
        HashMap term4246 = new HashMap();
        HashMap term4247 = new HashMap();
        HashMap term4248 = new HashMap();
        HashMap term4249 = new HashMap();
        HashMap term4250 = new HashMap();
        HashMap term4251 = new HashMap();
        HashMap term4253 = new HashMap();
        HashMap term4254 = new HashMap();
        term4236 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term4242 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term4243 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term4244 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term4245 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term4252 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term4255 = newInstance(Class.forName("java.lang.Object"));
        setField(term4236, term4236.getClass(), "node", null);
        setField(term4236, term4236.getClass(), "namespaces", term4237);
        setField(term4236, term4236.getClass(), "defaultNamespace", "sjlJAEtRrb");
        setField(term4236, term4236.getClass(), "id", "MuLcgQHgqz");
        setField(term4245, term4245.getClass(), "parent", null);
        setField(term4245, term4245.getClass(), "namespaceMap", null);
        setField(term4245, term4245.getClass(), "reverseMap", null);
        setField(term4245, term4245.getClass(), "pointer", null);
        setBooleanField(term4245, term4245.getClass(), "sealed", false);
        setField(term4244, term4244.getClass(), "parent", term4245);
        setField(term4244, term4244.getClass(), "namespaceMap", term4246);
        setField(term4244, term4244.getClass(), "reverseMap", term4247);
        setField(term4244, term4244.getClass(), "pointer", null);
        setBooleanField(term4244, term4244.getClass(), "sealed", false);
        setField(term4243, term4243.getClass(), "parent", term4244);
        setField(term4243, term4243.getClass(), "namespaceMap", term4248);
        setField(term4243, term4243.getClass(), "reverseMap", term4249);
        setField(term4243, term4243.getClass(), "pointer", null);
        setBooleanField(term4243, term4243.getClass(), "sealed", false);
        setField(term4242, term4242.getClass(), "parent", term4243);
        setField(term4242, term4242.getClass(), "namespaceMap", term4250);
        setField(term4242, term4242.getClass(), "reverseMap", term4251);
        setField(term4242, term4242.getClass(), "pointer", null);
        setBooleanField(term4242, term4242.getClass(), "sealed", false);
        setField(term4236, term4236.getClass(), "localNamespaceResolver", term4242);
        setIntField(term4236, term4236.getClass(), "index", 568599855);
        setBooleanField(term4236, term4236.getClass(), "attribute", false);
        setField(term4252, term4252.getClass(), "parent", null);
        setField(term4252, term4252.getClass(), "namespaceMap", term4253);
        setField(term4252, term4252.getClass(), "reverseMap", term4254);
        setField(term4252, term4252.getClass(), "pointer", null);
        setBooleanField(term4252, term4252.getClass(), "sealed", false);
        setField(term4236, term4236.getClass(), "namespaceResolver", term4252);
        setField(term4236, term4236.getClass(), "rootNode", term4255);
        setField(term4236, term4236.getClass(), "parent", null);
        setField(term4236, term4236.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTest");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "testNode", argTypes, term59, args);
        assertTrue(recursiveEquals(term59, term4236));
    }

};


