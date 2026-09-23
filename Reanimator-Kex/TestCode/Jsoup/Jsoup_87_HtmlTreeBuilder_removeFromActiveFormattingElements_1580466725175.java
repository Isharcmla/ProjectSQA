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

public class HtmlTreeBuilder_removeFromActiveFormattingElements_1580466725175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97758;

    public HtmlTreeBuilder_removeFromActiveFormattingElements_1580466725175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97758 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term97758, term97758.getClass(), "state", null);
        setField(term97758, term97758.getClass(), "originalState", null);
        setBooleanField(term97758, term97758.getClass(), "baseUriSetFromDoc", false);
        setField(term97758, term97758.getClass(), "headElement", null);
        setField(term97758, term97758.getClass(), "formElement", null);
        setField(term97758, term97758.getClass(), "contextElement", null);
        setField(term97758, term97758.getClass(), "formattingElements", null);
        setField(term97758, term97758.getClass(), "pendingTableCharacters", null);
        setField(term97758, term97758.getClass(), "emptyEnd", null);
        setBooleanField(term97758, term97758.getClass(), "framesetOk", false);
        setBooleanField(term97758, term97758.getClass(), "fosterInserts", false);
        setBooleanField(term97758, term97758.getClass(), "fragmentParsing", false);
        setField(term97758, term97758.getClass(), "specificScopeTarget", null);
        setField(term97758, term97758.getClass(), "parser", null);
        setField(term97758, term97758.getClass(), "reader", null);
        setField(term97758, term97758.getClass(), "tokeniser", null);
        setField(term97758, term97758.getClass(), "doc", null);
        setField(term97758, term97758.getClass(), "stack", null);
        setField(term97758, term97758.getClass(), "baseUri", null);
        setField(term97758, term97758.getClass(), "currentToken", null);
        setField(term97758, term97758.getClass(), "settings", null);
        setField(term97758, term97758.getClass(), "start", null);
        setField(term97758, term97758.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "removeFromActiveFormattingElements", argTypes, term97758, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


