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

public class XmlTreeBuilder_insert_504344543268 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term318353;
     Object term318485;

    public XmlTreeBuilder_insert_504344543268() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term318353 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term318419 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term318419, term318419.getClass(), "preserveTagCase", false);
        setField(term318353, term318353.getClass(), "settings", term318419);
        StringBuilder term318545 = new StringBuilder();
        char[] term317547 = (char[]) newCharArray(64);
        setCharElement(term317547, 1, 'S');
        setCharElement(term317547, 2, 'S');
        setCharElement(term317547, 3, 'S');
        setCharElement(term317547, 4, 'S');
        setCharElement(term317547, 5, 'S');
        setCharElement(term317547, 6, 'S');
        setCharElement(term317547, 7, 'S');
        setCharElement(term317547, 8, 'S');
        setCharElement(term317547, 9, 'S');
        setCharElement(term317547, 10, 'S');
        setCharElement(term317547, 11, 'S');
        setCharElement(term317547, 12, 'S');
        setCharElement(term317547, 13, 'S');
        setCharElement(term317547, 14, 'S');
        setCharElement(term317547, 15, 'S');
        setCharElement(term317547, 16, 'S');
        setCharElement(term317547, 17, 'S');
        setCharElement(term317547, 18, 'S');
        setCharElement(term317547, 19, 'S');
        setCharElement(term317547, 20, 'S');
        setCharElement(term317547, 21, 'S');
        setCharElement(term317547, 22, 'S');
        setCharElement(term317547, 23, 'S');
        setCharElement(term317547, 24, 'S');
        setCharElement(term317547, 25, 'S');
        setCharElement(term317547, 26, 'S');
        setCharElement(term317547, 27, 'S');
        setCharElement(term317547, 28, 'S');
        setCharElement(term317547, 29, 'S');
        setCharElement(term317547, 30, 'S');
        setCharElement(term317547, 31, 'S');
        setCharElement(term317547, 32, 'S');
        setCharElement(term317547, 33, 'S');
        setCharElement(term317547, 34, 'S');
        setCharElement(term317547, 35, 'S');
        setCharElement(term317547, 36, 'S');
        setCharElement(term317547, 37, 'S');
        setCharElement(term317547, 38, 'S');
        setCharElement(term317547, 39, 'S');
        setCharElement(term317547, 40, 'S');
        setCharElement(term317547, 41, 'S');
        setCharElement(term317547, 42, 'S');
        setCharElement(term317547, 43, 'S');
        setCharElement(term317547, 44, 'S');
        setCharElement(term317547, 45, 'S');
        setCharElement(term317547, 46, 'S');
        setCharElement(term317547, 47, 'S');
        setCharElement(term317547, 48, 'S');
        setCharElement(term317547, 49, 'S');
        setCharElement(term317547, 50, 'S');
        setCharElement(term317547, 51, 'S');
        setCharElement(term317547, 52, 'S');
        setCharElement(term317547, 53, 'S');
        setCharElement(term317547, 54, 'S');
        setCharElement(term317547, 55, 'S');
        setCharElement(term317547, 56, 'S');
        setCharElement(term317547, 57, 'S');
        setCharElement(term317547, 58, 'S');
        setCharElement(term317547, 59, 'S');
        setCharElement(term317547, 60, 'S');
        setCharElement(term317547, 61, 'S');
        setCharElement(term317547, 62, 'S');
        setCharElement(term317547, 63, 'S');
        StringBuilder term318605 = new StringBuilder();
        ((StringBuilder) term318605).append(term317547);
        StringBuilder term318665 = new StringBuilder();
        term318485 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term318485, term318485.getClass(), "name", term318545);
        setField(term318485, term318485.getClass(), "publicIdentifier", term318605);
        setField(term318485, term318485.getClass(), "systemIdentifier", term318665);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Doctype");
        Object[] args = new Object[1];
        args[0] = term318485;
        try {
            callMethod(klass, "insert", argTypes, term318353, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


