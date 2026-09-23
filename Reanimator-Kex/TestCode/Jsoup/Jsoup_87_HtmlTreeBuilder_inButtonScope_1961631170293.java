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

public class HtmlTreeBuilder_inButtonScope_1961631170293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term473763;
     Object term473898;

    public HtmlTreeBuilder_inButtonScope_1961631170293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term473815 = new ArrayList();
        term473763 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object[] term473662 = (Object[]) newArray("java.lang.String", 10);
        setField(term473763, term473763.getClass(), "specificScopeTarget", term473662);
        setField(term473763, term473763.getClass(), "stack", term473815);
        ArrayList term473900 = new ArrayList();
        term473898 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object[] term473899 = (Object[]) newArray("java.lang.String", 10);
        setField(term473898, term473898.getClass(), "state", null);
        setField(term473898, term473898.getClass(), "originalState", null);
        setBooleanField(term473898, term473898.getClass(), "baseUriSetFromDoc", false);
        setField(term473898, term473898.getClass(), "headElement", null);
        setField(term473898, term473898.getClass(), "formElement", null);
        setField(term473898, term473898.getClass(), "contextElement", null);
        setField(term473898, term473898.getClass(), "formattingElements", null);
        setField(term473898, term473898.getClass(), "pendingTableCharacters", null);
        setField(term473898, term473898.getClass(), "emptyEnd", null);
        setBooleanField(term473898, term473898.getClass(), "framesetOk", false);
        setBooleanField(term473898, term473898.getClass(), "fosterInserts", false);
        setBooleanField(term473898, term473898.getClass(), "fragmentParsing", false);
        setField(term473898, term473898.getClass(), "specificScopeTarget", term473899);
        setField(term473898, term473898.getClass(), "parser", null);
        setField(term473898, term473898.getClass(), "reader", null);
        setField(term473898, term473898.getClass(), "tokeniser", null);
        setField(term473898, term473898.getClass(), "doc", null);
        setField(term473898, term473898.getClass(), "stack", term473900);
        setField(term473898, term473898.getClass(), "baseUri", null);
        setField(term473898, term473898.getClass(), "currentToken", null);
        setField(term473898, term473898.getClass(), "settings", null);
        setField(term473898, term473898.getClass(), "start", null);
        setField(term473898, term473898.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "inButtonScope", argTypes, term473763, args);
        assertTrue(recursiveEquals(term473763, term473898));
    }

};


