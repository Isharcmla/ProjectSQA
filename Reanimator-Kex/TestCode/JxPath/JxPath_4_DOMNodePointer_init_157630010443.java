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
     Object term3716;
     Object term3727;

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
        term3716 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term3717 = newInstance(Class.forName("java.util.Locale"));
        Object term3718 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term3716, term3716.getClass(), "node", null);
        setField(term3716, term3716.getClass(), "namespaces", null);
        setField(term3716, term3716.getClass(), "defaultNamespace", null);
        setField(term3716, term3716.getClass(), "id", null);
        setIntField(term3716, term3716.getClass(), "index", -2147483648);
        setBooleanField(term3716, term3716.getClass(), "attribute", false);
        setField(term3716, term3716.getClass(), "rootNode", null);
        setField(term3716, term3716.getClass(), "namespaceResolver", null);
        setField(term3716, term3716.getClass(), "parent", null);
        setField(term3718, term3718.getClass(), "language", "pt");
        setField(term3718, term3718.getClass(), "script", "");
        setField(term3718, term3718.getClass(), "region", "MO");
        setField(term3718, term3718.getClass(), "variant", "");
        setIntField(term3718, term3718.getClass(), "hash", 106966554);
        setField(term3717, term3717.getClass(), "baseLocale", term3718);
        setField(term3717, term3717.getClass(), "localeExtensions", null);
        setIntField(term3717, term3717.getClass(), "hashCodeValue", 106966554);
        setField(term3717, term3717.getClass(), "languageTag", null);
        setField(term3716, term3716.getClass(), "locale", term3717);
        term3727 = newInstance(Class.forName("java.util.Locale"));
        Object term3728 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term3728, term3728.getClass(), "language", "pt");
        setField(term3728, term3728.getClass(), "script", "");
        setField(term3728, term3728.getClass(), "region", "MO");
        setField(term3728, term3728.getClass(), "variant", "");
        setIntField(term3728, term3728.getClass(), "hash", 106966554);
        setField(term3727, term3727.getClass(), "baseLocale", term3728);
        setField(term3727, term3727.getClass(), "localeExtensions", null);
        setIntField(term3727, term3727.getClass(), "hashCodeValue", 106966554);
        setField(term3727, term3727.getClass(), "languageTag", null);
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
        assertTrue(recursiveEquals(instance, term3716));
        assertTrue(recursiveEquals(term1, null));
    }

};


