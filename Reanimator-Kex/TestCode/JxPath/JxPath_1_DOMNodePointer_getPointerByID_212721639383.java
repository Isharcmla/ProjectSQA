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

public class DOMNodePointer_getPointerByID_212721639383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3314;

    public DOMNodePointer_getPointerByID_212721639383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3315 = new HashMap();
        HashMap term3352 = new HashMap();
        HashMap term3357 = new HashMap();
        HashMap term3363 = new HashMap();
        HashMap term3368 = new HashMap();
        HashMap term3374 = new HashMap();
        HashMap term3379 = new HashMap();
        term3314 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term3346 = newInstance(Class.forName("java.lang.Object"));
        Object term3347 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3348 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3349 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3350 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term3314, term3314.getClass(), "node", null);
        setField(term3314, term3314.getClass(), "namespaces", term3315);
        setField(term3314, term3314.getClass(), "defaultNamespace", "idgaQsnJpQ");
        setField(term3314, term3314.getClass(), "id", "VgZnGoIFwQ");
        setIntField(term3314, term3314.getClass(), "index", 1193880199);
        setBooleanField(term3314, term3314.getClass(), "attribute", true);
        setField(term3314, term3314.getClass(), "rootNode", term3346);
        setField(term3350, term3350.getClass(), "parent", null);
        setField(term3350, term3350.getClass(), "namespaceMap", null);
        setField(term3350, term3350.getClass(), "reverseMap", null);
        setField(term3350, term3350.getClass(), "pointer", null);
        setField(term3350, term3350.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3350, term3350.getClass(), "sealed", false);
        setField(term3349, term3349.getClass(), "parent", term3350);
        setField(term3349, term3349.getClass(), "namespaceMap", term3352);
        setField(term3349, term3349.getClass(), "reverseMap", term3357);
        setField(term3349, term3349.getClass(), "pointer", null);
        setField(term3349, term3349.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3349, term3349.getClass(), "sealed", false);
        setField(term3348, term3348.getClass(), "parent", term3349);
        setField(term3348, term3348.getClass(), "namespaceMap", term3363);
        setField(term3348, term3348.getClass(), "reverseMap", term3368);
        setField(term3348, term3348.getClass(), "pointer", null);
        setField(term3348, term3348.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3348, term3348.getClass(), "sealed", false);
        setField(term3347, term3347.getClass(), "parent", term3348);
        setField(term3347, term3347.getClass(), "namespaceMap", term3374);
        setField(term3347, term3347.getClass(), "reverseMap", term3379);
        setField(term3347, term3347.getClass(), "pointer", null);
        setField(term3347, term3347.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3347, term3347.getClass(), "sealed", false);
        setField(term3314, term3314.getClass(), "namespaceResolver", term3347);
        setField(term3314, term3314.getClass(), "parent", null);
        setField(term3314, term3314.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.JXPathContext");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = "jUbSRrkrYZ";
        try {
            callMethod(klass, "getPointerByID", argTypes, term3314, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
