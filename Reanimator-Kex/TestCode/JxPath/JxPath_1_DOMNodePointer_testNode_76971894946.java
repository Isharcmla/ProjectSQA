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
     Object term3841;

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
        HashMap term3842 = new HashMap();
        HashMap term3852 = new HashMap();
        HashMap term3853 = new HashMap();
        HashMap term3854 = new HashMap();
        HashMap term3855 = new HashMap();
        HashMap term3856 = new HashMap();
        HashMap term3857 = new HashMap();
        term3841 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term3847 = newInstance(Class.forName("java.lang.Object"));
        Object term3848 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3849 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3850 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3851 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term3841, term3841.getClass(), "node", null);
        setField(term3841, term3841.getClass(), "namespaces", term3842);
        setField(term3841, term3841.getClass(), "defaultNamespace", "sjlJAEtRrb");
        setField(term3841, term3841.getClass(), "id", "MuLcgQHgqz");
        setIntField(term3841, term3841.getClass(), "index", 568599855);
        setBooleanField(term3841, term3841.getClass(), "attribute", false);
        setField(term3841, term3841.getClass(), "rootNode", term3847);
        setField(term3851, term3851.getClass(), "parent", null);
        setField(term3851, term3851.getClass(), "namespaceMap", null);
        setField(term3851, term3851.getClass(), "reverseMap", null);
        setField(term3851, term3851.getClass(), "pointer", null);
        setField(term3851, term3851.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3851, term3851.getClass(), "sealed", false);
        setField(term3850, term3850.getClass(), "parent", term3851);
        setField(term3850, term3850.getClass(), "namespaceMap", term3852);
        setField(term3850, term3850.getClass(), "reverseMap", term3853);
        setField(term3850, term3850.getClass(), "pointer", null);
        setField(term3850, term3850.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3850, term3850.getClass(), "sealed", false);
        setField(term3849, term3849.getClass(), "parent", term3850);
        setField(term3849, term3849.getClass(), "namespaceMap", term3854);
        setField(term3849, term3849.getClass(), "reverseMap", term3855);
        setField(term3849, term3849.getClass(), "pointer", null);
        setField(term3849, term3849.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3849, term3849.getClass(), "sealed", false);
        setField(term3848, term3848.getClass(), "parent", term3849);
        setField(term3848, term3848.getClass(), "namespaceMap", term3856);
        setField(term3848, term3848.getClass(), "reverseMap", term3857);
        setField(term3848, term3848.getClass(), "pointer", null);
        setField(term3848, term3848.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3848, term3848.getClass(), "sealed", false);
        setField(term3841, term3841.getClass(), "namespaceResolver", term3848);
        setField(term3841, term3841.getClass(), "parent", null);
        setField(term3841, term3841.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTest");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "testNode", argTypes, term59, args);
        assertTrue(recursiveEquals(term59, term3841));
    }

};
