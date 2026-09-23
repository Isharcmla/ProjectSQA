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

public class XmlTreeBuilder_insert_504344543227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term295388;
     Object term295520;

    public XmlTreeBuilder_insert_504344543227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term295388 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term295454 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term295454, term295454.getClass(), "preserveTagCase", false);
        setField(term295388, term295388.getClass(), "settings", term295454);
        StringBuilder term295580 = new StringBuilder();
        StringBuilder term295640 = new StringBuilder();
        StringBuilder term295700 = new StringBuilder();
        term295520 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term295520, term295520.getClass(), "name", term295580);
        setField(term295520, term295520.getClass(), "publicIdentifier", term295640);
        setField(term295520, term295520.getClass(), "systemIdentifier", term295700);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Doctype");
        Object[] args = new Object[1];
        args[0] = term295520;
        try {
            callMethod(klass, "insert", argTypes, term295388, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


