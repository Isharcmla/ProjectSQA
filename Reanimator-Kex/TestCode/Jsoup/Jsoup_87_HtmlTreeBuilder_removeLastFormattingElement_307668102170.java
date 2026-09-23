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

public class HtmlTreeBuilder_removeLastFormattingElement_307668102170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90721;

    public HtmlTreeBuilder_removeLastFormattingElement_307668102170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90721 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term90721, term90721.getClass(), "state", null);
        setField(term90721, term90721.getClass(), "originalState", null);
        setBooleanField(term90721, term90721.getClass(), "baseUriSetFromDoc", false);
        setField(term90721, term90721.getClass(), "headElement", null);
        setField(term90721, term90721.getClass(), "formElement", null);
        setField(term90721, term90721.getClass(), "contextElement", null);
        setField(term90721, term90721.getClass(), "formattingElements", null);
        setField(term90721, term90721.getClass(), "pendingTableCharacters", null);
        setField(term90721, term90721.getClass(), "emptyEnd", null);
        setBooleanField(term90721, term90721.getClass(), "framesetOk", false);
        setBooleanField(term90721, term90721.getClass(), "fosterInserts", false);
        setBooleanField(term90721, term90721.getClass(), "fragmentParsing", false);
        setField(term90721, term90721.getClass(), "specificScopeTarget", null);
        setField(term90721, term90721.getClass(), "parser", null);
        setField(term90721, term90721.getClass(), "reader", null);
        setField(term90721, term90721.getClass(), "tokeniser", null);
        setField(term90721, term90721.getClass(), "doc", null);
        setField(term90721, term90721.getClass(), "stack", null);
        setField(term90721, term90721.getClass(), "baseUri", null);
        setField(term90721, term90721.getClass(), "currentToken", null);
        setField(term90721, term90721.getClass(), "settings", null);
        setField(term90721, term90721.getClass(), "start", null);
        setField(term90721, term90721.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "removeLastFormattingElement", argTypes, term90721, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


