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

public class DOMNodePointer_testNode_76971894948 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59;
     Object term4279;

    public DOMNodePointer_testNode_76971894948() {
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
        HashMap term131 = new HashMap();
        term59 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term89 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term90 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term91 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term92 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term129 = newInstance(Class.forName("java.lang.Object"));
        Object term130 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
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
        setField(term59, term59.getClass(), "rootNode", term129);
        setField(term130, term130.getClass(), "parent", null);
        setField(term130, term130.getClass(), "namespaceMap", term131);
        setField(term130, term130.getClass(), "reverseMap", null);
        setField(term130, term130.getClass(), "pointer", null);
        setBooleanField(term130, term130.getClass(), "sealed", false);
        setField(term59, term59.getClass(), "namespaceResolver", term130);
        setField(term59, term59.getClass(), "parent", null);
        setField(term59, term59.getClass(), "locale", null);
        HashMap term4280 = new HashMap();
        HashMap term4289 = new HashMap();
        HashMap term4290 = new HashMap();
        HashMap term4291 = new HashMap();
        HashMap term4292 = new HashMap();
        HashMap term4293 = new HashMap();
        HashMap term4294 = new HashMap();
        HashMap term4297 = new HashMap();
        term4279 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term4285 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term4286 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term4287 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term4288 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term4295 = newInstance(Class.forName("java.lang.Object"));
        Object term4296 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term4279, term4279.getClass(), "node", null);
        setField(term4279, term4279.getClass(), "namespaces", term4280);
        setField(term4279, term4279.getClass(), "defaultNamespace", "sjlJAEtRrb");
        setField(term4279, term4279.getClass(), "id", "MuLcgQHgqz");
        setField(term4288, term4288.getClass(), "parent", null);
        setField(term4288, term4288.getClass(), "namespaceMap", null);
        setField(term4288, term4288.getClass(), "reverseMap", null);
        setField(term4288, term4288.getClass(), "pointer", null);
        setBooleanField(term4288, term4288.getClass(), "sealed", false);
        setField(term4287, term4287.getClass(), "parent", term4288);
        setField(term4287, term4287.getClass(), "namespaceMap", term4289);
        setField(term4287, term4287.getClass(), "reverseMap", term4290);
        setField(term4287, term4287.getClass(), "pointer", null);
        setBooleanField(term4287, term4287.getClass(), "sealed", false);
        setField(term4286, term4286.getClass(), "parent", term4287);
        setField(term4286, term4286.getClass(), "namespaceMap", term4291);
        setField(term4286, term4286.getClass(), "reverseMap", term4292);
        setField(term4286, term4286.getClass(), "pointer", null);
        setBooleanField(term4286, term4286.getClass(), "sealed", false);
        setField(term4285, term4285.getClass(), "parent", term4286);
        setField(term4285, term4285.getClass(), "namespaceMap", term4293);
        setField(term4285, term4285.getClass(), "reverseMap", term4294);
        setField(term4285, term4285.getClass(), "pointer", null);
        setBooleanField(term4285, term4285.getClass(), "sealed", false);
        setField(term4279, term4279.getClass(), "localNamespaceResolver", term4285);
        setIntField(term4279, term4279.getClass(), "index", 568599855);
        setBooleanField(term4279, term4279.getClass(), "attribute", false);
        setField(term4279, term4279.getClass(), "rootNode", term4295);
        setField(term4296, term4296.getClass(), "parent", null);
        setField(term4296, term4296.getClass(), "namespaceMap", term4297);
        setField(term4296, term4296.getClass(), "reverseMap", null);
        setField(term4296, term4296.getClass(), "pointer", null);
        setBooleanField(term4296, term4296.getClass(), "sealed", false);
        setField(term4279, term4279.getClass(), "namespaceResolver", term4296);
        setField(term4279, term4279.getClass(), "parent", null);
        setField(term4279, term4279.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTest");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "testNode", argTypes, term59, args);
        assertTrue(recursiveEquals(term59, term4279));
    }

};


