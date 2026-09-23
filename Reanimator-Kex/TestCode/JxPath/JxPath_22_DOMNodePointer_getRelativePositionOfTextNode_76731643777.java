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

public class DOMNodePointer_getRelativePositionOfTextNode_76731643777 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3221;

    public DOMNodePointer_getRelativePositionOfTextNode_76731643777() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3222 = new HashMap();
        HashMap term3256 = new HashMap();
        HashMap term3261 = new HashMap();
        HashMap term3267 = new HashMap();
        HashMap term3272 = new HashMap();
        HashMap term3278 = new HashMap();
        HashMap term3283 = new HashMap();
        HashMap term3292 = new HashMap();
        HashMap term3297 = new HashMap();
        term3221 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term3251 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3252 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3253 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3254 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3291 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term3221, term3221.getClass(), "node", null);
        setField(term3221, term3221.getClass(), "namespaces", term3222);
        setField(term3221, term3221.getClass(), "defaultNamespace", "KoyGrUJeJW");
        setField(term3221, term3221.getClass(), "id", "HqBOwkVqjD");
        setField(term3254, term3254.getClass(), "parent", null);
        setField(term3254, term3254.getClass(), "namespaceMap", null);
        setField(term3254, term3254.getClass(), "reverseMap", null);
        setField(term3254, term3254.getClass(), "pointer", null);
        setBooleanField(term3254, term3254.getClass(), "sealed", false);
        setField(term3253, term3253.getClass(), "parent", term3254);
        setField(term3253, term3253.getClass(), "namespaceMap", term3256);
        setField(term3253, term3253.getClass(), "reverseMap", term3261);
        setField(term3253, term3253.getClass(), "pointer", null);
        setBooleanField(term3253, term3253.getClass(), "sealed", false);
        setField(term3252, term3252.getClass(), "parent", term3253);
        setField(term3252, term3252.getClass(), "namespaceMap", term3267);
        setField(term3252, term3252.getClass(), "reverseMap", term3272);
        setField(term3252, term3252.getClass(), "pointer", null);
        setBooleanField(term3252, term3252.getClass(), "sealed", false);
        setField(term3251, term3251.getClass(), "parent", term3252);
        setField(term3251, term3251.getClass(), "namespaceMap", term3278);
        setField(term3251, term3251.getClass(), "reverseMap", term3283);
        setField(term3251, term3251.getClass(), "pointer", null);
        setBooleanField(term3251, term3251.getClass(), "sealed", false);
        setField(term3221, term3221.getClass(), "localNamespaceResolver", term3251);
        setIntField(term3221, term3221.getClass(), "index", -244121226);
        setBooleanField(term3221, term3221.getClass(), "attribute", true);
        setField(term3291, term3291.getClass(), "parent", null);
        setField(term3291, term3291.getClass(), "namespaceMap", term3292);
        setField(term3291, term3291.getClass(), "reverseMap", term3297);
        setField(term3291, term3291.getClass(), "pointer", null);
        setBooleanField(term3291, term3291.getClass(), "sealed", false);
        setField(term3221, term3221.getClass(), "namespaceResolver", term3291);
        setField(term3221, term3221.getClass(), "exceptionHandler", null);
        setField(term3221, term3221.getClass(), "rootNode", null);
        setField(term3221, term3221.getClass(), "parent", null);
        setField(term3221, term3221.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getRelativePositionOfTextNode", argTypes, term3221, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


