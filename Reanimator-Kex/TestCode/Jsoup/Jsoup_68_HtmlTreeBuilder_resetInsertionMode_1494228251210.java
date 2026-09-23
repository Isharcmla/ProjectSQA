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

public class HtmlTreeBuilder_resetInsertionMode_1494228251210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term249276;
     Object term249384;

    public HtmlTreeBuilder_resetInsertionMode_1494228251210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term249328 = new ArrayList();
        term249276 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term249276, term249276.getClass(), "stack", term249328);
        ArrayList term249385 = new ArrayList();
        term249384 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term249384, term249384.getClass(), "state", null);
        setField(term249384, term249384.getClass(), "originalState", null);
        setBooleanField(term249384, term249384.getClass(), "baseUriSetFromDoc", false);
        setField(term249384, term249384.getClass(), "headElement", null);
        setField(term249384, term249384.getClass(), "formElement", null);
        setField(term249384, term249384.getClass(), "contextElement", null);
        setField(term249384, term249384.getClass(), "formattingElements", null);
        setField(term249384, term249384.getClass(), "pendingTableCharacters", null);
        setField(term249384, term249384.getClass(), "emptyEnd", null);
        setBooleanField(term249384, term249384.getClass(), "framesetOk", false);
        setBooleanField(term249384, term249384.getClass(), "fosterInserts", false);
        setBooleanField(term249384, term249384.getClass(), "fragmentParsing", false);
        setField(term249384, term249384.getClass(), "specificScopeTarget", null);
        setField(term249384, term249384.getClass(), "reader", null);
        setField(term249384, term249384.getClass(), "tokeniser", null);
        setField(term249384, term249384.getClass(), "doc", null);
        setField(term249384, term249384.getClass(), "stack", term249385);
        setField(term249384, term249384.getClass(), "baseUri", null);
        setField(term249384, term249384.getClass(), "currentToken", null);
        setField(term249384, term249384.getClass(), "errors", null);
        setField(term249384, term249384.getClass(), "settings", null);
        setField(term249384, term249384.getClass(), "start", null);
        setField(term249384, term249384.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "resetInsertionMode", argTypes, term249276, args);
        assertTrue(recursiveEquals(term249276, term249384));
    }

};


