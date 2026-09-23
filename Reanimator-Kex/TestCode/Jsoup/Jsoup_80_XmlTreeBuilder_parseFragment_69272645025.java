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

public class XmlTreeBuilder_parseFragment_69272645025 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77315;

    public XmlTreeBuilder_parseFragment_69272645025() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77315 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term77315, term77315.getClass(), "reader", null);
        setField(term77315, term77315.getClass(), "tokeniser", null);
        setField(term77315, term77315.getClass(), "doc", null);
        setField(term77315, term77315.getClass(), "stack", null);
        setField(term77315, term77315.getClass(), "baseUri", null);
        setField(term77315, term77315.getClass(), "currentToken", null);
        setField(term77315, term77315.getClass(), "errors", null);
        setField(term77315, term77315.getClass(), "settings", null);
        setField(term77315, term77315.getClass(), "start", null);
        setField(term77315, term77315.getClass(), "end", null);
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
            callMethod(klass, "parseFragment", argTypes, term77315, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


