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

public class DOMNodePointer_init_50384583546 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21;
     Object term4133;
     Object term4146;

    public DOMNodePointer_init_50384583546() {
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
        term4133 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term4136 = newInstance(Class.forName("java.util.Locale"));
        Object term4137 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term4133, term4133.getClass(), "node", null);
        setField(term4133, term4133.getClass(), "namespaces", null);
        setField(term4133, term4133.getClass(), "defaultNamespace", null);
        setField(term4133, term4133.getClass(), "id", "PAEBtnZtTD");
        setField(term4133, term4133.getClass(), "localNamespaceResolver", null);
        setIntField(term4133, term4133.getClass(), "index", -2147483648);
        setBooleanField(term4133, term4133.getClass(), "attribute", false);
        setField(term4133, term4133.getClass(), "rootNode", null);
        setField(term4133, term4133.getClass(), "namespaceResolver", null);
        setField(term4133, term4133.getClass(), "parent", null);
        setField(term4137, term4137.getClass(), "language", "ps");
        setField(term4137, term4137.getClass(), "script", "");
        setField(term4137, term4137.getClass(), "region", "");
        setField(term4137, term4137.getClass(), "variant", "");
        setIntField(term4137, term4137.getClass(), "hash", 106860317);
        setField(term4136, term4136.getClass(), "baseLocale", term4137);
        setField(term4136, term4136.getClass(), "localeExtensions", null);
        setIntField(term4136, term4136.getClass(), "hashCodeValue", 106860317);
        setField(term4136, term4136.getClass(), "languageTag", null);
        setField(term4133, term4133.getClass(), "locale", term4136);
        term4146 = newInstance(Class.forName("java.util.Locale"));
        Object term4147 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term4147, term4147.getClass(), "language", "ps");
        setField(term4147, term4147.getClass(), "script", "");
        setField(term4147, term4147.getClass(), "region", "");
        setField(term4147, term4147.getClass(), "variant", "");
        setIntField(term4147, term4147.getClass(), "hash", 106860317);
        setField(term4146, term4146.getClass(), "baseLocale", term4147);
        setField(term4146, term4146.getClass(), "localeExtensions", null);
        setIntField(term4146, term4146.getClass(), "hashCodeValue", 106860317);
        setField(term4146, term4146.getClass(), "languageTag", null);
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
        assertTrue(recursiveEquals(instance, term4133));
        assertTrue(recursiveEquals(term21, null));
    }

};


