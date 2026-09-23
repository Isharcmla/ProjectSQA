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

public class XmlTreeBuilder_insert_50434454340 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term183232;
     Object term183364;

    public XmlTreeBuilder_insert_50434454340() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term183232 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term183298 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setField(term183232, term183232.getClass(), "settings", term183298);
        char[] term181666 = (char[]) newCharArray(489);
        StringBuilder term183424 = new StringBuilder();
        ((StringBuilder) term183424).append(term181666);
        term183364 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term183364, term183364.getClass(), "name", term183424);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Doctype");
        Object[] args = new Object[1];
        args[0] = term183364;
        try {
            callMethod(klass, "insert", argTypes, term183232, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


