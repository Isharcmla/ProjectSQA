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
import java.lang.NoClassDefFoundError;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Parser_parseFragment_60304098527 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term178;

    public Parser_parseFragment_60304098527() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term201 = new ArrayList();
        ((ArrayList) term201).add((Object)null);
        ((ArrayList) term201).add((Object)null);
        ((ArrayList) term201).add((Object)null);
        ((ArrayList) term201).add((Object)null);
        ((ArrayList) term201).add((Object)null);
        ((ArrayList) term201).add((Object)null);
        ((ArrayList) term201).add((Object)null);
        LinkedHashMap term206 = new LinkedHashMap();
        term178 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term179 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term205 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term179, term179.getClass(), "tagName", "EGtDIRbSSb");
        setBooleanField(term179, term179.getClass(), "isBlock", false);
        setBooleanField(term179, term179.getClass(), "formatAsBlock", false);
        setBooleanField(term179, term179.getClass(), "canContainBlock", true);
        setBooleanField(term179, term179.getClass(), "canContainInline", true);
        setBooleanField(term179, term179.getClass(), "empty", true);
        setBooleanField(term179, term179.getClass(), "selfClosing", true);
        setBooleanField(term179, term179.getClass(), "preserveWhitespace", true);
        setBooleanField(term179, term179.getClass(), "formList", false);
        setBooleanField(term179, term179.getClass(), "formSubmit", false);
        setField(term178, term178.getClass(), "tag", term179);
        setField(term178, term178.getClass(), "parentNode", null);
        setField(term178, term178.getClass(), "childNodes", term201);
        setField(term205, term205.getClass(), "attributes", term206);
        setField(term178, term178.getClass(), "attributes", term205);
        setField(term178, term178.getClass(), "baseUri", "RMFIsYGgne");
        setIntField(term178, term178.getClass(), "siblingIndex", -1456670397);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.jsoup.nodes.Element");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = "jJCZpVmanW";
        args[1] = term178;
        args[2] = "NRdvgJlhkX";
        try {
            callMethod(klass, "parseFragment", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


