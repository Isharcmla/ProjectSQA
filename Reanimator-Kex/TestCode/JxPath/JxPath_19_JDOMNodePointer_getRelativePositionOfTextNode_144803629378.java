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

public class JDOMNodePointer_getRelativePositionOfTextNode_144803629378 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3260;

    public JDOMNodePointer_getRelativePositionOfTextNode_144803629378() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3279 = new HashMap();
        HashMap term3284 = new HashMap();
        HashMap term3290 = new HashMap();
        HashMap term3295 = new HashMap();
        HashMap term3301 = new HashMap();
        HashMap term3306 = new HashMap();
        HashMap term3317 = new HashMap();
        HashMap term3322 = new HashMap();
        HashMap term3328 = new HashMap();
        HashMap term3333 = new HashMap();
        HashMap term3339 = new HashMap();
        HashMap term3344 = new HashMap();
        term3260 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term3261 = newInstance(Class.forName("java.lang.Object"));
        Object term3274 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3275 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3276 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3277 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3314 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3315 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3316 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3350 = newInstance(Class.forName("java.lang.Object"));
        setField(term3260, term3260.getClass(), "node", term3261);
        setField(term3260, term3260.getClass(), "id", "xLbjWUgOIL");
        setField(term3277, term3277.getClass(), "parent", null);
        setField(term3277, term3277.getClass(), "namespaceMap", null);
        setField(term3277, term3277.getClass(), "reverseMap", null);
        setField(term3277, term3277.getClass(), "pointer", null);
        setBooleanField(term3277, term3277.getClass(), "sealed", false);
        setField(term3276, term3276.getClass(), "parent", term3277);
        setField(term3276, term3276.getClass(), "namespaceMap", term3279);
        setField(term3276, term3276.getClass(), "reverseMap", term3284);
        setField(term3276, term3276.getClass(), "pointer", null);
        setBooleanField(term3276, term3276.getClass(), "sealed", false);
        setField(term3275, term3275.getClass(), "parent", term3276);
        setField(term3275, term3275.getClass(), "namespaceMap", term3290);
        setField(term3275, term3275.getClass(), "reverseMap", term3295);
        setField(term3275, term3275.getClass(), "pointer", null);
        setBooleanField(term3275, term3275.getClass(), "sealed", false);
        setField(term3274, term3274.getClass(), "parent", term3275);
        setField(term3274, term3274.getClass(), "namespaceMap", term3301);
        setField(term3274, term3274.getClass(), "reverseMap", term3306);
        setField(term3274, term3274.getClass(), "pointer", null);
        setBooleanField(term3274, term3274.getClass(), "sealed", false);
        setField(term3260, term3260.getClass(), "localNamespaceResolver", term3274);
        setIntField(term3260, term3260.getClass(), "index", -244121226);
        setBooleanField(term3260, term3260.getClass(), "attribute", true);
        setField(term3316, term3316.getClass(), "parent", null);
        setField(term3316, term3316.getClass(), "namespaceMap", term3317);
        setField(term3316, term3316.getClass(), "reverseMap", term3322);
        setField(term3316, term3316.getClass(), "pointer", null);
        setBooleanField(term3316, term3316.getClass(), "sealed", false);
        setField(term3315, term3315.getClass(), "parent", term3316);
        setField(term3315, term3315.getClass(), "namespaceMap", term3328);
        setField(term3315, term3315.getClass(), "reverseMap", term3333);
        setField(term3315, term3315.getClass(), "pointer", null);
        setBooleanField(term3315, term3315.getClass(), "sealed", false);
        setField(term3314, term3314.getClass(), "parent", term3315);
        setField(term3314, term3314.getClass(), "namespaceMap", term3339);
        setField(term3314, term3314.getClass(), "reverseMap", term3344);
        setField(term3314, term3314.getClass(), "pointer", null);
        setBooleanField(term3314, term3314.getClass(), "sealed", false);
        setField(term3260, term3260.getClass(), "namespaceResolver", term3314);
        setField(term3260, term3260.getClass(), "rootNode", term3350);
        setField(term3260, term3260.getClass(), "parent", null);
        setField(term3260, term3260.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getRelativePositionOfTextNode", argTypes, term3260, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


