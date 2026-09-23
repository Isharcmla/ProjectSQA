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

public class HtmlTreeBuilder_process_746811373109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5859;

    public HtmlTreeBuilder_process_746811373109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5859 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term5859, term5859.getClass(), "state", null);
        setField(term5859, term5859.getClass(), "originalState", null);
        setBooleanField(term5859, term5859.getClass(), "baseUriSetFromDoc", false);
        setField(term5859, term5859.getClass(), "headElement", null);
        setField(term5859, term5859.getClass(), "formElement", null);
        setField(term5859, term5859.getClass(), "contextElement", null);
        setField(term5859, term5859.getClass(), "formattingElements", null);
        setField(term5859, term5859.getClass(), "pendingTableCharacters", null);
        setField(term5859, term5859.getClass(), "emptyEnd", null);
        setBooleanField(term5859, term5859.getClass(), "framesetOk", false);
        setBooleanField(term5859, term5859.getClass(), "fosterInserts", false);
        setBooleanField(term5859, term5859.getClass(), "fragmentParsing", false);
        setField(term5859, term5859.getClass(), "specificScopeTarget", null);
        setField(term5859, term5859.getClass(), "parser", null);
        setField(term5859, term5859.getClass(), "reader", null);
        setField(term5859, term5859.getClass(), "tokeniser", null);
        setField(term5859, term5859.getClass(), "doc", null);
        setField(term5859, term5859.getClass(), "stack", null);
        setField(term5859, term5859.getClass(), "baseUri", null);
        setField(term5859, term5859.getClass(), "currentToken", null);
        setField(term5859, term5859.getClass(), "settings", null);
        setField(term5859, term5859.getClass(), "start", null);
        setField(term5859, term5859.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "process", argTypes, term5859, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


