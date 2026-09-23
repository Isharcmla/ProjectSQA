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

public class HtmlTreeBuilder_state_912208149112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10585;
     Object term129844;

    public HtmlTreeBuilder_state_912208149112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10585 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term10585, term10585.getClass(), "state", null);
        setField(term10585, term10585.getClass(), "originalState", null);
        setBooleanField(term10585, term10585.getClass(), "baseUriSetFromDoc", false);
        setField(term10585, term10585.getClass(), "headElement", null);
        setField(term10585, term10585.getClass(), "formElement", null);
        setField(term10585, term10585.getClass(), "contextElement", null);
        setField(term10585, term10585.getClass(), "formattingElements", null);
        setField(term10585, term10585.getClass(), "pendingTableCharacters", null);
        setField(term10585, term10585.getClass(), "emptyEnd", null);
        setBooleanField(term10585, term10585.getClass(), "framesetOk", false);
        setBooleanField(term10585, term10585.getClass(), "fosterInserts", false);
        setBooleanField(term10585, term10585.getClass(), "fragmentParsing", false);
        setField(term10585, term10585.getClass(), "specificScopeTarget", null);
        setField(term10585, term10585.getClass(), "parser", null);
        setField(term10585, term10585.getClass(), "reader", null);
        setField(term10585, term10585.getClass(), "tokeniser", null);
        setField(term10585, term10585.getClass(), "doc", null);
        setField(term10585, term10585.getClass(), "stack", null);
        setField(term10585, term10585.getClass(), "baseUri", null);
        setField(term10585, term10585.getClass(), "currentToken", null);
        setField(term10585, term10585.getClass(), "settings", null);
        setField(term10585, term10585.getClass(), "start", null);
        setField(term10585, term10585.getClass(), "end", null);
        term129844 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term129844, term129844.getClass(), "state", null);
        setField(term129844, term129844.getClass(), "originalState", null);
        setBooleanField(term129844, term129844.getClass(), "baseUriSetFromDoc", false);
        setField(term129844, term129844.getClass(), "headElement", null);
        setField(term129844, term129844.getClass(), "formElement", null);
        setField(term129844, term129844.getClass(), "contextElement", null);
        setField(term129844, term129844.getClass(), "formattingElements", null);
        setField(term129844, term129844.getClass(), "pendingTableCharacters", null);
        setField(term129844, term129844.getClass(), "emptyEnd", null);
        setBooleanField(term129844, term129844.getClass(), "framesetOk", false);
        setBooleanField(term129844, term129844.getClass(), "fosterInserts", false);
        setBooleanField(term129844, term129844.getClass(), "fragmentParsing", false);
        setField(term129844, term129844.getClass(), "specificScopeTarget", null);
        setField(term129844, term129844.getClass(), "parser", null);
        setField(term129844, term129844.getClass(), "reader", null);
        setField(term129844, term129844.getClass(), "tokeniser", null);
        setField(term129844, term129844.getClass(), "doc", null);
        setField(term129844, term129844.getClass(), "stack", null);
        setField(term129844, term129844.getClass(), "baseUri", null);
        setField(term129844, term129844.getClass(), "currentToken", null);
        setField(term129844, term129844.getClass(), "settings", null);
        setField(term129844, term129844.getClass(), "start", null);
        setField(term129844, term129844.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "state", argTypes, term10585, args);
        assertTrue(recursiveEquals(term10585, term129844));
        assertTrue(recursiveEquals(retValue, null));
    }

};


