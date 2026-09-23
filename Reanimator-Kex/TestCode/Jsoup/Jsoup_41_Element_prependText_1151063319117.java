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

public class Element_prependText_1151063319117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1736;

    public Element_prependText_1151063319117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1759 = new ArrayList();
        ((ArrayList) term1759).add((Object)null);
        ((ArrayList) term1759).add((Object)null);
        ((ArrayList) term1759).add((Object)null);
        ((ArrayList) term1759).add((Object)null);
        ((ArrayList) term1759).add((Object)null);
        ((ArrayList) term1759).add((Object)null);
        ((ArrayList) term1759).add((Object)null);
        ((ArrayList) term1759).add((Object)null);
        ((ArrayList) term1759).add((Object)null);
        LinkedHashMap term1764 = new LinkedHashMap();
        term1736 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1737 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1763 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1737, term1737.getClass(), "tagName", "AdxvLJhNLe");
        setBooleanField(term1737, term1737.getClass(), "isBlock", true);
        setBooleanField(term1737, term1737.getClass(), "formatAsBlock", true);
        setBooleanField(term1737, term1737.getClass(), "canContainBlock", false);
        setBooleanField(term1737, term1737.getClass(), "canContainInline", false);
        setBooleanField(term1737, term1737.getClass(), "empty", false);
        setBooleanField(term1737, term1737.getClass(), "selfClosing", false);
        setBooleanField(term1737, term1737.getClass(), "preserveWhitespace", true);
        setBooleanField(term1737, term1737.getClass(), "formList", true);
        setBooleanField(term1737, term1737.getClass(), "formSubmit", true);
        setField(term1736, term1736.getClass(), "tag", term1737);
        setField(term1736, term1736.getClass(), "parentNode", null);
        setField(term1736, term1736.getClass(), "childNodes", term1759);
        setField(term1763, term1763.getClass(), "attributes", term1764);
        setField(term1736, term1736.getClass(), "attributes", term1763);
        setField(term1736, term1736.getClass(), "baseUri", "xIeFjkHkOe");
        setIntField(term1736, term1736.getClass(), "siblingIndex", -1007160944);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SdCKLMIYnX";
        try {
            callMethod(klass, "prependText", argTypes, term1736, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


