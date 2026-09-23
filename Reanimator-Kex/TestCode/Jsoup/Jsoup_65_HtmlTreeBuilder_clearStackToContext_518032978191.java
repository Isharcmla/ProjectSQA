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

public class HtmlTreeBuilder_clearStackToContext_518032978191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term199342;
     Object term199543;

    public HtmlTreeBuilder_clearStackToContext_518032978191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term199394 = new ArrayList();
        term199342 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term199342, term199342.getClass(), "stack", term199394);
        ArrayList term199544 = new ArrayList();
        term199543 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term199543, term199543.getClass(), "state", null);
        setField(term199543, term199543.getClass(), "originalState", null);
        setBooleanField(term199543, term199543.getClass(), "baseUriSetFromDoc", false);
        setField(term199543, term199543.getClass(), "headElement", null);
        setField(term199543, term199543.getClass(), "formElement", null);
        setField(term199543, term199543.getClass(), "contextElement", null);
        setField(term199543, term199543.getClass(), "formattingElements", null);
        setField(term199543, term199543.getClass(), "pendingTableCharacters", null);
        setField(term199543, term199543.getClass(), "emptyEnd", null);
        setBooleanField(term199543, term199543.getClass(), "framesetOk", false);
        setBooleanField(term199543, term199543.getClass(), "fosterInserts", false);
        setBooleanField(term199543, term199543.getClass(), "fragmentParsing", false);
        setField(term199543, term199543.getClass(), "specificScopeTarget", null);
        setField(term199543, term199543.getClass(), "reader", null);
        setField(term199543, term199543.getClass(), "tokeniser", null);
        setField(term199543, term199543.getClass(), "doc", null);
        setField(term199543, term199543.getClass(), "stack", term199544);
        setField(term199543, term199543.getClass(), "baseUri", null);
        setField(term199543, term199543.getClass(), "currentToken", null);
        setField(term199543, term199543.getClass(), "errors", null);
        setField(term199543, term199543.getClass(), "settings", null);
        setField(term199543, term199543.getClass(), "start", null);
        setField(term199543, term199543.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "clearStackToContext", argTypes, term199342, args);
        assertTrue(recursiveEquals(term199342, term199543));
    }

};


