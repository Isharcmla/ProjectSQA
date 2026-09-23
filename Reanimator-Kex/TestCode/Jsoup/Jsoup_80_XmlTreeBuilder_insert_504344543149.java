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

public class XmlTreeBuilder_insert_504344543149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term246261;
     Object term246393;

    public XmlTreeBuilder_insert_504344543149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term246261 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term246327 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term246327, term246327.getClass(), "preserveTagCase", false);
        setField(term246261, term246261.getClass(), "settings", term246327);
        char[] term246100 = (char[]) newCharArray(1);
        StringBuilder term246453 = new StringBuilder();
        ((StringBuilder) term246453).append(term246100);
        StringBuilder term246513 = new StringBuilder();
        term246393 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term246393, term246393.getClass(), "name", term246453);
        setField(term246393, term246393.getClass(), "publicIdentifier", term246513);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Doctype");
        Object[] args = new Object[1];
        args[0] = term246393;
        try {
            callMethod(klass, "insert", argTypes, term246261, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


