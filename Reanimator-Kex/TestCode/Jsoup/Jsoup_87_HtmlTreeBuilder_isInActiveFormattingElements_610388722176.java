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

public class HtmlTreeBuilder_isInActiveFormattingElements_610388722176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99220;

    public HtmlTreeBuilder_isInActiveFormattingElements_610388722176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99220 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term99220, term99220.getClass(), "state", null);
        setField(term99220, term99220.getClass(), "originalState", null);
        setBooleanField(term99220, term99220.getClass(), "baseUriSetFromDoc", false);
        setField(term99220, term99220.getClass(), "headElement", null);
        setField(term99220, term99220.getClass(), "formElement", null);
        setField(term99220, term99220.getClass(), "contextElement", null);
        setField(term99220, term99220.getClass(), "formattingElements", null);
        setField(term99220, term99220.getClass(), "pendingTableCharacters", null);
        setField(term99220, term99220.getClass(), "emptyEnd", null);
        setBooleanField(term99220, term99220.getClass(), "framesetOk", false);
        setBooleanField(term99220, term99220.getClass(), "fosterInserts", false);
        setBooleanField(term99220, term99220.getClass(), "fragmentParsing", false);
        setField(term99220, term99220.getClass(), "specificScopeTarget", null);
        setField(term99220, term99220.getClass(), "parser", null);
        setField(term99220, term99220.getClass(), "reader", null);
        setField(term99220, term99220.getClass(), "tokeniser", null);
        setField(term99220, term99220.getClass(), "doc", null);
        setField(term99220, term99220.getClass(), "stack", null);
        setField(term99220, term99220.getClass(), "baseUri", null);
        setField(term99220, term99220.getClass(), "currentToken", null);
        setField(term99220, term99220.getClass(), "settings", null);
        setField(term99220, term99220.getClass(), "start", null);
        setField(term99220, term99220.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "isInActiveFormattingElements", argTypes, term99220, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


