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

public class HtmlTreeBuilder_getActiveFormattingElement_851320383180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96955;

    public HtmlTreeBuilder_getActiveFormattingElement_851320383180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96955 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term96955, term96955.getClass(), "state", null);
        setField(term96955, term96955.getClass(), "originalState", null);
        setBooleanField(term96955, term96955.getClass(), "baseUriSetFromDoc", false);
        setField(term96955, term96955.getClass(), "headElement", null);
        setField(term96955, term96955.getClass(), "formElement", null);
        setField(term96955, term96955.getClass(), "contextElement", null);
        setField(term96955, term96955.getClass(), "formattingElements", null);
        setField(term96955, term96955.getClass(), "pendingTableCharacters", null);
        setField(term96955, term96955.getClass(), "emptyEnd", null);
        setBooleanField(term96955, term96955.getClass(), "framesetOk", false);
        setBooleanField(term96955, term96955.getClass(), "fosterInserts", false);
        setBooleanField(term96955, term96955.getClass(), "fragmentParsing", false);
        setField(term96955, term96955.getClass(), "specificScopeTarget", null);
        setField(term96955, term96955.getClass(), "reader", null);
        setField(term96955, term96955.getClass(), "tokeniser", null);
        setField(term96955, term96955.getClass(), "doc", null);
        setField(term96955, term96955.getClass(), "stack", null);
        setField(term96955, term96955.getClass(), "baseUri", null);
        setField(term96955, term96955.getClass(), "currentToken", null);
        setField(term96955, term96955.getClass(), "errors", null);
        setField(term96955, term96955.getClass(), "settings", null);
        setField(term96955, term96955.getClass(), "start", null);
        setField(term96955, term96955.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getActiveFormattingElement", argTypes, term96955, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


