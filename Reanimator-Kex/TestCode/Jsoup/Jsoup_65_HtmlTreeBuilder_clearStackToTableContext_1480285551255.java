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

public class HtmlTreeBuilder_clearStackToTableContext_1480285551255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term214599;
     Object term214932;

    public HtmlTreeBuilder_clearStackToTableContext_1480285551255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term214651 = new ArrayList();
        term214599 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term214599, term214599.getClass(), "stack", term214651);
        ArrayList term214933 = new ArrayList();
        term214932 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term214932, term214932.getClass(), "state", null);
        setField(term214932, term214932.getClass(), "originalState", null);
        setBooleanField(term214932, term214932.getClass(), "baseUriSetFromDoc", false);
        setField(term214932, term214932.getClass(), "headElement", null);
        setField(term214932, term214932.getClass(), "formElement", null);
        setField(term214932, term214932.getClass(), "contextElement", null);
        setField(term214932, term214932.getClass(), "formattingElements", null);
        setField(term214932, term214932.getClass(), "pendingTableCharacters", null);
        setField(term214932, term214932.getClass(), "emptyEnd", null);
        setBooleanField(term214932, term214932.getClass(), "framesetOk", false);
        setBooleanField(term214932, term214932.getClass(), "fosterInserts", false);
        setBooleanField(term214932, term214932.getClass(), "fragmentParsing", false);
        setField(term214932, term214932.getClass(), "specificScopeTarget", null);
        setField(term214932, term214932.getClass(), "reader", null);
        setField(term214932, term214932.getClass(), "tokeniser", null);
        setField(term214932, term214932.getClass(), "doc", null);
        setField(term214932, term214932.getClass(), "stack", term214933);
        setField(term214932, term214932.getClass(), "baseUri", null);
        setField(term214932, term214932.getClass(), "currentToken", null);
        setField(term214932, term214932.getClass(), "errors", null);
        setField(term214932, term214932.getClass(), "settings", null);
        setField(term214932, term214932.getClass(), "start", null);
        setField(term214932, term214932.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearStackToTableContext", argTypes, term214599, args);
        assertTrue(recursiveEquals(term214599, term214932));
    }

};


