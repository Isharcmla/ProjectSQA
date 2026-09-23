package org.jsoup.nodes;

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
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.nodes.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_tagName_1715810852100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term225;
     Object term9092;

    public Element_tagName_1715810852100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term247 = new ArrayList();
        ((ArrayList) term247).add((Object)null);
        ((ArrayList) term247).add((Object)null);
        ((ArrayList) term247).add((Object)null);
        ((ArrayList) term247).add((Object)null);
        LinkedHashMap term252 = new LinkedHashMap();
        term225 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term226 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term251 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term226, term226.getClass(), "tagName", "LQFpaHEwXR");
        setBooleanField(term226, term226.getClass(), "isBlock", true);
        setBooleanField(term226, term226.getClass(), "formatAsBlock", false);
        setBooleanField(term226, term226.getClass(), "canContainInline", false);
        setBooleanField(term226, term226.getClass(), "empty", false);
        setBooleanField(term226, term226.getClass(), "selfClosing", true);
        setBooleanField(term226, term226.getClass(), "preserveWhitespace", true);
        setBooleanField(term226, term226.getClass(), "formList", true);
        setBooleanField(term226, term226.getClass(), "formSubmit", true);
        setField(term225, term225.getClass(), "tag", term226);
        setField(term225, term225.getClass(), "parentNode", null);
        setField(term225, term225.getClass(), "childNodes", term247);
        setField(term251, term251.getClass(), "attributes", term252);
        setField(term225, term225.getClass(), "attributes", term251);
        setField(term225, term225.getClass(), "baseUri", "tbcdzjIfER");
        setIntField(term225, term225.getClass(), "siblingIndex", 1162663216);
        ArrayList term9096 = new ArrayList();
        ((ArrayList) term9096).add((Object)null);
        ((ArrayList) term9096).add((Object)null);
        ((ArrayList) term9096).add((Object)null);
        ((ArrayList) term9096).add((Object)null);
        LinkedHashMap term9099 = new LinkedHashMap();
        term9092 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term9093 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term9098 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term9093, term9093.getClass(), "tagName", "LQFpaHEwXR");
        setBooleanField(term9093, term9093.getClass(), "isBlock", true);
        setBooleanField(term9093, term9093.getClass(), "formatAsBlock", false);
        setBooleanField(term9093, term9093.getClass(), "canContainInline", false);
        setBooleanField(term9093, term9093.getClass(), "empty", false);
        setBooleanField(term9093, term9093.getClass(), "selfClosing", true);
        setBooleanField(term9093, term9093.getClass(), "preserveWhitespace", true);
        setBooleanField(term9093, term9093.getClass(), "formList", true);
        setBooleanField(term9093, term9093.getClass(), "formSubmit", true);
        setField(term9092, term9092.getClass(), "tag", term9093);
        setField(term9092, term9092.getClass(), "parentNode", null);
        setField(term9092, term9092.getClass(), "childNodes", term9096);
        setField(term9098, term9098.getClass(), "attributes", term9099);
        setField(term9092, term9092.getClass(), "attributes", term9098);
        setField(term9092, term9092.getClass(), "baseUri", "tbcdzjIfER");
        setIntField(term9092, term9092.getClass(), "siblingIndex", 1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "tagName", argTypes, term225, args);
        assertTrue(recursiveEquals(term225, term9092));
        assertTrue(recursiveEquals(retValue, "LQFpaHEwXR"));
    }

};


