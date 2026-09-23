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
import java.util.ArrayList;
import java.lang.StringBuilder;

public class XmlTreeBuilder_insert_504344543261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term417021;
     Object term417205;

    public XmlTreeBuilder_insert_504344543261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term417139 = new ArrayList();
        term417021 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term417087 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term417087, term417087.getClass(), "preserveTagCase", true);
        setField(term417021, term417021.getClass(), "settings", term417087);
        setField(term417021, term417021.getClass(), "stack", term417139);
        StringBuilder term417265 = new StringBuilder();
        StringBuilder term417325 = new StringBuilder();
        char[] term416601 = (char[]) newCharArray(0);
        StringBuilder term417385 = new StringBuilder();
        ((StringBuilder) term417385).append(term416601);
        term417205 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term417205, term417205.getClass(), "name", term417265);
        setField(term417205, term417205.getClass(), "publicIdentifier", term417325);
        setField(term417205, term417205.getClass(), "systemIdentifier", term417385);
        setField(term417205, term417205.getClass(), "pubSysKey", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Doctype");
        Object[] args = new Object[1];
        args[0] = term417205;
        try {
            callMethod(klass, "insert", argTypes, term417021, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


