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

public class XmlTreeBuilder_insert_504344543213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term286978;
     Object term287110;

    public XmlTreeBuilder_insert_504344543213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term286978 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term287044 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term287044, term287044.getClass(), "preserveTagCase", false);
        setField(term286978, term286978.getClass(), "settings", term287044);
        StringBuilder term287170 = new StringBuilder();
        char[] term286662 = (char[]) newCharArray(0);
        StringBuilder term287230 = new StringBuilder();
        ((StringBuilder) term287230).append(term286662);
        StringBuilder term287290 = new StringBuilder();
        term287110 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term287110, term287110.getClass(), "name", term287170);
        setField(term287110, term287110.getClass(), "publicIdentifier", term287230);
        setField(term287110, term287110.getClass(), "systemIdentifier", term287290);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Doctype");
        Object[] args = new Object[1];
        args[0] = term287110;
        try {
            callMethod(klass, "insert", argTypes, term286978, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


