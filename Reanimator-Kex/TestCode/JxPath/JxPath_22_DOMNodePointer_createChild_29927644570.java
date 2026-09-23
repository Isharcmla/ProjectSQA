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

public class DOMNodePointer_createChild_29927644570 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2370;
     Object term2452;
     Object term2489;
     Object term2491;

    public DOMNodePointer_createChild_29927644570() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2371 = new HashMap();
        HashMap term2405 = new HashMap();
        HashMap term2410 = new HashMap();
        HashMap term2416 = new HashMap();
        HashMap term2421 = new HashMap();
        HashMap term2427 = new HashMap();
        HashMap term2432 = new HashMap();
        HashMap term2441 = new HashMap();
        HashMap term2446 = new HashMap();
        term2370 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term2400 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2401 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2402 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2403 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2440 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term2370, term2370.getClass(), "node", null);
        setField(term2370, term2370.getClass(), "namespaces", term2371);
        setField(term2370, term2370.getClass(), "defaultNamespace", "JDswTTCZHV");
        setField(term2370, term2370.getClass(), "id", "onpbIeEKoi");
        setField(term2403, term2403.getClass(), "parent", null);
        setField(term2403, term2403.getClass(), "namespaceMap", null);
        setField(term2403, term2403.getClass(), "reverseMap", null);
        setField(term2403, term2403.getClass(), "pointer", null);
        setBooleanField(term2403, term2403.getClass(), "sealed", false);
        setField(term2402, term2402.getClass(), "parent", term2403);
        setField(term2402, term2402.getClass(), "namespaceMap", term2405);
        setField(term2402, term2402.getClass(), "reverseMap", term2410);
        setField(term2402, term2402.getClass(), "pointer", null);
        setBooleanField(term2402, term2402.getClass(), "sealed", false);
        setField(term2401, term2401.getClass(), "parent", term2402);
        setField(term2401, term2401.getClass(), "namespaceMap", term2416);
        setField(term2401, term2401.getClass(), "reverseMap", term2421);
        setField(term2401, term2401.getClass(), "pointer", null);
        setBooleanField(term2401, term2401.getClass(), "sealed", false);
        setField(term2400, term2400.getClass(), "parent", term2401);
        setField(term2400, term2400.getClass(), "namespaceMap", term2427);
        setField(term2400, term2400.getClass(), "reverseMap", term2432);
        setField(term2400, term2400.getClass(), "pointer", null);
        setBooleanField(term2400, term2400.getClass(), "sealed", false);
        setField(term2370, term2370.getClass(), "localNamespaceResolver", term2400);
        setIntField(term2370, term2370.getClass(), "index", -6029667);
        setBooleanField(term2370, term2370.getClass(), "attribute", true);
        setField(term2440, term2440.getClass(), "parent", null);
        setField(term2440, term2440.getClass(), "namespaceMap", term2441);
        setField(term2440, term2440.getClass(), "reverseMap", term2446);
        setField(term2440, term2440.getClass(), "pointer", null);
        setBooleanField(term2440, term2440.getClass(), "sealed", false);
        setField(term2370, term2370.getClass(), "namespaceResolver", term2440);
        setField(term2370, term2370.getClass(), "exceptionHandler", null);
        setField(term2370, term2370.getClass(), "rootNode", null);
        setField(term2370, term2370.getClass(), "parent", null);
        setField(term2370, term2370.getClass(), "locale", null);
        term2452 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term2452, term2452.getClass(), "prefix", "YRHGsAkhxb");
        setField(term2452, term2452.getClass(), "name", "ffYhPOzlUs");
        setField(term2452, term2452.getClass(), "qualifiedName", "MLqYREekMl");
        term2489 = new Integer(-2068769794);
        term2491 = newInstance(Class.forName("java.lang.Object"));
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
        args[1] = term2452;
        args[2] = term2489;
        args[3] = term2491;
        try {
            callMethod(klass, "createChild", argTypes, term2370, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


