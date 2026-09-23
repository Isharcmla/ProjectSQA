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

public class DOMNodePointer_getName_133421023850 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term205;

    public DOMNodePointer_getName_133421023850() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term206 = new HashMap();
        HashMap term240 = new HashMap();
        HashMap term245 = new HashMap();
        HashMap term251 = new HashMap();
        HashMap term256 = new HashMap();
        HashMap term262 = new HashMap();
        HashMap term267 = new HashMap();
        HashMap term276 = new HashMap();
        HashMap term281 = new HashMap();
        term205 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term235 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term236 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term237 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term238 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term275 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term205, term205.getClass(), "node", null);
        setField(term205, term205.getClass(), "namespaces", term206);
        setField(term205, term205.getClass(), "defaultNamespace", "EGtDIRbSSb");
        setField(term205, term205.getClass(), "id", "SzjVpOQTyS");
        setField(term238, term238.getClass(), "parent", null);
        setField(term238, term238.getClass(), "namespaceMap", null);
        setField(term238, term238.getClass(), "reverseMap", null);
        setField(term238, term238.getClass(), "pointer", null);
        setBooleanField(term238, term238.getClass(), "sealed", false);
        setField(term237, term237.getClass(), "parent", term238);
        setField(term237, term237.getClass(), "namespaceMap", term240);
        setField(term237, term237.getClass(), "reverseMap", term245);
        setField(term237, term237.getClass(), "pointer", null);
        setBooleanField(term237, term237.getClass(), "sealed", false);
        setField(term236, term236.getClass(), "parent", term237);
        setField(term236, term236.getClass(), "namespaceMap", term251);
        setField(term236, term236.getClass(), "reverseMap", term256);
        setField(term236, term236.getClass(), "pointer", null);
        setBooleanField(term236, term236.getClass(), "sealed", false);
        setField(term235, term235.getClass(), "parent", term236);
        setField(term235, term235.getClass(), "namespaceMap", term262);
        setField(term235, term235.getClass(), "reverseMap", term267);
        setField(term235, term235.getClass(), "pointer", null);
        setBooleanField(term235, term235.getClass(), "sealed", false);
        setField(term205, term205.getClass(), "localNamespaceResolver", term235);
        setIntField(term205, term205.getClass(), "index", 1162663216);
        setBooleanField(term205, term205.getClass(), "attribute", false);
        setField(term275, term275.getClass(), "parent", null);
        setField(term275, term275.getClass(), "namespaceMap", term276);
        setField(term275, term275.getClass(), "reverseMap", term281);
        setField(term275, term275.getClass(), "pointer", null);
        setBooleanField(term275, term275.getClass(), "sealed", false);
        setField(term205, term205.getClass(), "namespaceResolver", term275);
        setField(term205, term205.getClass(), "exceptionHandler", null);
        setField(term205, term205.getClass(), "rootNode", null);
        setField(term205, term205.getClass(), "parent", null);
        setField(term205, term205.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getName", argTypes, term205, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


