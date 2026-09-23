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

public class HtmlTreeBuilder_inScope_453351309348 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term292177;
     Object term292303;

    public HtmlTreeBuilder_inScope_453351309348() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term292229 = new ArrayList();
        term292177 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object[] term292088 = (Object[]) newArray("java.lang.String", 1);
        setField(term292177, term292177.getClass(), "specificScopeTarget", term292088);
        setField(term292177, term292177.getClass(), "stack", term292229);
        ArrayList term292305 = new ArrayList();
        term292303 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object[] term292304 = (Object[]) newArray("java.lang.String", 1);
        setField(term292303, term292303.getClass(), "state", null);
        setField(term292303, term292303.getClass(), "originalState", null);
        setBooleanField(term292303, term292303.getClass(), "baseUriSetFromDoc", false);
        setField(term292303, term292303.getClass(), "headElement", null);
        setField(term292303, term292303.getClass(), "formElement", null);
        setField(term292303, term292303.getClass(), "contextElement", null);
        setField(term292303, term292303.getClass(), "formattingElements", null);
        setField(term292303, term292303.getClass(), "pendingTableCharacters", null);
        setField(term292303, term292303.getClass(), "emptyEnd", null);
        setBooleanField(term292303, term292303.getClass(), "framesetOk", false);
        setBooleanField(term292303, term292303.getClass(), "fosterInserts", false);
        setBooleanField(term292303, term292303.getClass(), "fragmentParsing", false);
        setField(term292303, term292303.getClass(), "specificScopeTarget", term292304);
        setField(term292303, term292303.getClass(), "reader", null);
        setField(term292303, term292303.getClass(), "tokeniser", null);
        setField(term292303, term292303.getClass(), "doc", null);
        setField(term292303, term292303.getClass(), "stack", term292305);
        setField(term292303, term292303.getClass(), "baseUri", null);
        setField(term292303, term292303.getClass(), "currentToken", null);
        setField(term292303, term292303.getClass(), "errors", null);
        setField(term292303, term292303.getClass(), "settings", null);
        setField(term292303, term292303.getClass(), "start", null);
        setField(term292303, term292303.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "inScope", argTypes, term292177, args);
        assertTrue(recursiveEquals(term292177, term292303));
    }

};


