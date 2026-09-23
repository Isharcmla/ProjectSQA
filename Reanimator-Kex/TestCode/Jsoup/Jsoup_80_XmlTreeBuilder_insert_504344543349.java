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

public class XmlTreeBuilder_insert_504344543349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term353915;
     Object term354047;

    public XmlTreeBuilder_insert_504344543349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term353915 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term353981 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term353981, term353981.getClass(), "preserveTagCase", false);
        setField(term353915, term353915.getClass(), "settings", term353981);
        StringBuilder term354107 = new StringBuilder();
        char[] term353570 = (char[]) newCharArray(1);
        StringBuilder term354167 = new StringBuilder();
        ((StringBuilder) term354167).append(term353570);
        char[] term353576 = (char[]) newCharArray(0);
        StringBuilder term354227 = new StringBuilder();
        ((StringBuilder) term354227).append(term353576);
        term354047 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term354047, term354047.getClass(), "name", term354107);
        setField(term354047, term354047.getClass(), "publicIdentifier", term354167);
        setField(term354047, term354047.getClass(), "systemIdentifier", term354227);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Doctype");
        Object[] args = new Object[1];
        args[0] = term354047;
        try {
            callMethod(klass, "insert", argTypes, term353915, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


