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

public class DOMNodePointer_init_50384583545 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21;
     Object term3812;
     Object term3825;

    public DOMNodePointer_init_50384583545() {
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
        term3812 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term3815 = newInstance(Class.forName("java.util.Locale"));
        Object term3816 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term3812, term3812.getClass(), "node", null);
        setField(term3812, term3812.getClass(), "namespaces", null);
        setField(term3812, term3812.getClass(), "defaultNamespace", null);
        setField(term3812, term3812.getClass(), "id", "PAEBtnZtTD");
        setIntField(term3812, term3812.getClass(), "index", -2147483648);
        setBooleanField(term3812, term3812.getClass(), "attribute", false);
        setField(term3812, term3812.getClass(), "rootNode", null);
        setField(term3812, term3812.getClass(), "namespaceResolver", null);
        setField(term3812, term3812.getClass(), "parent", null);
        setField(term3816, term3816.getClass(), "language", "ps");
        setField(term3816, term3816.getClass(), "script", "");
        setField(term3816, term3816.getClass(), "region", "");
        setField(term3816, term3816.getClass(), "variant", "");
        setIntField(term3816, term3816.getClass(), "hash", 106860317);
        setField(term3815, term3815.getClass(), "baseLocale", term3816);
        setField(term3815, term3815.getClass(), "localeExtensions", null);
        setIntField(term3815, term3815.getClass(), "hashCodeValue", 106860317);
        setField(term3815, term3815.getClass(), "languageTag", null);
        setField(term3812, term3812.getClass(), "locale", term3815);
        term3825 = newInstance(Class.forName("java.util.Locale"));
        Object term3826 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term3826, term3826.getClass(), "language", "ps");
        setField(term3826, term3826.getClass(), "script", "");
        setField(term3826, term3826.getClass(), "region", "");
        setField(term3826, term3826.getClass(), "variant", "");
        setIntField(term3826, term3826.getClass(), "hash", 106860317);
        setField(term3825, term3825.getClass(), "baseLocale", term3826);
        setField(term3825, term3825.getClass(), "localeExtensions", null);
        setIntField(term3825, term3825.getClass(), "hashCodeValue", 106860317);
        setField(term3825, term3825.getClass(), "languageTag", null);
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
        assertTrue(recursiveEquals(instance, term3812));
        assertTrue(recursiveEquals(term21, null));
    }

};


