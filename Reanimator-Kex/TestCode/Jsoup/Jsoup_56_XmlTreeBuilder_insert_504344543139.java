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

public class XmlTreeBuilder_insert_504344543139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term178121;
     Object term178253;

    public XmlTreeBuilder_insert_504344543139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term178121 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term178187 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term178187, term178187.getClass(), "preserveTagCase", false);
        setField(term178121, term178121.getClass(), "settings", term178187);
        char[] term177483 = (char[]) newCharArray(0);
        StringBuilder term178313 = new StringBuilder();
        ((StringBuilder) term178313).append(term177483);
        StringBuilder term178373 = new StringBuilder();
        term178253 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term178253, term178253.getClass(), "name", term178313);
        setField(term178253, term178253.getClass(), "publicIdentifier", term178373);
        Object term178411 = newInstance(Class.forName("java.util.Locale"));
        setField(null, Class.forName("java.util.Locale"), "defaultLocale", term178411);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Doctype");
        Object[] args = new Object[1];
        args[0] = term178253;
        try {
            callMethod(klass, "insert", argTypes, term178121, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


