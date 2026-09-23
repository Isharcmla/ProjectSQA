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

public class HtmlTreeBuilder_removeFromActiveFormattingElements_1580466725178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94109;

    public HtmlTreeBuilder_removeFromActiveFormattingElements_1580466725178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94109 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term94109, term94109.getClass(), "state", null);
        setField(term94109, term94109.getClass(), "originalState", null);
        setBooleanField(term94109, term94109.getClass(), "baseUriSetFromDoc", false);
        setField(term94109, term94109.getClass(), "headElement", null);
        setField(term94109, term94109.getClass(), "formElement", null);
        setField(term94109, term94109.getClass(), "contextElement", null);
        setField(term94109, term94109.getClass(), "formattingElements", null);
        setField(term94109, term94109.getClass(), "pendingTableCharacters", null);
        setField(term94109, term94109.getClass(), "emptyEnd", null);
        setBooleanField(term94109, term94109.getClass(), "framesetOk", false);
        setBooleanField(term94109, term94109.getClass(), "fosterInserts", false);
        setBooleanField(term94109, term94109.getClass(), "fragmentParsing", false);
        setField(term94109, term94109.getClass(), "specificScopeTarget", null);
        setField(term94109, term94109.getClass(), "reader", null);
        setField(term94109, term94109.getClass(), "tokeniser", null);
        setField(term94109, term94109.getClass(), "doc", null);
        setField(term94109, term94109.getClass(), "stack", null);
        setField(term94109, term94109.getClass(), "baseUri", null);
        setField(term94109, term94109.getClass(), "currentToken", null);
        setField(term94109, term94109.getClass(), "errors", null);
        setField(term94109, term94109.getClass(), "settings", null);
        setField(term94109, term94109.getClass(), "start", null);
        setField(term94109, term94109.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "removeFromActiveFormattingElements", argTypes, term94109, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


