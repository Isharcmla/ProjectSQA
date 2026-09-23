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

public class HtmlTreeBuilder_reconstructFormattingElements_2126795672199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term200857;
     Object term201345;

    public HtmlTreeBuilder_reconstructFormattingElements_2126795672199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term200909 = new ArrayList();
        term200857 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term200857, term200857.getClass(), "formattingElements", term200909);
        ArrayList term201346 = new ArrayList();
        term201345 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term201345, term201345.getClass(), "state", null);
        setField(term201345, term201345.getClass(), "originalState", null);
        setBooleanField(term201345, term201345.getClass(), "baseUriSetFromDoc", false);
        setField(term201345, term201345.getClass(), "headElement", null);
        setField(term201345, term201345.getClass(), "formElement", null);
        setField(term201345, term201345.getClass(), "contextElement", null);
        setField(term201345, term201345.getClass(), "formattingElements", term201346);
        setField(term201345, term201345.getClass(), "pendingTableCharacters", null);
        setField(term201345, term201345.getClass(), "emptyEnd", null);
        setBooleanField(term201345, term201345.getClass(), "framesetOk", false);
        setBooleanField(term201345, term201345.getClass(), "fosterInserts", false);
        setBooleanField(term201345, term201345.getClass(), "fragmentParsing", false);
        setField(term201345, term201345.getClass(), "specificScopeTarget", null);
        setField(term201345, term201345.getClass(), "reader", null);
        setField(term201345, term201345.getClass(), "tokeniser", null);
        setField(term201345, term201345.getClass(), "doc", null);
        setField(term201345, term201345.getClass(), "stack", null);
        setField(term201345, term201345.getClass(), "baseUri", null);
        setField(term201345, term201345.getClass(), "currentToken", null);
        setField(term201345, term201345.getClass(), "errors", null);
        setField(term201345, term201345.getClass(), "settings", null);
        setField(term201345, term201345.getClass(), "start", null);
        setField(term201345, term201345.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "reconstructFormattingElements", argTypes, term200857, args);
        assertTrue(recursiveEquals(term200857, term201345));
    }

};


