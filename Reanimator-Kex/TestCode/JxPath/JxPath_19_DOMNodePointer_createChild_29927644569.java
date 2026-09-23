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
import java.lang.Integer;

public class DOMNodePointer_createChild_29927644569 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2390;
     Object term2473;
     Object term2510;
     Object term2512;

    public DOMNodePointer_createChild_29927644569() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2391 = new HashMap();
        HashMap term2425 = new HashMap();
        HashMap term2430 = new HashMap();
        HashMap term2436 = new HashMap();
        HashMap term2441 = new HashMap();
        HashMap term2447 = new HashMap();
        HashMap term2452 = new HashMap();
        HashMap term2461 = new HashMap();
        HashMap term2466 = new HashMap();
        term2390 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term2420 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2421 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2422 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2423 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2460 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2472 = newInstance(Class.forName("java.lang.Object"));
        setField(term2390, term2390.getClass(), "node", null);
        setField(term2390, term2390.getClass(), "namespaces", term2391);
        setField(term2390, term2390.getClass(), "defaultNamespace", "JDswTTCZHV");
        setField(term2390, term2390.getClass(), "id", "onpbIeEKoi");
        setField(term2423, term2423.getClass(), "parent", null);
        setField(term2423, term2423.getClass(), "namespaceMap", null);
        setField(term2423, term2423.getClass(), "reverseMap", null);
        setField(term2423, term2423.getClass(), "pointer", null);
        setBooleanField(term2423, term2423.getClass(), "sealed", false);
        setField(term2422, term2422.getClass(), "parent", term2423);
        setField(term2422, term2422.getClass(), "namespaceMap", term2425);
        setField(term2422, term2422.getClass(), "reverseMap", term2430);
        setField(term2422, term2422.getClass(), "pointer", null);
        setBooleanField(term2422, term2422.getClass(), "sealed", false);
        setField(term2421, term2421.getClass(), "parent", term2422);
        setField(term2421, term2421.getClass(), "namespaceMap", term2436);
        setField(term2421, term2421.getClass(), "reverseMap", term2441);
        setField(term2421, term2421.getClass(), "pointer", null);
        setBooleanField(term2421, term2421.getClass(), "sealed", false);
        setField(term2420, term2420.getClass(), "parent", term2421);
        setField(term2420, term2420.getClass(), "namespaceMap", term2447);
        setField(term2420, term2420.getClass(), "reverseMap", term2452);
        setField(term2420, term2420.getClass(), "pointer", null);
        setBooleanField(term2420, term2420.getClass(), "sealed", false);
        setField(term2390, term2390.getClass(), "localNamespaceResolver", term2420);
        setIntField(term2390, term2390.getClass(), "index", -6029667);
        setBooleanField(term2390, term2390.getClass(), "attribute", true);
        setField(term2460, term2460.getClass(), "parent", null);
        setField(term2460, term2460.getClass(), "namespaceMap", term2461);
        setField(term2460, term2460.getClass(), "reverseMap", term2466);
        setField(term2460, term2460.getClass(), "pointer", null);
        setBooleanField(term2460, term2460.getClass(), "sealed", false);
        setField(term2390, term2390.getClass(), "namespaceResolver", term2460);
        setField(term2390, term2390.getClass(), "rootNode", term2472);
        setField(term2390, term2390.getClass(), "parent", null);
        setField(term2390, term2390.getClass(), "locale", null);
        term2473 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term2473, term2473.getClass(), "prefix", "YRHGsAkhxb");
        setField(term2473, term2473.getClass(), "name", "ffYhPOzlUs");
        setField(term2473, term2473.getClass(), "qualifiedName", "MLqYREekMl");
        term2510 = new Integer(-2068769794);
        term2512 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.JXPathContext");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("java.lang.Object");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term2473;
        args[2] = term2510;
        args[3] = term2512;
        try {
            callMethod(klass, "createChild", argTypes, term2390, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


