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

public class XmlTreeBuilder_insert_504344543185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term264503;
     Object term264635;

    public XmlTreeBuilder_insert_504344543185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term264503 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term264569 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term264569, term264569.getClass(), "preserveTagCase", false);
        setField(term264503, term264503.getClass(), "settings", term264569);
        char[] term264342 = (char[]) newCharArray(1);
        StringBuilder term264695 = new StringBuilder();
        ((StringBuilder) term264695).append(term264342);
        StringBuilder term264755 = new StringBuilder();
        term264635 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term264635, term264635.getClass(), "name", term264695);
        setField(term264635, term264635.getClass(), "publicIdentifier", term264755);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Doctype");
        Object[] args = new Object[1];
        args[0] = term264635;
        try {
            callMethod(klass, "insert", argTypes, term264503, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


