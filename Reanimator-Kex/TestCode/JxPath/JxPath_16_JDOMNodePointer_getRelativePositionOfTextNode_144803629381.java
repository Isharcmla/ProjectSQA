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
import java.lang.ClassCastException;
import static org.apache.commons.jxpath.ri.model.jdom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;

public class JDOMNodePointer_getRelativePositionOfTextNode_144803629381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3243;

    public JDOMNodePointer_getRelativePositionOfTextNode_144803629381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3262 = new HashMap();
        HashMap term3267 = new HashMap();
        HashMap term3273 = new HashMap();
        HashMap term3278 = new HashMap();
        HashMap term3284 = new HashMap();
        HashMap term3289 = new HashMap();
        HashMap term3301 = new HashMap();
        HashMap term3307 = new HashMap();
        HashMap term3312 = new HashMap();
        HashMap term3318 = new HashMap();
        HashMap term3323 = new HashMap();
        term3243 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term3244 = newInstance(Class.forName("java.lang.Object"));
        Object term3257 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3258 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3259 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3260 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3297 = newInstance(Class.forName("java.lang.Object"));
        Object term3298 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3299 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3300 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term3243, term3243.getClass(), "node", term3244);
        setField(term3243, term3243.getClass(), "id", "nGKItKLYNC");
        setField(term3260, term3260.getClass(), "parent", null);
        setField(term3260, term3260.getClass(), "namespaceMap", null);
        setField(term3260, term3260.getClass(), "reverseMap", null);
        setField(term3260, term3260.getClass(), "pointer", null);
        setBooleanField(term3260, term3260.getClass(), "sealed", false);
        setField(term3259, term3259.getClass(), "parent", term3260);
        setField(term3259, term3259.getClass(), "namespaceMap", term3262);
        setField(term3259, term3259.getClass(), "reverseMap", term3267);
        setField(term3259, term3259.getClass(), "pointer", null);
        setBooleanField(term3259, term3259.getClass(), "sealed", false);
        setField(term3258, term3258.getClass(), "parent", term3259);
        setField(term3258, term3258.getClass(), "namespaceMap", term3273);
        setField(term3258, term3258.getClass(), "reverseMap", term3278);
        setField(term3258, term3258.getClass(), "pointer", null);
        setBooleanField(term3258, term3258.getClass(), "sealed", false);
        setField(term3257, term3257.getClass(), "parent", term3258);
        setField(term3257, term3257.getClass(), "namespaceMap", term3284);
        setField(term3257, term3257.getClass(), "reverseMap", term3289);
        setField(term3257, term3257.getClass(), "pointer", null);
        setBooleanField(term3257, term3257.getClass(), "sealed", false);
        setField(term3243, term3243.getClass(), "localNamespaceResolver", term3257);
        setIntField(term3243, term3243.getClass(), "index", -203030934);
        setBooleanField(term3243, term3243.getClass(), "attribute", true);
        setField(term3243, term3243.getClass(), "rootNode", term3297);
        setField(term3300, term3300.getClass(), "parent", null);
        setField(term3300, term3300.getClass(), "namespaceMap", term3301);
        setField(term3300, term3300.getClass(), "reverseMap", null);
        setField(term3300, term3300.getClass(), "pointer", null);
        setBooleanField(term3300, term3300.getClass(), "sealed", false);
        setField(term3299, term3299.getClass(), "parent", term3300);
        setField(term3299, term3299.getClass(), "namespaceMap", term3307);
        setField(term3299, term3299.getClass(), "reverseMap", term3312);
        setField(term3299, term3299.getClass(), "pointer", null);
        setBooleanField(term3299, term3299.getClass(), "sealed", false);
        setField(term3298, term3298.getClass(), "parent", term3299);
        setField(term3298, term3298.getClass(), "namespaceMap", term3318);
        setField(term3298, term3298.getClass(), "reverseMap", term3323);
        setField(term3298, term3298.getClass(), "pointer", null);
        setBooleanField(term3298, term3298.getClass(), "sealed", false);
        setField(term3243, term3243.getClass(), "namespaceResolver", term3298);
        setField(term3243, term3243.getClass(), "parent", null);
        setField(term3243, term3243.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getRelativePositionOfTextNode", argTypes, term3243, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


