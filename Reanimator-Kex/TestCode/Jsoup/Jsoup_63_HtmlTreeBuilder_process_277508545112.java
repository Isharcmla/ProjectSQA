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

public class HtmlTreeBuilder_process_277508545112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4349;

    public HtmlTreeBuilder_process_277508545112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4349 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term4349, term4349.getClass(), "state", null);
        setField(term4349, term4349.getClass(), "originalState", null);
        setBooleanField(term4349, term4349.getClass(), "baseUriSetFromDoc", false);
        setField(term4349, term4349.getClass(), "headElement", null);
        setField(term4349, term4349.getClass(), "formElement", null);
        setField(term4349, term4349.getClass(), "contextElement", null);
        setField(term4349, term4349.getClass(), "formattingElements", null);
        setField(term4349, term4349.getClass(), "pendingTableCharacters", null);
        setField(term4349, term4349.getClass(), "emptyEnd", null);
        setBooleanField(term4349, term4349.getClass(), "framesetOk", false);
        setBooleanField(term4349, term4349.getClass(), "fosterInserts", false);
        setBooleanField(term4349, term4349.getClass(), "fragmentParsing", false);
        setField(term4349, term4349.getClass(), "specificScopeTarget", null);
        setField(term4349, term4349.getClass(), "reader", null);
        setField(term4349, term4349.getClass(), "tokeniser", null);
        setField(term4349, term4349.getClass(), "doc", null);
        setField(term4349, term4349.getClass(), "stack", null);
        setField(term4349, term4349.getClass(), "baseUri", null);
        setField(term4349, term4349.getClass(), "currentToken", null);
        setField(term4349, term4349.getClass(), "errors", null);
        setField(term4349, term4349.getClass(), "settings", null);
        setField(term4349, term4349.getClass(), "start", null);
        setField(term4349, term4349.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        argTypes[1] = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "process", argTypes, term4349, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


