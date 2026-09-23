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

public class DOMNodePointer_remove_41018104271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2378;

    public DOMNodePointer_remove_41018104271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2379 = new HashMap();
        HashMap term2416 = new HashMap();
        HashMap term2421 = new HashMap();
        HashMap term2427 = new HashMap();
        HashMap term2432 = new HashMap();
        HashMap term2438 = new HashMap();
        HashMap term2443 = new HashMap();
        term2378 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term2410 = newInstance(Class.forName("java.lang.Object"));
        Object term2411 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2412 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2413 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2414 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term2378, term2378.getClass(), "node", null);
        setField(term2378, term2378.getClass(), "namespaces", term2379);
        setField(term2378, term2378.getClass(), "defaultNamespace", "dEnhdmILtU");
        setField(term2378, term2378.getClass(), "id", "hoicvmsovO");
        setIntField(term2378, term2378.getClass(), "index", -117576464);
        setBooleanField(term2378, term2378.getClass(), "attribute", true);
        setField(term2378, term2378.getClass(), "rootNode", term2410);
        setField(term2414, term2414.getClass(), "parent", null);
        setField(term2414, term2414.getClass(), "namespaceMap", null);
        setField(term2414, term2414.getClass(), "reverseMap", null);
        setField(term2414, term2414.getClass(), "pointer", null);
        setBooleanField(term2414, term2414.getClass(), "sealed", false);
        setField(term2413, term2413.getClass(), "parent", term2414);
        setField(term2413, term2413.getClass(), "namespaceMap", term2416);
        setField(term2413, term2413.getClass(), "reverseMap", term2421);
        setField(term2413, term2413.getClass(), "pointer", null);
        setBooleanField(term2413, term2413.getClass(), "sealed", false);
        setField(term2412, term2412.getClass(), "parent", term2413);
        setField(term2412, term2412.getClass(), "namespaceMap", term2427);
        setField(term2412, term2412.getClass(), "reverseMap", term2432);
        setField(term2412, term2412.getClass(), "pointer", null);
        setBooleanField(term2412, term2412.getClass(), "sealed", false);
        setField(term2411, term2411.getClass(), "parent", term2412);
        setField(term2411, term2411.getClass(), "namespaceMap", term2438);
        setField(term2411, term2411.getClass(), "reverseMap", term2443);
        setField(term2411, term2411.getClass(), "pointer", null);
        setBooleanField(term2411, term2411.getClass(), "sealed", false);
        setField(term2378, term2378.getClass(), "namespaceResolver", term2411);
        setField(term2378, term2378.getClass(), "parent", null);
        setField(term2378, term2378.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "remove", argTypes, term2378, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


