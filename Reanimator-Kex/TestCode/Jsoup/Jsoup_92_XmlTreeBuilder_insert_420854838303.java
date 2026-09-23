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

public class XmlTreeBuilder_insert_420854838303 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term320746;
     Object term320984;
     Object term321080;
     Object term321085;

    public XmlTreeBuilder_insert_420854838303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term320922 = new ArrayList();
        Object term320870 = newInstance(Class.forName("org.jsoup.nodes.PseudoTextElement"));
        setField(term320870, term320870.getClass(), "childNodes", term320922);
        ArrayList term320798 = new ArrayList();
        ((ArrayList) term320798).add((Object)null);
        ((ArrayList) term320798).add((Object)null);
        ((ArrayList) term320798).add((Object)null);
        ((ArrayList) term320798).add((Object)null);
        ((ArrayList) term320798).add((Object)null);
        ((ArrayList) term320798).add((Object)null);
        ((ArrayList) term320798).add((Object)null);
        ((ArrayList) term320798).add((Object)null);
        ((ArrayList) term320798).add((Object)null);
        ((ArrayList) term320798).add((Object)null);
        ((ArrayList) term320798).add((Object)null);
        ((ArrayList) term320798).add((Object)null);
        ((ArrayList) term320798).add((Object)null);
        ((ArrayList) term320798).add((Object)null);
        ((ArrayList) term320798).add((Object)null);
        ((ArrayList) term320798).add((Object)null);
        ((ArrayList) term320798).add((Object)null);
        ((ArrayList) term320798).add((Object)null);
        ((ArrayList) term320798).add((Object)null);
        ((ArrayList) term320798).add((Object)null);
        ((ArrayList) term320798).add((Object)null);
        ((ArrayList) term320798).add((Object)null);
        ((ArrayList) term320798).add((Object)null);
        ((ArrayList) term320798).add((Object)null);
        ((ArrayList) term320798).add((Object)null);
        ((ArrayList) term320798).add((Object)null);
        ((ArrayList) term320798).add((Object)null);
        ((ArrayList) term320798).add((Object)null);
        ((ArrayList) term320798).add((Object)null);
        ((ArrayList) term320798).add((Object)null);
        ((ArrayList) term320798).add((Object)null);
        ((ArrayList) term320798).add((Object)null);
        ((ArrayList) term320798).add((Object)null);
        ((ArrayList) term320798).add((Object)null);
        ((ArrayList) term320798).add((Object)null);
        ((ArrayList) term320798).add((Object)null);
        ((ArrayList) term320798).add((Object)null);
        ((ArrayList) term320798).add((Object)null);
        ((ArrayList) term320798).add((Object)null);
        ((ArrayList) term320798).add((Object)null);
        ((ArrayList) term320798).add((Object)null);
        ((ArrayList) term320798).add(term320870);
        term320746 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term320746, term320746.getClass(), "stack", term320798);
        term320984 = newInstance(Class.forName("org.jsoup.parser.Token$CData"));
        setField(term320984, term320984.getClass(), "data", "");
        ArrayList term321084 = new ArrayList();
        ((ArrayList) term321084).add((Object)null);
        Object term321083 = newInstance(Class.forName("org.jsoup.nodes.PseudoTextElement"));
        setField(term321083, term321083.getClass(), "tag", null);
        setField(term321083, term321083.getClass(), "shadowChildrenRef", null);
        setField(term321083, term321083.getClass(), "childNodes", term321084);
        setField(term321083, term321083.getClass(), "attributes", null);
        setField(term321083, term321083.getClass(), "baseUri", null);
        setField(term321083, term321083.getClass(), "parentNode", null);
        setIntField(term321083, term321083.getClass(), "siblingIndex", 0);
        ArrayList term321081 = new ArrayList();
        ((ArrayList) term321081).add((Object)null);
        ((ArrayList) term321081).add((Object)null);
        ((ArrayList) term321081).add((Object)null);
        ((ArrayList) term321081).add((Object)null);
        ((ArrayList) term321081).add((Object)null);
        ((ArrayList) term321081).add((Object)null);
        ((ArrayList) term321081).add((Object)null);
        ((ArrayList) term321081).add((Object)null);
        ((ArrayList) term321081).add((Object)null);
        ((ArrayList) term321081).add((Object)null);
        ((ArrayList) term321081).add((Object)null);
        ((ArrayList) term321081).add((Object)null);
        ((ArrayList) term321081).add((Object)null);
        ((ArrayList) term321081).add((Object)null);
        ((ArrayList) term321081).add((Object)null);
        ((ArrayList) term321081).add((Object)null);
        ((ArrayList) term321081).add((Object)null);
        ((ArrayList) term321081).add((Object)null);
        ((ArrayList) term321081).add((Object)null);
        ((ArrayList) term321081).add((Object)null);
        ((ArrayList) term321081).add((Object)null);
        ((ArrayList) term321081).add((Object)null);
        ((ArrayList) term321081).add((Object)null);
        ((ArrayList) term321081).add((Object)null);
        ((ArrayList) term321081).add((Object)null);
        ((ArrayList) term321081).add((Object)null);
        ((ArrayList) term321081).add((Object)null);
        ((ArrayList) term321081).add((Object)null);
        ((ArrayList) term321081).add((Object)null);
        ((ArrayList) term321081).add((Object)null);
        ((ArrayList) term321081).add((Object)null);
        ((ArrayList) term321081).add((Object)null);
        ((ArrayList) term321081).add((Object)null);
        ((ArrayList) term321081).add((Object)null);
        ((ArrayList) term321081).add((Object)null);
        ((ArrayList) term321081).add((Object)null);
        ((ArrayList) term321081).add((Object)null);
        ((ArrayList) term321081).add((Object)null);
        ((ArrayList) term321081).add((Object)null);
        ((ArrayList) term321081).add((Object)null);
        ((ArrayList) term321081).add((Object)null);
        ((ArrayList) term321081).add(term321083);
        term321080 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term321080, term321080.getClass(), "parser", null);
        setField(term321080, term321080.getClass(), "reader", null);
        setField(term321080, term321080.getClass(), "tokeniser", null);
        setField(term321080, term321080.getClass(), "doc", null);
        setField(term321080, term321080.getClass(), "stack", term321081);
        setField(term321080, term321080.getClass(), "baseUri", null);
        setField(term321080, term321080.getClass(), "currentToken", null);
        setField(term321080, term321080.getClass(), "settings", null);
        setField(term321080, term321080.getClass(), "start", null);
        setField(term321080, term321080.getClass(), "end", null);
        term321085 = newInstance(Class.forName("org.jsoup.parser.Token$CData"));
        setField(term321085, term321085.getClass(), "data", "");
        setField(term321085, term321085.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Character");
        Object[] args = new Object[1];
        args[0] = term320984;
        callMethod(klass, "insert", argTypes, term320746, args);
        assertTrue(recursiveEquals(term320746, term321080));
        assertTrue(recursiveEquals(term320984, term321085));
    }

};


