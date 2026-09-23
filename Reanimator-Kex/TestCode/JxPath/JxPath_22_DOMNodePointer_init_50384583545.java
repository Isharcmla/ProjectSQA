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
     Object term4153;
     Object term4166;

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
        term4153 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term4156 = newInstance(Class.forName("java.util.Locale"));
        Object term4157 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term4153, term4153.getClass(), "node", null);
        setField(term4153, term4153.getClass(), "namespaces", null);
        setField(term4153, term4153.getClass(), "defaultNamespace", null);
        setField(term4153, term4153.getClass(), "id", "PAEBtnZtTD");
        setField(term4153, term4153.getClass(), "localNamespaceResolver", null);
        setIntField(term4153, term4153.getClass(), "index", -2147483648);
        setBooleanField(term4153, term4153.getClass(), "attribute", false);
        setField(term4153, term4153.getClass(), "namespaceResolver", null);
        setField(term4153, term4153.getClass(), "exceptionHandler", null);
        setField(term4153, term4153.getClass(), "rootNode", null);
        setField(term4153, term4153.getClass(), "parent", null);
        setField(term4157, term4157.getClass(), "language", "ps");
        setField(term4157, term4157.getClass(), "script", "");
        setField(term4157, term4157.getClass(), "region", "");
        setField(term4157, term4157.getClass(), "variant", "");
        setIntField(term4157, term4157.getClass(), "hash", 106860317);
        setField(term4156, term4156.getClass(), "baseLocale", term4157);
        setField(term4156, term4156.getClass(), "localeExtensions", null);
        setIntField(term4156, term4156.getClass(), "hashCodeValue", 106860317);
        setField(term4156, term4156.getClass(), "languageTag", null);
        setField(term4153, term4153.getClass(), "locale", term4156);
        term4166 = newInstance(Class.forName("java.util.Locale"));
        Object term4167 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term4167, term4167.getClass(), "language", "ps");
        setField(term4167, term4167.getClass(), "script", "");
        setField(term4167, term4167.getClass(), "region", "");
        setField(term4167, term4167.getClass(), "variant", "");
        setIntField(term4167, term4167.getClass(), "hash", 106860317);
        setField(term4166, term4166.getClass(), "baseLocale", term4167);
        setField(term4166, term4166.getClass(), "localeExtensions", null);
        setIntField(term4166, term4166.getClass(), "hashCodeValue", 106860317);
        setField(term4166, term4166.getClass(), "languageTag", null);
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
        assertTrue(recursiveEquals(instance, term4153));
        assertTrue(recursiveEquals(term21, null));
    }

};


