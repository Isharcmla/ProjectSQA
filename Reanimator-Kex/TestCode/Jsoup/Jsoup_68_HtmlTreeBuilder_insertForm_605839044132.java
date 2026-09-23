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
import java.lang.NullPointerException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class HtmlTreeBuilder_insertForm_605839044132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27050;
     Object term27055;

    public HtmlTreeBuilder_insertForm_605839044132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27050 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term27050, term27050.getClass(), "state", null);
        setField(term27050, term27050.getClass(), "originalState", null);
        setBooleanField(term27050, term27050.getClass(), "baseUriSetFromDoc", false);
        setField(term27050, term27050.getClass(), "headElement", null);
        setField(term27050, term27050.getClass(), "formElement", null);
        setField(term27050, term27050.getClass(), "contextElement", null);
        setField(term27050, term27050.getClass(), "formattingElements", null);
        setField(term27050, term27050.getClass(), "pendingTableCharacters", null);
        setField(term27050, term27050.getClass(), "emptyEnd", null);
        setBooleanField(term27050, term27050.getClass(), "framesetOk", false);
        setBooleanField(term27050, term27050.getClass(), "fosterInserts", false);
        setBooleanField(term27050, term27050.getClass(), "fragmentParsing", false);
        setField(term27050, term27050.getClass(), "specificScopeTarget", null);
        setField(term27050, term27050.getClass(), "reader", null);
        setField(term27050, term27050.getClass(), "tokeniser", null);
        setField(term27050, term27050.getClass(), "doc", null);
        setField(term27050, term27050.getClass(), "stack", null);
        setField(term27050, term27050.getClass(), "baseUri", null);
        setField(term27050, term27050.getClass(), "currentToken", null);
        setField(term27050, term27050.getClass(), "errors", null);
        setField(term27050, term27050.getClass(), "settings", null);
        setField(term27050, term27050.getClass(), "start", null);
        setField(term27050, term27050.getClass(), "end", null);
        term27055 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$StartTag");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term27055;
        try {
            callMethod(klass, "insertForm", argTypes, term27050, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


