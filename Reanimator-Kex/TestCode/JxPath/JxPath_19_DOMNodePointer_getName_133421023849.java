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

public class DOMNodePointer_getName_133421023849 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206;

    public DOMNodePointer_getName_133421023849() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term207 = new HashMap();
        HashMap term241 = new HashMap();
        HashMap term246 = new HashMap();
        HashMap term252 = new HashMap();
        HashMap term257 = new HashMap();
        HashMap term263 = new HashMap();
        HashMap term268 = new HashMap();
        HashMap term277 = new HashMap();
        HashMap term282 = new HashMap();
        term206 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term236 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term237 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term238 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term239 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term276 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term288 = newInstance(Class.forName("java.lang.Object"));
        setField(term206, term206.getClass(), "node", null);
        setField(term206, term206.getClass(), "namespaces", term207);
        setField(term206, term206.getClass(), "defaultNamespace", "EGtDIRbSSb");
        setField(term206, term206.getClass(), "id", "SzjVpOQTyS");
        setField(term239, term239.getClass(), "parent", null);
        setField(term239, term239.getClass(), "namespaceMap", null);
        setField(term239, term239.getClass(), "reverseMap", null);
        setField(term239, term239.getClass(), "pointer", null);
        setBooleanField(term239, term239.getClass(), "sealed", false);
        setField(term238, term238.getClass(), "parent", term239);
        setField(term238, term238.getClass(), "namespaceMap", term241);
        setField(term238, term238.getClass(), "reverseMap", term246);
        setField(term238, term238.getClass(), "pointer", null);
        setBooleanField(term238, term238.getClass(), "sealed", false);
        setField(term237, term237.getClass(), "parent", term238);
        setField(term237, term237.getClass(), "namespaceMap", term252);
        setField(term237, term237.getClass(), "reverseMap", term257);
        setField(term237, term237.getClass(), "pointer", null);
        setBooleanField(term237, term237.getClass(), "sealed", false);
        setField(term236, term236.getClass(), "parent", term237);
        setField(term236, term236.getClass(), "namespaceMap", term263);
        setField(term236, term236.getClass(), "reverseMap", term268);
        setField(term236, term236.getClass(), "pointer", null);
        setBooleanField(term236, term236.getClass(), "sealed", false);
        setField(term206, term206.getClass(), "localNamespaceResolver", term236);
        setIntField(term206, term206.getClass(), "index", 1162663216);
        setBooleanField(term206, term206.getClass(), "attribute", false);
        setField(term276, term276.getClass(), "parent", null);
        setField(term276, term276.getClass(), "namespaceMap", term277);
        setField(term276, term276.getClass(), "reverseMap", term282);
        setField(term276, term276.getClass(), "pointer", null);
        setBooleanField(term276, term276.getClass(), "sealed", false);
        setField(term206, term206.getClass(), "namespaceResolver", term276);
        setField(term206, term206.getClass(), "rootNode", term288);
        setField(term206, term206.getClass(), "parent", null);
        setField(term206, term206.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getName", argTypes, term206, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


