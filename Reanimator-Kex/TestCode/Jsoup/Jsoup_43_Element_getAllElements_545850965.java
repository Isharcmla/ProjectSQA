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

public class Element_getAllElements_545850965 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5505;

    public Element_getAllElements_545850965() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5528 = new ArrayList();
        ((ArrayList) term5528).add((Object)null);
        ((ArrayList) term5528).add((Object)null);
        ((ArrayList) term5528).add((Object)null);
        ((ArrayList) term5528).add((Object)null);
        ((ArrayList) term5528).add((Object)null);
        LinkedHashMap term5533 = new LinkedHashMap();
        term5505 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term5506 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term5532 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term5506, term5506.getClass(), "tagName", "PvmBHIXaMY");
        setBooleanField(term5506, term5506.getClass(), "isBlock", true);
        setBooleanField(term5506, term5506.getClass(), "formatAsBlock", false);
        setBooleanField(term5506, term5506.getClass(), "canContainBlock", true);
        setBooleanField(term5506, term5506.getClass(), "canContainInline", false);
        setBooleanField(term5506, term5506.getClass(), "empty", true);
        setBooleanField(term5506, term5506.getClass(), "selfClosing", true);
        setBooleanField(term5506, term5506.getClass(), "preserveWhitespace", false);
        setBooleanField(term5506, term5506.getClass(), "formList", true);
        setBooleanField(term5506, term5506.getClass(), "formSubmit", false);
        setField(term5505, term5505.getClass(), "tag", term5506);
        setField(term5505, term5505.getClass(), "parentNode", null);
        setField(term5505, term5505.getClass(), "childNodes", term5528);
        setField(term5532, term5532.getClass(), "attributes", term5533);
        setField(term5505, term5505.getClass(), "attributes", term5532);
        setField(term5505, term5505.getClass(), "baseUri", "AWYyZiNfsm");
        setIntField(term5505, term5505.getClass(), "siblingIndex", 344323424);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAllElements", argTypes, term5505, args);
    }

};


