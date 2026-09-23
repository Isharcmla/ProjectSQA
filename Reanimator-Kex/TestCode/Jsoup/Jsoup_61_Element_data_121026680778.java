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
import java.lang.Object;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_data_121026680778 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6391;

    public Element_data_121026680778() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6413 = new ArrayList();
        ((ArrayList) term6413).add((Object)null);
        ((ArrayList) term6413).add((Object)null);
        ((ArrayList) term6413).add((Object)null);
        ((ArrayList) term6413).add((Object)null);
        ((ArrayList) term6413).add((Object)null);
        ((ArrayList) term6413).add((Object)null);
        ((ArrayList) term6413).add((Object)null);
        ((ArrayList) term6413).add((Object)null);
        ((ArrayList) term6413).add((Object)null);
        LinkedHashMap term6418 = new LinkedHashMap();
        term6391 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term6392 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term6417 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term6392, term6392.getClass(), "tagName", "bKBSncrMEZ");
        setBooleanField(term6392, term6392.getClass(), "isBlock", false);
        setBooleanField(term6392, term6392.getClass(), "formatAsBlock", false);
        setBooleanField(term6392, term6392.getClass(), "canContainInline", true);
        setBooleanField(term6392, term6392.getClass(), "empty", false);
        setBooleanField(term6392, term6392.getClass(), "selfClosing", false);
        setBooleanField(term6392, term6392.getClass(), "preserveWhitespace", false);
        setBooleanField(term6392, term6392.getClass(), "formList", false);
        setBooleanField(term6392, term6392.getClass(), "formSubmit", false);
        setField(term6391, term6391.getClass(), "tag", term6392);
        setField(term6391, term6391.getClass(), "parentNode", null);
        setField(term6391, term6391.getClass(), "childNodes", term6413);
        setField(term6417, term6417.getClass(), "attributes", term6418);
        setField(term6391, term6391.getClass(), "attributes", term6417);
        setField(term6391, term6391.getClass(), "baseUri", "cdHYQDgUZR");
        setIntField(term6391, term6391.getClass(), "siblingIndex", 1296895584);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "data", argTypes, term6391, args);
    }

};


