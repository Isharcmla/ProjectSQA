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

public class HtmlTreeBuilder_removeFromActiveFormattingElements_1580466725297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term475026;
     Object term475089;

    public HtmlTreeBuilder_removeFromActiveFormattingElements_1580466725297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term475078 = new ArrayList();
        term475026 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term475026, term475026.getClass(), "formattingElements", term475078);
        ArrayList term475090 = new ArrayList();
        term475089 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term475089, term475089.getClass(), "state", null);
        setField(term475089, term475089.getClass(), "originalState", null);
        setBooleanField(term475089, term475089.getClass(), "baseUriSetFromDoc", false);
        setField(term475089, term475089.getClass(), "headElement", null);
        setField(term475089, term475089.getClass(), "formElement", null);
        setField(term475089, term475089.getClass(), "contextElement", null);
        setField(term475089, term475089.getClass(), "formattingElements", term475090);
        setField(term475089, term475089.getClass(), "pendingTableCharacters", null);
        setField(term475089, term475089.getClass(), "emptyEnd", null);
        setBooleanField(term475089, term475089.getClass(), "framesetOk", false);
        setBooleanField(term475089, term475089.getClass(), "fosterInserts", false);
        setBooleanField(term475089, term475089.getClass(), "fragmentParsing", false);
        setField(term475089, term475089.getClass(), "specificScopeTarget", null);
        setField(term475089, term475089.getClass(), "parser", null);
        setField(term475089, term475089.getClass(), "reader", null);
        setField(term475089, term475089.getClass(), "tokeniser", null);
        setField(term475089, term475089.getClass(), "doc", null);
        setField(term475089, term475089.getClass(), "stack", null);
        setField(term475089, term475089.getClass(), "baseUri", null);
        setField(term475089, term475089.getClass(), "currentToken", null);
        setField(term475089, term475089.getClass(), "settings", null);
        setField(term475089, term475089.getClass(), "start", null);
        setField(term475089, term475089.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "removeFromActiveFormattingElements", argTypes, term475026, args);
        assertTrue(recursiveEquals(term475026, term475089));
    }

};


