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

public class XmlTreeBuilder_insert_504344543381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term354420;
     Object term354552;

    public XmlTreeBuilder_insert_504344543381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term354420 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term354486 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term354486, term354486.getClass(), "preserveTagCase", true);
        setField(term354420, term354420.getClass(), "settings", term354486);
        char[] term354138 = (char[]) newCharArray(41);
        StringBuilder term354612 = new StringBuilder();
        ((StringBuilder) term354612).append(term354138);
        term354552 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term354552, term354552.getClass(), "name", term354612);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Doctype");
        Object[] args = new Object[1];
        args[0] = term354552;
        try {
            callMethod(klass, "insert", argTypes, term354420, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


