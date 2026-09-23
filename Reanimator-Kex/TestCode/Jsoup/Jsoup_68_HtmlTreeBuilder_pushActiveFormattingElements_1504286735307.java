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

public class HtmlTreeBuilder_pushActiveFormattingElements_1504286735307 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term272956;
     Object term273356;

    public HtmlTreeBuilder_pushActiveFormattingElements_1504286735307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term273008 = new ArrayList();
        term272956 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term272956, term272956.getClass(), "formattingElements", term273008);
        ArrayList term273357 = new ArrayList();
        ((ArrayList) term273357).add((Object)null);
        term273356 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term273356, term273356.getClass(), "state", null);
        setField(term273356, term273356.getClass(), "originalState", null);
        setBooleanField(term273356, term273356.getClass(), "baseUriSetFromDoc", false);
        setField(term273356, term273356.getClass(), "headElement", null);
        setField(term273356, term273356.getClass(), "formElement", null);
        setField(term273356, term273356.getClass(), "contextElement", null);
        setField(term273356, term273356.getClass(), "formattingElements", term273357);
        setField(term273356, term273356.getClass(), "pendingTableCharacters", null);
        setField(term273356, term273356.getClass(), "emptyEnd", null);
        setBooleanField(term273356, term273356.getClass(), "framesetOk", false);
        setBooleanField(term273356, term273356.getClass(), "fosterInserts", false);
        setBooleanField(term273356, term273356.getClass(), "fragmentParsing", false);
        setField(term273356, term273356.getClass(), "specificScopeTarget", null);
        setField(term273356, term273356.getClass(), "reader", null);
        setField(term273356, term273356.getClass(), "tokeniser", null);
        setField(term273356, term273356.getClass(), "doc", null);
        setField(term273356, term273356.getClass(), "stack", null);
        setField(term273356, term273356.getClass(), "baseUri", null);
        setField(term273356, term273356.getClass(), "currentToken", null);
        setField(term273356, term273356.getClass(), "errors", null);
        setField(term273356, term273356.getClass(), "settings", null);
        setField(term273356, term273356.getClass(), "start", null);
        setField(term273356, term273356.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "pushActiveFormattingElements", argTypes, term272956, args);
        assertTrue(recursiveEquals(term272956, term273356));
    }

};


