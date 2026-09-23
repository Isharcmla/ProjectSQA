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

public class HtmlTreeBuilder_parseFragment_132567692877 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6;

    public HtmlTreeBuilder_parseFragment_132567692877() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term6, term6.getClass(), "state", null);
        setField(term6, term6.getClass(), "originalState", null);
        setBooleanField(term6, term6.getClass(), "baseUriSetFromDoc", false);
        setField(term6, term6.getClass(), "headElement", null);
        setField(term6, term6.getClass(), "formElement", null);
        setField(term6, term6.getClass(), "contextElement", null);
        setField(term6, term6.getClass(), "formattingElements", null);
        setField(term6, term6.getClass(), "pendingTableCharacters", null);
        setBooleanField(term6, term6.getClass(), "framesetOk", false);
        setBooleanField(term6, term6.getClass(), "fosterInserts", false);
        setBooleanField(term6, term6.getClass(), "fragmentParsing", false);
        setField(term6, term6.getClass(), "reader", null);
        setField(term6, term6.getClass(), "tokeniser", null);
        setField(term6, term6.getClass(), "doc", null);
        setField(term6, term6.getClass(), "stack", null);
        setField(term6, term6.getClass(), "baseUri", null);
        setField(term6, term6.getClass(), "currentToken", null);
        setField(term6, term6.getClass(), "errors", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.jsoup.nodes.Element");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("org.jsoup.parser.ParseErrorList");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        try {
            callMethod(klass, "parseFragment", argTypes, term6, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


