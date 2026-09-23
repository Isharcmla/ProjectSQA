package org.jsoup.parser;

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
import java.lang.NullPointerException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.StringBuilder;

public class XmlTreeBuilder_insert_504344543135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104302;
     Object term104368;

    public XmlTreeBuilder_insert_504344543135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term104302 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        StringBuilder term104428 = new StringBuilder();
        term104368 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term104368, term104368.getClass(), "name", term104428);
        setField(term104368, term104368.getClass(), "publicIdentifier", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Doctype");
        Object[] args = new Object[1];
        args[0] = term104368;
        try {
            callMethod(klass, "insert", argTypes, term104302, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


