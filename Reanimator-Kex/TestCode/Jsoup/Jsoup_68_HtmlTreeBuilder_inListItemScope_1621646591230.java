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
import java.lang.Object;
import java.util.ArrayList;

public class HtmlTreeBuilder_inListItemScope_1621646591230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term251672;
     Object term251808;

    public HtmlTreeBuilder_inListItemScope_1621646591230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term251724 = new ArrayList();
        term251672 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object[] term251570 = (Object[]) newArray("java.lang.String", 10);
        setField(term251672, term251672.getClass(), "specificScopeTarget", term251570);
        setField(term251672, term251672.getClass(), "stack", term251724);
        ArrayList term251810 = new ArrayList();
        term251808 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object[] term251809 = (Object[]) newArray("java.lang.String", 10);
        setField(term251808, term251808.getClass(), "state", null);
        setField(term251808, term251808.getClass(), "originalState", null);
        setBooleanField(term251808, term251808.getClass(), "baseUriSetFromDoc", false);
        setField(term251808, term251808.getClass(), "headElement", null);
        setField(term251808, term251808.getClass(), "formElement", null);
        setField(term251808, term251808.getClass(), "contextElement", null);
        setField(term251808, term251808.getClass(), "formattingElements", null);
        setField(term251808, term251808.getClass(), "pendingTableCharacters", null);
        setField(term251808, term251808.getClass(), "emptyEnd", null);
        setBooleanField(term251808, term251808.getClass(), "framesetOk", false);
        setBooleanField(term251808, term251808.getClass(), "fosterInserts", false);
        setBooleanField(term251808, term251808.getClass(), "fragmentParsing", false);
        setField(term251808, term251808.getClass(), "specificScopeTarget", term251809);
        setField(term251808, term251808.getClass(), "reader", null);
        setField(term251808, term251808.getClass(), "tokeniser", null);
        setField(term251808, term251808.getClass(), "doc", null);
        setField(term251808, term251808.getClass(), "stack", term251810);
        setField(term251808, term251808.getClass(), "baseUri", null);
        setField(term251808, term251808.getClass(), "currentToken", null);
        setField(term251808, term251808.getClass(), "errors", null);
        setField(term251808, term251808.getClass(), "settings", null);
        setField(term251808, term251808.getClass(), "start", null);
        setField(term251808, term251808.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "inListItemScope", argTypes, term251672, args);
        assertTrue(recursiveEquals(term251672, term251808));
    }

};


