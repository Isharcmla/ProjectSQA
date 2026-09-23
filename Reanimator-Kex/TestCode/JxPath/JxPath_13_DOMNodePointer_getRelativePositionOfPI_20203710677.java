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

public class DOMNodePointer_getRelativePositionOfPI_20203710677 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2946;

    public DOMNodePointer_getRelativePositionOfPI_20203710677() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2947 = new HashMap();
        HashMap term2984 = new HashMap();
        HashMap term2989 = new HashMap();
        HashMap term2995 = new HashMap();
        HashMap term3000 = new HashMap();
        HashMap term3006 = new HashMap();
        HashMap term3011 = new HashMap();
        term2946 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term2978 = newInstance(Class.forName("java.lang.Object"));
        Object term2979 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2980 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2981 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2982 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term2946, term2946.getClass(), "node", null);
        setField(term2946, term2946.getClass(), "namespaces", term2947);
        setField(term2946, term2946.getClass(), "defaultNamespace", "HqBOwkVqjD");
        setField(term2946, term2946.getClass(), "id", "MAcUBcBckh");
        setIntField(term2946, term2946.getClass(), "index", -244121226);
        setBooleanField(term2946, term2946.getClass(), "attribute", true);
        setField(term2946, term2946.getClass(), "rootNode", term2978);
        setField(term2982, term2982.getClass(), "parent", null);
        setField(term2982, term2982.getClass(), "namespaceMap", null);
        setField(term2982, term2982.getClass(), "reverseMap", null);
        setField(term2982, term2982.getClass(), "pointer", null);
        setBooleanField(term2982, term2982.getClass(), "sealed", false);
        setField(term2981, term2981.getClass(), "parent", term2982);
        setField(term2981, term2981.getClass(), "namespaceMap", term2984);
        setField(term2981, term2981.getClass(), "reverseMap", term2989);
        setField(term2981, term2981.getClass(), "pointer", null);
        setBooleanField(term2981, term2981.getClass(), "sealed", false);
        setField(term2980, term2980.getClass(), "parent", term2981);
        setField(term2980, term2980.getClass(), "namespaceMap", term2995);
        setField(term2980, term2980.getClass(), "reverseMap", term3000);
        setField(term2980, term2980.getClass(), "pointer", null);
        setBooleanField(term2980, term2980.getClass(), "sealed", false);
        setField(term2979, term2979.getClass(), "parent", term2980);
        setField(term2979, term2979.getClass(), "namespaceMap", term3006);
        setField(term2979, term2979.getClass(), "reverseMap", term3011);
        setField(term2979, term2979.getClass(), "pointer", null);
        setBooleanField(term2979, term2979.getClass(), "sealed", false);
        setField(term2946, term2946.getClass(), "namespaceResolver", term2979);
        setField(term2946, term2946.getClass(), "parent", null);
        setField(term2946, term2946.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "oVgzLbrsFr";
        try {
            callMethod(klass, "getRelativePositionOfPI", argTypes, term2946, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


