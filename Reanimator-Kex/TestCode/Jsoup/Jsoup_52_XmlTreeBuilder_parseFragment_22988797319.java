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

public class XmlTreeBuilder_parseFragment_22988797319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20171;

    public XmlTreeBuilder_parseFragment_22988797319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20171 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term20171, term20171.getClass(), "reader", null);
        setField(term20171, term20171.getClass(), "tokeniser", null);
        setField(term20171, term20171.getClass(), "doc", null);
        setField(term20171, term20171.getClass(), "stack", null);
        setField(term20171, term20171.getClass(), "baseUri", null);
        setField(term20171, term20171.getClass(), "currentToken", null);
        setField(term20171, term20171.getClass(), "errors", null);
        setField(term20171, term20171.getClass(), "start", null);
        setField(term20171, term20171.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("org.jsoup.parser.ParseErrorList");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "parseFragment", argTypes, term20171, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


