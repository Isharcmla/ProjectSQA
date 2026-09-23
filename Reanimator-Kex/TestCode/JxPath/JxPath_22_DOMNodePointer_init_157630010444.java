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

public class DOMNodePointer_init_157630010444 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term4079;
     Object term4090;

    public DOMNodePointer_init_157630010444() {
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
        term4079 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term4080 = newInstance(Class.forName("java.util.Locale"));
        Object term4081 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term4079, term4079.getClass(), "node", null);
        setField(term4079, term4079.getClass(), "namespaces", null);
        setField(term4079, term4079.getClass(), "defaultNamespace", null);
        setField(term4079, term4079.getClass(), "id", null);
        setField(term4079, term4079.getClass(), "localNamespaceResolver", null);
        setIntField(term4079, term4079.getClass(), "index", -2147483648);
        setBooleanField(term4079, term4079.getClass(), "attribute", false);
        setField(term4079, term4079.getClass(), "namespaceResolver", null);
        setField(term4079, term4079.getClass(), "exceptionHandler", null);
        setField(term4079, term4079.getClass(), "rootNode", null);
        setField(term4079, term4079.getClass(), "parent", null);
        setField(term4081, term4081.getClass(), "language", "pt");
        setField(term4081, term4081.getClass(), "script", "");
        setField(term4081, term4081.getClass(), "region", "MO");
        setField(term4081, term4081.getClass(), "variant", "");
        setIntField(term4081, term4081.getClass(), "hash", 106966554);
        setField(term4080, term4080.getClass(), "baseLocale", term4081);
        setField(term4080, term4080.getClass(), "localeExtensions", null);
        setIntField(term4080, term4080.getClass(), "hashCodeValue", 106966554);
        setField(term4080, term4080.getClass(), "languageTag", null);
        setField(term4079, term4079.getClass(), "locale", term4080);
        term4090 = newInstance(Class.forName("java.util.Locale"));
        Object term4091 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term4091, term4091.getClass(), "language", "pt");
        setField(term4091, term4091.getClass(), "script", "");
        setField(term4091, term4091.getClass(), "region", "MO");
        setField(term4091, term4091.getClass(), "variant", "");
        setIntField(term4091, term4091.getClass(), "hash", 106966554);
        setField(term4090, term4090.getClass(), "baseLocale", term4091);
        setField(term4090, term4090.getClass(), "localeExtensions", null);
        setIntField(term4090, term4090.getClass(), "hashCodeValue", 106966554);
        setField(term4090, term4090.getClass(), "languageTag", null);
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
        assertTrue(recursiveEquals(instance, term4079));
        assertTrue(recursiveEquals(term1, null));
    }

};


