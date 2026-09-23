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
import java.lang.NullPointerException;
import static org.apache.commons.jxpath.ri.model.jdom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Integer;

public class JDOMNodePointer_createChild_174305012071 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2347;
     Object term2438;
     Object term2475;

    public JDOMNodePointer_createChild_174305012071() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2366 = new HashMap();
        HashMap term2371 = new HashMap();
        HashMap term2377 = new HashMap();
        HashMap term2382 = new HashMap();
        HashMap term2388 = new HashMap();
        HashMap term2393 = new HashMap();
        HashMap term2404 = new HashMap();
        HashMap term2409 = new HashMap();
        HashMap term2415 = new HashMap();
        HashMap term2420 = new HashMap();
        HashMap term2426 = new HashMap();
        HashMap term2431 = new HashMap();
        term2347 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term2348 = newInstance(Class.forName("java.lang.Object"));
        Object term2361 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2362 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2363 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2364 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2401 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2402 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2403 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2437 = newInstance(Class.forName("java.lang.Object"));
        setField(term2347, term2347.getClass(), "node", term2348);
        setField(term2347, term2347.getClass(), "id", "AijpHYOFuy");
        setField(term2364, term2364.getClass(), "parent", null);
        setField(term2364, term2364.getClass(), "namespaceMap", null);
        setField(term2364, term2364.getClass(), "reverseMap", null);
        setField(term2364, term2364.getClass(), "pointer", null);
        setBooleanField(term2364, term2364.getClass(), "sealed", false);
        setField(term2363, term2363.getClass(), "parent", term2364);
        setField(term2363, term2363.getClass(), "namespaceMap", term2366);
        setField(term2363, term2363.getClass(), "reverseMap", term2371);
        setField(term2363, term2363.getClass(), "pointer", null);
        setBooleanField(term2363, term2363.getClass(), "sealed", false);
        setField(term2362, term2362.getClass(), "parent", term2363);
        setField(term2362, term2362.getClass(), "namespaceMap", term2377);
        setField(term2362, term2362.getClass(), "reverseMap", term2382);
        setField(term2362, term2362.getClass(), "pointer", null);
        setBooleanField(term2362, term2362.getClass(), "sealed", false);
        setField(term2361, term2361.getClass(), "parent", term2362);
        setField(term2361, term2361.getClass(), "namespaceMap", term2388);
        setField(term2361, term2361.getClass(), "reverseMap", term2393);
        setField(term2361, term2361.getClass(), "pointer", null);
        setBooleanField(term2361, term2361.getClass(), "sealed", false);
        setField(term2347, term2347.getClass(), "localNamespaceResolver", term2361);
        setIntField(term2347, term2347.getClass(), "index", -655067527);
        setBooleanField(term2347, term2347.getClass(), "attribute", true);
        setField(term2403, term2403.getClass(), "parent", null);
        setField(term2403, term2403.getClass(), "namespaceMap", term2404);
        setField(term2403, term2403.getClass(), "reverseMap", term2409);
        setField(term2403, term2403.getClass(), "pointer", null);
        setBooleanField(term2403, term2403.getClass(), "sealed", false);
        setField(term2402, term2402.getClass(), "parent", term2403);
        setField(term2402, term2402.getClass(), "namespaceMap", term2415);
        setField(term2402, term2402.getClass(), "reverseMap", term2420);
        setField(term2402, term2402.getClass(), "pointer", null);
        setBooleanField(term2402, term2402.getClass(), "sealed", false);
        setField(term2401, term2401.getClass(), "parent", term2402);
        setField(term2401, term2401.getClass(), "namespaceMap", term2426);
        setField(term2401, term2401.getClass(), "reverseMap", term2431);
        setField(term2401, term2401.getClass(), "pointer", null);
        setBooleanField(term2401, term2401.getClass(), "sealed", false);
        setField(term2347, term2347.getClass(), "namespaceResolver", term2401);
        setField(term2347, term2347.getClass(), "rootNode", term2437);
        setField(term2347, term2347.getClass(), "parent", null);
        setField(term2347, term2347.getClass(), "locale", null);
        term2438 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term2438, term2438.getClass(), "prefix", "SbAoxhfrkn");
        setField(term2438, term2438.getClass(), "name", "kuTXqwMtDB");
        setField(term2438, term2438.getClass(), "qualifiedName", "Ghbwtircqb");
        term2475 = new Integer(-6029667);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.JXPathContext");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term2438;
        args[2] = term2475;
        try {
            callMethod(klass, "createChild", argTypes, term2347, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


