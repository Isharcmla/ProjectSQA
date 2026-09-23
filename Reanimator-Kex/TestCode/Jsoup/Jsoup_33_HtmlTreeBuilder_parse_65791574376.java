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

public class HtmlTreeBuilder_parse_65791574376 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public HtmlTreeBuilder_parse_65791574376() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term1, term1.getClass(), "state", null);
        setField(term1, term1.getClass(), "originalState", null);
        setBooleanField(term1, term1.getClass(), "baseUriSetFromDoc", false);
        setField(term1, term1.getClass(), "headElement", null);
        setField(term1, term1.getClass(), "formElement", null);
        setField(term1, term1.getClass(), "contextElement", null);
        setField(term1, term1.getClass(), "formattingElements", null);
        setField(term1, term1.getClass(), "pendingTableCharacters", null);
        setBooleanField(term1, term1.getClass(), "framesetOk", false);
        setBooleanField(term1, term1.getClass(), "fosterInserts", false);
        setBooleanField(term1, term1.getClass(), "fragmentParsing", false);
        setField(term1, term1.getClass(), "reader", null);
        setField(term1, term1.getClass(), "tokeniser", null);
        setField(term1, term1.getClass(), "doc", null);
        setField(term1, term1.getClass(), "stack", null);
        setField(term1, term1.getClass(), "baseUri", null);
        setField(term1, term1.getClass(), "currentToken", null);
        setField(term1, term1.getClass(), "errors", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("org.jsoup.parser.ParseErrorList");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "parse", argTypes, term1, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


