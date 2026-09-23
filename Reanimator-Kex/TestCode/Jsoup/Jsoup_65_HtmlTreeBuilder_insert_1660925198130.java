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

public class HtmlTreeBuilder_insert_1660925198130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23957;

    public HtmlTreeBuilder_insert_1660925198130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23957 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term23957, term23957.getClass(), "state", null);
        setField(term23957, term23957.getClass(), "originalState", null);
        setBooleanField(term23957, term23957.getClass(), "baseUriSetFromDoc", false);
        setField(term23957, term23957.getClass(), "headElement", null);
        setField(term23957, term23957.getClass(), "formElement", null);
        setField(term23957, term23957.getClass(), "contextElement", null);
        setField(term23957, term23957.getClass(), "formattingElements", null);
        setField(term23957, term23957.getClass(), "pendingTableCharacters", null);
        setField(term23957, term23957.getClass(), "emptyEnd", null);
        setBooleanField(term23957, term23957.getClass(), "framesetOk", false);
        setBooleanField(term23957, term23957.getClass(), "fosterInserts", false);
        setBooleanField(term23957, term23957.getClass(), "fragmentParsing", false);
        setField(term23957, term23957.getClass(), "specificScopeTarget", null);
        setField(term23957, term23957.getClass(), "reader", null);
        setField(term23957, term23957.getClass(), "tokeniser", null);
        setField(term23957, term23957.getClass(), "doc", null);
        setField(term23957, term23957.getClass(), "stack", null);
        setField(term23957, term23957.getClass(), "baseUri", null);
        setField(term23957, term23957.getClass(), "currentToken", null);
        setField(term23957, term23957.getClass(), "errors", null);
        setField(term23957, term23957.getClass(), "settings", null);
        setField(term23957, term23957.getClass(), "start", null);
        setField(term23957, term23957.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "insert", argTypes, term23957, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


