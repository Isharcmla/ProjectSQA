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

public class HtmlTreeBuilder_setPendingTableCharacters_759576865168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80383;
     Object term175525;

    public HtmlTreeBuilder_setPendingTableCharacters_759576865168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80383 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term80383, term80383.getClass(), "state", null);
        setField(term80383, term80383.getClass(), "originalState", null);
        setBooleanField(term80383, term80383.getClass(), "baseUriSetFromDoc", false);
        setField(term80383, term80383.getClass(), "headElement", null);
        setField(term80383, term80383.getClass(), "formElement", null);
        setField(term80383, term80383.getClass(), "contextElement", null);
        setField(term80383, term80383.getClass(), "formattingElements", null);
        setField(term80383, term80383.getClass(), "pendingTableCharacters", null);
        setField(term80383, term80383.getClass(), "emptyEnd", null);
        setBooleanField(term80383, term80383.getClass(), "framesetOk", false);
        setBooleanField(term80383, term80383.getClass(), "fosterInserts", false);
        setBooleanField(term80383, term80383.getClass(), "fragmentParsing", false);
        setField(term80383, term80383.getClass(), "specificScopeTarget", null);
        setField(term80383, term80383.getClass(), "reader", null);
        setField(term80383, term80383.getClass(), "tokeniser", null);
        setField(term80383, term80383.getClass(), "doc", null);
        setField(term80383, term80383.getClass(), "stack", null);
        setField(term80383, term80383.getClass(), "baseUri", null);
        setField(term80383, term80383.getClass(), "currentToken", null);
        setField(term80383, term80383.getClass(), "errors", null);
        setField(term80383, term80383.getClass(), "settings", null);
        setField(term80383, term80383.getClass(), "start", null);
        setField(term80383, term80383.getClass(), "end", null);
        term175525 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term175525, term175525.getClass(), "state", null);
        setField(term175525, term175525.getClass(), "originalState", null);
        setBooleanField(term175525, term175525.getClass(), "baseUriSetFromDoc", false);
        setField(term175525, term175525.getClass(), "headElement", null);
        setField(term175525, term175525.getClass(), "formElement", null);
        setField(term175525, term175525.getClass(), "contextElement", null);
        setField(term175525, term175525.getClass(), "formattingElements", null);
        setField(term175525, term175525.getClass(), "pendingTableCharacters", null);
        setField(term175525, term175525.getClass(), "emptyEnd", null);
        setBooleanField(term175525, term175525.getClass(), "framesetOk", false);
        setBooleanField(term175525, term175525.getClass(), "fosterInserts", false);
        setBooleanField(term175525, term175525.getClass(), "fragmentParsing", false);
        setField(term175525, term175525.getClass(), "specificScopeTarget", null);
        setField(term175525, term175525.getClass(), "reader", null);
        setField(term175525, term175525.getClass(), "tokeniser", null);
        setField(term175525, term175525.getClass(), "doc", null);
        setField(term175525, term175525.getClass(), "stack", null);
        setField(term175525, term175525.getClass(), "baseUri", null);
        setField(term175525, term175525.getClass(), "currentToken", null);
        setField(term175525, term175525.getClass(), "errors", null);
        setField(term175525, term175525.getClass(), "settings", null);
        setField(term175525, term175525.getClass(), "start", null);
        setField(term175525, term175525.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPendingTableCharacters", argTypes, term80383, args);
        assertTrue(recursiveEquals(term80383, term175525));
    }

};


