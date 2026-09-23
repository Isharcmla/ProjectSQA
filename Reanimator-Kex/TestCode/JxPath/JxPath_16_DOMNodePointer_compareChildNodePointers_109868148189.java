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

public class DOMNodePointer_compareChildNodePointers_109868148189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3942;

    public DOMNodePointer_compareChildNodePointers_109868148189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3943 = new HashMap();
        HashMap term3977 = new HashMap();
        HashMap term3982 = new HashMap();
        HashMap term3988 = new HashMap();
        HashMap term3993 = new HashMap();
        HashMap term3999 = new HashMap();
        HashMap term4004 = new HashMap();
        HashMap term4014 = new HashMap();
        term3942 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term3972 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3973 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3974 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3975 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term4012 = newInstance(Class.forName("java.lang.Object"));
        Object term4013 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term3942, term3942.getClass(), "node", null);
        setField(term3942, term3942.getClass(), "namespaces", term3943);
        setField(term3942, term3942.getClass(), "defaultNamespace", "xOcJIiQQDu");
        setField(term3942, term3942.getClass(), "id", "GVizqqzXpy");
        setField(term3975, term3975.getClass(), "parent", null);
        setField(term3975, term3975.getClass(), "namespaceMap", null);
        setField(term3975, term3975.getClass(), "reverseMap", null);
        setField(term3975, term3975.getClass(), "pointer", null);
        setBooleanField(term3975, term3975.getClass(), "sealed", false);
        setField(term3974, term3974.getClass(), "parent", term3975);
        setField(term3974, term3974.getClass(), "namespaceMap", term3977);
        setField(term3974, term3974.getClass(), "reverseMap", term3982);
        setField(term3974, term3974.getClass(), "pointer", null);
        setBooleanField(term3974, term3974.getClass(), "sealed", false);
        setField(term3973, term3973.getClass(), "parent", term3974);
        setField(term3973, term3973.getClass(), "namespaceMap", term3988);
        setField(term3973, term3973.getClass(), "reverseMap", term3993);
        setField(term3973, term3973.getClass(), "pointer", null);
        setBooleanField(term3973, term3973.getClass(), "sealed", false);
        setField(term3972, term3972.getClass(), "parent", term3973);
        setField(term3972, term3972.getClass(), "namespaceMap", term3999);
        setField(term3972, term3972.getClass(), "reverseMap", term4004);
        setField(term3972, term3972.getClass(), "pointer", null);
        setBooleanField(term3972, term3972.getClass(), "sealed", false);
        setField(term3942, term3942.getClass(), "localNamespaceResolver", term3972);
        setIntField(term3942, term3942.getClass(), "index", -469968304);
        setBooleanField(term3942, term3942.getClass(), "attribute", true);
        setField(term3942, term3942.getClass(), "rootNode", term4012);
        setField(term4013, term4013.getClass(), "parent", null);
        setField(term4013, term4013.getClass(), "namespaceMap", term4014);
        setField(term4013, term4013.getClass(), "reverseMap", null);
        setField(term4013, term4013.getClass(), "pointer", null);
        setBooleanField(term4013, term4013.getClass(), "sealed", false);
        setField(term3942, term3942.getClass(), "namespaceResolver", term4013);
        setField(term3942, term3942.getClass(), "parent", null);
        setField(term3942, term3942.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "compareChildNodePointers", argTypes, term3942, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


