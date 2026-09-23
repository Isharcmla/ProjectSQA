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

public class HtmlTreeBuilder_getPendingTableCharacters_180424409171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81547;
     Object term174640;

    public HtmlTreeBuilder_getPendingTableCharacters_180424409171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81547 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term81547, term81547.getClass(), "state", null);
        setField(term81547, term81547.getClass(), "originalState", null);
        setBooleanField(term81547, term81547.getClass(), "baseUriSetFromDoc", false);
        setField(term81547, term81547.getClass(), "headElement", null);
        setField(term81547, term81547.getClass(), "formElement", null);
        setField(term81547, term81547.getClass(), "contextElement", null);
        setField(term81547, term81547.getClass(), "formattingElements", null);
        setField(term81547, term81547.getClass(), "pendingTableCharacters", null);
        setField(term81547, term81547.getClass(), "emptyEnd", null);
        setBooleanField(term81547, term81547.getClass(), "framesetOk", false);
        setBooleanField(term81547, term81547.getClass(), "fosterInserts", false);
        setBooleanField(term81547, term81547.getClass(), "fragmentParsing", false);
        setField(term81547, term81547.getClass(), "specificScopeTarget", null);
        setField(term81547, term81547.getClass(), "reader", null);
        setField(term81547, term81547.getClass(), "tokeniser", null);
        setField(term81547, term81547.getClass(), "doc", null);
        setField(term81547, term81547.getClass(), "stack", null);
        setField(term81547, term81547.getClass(), "baseUri", null);
        setField(term81547, term81547.getClass(), "currentToken", null);
        setField(term81547, term81547.getClass(), "errors", null);
        setField(term81547, term81547.getClass(), "settings", null);
        setField(term81547, term81547.getClass(), "start", null);
        setField(term81547, term81547.getClass(), "end", null);
        term174640 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term174640, term174640.getClass(), "state", null);
        setField(term174640, term174640.getClass(), "originalState", null);
        setBooleanField(term174640, term174640.getClass(), "baseUriSetFromDoc", false);
        setField(term174640, term174640.getClass(), "headElement", null);
        setField(term174640, term174640.getClass(), "formElement", null);
        setField(term174640, term174640.getClass(), "contextElement", null);
        setField(term174640, term174640.getClass(), "formattingElements", null);
        setField(term174640, term174640.getClass(), "pendingTableCharacters", null);
        setField(term174640, term174640.getClass(), "emptyEnd", null);
        setBooleanField(term174640, term174640.getClass(), "framesetOk", false);
        setBooleanField(term174640, term174640.getClass(), "fosterInserts", false);
        setBooleanField(term174640, term174640.getClass(), "fragmentParsing", false);
        setField(term174640, term174640.getClass(), "specificScopeTarget", null);
        setField(term174640, term174640.getClass(), "reader", null);
        setField(term174640, term174640.getClass(), "tokeniser", null);
        setField(term174640, term174640.getClass(), "doc", null);
        setField(term174640, term174640.getClass(), "stack", null);
        setField(term174640, term174640.getClass(), "baseUri", null);
        setField(term174640, term174640.getClass(), "currentToken", null);
        setField(term174640, term174640.getClass(), "errors", null);
        setField(term174640, term174640.getClass(), "settings", null);
        setField(term174640, term174640.getClass(), "start", null);
        setField(term174640, term174640.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPendingTableCharacters", argTypes, term81547, args);
        assertTrue(recursiveEquals(term81547, term174640));
        assertTrue(recursiveEquals(retValue, null));
    }

};


