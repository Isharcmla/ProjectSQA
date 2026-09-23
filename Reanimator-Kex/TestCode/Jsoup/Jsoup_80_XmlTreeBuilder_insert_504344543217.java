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

public class XmlTreeBuilder_insert_504344543217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289239;
     Object term289371;

    public XmlTreeBuilder_insert_504344543217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term289239 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term289305 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term289305, term289305.getClass(), "preserveTagCase", false);
        setField(term289239, term289239.getClass(), "settings", term289305);
        StringBuilder term289431 = new StringBuilder();
        StringBuilder term289491 = new StringBuilder();
        StringBuilder term289551 = new StringBuilder();
        term289371 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term289371, term289371.getClass(), "name", term289431);
        setField(term289371, term289371.getClass(), "publicIdentifier", term289491);
        setField(term289371, term289371.getClass(), "systemIdentifier", term289551);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Doctype");
        Object[] args = new Object[1];
        args[0] = term289371;
        try {
            callMethod(klass, "insert", argTypes, term289239, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


