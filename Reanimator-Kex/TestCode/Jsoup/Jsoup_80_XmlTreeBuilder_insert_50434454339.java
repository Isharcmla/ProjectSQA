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

public class XmlTreeBuilder_insert_50434454339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term181181;
     Object term181313;

    public XmlTreeBuilder_insert_50434454339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term181181 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term181247 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setField(term181181, term181181.getClass(), "settings", term181247);
        char[] term179615 = (char[]) newCharArray(489);
        StringBuilder term181373 = new StringBuilder();
        ((StringBuilder) term181373).append(term179615);
        term181313 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term181313, term181313.getClass(), "name", term181373);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Doctype");
        Object[] args = new Object[1];
        args[0] = term181313;
        try {
            callMethod(klass, "insert", argTypes, term181181, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


