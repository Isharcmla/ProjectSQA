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

public class XmlTreeBuilder_insert_504344543225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term293928;
     Object term294060;

    public XmlTreeBuilder_insert_504344543225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term293928 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term293994 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term293994, term293994.getClass(), "preserveTagCase", false);
        setField(term293928, term293928.getClass(), "settings", term293994);
        StringBuilder term294120 = new StringBuilder();
        StringBuilder term294180 = new StringBuilder();
        StringBuilder term294240 = new StringBuilder();
        term294060 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term294060, term294060.getClass(), "name", term294120);
        setField(term294060, term294060.getClass(), "publicIdentifier", term294180);
        setField(term294060, term294060.getClass(), "systemIdentifier", term294240);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Doctype");
        Object[] args = new Object[1];
        args[0] = term294060;
        try {
            callMethod(klass, "insert", argTypes, term293928, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


