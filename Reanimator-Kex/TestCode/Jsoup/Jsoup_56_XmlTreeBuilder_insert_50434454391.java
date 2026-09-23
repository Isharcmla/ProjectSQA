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
import java.lang.IllegalArgumentException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.StringBuilder;

public class XmlTreeBuilder_insert_50434454391 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113187;
     Object term113319;

    public XmlTreeBuilder_insert_50434454391() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term113187 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term113253 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term113253, term113253.getClass(), "preserveTagCase", true);
        setField(term113187, term113187.getClass(), "settings", term113253);
        setField(term113187, term113187.getClass(), "baseUri", null);
        char[] term112301 = (char[]) newCharArray(10);
        StringBuilder term113379 = new StringBuilder();
        ((StringBuilder) term113379).append(term112301);
        char[] term112353 = (char[]) newCharArray(233);
        StringBuilder term113439 = new StringBuilder();
        ((StringBuilder) term113439).append(term112353);
        char[] term113056 = (char[]) newCharArray(1);
        StringBuilder term113499 = new StringBuilder();
        ((StringBuilder) term113499).append(term113056);
        term113319 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term113319, term113319.getClass(), "name", term113379);
        setField(term113319, term113319.getClass(), "publicIdentifier", term113439);
        setField(term113319, term113319.getClass(), "systemIdentifier", term113499);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Doctype");
        Object[] args = new Object[1];
        args[0] = term113319;
        try {
            callMethod(klass, "insert", argTypes, term113187, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


