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
import static org.apache.commons.jxpath.ri.model.dom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.jxpath.ri.model.dom.EqualityUtils.*;
import java.util.HashMap;
import java.lang.Object;

public class DOMNodePointer_escape_52520066973 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2560;
     Object term10441;

    public DOMNodePointer_escape_52520066973() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2561 = new HashMap();
        HashMap term2598 = new HashMap();
        HashMap term2603 = new HashMap();
        HashMap term2609 = new HashMap();
        HashMap term2614 = new HashMap();
        HashMap term2620 = new HashMap();
        HashMap term2625 = new HashMap();
        term2560 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term2592 = newInstance(Class.forName("java.lang.Object"));
        Object term2593 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2594 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2595 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2596 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term2560, term2560.getClass(), "node", null);
        setField(term2560, term2560.getClass(), "namespaces", term2561);
        setField(term2560, term2560.getClass(), "defaultNamespace", "uWHnvSvaPl");
        setField(term2560, term2560.getClass(), "id", "kBdSllIBVz");
        setIntField(term2560, term2560.getClass(), "index", 1135664017);
        setBooleanField(term2560, term2560.getClass(), "attribute", true);
        setField(term2560, term2560.getClass(), "rootNode", term2592);
        setField(term2596, term2596.getClass(), "parent", null);
        setField(term2596, term2596.getClass(), "namespaceMap", null);
        setField(term2596, term2596.getClass(), "reverseMap", null);
        setField(term2596, term2596.getClass(), "pointer", null);
        setBooleanField(term2596, term2596.getClass(), "sealed", false);
        setField(term2595, term2595.getClass(), "parent", term2596);
        setField(term2595, term2595.getClass(), "namespaceMap", term2598);
        setField(term2595, term2595.getClass(), "reverseMap", term2603);
        setField(term2595, term2595.getClass(), "pointer", null);
        setBooleanField(term2595, term2595.getClass(), "sealed", false);
        setField(term2594, term2594.getClass(), "parent", term2595);
        setField(term2594, term2594.getClass(), "namespaceMap", term2609);
        setField(term2594, term2594.getClass(), "reverseMap", term2614);
        setField(term2594, term2594.getClass(), "pointer", null);
        setBooleanField(term2594, term2594.getClass(), "sealed", false);
        setField(term2593, term2593.getClass(), "parent", term2594);
        setField(term2593, term2593.getClass(), "namespaceMap", term2620);
        setField(term2593, term2593.getClass(), "reverseMap", term2625);
        setField(term2593, term2593.getClass(), "pointer", null);
        setBooleanField(term2593, term2593.getClass(), "sealed", false);
        setField(term2560, term2560.getClass(), "namespaceResolver", term2593);
        setField(term2560, term2560.getClass(), "parent", null);
        setField(term2560, term2560.getClass(), "locale", null);
        HashMap term10442 = new HashMap();
        HashMap term10452 = new HashMap();
        HashMap term10453 = new HashMap();
        HashMap term10454 = new HashMap();
        HashMap term10455 = new HashMap();
        HashMap term10456 = new HashMap();
        HashMap term10457 = new HashMap();
        term10441 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term10447 = newInstance(Class.forName("java.lang.Object"));
        Object term10448 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term10449 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term10450 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term10451 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term10441, term10441.getClass(), "node", null);
        setField(term10441, term10441.getClass(), "namespaces", term10442);
        setField(term10441, term10441.getClass(), "defaultNamespace", "uWHnvSvaPl");
        setField(term10441, term10441.getClass(), "id", "kBdSllIBVz");
        setIntField(term10441, term10441.getClass(), "index", 1135664017);
        setBooleanField(term10441, term10441.getClass(), "attribute", true);
        setField(term10441, term10441.getClass(), "rootNode", term10447);
        setField(term10451, term10451.getClass(), "parent", null);
        setField(term10451, term10451.getClass(), "namespaceMap", null);
        setField(term10451, term10451.getClass(), "reverseMap", null);
        setField(term10451, term10451.getClass(), "pointer", null);
        setBooleanField(term10451, term10451.getClass(), "sealed", false);
        setField(term10450, term10450.getClass(), "parent", term10451);
        setField(term10450, term10450.getClass(), "namespaceMap", term10452);
        setField(term10450, term10450.getClass(), "reverseMap", term10453);
        setField(term10450, term10450.getClass(), "pointer", null);
        setBooleanField(term10450, term10450.getClass(), "sealed", false);
        setField(term10449, term10449.getClass(), "parent", term10450);
        setField(term10449, term10449.getClass(), "namespaceMap", term10454);
        setField(term10449, term10449.getClass(), "reverseMap", term10455);
        setField(term10449, term10449.getClass(), "pointer", null);
        setBooleanField(term10449, term10449.getClass(), "sealed", false);
        setField(term10448, term10448.getClass(), "parent", term10449);
        setField(term10448, term10448.getClass(), "namespaceMap", term10456);
        setField(term10448, term10448.getClass(), "reverseMap", term10457);
        setField(term10448, term10448.getClass(), "pointer", null);
        setBooleanField(term10448, term10448.getClass(), "sealed", false);
        setField(term10441, term10441.getClass(), "namespaceResolver", term10448);
        setField(term10441, term10441.getClass(), "parent", null);
        setField(term10441, term10441.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "TJmVBGfTML";
        Object retValue = callMethod(klass, "escape", argTypes, term2560, args);
        assertTrue(recursiveEquals(term2560, term10441));
        assertTrue(recursiveEquals(retValue, "TJmVBGfTML"));
    }

};


