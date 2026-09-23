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

public class XmlTreeBuilder_insert_504344543173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term293030;
     Object term293162;

    public XmlTreeBuilder_insert_504344543173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term293030 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term293096 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term293096, term293096.getClass(), "preserveTagCase", true);
        setField(term293030, term293030.getClass(), "settings", term293096);
        StringBuilder term293222 = new StringBuilder();
        StringBuilder term293282 = new StringBuilder();
        char[] term292647 = (char[]) newCharArray(16);
        setCharElement(term292647, 1, 'e');
        setCharElement(term292647, 2, 'e');
        setCharElement(term292647, 3, 'e');
        setCharElement(term292647, 4, 'e');
        setCharElement(term292647, 5, 'e');
        setCharElement(term292647, 6, 'e');
        setCharElement(term292647, 7, 'e');
        setCharElement(term292647, 8, 'e');
        setCharElement(term292647, 9, 'e');
        setCharElement(term292647, 10, 'e');
        setCharElement(term292647, 11, 'e');
        setCharElement(term292647, 12, 'e');
        setCharElement(term292647, 13, 'e');
        setCharElement(term292647, 14, 'e');
        setCharElement(term292647, 15, 'e');
        StringBuilder term293342 = new StringBuilder();
        ((StringBuilder) term293342).append(term292647);
        term293162 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term293162, term293162.getClass(), "name", term293222);
        setField(term293162, term293162.getClass(), "publicIdentifier", term293282);
        setField(term293162, term293162.getClass(), "systemIdentifier", term293342);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Doctype");
        Object[] args = new Object[1];
        args[0] = term293162;
        try {
            callMethod(klass, "insert", argTypes, term293030, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


