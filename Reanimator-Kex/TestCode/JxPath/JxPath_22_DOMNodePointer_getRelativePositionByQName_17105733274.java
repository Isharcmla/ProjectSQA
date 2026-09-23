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

public class DOMNodePointer_getRelativePositionByQName_17105733274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2915;

    public DOMNodePointer_getRelativePositionByQName_17105733274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2916 = new HashMap();
        HashMap term2950 = new HashMap();
        HashMap term2955 = new HashMap();
        HashMap term2961 = new HashMap();
        HashMap term2966 = new HashMap();
        HashMap term2972 = new HashMap();
        HashMap term2977 = new HashMap();
        HashMap term2986 = new HashMap();
        HashMap term2991 = new HashMap();
        term2915 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term2945 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2946 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2947 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2948 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2985 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term2915, term2915.getClass(), "node", null);
        setField(term2915, term2915.getClass(), "namespaces", term2916);
        setField(term2915, term2915.getClass(), "defaultNamespace", "TJmVBGfTML");
        setField(term2915, term2915.getClass(), "id", "tPlsykYBqO");
        setField(term2948, term2948.getClass(), "parent", null);
        setField(term2948, term2948.getClass(), "namespaceMap", null);
        setField(term2948, term2948.getClass(), "reverseMap", null);
        setField(term2948, term2948.getClass(), "pointer", null);
        setBooleanField(term2948, term2948.getClass(), "sealed", false);
        setField(term2947, term2947.getClass(), "parent", term2948);
        setField(term2947, term2947.getClass(), "namespaceMap", term2950);
        setField(term2947, term2947.getClass(), "reverseMap", term2955);
        setField(term2947, term2947.getClass(), "pointer", null);
        setBooleanField(term2947, term2947.getClass(), "sealed", false);
        setField(term2946, term2946.getClass(), "parent", term2947);
        setField(term2946, term2946.getClass(), "namespaceMap", term2961);
        setField(term2946, term2946.getClass(), "reverseMap", term2966);
        setField(term2946, term2946.getClass(), "pointer", null);
        setBooleanField(term2946, term2946.getClass(), "sealed", false);
        setField(term2945, term2945.getClass(), "parent", term2946);
        setField(term2945, term2945.getClass(), "namespaceMap", term2972);
        setField(term2945, term2945.getClass(), "reverseMap", term2977);
        setField(term2945, term2945.getClass(), "pointer", null);
        setBooleanField(term2945, term2945.getClass(), "sealed", false);
        setField(term2915, term2915.getClass(), "localNamespaceResolver", term2945);
        setIntField(term2915, term2915.getClass(), "index", 590364439);
        setBooleanField(term2915, term2915.getClass(), "attribute", false);
        setField(term2985, term2985.getClass(), "parent", null);
        setField(term2985, term2985.getClass(), "namespaceMap", term2986);
        setField(term2985, term2985.getClass(), "reverseMap", term2991);
        setField(term2985, term2985.getClass(), "pointer", null);
        setBooleanField(term2985, term2985.getClass(), "sealed", false);
        setField(term2915, term2915.getClass(), "namespaceResolver", term2985);
        setField(term2915, term2915.getClass(), "exceptionHandler", null);
        setField(term2915, term2915.getClass(), "rootNode", null);
        setField(term2915, term2915.getClass(), "parent", null);
        setField(term2915, term2915.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getRelativePositionByQName", argTypes, term2915, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


