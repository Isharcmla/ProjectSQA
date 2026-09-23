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

public class DOMNodePointer_asPath_175231522272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2469;
     Object term10271;

    public DOMNodePointer_asPath_175231522272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2470 = new HashMap();
        HashMap term2507 = new HashMap();
        HashMap term2512 = new HashMap();
        HashMap term2518 = new HashMap();
        HashMap term2523 = new HashMap();
        HashMap term2529 = new HashMap();
        HashMap term2534 = new HashMap();
        term2469 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term2501 = newInstance(Class.forName("java.lang.Object"));
        Object term2502 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2503 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2504 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2505 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term2469, term2469.getClass(), "node", null);
        setField(term2469, term2469.getClass(), "namespaces", term2470);
        setField(term2469, term2469.getClass(), "defaultNamespace", "eqJfYWRaEL");
        setField(term2469, term2469.getClass(), "id", "fhkbdRViHi");
        setIntField(term2469, term2469.getClass(), "index", -1007160944);
        setBooleanField(term2469, term2469.getClass(), "attribute", true);
        setField(term2469, term2469.getClass(), "rootNode", term2501);
        setField(term2505, term2505.getClass(), "parent", null);
        setField(term2505, term2505.getClass(), "namespaceMap", null);
        setField(term2505, term2505.getClass(), "reverseMap", null);
        setField(term2505, term2505.getClass(), "pointer", null);
        setBooleanField(term2505, term2505.getClass(), "sealed", false);
        setField(term2504, term2504.getClass(), "parent", term2505);
        setField(term2504, term2504.getClass(), "namespaceMap", term2507);
        setField(term2504, term2504.getClass(), "reverseMap", term2512);
        setField(term2504, term2504.getClass(), "pointer", null);
        setBooleanField(term2504, term2504.getClass(), "sealed", false);
        setField(term2503, term2503.getClass(), "parent", term2504);
        setField(term2503, term2503.getClass(), "namespaceMap", term2518);
        setField(term2503, term2503.getClass(), "reverseMap", term2523);
        setField(term2503, term2503.getClass(), "pointer", null);
        setBooleanField(term2503, term2503.getClass(), "sealed", false);
        setField(term2502, term2502.getClass(), "parent", term2503);
        setField(term2502, term2502.getClass(), "namespaceMap", term2529);
        setField(term2502, term2502.getClass(), "reverseMap", term2534);
        setField(term2502, term2502.getClass(), "pointer", null);
        setBooleanField(term2502, term2502.getClass(), "sealed", false);
        setField(term2469, term2469.getClass(), "namespaceResolver", term2502);
        setField(term2469, term2469.getClass(), "parent", null);
        setField(term2469, term2469.getClass(), "locale", null);
        HashMap term10272 = new HashMap();
        HashMap term10282 = new HashMap();
        HashMap term10283 = new HashMap();
        HashMap term10284 = new HashMap();
        HashMap term10285 = new HashMap();
        HashMap term10286 = new HashMap();
        HashMap term10287 = new HashMap();
        term10271 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term10277 = newInstance(Class.forName("java.lang.Object"));
        Object term10278 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term10279 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term10280 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term10281 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term10271, term10271.getClass(), "node", null);
        setField(term10271, term10271.getClass(), "namespaces", term10272);
        setField(term10271, term10271.getClass(), "defaultNamespace", "eqJfYWRaEL");
        setField(term10271, term10271.getClass(), "id", "fhkbdRViHi");
        setIntField(term10271, term10271.getClass(), "index", -1007160944);
        setBooleanField(term10271, term10271.getClass(), "attribute", true);
        setField(term10271, term10271.getClass(), "rootNode", term10277);
        setField(term10281, term10281.getClass(), "parent", null);
        setField(term10281, term10281.getClass(), "namespaceMap", null);
        setField(term10281, term10281.getClass(), "reverseMap", null);
        setField(term10281, term10281.getClass(), "pointer", null);
        setBooleanField(term10281, term10281.getClass(), "sealed", false);
        setField(term10280, term10280.getClass(), "parent", term10281);
        setField(term10280, term10280.getClass(), "namespaceMap", term10282);
        setField(term10280, term10280.getClass(), "reverseMap", term10283);
        setField(term10280, term10280.getClass(), "pointer", null);
        setBooleanField(term10280, term10280.getClass(), "sealed", false);
        setField(term10279, term10279.getClass(), "parent", term10280);
        setField(term10279, term10279.getClass(), "namespaceMap", term10284);
        setField(term10279, term10279.getClass(), "reverseMap", term10285);
        setField(term10279, term10279.getClass(), "pointer", null);
        setBooleanField(term10279, term10279.getClass(), "sealed", false);
        setField(term10278, term10278.getClass(), "parent", term10279);
        setField(term10278, term10278.getClass(), "namespaceMap", term10286);
        setField(term10278, term10278.getClass(), "reverseMap", term10287);
        setField(term10278, term10278.getClass(), "pointer", null);
        setBooleanField(term10278, term10278.getClass(), "sealed", false);
        setField(term10271, term10271.getClass(), "namespaceResolver", term10278);
        setField(term10271, term10271.getClass(), "parent", null);
        setField(term10271, term10271.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asPath", argTypes, term2469, args);
        assertTrue(recursiveEquals(term2469, term10271));
        assertTrue(recursiveEquals(retValue, "id(\'fhkbdRViHi\')"));
    }

};


