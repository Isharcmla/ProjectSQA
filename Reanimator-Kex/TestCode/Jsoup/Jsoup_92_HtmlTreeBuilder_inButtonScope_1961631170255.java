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

public class HtmlTreeBuilder_inButtonScope_1961631170255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term320284;
     Object term320419;

    public HtmlTreeBuilder_inButtonScope_1961631170255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term320336 = new ArrayList();
        term320284 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object[] term320183 = (Object[]) newArray("java.lang.String", 10);
        setField(term320284, term320284.getClass(), "specificScopeTarget", term320183);
        setField(term320284, term320284.getClass(), "stack", term320336);
        ArrayList term320421 = new ArrayList();
        term320419 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object[] term320420 = (Object[]) newArray("java.lang.String", 10);
        setField(term320419, term320419.getClass(), "state", null);
        setField(term320419, term320419.getClass(), "originalState", null);
        setBooleanField(term320419, term320419.getClass(), "baseUriSetFromDoc", false);
        setField(term320419, term320419.getClass(), "headElement", null);
        setField(term320419, term320419.getClass(), "formElement", null);
        setField(term320419, term320419.getClass(), "contextElement", null);
        setField(term320419, term320419.getClass(), "formattingElements", null);
        setField(term320419, term320419.getClass(), "pendingTableCharacters", null);
        setField(term320419, term320419.getClass(), "emptyEnd", null);
        setBooleanField(term320419, term320419.getClass(), "framesetOk", false);
        setBooleanField(term320419, term320419.getClass(), "fosterInserts", false);
        setBooleanField(term320419, term320419.getClass(), "fragmentParsing", false);
        setField(term320419, term320419.getClass(), "specificScopeTarget", term320420);
        setField(term320419, term320419.getClass(), "parser", null);
        setField(term320419, term320419.getClass(), "reader", null);
        setField(term320419, term320419.getClass(), "tokeniser", null);
        setField(term320419, term320419.getClass(), "doc", null);
        setField(term320419, term320419.getClass(), "stack", term320421);
        setField(term320419, term320419.getClass(), "baseUri", null);
        setField(term320419, term320419.getClass(), "currentToken", null);
        setField(term320419, term320419.getClass(), "settings", null);
        setField(term320419, term320419.getClass(), "start", null);
        setField(term320419, term320419.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "inButtonScope", argTypes, term320284, args);
        assertTrue(recursiveEquals(term320284, term320419));
    }

};


