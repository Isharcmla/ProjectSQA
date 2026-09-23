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

public class XmlTreeBuilder_insert_504344543259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term415140;
     Object term415272;

    public XmlTreeBuilder_insert_504344543259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term415140 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term415206 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term415206, term415206.getClass(), "preserveTagCase", true);
        setField(term415140, term415140.getClass(), "settings", term415206);
        StringBuilder term415332 = new StringBuilder();
        StringBuilder term415392 = new StringBuilder();
        StringBuilder term415452 = new StringBuilder();
        term415272 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term415272, term415272.getClass(), "name", term415332);
        setField(term415272, term415272.getClass(), "publicIdentifier", term415392);
        setField(term415272, term415272.getClass(), "systemIdentifier", term415452);
        setField(term415272, term415272.getClass(), "pubSysKey", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Doctype");
        Object[] args = new Object[1];
        args[0] = term415272;
        try {
            callMethod(klass, "insert", argTypes, term415140, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


