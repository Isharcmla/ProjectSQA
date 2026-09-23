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

public class XmlTreeBuilder_insert_50434454334 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term181102;
     Object term181234;

    public XmlTreeBuilder_insert_50434454334() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term181102 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term181168 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setField(term181102, term181102.getClass(), "settings", term181168);
        char[] term179536 = (char[]) newCharArray(489);
        StringBuilder term181294 = new StringBuilder();
        ((StringBuilder) term181294).append(term179536);
        term181234 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term181234, term181234.getClass(), "name", term181294);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Doctype");
        Object[] args = new Object[1];
        args[0] = term181234;
        try {
            callMethod(klass, "insert", argTypes, term181102, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


