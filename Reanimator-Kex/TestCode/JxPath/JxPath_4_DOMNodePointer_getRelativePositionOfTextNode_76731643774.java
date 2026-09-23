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

public class DOMNodePointer_getRelativePositionOfTextNode_76731643774 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2833;

    public DOMNodePointer_getRelativePositionOfTextNode_76731643774() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2834 = new HashMap();
        HashMap term2871 = new HashMap();
        HashMap term2876 = new HashMap();
        HashMap term2882 = new HashMap();
        HashMap term2887 = new HashMap();
        HashMap term2893 = new HashMap();
        HashMap term2898 = new HashMap();
        term2833 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term2865 = newInstance(Class.forName("java.lang.Object"));
        Object term2866 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2867 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2868 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2869 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term2833, term2833.getClass(), "node", null);
        setField(term2833, term2833.getClass(), "namespaces", term2834);
        setField(term2833, term2833.getClass(), "defaultNamespace", "IgRJUzaCwW");
        setField(term2833, term2833.getClass(), "id", "JUmudUmaaV");
        setIntField(term2833, term2833.getClass(), "index", -1275173084);
        setBooleanField(term2833, term2833.getClass(), "attribute", false);
        setField(term2833, term2833.getClass(), "rootNode", term2865);
        setField(term2869, term2869.getClass(), "parent", null);
        setField(term2869, term2869.getClass(), "namespaceMap", null);
        setField(term2869, term2869.getClass(), "reverseMap", null);
        setField(term2869, term2869.getClass(), "pointer", null);
        setField(term2869, term2869.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2869, term2869.getClass(), "sealed", false);
        setField(term2868, term2868.getClass(), "parent", term2869);
        setField(term2868, term2868.getClass(), "namespaceMap", term2871);
        setField(term2868, term2868.getClass(), "reverseMap", term2876);
        setField(term2868, term2868.getClass(), "pointer", null);
        setField(term2868, term2868.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2868, term2868.getClass(), "sealed", false);
        setField(term2867, term2867.getClass(), "parent", term2868);
        setField(term2867, term2867.getClass(), "namespaceMap", term2882);
        setField(term2867, term2867.getClass(), "reverseMap", term2887);
        setField(term2867, term2867.getClass(), "pointer", null);
        setField(term2867, term2867.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2867, term2867.getClass(), "sealed", false);
        setField(term2866, term2866.getClass(), "parent", term2867);
        setField(term2866, term2866.getClass(), "namespaceMap", term2893);
        setField(term2866, term2866.getClass(), "reverseMap", term2898);
        setField(term2866, term2866.getClass(), "pointer", null);
        setField(term2866, term2866.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2866, term2866.getClass(), "sealed", false);
        setField(term2833, term2833.getClass(), "namespaceResolver", term2866);
        setField(term2833, term2833.getClass(), "parent", null);
        setField(term2833, term2833.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getRelativePositionOfTextNode", argTypes, term2833, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


