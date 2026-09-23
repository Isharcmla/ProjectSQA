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

public class DOMNodePointer_getValue_2665989681 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3220;

    public DOMNodePointer_getValue_2665989681() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3221 = new HashMap();
        HashMap term3258 = new HashMap();
        HashMap term3263 = new HashMap();
        HashMap term3269 = new HashMap();
        HashMap term3274 = new HashMap();
        HashMap term3280 = new HashMap();
        HashMap term3285 = new HashMap();
        term3220 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term3252 = newInstance(Class.forName("java.lang.Object"));
        Object term3253 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3254 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3255 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3256 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term3220, term3220.getClass(), "node", null);
        setField(term3220, term3220.getClass(), "namespaces", term3221);
        setField(term3220, term3220.getClass(), "defaultNamespace", "idgaQsnJpQ");
        setField(term3220, term3220.getClass(), "id", "VgZnGoIFwQ");
        setIntField(term3220, term3220.getClass(), "index", -73683645);
        setBooleanField(term3220, term3220.getClass(), "attribute", true);
        setField(term3220, term3220.getClass(), "rootNode", term3252);
        setField(term3256, term3256.getClass(), "parent", null);
        setField(term3256, term3256.getClass(), "namespaceMap", null);
        setField(term3256, term3256.getClass(), "reverseMap", null);
        setField(term3256, term3256.getClass(), "pointer", null);
        setField(term3256, term3256.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3256, term3256.getClass(), "sealed", false);
        setField(term3255, term3255.getClass(), "parent", term3256);
        setField(term3255, term3255.getClass(), "namespaceMap", term3258);
        setField(term3255, term3255.getClass(), "reverseMap", term3263);
        setField(term3255, term3255.getClass(), "pointer", null);
        setField(term3255, term3255.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3255, term3255.getClass(), "sealed", false);
        setField(term3254, term3254.getClass(), "parent", term3255);
        setField(term3254, term3254.getClass(), "namespaceMap", term3269);
        setField(term3254, term3254.getClass(), "reverseMap", term3274);
        setField(term3254, term3254.getClass(), "pointer", null);
        setField(term3254, term3254.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3254, term3254.getClass(), "sealed", false);
        setField(term3253, term3253.getClass(), "parent", term3254);
        setField(term3253, term3253.getClass(), "namespaceMap", term3280);
        setField(term3253, term3253.getClass(), "reverseMap", term3285);
        setField(term3253, term3253.getClass(), "pointer", null);
        setField(term3253, term3253.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3253, term3253.getClass(), "sealed", false);
        setField(term3220, term3220.getClass(), "namespaceResolver", term3253);
        setField(term3220, term3220.getClass(), "parent", null);
        setField(term3220, term3220.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getValue", argTypes, term3220, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


