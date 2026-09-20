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
     Object term3628;
     Object term3639;

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
        term3628 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term3629 = newInstance(Class.forName("java.util.Locale"));
        Object term3630 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term3628, term3628.getClass(), "node", null);
        setField(term3628, term3628.getClass(), "namespaces", null);
        setField(term3628, term3628.getClass(), "defaultNamespace", null);
        setField(term3628, term3628.getClass(), "id", null);
        setIntField(term3628, term3628.getClass(), "index", -2147483648);
        setBooleanField(term3628, term3628.getClass(), "attribute", false);
        setField(term3628, term3628.getClass(), "rootNode", null);
        setField(term3628, term3628.getClass(), "namespaceResolver", null);
        setField(term3628, term3628.getClass(), "parent", null);
        setField(term3630, term3630.getClass(), "language", "pt");
        setField(term3630, term3630.getClass(), "script", "");
        setField(term3630, term3630.getClass(), "region", "MO");
        setField(term3630, term3630.getClass(), "variant", "");
        setIntField(term3630, term3630.getClass(), "hash", 106966554);
        setField(term3629, term3629.getClass(), "baseLocale", term3630);
        setField(term3629, term3629.getClass(), "localeExtensions", null);
        setIntField(term3629, term3629.getClass(), "hashCodeValue", 106966554);
        setField(term3629, term3629.getClass(), "languageTag", null);
        setField(term3628, term3628.getClass(), "locale", term3629);
        term3639 = newInstance(Class.forName("java.util.Locale"));
        Object term3640 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term3640, term3640.getClass(), "language", "pt");
        setField(term3640, term3640.getClass(), "script", "");
        setField(term3640, term3640.getClass(), "region", "MO");
        setField(term3640, term3640.getClass(), "variant", "");
        setIntField(term3640, term3640.getClass(), "hash", 106966554);
        setField(term3639, term3639.getClass(), "baseLocale", term3640);
        setField(term3639, term3639.getClass(), "localeExtensions", null);
        setIntField(term3639, term3639.getClass(), "hashCodeValue", 106966554);
        setField(term3639, term3639.getClass(), "languageTag", null);
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
        assertTrue(recursiveEquals(instance, term3628));
        assertTrue(recursiveEquals(term1, null));
    }

};
