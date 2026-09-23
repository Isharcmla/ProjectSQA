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

public class DOMNodePointer_getValue_2665989683 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3242;

    public DOMNodePointer_getValue_2665989683() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3243 = new HashMap();
        HashMap term3280 = new HashMap();
        HashMap term3285 = new HashMap();
        HashMap term3291 = new HashMap();
        HashMap term3296 = new HashMap();
        HashMap term3302 = new HashMap();
        HashMap term3307 = new HashMap();
        term3242 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term3274 = newInstance(Class.forName("java.lang.Object"));
        Object term3275 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3276 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3277 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3278 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term3242, term3242.getClass(), "node", null);
        setField(term3242, term3242.getClass(), "namespaces", term3243);
        setField(term3242, term3242.getClass(), "defaultNamespace", "VgZnGoIFwQ");
        setField(term3242, term3242.getClass(), "id", "jUbSRrkrYZ");
        setIntField(term3242, term3242.getClass(), "index", -73683645);
        setBooleanField(term3242, term3242.getClass(), "attribute", true);
        setField(term3242, term3242.getClass(), "rootNode", term3274);
        setField(term3278, term3278.getClass(), "parent", null);
        setField(term3278, term3278.getClass(), "namespaceMap", null);
        setField(term3278, term3278.getClass(), "reverseMap", null);
        setField(term3278, term3278.getClass(), "pointer", null);
        setBooleanField(term3278, term3278.getClass(), "sealed", false);
        setField(term3277, term3277.getClass(), "parent", term3278);
        setField(term3277, term3277.getClass(), "namespaceMap", term3280);
        setField(term3277, term3277.getClass(), "reverseMap", term3285);
        setField(term3277, term3277.getClass(), "pointer", null);
        setBooleanField(term3277, term3277.getClass(), "sealed", false);
        setField(term3276, term3276.getClass(), "parent", term3277);
        setField(term3276, term3276.getClass(), "namespaceMap", term3291);
        setField(term3276, term3276.getClass(), "reverseMap", term3296);
        setField(term3276, term3276.getClass(), "pointer", null);
        setBooleanField(term3276, term3276.getClass(), "sealed", false);
        setField(term3275, term3275.getClass(), "parent", term3276);
        setField(term3275, term3275.getClass(), "namespaceMap", term3302);
        setField(term3275, term3275.getClass(), "reverseMap", term3307);
        setField(term3275, term3275.getClass(), "pointer", null);
        setBooleanField(term3275, term3275.getClass(), "sealed", false);
        setField(term3242, term3242.getClass(), "namespaceResolver", term3275);
        setField(term3242, term3242.getClass(), "parent", null);
        setField(term3242, term3242.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getValue", argTypes, term3242, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


