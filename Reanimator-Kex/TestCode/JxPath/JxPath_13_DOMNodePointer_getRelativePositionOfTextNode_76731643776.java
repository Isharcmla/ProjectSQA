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

public class DOMNodePointer_getRelativePositionOfTextNode_76731643776 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2855;

    public DOMNodePointer_getRelativePositionOfTextNode_76731643776() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2856 = new HashMap();
        HashMap term2893 = new HashMap();
        HashMap term2898 = new HashMap();
        HashMap term2904 = new HashMap();
        HashMap term2909 = new HashMap();
        HashMap term2915 = new HashMap();
        HashMap term2920 = new HashMap();
        term2855 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term2887 = newInstance(Class.forName("java.lang.Object"));
        Object term2888 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2889 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2890 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2891 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term2855, term2855.getClass(), "node", null);
        setField(term2855, term2855.getClass(), "namespaces", term2856);
        setField(term2855, term2855.getClass(), "defaultNamespace", "JUmudUmaaV");
        setField(term2855, term2855.getClass(), "id", "KoyGrUJeJW");
        setIntField(term2855, term2855.getClass(), "index", -1275173084);
        setBooleanField(term2855, term2855.getClass(), "attribute", false);
        setField(term2855, term2855.getClass(), "rootNode", term2887);
        setField(term2891, term2891.getClass(), "parent", null);
        setField(term2891, term2891.getClass(), "namespaceMap", null);
        setField(term2891, term2891.getClass(), "reverseMap", null);
        setField(term2891, term2891.getClass(), "pointer", null);
        setBooleanField(term2891, term2891.getClass(), "sealed", false);
        setField(term2890, term2890.getClass(), "parent", term2891);
        setField(term2890, term2890.getClass(), "namespaceMap", term2893);
        setField(term2890, term2890.getClass(), "reverseMap", term2898);
        setField(term2890, term2890.getClass(), "pointer", null);
        setBooleanField(term2890, term2890.getClass(), "sealed", false);
        setField(term2889, term2889.getClass(), "parent", term2890);
        setField(term2889, term2889.getClass(), "namespaceMap", term2904);
        setField(term2889, term2889.getClass(), "reverseMap", term2909);
        setField(term2889, term2889.getClass(), "pointer", null);
        setBooleanField(term2889, term2889.getClass(), "sealed", false);
        setField(term2888, term2888.getClass(), "parent", term2889);
        setField(term2888, term2888.getClass(), "namespaceMap", term2915);
        setField(term2888, term2888.getClass(), "reverseMap", term2920);
        setField(term2888, term2888.getClass(), "pointer", null);
        setBooleanField(term2888, term2888.getClass(), "sealed", false);
        setField(term2855, term2855.getClass(), "namespaceResolver", term2888);
        setField(term2855, term2855.getClass(), "parent", null);
        setField(term2855, term2855.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getRelativePositionOfTextNode", argTypes, term2855, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


