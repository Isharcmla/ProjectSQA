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

public class HtmlTreeBuilder_popStackToClose_1309371195140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42977;

    public HtmlTreeBuilder_popStackToClose_1309371195140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42977 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term42977, term42977.getClass(), "state", null);
        setField(term42977, term42977.getClass(), "originalState", null);
        setBooleanField(term42977, term42977.getClass(), "baseUriSetFromDoc", false);
        setField(term42977, term42977.getClass(), "headElement", null);
        setField(term42977, term42977.getClass(), "formElement", null);
        setField(term42977, term42977.getClass(), "contextElement", null);
        setField(term42977, term42977.getClass(), "formattingElements", null);
        setField(term42977, term42977.getClass(), "pendingTableCharacters", null);
        setField(term42977, term42977.getClass(), "emptyEnd", null);
        setBooleanField(term42977, term42977.getClass(), "framesetOk", false);
        setBooleanField(term42977, term42977.getClass(), "fosterInserts", false);
        setBooleanField(term42977, term42977.getClass(), "fragmentParsing", false);
        setField(term42977, term42977.getClass(), "specificScopeTarget", null);
        setField(term42977, term42977.getClass(), "reader", null);
        setField(term42977, term42977.getClass(), "tokeniser", null);
        setField(term42977, term42977.getClass(), "doc", null);
        setField(term42977, term42977.getClass(), "stack", null);
        setField(term42977, term42977.getClass(), "baseUri", null);
        setField(term42977, term42977.getClass(), "currentToken", null);
        setField(term42977, term42977.getClass(), "errors", null);
        setField(term42977, term42977.getClass(), "settings", null);
        setField(term42977, term42977.getClass(), "start", null);
        setField(term42977, term42977.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "popStackToClose", argTypes, term42977, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


