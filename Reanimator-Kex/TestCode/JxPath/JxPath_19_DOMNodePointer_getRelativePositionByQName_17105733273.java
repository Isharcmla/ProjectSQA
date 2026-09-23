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

public class DOMNodePointer_getRelativePositionByQName_17105733273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2939;

    public DOMNodePointer_getRelativePositionByQName_17105733273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2940 = new HashMap();
        HashMap term2974 = new HashMap();
        HashMap term2979 = new HashMap();
        HashMap term2985 = new HashMap();
        HashMap term2990 = new HashMap();
        HashMap term2996 = new HashMap();
        HashMap term3001 = new HashMap();
        HashMap term3010 = new HashMap();
        HashMap term3015 = new HashMap();
        term2939 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term2969 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2970 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2971 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2972 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3009 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3021 = newInstance(Class.forName("java.lang.Object"));
        setField(term2939, term2939.getClass(), "node", null);
        setField(term2939, term2939.getClass(), "namespaces", term2940);
        setField(term2939, term2939.getClass(), "defaultNamespace", "TJmVBGfTML");
        setField(term2939, term2939.getClass(), "id", "tPlsykYBqO");
        setField(term2972, term2972.getClass(), "parent", null);
        setField(term2972, term2972.getClass(), "namespaceMap", null);
        setField(term2972, term2972.getClass(), "reverseMap", null);
        setField(term2972, term2972.getClass(), "pointer", null);
        setBooleanField(term2972, term2972.getClass(), "sealed", false);
        setField(term2971, term2971.getClass(), "parent", term2972);
        setField(term2971, term2971.getClass(), "namespaceMap", term2974);
        setField(term2971, term2971.getClass(), "reverseMap", term2979);
        setField(term2971, term2971.getClass(), "pointer", null);
        setBooleanField(term2971, term2971.getClass(), "sealed", false);
        setField(term2970, term2970.getClass(), "parent", term2971);
        setField(term2970, term2970.getClass(), "namespaceMap", term2985);
        setField(term2970, term2970.getClass(), "reverseMap", term2990);
        setField(term2970, term2970.getClass(), "pointer", null);
        setBooleanField(term2970, term2970.getClass(), "sealed", false);
        setField(term2969, term2969.getClass(), "parent", term2970);
        setField(term2969, term2969.getClass(), "namespaceMap", term2996);
        setField(term2969, term2969.getClass(), "reverseMap", term3001);
        setField(term2969, term2969.getClass(), "pointer", null);
        setBooleanField(term2969, term2969.getClass(), "sealed", false);
        setField(term2939, term2939.getClass(), "localNamespaceResolver", term2969);
        setIntField(term2939, term2939.getClass(), "index", 590364439);
        setBooleanField(term2939, term2939.getClass(), "attribute", false);
        setField(term3009, term3009.getClass(), "parent", null);
        setField(term3009, term3009.getClass(), "namespaceMap", term3010);
        setField(term3009, term3009.getClass(), "reverseMap", term3015);
        setField(term3009, term3009.getClass(), "pointer", null);
        setBooleanField(term3009, term3009.getClass(), "sealed", false);
        setField(term2939, term2939.getClass(), "namespaceResolver", term3009);
        setField(term2939, term2939.getClass(), "rootNode", term3021);
        setField(term2939, term2939.getClass(), "parent", null);
        setField(term2939, term2939.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getRelativePositionByQName", argTypes, term2939, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


