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

public class XmlTreeBuilder_insert_504344543249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term380841;
     Object term380973;

    public XmlTreeBuilder_insert_504344543249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term380841 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term380907 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term380907, term380907.getClass(), "preserveTagCase", true);
        setField(term380841, term380841.getClass(), "settings", term380907);
        StringBuilder term381033 = new StringBuilder();
        StringBuilder term381093 = new StringBuilder();
        StringBuilder term381153 = new StringBuilder();
        term380973 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term380973, term380973.getClass(), "name", term381033);
        setField(term380973, term380973.getClass(), "publicIdentifier", term381093);
        setField(term380973, term380973.getClass(), "systemIdentifier", term381153);
        setField(term380973, term380973.getClass(), "pubSysKey", "systemId");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Doctype");
        Object[] args = new Object[1];
        args[0] = term380973;
        try {
            callMethod(klass, "insert", argTypes, term380841, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


