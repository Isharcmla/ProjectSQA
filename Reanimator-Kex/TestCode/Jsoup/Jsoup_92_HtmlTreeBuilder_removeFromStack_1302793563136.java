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

public class HtmlTreeBuilder_removeFromStack_1302793563136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45322;

    public HtmlTreeBuilder_removeFromStack_1302793563136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45322 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term45322, term45322.getClass(), "state", null);
        setField(term45322, term45322.getClass(), "originalState", null);
        setBooleanField(term45322, term45322.getClass(), "baseUriSetFromDoc", false);
        setField(term45322, term45322.getClass(), "headElement", null);
        setField(term45322, term45322.getClass(), "formElement", null);
        setField(term45322, term45322.getClass(), "contextElement", null);
        setField(term45322, term45322.getClass(), "formattingElements", null);
        setField(term45322, term45322.getClass(), "pendingTableCharacters", null);
        setField(term45322, term45322.getClass(), "emptyEnd", null);
        setBooleanField(term45322, term45322.getClass(), "framesetOk", false);
        setBooleanField(term45322, term45322.getClass(), "fosterInserts", false);
        setBooleanField(term45322, term45322.getClass(), "fragmentParsing", false);
        setField(term45322, term45322.getClass(), "specificScopeTarget", null);
        setField(term45322, term45322.getClass(), "parser", null);
        setField(term45322, term45322.getClass(), "reader", null);
        setField(term45322, term45322.getClass(), "tokeniser", null);
        setField(term45322, term45322.getClass(), "doc", null);
        setField(term45322, term45322.getClass(), "stack", null);
        setField(term45322, term45322.getClass(), "baseUri", null);
        setField(term45322, term45322.getClass(), "currentToken", null);
        setField(term45322, term45322.getClass(), "settings", null);
        setField(term45322, term45322.getClass(), "start", null);
        setField(term45322, term45322.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "removeFromStack", argTypes, term45322, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


