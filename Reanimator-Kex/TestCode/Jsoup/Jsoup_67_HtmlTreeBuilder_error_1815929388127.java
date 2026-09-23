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

public class HtmlTreeBuilder_error_1815929388127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19696;

    public HtmlTreeBuilder_error_1815929388127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19696 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term19696, term19696.getClass(), "state", null);
        setField(term19696, term19696.getClass(), "originalState", null);
        setBooleanField(term19696, term19696.getClass(), "baseUriSetFromDoc", false);
        setField(term19696, term19696.getClass(), "headElement", null);
        setField(term19696, term19696.getClass(), "formElement", null);
        setField(term19696, term19696.getClass(), "contextElement", null);
        setField(term19696, term19696.getClass(), "formattingElements", null);
        setField(term19696, term19696.getClass(), "pendingTableCharacters", null);
        setField(term19696, term19696.getClass(), "emptyEnd", null);
        setBooleanField(term19696, term19696.getClass(), "framesetOk", false);
        setBooleanField(term19696, term19696.getClass(), "fosterInserts", false);
        setBooleanField(term19696, term19696.getClass(), "fragmentParsing", false);
        setField(term19696, term19696.getClass(), "specificScopeTarget", null);
        setField(term19696, term19696.getClass(), "reader", null);
        setField(term19696, term19696.getClass(), "tokeniser", null);
        setField(term19696, term19696.getClass(), "doc", null);
        setField(term19696, term19696.getClass(), "stack", null);
        setField(term19696, term19696.getClass(), "baseUri", null);
        setField(term19696, term19696.getClass(), "currentToken", null);
        setField(term19696, term19696.getClass(), "errors", null);
        setField(term19696, term19696.getClass(), "settings", null);
        setField(term19696, term19696.getClass(), "start", null);
        setField(term19696, term19696.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "error", argTypes, term19696, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


