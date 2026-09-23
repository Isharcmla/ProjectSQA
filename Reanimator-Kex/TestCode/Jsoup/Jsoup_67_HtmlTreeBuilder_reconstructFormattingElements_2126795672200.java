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

public class HtmlTreeBuilder_reconstructFormattingElements_2126795672200 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term196509;
     Object term196599;

    public HtmlTreeBuilder_reconstructFormattingElements_2126795672200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term196561 = new ArrayList();
        term196509 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term196509, term196509.getClass(), "formattingElements", term196561);
        ArrayList term196600 = new ArrayList();
        term196599 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term196599, term196599.getClass(), "state", null);
        setField(term196599, term196599.getClass(), "originalState", null);
        setBooleanField(term196599, term196599.getClass(), "baseUriSetFromDoc", false);
        setField(term196599, term196599.getClass(), "headElement", null);
        setField(term196599, term196599.getClass(), "formElement", null);
        setField(term196599, term196599.getClass(), "contextElement", null);
        setField(term196599, term196599.getClass(), "formattingElements", term196600);
        setField(term196599, term196599.getClass(), "pendingTableCharacters", null);
        setField(term196599, term196599.getClass(), "emptyEnd", null);
        setBooleanField(term196599, term196599.getClass(), "framesetOk", false);
        setBooleanField(term196599, term196599.getClass(), "fosterInserts", false);
        setBooleanField(term196599, term196599.getClass(), "fragmentParsing", false);
        setField(term196599, term196599.getClass(), "specificScopeTarget", null);
        setField(term196599, term196599.getClass(), "reader", null);
        setField(term196599, term196599.getClass(), "tokeniser", null);
        setField(term196599, term196599.getClass(), "doc", null);
        setField(term196599, term196599.getClass(), "stack", null);
        setField(term196599, term196599.getClass(), "baseUri", null);
        setField(term196599, term196599.getClass(), "currentToken", null);
        setField(term196599, term196599.getClass(), "errors", null);
        setField(term196599, term196599.getClass(), "settings", null);
        setField(term196599, term196599.getClass(), "start", null);
        setField(term196599, term196599.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "reconstructFormattingElements", argTypes, term196509, args);
        assertTrue(recursiveEquals(term196509, term196599));
    }

};


