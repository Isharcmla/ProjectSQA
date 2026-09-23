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

public class HtmlTreeBuilder_process_746811373115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3046;

    public HtmlTreeBuilder_process_746811373115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3046 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term3046, term3046.getClass(), "state", null);
        setField(term3046, term3046.getClass(), "originalState", null);
        setBooleanField(term3046, term3046.getClass(), "baseUriSetFromDoc", false);
        setField(term3046, term3046.getClass(), "headElement", null);
        setField(term3046, term3046.getClass(), "formElement", null);
        setField(term3046, term3046.getClass(), "contextElement", null);
        setField(term3046, term3046.getClass(), "formattingElements", null);
        setField(term3046, term3046.getClass(), "pendingTableCharacters", null);
        setField(term3046, term3046.getClass(), "emptyEnd", null);
        setBooleanField(term3046, term3046.getClass(), "framesetOk", false);
        setBooleanField(term3046, term3046.getClass(), "fosterInserts", false);
        setBooleanField(term3046, term3046.getClass(), "fragmentParsing", false);
        setField(term3046, term3046.getClass(), "specificScopeTarget", null);
        setField(term3046, term3046.getClass(), "reader", null);
        setField(term3046, term3046.getClass(), "tokeniser", null);
        setField(term3046, term3046.getClass(), "doc", null);
        setField(term3046, term3046.getClass(), "stack", null);
        setField(term3046, term3046.getClass(), "baseUri", null);
        setField(term3046, term3046.getClass(), "currentToken", null);
        setField(term3046, term3046.getClass(), "errors", null);
        setField(term3046, term3046.getClass(), "settings", null);
        setField(term3046, term3046.getClass(), "start", null);
        setField(term3046, term3046.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "process", argTypes, term3046, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


