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
     Object term3929;

    public DOMNodePointer_testNode_76971894946() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term60 = new HashMap();
        HashMap term97 = new HashMap();
        HashMap term102 = new HashMap();
        HashMap term108 = new HashMap();
        HashMap term113 = new HashMap();
        HashMap term119 = new HashMap();
        HashMap term124 = new HashMap();
        term59 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term91 = newInstance(Class.forName("java.lang.Object"));
        Object term92 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term93 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term94 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term95 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term59, term59.getClass(), "node", null);
        setField(term59, term59.getClass(), "namespaces", term60);
        setField(term59, term59.getClass(), "defaultNamespace", "sjlJAEtRrb");
        setField(term59, term59.getClass(), "id", "MuLcgQHgqz");
        setIntField(term59, term59.getClass(), "index", 568599855);
        setBooleanField(term59, term59.getClass(), "attribute", false);
        setField(term59, term59.getClass(), "rootNode", term91);
        setField(term95, term95.getClass(), "parent", null);
        setField(term95, term95.getClass(), "namespaceMap", null);
        setField(term95, term95.getClass(), "reverseMap", null);
        setField(term95, term95.getClass(), "pointer", null);
        setField(term95, term95.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term95, term95.getClass(), "sealed", false);
        setField(term94, term94.getClass(), "parent", term95);
        setField(term94, term94.getClass(), "namespaceMap", term97);
        setField(term94, term94.getClass(), "reverseMap", term102);
        setField(term94, term94.getClass(), "pointer", null);
        setField(term94, term94.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term94, term94.getClass(), "sealed", false);
        setField(term93, term93.getClass(), "parent", term94);
        setField(term93, term93.getClass(), "namespaceMap", term108);
        setField(term93, term93.getClass(), "reverseMap", term113);
        setField(term93, term93.getClass(), "pointer", null);
        setField(term93, term93.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term93, term93.getClass(), "sealed", false);
        setField(term92, term92.getClass(), "parent", term93);
        setField(term92, term92.getClass(), "namespaceMap", term119);
        setField(term92, term92.getClass(), "reverseMap", term124);
        setField(term92, term92.getClass(), "pointer", null);
        setField(term92, term92.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term92, term92.getClass(), "sealed", false);
        setField(term59, term59.getClass(), "namespaceResolver", term92);
        setField(term59, term59.getClass(), "parent", null);
        setField(term59, term59.getClass(), "locale", null);
        HashMap term3930 = new HashMap();
        HashMap term3940 = new HashMap();
        HashMap term3941 = new HashMap();
        HashMap term3942 = new HashMap();
        HashMap term3943 = new HashMap();
        HashMap term3944 = new HashMap();
        HashMap term3945 = new HashMap();
        term3929 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term3935 = newInstance(Class.forName("java.lang.Object"));
        Object term3936 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3937 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3938 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3939 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term3929, term3929.getClass(), "node", null);
        setField(term3929, term3929.getClass(), "namespaces", term3930);
        setField(term3929, term3929.getClass(), "defaultNamespace", "sjlJAEtRrb");
        setField(term3929, term3929.getClass(), "id", "MuLcgQHgqz");
        setIntField(term3929, term3929.getClass(), "index", 568599855);
        setBooleanField(term3929, term3929.getClass(), "attribute", false);
        setField(term3929, term3929.getClass(), "rootNode", term3935);
        setField(term3939, term3939.getClass(), "parent", null);
        setField(term3939, term3939.getClass(), "namespaceMap", null);
        setField(term3939, term3939.getClass(), "reverseMap", null);
        setField(term3939, term3939.getClass(), "pointer", null);
        setField(term3939, term3939.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3939, term3939.getClass(), "sealed", false);
        setField(term3938, term3938.getClass(), "parent", term3939);
        setField(term3938, term3938.getClass(), "namespaceMap", term3940);
        setField(term3938, term3938.getClass(), "reverseMap", term3941);
        setField(term3938, term3938.getClass(), "pointer", null);
        setField(term3938, term3938.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3938, term3938.getClass(), "sealed", false);
        setField(term3937, term3937.getClass(), "parent", term3938);
        setField(term3937, term3937.getClass(), "namespaceMap", term3942);
        setField(term3937, term3937.getClass(), "reverseMap", term3943);
        setField(term3937, term3937.getClass(), "pointer", null);
        setField(term3937, term3937.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3937, term3937.getClass(), "sealed", false);
        setField(term3936, term3936.getClass(), "parent", term3937);
        setField(term3936, term3936.getClass(), "namespaceMap", term3944);
        setField(term3936, term3936.getClass(), "reverseMap", term3945);
        setField(term3936, term3936.getClass(), "pointer", null);
        setField(term3936, term3936.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3936, term3936.getClass(), "sealed", false);
        setField(term3929, term3929.getClass(), "namespaceResolver", term3936);
        setField(term3929, term3929.getClass(), "parent", null);
        setField(term3929, term3929.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTest");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "testNode", argTypes, term59, args);
        assertTrue(recursiveEquals(term59, term3929));
    }

};


