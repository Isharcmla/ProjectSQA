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
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.parser.EqualityUtils.*;
import java.util.ArrayList;

public class HtmlTreeBuilder_clearStackToContext_518032978273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term218207;
     Object term219048;

    public HtmlTreeBuilder_clearStackToContext_518032978273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term218259 = new ArrayList();
        term218207 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term218207, term218207.getClass(), "stack", term218259);
        ArrayList term219049 = new ArrayList();
        term219048 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term219048, term219048.getClass(), "state", null);
        setField(term219048, term219048.getClass(), "originalState", null);
        setBooleanField(term219048, term219048.getClass(), "baseUriSetFromDoc", false);
        setField(term219048, term219048.getClass(), "headElement", null);
        setField(term219048, term219048.getClass(), "formElement", null);
        setField(term219048, term219048.getClass(), "contextElement", null);
        setField(term219048, term219048.getClass(), "formattingElements", null);
        setField(term219048, term219048.getClass(), "pendingTableCharacters", null);
        setField(term219048, term219048.getClass(), "emptyEnd", null);
        setBooleanField(term219048, term219048.getClass(), "framesetOk", false);
        setBooleanField(term219048, term219048.getClass(), "fosterInserts", false);
        setBooleanField(term219048, term219048.getClass(), "fragmentParsing", false);
        setField(term219048, term219048.getClass(), "specificScopeTarget", null);
        setField(term219048, term219048.getClass(), "reader", null);
        setField(term219048, term219048.getClass(), "tokeniser", null);
        setField(term219048, term219048.getClass(), "doc", null);
        setField(term219048, term219048.getClass(), "stack", term219049);
        setField(term219048, term219048.getClass(), "baseUri", null);
        setField(term219048, term219048.getClass(), "currentToken", null);
        setField(term219048, term219048.getClass(), "errors", null);
        setField(term219048, term219048.getClass(), "settings", null);
        setField(term219048, term219048.getClass(), "start", null);
        setField(term219048, term219048.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "clearStackToContext", argTypes, term218207, args);
        assertTrue(recursiveEquals(term218207, term219048));
    }

};


