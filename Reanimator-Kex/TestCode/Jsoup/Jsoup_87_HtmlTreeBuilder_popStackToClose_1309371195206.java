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

public class HtmlTreeBuilder_popStackToClose_1309371195206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term441315;
     Object term441518;

    public HtmlTreeBuilder_popStackToClose_1309371195206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term441367 = new ArrayList();
        term441315 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term441315, term441315.getClass(), "stack", term441367);
        ArrayList term441519 = new ArrayList();
        term441518 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term441518, term441518.getClass(), "state", null);
        setField(term441518, term441518.getClass(), "originalState", null);
        setBooleanField(term441518, term441518.getClass(), "baseUriSetFromDoc", false);
        setField(term441518, term441518.getClass(), "headElement", null);
        setField(term441518, term441518.getClass(), "formElement", null);
        setField(term441518, term441518.getClass(), "contextElement", null);
        setField(term441518, term441518.getClass(), "formattingElements", null);
        setField(term441518, term441518.getClass(), "pendingTableCharacters", null);
        setField(term441518, term441518.getClass(), "emptyEnd", null);
        setBooleanField(term441518, term441518.getClass(), "framesetOk", false);
        setBooleanField(term441518, term441518.getClass(), "fosterInserts", false);
        setBooleanField(term441518, term441518.getClass(), "fragmentParsing", false);
        setField(term441518, term441518.getClass(), "specificScopeTarget", null);
        setField(term441518, term441518.getClass(), "parser", null);
        setField(term441518, term441518.getClass(), "reader", null);
        setField(term441518, term441518.getClass(), "tokeniser", null);
        setField(term441518, term441518.getClass(), "doc", null);
        setField(term441518, term441518.getClass(), "stack", term441519);
        setField(term441518, term441518.getClass(), "baseUri", null);
        setField(term441518, term441518.getClass(), "currentToken", null);
        setField(term441518, term441518.getClass(), "settings", null);
        setField(term441518, term441518.getClass(), "start", null);
        setField(term441518, term441518.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "popStackToClose", argTypes, term441315, args);
        assertTrue(recursiveEquals(term441315, term441518));
    }

};


