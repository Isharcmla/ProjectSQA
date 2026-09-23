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

public class Element_text_125384701772 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6035;

    public Element_text_125384701772() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6058 = new ArrayList();
        ((ArrayList) term6058).add((Object)null);
        ((ArrayList) term6058).add((Object)null);
        ((ArrayList) term6058).add((Object)null);
        ((ArrayList) term6058).add((Object)null);
        ((ArrayList) term6058).add((Object)null);
        ((ArrayList) term6058).add((Object)null);
        ((ArrayList) term6058).add((Object)null);
        ((ArrayList) term6058).add((Object)null);
        LinkedHashMap term6063 = new LinkedHashMap();
        term6035 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term6036 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term6062 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term6036, term6036.getClass(), "tagName", "zgKiINdgNu");
        setBooleanField(term6036, term6036.getClass(), "isBlock", true);
        setBooleanField(term6036, term6036.getClass(), "formatAsBlock", true);
        setBooleanField(term6036, term6036.getClass(), "canContainBlock", false);
        setBooleanField(term6036, term6036.getClass(), "canContainInline", true);
        setBooleanField(term6036, term6036.getClass(), "empty", false);
        setBooleanField(term6036, term6036.getClass(), "selfClosing", true);
        setBooleanField(term6036, term6036.getClass(), "preserveWhitespace", true);
        setBooleanField(term6036, term6036.getClass(), "formList", false);
        setBooleanField(term6036, term6036.getClass(), "formSubmit", false);
        setField(term6035, term6035.getClass(), "tag", term6036);
        setField(term6035, term6035.getClass(), "parentNode", null);
        setField(term6035, term6035.getClass(), "childNodes", term6058);
        setField(term6062, term6062.getClass(), "attributes", term6063);
        setField(term6035, term6035.getClass(), "attributes", term6062);
        setField(term6035, term6035.getClass(), "baseUri", "TjWpyghUWN");
        setIntField(term6035, term6035.getClass(), "siblingIndex", -1388471422);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "dkZFDZxcde";
        callMethod(klass, "text", argTypes, term6035, args);
    }

};


