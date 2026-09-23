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

public class DOMNodePointer_getRelativePositionOfPI_35429022976 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3248;

    public DOMNodePointer_getRelativePositionOfPI_35429022976() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3249 = new HashMap();
        HashMap term3283 = new HashMap();
        HashMap term3288 = new HashMap();
        HashMap term3294 = new HashMap();
        HashMap term3299 = new HashMap();
        HashMap term3305 = new HashMap();
        HashMap term3310 = new HashMap();
        HashMap term3319 = new HashMap();
        HashMap term3324 = new HashMap();
        term3248 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term3278 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3279 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3280 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3281 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3318 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3330 = newInstance(Class.forName("java.lang.Object"));
        setField(term3248, term3248.getClass(), "node", null);
        setField(term3248, term3248.getClass(), "namespaces", term3249);
        setField(term3248, term3248.getClass(), "defaultNamespace", "KoyGrUJeJW");
        setField(term3248, term3248.getClass(), "id", "HqBOwkVqjD");
        setField(term3281, term3281.getClass(), "parent", null);
        setField(term3281, term3281.getClass(), "namespaceMap", null);
        setField(term3281, term3281.getClass(), "reverseMap", null);
        setField(term3281, term3281.getClass(), "pointer", null);
        setBooleanField(term3281, term3281.getClass(), "sealed", false);
        setField(term3280, term3280.getClass(), "parent", term3281);
        setField(term3280, term3280.getClass(), "namespaceMap", term3283);
        setField(term3280, term3280.getClass(), "reverseMap", term3288);
        setField(term3280, term3280.getClass(), "pointer", null);
        setBooleanField(term3280, term3280.getClass(), "sealed", false);
        setField(term3279, term3279.getClass(), "parent", term3280);
        setField(term3279, term3279.getClass(), "namespaceMap", term3294);
        setField(term3279, term3279.getClass(), "reverseMap", term3299);
        setField(term3279, term3279.getClass(), "pointer", null);
        setBooleanField(term3279, term3279.getClass(), "sealed", false);
        setField(term3278, term3278.getClass(), "parent", term3279);
        setField(term3278, term3278.getClass(), "namespaceMap", term3305);
        setField(term3278, term3278.getClass(), "reverseMap", term3310);
        setField(term3278, term3278.getClass(), "pointer", null);
        setBooleanField(term3278, term3278.getClass(), "sealed", false);
        setField(term3248, term3248.getClass(), "localNamespaceResolver", term3278);
        setIntField(term3248, term3248.getClass(), "index", -244121226);
        setBooleanField(term3248, term3248.getClass(), "attribute", true);
        setField(term3318, term3318.getClass(), "parent", null);
        setField(term3318, term3318.getClass(), "namespaceMap", term3319);
        setField(term3318, term3318.getClass(), "reverseMap", term3324);
        setField(term3318, term3318.getClass(), "pointer", null);
        setBooleanField(term3318, term3318.getClass(), "sealed", false);
        setField(term3248, term3248.getClass(), "namespaceResolver", term3318);
        setField(term3248, term3248.getClass(), "rootNode", term3330);
        setField(term3248, term3248.getClass(), "parent", null);
        setField(term3248, term3248.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getRelativePositionOfPI", argTypes, term3248, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


