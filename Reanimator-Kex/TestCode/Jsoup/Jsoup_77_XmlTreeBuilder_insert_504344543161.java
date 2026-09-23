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

public class XmlTreeBuilder_insert_504344543161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term284988;
     Object term285120;

    public XmlTreeBuilder_insert_504344543161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term284988 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term285054 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term285054, term285054.getClass(), "preserveTagCase", true);
        setField(term284988, term284988.getClass(), "settings", term285054);
        StringBuilder term285180 = new StringBuilder();
        char[] term284598 = (char[]) newCharArray(4);
        setCharElement(term284598, 0, (char) 64);
        setCharElement(term284598, 1, 'S');
        setCharElement(term284598, 2, 'S');
        setCharElement(term284598, 3, 'S');
        StringBuilder term285240 = new StringBuilder();
        ((StringBuilder) term285240).append(term284598);
        StringBuilder term285300 = new StringBuilder();
        term285120 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term285120, term285120.getClass(), "name", term285180);
        setField(term285120, term285120.getClass(), "publicIdentifier", term285240);
        setField(term285120, term285120.getClass(), "systemIdentifier", term285300);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Doctype");
        Object[] args = new Object[1];
        args[0] = term285120;
        try {
            callMethod(klass, "insert", argTypes, term284988, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


