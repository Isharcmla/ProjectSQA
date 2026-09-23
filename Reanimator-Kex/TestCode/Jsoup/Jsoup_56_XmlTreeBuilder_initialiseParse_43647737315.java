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

public class XmlTreeBuilder_initialiseParse_43647737315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7043;

    public XmlTreeBuilder_initialiseParse_43647737315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7043 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term7043, term7043.getClass(), "reader", null);
        setField(term7043, term7043.getClass(), "tokeniser", null);
        setField(term7043, term7043.getClass(), "doc", null);
        setField(term7043, term7043.getClass(), "stack", null);
        setField(term7043, term7043.getClass(), "baseUri", null);
        setField(term7043, term7043.getClass(), "currentToken", null);
        setField(term7043, term7043.getClass(), "errors", null);
        setField(term7043, term7043.getClass(), "settings", null);
        setField(term7043, term7043.getClass(), "start", null);
        setField(term7043, term7043.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("org.jsoup.parser.ParseErrorList");
        argTypes[3] = Class.forName("org.jsoup.parser.ParseSettings");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        try {
            callMethod(klass, "initialiseParse", argTypes, term7043, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


