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

public class DOMNodePointer_init_157630010443 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term4011;
     Object term4022;

    public DOMNodePointer_init_157630010443() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("java.util.Locale"));
        Object term2 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term2, term2.getClass(), "language", "pt");
        setField(term2, term2.getClass(), "script", "");
        setField(term2, term2.getClass(), "region", "MO");
        setField(term2, term2.getClass(), "variant", "");
        setIntField(term2, term2.getClass(), "hash", 106966554);
        setField(term1, term1.getClass(), "baseLocale", term2);
        setField(term1, term1.getClass(), "localeExtensions", null);
        setIntField(term1, term1.getClass(), "hashCodeValue", 106966554);
        setField(term1, term1.getClass(), "languageTag", null);
        term4011 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term4012 = newInstance(Class.forName("java.util.Locale"));
        Object term4013 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term4011, term4011.getClass(), "node", null);
        setField(term4011, term4011.getClass(), "namespaces", null);
        setField(term4011, term4011.getClass(), "defaultNamespace", null);
        setField(term4011, term4011.getClass(), "id", null);
        setField(term4011, term4011.getClass(), "localNamespaceResolver", null);
        setIntField(term4011, term4011.getClass(), "index", -2147483648);
        setBooleanField(term4011, term4011.getClass(), "attribute", false);
        setField(term4011, term4011.getClass(), "namespaceResolver", null);
        setField(term4011, term4011.getClass(), "rootNode", null);
        setField(term4011, term4011.getClass(), "parent", null);
        setField(term4013, term4013.getClass(), "language", "pt");
        setField(term4013, term4013.getClass(), "script", "");
        setField(term4013, term4013.getClass(), "region", "MO");
        setField(term4013, term4013.getClass(), "variant", "");
        setIntField(term4013, term4013.getClass(), "hash", 106966554);
        setField(term4012, term4012.getClass(), "baseLocale", term4013);
        setField(term4012, term4012.getClass(), "localeExtensions", null);
        setIntField(term4012, term4012.getClass(), "hashCodeValue", 106966554);
        setField(term4012, term4012.getClass(), "languageTag", null);
        setField(term4011, term4011.getClass(), "locale", term4012);
        term4022 = newInstance(Class.forName("java.util.Locale"));
        Object term4023 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term4023, term4023.getClass(), "language", "pt");
        setField(term4023, term4023.getClass(), "script", "");
        setField(term4023, term4023.getClass(), "region", "MO");
        setField(term4023, term4023.getClass(), "variant", "");
        setIntField(term4023, term4023.getClass(), "hash", 106966554);
        setField(term4022, term4022.getClass(), "baseLocale", term4023);
        setField(term4022, term4022.getClass(), "localeExtensions", null);
        setIntField(term4022, term4022.getClass(), "hashCodeValue", 106966554);
        setField(term4022, term4022.getClass(), "languageTag", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.w3c.dom.Node");
        argTypes[1] = Class.forName("java.util.Locale");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term4011));
        assertTrue(recursiveEquals(term1, null));
    }

};


