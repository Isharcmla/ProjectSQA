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

public class HtmlTreeBuilder_getActiveFormattingElement_851320383184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99285;

    public HtmlTreeBuilder_getActiveFormattingElement_851320383184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99285 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term99285, term99285.getClass(), "state", null);
        setField(term99285, term99285.getClass(), "originalState", null);
        setBooleanField(term99285, term99285.getClass(), "baseUriSetFromDoc", false);
        setField(term99285, term99285.getClass(), "headElement", null);
        setField(term99285, term99285.getClass(), "formElement", null);
        setField(term99285, term99285.getClass(), "contextElement", null);
        setField(term99285, term99285.getClass(), "formattingElements", null);
        setField(term99285, term99285.getClass(), "pendingTableCharacters", null);
        setField(term99285, term99285.getClass(), "emptyEnd", null);
        setBooleanField(term99285, term99285.getClass(), "framesetOk", false);
        setBooleanField(term99285, term99285.getClass(), "fosterInserts", false);
        setBooleanField(term99285, term99285.getClass(), "fragmentParsing", false);
        setField(term99285, term99285.getClass(), "specificScopeTarget", null);
        setField(term99285, term99285.getClass(), "reader", null);
        setField(term99285, term99285.getClass(), "tokeniser", null);
        setField(term99285, term99285.getClass(), "doc", null);
        setField(term99285, term99285.getClass(), "stack", null);
        setField(term99285, term99285.getClass(), "baseUri", null);
        setField(term99285, term99285.getClass(), "currentToken", null);
        setField(term99285, term99285.getClass(), "errors", null);
        setField(term99285, term99285.getClass(), "settings", null);
        setField(term99285, term99285.getClass(), "start", null);
        setField(term99285, term99285.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getActiveFormattingElement", argTypes, term99285, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


