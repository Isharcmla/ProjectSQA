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

public class HtmlTreeBuilder_clearStackToTableContext_1480285551189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term600619;
     Object term601865;

    public HtmlTreeBuilder_clearStackToTableContext_1480285551189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term600731 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term600777 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term600777, term600777.getClass(), "tagName", "                                                                                                         ");
        setField(term600731, term600731.getClass(), "tag", term600777);
        ArrayList term600671 = new ArrayList();
        ((ArrayList) term600671).add(term600731);
        term600619 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term600619, term600619.getClass(), "stack", term600671);
        ArrayList term601866 = new ArrayList();
        term601865 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term601865, term601865.getClass(), "state", null);
        setField(term601865, term601865.getClass(), "originalState", null);
        setBooleanField(term601865, term601865.getClass(), "baseUriSetFromDoc", false);
        setField(term601865, term601865.getClass(), "headElement", null);
        setField(term601865, term601865.getClass(), "formElement", null);
        setField(term601865, term601865.getClass(), "contextElement", null);
        setField(term601865, term601865.getClass(), "formattingElements", null);
        setField(term601865, term601865.getClass(), "pendingTableCharacters", null);
        setField(term601865, term601865.getClass(), "emptyEnd", null);
        setBooleanField(term601865, term601865.getClass(), "framesetOk", false);
        setBooleanField(term601865, term601865.getClass(), "fosterInserts", false);
        setBooleanField(term601865, term601865.getClass(), "fragmentParsing", false);
        setField(term601865, term601865.getClass(), "specificScopeTarget", null);
        setField(term601865, term601865.getClass(), "reader", null);
        setField(term601865, term601865.getClass(), "tokeniser", null);
        setField(term601865, term601865.getClass(), "doc", null);
        setField(term601865, term601865.getClass(), "stack", term601866);
        setField(term601865, term601865.getClass(), "baseUri", null);
        setField(term601865, term601865.getClass(), "currentToken", null);
        setField(term601865, term601865.getClass(), "errors", null);
        setField(term601865, term601865.getClass(), "start", null);
        setField(term601865, term601865.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearStackToTableContext", argTypes, term600619, args);
        assertTrue(recursiveEquals(term600619, term601865));
    }

};


