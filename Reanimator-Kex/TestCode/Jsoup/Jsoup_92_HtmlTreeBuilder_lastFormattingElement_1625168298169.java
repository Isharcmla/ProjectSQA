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

public class HtmlTreeBuilder_lastFormattingElement_1625168298169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92741;

    public HtmlTreeBuilder_lastFormattingElement_1625168298169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term92741 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term92741, term92741.getClass(), "state", null);
        setField(term92741, term92741.getClass(), "originalState", null);
        setBooleanField(term92741, term92741.getClass(), "baseUriSetFromDoc", false);
        setField(term92741, term92741.getClass(), "headElement", null);
        setField(term92741, term92741.getClass(), "formElement", null);
        setField(term92741, term92741.getClass(), "contextElement", null);
        setField(term92741, term92741.getClass(), "formattingElements", null);
        setField(term92741, term92741.getClass(), "pendingTableCharacters", null);
        setField(term92741, term92741.getClass(), "emptyEnd", null);
        setBooleanField(term92741, term92741.getClass(), "framesetOk", false);
        setBooleanField(term92741, term92741.getClass(), "fosterInserts", false);
        setBooleanField(term92741, term92741.getClass(), "fragmentParsing", false);
        setField(term92741, term92741.getClass(), "specificScopeTarget", null);
        setField(term92741, term92741.getClass(), "parser", null);
        setField(term92741, term92741.getClass(), "reader", null);
        setField(term92741, term92741.getClass(), "tokeniser", null);
        setField(term92741, term92741.getClass(), "doc", null);
        setField(term92741, term92741.getClass(), "stack", null);
        setField(term92741, term92741.getClass(), "baseUri", null);
        setField(term92741, term92741.getClass(), "currentToken", null);
        setField(term92741, term92741.getClass(), "settings", null);
        setField(term92741, term92741.getClass(), "start", null);
        setField(term92741, term92741.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "lastFormattingElement", argTypes, term92741, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


