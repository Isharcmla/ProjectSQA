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

public class XmlTreeBuilder_insert_504344543151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term268354;
     Object term268486;

    public XmlTreeBuilder_insert_504344543151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term268354 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term268420 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term268420, term268420.getClass(), "preserveTagCase", true);
        setField(term268354, term268354.getClass(), "settings", term268420);
        StringBuilder term268546 = new StringBuilder();
        StringBuilder term268606 = new StringBuilder();
        StringBuilder term268666 = new StringBuilder();
        term268486 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term268486, term268486.getClass(), "name", term268546);
        setField(term268486, term268486.getClass(), "publicIdentifier", term268606);
        setField(term268486, term268486.getClass(), "systemIdentifier", term268666);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Doctype");
        Object[] args = new Object[1];
        args[0] = term268486;
        try {
            callMethod(klass, "insert", argTypes, term268354, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


