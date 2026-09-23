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

public class Element_ownText_35132743871 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5844;

    public Element_ownText_35132743871() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5866 = new ArrayList();
        ((ArrayList) term5866).add((Object)null);
        ((ArrayList) term5866).add((Object)null);
        ((ArrayList) term5866).add((Object)null);
        ((ArrayList) term5866).add((Object)null);
        ((ArrayList) term5866).add((Object)null);
        ((ArrayList) term5866).add((Object)null);
        ((ArrayList) term5866).add((Object)null);
        ((ArrayList) term5866).add((Object)null);
        LinkedHashMap term5871 = new LinkedHashMap();
        term5844 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term5845 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term5870 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term5845, term5845.getClass(), "tagName", "KSJeYkkvpk");
        setBooleanField(term5845, term5845.getClass(), "isBlock", true);
        setBooleanField(term5845, term5845.getClass(), "formatAsBlock", false);
        setBooleanField(term5845, term5845.getClass(), "canContainInline", true);
        setBooleanField(term5845, term5845.getClass(), "empty", true);
        setBooleanField(term5845, term5845.getClass(), "selfClosing", true);
        setBooleanField(term5845, term5845.getClass(), "preserveWhitespace", false);
        setBooleanField(term5845, term5845.getClass(), "formList", false);
        setBooleanField(term5845, term5845.getClass(), "formSubmit", false);
        setField(term5844, term5844.getClass(), "tag", term5845);
        setField(term5844, term5844.getClass(), "parentNode", null);
        setField(term5844, term5844.getClass(), "childNodes", term5866);
        setField(term5870, term5870.getClass(), "attributes", term5871);
        setField(term5844, term5844.getClass(), "attributes", term5870);
        setField(term5844, term5844.getClass(), "baseUri", "KarbTXFmUU");
        setIntField(term5844, term5844.getClass(), "siblingIndex", 1283079251);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "ownText", argTypes, term5844, args);
    }

};


