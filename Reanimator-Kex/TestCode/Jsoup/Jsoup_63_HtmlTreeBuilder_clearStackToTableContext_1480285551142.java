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

public class HtmlTreeBuilder_clearStackToTableContext_1480285551142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45644;

    public HtmlTreeBuilder_clearStackToTableContext_1480285551142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45644 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term45644, term45644.getClass(), "state", null);
        setField(term45644, term45644.getClass(), "originalState", null);
        setBooleanField(term45644, term45644.getClass(), "baseUriSetFromDoc", false);
        setField(term45644, term45644.getClass(), "headElement", null);
        setField(term45644, term45644.getClass(), "formElement", null);
        setField(term45644, term45644.getClass(), "contextElement", null);
        setField(term45644, term45644.getClass(), "formattingElements", null);
        setField(term45644, term45644.getClass(), "pendingTableCharacters", null);
        setField(term45644, term45644.getClass(), "emptyEnd", null);
        setBooleanField(term45644, term45644.getClass(), "framesetOk", false);
        setBooleanField(term45644, term45644.getClass(), "fosterInserts", false);
        setBooleanField(term45644, term45644.getClass(), "fragmentParsing", false);
        setField(term45644, term45644.getClass(), "specificScopeTarget", null);
        setField(term45644, term45644.getClass(), "reader", null);
        setField(term45644, term45644.getClass(), "tokeniser", null);
        setField(term45644, term45644.getClass(), "doc", null);
        setField(term45644, term45644.getClass(), "stack", null);
        setField(term45644, term45644.getClass(), "baseUri", null);
        setField(term45644, term45644.getClass(), "currentToken", null);
        setField(term45644, term45644.getClass(), "errors", null);
        setField(term45644, term45644.getClass(), "settings", null);
        setField(term45644, term45644.getClass(), "start", null);
        setField(term45644, term45644.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "clearStackToTableContext", argTypes, term45644, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


