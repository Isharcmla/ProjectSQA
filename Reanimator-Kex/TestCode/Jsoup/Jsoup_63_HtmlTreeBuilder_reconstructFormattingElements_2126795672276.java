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

public class HtmlTreeBuilder_reconstructFormattingElements_2126795672276 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term226335;
     Object term226425;

    public HtmlTreeBuilder_reconstructFormattingElements_2126795672276() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term226387 = new ArrayList();
        term226335 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term226335, term226335.getClass(), "formattingElements", term226387);
        ArrayList term226426 = new ArrayList();
        term226425 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term226425, term226425.getClass(), "state", null);
        setField(term226425, term226425.getClass(), "originalState", null);
        setBooleanField(term226425, term226425.getClass(), "baseUriSetFromDoc", false);
        setField(term226425, term226425.getClass(), "headElement", null);
        setField(term226425, term226425.getClass(), "formElement", null);
        setField(term226425, term226425.getClass(), "contextElement", null);
        setField(term226425, term226425.getClass(), "formattingElements", term226426);
        setField(term226425, term226425.getClass(), "pendingTableCharacters", null);
        setField(term226425, term226425.getClass(), "emptyEnd", null);
        setBooleanField(term226425, term226425.getClass(), "framesetOk", false);
        setBooleanField(term226425, term226425.getClass(), "fosterInserts", false);
        setBooleanField(term226425, term226425.getClass(), "fragmentParsing", false);
        setField(term226425, term226425.getClass(), "specificScopeTarget", null);
        setField(term226425, term226425.getClass(), "reader", null);
        setField(term226425, term226425.getClass(), "tokeniser", null);
        setField(term226425, term226425.getClass(), "doc", null);
        setField(term226425, term226425.getClass(), "stack", null);
        setField(term226425, term226425.getClass(), "baseUri", null);
        setField(term226425, term226425.getClass(), "currentToken", null);
        setField(term226425, term226425.getClass(), "errors", null);
        setField(term226425, term226425.getClass(), "settings", null);
        setField(term226425, term226425.getClass(), "start", null);
        setField(term226425, term226425.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "reconstructFormattingElements", argTypes, term226335, args);
        assertTrue(recursiveEquals(term226335, term226425));
    }

};


