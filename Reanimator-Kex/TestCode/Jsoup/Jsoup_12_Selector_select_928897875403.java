package org.jsoup.select;

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
import static org.jsoup.select.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.select.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;

public class Selector_select_928897875403 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term361974;
     Object term363414;
     Object term363419;
     Object term363409;

    public Selector_select_928897875403() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term362110 = new ArrayList();
        term361974 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term362020 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term362020, term362020.getClass(), "tagName", "BZ3zLC34CZ");
        setField(term361974, term361974.getClass(), "tag", term362020);
        setField(term361974, term361974.getClass(), "childNodes", term362110);
        ArrayList term363415 = new ArrayList();
        term363414 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term363414, term363414.getClass(), "contents", term363415);
        ArrayList term363423 = new ArrayList();
        term363419 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term363420 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term363420, term363420.getClass(), "tagName", "BZ3zLC34CZ");
        setBooleanField(term363420, term363420.getClass(), "knownTag", false);
        setBooleanField(term363420, term363420.getClass(), "isBlock", false);
        setBooleanField(term363420, term363420.getClass(), "formatAsBlock", false);
        setBooleanField(term363420, term363420.getClass(), "canContainBlock", false);
        setBooleanField(term363420, term363420.getClass(), "canContainInline", false);
        setBooleanField(term363420, term363420.getClass(), "optionalClosing", false);
        setBooleanField(term363420, term363420.getClass(), "empty", false);
        setBooleanField(term363420, term363420.getClass(), "selfClosing", false);
        setBooleanField(term363420, term363420.getClass(), "preserveWhitespace", false);
        setField(term363420, term363420.getClass(), "ancestors", null);
        setField(term363420, term363420.getClass(), "excludes", null);
        setField(term363420, term363420.getClass(), "ignoreEndTags", null);
        setBooleanField(term363420, term363420.getClass(), "directDescendant", false);
        setBooleanField(term363420, term363420.getClass(), "limitChildren", false);
        setField(term363419, term363419.getClass(), "tag", term363420);
        setField(term363419, term363419.getClass(), "classNames", null);
        setField(term363419, term363419.getClass(), "parentNode", null);
        setField(term363419, term363419.getClass(), "childNodes", term363423);
        setField(term363419, term363419.getClass(), "attributes", null);
        setField(term363419, term363419.getClass(), "baseUri", null);
        setIntField(term363419, term363419.getClass(), "siblingIndex", 0);
        ArrayList term363410 = new ArrayList();
        term363409 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term363409, term363409.getClass(), "contents", term363410);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.Selector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[2];
        args[0] = "BZ3zLC34CZ";
        args[1] = term361974;
        Object retValue = callMethod(klass, "select", argTypes, null, args);
        assertTrue(recursiveEquals(term361974, term363419));
        assertTrue(recursiveEquals(retValue, term363409));
    }

};


