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

public class XmlTreeBuilder_insert_504344543198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term272236;
     Object term272368;

    public XmlTreeBuilder_insert_504344543198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term272236 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term272302 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term272302, term272302.getClass(), "preserveTagCase", false);
        setField(term272236, term272236.getClass(), "settings", term272302);
        char[] term271670 = (char[]) newCharArray(1);
        setCharElement(term271670, 0, (char) 4);
        StringBuilder term272428 = new StringBuilder();
        ((StringBuilder) term272428).append(term271670);
        char[] term271689 = (char[]) newCharArray(128);
        setCharElement(term271689, 0, (char) 1);
        setCharElement(term271689, 1, 'e');
        setCharElement(term271689, 2, 'e');
        setCharElement(term271689, 3, 'e');
        setCharElement(term271689, 4, 'e');
        setCharElement(term271689, 5, 'e');
        setCharElement(term271689, 6, 'e');
        setCharElement(term271689, 7, 'e');
        setCharElement(term271689, 8, 'e');
        setCharElement(term271689, 9, 'e');
        setCharElement(term271689, 10, 'e');
        setCharElement(term271689, 11, 'e');
        setCharElement(term271689, 12, 'e');
        setCharElement(term271689, 13, 'e');
        setCharElement(term271689, 14, 'e');
        setCharElement(term271689, 15, 'e');
        setCharElement(term271689, 16, 'e');
        setCharElement(term271689, 17, 'e');
        setCharElement(term271689, 18, 'e');
        setCharElement(term271689, 19, 'e');
        setCharElement(term271689, 20, 'e');
        setCharElement(term271689, 21, 'e');
        setCharElement(term271689, 22, 'e');
        setCharElement(term271689, 23, 'e');
        setCharElement(term271689, 24, 'e');
        setCharElement(term271689, 25, 'e');
        setCharElement(term271689, 26, 'e');
        setCharElement(term271689, 27, 'e');
        setCharElement(term271689, 28, 'e');
        setCharElement(term271689, 29, 'e');
        setCharElement(term271689, 30, 'e');
        setCharElement(term271689, 31, 'e');
        setCharElement(term271689, 32, 'e');
        setCharElement(term271689, 33, 'e');
        setCharElement(term271689, 34, 'e');
        setCharElement(term271689, 35, 'e');
        setCharElement(term271689, 36, 'e');
        setCharElement(term271689, 37, 'e');
        setCharElement(term271689, 38, 'e');
        setCharElement(term271689, 39, 'e');
        setCharElement(term271689, 40, 'e');
        setCharElement(term271689, 41, 'e');
        setCharElement(term271689, 42, 'e');
        setCharElement(term271689, 43, 'e');
        setCharElement(term271689, 44, 'e');
        setCharElement(term271689, 45, 'e');
        setCharElement(term271689, 46, 'e');
        setCharElement(term271689, 47, 'e');
        setCharElement(term271689, 48, 'e');
        setCharElement(term271689, 49, 'e');
        setCharElement(term271689, 50, 'e');
        setCharElement(term271689, 51, 'e');
        setCharElement(term271689, 52, 'e');
        setCharElement(term271689, 53, 'e');
        setCharElement(term271689, 54, 'e');
        setCharElement(term271689, 55, 'e');
        setCharElement(term271689, 56, 'e');
        setCharElement(term271689, 57, 'e');
        setCharElement(term271689, 58, 'e');
        setCharElement(term271689, 59, 'e');
        setCharElement(term271689, 60, 'e');
        setCharElement(term271689, 61, 'e');
        setCharElement(term271689, 62, 'e');
        setCharElement(term271689, 63, 'e');
        setCharElement(term271689, 64, 'e');
        setCharElement(term271689, 65, 'e');
        setCharElement(term271689, 66, 'e');
        setCharElement(term271689, 67, 'e');
        setCharElement(term271689, 68, 'e');
        setCharElement(term271689, 69, 'e');
        setCharElement(term271689, 70, 'e');
        setCharElement(term271689, 71, 'e');
        setCharElement(term271689, 72, 'e');
        setCharElement(term271689, 73, 'e');
        setCharElement(term271689, 74, 'e');
        setCharElement(term271689, 75, 'e');
        setCharElement(term271689, 76, 'e');
        setCharElement(term271689, 77, 'e');
        setCharElement(term271689, 78, 'e');
        setCharElement(term271689, 79, 'e');
        setCharElement(term271689, 80, 'e');
        setCharElement(term271689, 81, 'e');
        setCharElement(term271689, 82, 'e');
        setCharElement(term271689, 83, 'e');
        setCharElement(term271689, 84, 'e');
        setCharElement(term271689, 85, 'e');
        setCharElement(term271689, 86, 'e');
        setCharElement(term271689, 87, 'e');
        setCharElement(term271689, 88, 'e');
        setCharElement(term271689, 89, 'e');
        setCharElement(term271689, 90, 'e');
        setCharElement(term271689, 91, 'e');
        setCharElement(term271689, 92, 'e');
        setCharElement(term271689, 93, 'e');
        setCharElement(term271689, 94, 'e');
        setCharElement(term271689, 95, 'e');
        setCharElement(term271689, 96, 'e');
        setCharElement(term271689, 97, 'e');
        setCharElement(term271689, 98, 'e');
        setCharElement(term271689, 99, 'e');
        setCharElement(term271689, 100, 'e');
        setCharElement(term271689, 101, 'e');
        setCharElement(term271689, 102, 'e');
        setCharElement(term271689, 103, 'e');
        setCharElement(term271689, 104, 'e');
        setCharElement(term271689, 105, 'e');
        setCharElement(term271689, 106, 'e');
        setCharElement(term271689, 107, 'e');
        setCharElement(term271689, 108, 'e');
        setCharElement(term271689, 109, 'e');
        setCharElement(term271689, 110, 'e');
        setCharElement(term271689, 111, 'e');
        setCharElement(term271689, 112, 'e');
        setCharElement(term271689, 113, 'e');
        setCharElement(term271689, 114, 'e');
        setCharElement(term271689, 115, 'e');
        setCharElement(term271689, 116, 'e');
        setCharElement(term271689, 117, 'e');
        setCharElement(term271689, 118, 'e');
        setCharElement(term271689, 119, 'e');
        setCharElement(term271689, 120, 'e');
        setCharElement(term271689, 121, 'e');
        setCharElement(term271689, 122, 'e');
        setCharElement(term271689, 123, 'e');
        setCharElement(term271689, 124, 'e');
        setCharElement(term271689, 125, 'e');
        setCharElement(term271689, 126, 'e');
        setCharElement(term271689, 127, 'e');
        StringBuilder term272488 = new StringBuilder();
        ((StringBuilder) term272488).append(term271689);
        StringBuilder term272548 = new StringBuilder();
        term272368 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term272368, term272368.getClass(), "name", term272428);
        setField(term272368, term272368.getClass(), "publicIdentifier", term272488);
        setField(term272368, term272368.getClass(), "systemIdentifier", term272548);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Doctype");
        Object[] args = new Object[1];
        args[0] = term272368;
        try {
            callMethod(klass, "insert", argTypes, term272236, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


