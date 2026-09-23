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

public class HtmlTreeBuilder_inListItemScope_1621646591278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term330055;
     Object term330335;

    public HtmlTreeBuilder_inListItemScope_1621646591278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term330107 = new ArrayList();
        term330055 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object[] term329954 = (Object[]) newArray("java.lang.String", 10);
        setField(term330055, term330055.getClass(), "specificScopeTarget", term329954);
        setField(term330055, term330055.getClass(), "stack", term330107);
        ArrayList term330337 = new ArrayList();
        term330335 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object[] term330336 = (Object[]) newArray("java.lang.String", 10);
        setField(term330335, term330335.getClass(), "state", null);
        setField(term330335, term330335.getClass(), "originalState", null);
        setBooleanField(term330335, term330335.getClass(), "baseUriSetFromDoc", false);
        setField(term330335, term330335.getClass(), "headElement", null);
        setField(term330335, term330335.getClass(), "formElement", null);
        setField(term330335, term330335.getClass(), "contextElement", null);
        setField(term330335, term330335.getClass(), "formattingElements", null);
        setField(term330335, term330335.getClass(), "pendingTableCharacters", null);
        setField(term330335, term330335.getClass(), "emptyEnd", null);
        setBooleanField(term330335, term330335.getClass(), "framesetOk", false);
        setBooleanField(term330335, term330335.getClass(), "fosterInserts", false);
        setBooleanField(term330335, term330335.getClass(), "fragmentParsing", false);
        setField(term330335, term330335.getClass(), "specificScopeTarget", term330336);
        setField(term330335, term330335.getClass(), "parser", null);
        setField(term330335, term330335.getClass(), "reader", null);
        setField(term330335, term330335.getClass(), "tokeniser", null);
        setField(term330335, term330335.getClass(), "doc", null);
        setField(term330335, term330335.getClass(), "stack", term330337);
        setField(term330335, term330335.getClass(), "baseUri", null);
        setField(term330335, term330335.getClass(), "currentToken", null);
        setField(term330335, term330335.getClass(), "settings", null);
        setField(term330335, term330335.getClass(), "start", null);
        setField(term330335, term330335.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "inListItemScope", argTypes, term330055, args);
        assertTrue(recursiveEquals(term330055, term330335));
    }

};


