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

public class Element_className_78448294275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6273;

    public Element_className_78448294275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6296 = new ArrayList();
        ((ArrayList) term6296).add((Object)null);
        ((ArrayList) term6296).add((Object)null);
        ((ArrayList) term6296).add((Object)null);
        ((ArrayList) term6296).add((Object)null);
        ((ArrayList) term6296).add((Object)null);
        LinkedHashMap term6301 = new LinkedHashMap();
        term6273 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term6274 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term6300 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term6274, term6274.getClass(), "tagName", "orEuhCStGM");
        setBooleanField(term6274, term6274.getClass(), "isBlock", false);
        setBooleanField(term6274, term6274.getClass(), "formatAsBlock", true);
        setBooleanField(term6274, term6274.getClass(), "canContainBlock", false);
        setBooleanField(term6274, term6274.getClass(), "canContainInline", false);
        setBooleanField(term6274, term6274.getClass(), "empty", false);
        setBooleanField(term6274, term6274.getClass(), "selfClosing", true);
        setBooleanField(term6274, term6274.getClass(), "preserveWhitespace", false);
        setBooleanField(term6274, term6274.getClass(), "formList", true);
        setBooleanField(term6274, term6274.getClass(), "formSubmit", true);
        setField(term6273, term6273.getClass(), "tag", term6274);
        setField(term6273, term6273.getClass(), "parentNode", null);
        setField(term6273, term6273.getClass(), "childNodes", term6296);
        setField(term6300, term6300.getClass(), "attributes", term6301);
        setField(term6273, term6273.getClass(), "attributes", term6300);
        setField(term6273, term6273.getClass(), "baseUri", "UkKvaeJfEC");
        setIntField(term6273, term6273.getClass(), "siblingIndex", 1598895173);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "className", argTypes, term6273, args);
    }

};


