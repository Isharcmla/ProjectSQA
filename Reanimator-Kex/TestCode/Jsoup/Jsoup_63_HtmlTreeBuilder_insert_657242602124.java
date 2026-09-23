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

public class HtmlTreeBuilder_insert_657242602124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20936;

    public HtmlTreeBuilder_insert_657242602124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20936 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term20936, term20936.getClass(), "state", null);
        setField(term20936, term20936.getClass(), "originalState", null);
        setBooleanField(term20936, term20936.getClass(), "baseUriSetFromDoc", false);
        setField(term20936, term20936.getClass(), "headElement", null);
        setField(term20936, term20936.getClass(), "formElement", null);
        setField(term20936, term20936.getClass(), "contextElement", null);
        setField(term20936, term20936.getClass(), "formattingElements", null);
        setField(term20936, term20936.getClass(), "pendingTableCharacters", null);
        setField(term20936, term20936.getClass(), "emptyEnd", null);
        setBooleanField(term20936, term20936.getClass(), "framesetOk", false);
        setBooleanField(term20936, term20936.getClass(), "fosterInserts", false);
        setBooleanField(term20936, term20936.getClass(), "fragmentParsing", false);
        setField(term20936, term20936.getClass(), "specificScopeTarget", null);
        setField(term20936, term20936.getClass(), "reader", null);
        setField(term20936, term20936.getClass(), "tokeniser", null);
        setField(term20936, term20936.getClass(), "doc", null);
        setField(term20936, term20936.getClass(), "stack", null);
        setField(term20936, term20936.getClass(), "baseUri", null);
        setField(term20936, term20936.getClass(), "currentToken", null);
        setField(term20936, term20936.getClass(), "errors", null);
        setField(term20936, term20936.getClass(), "settings", null);
        setField(term20936, term20936.getClass(), "start", null);
        setField(term20936, term20936.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$StartTag");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "insert", argTypes, term20936, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


