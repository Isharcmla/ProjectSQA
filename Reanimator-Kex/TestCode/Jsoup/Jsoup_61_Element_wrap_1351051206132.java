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
import java.lang.NoClassDefFoundError;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_wrap_1351051206132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2673;

    public Element_wrap_1351051206132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2695 = new ArrayList();
        ((ArrayList) term2695).add((Object)null);
        ((ArrayList) term2695).add((Object)null);
        ((ArrayList) term2695).add((Object)null);
        ((ArrayList) term2695).add((Object)null);
        ((ArrayList) term2695).add((Object)null);
        LinkedHashMap term2700 = new LinkedHashMap();
        term2673 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2674 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2699 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2674, term2674.getClass(), "tagName", "iljANwuEjk");
        setBooleanField(term2674, term2674.getClass(), "isBlock", true);
        setBooleanField(term2674, term2674.getClass(), "formatAsBlock", false);
        setBooleanField(term2674, term2674.getClass(), "canContainInline", true);
        setBooleanField(term2674, term2674.getClass(), "empty", true);
        setBooleanField(term2674, term2674.getClass(), "selfClosing", true);
        setBooleanField(term2674, term2674.getClass(), "preserveWhitespace", true);
        setBooleanField(term2674, term2674.getClass(), "formList", true);
        setBooleanField(term2674, term2674.getClass(), "formSubmit", true);
        setField(term2673, term2673.getClass(), "tag", term2674);
        setField(term2673, term2673.getClass(), "parentNode", null);
        setField(term2673, term2673.getClass(), "childNodes", term2695);
        setField(term2699, term2699.getClass(), "attributes", term2700);
        setField(term2673, term2673.getClass(), "attributes", term2699);
        setField(term2673, term2673.getClass(), "baseUri", "sZdUNdggUW");
        setIntField(term2673, term2673.getClass(), "siblingIndex", -1087774327);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "OqbwYQfvAe";
        try {
            callMethod(klass, "wrap", argTypes, term2673, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


