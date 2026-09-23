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
import java.lang.NullPointerException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_is_687264465117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1499;

    public Element_is_687264465117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1521 = new ArrayList();
        ((ArrayList) term1521).add((Object)null);
        ((ArrayList) term1521).add((Object)null);
        ((ArrayList) term1521).add((Object)null);
        ((ArrayList) term1521).add((Object)null);
        ((ArrayList) term1521).add((Object)null);
        ((ArrayList) term1521).add((Object)null);
        ((ArrayList) term1521).add((Object)null);
        ((ArrayList) term1521).add((Object)null);
        LinkedHashMap term1526 = new LinkedHashMap();
        term1499 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1500 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1525 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1500, term1500.getClass(), "tagName", "QXzGXbEXMu");
        setBooleanField(term1500, term1500.getClass(), "isBlock", true);
        setBooleanField(term1500, term1500.getClass(), "formatAsBlock", false);
        setBooleanField(term1500, term1500.getClass(), "canContainInline", false);
        setBooleanField(term1500, term1500.getClass(), "empty", true);
        setBooleanField(term1500, term1500.getClass(), "selfClosing", true);
        setBooleanField(term1500, term1500.getClass(), "preserveWhitespace", false);
        setBooleanField(term1500, term1500.getClass(), "formList", true);
        setBooleanField(term1500, term1500.getClass(), "formSubmit", true);
        setField(term1499, term1499.getClass(), "tag", term1500);
        setField(term1499, term1499.getClass(), "parentNode", null);
        setField(term1499, term1499.getClass(), "childNodes", term1521);
        setField(term1525, term1525.getClass(), "attributes", term1526);
        setField(term1499, term1499.getClass(), "attributes", term1525);
        setField(term1499, term1499.getClass(), "baseUri", "ZVecLZMLHF");
        setIntField(term1499, term1499.getClass(), "siblingIndex", 1048535127);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.select.Evaluator");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "is", argTypes, term1499, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


