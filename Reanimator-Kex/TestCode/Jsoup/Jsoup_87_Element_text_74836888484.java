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

public class Element_text_74836888484 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6590;

    public Element_text_74836888484() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6616 = new ArrayList();
        ((ArrayList) term6616).add((Object)null);
        ((ArrayList) term6616).add((Object)null);
        ((ArrayList) term6616).add((Object)null);
        term6590 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term6591 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term6612 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term6613 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term6614 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term6620 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term6622 = (Object[]) newArray("java.lang.String", 0);
        Object[] term6623 = (Object[]) newArray("java.lang.String", 0);
        setField(term6591, term6591.getClass(), "tagName", "QduALnDSVo");
        setBooleanField(term6591, term6591.getClass(), "isBlock", false);
        setBooleanField(term6591, term6591.getClass(), "formatAsBlock", false);
        setBooleanField(term6591, term6591.getClass(), "canContainInline", false);
        setBooleanField(term6591, term6591.getClass(), "empty", false);
        setBooleanField(term6591, term6591.getClass(), "selfClosing", false);
        setBooleanField(term6591, term6591.getClass(), "preserveWhitespace", false);
        setBooleanField(term6591, term6591.getClass(), "formList", true);
        setBooleanField(term6591, term6591.getClass(), "formSubmit", true);
        setField(term6590, term6590.getClass(), "tag", term6591);
        setField(term6612, term6612.getClass(), "referent", null);
        setField(term6613, term6613.getClass(), "lock", term6614);
        setField(term6613, term6613.getClass(), "head", null);
        setLongField(term6613, term6613.getClass(), "queueLength", 50358265865610362L);
        setField(term6612, term6612.getClass(), "queue", term6613);
        setField(term6612, term6612.getClass(), "next", null);
        setField(term6612, term6612.getClass(), "discovered", null);
        setField(term6590, term6590.getClass(), "shadowChildrenRef", term6612);
        setField(term6590, term6590.getClass(), "childNodes", term6616);
        setIntField(term6620, term6620.getClass(), "size", 1745276158);
        setField(term6620, term6620.getClass(), "keys", term6622);
        setField(term6620, term6620.getClass(), "vals", term6623);
        setField(term6590, term6590.getClass(), "attributes", term6620);
        setField(term6590, term6590.getClass(), "baseUri", "izPpKDErnQ");
        setField(term6590, term6590.getClass(), "parentNode", null);
        setIntField(term6590, term6590.getClass(), "siblingIndex", 2009020256);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "text", argTypes, term6590, args);
    }

};


