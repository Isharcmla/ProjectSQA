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

public class HtmlTreeBuilder_popStackToClose_1309371195284 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term226644;
     Object term226707;

    public HtmlTreeBuilder_popStackToClose_1309371195284() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term226696 = new ArrayList();
        term226644 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term226644, term226644.getClass(), "stack", term226696);
        ArrayList term226708 = new ArrayList();
        term226707 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term226707, term226707.getClass(), "state", null);
        setField(term226707, term226707.getClass(), "originalState", null);
        setBooleanField(term226707, term226707.getClass(), "baseUriSetFromDoc", false);
        setField(term226707, term226707.getClass(), "headElement", null);
        setField(term226707, term226707.getClass(), "formElement", null);
        setField(term226707, term226707.getClass(), "contextElement", null);
        setField(term226707, term226707.getClass(), "formattingElements", null);
        setField(term226707, term226707.getClass(), "pendingTableCharacters", null);
        setField(term226707, term226707.getClass(), "emptyEnd", null);
        setBooleanField(term226707, term226707.getClass(), "framesetOk", false);
        setBooleanField(term226707, term226707.getClass(), "fosterInserts", false);
        setBooleanField(term226707, term226707.getClass(), "fragmentParsing", false);
        setField(term226707, term226707.getClass(), "specificScopeTarget", null);
        setField(term226707, term226707.getClass(), "reader", null);
        setField(term226707, term226707.getClass(), "tokeniser", null);
        setField(term226707, term226707.getClass(), "doc", null);
        setField(term226707, term226707.getClass(), "stack", term226708);
        setField(term226707, term226707.getClass(), "baseUri", null);
        setField(term226707, term226707.getClass(), "currentToken", null);
        setField(term226707, term226707.getClass(), "errors", null);
        setField(term226707, term226707.getClass(), "settings", null);
        setField(term226707, term226707.getClass(), "start", null);
        setField(term226707, term226707.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "popStackToClose", argTypes, term226644, args);
        assertTrue(recursiveEquals(term226644, term226707));
    }

};


