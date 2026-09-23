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

public class JDOMNodePointer_createChild_178033812174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2412;
     Object term2498;
     Object term2535;
     Object term2537;

    public JDOMNodePointer_createChild_178033812174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2431 = new HashMap();
        HashMap term2436 = new HashMap();
        HashMap term2442 = new HashMap();
        HashMap term2447 = new HashMap();
        HashMap term2453 = new HashMap();
        HashMap term2458 = new HashMap();
        HashMap term2470 = new HashMap();
        HashMap term2476 = new HashMap();
        HashMap term2481 = new HashMap();
        HashMap term2487 = new HashMap();
        HashMap term2492 = new HashMap();
        term2412 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term2413 = newInstance(Class.forName("java.lang.Object"));
        Object term2426 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2427 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2428 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2429 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2466 = newInstance(Class.forName("java.lang.Object"));
        Object term2467 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2468 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2469 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term2412, term2412.getClass(), "node", term2413);
        setField(term2412, term2412.getClass(), "id", "xrwlQZdwCp");
        setField(term2429, term2429.getClass(), "parent", null);
        setField(term2429, term2429.getClass(), "namespaceMap", null);
        setField(term2429, term2429.getClass(), "reverseMap", null);
        setField(term2429, term2429.getClass(), "pointer", null);
        setBooleanField(term2429, term2429.getClass(), "sealed", false);
        setField(term2428, term2428.getClass(), "parent", term2429);
        setField(term2428, term2428.getClass(), "namespaceMap", term2431);
        setField(term2428, term2428.getClass(), "reverseMap", term2436);
        setField(term2428, term2428.getClass(), "pointer", null);
        setBooleanField(term2428, term2428.getClass(), "sealed", false);
        setField(term2427, term2427.getClass(), "parent", term2428);
        setField(term2427, term2427.getClass(), "namespaceMap", term2442);
        setField(term2427, term2427.getClass(), "reverseMap", term2447);
        setField(term2427, term2427.getClass(), "pointer", null);
        setBooleanField(term2427, term2427.getClass(), "sealed", false);
        setField(term2426, term2426.getClass(), "parent", term2427);
        setField(term2426, term2426.getClass(), "namespaceMap", term2453);
        setField(term2426, term2426.getClass(), "reverseMap", term2458);
        setField(term2426, term2426.getClass(), "pointer", null);
        setBooleanField(term2426, term2426.getClass(), "sealed", false);
        setField(term2412, term2412.getClass(), "localNamespaceResolver", term2426);
        setIntField(term2412, term2412.getClass(), "index", -2068769794);
        setBooleanField(term2412, term2412.getClass(), "attribute", true);
        setField(term2412, term2412.getClass(), "rootNode", term2466);
        setField(term2469, term2469.getClass(), "parent", null);
        setField(term2469, term2469.getClass(), "namespaceMap", term2470);
        setField(term2469, term2469.getClass(), "reverseMap", null);
        setField(term2469, term2469.getClass(), "pointer", null);
        setBooleanField(term2469, term2469.getClass(), "sealed", false);
        setField(term2468, term2468.getClass(), "parent", term2469);
        setField(term2468, term2468.getClass(), "namespaceMap", term2476);
        setField(term2468, term2468.getClass(), "reverseMap", term2481);
        setField(term2468, term2468.getClass(), "pointer", null);
        setBooleanField(term2468, term2468.getClass(), "sealed", false);
        setField(term2467, term2467.getClass(), "parent", term2468);
        setField(term2467, term2467.getClass(), "namespaceMap", term2487);
        setField(term2467, term2467.getClass(), "reverseMap", term2492);
        setField(term2467, term2467.getClass(), "pointer", null);
        setBooleanField(term2467, term2467.getClass(), "sealed", false);
        setField(term2412, term2412.getClass(), "namespaceResolver", term2467);
        setField(term2412, term2412.getClass(), "parent", null);
        setField(term2412, term2412.getClass(), "locale", null);
        term2498 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term2498, term2498.getClass(), "prefix", "IDCWpPLRkE");
        setField(term2498, term2498.getClass(), "name", "nyiiPDVjAc");
        setField(term2498, term2498.getClass(), "qualifiedName", "aKnKipADSo");
        term2535 = new Integer(-117576464);
        term2537 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.JXPathContext");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("java.lang.Object");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term2498;
        args[2] = term2535;
        args[3] = term2537;
        try {
            callMethod(klass, "createChild", argTypes, term2412, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


