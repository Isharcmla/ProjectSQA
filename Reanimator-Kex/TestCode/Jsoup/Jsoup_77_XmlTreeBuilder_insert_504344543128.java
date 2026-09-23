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

public class XmlTreeBuilder_insert_504344543128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term238792;
     Object term238924;

    public XmlTreeBuilder_insert_504344543128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term238792 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term238858 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term238858, term238858.getClass(), "preserveTagCase", true);
        setField(term238792, term238792.getClass(), "settings", term238858);
        char[] term236706 = (char[]) newCharArray(489);
        StringBuilder term238984 = new StringBuilder();
        ((StringBuilder) term238984).append(term236706);
        char[] term238672 = (char[]) newCharArray(1);
        StringBuilder term239044 = new StringBuilder();
        ((StringBuilder) term239044).append(term238672);
        StringBuilder term239104 = new StringBuilder();
        term238924 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term238924, term238924.getClass(), "name", term238984);
        setField(term238924, term238924.getClass(), "publicIdentifier", term239044);
        setField(term238924, term238924.getClass(), "systemIdentifier", term239104);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Doctype");
        Object[] args = new Object[1];
        args[0] = term238924;
        try {
            callMethod(klass, "insert", argTypes, term238792, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


