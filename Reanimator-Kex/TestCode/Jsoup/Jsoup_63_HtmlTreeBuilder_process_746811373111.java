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

public class HtmlTreeBuilder_process_746811373111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2888;

    public HtmlTreeBuilder_process_746811373111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2888 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term2888, term2888.getClass(), "state", null);
        setField(term2888, term2888.getClass(), "originalState", null);
        setBooleanField(term2888, term2888.getClass(), "baseUriSetFromDoc", false);
        setField(term2888, term2888.getClass(), "headElement", null);
        setField(term2888, term2888.getClass(), "formElement", null);
        setField(term2888, term2888.getClass(), "contextElement", null);
        setField(term2888, term2888.getClass(), "formattingElements", null);
        setField(term2888, term2888.getClass(), "pendingTableCharacters", null);
        setField(term2888, term2888.getClass(), "emptyEnd", null);
        setBooleanField(term2888, term2888.getClass(), "framesetOk", false);
        setBooleanField(term2888, term2888.getClass(), "fosterInserts", false);
        setBooleanField(term2888, term2888.getClass(), "fragmentParsing", false);
        setField(term2888, term2888.getClass(), "specificScopeTarget", null);
        setField(term2888, term2888.getClass(), "reader", null);
        setField(term2888, term2888.getClass(), "tokeniser", null);
        setField(term2888, term2888.getClass(), "doc", null);
        setField(term2888, term2888.getClass(), "stack", null);
        setField(term2888, term2888.getClass(), "baseUri", null);
        setField(term2888, term2888.getClass(), "currentToken", null);
        setField(term2888, term2888.getClass(), "errors", null);
        setField(term2888, term2888.getClass(), "settings", null);
        setField(term2888, term2888.getClass(), "start", null);
        setField(term2888, term2888.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "process", argTypes, term2888, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


