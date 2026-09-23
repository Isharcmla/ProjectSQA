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

public class HtmlTreeBuilder_pushActiveFormattingElements_1504286735353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term346893;
     Object term346956;

    public HtmlTreeBuilder_pushActiveFormattingElements_1504286735353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term346945 = new ArrayList();
        term346893 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term346893, term346893.getClass(), "formattingElements", term346945);
        ArrayList term346957 = new ArrayList();
        ((ArrayList) term346957).add((Object)null);
        term346956 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term346956, term346956.getClass(), "state", null);
        setField(term346956, term346956.getClass(), "originalState", null);
        setBooleanField(term346956, term346956.getClass(), "baseUriSetFromDoc", false);
        setField(term346956, term346956.getClass(), "headElement", null);
        setField(term346956, term346956.getClass(), "formElement", null);
        setField(term346956, term346956.getClass(), "contextElement", null);
        setField(term346956, term346956.getClass(), "formattingElements", term346957);
        setField(term346956, term346956.getClass(), "pendingTableCharacters", null);
        setField(term346956, term346956.getClass(), "emptyEnd", null);
        setBooleanField(term346956, term346956.getClass(), "framesetOk", false);
        setBooleanField(term346956, term346956.getClass(), "fosterInserts", false);
        setBooleanField(term346956, term346956.getClass(), "fragmentParsing", false);
        setField(term346956, term346956.getClass(), "specificScopeTarget", null);
        setField(term346956, term346956.getClass(), "parser", null);
        setField(term346956, term346956.getClass(), "reader", null);
        setField(term346956, term346956.getClass(), "tokeniser", null);
        setField(term346956, term346956.getClass(), "doc", null);
        setField(term346956, term346956.getClass(), "stack", null);
        setField(term346956, term346956.getClass(), "baseUri", null);
        setField(term346956, term346956.getClass(), "currentToken", null);
        setField(term346956, term346956.getClass(), "settings", null);
        setField(term346956, term346956.getClass(), "start", null);
        setField(term346956, term346956.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "pushActiveFormattingElements", argTypes, term346893, args);
        assertTrue(recursiveEquals(term346893, term346956));
    }

};


