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

public class DOMNodePointer_escape_52520066971 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2450;
     Object term10269;

    public DOMNodePointer_escape_52520066971() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2451 = new HashMap();
        HashMap term2488 = new HashMap();
        HashMap term2493 = new HashMap();
        HashMap term2499 = new HashMap();
        HashMap term2504 = new HashMap();
        HashMap term2510 = new HashMap();
        HashMap term2515 = new HashMap();
        term2450 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term2482 = newInstance(Class.forName("java.lang.Object"));
        Object term2483 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2484 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2485 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2486 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term2450, term2450.getClass(), "node", null);
        setField(term2450, term2450.getClass(), "namespaces", term2451);
        setField(term2450, term2450.getClass(), "defaultNamespace", "ieCtQFdkii");
        setField(term2450, term2450.getClass(), "id", "dEnhdmILtU");
        setIntField(term2450, term2450.getClass(), "index", 1135664017);
        setBooleanField(term2450, term2450.getClass(), "attribute", true);
        setField(term2450, term2450.getClass(), "rootNode", term2482);
        setField(term2486, term2486.getClass(), "parent", null);
        setField(term2486, term2486.getClass(), "namespaceMap", null);
        setField(term2486, term2486.getClass(), "reverseMap", null);
        setField(term2486, term2486.getClass(), "pointer", null);
        setField(term2486, term2486.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2486, term2486.getClass(), "sealed", false);
        setField(term2485, term2485.getClass(), "parent", term2486);
        setField(term2485, term2485.getClass(), "namespaceMap", term2488);
        setField(term2485, term2485.getClass(), "reverseMap", term2493);
        setField(term2485, term2485.getClass(), "pointer", null);
        setField(term2485, term2485.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2485, term2485.getClass(), "sealed", false);
        setField(term2484, term2484.getClass(), "parent", term2485);
        setField(term2484, term2484.getClass(), "namespaceMap", term2499);
        setField(term2484, term2484.getClass(), "reverseMap", term2504);
        setField(term2484, term2484.getClass(), "pointer", null);
        setField(term2484, term2484.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2484, term2484.getClass(), "sealed", false);
        setField(term2483, term2483.getClass(), "parent", term2484);
        setField(term2483, term2483.getClass(), "namespaceMap", term2510);
        setField(term2483, term2483.getClass(), "reverseMap", term2515);
        setField(term2483, term2483.getClass(), "pointer", null);
        setField(term2483, term2483.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2483, term2483.getClass(), "sealed", false);
        setField(term2450, term2450.getClass(), "namespaceResolver", term2483);
        setField(term2450, term2450.getClass(), "parent", null);
        setField(term2450, term2450.getClass(), "locale", null);
        HashMap term10270 = new HashMap();
        HashMap term10280 = new HashMap();
        HashMap term10281 = new HashMap();
        HashMap term10282 = new HashMap();
        HashMap term10283 = new HashMap();
        HashMap term10284 = new HashMap();
        HashMap term10285 = new HashMap();
        term10269 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term10275 = newInstance(Class.forName("java.lang.Object"));
        Object term10276 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term10277 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term10278 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term10279 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term10269, term10269.getClass(), "node", null);
        setField(term10269, term10269.getClass(), "namespaces", term10270);
        setField(term10269, term10269.getClass(), "defaultNamespace", "ieCtQFdkii");
        setField(term10269, term10269.getClass(), "id", "dEnhdmILtU");
        setIntField(term10269, term10269.getClass(), "index", 1135664017);
        setBooleanField(term10269, term10269.getClass(), "attribute", true);
        setField(term10269, term10269.getClass(), "rootNode", term10275);
        setField(term10279, term10279.getClass(), "parent", null);
        setField(term10279, term10279.getClass(), "namespaceMap", null);
        setField(term10279, term10279.getClass(), "reverseMap", null);
        setField(term10279, term10279.getClass(), "pointer", null);
        setField(term10279, term10279.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term10279, term10279.getClass(), "sealed", false);
        setField(term10278, term10278.getClass(), "parent", term10279);
        setField(term10278, term10278.getClass(), "namespaceMap", term10280);
        setField(term10278, term10278.getClass(), "reverseMap", term10281);
        setField(term10278, term10278.getClass(), "pointer", null);
        setField(term10278, term10278.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term10278, term10278.getClass(), "sealed", false);
        setField(term10277, term10277.getClass(), "parent", term10278);
        setField(term10277, term10277.getClass(), "namespaceMap", term10282);
        setField(term10277, term10277.getClass(), "reverseMap", term10283);
        setField(term10277, term10277.getClass(), "pointer", null);
        setField(term10277, term10277.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term10277, term10277.getClass(), "sealed", false);
        setField(term10276, term10276.getClass(), "parent", term10277);
        setField(term10276, term10276.getClass(), "namespaceMap", term10284);
        setField(term10276, term10276.getClass(), "reverseMap", term10285);
        setField(term10276, term10276.getClass(), "pointer", null);
        setField(term10276, term10276.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term10276, term10276.getClass(), "sealed", false);
        setField(term10269, term10269.getClass(), "namespaceResolver", term10276);
        setField(term10269, term10269.getClass(), "parent", null);
        setField(term10269, term10269.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hoicvmsovO";
        Object retValue = callMethod(klass, "escape", argTypes, term2450, args);
        assertTrue(recursiveEquals(term2450, term10269));
        assertTrue(recursiveEquals(retValue, "hoicvmsovO"));
    }

};
