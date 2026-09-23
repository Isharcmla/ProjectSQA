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
import java.lang.Object;

public class HtmlTreeBuilder_isInActiveFormattingElements_610388722334 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term390389;
     Object term390545;
     Object term390606;
     Object term390610;

    public HtmlTreeBuilder_isInActiveFormattingElements_610388722334() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term390493 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        ArrayList term390441 = new ArrayList();
        ((ArrayList) term390441).add((Object)null);
        ((ArrayList) term390441).add((Object)null);
        ((ArrayList) term390441).add((Object)null);
        ((ArrayList) term390441).add((Object)null);
        ((ArrayList) term390441).add((Object)null);
        ((ArrayList) term390441).add((Object)null);
        ((ArrayList) term390441).add((Object)null);
        ((ArrayList) term390441).add((Object)null);
        ((ArrayList) term390441).add((Object)null);
        ((ArrayList) term390441).add((Object)null);
        ((ArrayList) term390441).add((Object)null);
        ((ArrayList) term390441).add(term390493);
        ((ArrayList) term390441).add(term390493);
        ((ArrayList) term390441).add(term390493);
        ((ArrayList) term390441).add(term390493);
        ((ArrayList) term390441).add(term390493);
        ((ArrayList) term390441).add(term390493);
        ((ArrayList) term390441).add(term390493);
        ((ArrayList) term390441).add(term390493);
        term390389 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term390389, term390389.getClass(), "formattingElements", term390441);
        term390545 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term390609 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term390609, term390609.getClass(), "tag", null);
        setField(term390609, term390609.getClass(), "shadowChildrenRef", null);
        setField(term390609, term390609.getClass(), "childNodes", null);
        setField(term390609, term390609.getClass(), "attributes", null);
        setField(term390609, term390609.getClass(), "baseUri", null);
        setField(term390609, term390609.getClass(), "parentNode", null);
        setIntField(term390609, term390609.getClass(), "siblingIndex", 0);
        ArrayList term390607 = new ArrayList();
        ((ArrayList) term390607).add((Object)null);
        ((ArrayList) term390607).add((Object)null);
        ((ArrayList) term390607).add((Object)null);
        ((ArrayList) term390607).add((Object)null);
        ((ArrayList) term390607).add((Object)null);
        ((ArrayList) term390607).add((Object)null);
        ((ArrayList) term390607).add((Object)null);
        ((ArrayList) term390607).add((Object)null);
        ((ArrayList) term390607).add((Object)null);
        ((ArrayList) term390607).add((Object)null);
        ((ArrayList) term390607).add((Object)null);
        ((ArrayList) term390607).add(term390609);
        ((ArrayList) term390607).add(term390609);
        ((ArrayList) term390607).add(term390609);
        ((ArrayList) term390607).add(term390609);
        ((ArrayList) term390607).add(term390609);
        ((ArrayList) term390607).add(term390609);
        ((ArrayList) term390607).add(term390609);
        ((ArrayList) term390607).add(term390609);
        term390606 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term390606, term390606.getClass(), "state", null);
        setField(term390606, term390606.getClass(), "originalState", null);
        setBooleanField(term390606, term390606.getClass(), "baseUriSetFromDoc", false);
        setField(term390606, term390606.getClass(), "headElement", null);
        setField(term390606, term390606.getClass(), "formElement", null);
        setField(term390606, term390606.getClass(), "contextElement", null);
        setField(term390606, term390606.getClass(), "formattingElements", term390607);
        setField(term390606, term390606.getClass(), "pendingTableCharacters", null);
        setField(term390606, term390606.getClass(), "emptyEnd", null);
        setBooleanField(term390606, term390606.getClass(), "framesetOk", false);
        setBooleanField(term390606, term390606.getClass(), "fosterInserts", false);
        setBooleanField(term390606, term390606.getClass(), "fragmentParsing", false);
        setField(term390606, term390606.getClass(), "specificScopeTarget", null);
        setField(term390606, term390606.getClass(), "reader", null);
        setField(term390606, term390606.getClass(), "tokeniser", null);
        setField(term390606, term390606.getClass(), "doc", null);
        setField(term390606, term390606.getClass(), "stack", null);
        setField(term390606, term390606.getClass(), "baseUri", null);
        setField(term390606, term390606.getClass(), "currentToken", null);
        setField(term390606, term390606.getClass(), "errors", null);
        setField(term390606, term390606.getClass(), "settings", null);
        setField(term390606, term390606.getClass(), "start", null);
        setField(term390606, term390606.getClass(), "end", null);
        term390610 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term390610, term390610.getClass(), "tag", null);
        setField(term390610, term390610.getClass(), "shadowChildrenRef", null);
        setField(term390610, term390610.getClass(), "childNodes", null);
        setField(term390610, term390610.getClass(), "attributes", null);
        setField(term390610, term390610.getClass(), "baseUri", null);
        setField(term390610, term390610.getClass(), "parentNode", null);
        setIntField(term390610, term390610.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term390545;
        callMethod(klass, "isInActiveFormattingElements", argTypes, term390389, args);
        assertTrue(recursiveEquals(term390389, term390606));
        assertTrue(recursiveEquals(term390545, term390610));
    }

};


