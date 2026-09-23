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
     Object term3738;
     Object term3749;

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
        term3738 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term3739 = newInstance(Class.forName("java.util.Locale"));
        Object term3740 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term3738, term3738.getClass(), "node", null);
        setField(term3738, term3738.getClass(), "namespaces", null);
        setField(term3738, term3738.getClass(), "defaultNamespace", null);
        setField(term3738, term3738.getClass(), "id", null);
        setIntField(term3738, term3738.getClass(), "index", -2147483648);
        setBooleanField(term3738, term3738.getClass(), "attribute", false);
        setField(term3738, term3738.getClass(), "rootNode", null);
        setField(term3738, term3738.getClass(), "namespaceResolver", null);
        setField(term3738, term3738.getClass(), "parent", null);
        setField(term3740, term3740.getClass(), "language", "pt");
        setField(term3740, term3740.getClass(), "script", "");
        setField(term3740, term3740.getClass(), "region", "MO");
        setField(term3740, term3740.getClass(), "variant", "");
        setIntField(term3740, term3740.getClass(), "hash", 106966554);
        setField(term3739, term3739.getClass(), "baseLocale", term3740);
        setField(term3739, term3739.getClass(), "localeExtensions", null);
        setIntField(term3739, term3739.getClass(), "hashCodeValue", 106966554);
        setField(term3739, term3739.getClass(), "languageTag", null);
        setField(term3738, term3738.getClass(), "locale", term3739);
        term3749 = newInstance(Class.forName("java.util.Locale"));
        Object term3750 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term3750, term3750.getClass(), "language", "pt");
        setField(term3750, term3750.getClass(), "script", "");
        setField(term3750, term3750.getClass(), "region", "MO");
        setField(term3750, term3750.getClass(), "variant", "");
        setIntField(term3750, term3750.getClass(), "hash", 106966554);
        setField(term3749, term3749.getClass(), "baseLocale", term3750);
        setField(term3749, term3749.getClass(), "localeExtensions", null);
        setIntField(term3749, term3749.getClass(), "hashCodeValue", 106966554);
        setField(term3749, term3749.getClass(), "languageTag", null);
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
        assertTrue(recursiveEquals(instance, term3738));
        assertTrue(recursiveEquals(term1, null));
    }

};


