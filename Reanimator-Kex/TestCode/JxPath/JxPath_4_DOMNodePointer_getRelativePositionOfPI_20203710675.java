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

public class DOMNodePointer_getRelativePositionOfPI_20203710675 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2924;

    public DOMNodePointer_getRelativePositionOfPI_20203710675() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2925 = new HashMap();
        HashMap term2962 = new HashMap();
        HashMap term2967 = new HashMap();
        HashMap term2973 = new HashMap();
        HashMap term2978 = new HashMap();
        HashMap term2984 = new HashMap();
        HashMap term2989 = new HashMap();
        term2924 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term2956 = newInstance(Class.forName("java.lang.Object"));
        Object term2957 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2958 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2959 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2960 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term2924, term2924.getClass(), "node", null);
        setField(term2924, term2924.getClass(), "namespaces", term2925);
        setField(term2924, term2924.getClass(), "defaultNamespace", "KoyGrUJeJW");
        setField(term2924, term2924.getClass(), "id", "HqBOwkVqjD");
        setIntField(term2924, term2924.getClass(), "index", -244121226);
        setBooleanField(term2924, term2924.getClass(), "attribute", true);
        setField(term2924, term2924.getClass(), "rootNode", term2956);
        setField(term2960, term2960.getClass(), "parent", null);
        setField(term2960, term2960.getClass(), "namespaceMap", null);
        setField(term2960, term2960.getClass(), "reverseMap", null);
        setField(term2960, term2960.getClass(), "pointer", null);
        setField(term2960, term2960.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2960, term2960.getClass(), "sealed", false);
        setField(term2959, term2959.getClass(), "parent", term2960);
        setField(term2959, term2959.getClass(), "namespaceMap", term2962);
        setField(term2959, term2959.getClass(), "reverseMap", term2967);
        setField(term2959, term2959.getClass(), "pointer", null);
        setField(term2959, term2959.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2959, term2959.getClass(), "sealed", false);
        setField(term2958, term2958.getClass(), "parent", term2959);
        setField(term2958, term2958.getClass(), "namespaceMap", term2973);
        setField(term2958, term2958.getClass(), "reverseMap", term2978);
        setField(term2958, term2958.getClass(), "pointer", null);
        setField(term2958, term2958.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2958, term2958.getClass(), "sealed", false);
        setField(term2957, term2957.getClass(), "parent", term2958);
        setField(term2957, term2957.getClass(), "namespaceMap", term2984);
        setField(term2957, term2957.getClass(), "reverseMap", term2989);
        setField(term2957, term2957.getClass(), "pointer", null);
        setField(term2957, term2957.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2957, term2957.getClass(), "sealed", false);
        setField(term2924, term2924.getClass(), "namespaceResolver", term2957);
        setField(term2924, term2924.getClass(), "parent", null);
        setField(term2924, term2924.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MAcUBcBckh";
        try {
            callMethod(klass, "getRelativePositionOfPI", argTypes, term2924, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


