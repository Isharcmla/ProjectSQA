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

public class HtmlTreeBuilder_removeFromActiveFormattingElements_1580466725217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198717;
     Object term198983;

    public HtmlTreeBuilder_removeFromActiveFormattingElements_1580466725217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term198769 = new ArrayList();
        term198717 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term198717, term198717.getClass(), "formattingElements", term198769);
        ArrayList term198984 = new ArrayList();
        term198983 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term198983, term198983.getClass(), "state", null);
        setField(term198983, term198983.getClass(), "originalState", null);
        setBooleanField(term198983, term198983.getClass(), "baseUriSetFromDoc", false);
        setField(term198983, term198983.getClass(), "headElement", null);
        setField(term198983, term198983.getClass(), "formElement", null);
        setField(term198983, term198983.getClass(), "contextElement", null);
        setField(term198983, term198983.getClass(), "formattingElements", term198984);
        setField(term198983, term198983.getClass(), "pendingTableCharacters", null);
        setField(term198983, term198983.getClass(), "emptyEnd", null);
        setBooleanField(term198983, term198983.getClass(), "framesetOk", false);
        setBooleanField(term198983, term198983.getClass(), "fosterInserts", false);
        setBooleanField(term198983, term198983.getClass(), "fragmentParsing", false);
        setField(term198983, term198983.getClass(), "specificScopeTarget", null);
        setField(term198983, term198983.getClass(), "reader", null);
        setField(term198983, term198983.getClass(), "tokeniser", null);
        setField(term198983, term198983.getClass(), "doc", null);
        setField(term198983, term198983.getClass(), "stack", null);
        setField(term198983, term198983.getClass(), "baseUri", null);
        setField(term198983, term198983.getClass(), "currentToken", null);
        setField(term198983, term198983.getClass(), "errors", null);
        setField(term198983, term198983.getClass(), "settings", null);
        setField(term198983, term198983.getClass(), "start", null);
        setField(term198983, term198983.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "removeFromActiveFormattingElements", argTypes, term198717, args);
        assertTrue(recursiveEquals(term198717, term198983));
    }

};


