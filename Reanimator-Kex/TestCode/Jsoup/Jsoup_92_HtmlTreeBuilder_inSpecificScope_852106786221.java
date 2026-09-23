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

public class HtmlTreeBuilder_inSpecificScope_852106786221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term312958;
     Object term313023;

    public HtmlTreeBuilder_inSpecificScope_852106786221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term313010 = new ArrayList();
        term312958 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term312958, term312958.getClass(), "stack", term313010);
        ArrayList term313024 = new ArrayList();
        term313023 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term313023, term313023.getClass(), "state", null);
        setField(term313023, term313023.getClass(), "originalState", null);
        setBooleanField(term313023, term313023.getClass(), "baseUriSetFromDoc", false);
        setField(term313023, term313023.getClass(), "headElement", null);
        setField(term313023, term313023.getClass(), "formElement", null);
        setField(term313023, term313023.getClass(), "contextElement", null);
        setField(term313023, term313023.getClass(), "formattingElements", null);
        setField(term313023, term313023.getClass(), "pendingTableCharacters", null);
        setField(term313023, term313023.getClass(), "emptyEnd", null);
        setBooleanField(term313023, term313023.getClass(), "framesetOk", false);
        setBooleanField(term313023, term313023.getClass(), "fosterInserts", false);
        setBooleanField(term313023, term313023.getClass(), "fragmentParsing", false);
        setField(term313023, term313023.getClass(), "specificScopeTarget", null);
        setField(term313023, term313023.getClass(), "parser", null);
        setField(term313023, term313023.getClass(), "reader", null);
        setField(term313023, term313023.getClass(), "tokeniser", null);
        setField(term313023, term313023.getClass(), "doc", null);
        setField(term313023, term313023.getClass(), "stack", term313024);
        setField(term313023, term313023.getClass(), "baseUri", null);
        setField(term313023, term313023.getClass(), "currentToken", null);
        setField(term313023, term313023.getClass(), "settings", null);
        setField(term313023, term313023.getClass(), "start", null);
        setField(term313023, term313023.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        Object retValue = callMethod(klass, "inSpecificScope", argTypes, term312958, args);
        assertTrue(recursiveEquals(term312958, term313023));
        assertTrue(recursiveEquals(retValue, false));
    }

};


