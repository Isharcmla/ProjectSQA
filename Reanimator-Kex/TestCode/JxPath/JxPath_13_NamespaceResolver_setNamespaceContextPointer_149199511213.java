package org.apache.commons.jxpath.ri;

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
import static org.apache.commons.jxpath.ri.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.jxpath.ri.EqualityUtils.*;
import java.lang.Object;
import java.util.HashMap;

public class NamespaceResolver_setNamespaceContextPointer_149199511213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145;
     Object term801;

    public NamespaceResolver_setNamespaceContextPointer_149199511213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term151 = new HashMap();
        HashMap term156 = new HashMap();
        HashMap term162 = new HashMap();
        HashMap term167 = new HashMap();
        HashMap term173 = new HashMap();
        HashMap term178 = new HashMap();
        HashMap term184 = new HashMap();
        HashMap term189 = new HashMap();
        term145 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term146 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term147 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term148 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term149 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term149, term149.getClass(), "parent", null);
        setField(term149, term149.getClass(), "namespaceMap", null);
        setField(term149, term149.getClass(), "reverseMap", null);
        setField(term149, term149.getClass(), "pointer", null);
        setBooleanField(term149, term149.getClass(), "sealed", false);
        setField(term148, term148.getClass(), "parent", term149);
        setField(term148, term148.getClass(), "namespaceMap", term151);
        setField(term148, term148.getClass(), "reverseMap", term156);
        setField(term148, term148.getClass(), "pointer", null);
        setBooleanField(term148, term148.getClass(), "sealed", false);
        setField(term147, term147.getClass(), "parent", term148);
        setField(term147, term147.getClass(), "namespaceMap", term162);
        setField(term147, term147.getClass(), "reverseMap", term167);
        setField(term147, term147.getClass(), "pointer", null);
        setBooleanField(term147, term147.getClass(), "sealed", false);
        setField(term146, term146.getClass(), "parent", term147);
        setField(term146, term146.getClass(), "namespaceMap", term173);
        setField(term146, term146.getClass(), "reverseMap", term178);
        setField(term146, term146.getClass(), "pointer", null);
        setBooleanField(term146, term146.getClass(), "sealed", false);
        setField(term145, term145.getClass(), "parent", term146);
        setField(term145, term145.getClass(), "namespaceMap", term184);
        setField(term145, term145.getClass(), "reverseMap", term189);
        setField(term145, term145.getClass(), "pointer", null);
        setBooleanField(term145, term145.getClass(), "sealed", false);
        HashMap term806 = new HashMap();
        HashMap term807 = new HashMap();
        HashMap term808 = new HashMap();
        HashMap term809 = new HashMap();
        HashMap term810 = new HashMap();
        HashMap term811 = new HashMap();
        HashMap term812 = new HashMap();
        HashMap term813 = new HashMap();
        term801 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term802 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term803 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term804 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term805 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term805, term805.getClass(), "parent", null);
        setField(term805, term805.getClass(), "namespaceMap", null);
        setField(term805, term805.getClass(), "reverseMap", null);
        setField(term805, term805.getClass(), "pointer", null);
        setBooleanField(term805, term805.getClass(), "sealed", false);
        setField(term804, term804.getClass(), "parent", term805);
        setField(term804, term804.getClass(), "namespaceMap", term806);
        setField(term804, term804.getClass(), "reverseMap", term807);
        setField(term804, term804.getClass(), "pointer", null);
        setBooleanField(term804, term804.getClass(), "sealed", false);
        setField(term803, term803.getClass(), "parent", term804);
        setField(term803, term803.getClass(), "namespaceMap", term808);
        setField(term803, term803.getClass(), "reverseMap", term809);
        setField(term803, term803.getClass(), "pointer", null);
        setBooleanField(term803, term803.getClass(), "sealed", false);
        setField(term802, term802.getClass(), "parent", term803);
        setField(term802, term802.getClass(), "namespaceMap", term810);
        setField(term802, term802.getClass(), "reverseMap", term811);
        setField(term802, term802.getClass(), "pointer", null);
        setBooleanField(term802, term802.getClass(), "sealed", false);
        setField(term801, term801.getClass(), "parent", term802);
        setField(term801, term801.getClass(), "namespaceMap", term812);
        setField(term801, term801.getClass(), "reverseMap", term813);
        setField(term801, term801.getClass(), "pointer", null);
        setBooleanField(term801, term801.getClass(), "sealed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setNamespaceContextPointer", argTypes, term145, args);
        assertTrue(recursiveEquals(term145, term801));
    }

};


