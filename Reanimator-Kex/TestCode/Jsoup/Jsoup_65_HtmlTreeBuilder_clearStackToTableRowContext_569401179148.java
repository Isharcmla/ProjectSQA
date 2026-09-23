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
import java.lang.NullPointerException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class HtmlTreeBuilder_clearStackToTableRowContext_569401179148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49258;

    public HtmlTreeBuilder_clearStackToTableRowContext_569401179148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49258 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term49258, term49258.getClass(), "state", null);
        setField(term49258, term49258.getClass(), "originalState", null);
        setBooleanField(term49258, term49258.getClass(), "baseUriSetFromDoc", false);
        setField(term49258, term49258.getClass(), "headElement", null);
        setField(term49258, term49258.getClass(), "formElement", null);
        setField(term49258, term49258.getClass(), "contextElement", null);
        setField(term49258, term49258.getClass(), "formattingElements", null);
        setField(term49258, term49258.getClass(), "pendingTableCharacters", null);
        setField(term49258, term49258.getClass(), "emptyEnd", null);
        setBooleanField(term49258, term49258.getClass(), "framesetOk", false);
        setBooleanField(term49258, term49258.getClass(), "fosterInserts", false);
        setBooleanField(term49258, term49258.getClass(), "fragmentParsing", false);
        setField(term49258, term49258.getClass(), "specificScopeTarget", null);
        setField(term49258, term49258.getClass(), "reader", null);
        setField(term49258, term49258.getClass(), "tokeniser", null);
        setField(term49258, term49258.getClass(), "doc", null);
        setField(term49258, term49258.getClass(), "stack", null);
        setField(term49258, term49258.getClass(), "baseUri", null);
        setField(term49258, term49258.getClass(), "currentToken", null);
        setField(term49258, term49258.getClass(), "errors", null);
        setField(term49258, term49258.getClass(), "settings", null);
        setField(term49258, term49258.getClass(), "start", null);
        setField(term49258, term49258.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "clearStackToTableRowContext", argTypes, term49258, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


