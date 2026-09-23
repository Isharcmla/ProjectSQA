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

public class HtmlTreeBuilder_insert_1024743636130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29369;

    public HtmlTreeBuilder_insert_1024743636130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29369 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term29369, term29369.getClass(), "state", null);
        setField(term29369, term29369.getClass(), "originalState", null);
        setBooleanField(term29369, term29369.getClass(), "baseUriSetFromDoc", false);
        setField(term29369, term29369.getClass(), "headElement", null);
        setField(term29369, term29369.getClass(), "formElement", null);
        setField(term29369, term29369.getClass(), "contextElement", null);
        setField(term29369, term29369.getClass(), "formattingElements", null);
        setField(term29369, term29369.getClass(), "pendingTableCharacters", null);
        setField(term29369, term29369.getClass(), "emptyEnd", null);
        setBooleanField(term29369, term29369.getClass(), "framesetOk", false);
        setBooleanField(term29369, term29369.getClass(), "fosterInserts", false);
        setBooleanField(term29369, term29369.getClass(), "fragmentParsing", false);
        setField(term29369, term29369.getClass(), "specificScopeTarget", null);
        setField(term29369, term29369.getClass(), "reader", null);
        setField(term29369, term29369.getClass(), "tokeniser", null);
        setField(term29369, term29369.getClass(), "doc", null);
        setField(term29369, term29369.getClass(), "stack", null);
        setField(term29369, term29369.getClass(), "baseUri", null);
        setField(term29369, term29369.getClass(), "currentToken", null);
        setField(term29369, term29369.getClass(), "errors", null);
        setField(term29369, term29369.getClass(), "settings", null);
        setField(term29369, term29369.getClass(), "start", null);
        setField(term29369, term29369.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Character");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "insert", argTypes, term29369, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


