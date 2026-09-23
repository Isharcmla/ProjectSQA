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
import java.lang.Object;
import java.lang.StringBuilder;

public class XmlTreeBuilder_insert_504344543244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term302697;
     Object term302829;

    public XmlTreeBuilder_insert_504344543244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term302697 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term302763 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term302763, term302763.getClass(), "preserveTagCase", false);
        setField(term302697, term302697.getClass(), "settings", term302763);
        StringBuilder term302889 = new StringBuilder();
        StringBuilder term302949 = new StringBuilder();
        StringBuilder term303009 = new StringBuilder();
        term302829 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term302829, term302829.getClass(), "name", term302889);
        setField(term302829, term302829.getClass(), "publicIdentifier", term302949);
        setField(term302829, term302829.getClass(), "systemIdentifier", term303009);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Doctype");
        Object[] args = new Object[1];
        args[0] = term302829;
        try {
            callMethod(klass, "insert", argTypes, term302697, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


