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

public class DOMNodePointer_createChild_29927644571 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2290;
     Object term2368;
     Object term2405;
     Object term2407;

    public DOMNodePointer_createChild_29927644571() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2291 = new HashMap();
        HashMap term2325 = new HashMap();
        HashMap term2330 = new HashMap();
        HashMap term2336 = new HashMap();
        HashMap term2341 = new HashMap();
        HashMap term2347 = new HashMap();
        HashMap term2352 = new HashMap();
        HashMap term2362 = new HashMap();
        term2290 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term2320 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2321 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2322 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2323 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2360 = newInstance(Class.forName("java.lang.Object"));
        Object term2361 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term2290, term2290.getClass(), "node", null);
        setField(term2290, term2290.getClass(), "namespaces", term2291);
        setField(term2290, term2290.getClass(), "defaultNamespace", "JDswTTCZHV");
        setField(term2290, term2290.getClass(), "id", "onpbIeEKoi");
        setField(term2323, term2323.getClass(), "parent", null);
        setField(term2323, term2323.getClass(), "namespaceMap", null);
        setField(term2323, term2323.getClass(), "reverseMap", null);
        setField(term2323, term2323.getClass(), "pointer", null);
        setBooleanField(term2323, term2323.getClass(), "sealed", false);
        setField(term2322, term2322.getClass(), "parent", term2323);
        setField(term2322, term2322.getClass(), "namespaceMap", term2325);
        setField(term2322, term2322.getClass(), "reverseMap", term2330);
        setField(term2322, term2322.getClass(), "pointer", null);
        setBooleanField(term2322, term2322.getClass(), "sealed", false);
        setField(term2321, term2321.getClass(), "parent", term2322);
        setField(term2321, term2321.getClass(), "namespaceMap", term2336);
        setField(term2321, term2321.getClass(), "reverseMap", term2341);
        setField(term2321, term2321.getClass(), "pointer", null);
        setBooleanField(term2321, term2321.getClass(), "sealed", false);
        setField(term2320, term2320.getClass(), "parent", term2321);
        setField(term2320, term2320.getClass(), "namespaceMap", term2347);
        setField(term2320, term2320.getClass(), "reverseMap", term2352);
        setField(term2320, term2320.getClass(), "pointer", null);
        setBooleanField(term2320, term2320.getClass(), "sealed", false);
        setField(term2290, term2290.getClass(), "localNamespaceResolver", term2320);
        setIntField(term2290, term2290.getClass(), "index", -6029667);
        setBooleanField(term2290, term2290.getClass(), "attribute", true);
        setField(term2290, term2290.getClass(), "rootNode", term2360);
        setField(term2361, term2361.getClass(), "parent", null);
        setField(term2361, term2361.getClass(), "namespaceMap", term2362);
        setField(term2361, term2361.getClass(), "reverseMap", null);
        setField(term2361, term2361.getClass(), "pointer", null);
        setBooleanField(term2361, term2361.getClass(), "sealed", false);
        setField(term2290, term2290.getClass(), "namespaceResolver", term2361);
        setField(term2290, term2290.getClass(), "parent", null);
        setField(term2290, term2290.getClass(), "locale", null);
        term2368 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term2368, term2368.getClass(), "prefix", "YRHGsAkhxb");
        setField(term2368, term2368.getClass(), "name", "ffYhPOzlUs");
        setField(term2368, term2368.getClass(), "qualifiedName", "MLqYREekMl");
        term2405 = new Integer(-2068769794);
        term2407 = newInstance(Class.forName("java.lang.Object"));
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
        args[1] = term2368;
        args[2] = term2405;
        args[3] = term2407;
        try {
            callMethod(klass, "createChild", argTypes, term2290, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


