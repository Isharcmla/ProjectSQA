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

public class DOMNodePointer_setValue_9683547669 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2024;
     Object term2102;

    public DOMNodePointer_setValue_9683547669() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2025 = new HashMap();
        HashMap term2059 = new HashMap();
        HashMap term2064 = new HashMap();
        HashMap term2070 = new HashMap();
        HashMap term2075 = new HashMap();
        HashMap term2081 = new HashMap();
        HashMap term2086 = new HashMap();
        HashMap term2096 = new HashMap();
        term2024 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term2054 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2055 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2056 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2057 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2094 = newInstance(Class.forName("java.lang.Object"));
        Object term2095 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term2024, term2024.getClass(), "node", null);
        setField(term2024, term2024.getClass(), "namespaces", term2025);
        setField(term2024, term2024.getClass(), "defaultNamespace", "tShwQLRGNe");
        setField(term2024, term2024.getClass(), "id", "LvtrsXUliU");
        setField(term2057, term2057.getClass(), "parent", null);
        setField(term2057, term2057.getClass(), "namespaceMap", null);
        setField(term2057, term2057.getClass(), "reverseMap", null);
        setField(term2057, term2057.getClass(), "pointer", null);
        setBooleanField(term2057, term2057.getClass(), "sealed", false);
        setField(term2056, term2056.getClass(), "parent", term2057);
        setField(term2056, term2056.getClass(), "namespaceMap", term2059);
        setField(term2056, term2056.getClass(), "reverseMap", term2064);
        setField(term2056, term2056.getClass(), "pointer", null);
        setBooleanField(term2056, term2056.getClass(), "sealed", false);
        setField(term2055, term2055.getClass(), "parent", term2056);
        setField(term2055, term2055.getClass(), "namespaceMap", term2070);
        setField(term2055, term2055.getClass(), "reverseMap", term2075);
        setField(term2055, term2055.getClass(), "pointer", null);
        setBooleanField(term2055, term2055.getClass(), "sealed", false);
        setField(term2054, term2054.getClass(), "parent", term2055);
        setField(term2054, term2054.getClass(), "namespaceMap", term2081);
        setField(term2054, term2054.getClass(), "reverseMap", term2086);
        setField(term2054, term2054.getClass(), "pointer", null);
        setBooleanField(term2054, term2054.getClass(), "sealed", false);
        setField(term2024, term2024.getClass(), "localNamespaceResolver", term2054);
        setIntField(term2024, term2024.getClass(), "index", 1622346318);
        setBooleanField(term2024, term2024.getClass(), "attribute", false);
        setField(term2024, term2024.getClass(), "rootNode", term2094);
        setField(term2095, term2095.getClass(), "parent", null);
        setField(term2095, term2095.getClass(), "namespaceMap", term2096);
        setField(term2095, term2095.getClass(), "reverseMap", null);
        setField(term2095, term2095.getClass(), "pointer", null);
        setBooleanField(term2095, term2095.getClass(), "sealed", false);
        setField(term2024, term2024.getClass(), "namespaceResolver", term2095);
        setField(term2024, term2024.getClass(), "parent", null);
        setField(term2024, term2024.getClass(), "locale", null);
        term2102 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2102;
        try {
            callMethod(klass, "setValue", argTypes, term2024, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


