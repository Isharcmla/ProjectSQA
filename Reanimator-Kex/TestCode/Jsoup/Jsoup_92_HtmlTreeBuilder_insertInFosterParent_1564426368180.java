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

public class HtmlTreeBuilder_insertInFosterParent_1564426368180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108899;

    public HtmlTreeBuilder_insertInFosterParent_1564426368180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108899 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term108899, term108899.getClass(), "state", null);
        setField(term108899, term108899.getClass(), "originalState", null);
        setBooleanField(term108899, term108899.getClass(), "baseUriSetFromDoc", false);
        setField(term108899, term108899.getClass(), "headElement", null);
        setField(term108899, term108899.getClass(), "formElement", null);
        setField(term108899, term108899.getClass(), "contextElement", null);
        setField(term108899, term108899.getClass(), "formattingElements", null);
        setField(term108899, term108899.getClass(), "pendingTableCharacters", null);
        setField(term108899, term108899.getClass(), "emptyEnd", null);
        setBooleanField(term108899, term108899.getClass(), "framesetOk", false);
        setBooleanField(term108899, term108899.getClass(), "fosterInserts", false);
        setBooleanField(term108899, term108899.getClass(), "fragmentParsing", false);
        setField(term108899, term108899.getClass(), "specificScopeTarget", null);
        setField(term108899, term108899.getClass(), "parser", null);
        setField(term108899, term108899.getClass(), "reader", null);
        setField(term108899, term108899.getClass(), "tokeniser", null);
        setField(term108899, term108899.getClass(), "doc", null);
        setField(term108899, term108899.getClass(), "stack", null);
        setField(term108899, term108899.getClass(), "baseUri", null);
        setField(term108899, term108899.getClass(), "currentToken", null);
        setField(term108899, term108899.getClass(), "settings", null);
        setField(term108899, term108899.getClass(), "start", null);
        setField(term108899, term108899.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Node");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "insertInFosterParent", argTypes, term108899, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


