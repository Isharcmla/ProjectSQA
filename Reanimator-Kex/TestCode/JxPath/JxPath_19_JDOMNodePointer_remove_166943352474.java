package org.apache.commons.jxpath.ri.model.jdom;

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
import org.apache.commons.jxpath.JXPathException;
import static org.apache.commons.jxpath.ri.model.jdom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;

public class JDOMNodePointer_remove_166943352474 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2856;

    public JDOMNodePointer_remove_166943352474() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2875 = new HashMap();
        HashMap term2880 = new HashMap();
        HashMap term2886 = new HashMap();
        HashMap term2891 = new HashMap();
        HashMap term2897 = new HashMap();
        HashMap term2902 = new HashMap();
        HashMap term2913 = new HashMap();
        HashMap term2918 = new HashMap();
        HashMap term2924 = new HashMap();
        HashMap term2929 = new HashMap();
        HashMap term2935 = new HashMap();
        HashMap term2940 = new HashMap();
        term2856 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term2857 = newInstance(Class.forName("java.lang.Object"));
        Object term2870 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2871 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2872 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2873 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2910 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2911 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2912 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2946 = newInstance(Class.forName("java.lang.Object"));
        setField(term2856, term2856.getClass(), "node", term2857);
        setField(term2856, term2856.getClass(), "id", "BndsHwAFMv");
        setField(term2873, term2873.getClass(), "parent", null);
        setField(term2873, term2873.getClass(), "namespaceMap", null);
        setField(term2873, term2873.getClass(), "reverseMap", null);
        setField(term2873, term2873.getClass(), "pointer", null);
        setBooleanField(term2873, term2873.getClass(), "sealed", false);
        setField(term2872, term2872.getClass(), "parent", term2873);
        setField(term2872, term2872.getClass(), "namespaceMap", term2875);
        setField(term2872, term2872.getClass(), "reverseMap", term2880);
        setField(term2872, term2872.getClass(), "pointer", null);
        setBooleanField(term2872, term2872.getClass(), "sealed", false);
        setField(term2871, term2871.getClass(), "parent", term2872);
        setField(term2871, term2871.getClass(), "namespaceMap", term2886);
        setField(term2871, term2871.getClass(), "reverseMap", term2891);
        setField(term2871, term2871.getClass(), "pointer", null);
        setBooleanField(term2871, term2871.getClass(), "sealed", false);
        setField(term2870, term2870.getClass(), "parent", term2871);
        setField(term2870, term2870.getClass(), "namespaceMap", term2897);
        setField(term2870, term2870.getClass(), "reverseMap", term2902);
        setField(term2870, term2870.getClass(), "pointer", null);
        setBooleanField(term2870, term2870.getClass(), "sealed", false);
        setField(term2856, term2856.getClass(), "localNamespaceResolver", term2870);
        setIntField(term2856, term2856.getClass(), "index", 1135664017);
        setBooleanField(term2856, term2856.getClass(), "attribute", true);
        setField(term2912, term2912.getClass(), "parent", null);
        setField(term2912, term2912.getClass(), "namespaceMap", term2913);
        setField(term2912, term2912.getClass(), "reverseMap", term2918);
        setField(term2912, term2912.getClass(), "pointer", null);
        setBooleanField(term2912, term2912.getClass(), "sealed", false);
        setField(term2911, term2911.getClass(), "parent", term2912);
        setField(term2911, term2911.getClass(), "namespaceMap", term2924);
        setField(term2911, term2911.getClass(), "reverseMap", term2929);
        setField(term2911, term2911.getClass(), "pointer", null);
        setBooleanField(term2911, term2911.getClass(), "sealed", false);
        setField(term2910, term2910.getClass(), "parent", term2911);
        setField(term2910, term2910.getClass(), "namespaceMap", term2935);
        setField(term2910, term2910.getClass(), "reverseMap", term2940);
        setField(term2910, term2910.getClass(), "pointer", null);
        setBooleanField(term2910, term2910.getClass(), "sealed", false);
        setField(term2856, term2856.getClass(), "namespaceResolver", term2910);
        setField(term2856, term2856.getClass(), "rootNode", term2946);
        setField(term2856, term2856.getClass(), "parent", null);
        setField(term2856, term2856.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "remove", argTypes, term2856, args);
            assertTrue(false);
        }
        catch (JXPathException e) {
        }

    }

};


