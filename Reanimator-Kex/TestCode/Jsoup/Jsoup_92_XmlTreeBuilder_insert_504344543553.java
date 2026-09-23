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

public class XmlTreeBuilder_insert_504344543553 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term425160;
     Object term425292;

    public XmlTreeBuilder_insert_504344543553() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term425160 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term425226 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term425226, term425226.getClass(), "preserveTagCase", true);
        setField(term425160, term425160.getClass(), "settings", term425226);
        char[] term424424 = (char[]) newCharArray(32);
        StringBuilder term425352 = new StringBuilder();
        ((StringBuilder) term425352).append(term424424);
        StringBuilder term425412 = new StringBuilder();
        term425292 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term425292, term425292.getClass(), "name", term425352);
        setField(term425292, term425292.getClass(), "publicIdentifier", term425412);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Doctype");
        Object[] args = new Object[1];
        args[0] = term425292;
        try {
            callMethod(klass, "insert", argTypes, term425160, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


