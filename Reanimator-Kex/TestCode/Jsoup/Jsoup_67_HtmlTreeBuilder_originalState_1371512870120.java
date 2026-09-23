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

public class HtmlTreeBuilder_originalState_1371512870120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10173;
     Object term114872;

    public HtmlTreeBuilder_originalState_1371512870120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10173 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term10173, term10173.getClass(), "state", null);
        setField(term10173, term10173.getClass(), "originalState", null);
        setBooleanField(term10173, term10173.getClass(), "baseUriSetFromDoc", false);
        setField(term10173, term10173.getClass(), "headElement", null);
        setField(term10173, term10173.getClass(), "formElement", null);
        setField(term10173, term10173.getClass(), "contextElement", null);
        setField(term10173, term10173.getClass(), "formattingElements", null);
        setField(term10173, term10173.getClass(), "pendingTableCharacters", null);
        setField(term10173, term10173.getClass(), "emptyEnd", null);
        setBooleanField(term10173, term10173.getClass(), "framesetOk", false);
        setBooleanField(term10173, term10173.getClass(), "fosterInserts", false);
        setBooleanField(term10173, term10173.getClass(), "fragmentParsing", false);
        setField(term10173, term10173.getClass(), "specificScopeTarget", null);
        setField(term10173, term10173.getClass(), "reader", null);
        setField(term10173, term10173.getClass(), "tokeniser", null);
        setField(term10173, term10173.getClass(), "doc", null);
        setField(term10173, term10173.getClass(), "stack", null);
        setField(term10173, term10173.getClass(), "baseUri", null);
        setField(term10173, term10173.getClass(), "currentToken", null);
        setField(term10173, term10173.getClass(), "errors", null);
        setField(term10173, term10173.getClass(), "settings", null);
        setField(term10173, term10173.getClass(), "start", null);
        setField(term10173, term10173.getClass(), "end", null);
        term114872 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term114872, term114872.getClass(), "state", null);
        setField(term114872, term114872.getClass(), "originalState", null);
        setBooleanField(term114872, term114872.getClass(), "baseUriSetFromDoc", false);
        setField(term114872, term114872.getClass(), "headElement", null);
        setField(term114872, term114872.getClass(), "formElement", null);
        setField(term114872, term114872.getClass(), "contextElement", null);
        setField(term114872, term114872.getClass(), "formattingElements", null);
        setField(term114872, term114872.getClass(), "pendingTableCharacters", null);
        setField(term114872, term114872.getClass(), "emptyEnd", null);
        setBooleanField(term114872, term114872.getClass(), "framesetOk", false);
        setBooleanField(term114872, term114872.getClass(), "fosterInserts", false);
        setBooleanField(term114872, term114872.getClass(), "fragmentParsing", false);
        setField(term114872, term114872.getClass(), "specificScopeTarget", null);
        setField(term114872, term114872.getClass(), "reader", null);
        setField(term114872, term114872.getClass(), "tokeniser", null);
        setField(term114872, term114872.getClass(), "doc", null);
        setField(term114872, term114872.getClass(), "stack", null);
        setField(term114872, term114872.getClass(), "baseUri", null);
        setField(term114872, term114872.getClass(), "currentToken", null);
        setField(term114872, term114872.getClass(), "errors", null);
        setField(term114872, term114872.getClass(), "settings", null);
        setField(term114872, term114872.getClass(), "start", null);
        setField(term114872, term114872.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "originalState", argTypes, term10173, args);
        assertTrue(recursiveEquals(term10173, term114872));
        assertTrue(recursiveEquals(retValue, null));
    }

};


