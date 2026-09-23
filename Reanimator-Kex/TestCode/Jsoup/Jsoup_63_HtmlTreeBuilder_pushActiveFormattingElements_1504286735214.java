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
import java.lang.Object;

public class HtmlTreeBuilder_pushActiveFormattingElements_1504286735214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term214290;
     Object term214379;

    public HtmlTreeBuilder_pushActiveFormattingElements_1504286735214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term214342 = new ArrayList();
        term214290 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term214290, term214290.getClass(), "formattingElements", term214342);
        ArrayList term214380 = new ArrayList();
        ((ArrayList) term214380).add((Object)null);
        term214379 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term214379, term214379.getClass(), "state", null);
        setField(term214379, term214379.getClass(), "originalState", null);
        setBooleanField(term214379, term214379.getClass(), "baseUriSetFromDoc", false);
        setField(term214379, term214379.getClass(), "headElement", null);
        setField(term214379, term214379.getClass(), "formElement", null);
        setField(term214379, term214379.getClass(), "contextElement", null);
        setField(term214379, term214379.getClass(), "formattingElements", term214380);
        setField(term214379, term214379.getClass(), "pendingTableCharacters", null);
        setField(term214379, term214379.getClass(), "emptyEnd", null);
        setBooleanField(term214379, term214379.getClass(), "framesetOk", false);
        setBooleanField(term214379, term214379.getClass(), "fosterInserts", false);
        setBooleanField(term214379, term214379.getClass(), "fragmentParsing", false);
        setField(term214379, term214379.getClass(), "specificScopeTarget", null);
        setField(term214379, term214379.getClass(), "reader", null);
        setField(term214379, term214379.getClass(), "tokeniser", null);
        setField(term214379, term214379.getClass(), "doc", null);
        setField(term214379, term214379.getClass(), "stack", null);
        setField(term214379, term214379.getClass(), "baseUri", null);
        setField(term214379, term214379.getClass(), "currentToken", null);
        setField(term214379, term214379.getClass(), "errors", null);
        setField(term214379, term214379.getClass(), "settings", null);
        setField(term214379, term214379.getClass(), "start", null);
        setField(term214379, term214379.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "pushActiveFormattingElements", argTypes, term214290, args);
        assertTrue(recursiveEquals(term214290, term214379));
    }

};


