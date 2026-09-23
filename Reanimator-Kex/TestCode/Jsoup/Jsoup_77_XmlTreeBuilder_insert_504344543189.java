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

public class XmlTreeBuilder_insert_504344543189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term327953;
     Object term328085;

    public XmlTreeBuilder_insert_504344543189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term327953 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term328019 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term328019, term328019.getClass(), "preserveTagCase", false);
        setField(term327953, term327953.getClass(), "settings", term328019);
        char[] term327792 = (char[]) newCharArray(1);
        StringBuilder term328145 = new StringBuilder();
        ((StringBuilder) term328145).append(term327792);
        StringBuilder term328205 = new StringBuilder();
        term328085 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term328085, term328085.getClass(), "name", term328145);
        setField(term328085, term328085.getClass(), "publicIdentifier", term328205);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Doctype");
        Object[] args = new Object[1];
        args[0] = term328085;
        try {
            callMethod(klass, "insert", argTypes, term327953, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


