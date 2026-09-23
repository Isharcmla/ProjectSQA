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
import java.lang.NullPointerException;
import static org.apache.commons.jxpath.ri.model.dom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;

public class DOMNodePointer_getAbstractFactory_214011858688 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3844;

    public DOMNodePointer_getAbstractFactory_214011858688() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3845 = new HashMap();
        HashMap term3879 = new HashMap();
        HashMap term3884 = new HashMap();
        HashMap term3890 = new HashMap();
        HashMap term3895 = new HashMap();
        HashMap term3901 = new HashMap();
        HashMap term3906 = new HashMap();
        HashMap term3916 = new HashMap();
        term3844 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term3874 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3875 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3876 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3877 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3914 = newInstance(Class.forName("java.lang.Object"));
        Object term3915 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term3844, term3844.getClass(), "node", null);
        setField(term3844, term3844.getClass(), "namespaces", term3845);
        setField(term3844, term3844.getClass(), "defaultNamespace", "jSpAteRute");
        setField(term3844, term3844.getClass(), "id", "swZVeJAxjt");
        setField(term3877, term3877.getClass(), "parent", null);
        setField(term3877, term3877.getClass(), "namespaceMap", null);
        setField(term3877, term3877.getClass(), "reverseMap", null);
        setField(term3877, term3877.getClass(), "pointer", null);
        setBooleanField(term3877, term3877.getClass(), "sealed", false);
        setField(term3876, term3876.getClass(), "parent", term3877);
        setField(term3876, term3876.getClass(), "namespaceMap", term3879);
        setField(term3876, term3876.getClass(), "reverseMap", term3884);
        setField(term3876, term3876.getClass(), "pointer", null);
        setBooleanField(term3876, term3876.getClass(), "sealed", false);
        setField(term3875, term3875.getClass(), "parent", term3876);
        setField(term3875, term3875.getClass(), "namespaceMap", term3890);
        setField(term3875, term3875.getClass(), "reverseMap", term3895);
        setField(term3875, term3875.getClass(), "pointer", null);
        setBooleanField(term3875, term3875.getClass(), "sealed", false);
        setField(term3874, term3874.getClass(), "parent", term3875);
        setField(term3874, term3874.getClass(), "namespaceMap", term3901);
        setField(term3874, term3874.getClass(), "reverseMap", term3906);
        setField(term3874, term3874.getClass(), "pointer", null);
        setBooleanField(term3874, term3874.getClass(), "sealed", false);
        setField(term3844, term3844.getClass(), "localNamespaceResolver", term3874);
        setIntField(term3844, term3844.getClass(), "index", -1530420153);
        setBooleanField(term3844, term3844.getClass(), "attribute", true);
        setField(term3844, term3844.getClass(), "rootNode", term3914);
        setField(term3915, term3915.getClass(), "parent", null);
        setField(term3915, term3915.getClass(), "namespaceMap", term3916);
        setField(term3915, term3915.getClass(), "reverseMap", null);
        setField(term3915, term3915.getClass(), "pointer", null);
        setBooleanField(term3915, term3915.getClass(), "sealed", false);
        setField(term3844, term3844.getClass(), "namespaceResolver", term3915);
        setField(term3844, term3844.getClass(), "parent", null);
        setField(term3844, term3844.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.JXPathContext");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getAbstractFactory", argTypes, term3844, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


