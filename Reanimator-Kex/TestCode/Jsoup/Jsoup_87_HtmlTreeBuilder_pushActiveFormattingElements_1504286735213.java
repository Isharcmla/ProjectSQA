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

public class HtmlTreeBuilder_pushActiveFormattingElements_1504286735213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term442136;
     Object term442214;

    public HtmlTreeBuilder_pushActiveFormattingElements_1504286735213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term442188 = new ArrayList();
        term442136 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term442136, term442136.getClass(), "formattingElements", term442188);
        ArrayList term442215 = new ArrayList();
        ((ArrayList) term442215).add((Object)null);
        term442214 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term442214, term442214.getClass(), "state", null);
        setField(term442214, term442214.getClass(), "originalState", null);
        setBooleanField(term442214, term442214.getClass(), "baseUriSetFromDoc", false);
        setField(term442214, term442214.getClass(), "headElement", null);
        setField(term442214, term442214.getClass(), "formElement", null);
        setField(term442214, term442214.getClass(), "contextElement", null);
        setField(term442214, term442214.getClass(), "formattingElements", term442215);
        setField(term442214, term442214.getClass(), "pendingTableCharacters", null);
        setField(term442214, term442214.getClass(), "emptyEnd", null);
        setBooleanField(term442214, term442214.getClass(), "framesetOk", false);
        setBooleanField(term442214, term442214.getClass(), "fosterInserts", false);
        setBooleanField(term442214, term442214.getClass(), "fragmentParsing", false);
        setField(term442214, term442214.getClass(), "specificScopeTarget", null);
        setField(term442214, term442214.getClass(), "parser", null);
        setField(term442214, term442214.getClass(), "reader", null);
        setField(term442214, term442214.getClass(), "tokeniser", null);
        setField(term442214, term442214.getClass(), "doc", null);
        setField(term442214, term442214.getClass(), "stack", null);
        setField(term442214, term442214.getClass(), "baseUri", null);
        setField(term442214, term442214.getClass(), "currentToken", null);
        setField(term442214, term442214.getClass(), "settings", null);
        setField(term442214, term442214.getClass(), "start", null);
        setField(term442214, term442214.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "pushActiveFormattingElements", argTypes, term442136, args);
        assertTrue(recursiveEquals(term442136, term442214));
    }

};


