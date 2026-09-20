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
     Object term2836;

    public DOMNodePointer_getRelativePositionOfPI_20203710675() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2837 = new HashMap();
        HashMap term2874 = new HashMap();
        HashMap term2879 = new HashMap();
        HashMap term2885 = new HashMap();
        HashMap term2890 = new HashMap();
        HashMap term2896 = new HashMap();
        HashMap term2901 = new HashMap();
        term2836 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term2868 = newInstance(Class.forName("java.lang.Object"));
        Object term2869 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2870 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2871 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2872 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term2836, term2836.getClass(), "node", null);
        setField(term2836, term2836.getClass(), "namespaces", term2837);
        setField(term2836, term2836.getClass(), "defaultNamespace", "bLPjGVBhlX");
        setField(term2836, term2836.getClass(), "id", "whBvTVIIlC");
        setIntField(term2836, term2836.getClass(), "index", -244121226);
        setBooleanField(term2836, term2836.getClass(), "attribute", true);
        setField(term2836, term2836.getClass(), "rootNode", term2868);
        setField(term2872, term2872.getClass(), "parent", null);
        setField(term2872, term2872.getClass(), "namespaceMap", null);
        setField(term2872, term2872.getClass(), "reverseMap", null);
        setField(term2872, term2872.getClass(), "pointer", null);
        setField(term2872, term2872.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2872, term2872.getClass(), "sealed", false);
        setField(term2871, term2871.getClass(), "parent", term2872);
        setField(term2871, term2871.getClass(), "namespaceMap", term2874);
        setField(term2871, term2871.getClass(), "reverseMap", term2879);
        setField(term2871, term2871.getClass(), "pointer", null);
        setField(term2871, term2871.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2871, term2871.getClass(), "sealed", false);
        setField(term2870, term2870.getClass(), "parent", term2871);
        setField(term2870, term2870.getClass(), "namespaceMap", term2885);
        setField(term2870, term2870.getClass(), "reverseMap", term2890);
        setField(term2870, term2870.getClass(), "pointer", null);
        setField(term2870, term2870.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2870, term2870.getClass(), "sealed", false);
        setField(term2869, term2869.getClass(), "parent", term2870);
        setField(term2869, term2869.getClass(), "namespaceMap", term2896);
        setField(term2869, term2869.getClass(), "reverseMap", term2901);
        setField(term2869, term2869.getClass(), "pointer", null);
        setField(term2869, term2869.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2869, term2869.getClass(), "sealed", false);
        setField(term2836, term2836.getClass(), "namespaceResolver", term2869);
        setField(term2836, term2836.getClass(), "parent", null);
        setField(term2836, term2836.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IgRJUzaCwW";
        try {
            callMethod(klass, "getRelativePositionOfPI", argTypes, term2836, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
