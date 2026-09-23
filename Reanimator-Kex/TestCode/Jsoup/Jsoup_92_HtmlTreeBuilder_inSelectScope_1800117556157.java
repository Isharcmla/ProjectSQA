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

public class HtmlTreeBuilder_inSelectScope_1800117556157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75840;

    public HtmlTreeBuilder_inSelectScope_1800117556157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75840 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term75840, term75840.getClass(), "state", null);
        setField(term75840, term75840.getClass(), "originalState", null);
        setBooleanField(term75840, term75840.getClass(), "baseUriSetFromDoc", false);
        setField(term75840, term75840.getClass(), "headElement", null);
        setField(term75840, term75840.getClass(), "formElement", null);
        setField(term75840, term75840.getClass(), "contextElement", null);
        setField(term75840, term75840.getClass(), "formattingElements", null);
        setField(term75840, term75840.getClass(), "pendingTableCharacters", null);
        setField(term75840, term75840.getClass(), "emptyEnd", null);
        setBooleanField(term75840, term75840.getClass(), "framesetOk", false);
        setBooleanField(term75840, term75840.getClass(), "fosterInserts", false);
        setBooleanField(term75840, term75840.getClass(), "fragmentParsing", false);
        setField(term75840, term75840.getClass(), "specificScopeTarget", null);
        setField(term75840, term75840.getClass(), "parser", null);
        setField(term75840, term75840.getClass(), "reader", null);
        setField(term75840, term75840.getClass(), "tokeniser", null);
        setField(term75840, term75840.getClass(), "doc", null);
        setField(term75840, term75840.getClass(), "stack", null);
        setField(term75840, term75840.getClass(), "baseUri", null);
        setField(term75840, term75840.getClass(), "currentToken", null);
        setField(term75840, term75840.getClass(), "settings", null);
        setField(term75840, term75840.getClass(), "start", null);
        setField(term75840, term75840.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "inSelectScope", argTypes, term75840, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


