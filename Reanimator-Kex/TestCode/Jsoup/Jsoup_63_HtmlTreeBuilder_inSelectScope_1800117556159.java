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

public class HtmlTreeBuilder_inSelectScope_1800117556159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68328;

    public HtmlTreeBuilder_inSelectScope_1800117556159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68328 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term68328, term68328.getClass(), "state", null);
        setField(term68328, term68328.getClass(), "originalState", null);
        setBooleanField(term68328, term68328.getClass(), "baseUriSetFromDoc", false);
        setField(term68328, term68328.getClass(), "headElement", null);
        setField(term68328, term68328.getClass(), "formElement", null);
        setField(term68328, term68328.getClass(), "contextElement", null);
        setField(term68328, term68328.getClass(), "formattingElements", null);
        setField(term68328, term68328.getClass(), "pendingTableCharacters", null);
        setField(term68328, term68328.getClass(), "emptyEnd", null);
        setBooleanField(term68328, term68328.getClass(), "framesetOk", false);
        setBooleanField(term68328, term68328.getClass(), "fosterInserts", false);
        setBooleanField(term68328, term68328.getClass(), "fragmentParsing", false);
        setField(term68328, term68328.getClass(), "specificScopeTarget", null);
        setField(term68328, term68328.getClass(), "reader", null);
        setField(term68328, term68328.getClass(), "tokeniser", null);
        setField(term68328, term68328.getClass(), "doc", null);
        setField(term68328, term68328.getClass(), "stack", null);
        setField(term68328, term68328.getClass(), "baseUri", null);
        setField(term68328, term68328.getClass(), "currentToken", null);
        setField(term68328, term68328.getClass(), "errors", null);
        setField(term68328, term68328.getClass(), "settings", null);
        setField(term68328, term68328.getClass(), "start", null);
        setField(term68328, term68328.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "inSelectScope", argTypes, term68328, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


