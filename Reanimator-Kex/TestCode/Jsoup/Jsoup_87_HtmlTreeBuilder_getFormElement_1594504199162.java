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

public class HtmlTreeBuilder_getFormElement_1594504199162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80108;
     Object term362003;

    public HtmlTreeBuilder_getFormElement_1594504199162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80108 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term80108, term80108.getClass(), "state", null);
        setField(term80108, term80108.getClass(), "originalState", null);
        setBooleanField(term80108, term80108.getClass(), "baseUriSetFromDoc", false);
        setField(term80108, term80108.getClass(), "headElement", null);
        setField(term80108, term80108.getClass(), "formElement", null);
        setField(term80108, term80108.getClass(), "contextElement", null);
        setField(term80108, term80108.getClass(), "formattingElements", null);
        setField(term80108, term80108.getClass(), "pendingTableCharacters", null);
        setField(term80108, term80108.getClass(), "emptyEnd", null);
        setBooleanField(term80108, term80108.getClass(), "framesetOk", false);
        setBooleanField(term80108, term80108.getClass(), "fosterInserts", false);
        setBooleanField(term80108, term80108.getClass(), "fragmentParsing", false);
        setField(term80108, term80108.getClass(), "specificScopeTarget", null);
        setField(term80108, term80108.getClass(), "parser", null);
        setField(term80108, term80108.getClass(), "reader", null);
        setField(term80108, term80108.getClass(), "tokeniser", null);
        setField(term80108, term80108.getClass(), "doc", null);
        setField(term80108, term80108.getClass(), "stack", null);
        setField(term80108, term80108.getClass(), "baseUri", null);
        setField(term80108, term80108.getClass(), "currentToken", null);
        setField(term80108, term80108.getClass(), "settings", null);
        setField(term80108, term80108.getClass(), "start", null);
        setField(term80108, term80108.getClass(), "end", null);
        term362003 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term362003, term362003.getClass(), "state", null);
        setField(term362003, term362003.getClass(), "originalState", null);
        setBooleanField(term362003, term362003.getClass(), "baseUriSetFromDoc", false);
        setField(term362003, term362003.getClass(), "headElement", null);
        setField(term362003, term362003.getClass(), "formElement", null);
        setField(term362003, term362003.getClass(), "contextElement", null);
        setField(term362003, term362003.getClass(), "formattingElements", null);
        setField(term362003, term362003.getClass(), "pendingTableCharacters", null);
        setField(term362003, term362003.getClass(), "emptyEnd", null);
        setBooleanField(term362003, term362003.getClass(), "framesetOk", false);
        setBooleanField(term362003, term362003.getClass(), "fosterInserts", false);
        setBooleanField(term362003, term362003.getClass(), "fragmentParsing", false);
        setField(term362003, term362003.getClass(), "specificScopeTarget", null);
        setField(term362003, term362003.getClass(), "parser", null);
        setField(term362003, term362003.getClass(), "reader", null);
        setField(term362003, term362003.getClass(), "tokeniser", null);
        setField(term362003, term362003.getClass(), "doc", null);
        setField(term362003, term362003.getClass(), "stack", null);
        setField(term362003, term362003.getClass(), "baseUri", null);
        setField(term362003, term362003.getClass(), "currentToken", null);
        setField(term362003, term362003.getClass(), "settings", null);
        setField(term362003, term362003.getClass(), "start", null);
        setField(term362003, term362003.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getFormElement", argTypes, term80108, args);
        assertTrue(recursiveEquals(term80108, term362003));
        assertTrue(recursiveEquals(retValue, null));
    }

};


