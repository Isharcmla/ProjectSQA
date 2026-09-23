package org.apache.commons.jxpath.ri.model;

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
import java.lang.reflect.InaccessibleObjectException;
import static org.apache.commons.jxpath.ri.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NodePointer_newNodePointer_84349902647 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term38;
     Object term39;

    public NodePointer_newNodePointer_84349902647() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term1, term1.getClass(), "prefix", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "name", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "qualifiedName", "MuLcgQHgqz");
        term38 = newInstance(Class.forName("java.lang.Object"));
        term39 = newInstance(Class.forName("java.util.Locale"));
        Object term40 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term40, term40.getClass(), "language", "pt");
        setField(term40, term40.getClass(), "script", "");
        setField(term40, term40.getClass(), "region", "MO");
        setField(term40, term40.getClass(), "variant", "");
        setIntField(term40, term40.getClass(), "hash", 106966554);
        setField(term39, term39.getClass(), "baseLocale", term40);
        setField(term39, term39.getClass(), "localeExtensions", null);
        setIntField(term39, term39.getClass(), "hashCodeValue", 106966554);
        setField(term39, term39.getClass(), "languageTag", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.QName");
        argTypes[1] = Class.forName("java.lang.Object");
        argTypes[2] = Class.forName("java.util.Locale");
        Object[] args = new Object[3];
        args[0] = term1;
        args[1] = term38;
        args[2] = term39;
        try {
            callMethod(klass, "newNodePointer", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


