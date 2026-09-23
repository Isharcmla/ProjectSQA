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

public class HtmlTreeBuilder_maybeSetBaseUri_357929206220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term214995;
     Object term215023;

    public HtmlTreeBuilder_maybeSetBaseUri_357929206220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term214995 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setBooleanField(term214995, term214995.getClass(), "baseUriSetFromDoc", true);
        term215023 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term215023, term215023.getClass(), "state", null);
        setField(term215023, term215023.getClass(), "originalState", null);
        setBooleanField(term215023, term215023.getClass(), "baseUriSetFromDoc", true);
        setField(term215023, term215023.getClass(), "headElement", null);
        setField(term215023, term215023.getClass(), "formElement", null);
        setField(term215023, term215023.getClass(), "contextElement", null);
        setField(term215023, term215023.getClass(), "formattingElements", null);
        setField(term215023, term215023.getClass(), "pendingTableCharacters", null);
        setField(term215023, term215023.getClass(), "emptyEnd", null);
        setBooleanField(term215023, term215023.getClass(), "framesetOk", false);
        setBooleanField(term215023, term215023.getClass(), "fosterInserts", false);
        setBooleanField(term215023, term215023.getClass(), "fragmentParsing", false);
        setField(term215023, term215023.getClass(), "specificScopeTarget", null);
        setField(term215023, term215023.getClass(), "reader", null);
        setField(term215023, term215023.getClass(), "tokeniser", null);
        setField(term215023, term215023.getClass(), "doc", null);
        setField(term215023, term215023.getClass(), "stack", null);
        setField(term215023, term215023.getClass(), "baseUri", null);
        setField(term215023, term215023.getClass(), "currentToken", null);
        setField(term215023, term215023.getClass(), "errors", null);
        setField(term215023, term215023.getClass(), "settings", null);
        setField(term215023, term215023.getClass(), "start", null);
        setField(term215023, term215023.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "maybeSetBaseUri", argTypes, term214995, args);
        assertTrue(recursiveEquals(term214995, term215023));
    }

};


