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
     Object term3951;

    public DOMNodePointer_testNode_76971894947() {
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
        setBooleanField(term95, term95.getClass(), "sealed", false);
        setField(term94, term94.getClass(), "parent", term95);
        setField(term94, term94.getClass(), "namespaceMap", term97);
        setField(term94, term94.getClass(), "reverseMap", term102);
        setField(term94, term94.getClass(), "pointer", null);
        setBooleanField(term94, term94.getClass(), "sealed", false);
        setField(term93, term93.getClass(), "parent", term94);
        setField(term93, term93.getClass(), "namespaceMap", term108);
        setField(term93, term93.getClass(), "reverseMap", term113);
        setField(term93, term93.getClass(), "pointer", null);
        setBooleanField(term93, term93.getClass(), "sealed", false);
        setField(term92, term92.getClass(), "parent", term93);
        setField(term92, term92.getClass(), "namespaceMap", term119);
        setField(term92, term92.getClass(), "reverseMap", term124);
        setField(term92, term92.getClass(), "pointer", null);
        setBooleanField(term92, term92.getClass(), "sealed", false);
        setField(term59, term59.getClass(), "namespaceResolver", term92);
        setField(term59, term59.getClass(), "parent", null);
        setField(term59, term59.getClass(), "locale", null);
        HashMap term3952 = new HashMap();
        HashMap term3962 = new HashMap();
        HashMap term3963 = new HashMap();
        HashMap term3964 = new HashMap();
        HashMap term3965 = new HashMap();
        HashMap term3966 = new HashMap();
        HashMap term3967 = new HashMap();
        term3951 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term3957 = newInstance(Class.forName("java.lang.Object"));
        Object term3958 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3959 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3960 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3961 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term3951, term3951.getClass(), "node", null);
        setField(term3951, term3951.getClass(), "namespaces", term3952);
        setField(term3951, term3951.getClass(), "defaultNamespace", "sjlJAEtRrb");
        setField(term3951, term3951.getClass(), "id", "MuLcgQHgqz");
        setIntField(term3951, term3951.getClass(), "index", 568599855);
        setBooleanField(term3951, term3951.getClass(), "attribute", false);
        setField(term3951, term3951.getClass(), "rootNode", term3957);
        setField(term3961, term3961.getClass(), "parent", null);
        setField(term3961, term3961.getClass(), "namespaceMap", null);
        setField(term3961, term3961.getClass(), "reverseMap", null);
        setField(term3961, term3961.getClass(), "pointer", null);
        setBooleanField(term3961, term3961.getClass(), "sealed", false);
        setField(term3960, term3960.getClass(), "parent", term3961);
        setField(term3960, term3960.getClass(), "namespaceMap", term3962);
        setField(term3960, term3960.getClass(), "reverseMap", term3963);
        setField(term3960, term3960.getClass(), "pointer", null);
        setBooleanField(term3960, term3960.getClass(), "sealed", false);
        setField(term3959, term3959.getClass(), "parent", term3960);
        setField(term3959, term3959.getClass(), "namespaceMap", term3964);
        setField(term3959, term3959.getClass(), "reverseMap", term3965);
        setField(term3959, term3959.getClass(), "pointer", null);
        setBooleanField(term3959, term3959.getClass(), "sealed", false);
        setField(term3958, term3958.getClass(), "parent", term3959);
        setField(term3958, term3958.getClass(), "namespaceMap", term3966);
        setField(term3958, term3958.getClass(), "reverseMap", term3967);
        setField(term3958, term3958.getClass(), "pointer", null);
        setBooleanField(term3958, term3958.getClass(), "sealed", false);
        setField(term3951, term3951.getClass(), "namespaceResolver", term3958);
        setField(term3951, term3951.getClass(), "parent", null);
        setField(term3951, term3951.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTest");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "testNode", argTypes, term59, args);
        assertTrue(recursiveEquals(term59, term3951));
    }

};


