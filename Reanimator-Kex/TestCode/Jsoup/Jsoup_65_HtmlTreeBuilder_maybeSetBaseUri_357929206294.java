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

public class HtmlTreeBuilder_maybeSetBaseUri_357929206294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term227703;
     Object term227710;

    public HtmlTreeBuilder_maybeSetBaseUri_357929206294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term227703 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setBooleanField(term227703, term227703.getClass(), "baseUriSetFromDoc", true);
        term227710 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term227710, term227710.getClass(), "state", null);
        setField(term227710, term227710.getClass(), "originalState", null);
        setBooleanField(term227710, term227710.getClass(), "baseUriSetFromDoc", true);
        setField(term227710, term227710.getClass(), "headElement", null);
        setField(term227710, term227710.getClass(), "formElement", null);
        setField(term227710, term227710.getClass(), "contextElement", null);
        setField(term227710, term227710.getClass(), "formattingElements", null);
        setField(term227710, term227710.getClass(), "pendingTableCharacters", null);
        setField(term227710, term227710.getClass(), "emptyEnd", null);
        setBooleanField(term227710, term227710.getClass(), "framesetOk", false);
        setBooleanField(term227710, term227710.getClass(), "fosterInserts", false);
        setBooleanField(term227710, term227710.getClass(), "fragmentParsing", false);
        setField(term227710, term227710.getClass(), "specificScopeTarget", null);
        setField(term227710, term227710.getClass(), "reader", null);
        setField(term227710, term227710.getClass(), "tokeniser", null);
        setField(term227710, term227710.getClass(), "doc", null);
        setField(term227710, term227710.getClass(), "stack", null);
        setField(term227710, term227710.getClass(), "baseUri", null);
        setField(term227710, term227710.getClass(), "currentToken", null);
        setField(term227710, term227710.getClass(), "errors", null);
        setField(term227710, term227710.getClass(), "settings", null);
        setField(term227710, term227710.getClass(), "start", null);
        setField(term227710, term227710.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "maybeSetBaseUri", argTypes, term227703, args);
        assertTrue(recursiveEquals(term227703, term227710));
    }

};


