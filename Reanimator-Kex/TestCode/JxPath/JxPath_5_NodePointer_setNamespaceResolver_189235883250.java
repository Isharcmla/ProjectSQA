package org.apache.commons.jxpath.ri.model;

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
import static org.apache.commons.jxpath.ri.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;

public class NodePointer_setNamespaceResolver_189235883250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157;

    public NodePointer_setNamespaceResolver_189235883250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term163 = new HashMap();
        HashMap term168 = new HashMap();
        HashMap term174 = new HashMap();
        HashMap term179 = new HashMap();
        HashMap term185 = new HashMap();
        HashMap term190 = new HashMap();
        HashMap term196 = new HashMap();
        HashMap term201 = new HashMap();
        term157 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term158 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term159 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term160 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term161 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term161, term161.getClass(), "parent", null);
        setField(term161, term161.getClass(), "namespaceMap", null);
        setField(term161, term161.getClass(), "reverseMap", null);
        setField(term161, term161.getClass(), "pointer", null);
        setBooleanField(term161, term161.getClass(), "sealed", false);
        setField(term160, term160.getClass(), "parent", term161);
        setField(term160, term160.getClass(), "namespaceMap", term163);
        setField(term160, term160.getClass(), "reverseMap", term168);
        setField(term160, term160.getClass(), "pointer", null);
        setBooleanField(term160, term160.getClass(), "sealed", false);
        setField(term159, term159.getClass(), "parent", term160);
        setField(term159, term159.getClass(), "namespaceMap", term174);
        setField(term159, term159.getClass(), "reverseMap", term179);
        setField(term159, term159.getClass(), "pointer", null);
        setBooleanField(term159, term159.getClass(), "sealed", false);
        setField(term158, term158.getClass(), "parent", term159);
        setField(term158, term158.getClass(), "namespaceMap", term185);
        setField(term158, term158.getClass(), "reverseMap", term190);
        setField(term158, term158.getClass(), "pointer", null);
        setBooleanField(term158, term158.getClass(), "sealed", false);
        setField(term157, term157.getClass(), "parent", term158);
        setField(term157, term157.getClass(), "namespaceMap", term196);
        setField(term157, term157.getClass(), "reverseMap", term201);
        setField(term157, term157.getClass(), "pointer", null);
        setBooleanField(term157, term157.getClass(), "sealed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver");
        Object[] args = new Object[1];
        args[0] = term157;
        try {
            callMethod(klass, "setNamespaceResolver", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


