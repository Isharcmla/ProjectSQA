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
     Object term367346;
     Object term367478;

    public XmlTreeBuilder_insert_504344543227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term367346 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term367412 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term367412, term367412.getClass(), "preserveTagCase", true);
        setField(term367346, term367346.getClass(), "settings", term367412);
        StringBuilder term367538 = new StringBuilder();
        char[] term367053 = (char[]) newCharArray(1);
        StringBuilder term367598 = new StringBuilder();
        ((StringBuilder) term367598).append(term367053);
        StringBuilder term367658 = new StringBuilder();
        term367478 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term367478, term367478.getClass(), "name", term367538);
        setField(term367478, term367478.getClass(), "publicIdentifier", term367598);
        setField(term367478, term367478.getClass(), "systemIdentifier", term367658);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Doctype");
        Object[] args = new Object[1];
        args[0] = term367478;
        try {
            callMethod(klass, "insert", argTypes, term367346, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


