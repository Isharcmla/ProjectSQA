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
import java.lang.Boolean;

public class HtmlTreeBuilder_insertForm_605839044126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30368;
     Object term30373;

    public HtmlTreeBuilder_insertForm_605839044126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30368 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term30368, term30368.getClass(), "state", null);
        setField(term30368, term30368.getClass(), "originalState", null);
        setBooleanField(term30368, term30368.getClass(), "baseUriSetFromDoc", false);
        setField(term30368, term30368.getClass(), "headElement", null);
        setField(term30368, term30368.getClass(), "formElement", null);
        setField(term30368, term30368.getClass(), "contextElement", null);
        setField(term30368, term30368.getClass(), "formattingElements", null);
        setField(term30368, term30368.getClass(), "pendingTableCharacters", null);
        setField(term30368, term30368.getClass(), "emptyEnd", null);
        setBooleanField(term30368, term30368.getClass(), "framesetOk", false);
        setBooleanField(term30368, term30368.getClass(), "fosterInserts", false);
        setBooleanField(term30368, term30368.getClass(), "fragmentParsing", false);
        setField(term30368, term30368.getClass(), "specificScopeTarget", null);
        setField(term30368, term30368.getClass(), "parser", null);
        setField(term30368, term30368.getClass(), "reader", null);
        setField(term30368, term30368.getClass(), "tokeniser", null);
        setField(term30368, term30368.getClass(), "doc", null);
        setField(term30368, term30368.getClass(), "stack", null);
        setField(term30368, term30368.getClass(), "baseUri", null);
        setField(term30368, term30368.getClass(), "currentToken", null);
        setField(term30368, term30368.getClass(), "settings", null);
        setField(term30368, term30368.getClass(), "start", null);
        setField(term30368, term30368.getClass(), "end", null);
        term30373 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$StartTag");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term30373;
        try {
            callMethod(klass, "insertForm", argTypes, term30368, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


