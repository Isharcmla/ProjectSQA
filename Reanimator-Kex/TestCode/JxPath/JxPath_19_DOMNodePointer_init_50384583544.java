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
import java.lang.Object;

public class DOMNodePointer_init_50384583544 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21;
     Object term4085;
     Object term4098;

    public DOMNodePointer_init_50384583544() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21 = newInstance(Class.forName("java.util.Locale"));
        Object term22 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term22, term22.getClass(), "language", "ps");
        setField(term22, term22.getClass(), "script", "");
        setField(term22, term22.getClass(), "region", "");
        setField(term22, term22.getClass(), "variant", "");
        setIntField(term22, term22.getClass(), "hash", 106860317);
        setField(term21, term21.getClass(), "baseLocale", term22);
        setField(term21, term21.getClass(), "localeExtensions", null);
        setIntField(term21, term21.getClass(), "hashCodeValue", 106860317);
        setField(term21, term21.getClass(), "languageTag", null);
        term4085 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term4088 = newInstance(Class.forName("java.util.Locale"));
        Object term4089 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term4085, term4085.getClass(), "node", null);
        setField(term4085, term4085.getClass(), "namespaces", null);
        setField(term4085, term4085.getClass(), "defaultNamespace", null);
        setField(term4085, term4085.getClass(), "id", "PAEBtnZtTD");
        setField(term4085, term4085.getClass(), "localNamespaceResolver", null);
        setIntField(term4085, term4085.getClass(), "index", -2147483648);
        setBooleanField(term4085, term4085.getClass(), "attribute", false);
        setField(term4085, term4085.getClass(), "namespaceResolver", null);
        setField(term4085, term4085.getClass(), "rootNode", null);
        setField(term4085, term4085.getClass(), "parent", null);
        setField(term4089, term4089.getClass(), "language", "ps");
        setField(term4089, term4089.getClass(), "script", "");
        setField(term4089, term4089.getClass(), "region", "");
        setField(term4089, term4089.getClass(), "variant", "");
        setIntField(term4089, term4089.getClass(), "hash", 106860317);
        setField(term4088, term4088.getClass(), "baseLocale", term4089);
        setField(term4088, term4088.getClass(), "localeExtensions", null);
        setIntField(term4088, term4088.getClass(), "hashCodeValue", 106860317);
        setField(term4088, term4088.getClass(), "languageTag", null);
        setField(term4085, term4085.getClass(), "locale", term4088);
        term4098 = newInstance(Class.forName("java.util.Locale"));
        Object term4099 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term4099, term4099.getClass(), "language", "ps");
        setField(term4099, term4099.getClass(), "script", "");
        setField(term4099, term4099.getClass(), "region", "");
        setField(term4099, term4099.getClass(), "variant", "");
        setIntField(term4099, term4099.getClass(), "hash", 106860317);
        setField(term4098, term4098.getClass(), "baseLocale", term4099);
        setField(term4098, term4098.getClass(), "localeExtensions", null);
        setIntField(term4098, term4098.getClass(), "hashCodeValue", 106860317);
        setField(term4098, term4098.getClass(), "languageTag", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.w3c.dom.Node");
        argTypes[1] = Class.forName("java.util.Locale");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term21;
        args[2] = "PAEBtnZtTD";
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term4085));
        assertTrue(recursiveEquals(term21, null));
    }

};


