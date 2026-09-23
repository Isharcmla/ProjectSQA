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
     Object term105060;

    public HtmlTreeBuilder_insertInFosterParent_1564426368180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105060 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term105060, term105060.getClass(), "state", null);
        setField(term105060, term105060.getClass(), "originalState", null);
        setBooleanField(term105060, term105060.getClass(), "baseUriSetFromDoc", false);
        setField(term105060, term105060.getClass(), "headElement", null);
        setField(term105060, term105060.getClass(), "formElement", null);
        setField(term105060, term105060.getClass(), "contextElement", null);
        setField(term105060, term105060.getClass(), "formattingElements", null);
        setField(term105060, term105060.getClass(), "pendingTableCharacters", null);
        setField(term105060, term105060.getClass(), "emptyEnd", null);
        setBooleanField(term105060, term105060.getClass(), "framesetOk", false);
        setBooleanField(term105060, term105060.getClass(), "fosterInserts", false);
        setBooleanField(term105060, term105060.getClass(), "fragmentParsing", false);
        setField(term105060, term105060.getClass(), "specificScopeTarget", null);
        setField(term105060, term105060.getClass(), "parser", null);
        setField(term105060, term105060.getClass(), "reader", null);
        setField(term105060, term105060.getClass(), "tokeniser", null);
        setField(term105060, term105060.getClass(), "doc", null);
        setField(term105060, term105060.getClass(), "stack", null);
        setField(term105060, term105060.getClass(), "baseUri", null);
        setField(term105060, term105060.getClass(), "currentToken", null);
        setField(term105060, term105060.getClass(), "settings", null);
        setField(term105060, term105060.getClass(), "start", null);
        setField(term105060, term105060.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Node");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "insertInFosterParent", argTypes, term105060, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


