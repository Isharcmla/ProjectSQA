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
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.parser.EqualityUtils.*;
import java.util.ArrayList;

public class HtmlTreeBuilder_removeFromActiveFormattingElements_1580466725287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term331954;
     Object term332017;

    public HtmlTreeBuilder_removeFromActiveFormattingElements_1580466725287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term332006 = new ArrayList();
        term331954 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term331954, term331954.getClass(), "formattingElements", term332006);
        ArrayList term332018 = new ArrayList();
        term332017 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term332017, term332017.getClass(), "state", null);
        setField(term332017, term332017.getClass(), "originalState", null);
        setBooleanField(term332017, term332017.getClass(), "baseUriSetFromDoc", false);
        setField(term332017, term332017.getClass(), "headElement", null);
        setField(term332017, term332017.getClass(), "formElement", null);
        setField(term332017, term332017.getClass(), "contextElement", null);
        setField(term332017, term332017.getClass(), "formattingElements", term332018);
        setField(term332017, term332017.getClass(), "pendingTableCharacters", null);
        setField(term332017, term332017.getClass(), "emptyEnd", null);
        setBooleanField(term332017, term332017.getClass(), "framesetOk", false);
        setBooleanField(term332017, term332017.getClass(), "fosterInserts", false);
        setBooleanField(term332017, term332017.getClass(), "fragmentParsing", false);
        setField(term332017, term332017.getClass(), "specificScopeTarget", null);
        setField(term332017, term332017.getClass(), "parser", null);
        setField(term332017, term332017.getClass(), "reader", null);
        setField(term332017, term332017.getClass(), "tokeniser", null);
        setField(term332017, term332017.getClass(), "doc", null);
        setField(term332017, term332017.getClass(), "stack", null);
        setField(term332017, term332017.getClass(), "baseUri", null);
        setField(term332017, term332017.getClass(), "currentToken", null);
        setField(term332017, term332017.getClass(), "settings", null);
        setField(term332017, term332017.getClass(), "start", null);
        setField(term332017, term332017.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "removeFromActiveFormattingElements", argTypes, term331954, args);
        assertTrue(recursiveEquals(term331954, term332017));
    }

};


