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

public class Element_classNames_77861729280 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6533;

    public Element_classNames_77861729280() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6555 = new ArrayList();
        ((ArrayList) term6555).add((Object)null);
        ((ArrayList) term6555).add((Object)null);
        ((ArrayList) term6555).add((Object)null);
        ((ArrayList) term6555).add((Object)null);
        ((ArrayList) term6555).add((Object)null);
        ((ArrayList) term6555).add((Object)null);
        ((ArrayList) term6555).add((Object)null);
        ((ArrayList) term6555).add((Object)null);
        LinkedHashMap term6560 = new LinkedHashMap();
        term6533 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term6534 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term6559 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term6534, term6534.getClass(), "tagName", "EusenEbIoF");
        setBooleanField(term6534, term6534.getClass(), "isBlock", false);
        setBooleanField(term6534, term6534.getClass(), "formatAsBlock", false);
        setBooleanField(term6534, term6534.getClass(), "canContainInline", false);
        setBooleanField(term6534, term6534.getClass(), "empty", false);
        setBooleanField(term6534, term6534.getClass(), "selfClosing", false);
        setBooleanField(term6534, term6534.getClass(), "preserveWhitespace", true);
        setBooleanField(term6534, term6534.getClass(), "formList", true);
        setBooleanField(term6534, term6534.getClass(), "formSubmit", true);
        setField(term6533, term6533.getClass(), "tag", term6534);
        setField(term6533, term6533.getClass(), "parentNode", null);
        setField(term6533, term6533.getClass(), "childNodes", term6555);
        setField(term6559, term6559.getClass(), "attributes", term6560);
        setField(term6533, term6533.getClass(), "attributes", term6559);
        setField(term6533, term6533.getClass(), "baseUri", "tJzmOfcUnY");
        setIntField(term6533, term6533.getClass(), "siblingIndex", -1274456137);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "classNames", argTypes, term6533, args);
    }

};


