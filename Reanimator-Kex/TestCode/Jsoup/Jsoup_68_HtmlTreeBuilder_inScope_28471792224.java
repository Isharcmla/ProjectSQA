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

public class HtmlTreeBuilder_inScope_28471792224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term251141;
     Object term251264;

    public HtmlTreeBuilder_inScope_28471792224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term251193 = new ArrayList();
        term251141 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term251141, term251141.getClass(), "stack", term251193);
        ArrayList term251265 = new ArrayList();
        term251264 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term251264, term251264.getClass(), "state", null);
        setField(term251264, term251264.getClass(), "originalState", null);
        setBooleanField(term251264, term251264.getClass(), "baseUriSetFromDoc", false);
        setField(term251264, term251264.getClass(), "headElement", null);
        setField(term251264, term251264.getClass(), "formElement", null);
        setField(term251264, term251264.getClass(), "contextElement", null);
        setField(term251264, term251264.getClass(), "formattingElements", null);
        setField(term251264, term251264.getClass(), "pendingTableCharacters", null);
        setField(term251264, term251264.getClass(), "emptyEnd", null);
        setBooleanField(term251264, term251264.getClass(), "framesetOk", false);
        setBooleanField(term251264, term251264.getClass(), "fosterInserts", false);
        setBooleanField(term251264, term251264.getClass(), "fragmentParsing", false);
        setField(term251264, term251264.getClass(), "specificScopeTarget", null);
        setField(term251264, term251264.getClass(), "reader", null);
        setField(term251264, term251264.getClass(), "tokeniser", null);
        setField(term251264, term251264.getClass(), "doc", null);
        setField(term251264, term251264.getClass(), "stack", term251265);
        setField(term251264, term251264.getClass(), "baseUri", null);
        setField(term251264, term251264.getClass(), "currentToken", null);
        setField(term251264, term251264.getClass(), "errors", null);
        setField(term251264, term251264.getClass(), "settings", null);
        setField(term251264, term251264.getClass(), "start", null);
        setField(term251264, term251264.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "inScope", argTypes, term251141, args);
        assertTrue(recursiveEquals(term251141, term251264));
    }

};


