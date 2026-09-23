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

public class XmlTreeBuilder_insert_504344543177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term295472;
     Object term295604;

    public XmlTreeBuilder_insert_504344543177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term295472 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term295538 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term295538, term295538.getClass(), "preserveTagCase", true);
        setField(term295472, term295472.getClass(), "settings", term295538);
        char[] term295077 = (char[]) newCharArray(0);
        StringBuilder term295664 = new StringBuilder();
        ((StringBuilder) term295664).append(term295077);
        StringBuilder term295724 = new StringBuilder();
        StringBuilder term295784 = new StringBuilder();
        ((StringBuilder) term295784).append(term295077);
        term295604 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term295604, term295604.getClass(), "name", term295664);
        setField(term295604, term295604.getClass(), "publicIdentifier", term295724);
        setField(term295604, term295604.getClass(), "systemIdentifier", term295784);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Doctype");
        Object[] args = new Object[1];
        args[0] = term295604;
        try {
            callMethod(klass, "insert", argTypes, term295472, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


