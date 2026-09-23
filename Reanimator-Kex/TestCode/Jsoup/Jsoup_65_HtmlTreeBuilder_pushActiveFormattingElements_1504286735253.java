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

public class HtmlTreeBuilder_pushActiveFormattingElements_1504286735253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term214440;
     Object term214662;

    public HtmlTreeBuilder_pushActiveFormattingElements_1504286735253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term214492 = new ArrayList();
        term214440 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term214440, term214440.getClass(), "formattingElements", term214492);
        ArrayList term214663 = new ArrayList();
        ((ArrayList) term214663).add((Object)null);
        term214662 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term214662, term214662.getClass(), "state", null);
        setField(term214662, term214662.getClass(), "originalState", null);
        setBooleanField(term214662, term214662.getClass(), "baseUriSetFromDoc", false);
        setField(term214662, term214662.getClass(), "headElement", null);
        setField(term214662, term214662.getClass(), "formElement", null);
        setField(term214662, term214662.getClass(), "contextElement", null);
        setField(term214662, term214662.getClass(), "formattingElements", term214663);
        setField(term214662, term214662.getClass(), "pendingTableCharacters", null);
        setField(term214662, term214662.getClass(), "emptyEnd", null);
        setBooleanField(term214662, term214662.getClass(), "framesetOk", false);
        setBooleanField(term214662, term214662.getClass(), "fosterInserts", false);
        setBooleanField(term214662, term214662.getClass(), "fragmentParsing", false);
        setField(term214662, term214662.getClass(), "specificScopeTarget", null);
        setField(term214662, term214662.getClass(), "reader", null);
        setField(term214662, term214662.getClass(), "tokeniser", null);
        setField(term214662, term214662.getClass(), "doc", null);
        setField(term214662, term214662.getClass(), "stack", null);
        setField(term214662, term214662.getClass(), "baseUri", null);
        setField(term214662, term214662.getClass(), "currentToken", null);
        setField(term214662, term214662.getClass(), "errors", null);
        setField(term214662, term214662.getClass(), "settings", null);
        setField(term214662, term214662.getClass(), "start", null);
        setField(term214662, term214662.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "pushActiveFormattingElements", argTypes, term214440, args);
        assertTrue(recursiveEquals(term214440, term214662));
    }

};


