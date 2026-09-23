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
import java.lang.StringBuilder;

public class XmlTreeBuilder_insert_196792529253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48630;
     Object term48696;

    public XmlTreeBuilder_insert_196792529253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48630 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term48630, term48630.getClass(), "baseUri", null);
        char[] term47061 = (char[]) newCharArray(489);
        StringBuilder term48756 = new StringBuilder();
        ((StringBuilder) term48756).append(term47061);
        term48696 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term48696, term48696.getClass(), "data", term48756);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Comment");
        Object[] args = new Object[1];
        args[0] = term48696;
        try {
            callMethod(klass, "insert", argTypes, term48630, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


