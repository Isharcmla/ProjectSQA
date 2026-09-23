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

public class XmlTreeBuilder_insert_504344543569 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term432322;
     Object term432454;

    public XmlTreeBuilder_insert_504344543569() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term432322 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term432388 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term432388, term432388.getClass(), "preserveTagCase", true);
        setField(term432322, term432322.getClass(), "settings", term432388);
        char[] term430236 = (char[]) newCharArray(489);
        StringBuilder term432514 = new StringBuilder();
        ((StringBuilder) term432514).append(term430236);
        char[] term432202 = (char[]) newCharArray(1);
        StringBuilder term432574 = new StringBuilder();
        ((StringBuilder) term432574).append(term432202);
        StringBuilder term432634 = new StringBuilder();
        term432454 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term432454, term432454.getClass(), "name", term432514);
        setField(term432454, term432454.getClass(), "publicIdentifier", term432574);
        setField(term432454, term432454.getClass(), "systemIdentifier", term432634);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Doctype");
        Object[] args = new Object[1];
        args[0] = term432454;
        try {
            callMethod(klass, "insert", argTypes, term432322, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


